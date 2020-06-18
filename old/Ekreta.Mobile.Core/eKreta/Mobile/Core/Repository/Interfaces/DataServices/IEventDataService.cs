// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IEventDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IEventDataService
  {
    void AddOrUpdate(Profile profile, IEnumerable<Event> events);

    void AddOrUpdate(Profile profile, Event @event);

    IEnumerable<Event> GetEvents(Profile profile);

    int GetNewItemCount();

    int GetNewItemCount(Profile profile);

    int DiffWithStored(Profile profile, IEnumerable<Event> events);

    Task<IEnumerable<Event>> FetchEventsAsync(Profile profile);

    IEnumerable<Event> GetLatestEvents(Profile profile);

    void Delete(Profile profile);

    Event Get(string id);

    void ExpireNewsItems();
  }
}
