// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.NoteDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class NoteDataService : INoteDataService
  {
    private readonly INoteRepository _noteRepository;
    private readonly ISettingsDataService _settingsDataService;

    public NoteDataService()
    {
      this._noteRepository = (INoteRepository) Mvx.get_IoCProvider().Resolve<INoteRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
    }

    public void AddOrUpdate(Profile profile, Ekreta.Mobile.Core.Models.Note note)
    {
      note.ProfileId = profile.RolelessId;
      this._noteRepository.AddOrUpdate(note);
    }

    public void AddOrUpdate(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Note> notes)
    {
      if (notes == null || !notes.Any<Ekreta.Mobile.Core.Models.Note>())
        return;
      string profileId = profile.RolelessId;
      notes = notes.Select<Ekreta.Mobile.Core.Models.Note, Ekreta.Mobile.Core.Models.Note>((Func<Ekreta.Mobile.Core.Models.Note, Ekreta.Mobile.Core.Models.Note>) (x =>
      {
        x.ProfileId = profileId;
        return x;
      }));
      this._noteRepository.AddOrUpdate(notes);
    }

    public Ekreta.Mobile.Core.Models.Note Get(Profile profile, int itemId)
    {
      return this._noteRepository.Find(string.Format("{0}-{1}", (object) itemId, (object) profile.RolelessId));
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Note> GetNotes(Profile profile)
    {
      return this._noteRepository.Query((ISpecification) new NoteByProfileSpecification(profile.RolelessId));
    }

    public int GetNewItemCount()
    {
      return this._noteRepository.Count((ISpecification) new NewNotesSpecification());
    }

    public int GetNewItemCount(Profile profile)
    {
      return this._noteRepository.Count((ISpecification) new NewNotesByProfileSpecification(profile.RolelessId));
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Note> GetLatestNotes(Profile profile)
    {
      return this._noteRepository.Query((ISpecification) new LatestNoteRealmSpecification(profile.RolelessId, this._settingsDataService.GetDashboardDayRange()));
    }

    public int GetNewsByProfile(Profile profile)
    {
      return this._noteRepository.Count((ISpecification) new NewNotesByProfileSpecification(profile.RolelessId));
    }

    public int DiffWithStored(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Note> notes)
    {
      return this.GetNotes(profile).Except<Ekreta.Mobile.Core.Models.Note>(notes).Count<Ekreta.Mobile.Core.Models.Note>();
    }

    public void Delete(Profile profile)
    {
      this._noteRepository.Remove((ISpecification) new NoteByProfileSpecification(profile.RolelessId));
    }

    public void ExpireNewsItems()
    {
      this._noteRepository.AddOrUpdate(this._noteRepository.Query((ISpecification) new ExpiredNotesRealmSpecification(this._settingsDataService.NewsItemExpirationDay)).Select<Ekreta.Mobile.Core.Models.Note, Ekreta.Mobile.Core.Models.Note>((Func<Ekreta.Mobile.Core.Models.Note, Ekreta.Mobile.Core.Models.Note>) (x =>
      {
        x.SeenByUser = true;
        return x;
      })));
    }
  }
}
