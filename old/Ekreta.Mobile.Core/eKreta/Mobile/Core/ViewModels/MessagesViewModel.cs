// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.MessagesViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models.Uzenetek;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using MvvmCross;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class MessagesViewModel : ViewModelBase
  {
    private readonly IUzenetDataService _uzenetDataService;
    private readonly IMvxMessenger _messenger;
    private string _errorSubtitle;
    private IEnumerable<PostaladaElem> _postaladaElemek;
    private MvxAsyncCommand<PostaladaElem> _showDetailCommand;
    private MvxAsyncCommand _refreshCommand;
    private PostaladaElem _selectedItem;
    private string _errorTitle;
    private bool _isError;

    public MessagesViewModel()
    {
      this._uzenetDataService = (IUzenetDataService) Mvx.get_IoCProvider().Resolve<IUzenetDataService>();
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this.SetTitle("Messages_Page_Title");
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

    public IEnumerable<PostaladaElem> PostaladaElemek
    {
      get
      {
        return this._postaladaElemek;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<PostaladaElem>>((M0&) ref this._postaladaElemek, (M0) value, nameof (PostaladaElemek));
      }
    }

    public PostaladaElem SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<PostaladaElem>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ShowDetailCommand.Execute(value);
      }
    }

    public MvxAsyncCommand RefreshCommand
    {
      get
      {
        return this._refreshCommand ?? (this._refreshCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteRefreshCommand), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand<PostaladaElem> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxAsyncCommand<PostaladaElem>(new Func<PostaladaElem, Task>(this.ExecuteShowDetailCommand), new Func<PostaladaElem, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<NewsItemsRemovedMessage>((Action<M0>) (x => this.PostaladaElemek = (IEnumerable<PostaladaElem>) this._uzenetDataService.GetPostaladaElemek(this.ActiveProfile).OrderByDescending<PostaladaElem, DateTimeOffset>((Func<PostaladaElem, DateTimeOffset>) (y => y.Uzenet.KuldesDatum))), (MvxReference) 1, (string) null);
    }

    public virtual async Task Initialize()
    {
      // ISSUE: reference to a compiler-generated method
      await this.\u003C\u003En__0();
      await this.LoadMessages();
    }

    public override void ViewDisappearing()
    {
      base.ViewDisappearing();
      this.SelectedItem = (PostaladaElem) null;
    }

    private async Task LoadMessages()
    {
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      int num1 = (^this).\u003C\u003E1__state;
      MessagesViewModel messagesViewModel1 = this;
      IEnumerable<PostaladaElem> tempPostaladaElemek;
      try
      {
        tempPostaladaElemek = (IEnumerable<PostaladaElem>) null;
        messagesViewModel1.IsLoading = true;
        TaskAwaiter<IEnumerable<PostaladaElem>> taskAwaiter;
        try
        {
          if (messagesViewModel1.ActiveProfile == null)
            messagesViewModel1.ActiveProfile = messagesViewModel1._profileDataService.GetActiveProfile();
          IEnumerable<PostaladaElem> postaladaElemek = messagesViewModel1._uzenetDataService.GetPostaladaElemek(messagesViewModel1.ActiveProfile);
          IOrderedEnumerable<PostaladaElem> orderedEnumerable;
          if (postaladaElemek == null)
          {
            orderedEnumerable = (IOrderedEnumerable<PostaladaElem>) null;
          }
          else
          {
            IEnumerable<PostaladaElem> source = postaladaElemek.Where<PostaladaElem>((Func<PostaladaElem, bool>) (x => x.Uzenet != null));
            orderedEnumerable = source != null ? source.OrderByDescending<PostaladaElem, DateTimeOffset>((Func<PostaladaElem, DateTimeOffset>) (x => x.Uzenet.KuldesDatum)) : (IOrderedEnumerable<PostaladaElem>) null;
          }
          IEnumerable<PostaladaElem> postaladaElems = (IEnumerable<PostaladaElem>) orderedEnumerable;
          tempPostaladaElemek = postaladaElems;
          if (!messagesViewModel1.HasInternetConnection)
          {
            if (postaladaElems == null)
              messagesViewModel1.ShowError();
          }
          else
          {
            TaskAwaiter<IEnumerable<PostaladaElem>> awaiter = messagesViewModel1._uzenetDataService.FetchPostaladaElemek(messagesViewModel1.ActiveProfile).GetAwaiter();
            if (!awaiter.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num1 = 0;
              taskAwaiter = awaiter;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<PostaladaElem>>, MessagesViewModel.\u003CLoadMessages\u003Ed__32>(ref awaiter, this);
              return;
            }
            IEnumerable<PostaladaElem> result = awaiter.GetResult();
            tempPostaladaElemek = (IEnumerable<PostaladaElem>) messagesViewModel1._uzenetDataService.OverridePostaladaElemek(messagesViewModel1.ActiveProfile, result).OrderByDescending<PostaladaElem, DateTimeOffset>((Func<PostaladaElem, DateTimeOffset>) (x => x.Uzenet.KuldesDatum));
            messagesViewModel1._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) messagesViewModel1, messagesViewModel1.ActiveProfile));
          }
        }
        catch (Exception ex1)
        {
          IEnumerable<PostaladaElem> postaladaElemek = messagesViewModel1._uzenetDataService.GetPostaladaElemek(messagesViewModel1.ActiveProfile);
          if (postaladaElemek == null)
            messagesViewModel1.ShowError();
          else if (!postaladaElemek.Any<PostaladaElem>())
          {
            try
            {
              TaskAwaiter<IEnumerable<PostaladaElem>> awaiter = messagesViewModel1._uzenetDataService.FetchPostaladaElemek(messagesViewModel1.ActiveProfile).GetAwaiter();
              if (!awaiter.IsCompleted)
              {
                int num2;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num2 = 1;
                taskAwaiter = awaiter;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<PostaladaElem>>, MessagesViewModel.\u003CLoadMessages\u003Ed__32>(ref awaiter, this);
                return;
              }
              IEnumerable<PostaladaElem> result = awaiter.GetResult();
              tempPostaladaElemek = (IEnumerable<PostaladaElem>) messagesViewModel1._uzenetDataService.OverridePostaladaElemek(messagesViewModel1.ActiveProfile, result).OrderByDescending<PostaladaElem, DateTimeOffset>((Func<PostaladaElem, DateTimeOffset>) (x => x.Uzenet.KuldesDatum));
              messagesViewModel1._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) messagesViewModel1, messagesViewModel1.ActiveProfile));
            }
            catch (Exception ex2)
            {
              CrossMobileAnalytics.Current.TrackException(ex2, (IDictionary<string, string>) null, nameof (LoadMessages), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MessagesViewModel.cs", 151);
            }
          }
          else
            messagesViewModel1.PostaladaElemek = tempPostaladaElemek;
          CrossMobileAnalytics.Current.TrackException(ex1, (IDictionary<string, string>) null, nameof (LoadMessages), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MessagesViewModel.cs", 161);
        }
        MessagesViewModel messagesViewModel2 = messagesViewModel1;
        IEnumerable<PostaladaElem> source1 = tempPostaladaElemek;
        List<PostaladaElem> postaladaElemList = source1 != null ? source1.OrderByDescending<PostaladaElem, DateTimeOffset>((Func<PostaladaElem, DateTimeOffset>) (x => x.Uzenet.KuldesDatum)).ToList<PostaladaElem>() : (List<PostaladaElem>) null;
        messagesViewModel2.PostaladaElemek = (IEnumerable<PostaladaElem>) postaladaElemList;
        messagesViewModel1.IsLoading = false;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        tempPostaladaElemek = (IEnumerable<PostaladaElem>) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      tempPostaladaElemek = (IEnumerable<PostaladaElem>) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult();
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

    private async Task ExecuteRefreshCommand()
    {
      MessagesViewModel messagesViewModel = this;
      try
      {
        if (!messagesViewModel.HasInternetConnection)
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MessagesViewModel.cs", 191);
        await messagesViewModel.LoadMessages();
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (ExecuteRefreshCommand), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MessagesViewModel.cs", 198);
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        messagesViewModel.NotBusy();
      }
    }

    private async Task ExecuteShowDetailCommand(PostaladaElem message)
    {
      MessagesViewModel messagesViewModel = this;
      messagesViewModel._singleNavigation.DisableNavigation();
      int num = await messagesViewModel._navigationService.Navigate<MessageDetailViewModel, PostaladaElem>((M1) message, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }
  }
}
