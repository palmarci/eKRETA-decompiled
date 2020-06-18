// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.EventsViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class EventsViewModel : ViewModelBase
  {
    private readonly IMvxMessenger _messenger;
    private readonly IEventDataService _eventDataService;
    private bool _isOffline;
    private bool _isError;
    private string _errorTitle;
    private string _errorSubtitle;
    private ObservableCollection<GroupedList<DateTime, Event>> _events;
    private Event _selectedItem;
    private MvxAsyncCommand<Event> _showDetailCommand;
    private MvxAsyncCommand _loadCommand;

    public EventsViewModel(IMvxMessenger messenger, IEventDataService eventDataService)
    {
      this._messenger = messenger;
      this._eventDataService = eventDataService;
    }

    public bool IsOffline
    {
      get
      {
        return this._isOffline;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isOffline, (M0) (value ? 1 : 0), nameof (IsOffline));
      }
    }

    public bool IsError
    {
      get
      {
        return this._isError;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isError, (M0) (value ? 1 : 0), nameof (IsError));
      }
    }

    public string ErrorTitle
    {
      get
      {
        return this._errorTitle;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._errorTitle, (M0) value, nameof (ErrorTitle));
      }
    }

    public string ErrorSubtitle
    {
      get
      {
        return this._errorSubtitle;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._errorSubtitle, (M0) value, nameof (ErrorSubtitle));
      }
    }

    public ObservableCollection<GroupedList<DateTime, Event>> Events
    {
      get
      {
        return this._events;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ObservableCollection<GroupedList<DateTime, Event>>>((M0&) ref this._events, (M0) value, nameof (Events));
      }
    }

    public Event SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<Event>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ShowDetailCommand.Execute(value);
      }
    }

    public MvxAsyncCommand<Event> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxAsyncCommand<Event>(new Func<Event, Task>(this.ExecuteShowDetailCommand), new Func<Event, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public MvxAsyncCommand LoadCommand
    {
      get
      {
        return this._loadCommand ?? (this._loadCommand = new MvxAsyncCommand(new Func<Task>(this.LoadEvents), (Func<bool>) null, false));
      }
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SelectedItem = (Event) null;
    }

    public override void Prepare()
    {
      base.Prepare();
      ((MvxAsyncCommandBase) this.LoadCommand).Execute();
    }

    private async Task LoadEvents()
    {
      EventsViewModel eventsViewModel = this;
      eventsViewModel.IsError = false;
      eventsViewModel.IsLoading = true;
      if (eventsViewModel.SelectedItem != null)
        eventsViewModel.IsLoading = false;
      eventsViewModel.IsOffline = false;
      try
      {
        // ISSUE: reference to a compiler-generated method
        await Task.Run(new Func<Task>(eventsViewModel.\u003CLoadEvents\u003Eb__35_0));
      }
      catch (Exception ex)
      {
        IEnumerable<Event> events = eventsViewModel._eventDataService.GetEvents(eventsViewModel.ActiveProfile);
        if (events == null)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (LoadEvents), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/EventsViewModel.cs", 161);
          eventsViewModel.ShowError();
        }
        else
        {
          eventsViewModel.ComposeEvents(events);
          eventsViewModel.IsOffline = true;
        }
      }
      finally
      {
        eventsViewModel.IsLoading = false;
      }
    }

    private void ComposeEvents(IEnumerable<Event> events)
    {
      if (events != null)
        this.IsLoading = false;
      this.Events = events == null || !events.Any<Event>() ? (ObservableCollection<GroupedList<DateTime, Event>>) null : new ObservableCollection<GroupedList<DateTime, Event>>(events.GroupBy<Event, DateTime>((Func<Event, DateTime>) (x => x.Date)).Select<IGrouping<DateTime, Event>, GroupedList<DateTime, Event>>((Func<IGrouping<DateTime, Event>, GroupedList<DateTime, Event>>) (x => new GroupedList<DateTime, Event>(x.Key, x.Key.ToString("d"), (IEnumerable<Event>) x.ToList<Event>(), "{0}"))).OrderByDescending<GroupedList<DateTime, Event>, DateTime>((Func<GroupedList<DateTime, Event>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, Event>>());
      this.SetEmptyState<ObservableCollection<GroupedList<DateTime, Event>>>(ref this._events, "Events");
    }

    private void ShowError()
    {
      if (this.HasInternetConnection)
      {
        this.ErrorTitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_Title");
        this.ErrorSubtitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_Subtitle");
      }
      else
      {
        this.ErrorTitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_NoInternet_Title");
        this.ErrorSubtitle = this._textProvider.GetText((string) null, (string) null, "Common_Error_Message_NoInternet_Subtitle");
      }
      this.IsError = true;
    }

    private async Task ExecuteShowDetailCommand(Event @event)
    {
      EventsViewModel eventsViewModel = this;
      eventsViewModel._singleNavigation.DisableNavigation();
      int num = await eventsViewModel._navigationService.Navigate<EventDetailViewModel, Event>((M1) @event, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }
  }
}
