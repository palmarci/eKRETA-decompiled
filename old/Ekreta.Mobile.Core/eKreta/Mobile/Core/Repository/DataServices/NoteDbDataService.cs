// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.NoteDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class NoteDbDataService : INoteDbDataService
  {
    private readonly INoteDbRepository _noteRepository;
    private readonly ISettingsDataService _settingsDataService;

    public NoteDbDataService()
    {
      this._noteRepository = (INoteDbRepository) Mvx.get_IoCProvider().Resolve<INoteDbRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
    }

    public void AddOrUpdate(NoteRealm note, Action<NoteRealm> action)
    {
      this._noteRepository.AddOrUpdate(note, action);
    }

    public async Task AddOrUpdateAsync(NoteRealm note, Action<NoteRealm> action)
    {
      await this._noteRepository.AddOrUpdateAsync(note, action);
    }

    public void AddOrUpdate(IEnumerable<NoteRealm> notes, Action<NoteRealm> action)
    {
      if (notes == null || !notes.Any<NoteRealm>())
        return;
      this._noteRepository.AddOrUpdate(notes, action);
    }

    public async Task AddOrUpdateAsync(IEnumerable<NoteRealm> notes, Action<NoteRealm> action)
    {
      if (notes == null || !notes.Any<NoteRealm>())
        return;
      await this._noteRepository.AddOrUpdateAsync(notes, action);
    }

    public NoteRealm Get(string profileRolelessId, int itemId)
    {
      return this._noteRepository.Find(string.Format("{0}-{1}", (object) itemId, (object) profileRolelessId));
    }

    public IEnumerable<NoteRealm> GetNotes(string profileRolelessId)
    {
      return (IEnumerable<NoteRealm>) this._noteRepository.Query().Where<NoteRealm>((Expression<Func<NoteRealm, bool>>) (note => note.ProfileId == profileRolelessId));
    }

    public int GetNewItemCount()
    {
      return this._noteRepository.Query().Where<NoteRealm>((Expression<Func<NoteRealm, bool>>) (note => !note.SeenByUser)).Count<NoteRealm>();
    }

    public int GetNewItemCount(string profileRolelessId)
    {
      return this._noteRepository.Query().Where<NoteRealm>((Expression<Func<NoteRealm, bool>>) (note => note.ProfileId == profileRolelessId && !note.SeenByUser)).Count<NoteRealm>();
    }

    public IEnumerable<NoteRealm> GetLatestNotes(string profileRolelessId)
    {
      DateTimeOffset day = new DateTimeOffset(DateTime.Today.AddDays((double) -this._settingsDataService.GetDashboardDayRange()));
      return (IEnumerable<NoteRealm>) this._noteRepository.Query().Where<NoteRealm>((Expression<Func<NoteRealm, bool>>) (note => note.ProfileId == profileRolelessId && note.CreatingTime >= day)).OrderByDescending<NoteRealm, DateTimeOffset>((Expression<Func<NoteRealm, DateTimeOffset>>) (note => note.CreatingTime));
    }

    public int DiffWithStored(string profileRolelessId, IEnumerable<NoteRealm> notes)
    {
      return this.GetNotes(profileRolelessId).Except<NoteRealm>(notes).Count<NoteRealm>();
    }

    public void Delete(string profileRolelessId)
    {
      this._noteRepository.Remove(this.GetNotes(profileRolelessId));
    }

    public void ExpireNewsItems()
    {
      DateTimeOffset expirationTime = DateTimeOffset.Now.AddDays((double) -this._settingsDataService.NewsItemExpirationDay);
      this._noteRepository.AddOrUpdateAsync((IEnumerable<NoteRealm>) this._noteRepository.Query().Where<NoteRealm>((Expression<Func<NoteRealm, bool>>) (x => x.CreatedDate < expirationTime)), (Action<NoteRealm>) (item => item.SeenByUser = true));
    }
  }
}
