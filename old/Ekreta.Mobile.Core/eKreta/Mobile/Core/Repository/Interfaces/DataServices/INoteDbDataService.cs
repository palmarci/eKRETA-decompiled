// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.INoteDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface INoteDbDataService
  {
    void AddOrUpdate(NoteRealm note, Action<NoteRealm> action);

    Task AddOrUpdateAsync(NoteRealm note, Action<NoteRealm> action);

    void AddOrUpdate(IEnumerable<NoteRealm> notes, Action<NoteRealm> action);

    Task AddOrUpdateAsync(IEnumerable<NoteRealm> notes, Action<NoteRealm> action);

    NoteRealm Get(string profileRolelessId, int itemId);

    IEnumerable<NoteRealm> GetNotes(string profileRolelessId);

    IEnumerable<NoteRealm> GetLatestNotes(string profileRolelessId);

    int GetNewItemCount();

    int GetNewItemCount(string profileRolelessId);

    int DiffWithStored(string profileRolelessId, IEnumerable<NoteRealm> notes);

    void Delete(string profileRolelessId);

    void ExpireNewsItems();
  }
}
