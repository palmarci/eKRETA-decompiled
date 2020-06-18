// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.InstitutePickerViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Messages;
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
  public class InstitutePickerViewModel : ViewModelBase
  {
    private ObservableCollection<Institute> _institutes = (ObservableCollection<Institute>) new MvxObservableCollection<Institute>();
    private readonly IMvxMessenger _messenger;
    private readonly IInstituteDataService _instituteDataService;
    private string _searchText;
    private MvxAsyncCommand _refreshCommand;
    private MvxAsyncCommand _searchCommand;
    private Institute _selectedInstitute;
    private MvxAsyncCommand _goBackCommand;
    private List<Institute> _institutesList;
    private static string _searchTextGlobal;

    public InstitutePickerViewModel(
      IInstituteDataService instituteDataService,
      IMvxMessenger messenger)
    {
      this._instituteDataService = instituteDataService;
      this._messenger = messenger;
    }

    public string SearchText
    {
      get
      {
        return this._searchText;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._searchText, (M0) value, nameof (SearchText));
      }
    }

    public ObservableCollection<Institute> Institutes
    {
      get
      {
        return this._institutes;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ObservableCollection<Institute>>((M0&) ref this._institutes, (M0) value, nameof (Institutes));
      }
    }

    public Institute SelectedInstitute
    {
      get
      {
        return this._selectedInstitute;
      }
      set
      {
        if (this._selectedInstitute != null)
          return;
        ((MvxNotifyPropertyChanged) this).SetProperty<Institute>((M0&) ref this._selectedInstitute, (M0) value, nameof (SelectedInstitute));
        this._messenger.Publish<SelectedInstituteMessage>((M0) new SelectedInstituteMessage((object) this, this._selectedInstitute));
        this._navigationService.Close((IMvxViewModel) this, new CancellationToken());
      }
    }

    public MvxAsyncCommand GoBackCommand
    {
      get
      {
        return this._goBackCommand ?? (this._goBackCommand = new MvxAsyncCommand(new Func<Task>(this.Close), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand SearchCommand
    {
      get
      {
        return this._searchCommand ?? (this._searchCommand = new MvxAsyncCommand((Func<Task>) (() => this.GetInstitutes(false)), (Func<bool>) null, false));
      }
    }

    public MvxAsyncCommand RefreshCommand
    {
      get
      {
        return this._refreshCommand ?? (this._refreshCommand = new MvxAsyncCommand(new Func<Task>(this.GetInstitutesOnline), (Func<bool>) null, false));
      }
    }

    public override void ViewAppeared()
    {
      if (!string.IsNullOrEmpty(InstitutePickerViewModel._searchTextGlobal))
        this.SearchText = InstitutePickerViewModel._searchTextGlobal;
      Task.Run((Func<Task>) (async () => await this.GetInstitutes(false)));
    }

    private async Task GetInstitutes(bool refreshOnline = false)
    {
      InstitutePickerViewModel institutePickerViewModel = this;
      if (!institutePickerViewModel.HasInternetConnection)
      {
        int num1 = await institutePickerViewModel._modalDialog.DisplayAlertAsync(institutePickerViewModel._textProvider.GetText((string) null, (string) null, "Common_NoInternet_Message"), institutePickerViewModel._textProvider.GetText((string) null, (string) null, "Common_NoInternet_Title"), "OK", (string) null) ? 1 : 0;
        int num2 = await institutePickerViewModel._navigationService.Close((IMvxViewModel) institutePickerViewModel, new CancellationToken()) ? 1 : 0;
      }
      else
      {
        institutePickerViewModel.IsLoading = true;
        await Task.Run((Func<Task>) (async () => await this.FetchInsitutes(refreshOnline)));
      }
    }

    private async Task FetchInsitutes(bool refreshOnline)
    {
      InstitutePickerViewModel institutePickerViewModel1 = this;
      try
      {
        institutePickerViewModel1.Busy();
        if (refreshOnline)
        {
          IEnumerable<Institute> source = await institutePickerViewModel1._instituteDataService.FetchInstitutesAsync();
          institutePickerViewModel1._institutesList = source.ToList<Institute>();
          institutePickerViewModel1._instituteDataService.SaveInstitutes((IEnumerable<Institute>) institutePickerViewModel1._institutesList);
        }
        else if (institutePickerViewModel1._institutesList == null)
        {
          institutePickerViewModel1._institutesList = institutePickerViewModel1._instituteDataService.GetInstitutes().ToList<Institute>();
          if (!institutePickerViewModel1._institutesList.Any<Institute>())
          {
            IEnumerable<Institute> source = await institutePickerViewModel1._instituteDataService.FetchInstitutesAsync();
            institutePickerViewModel1._institutesList = source.ToList<Institute>();
            institutePickerViewModel1._instituteDataService.SaveInstitutes((IEnumerable<Institute>) institutePickerViewModel1._institutesList);
          }
        }
        if (!string.IsNullOrWhiteSpace(institutePickerViewModel1.SearchText))
        {
          InstitutePickerViewModel._searchTextGlobal = institutePickerViewModel1.SearchText;
          List<Institute> institutesList = institutePickerViewModel1._institutesList;
          // ISSUE: reference to a compiler-generated method
          IOrderedEnumerable<Institute> orderedEnumerable = institutesList != null ? institutesList.Where<Institute>(new Func<Institute, bool>(institutePickerViewModel1.\u003CFetchInsitutes\u003Eb__28_1)).OrderBy<Institute, string>((Func<Institute, string>) (x => x.Name)) : (IOrderedEnumerable<Institute>) null;
          institutePickerViewModel1.Institutes = new ObservableCollection<Institute>((IEnumerable<Institute>) orderedEnumerable);
        }
        else
        {
          InstitutePickerViewModel._searchTextGlobal = string.Empty;
          InstitutePickerViewModel institutePickerViewModel2 = institutePickerViewModel1;
          List<Institute> institutesList = institutePickerViewModel1._institutesList;
          MvxObservableCollection<Institute> observableCollection = new MvxObservableCollection<Institute>(institutesList != null ? (IEnumerable<Institute>) institutesList.OrderBy<Institute, string>((Func<Institute, string>) (x => x.City)) : (IEnumerable<Institute>) null);
          institutePickerViewModel2.Institutes = (ObservableCollection<Institute>) observableCollection;
        }
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (FetchInsitutes), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/InstitutePickerViewModel.cs", 132);
      }
      finally
      {
        institutePickerViewModel1.NotBusy();
      }
    }

    private async Task GetInstitutesOnline()
    {
      await this.GetInstitutes(true);
    }

    private async Task Close()
    {
      InstitutePickerViewModel institutePickerViewModel = this;
      int num = await institutePickerViewModel._navigationService.Close((IMvxViewModel) institutePickerViewModel, new CancellationToken()) ? 1 : 0;
    }
  }
}
