// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.AbsenceDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class AbsenceDataService : IAbsenceDataService
  {
    private readonly IAbsenceRepository _absenceRepository;
    private readonly ISettingsDataService _settingsDataService;

    public AbsenceDataService()
    {
      this._absenceRepository = (IAbsenceRepository) Mvx.get_IoCProvider().Resolve<IAbsenceRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
    }

    public void AddOrUpdate(Profile profile, Ekreta.Mobile.Core.Models.Absence absence)
    {
      absence.ProfileId = profile.RolelessId;
      this._absenceRepository.AddOrUpdate(absence);
    }

    public void AddOrUpdate(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Absence> absences)
    {
      if (absences == null || !absences.Any<Ekreta.Mobile.Core.Models.Absence>())
        return;
      string profileId = profile.RolelessId;
      absences = absences.Select<Ekreta.Mobile.Core.Models.Absence, Ekreta.Mobile.Core.Models.Absence>((Func<Ekreta.Mobile.Core.Models.Absence, Ekreta.Mobile.Core.Models.Absence>) (x =>
      {
        x.ProfileId = profileId;
        return x;
      }));
      this._absenceRepository.AddOrUpdate(absences);
    }

    public Ekreta.Mobile.Core.Models.Absence Get(int itemId)
    {
      return this._absenceRepository.Find(itemId.ToString());
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Absence> GetAbsences(
      Profile profile)
    {
      return this._absenceRepository.Query((ISpecification) new AbsenceByProfileSpecification(profile.RolelessId));
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Absence> GetLatestAbsences(
      Profile profile)
    {
      return this._absenceRepository.Query((ISpecification) new LatestAbsenceRealmSpecification(profile.RolelessId, this._settingsDataService.GetDashboardDayRange()));
    }

    public int GetNewItemCount()
    {
      return this._absenceRepository.Count((ISpecification) new NewAbsencesRealmSpecification());
    }

    public int GetNewItemCount(Profile profile)
    {
      return this._absenceRepository.Count((ISpecification) new NewAbsencesByProfileRealmSpecification(profile.RolelessId));
    }

    public int DiffWithStored(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Absence> absences)
    {
      return this.GetAbsences(profile).Except<Ekreta.Mobile.Core.Models.Absence>(absences).Count<Ekreta.Mobile.Core.Models.Absence>();
    }

    public void Delete(Profile profile)
    {
      this._absenceRepository.Remove((ISpecification) new AbsenceByProfileSpecification(profile.RolelessId));
    }

    public void ExpireNewsItems()
    {
      this._absenceRepository.AddOrUpdate(this._absenceRepository.Query((ISpecification) new ExpiredAbsencesRealmSpecification(this._settingsDataService.NewsItemExpirationDay)).Select<Ekreta.Mobile.Core.Models.Absence, Ekreta.Mobile.Core.Models.Absence>((Func<Ekreta.Mobile.Core.Models.Absence, Ekreta.Mobile.Core.Models.Absence>) (x =>
      {
        x.SeenByUser = true;
        return x;
      })));
    }
  }
}
