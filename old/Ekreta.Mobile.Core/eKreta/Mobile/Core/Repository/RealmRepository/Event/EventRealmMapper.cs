// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Event.EventRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Event
{
  public class EventRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Event, EventRealm>, IMapper<Ekreta.Mobile.Core.Models.Event, EventRealm>
  {
    public Ekreta.Mobile.Core.Models.Event From(EventRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Event()
      {
        Id = item.Id,
        EventId = int.Parse(item.EventId),
        Content = item.Content,
        Date = item.Date.LocalDateTime,
        Title = item.Title,
        ProfileId = item.ProfileId,
        SeenByUser = item.SeenByUser
      };
    }

    public EventRealm To(Ekreta.Mobile.Core.Models.Event item)
    {
      return new EventRealm()
      {
        Id = item.Id,
        EventId = item.EventId.ToString(),
        Content = item.Content,
        Date = new DateTimeOffset(item.Date),
        Title = item.Title,
        ProfileId = item.ProfileId,
        SeenByUser = item.SeenByUser
      };
    }
  }
}
