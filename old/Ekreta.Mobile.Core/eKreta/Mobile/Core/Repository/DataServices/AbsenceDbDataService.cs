// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.AbsenceDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class AbsenceDbDataService : IAbsenceDbDataService
  {
    private readonly IAbsenceDbRepository _absenceDbRepository;
    private readonly ISettingsDataService _settingsDataService;

    public AbsenceDbDataService()
    {
      this._absenceDbRepository = (IAbsenceDbRepository) Mvx.get_IoCProvider().Resolve<IAbsenceDbRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
    }

    public void AddOrUpdate(AbsenceRealm absence, Action<AbsenceRealm> action)
    {
      this._absenceDbRepository.AddOrUpdate(absence, action);
    }

    public async Task AddOrUpdateAsync(AbsenceRealm absence, Action<AbsenceRealm> action)
    {
      await this._absenceDbRepository.AddOrUpdateAsync(absence, action);
    }

    public void AddOrUpdate(IEnumerable<AbsenceRealm> absences, Action<AbsenceRealm> action)
    {
      if (absences == null || !absences.Any<AbsenceRealm>())
        return;
      this._absenceDbRepository.AddOrUpdate(absences, action);
    }

    public async Task AddOrUpdateAsync(
      IEnumerable<AbsenceRealm> absences,
      Action<AbsenceRealm> action)
    {
      if (absences == null || !absences.Any<AbsenceRealm>())
        return;
      await this._absenceDbRepository.AddOrUpdateAsync(absences, action);
    }

    public AbsenceRealm Get(int itemId)
    {
      return this._absenceDbRepository.Find(itemId.ToString());
    }

    public IEnumerable<AbsenceRealm> GetAbsences(string profileRolelessId)
    {
      return (IEnumerable<AbsenceRealm>) this._absenceDbRepository.Query().Where<AbsenceRealm>((Expression<Func<AbsenceRealm, bool>>) (x => x.ProfileId == profileRolelessId)).ToList<AbsenceRealm>();
    }

    public IEnumerable<AbsenceRealm> GetLatestAbsences(
      string profileRolelessId)
    {
      return (IEnumerable<AbsenceRealm>) this._absenceDbRepository.Query().ToList<AbsenceRealm>().Where<AbsenceRealm>((Func<AbsenceRealm, bool>) (x =>
      {
        DateTimeOffset dateTimeOffset = new DateTimeOffset(DateTime.Today.AddDays((double) -this._settingsDataService.GetDashboardDayRange()));
        return x.CreatingTime >= dateTimeOffset && x.ProfileId == profileRolelessId;
      })).OrderByDescending<AbsenceRealm, DateTimeOffset>((Func<AbsenceRealm, DateTimeOffset>) (x => x.CreatingTime));
    }

    public int GetNewItemCount()
    {
      return this._absenceDbRepository.Query().Where<AbsenceRealm>((Expression<Func<AbsenceRealm, bool>>) (x => !x.SeenByUser)).Count<AbsenceRealm>();
    }

    public int GetNewItemCount(string profileRolelessId)
    {
      return this._absenceDbRepository.Query().Where<AbsenceRealm>((Expression<Func<AbsenceRealm, bool>>) (x => x.ProfileId == profileRolelessId && !x.SeenByUser)).Count<AbsenceRealm>();
    }

    public int DiffWithStored(string profileRolelessId, IEnumerable<AbsenceRealm> absences)
    {
      return this.GetAbsences(profileRolelessId).Except<AbsenceRealm>(absences).Count<AbsenceRealm>();
    }

    public void Delete(string profileRolelessId)
    {
      this._absenceDbRepository.Remove((IEnumerable<AbsenceRealm>) this._absenceDbRepository.Query().Where<AbsenceRealm>((Expression<Func<AbsenceRealm, bool>>) (x => x.ProfileId == profileRolelessId)));
    }

    public void ExpireNewsItems()
    {
      this._absenceDbRepository.AddOrUpdate(this._absenceDbRepository.Query().ToList<AbsenceRealm>().Where<AbsenceRealm>((Func<AbsenceRealm, bool>) (x =>
      {
        DateTimeOffset dateTimeOffset = DateTimeOffset.Now.AddDays((double) -this._settingsDataService.NewsItemExpirationDay);
        return x.CreatedDate < dateTimeOffset;
      })), (Action<AbsenceRealm>) (absence => absence.SeenByUser = true));
    }
  }
}
