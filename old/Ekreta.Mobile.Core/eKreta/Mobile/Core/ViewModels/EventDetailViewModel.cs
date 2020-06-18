// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.EventDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class EventDetailViewModel : ViewModelBase<Event>
  {
    private readonly IMvxMessenger _messenger;
    private readonly IEventDataService _eventDataService;
    private Event _event;

    public EventDetailViewModel()
    {
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._eventDataService = (IEventDataService) Mvx.get_IoCProvider().Resolve<IEventDataService>();
    }

    public Event Event
    {
      get
      {
        return this._event;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<Event>((M0&) ref this._event, (M0) value, nameof (Event));
      }
    }

    public virtual void Prepare(Event parameter)
    {
      this.Event = parameter;
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.EventNewItem();
    }

    private void EventNewItem()
    {
      if (this.Event.SeenByUser)
        return;
      this.Event.SeenByUser = true;
      this._eventDataService.AddOrUpdate(this.ActiveProfile, this.Event);
      this._messenger.Publish<NewsItemsRemovedMessage>((M0) new NewsItemsRemovedMessage((object) this, 1));
    }
  }
}
