// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.RatingDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Rating;
using MvvmCross;
using System;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class RatingDataService : IRatingDataService
  {
    private readonly IRatingRepository _ratingRepository;

    public int IdleDays
    {
      get
      {
        return 14;
      }
    }

    public int CancelIdleDays
    {
      get
      {
        return 2;
      }
    }

    public RatingDataService()
    {
      this._ratingRepository = (IRatingRepository) Mvx.get_IoCProvider().Resolve<IRatingRepository>();
    }

    public void AddOrUpdate(Profile profile, Ekreta.Mobile.Core.Models.Rating rating)
    {
      rating.ProfileId = profile.RolelessId;
      this._ratingRepository.AddOrUpdate(rating);
    }

    public Ekreta.Mobile.Core.Models.Rating IncreaseAttempts(Profile profile)
    {
      Ekreta.Mobile.Core.Models.Rating rating = this.GetRatingByProfile(profile) ?? new Ekreta.Mobile.Core.Models.Rating();
      rating.LastSeenDate = DateTime.Now;
      ++rating.SeenCount;
      this.AddOrUpdate(profile, rating);
      return rating;
    }

    public Ekreta.Mobile.Core.Models.Rating Init(Profile profile, bool firebaseConfigChanged)
    {
      Ekreta.Mobile.Core.Models.Rating rating = this.GetRatingByProfile(profile);
      if (rating == null)
      {
        rating = new Ekreta.Mobile.Core.Models.Rating()
        {
          LastSeenDate = DateTime.Now.AddDays((double) -this.CancelIdleDays)
        };
        this.AddOrUpdate(profile, rating);
      }
      else if (firebaseConfigChanged)
      {
        rating.LastSeenDate = DateTime.Now.AddDays((double) -this.CancelIdleDays);
        this.AddOrUpdate(profile, rating);
      }
      return rating;
    }

    public Ekreta.Mobile.Core.Models.Rating GetRatingByProfile(Profile profile)
    {
      return this._ratingRepository.Query((ISpecification) new RatingByProfileSpecification(profile.RolelessId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Rating>();
    }
  }
}
