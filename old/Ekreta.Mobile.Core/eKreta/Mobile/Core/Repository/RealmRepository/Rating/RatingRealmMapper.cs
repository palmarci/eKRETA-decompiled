// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Rating.RatingRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Rating
{
  internal class RatingRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Rating, RatingRealm>, IMapper<Ekreta.Mobile.Core.Models.Rating, RatingRealm>
  {
    public Ekreta.Mobile.Core.Models.Rating From(RatingRealm item)
    {
      Ekreta.Mobile.Core.Models.Rating rating = new Ekreta.Mobile.Core.Models.Rating();
      rating.RatingId = int.Parse(item.Id);
      rating.LastSeenDate = item.LastSeenDate.LocalDateTime;
      rating.SeenCount = item.SeenCount;
      DateTimeOffset? date = item.Date;
      ref DateTimeOffset? local = ref date;
      rating.Date = local.HasValue ? new DateTime?(local.GetValueOrDefault().LocalDateTime) : new DateTime?();
      rating.Liked = item.Liked;
      rating.Email = item.Email;
      rating.Description = item.Description;
      rating.SensitiveData = item.SensitiveData;
      rating.ProfileId = item.ProfileId;
      return rating;
    }

    public RatingRealm To(Ekreta.Mobile.Core.Models.Rating item)
    {
      return new RatingRealm()
      {
        Id = item.RatingId.ToString(),
        LastSeenDate = new DateTimeOffset(item.LastSeenDate),
        SeenCount = item.SeenCount,
        Date = item.Date.HasValue ? new DateTimeOffset?((DateTimeOffset) item.Date.Value) : new DateTimeOffset?(),
        Liked = item.Liked,
        Email = item.Email,
        Description = item.Description,
        SensitiveData = item.SensitiveData,
        ProfileId = item.ProfileId
      };
    }
  }
}
