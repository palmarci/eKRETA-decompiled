// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.EventDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Event;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class EventDataService : IEventDataService
  {
    private readonly IEventRepository _eventRepository;
    private readonly ISettingsDataService _settingsDataService;
    private readonly IMobileApi _mobileApi;

    public EventDataService()
    {
      this._eventRepository = (IEventRepository) Mvx.get_IoCProvider().Resolve<IEventRepository>();
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
    }

    public void AddOrUpdate(Profile profile, Ekreta.Mobile.Core.Models.Event @event)
    {
      @event.ProfileId = profile.Id;
      this._eventRepository.AddOrUpdate(@event);
    }

    public void AddOrUpdate(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Event> events)
    {
      if (events == null || !events.Any<Ekreta.Mobile.Core.Models.Event>())
        return;
      events = events.Select<Ekreta.Mobile.Core.Models.Event, Ekreta.Mobile.Core.Models.Event>((Func<Ekreta.Mobile.Core.Models.Event, Ekreta.Mobile.Core.Models.Event>) (x =>
      {
        x.ProfileId = profile.Id;
        return x;
      }));
      this._eventRepository.AddOrUpdate(events);
    }

    public async Task<IEnumerable<Ekreta.Mobile.Core.Models.Event>> FetchEventsAsync(
      Profile profile)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      return await this._mobileApi.GetEventsAsync(profile, new DateTime?(), new DateTime?(), false);
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Event> GetEvents(Profile profile)
    {
      return this._eventRepository.Query((ISpecification) new EventByProfileSpecification(profile.Id));
    }

    public int GetNewItemCount()
    {
      return this._eventRepository.Count((ISpecification) new NewEventSpecification());
    }

    public int GetNewItemCount(Profile profile)
    {
      return this._eventRepository.Count((ISpecification) new NewEventByProfileSpecification(profile.Id));
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Event> GetLatestEvents(
      Profile profile)
    {
      return this._eventRepository.Query((ISpecification) new LatestEventRealmSpecification(profile.Id, this._settingsDataService.GetDashboardDayRange()));
    }

    public void Delete(Profile profile)
    {
      this._eventRepository.Remove((ISpecification) new EventByProfileSpecification(profile.Id));
    }

    public Ekreta.Mobile.Core.Models.Event Get(string itemId)
    {
      return this._eventRepository.Find(itemId);
    }

    public void ExpireNewsItems()
    {
      this._eventRepository.AddOrUpdate(this._eventRepository.Query((ISpecification) new ExpiredEventsRealmSpecification(this._settingsDataService.NewsItemExpirationDay)).Select<Ekreta.Mobile.Core.Models.Event, Ekreta.Mobile.Core.Models.Event>((Func<Ekreta.Mobile.Core.Models.Event, Ekreta.Mobile.Core.Models.Event>) (x =>
      {
        x.SeenByUser = true;
        return x;
      })));
    }

    public int DiffWithStored(Profile profile, IEnumerable<Ekreta.Mobile.Core.Models.Event> events)
    {
      return this.GetEvents(profile).Except<Ekreta.Mobile.Core.Models.Event>(events).Count<Ekreta.Mobile.Core.Models.Event>();
    }
  }
}
