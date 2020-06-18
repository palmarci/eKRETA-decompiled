// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.INoteDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface INoteDataService
  {
    void AddOrUpdate(Profile profile, Note note);

    void AddOrUpdate(Profile profile, IEnumerable<Note> notes);

    IEnumerable<Note> GetNotes(Profile profile);

    IEnumerable<Note> GetLatestNotes(Profile profile);

    int GetNewItemCount();

    int GetNewItemCount(Profile profile);

    int GetNewsByProfile(Profile profile);

    int DiffWithStored(Profile profile, IEnumerable<Note> notes);

    void Delete(Profile profile);

    Note Get(Profile profile, int itemId);

    void ExpireNewsItems();
  }
}
