// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.ExamsViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using MvvmCross.Base;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class ExamsViewModel : ViewModelBase
  {
    protected readonly IExamDbDataService _examDataService;
    protected readonly IMvxMessenger _messenger;
    protected IEnumerable<GroupedList<int, ExamRealm>> _items;
    private int _itemsCount;
    private bool _isOffline;
    private ExamRealm _selectedItem;
    private MvxAsyncCommand<ExamRealm> _showDetailCommand;
    private MvxAsyncCommand _refreshCommand;

    public ExamsViewModel(IMvxMessenger messenger, IExamDbDataService examDataService)
    {
      this._messenger = messenger;
      this._examDataService = examDataService;
    }

    public int ItemsCount
    {
      get
      {
        return this._itemsCount;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<int>((M0&) ref this._itemsCount, (M0) value, nameof (ItemsCount));
      }
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

    public IEnumerable<GroupedList<int, ExamRealm>> Items
    {
      get
      {
        return this._items;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<int, ExamRealm>>>((M0&) ref this._items, (M0) value, nameof (Items));
      }
    }

    public ExamRealm SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<ExamRealm>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ShowDetailCommand.Execute(value);
      }
    }

    public MvxAsyncCommand<ExamRealm> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxAsyncCommand<ExamRealm>(new Func<ExamRealm, Task>(this.ExecuteShowDetailCommand), new Func<ExamRealm, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public MvxAsyncCommand RefreshCommand
    {
      get
      {
        return this._refreshCommand ?? (this._refreshCommand = new MvxAsyncCommand(new Func<Task>(this.ExecutRefreshCommand), (Func<bool>) null, false));
      }
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) (async x => await this.FillList()), (MvxReference) 1, (string) null);
    }

    public virtual async Task Initialize()
    {
      // ISSUE: reference to a compiler-generated method
      await this.\u003C\u003En__0();
      await this.FillList();
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SelectedItem = (ExamRealm) null;
    }

    private async Task FillList()
    {
      ExamsViewModel examsViewModel1 = this;
      examsViewModel1.IsLoading = true;
      if (examsViewModel1._items != null)
        examsViewModel1.IsLoading = false;
      try
      {
        ExamsViewModel examsViewModel = examsViewModel1;
        examsViewModel1.IsOffline = false;
        if (!examsViewModel1._connectivity.get_IsConnected())
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ExamsViewModel.cs", 104);
        IEnumerable<ExamRealm> source = await examsViewModel1._examDataService.FetchExamsAsync(examsViewModel1.ActiveProfileRealm, false);
        List<ExamRealm> storedExams = examsViewModel1._examDataService.GetExams(examsViewModel1.ActiveProfileRealm.Id).ToList<ExamRealm>();
        IEnumerable<ExamRealm> exams1 = source != null ? (IEnumerable<ExamRealm>) source.Select<ExamRealm, ExamRealm>((Func<ExamRealm, ExamRealm>) (x =>
        {
          ExamRealm examRealm = storedExams.FirstOrDefault<ExamRealm>((Func<ExamRealm, bool>) (y => y.Uid == x.Uid && y.ProfileId == examsViewModel.ActiveProfileRealm.Id));
          x.SeenByUser = false;
          if (examRealm != null)
            x.SeenByUser = examRealm.SeenByUser;
          else if (examsViewModel.ActiveProfile.IsFirstLogin)
            x.SeenByUser = true;
          return x;
        })).ToList<ExamRealm>() : (IEnumerable<ExamRealm>) null;
        examsViewModel1._examDataService.Delete(examsViewModel1.ActiveProfileRealm.Id);
        // ISSUE: reference to a compiler-generated method
        examsViewModel1._examDataService.AddOrUpdate(exams1, new Action<ExamRealm>(examsViewModel1.\u003CFillList\u003Eb__28_1));
        IEnumerable<ExamRealm> exams2 = examsViewModel1._examDataService.GetExams(examsViewModel1.ActiveProfileRealm.Id);
        examsViewModel1.ComposeExams(exams2);
        examsViewModel1._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) examsViewModel1, examsViewModel1.ActiveProfile));
      }
      catch (Exception ex)
      {
        ex.SetErrorCode<Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ExamsViewModel.cs", 135);
        switch (ex)
        {
          case NoInternetConnectionException _:
          case ServerUnreachableException _:
            examsViewModel1.IsOffline = true;
            IEnumerable<ExamRealm> exams = examsViewModel1._examDataService.GetExams(examsViewModel1.ActiveProfileRealm.Id);
            examsViewModel1.ComposeExams(exams);
            break;
        }
      }
      finally
      {
        examsViewModel1.IsLoading = false;
      }
      examsViewModel1.IsLoading = false;
    }

    private void ComposeExams(IEnumerable<ExamRealm> exams)
    {
      if (exams != null && exams.Any<ExamRealm>())
      {
        IEnumerable<GroupedList<int, ExamRealm>> groupedLists = exams.GroupBy(x =>
        {
          DateTime datumLocal = x.DatumLocal;
          int year = datumLocal.Year;
          datumLocal = x.DatumLocal;
          int month = datumLocal.Month;
          return new{ Year = year, Month = month };
        }).Select<IGrouping<\u003C\u003Ef__AnonymousType0<int, int>, ExamRealm>, GroupedList<int, ExamRealm>>(x => new GroupedList<int, ExamRealm>(int.Parse(string.Format("{0}{1:D2}", (object) x.Key.Year, (object) x.Key.Month)), CultureInfo.CurrentCulture.DateTimeFormat.GetMonthName(x.Key.Month), (IEnumerable<ExamRealm>) x.Where<ExamRealm>((Func<ExamRealm, bool>) (z => z.DatumLocal >= DateTime.Now)).OrderBy<ExamRealm, DateTime>((Func<ExamRealm, DateTime>) (y => y.DatumLocal)).ToList<ExamRealm>(), "{0}")).Where<GroupedList<int, ExamRealm>>((Func<GroupedList<int, ExamRealm>, bool>) (x => x.Count<ExamRealm>() > 0));
        this._itemsCount = groupedLists.Count<GroupedList<int, ExamRealm>>();
        this.Items = (IEnumerable<GroupedList<int, ExamRealm>>) new List<GroupedList<int, ExamRealm>>(groupedLists);
        ((MvxMainThreadDispatchingObject) this).InvokeOnMainThread((Action) (() =>
        {
          ((MvxNotifyPropertyChanged) this).RaisePropertyChanged("Items");
          ((MvxNotifyPropertyChanged) this).RaisePropertyChanged("ItemsCount");
        }), true);
      }
      else
        exams = (IEnumerable<ExamRealm>) null;
    }

    private async Task ExecuteShowDetailCommand(ExamRealm exam)
    {
      ExamsViewModel examsViewModel = this;
      examsViewModel._singleNavigation.DisableNavigation();
      int num = await examsViewModel._navigationService.Navigate<ExamsDetailViewModel, ExamRealm>((M1) exam, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }

    private async Task ExecutRefreshCommand()
    {
      ExamsViewModel examsViewModel = this;
      try
      {
        if (!examsViewModel.HasInternetConnection)
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ExamsViewModel.cs", 191);
        await examsViewModel.FillList();
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "ExamsViewModel:RefreshCommand", "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/ExamsViewModel.cs", 198);
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        // ISSUE: reference to a compiler-generated method
        ((MvxMainThreadDispatchingObject) examsViewModel).InvokeOnMainThread(new Action(examsViewModel.\u003CExecutRefreshCommand\u003Eb__31_0), true);
      }
    }
  }
}
