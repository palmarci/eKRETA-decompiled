// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Note.NoteRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Note
{
  public class NoteRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Note, NoteRealm>, IMapper<Ekreta.Mobile.Core.Models.Note, NoteRealm>
  {
    public Ekreta.Mobile.Core.Models.Note From(NoteRealm item)
    {
      Ekreta.Mobile.Core.Models.Note note = new Ekreta.Mobile.Core.Models.Note();
      note.NoteId = int.Parse(item.Id);
      note.Content = item.Content;
      note.CreatingTime = item.CreatingTime.LocalDateTime;
      note.Date = item.Date.LocalDateTime;
      note.Teacher = item.Teacher;
      note.Title = item.Title;
      note.Type = item.Type;
      note.ProfileId = item.ProfileId;
      note.SeenByUser = item.SeenByUser;
      note.OsztalyCsoportUid = item.OsztalyCsoportUid;
      return note;
    }

    public NoteRealm To(Ekreta.Mobile.Core.Models.Note item)
    {
      return new NoteRealm()
      {
        PrimaryId = item.PrimaryId,
        Id = item.NoteId.ToString(),
        Content = item.Content,
        CreatingTime = new DateTimeOffset(item.CreatingTime),
        Date = new DateTimeOffset(item.Date),
        Teacher = item.Teacher,
        Title = item.Title,
        Type = item.Type,
        ProfileId = item.ProfileId,
        SeenByUser = item.SeenByUser,
        OsztalyCsoportUid = item.OsztalyCsoportUid
      };
    }
  }
}
