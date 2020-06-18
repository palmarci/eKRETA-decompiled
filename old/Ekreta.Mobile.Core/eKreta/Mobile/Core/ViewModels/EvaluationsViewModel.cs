// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.EvaluationsViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class EvaluationsViewModel : ViewModelBase
  {
    private readonly IMvxMessenger _messenger;
    private readonly IEvaluationDbDataService _evaluationDataService;
    private readonly ISubjectAverageDbDataService _subjectAverageDataService;
    private EvaluationRealm _selectedItem;
    private IEnumerable<EvaluationRealm> _allEvaluation;
    private IEnumerable<GroupedList<DateTime, EvaluationRealm>> _evaluationsByDate;
    private IEnumerable<GroupedList<string, EvaluationRealm>> _evaluationsBySubject;
    private IEnumerable<GroupedList<string, EvaluationRealm>> _evaluationsQuarterYear;
    private IEnumerable<EvaluationRealm> _evaluationsHalfYear;
    private IEnumerable<EvaluationRealm> _evaluationsEndYear;
    private IEnumerable<SubjectAverageRealm> _subjectAverages;
    private MvxAsyncCommand<EvaluationRealm> _showDetailCommand;

    public EvaluationsViewModel(
      IMvxMessenger messenger,
      IEvaluationDbDataService evaluationDataService,
      ISubjectAverageDbDataService subjectAverageDataService)
    {
      this._messenger = messenger;
      this._evaluationDataService = evaluationDataService;
      this._subjectAverageDataService = subjectAverageDataService;
    }

    public EvaluationRealm SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<EvaluationRealm>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ShowDetailCommand.Execute(value);
      }
    }

    public IEnumerable<GroupedList<DateTime, EvaluationRealm>> EvaluationsByDate
    {
      get
      {
        return this._evaluationsByDate;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<DateTime, EvaluationRealm>>>((M0&) ref this._evaluationsByDate, (M0) value, nameof (EvaluationsByDate));
      }
    }

    public IEnumerable<GroupedList<string, EvaluationRealm>> EvaluationsBySubject
    {
      get
      {
        return this._evaluationsBySubject;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<string, EvaluationRealm>>>((M0&) ref this._evaluationsBySubject, (M0) value, nameof (EvaluationsBySubject));
      }
    }

    public IEnumerable<GroupedList<string, EvaluationRealm>> EvaluationsQuarterYear
    {
      get
      {
        return this._evaluationsQuarterYear;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<string, EvaluationRealm>>>((M0&) ref this._evaluationsQuarterYear, (M0) value, nameof (EvaluationsQuarterYear));
      }
    }

    public IEnumerable<EvaluationRealm> EvaluationsHalfYear
    {
      get
      {
        return this._evaluationsHalfYear;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<EvaluationRealm>>((M0&) ref this._evaluationsHalfYear, (M0) value, nameof (EvaluationsHalfYear));
      }
    }

    public IEnumerable<EvaluationRealm> EvaluationsEndYear
    {
      get
      {
        return this._evaluationsEndYear;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<EvaluationRealm>>((M0&) ref this._evaluationsEndYear, (M0) value, nameof (EvaluationsEndYear));
      }
    }

    public MvxAsyncCommand<EvaluationRealm> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxAsyncCommand<EvaluationRealm>(new Func<EvaluationRealm, Task>(this.ExecuteShowDetailCommand), new Func<EvaluationRealm, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) (x => this.FillLists()), (MvxReference) 1, (string) null);
    }

    public override void Prepare()
    {
      base.Prepare();
      this.ActiveProfileRealm = this._profileDbDataService.GetActiveProfile();
      this.FillLists();
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SelectedItem = (EvaluationRealm) null;
    }

    private async void FillLists()
    {
      EvaluationsViewModel evaluationsViewModel = this;
      evaluationsViewModel.IsLoading = true;
      if (evaluationsViewModel._allEvaluation != null)
        evaluationsViewModel.IsLoading = false;
      try
      {
        if (!evaluationsViewModel._connectivity.get_IsConnected())
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/EvaluationsViewModel.cs", 118);
        IEnumerable<SubjectAverageRealm> subjectAverages = await evaluationsViewModel._subjectAverageDataService.FetchSubjectAveragesAsync(evaluationsViewModel.ActiveProfileRealm);
        evaluationsViewModel._subjectAverageDataService.Delete(evaluationsViewModel.ActiveProfileRealm.RolelessId);
        evaluationsViewModel._subjectAverageDataService.AddOrUpdate(evaluationsViewModel.ActiveProfileRealm.RolelessId, subjectAverages, (Action<SubjectAverageRealm>) null);
        evaluationsViewModel._subjectAverages = evaluationsViewModel._subjectAverageDataService.GetSubjectAverages(evaluationsViewModel.ActiveProfileRealm.RolelessId);
        evaluationsViewModel.ComposeEvaluations();
      }
      catch (Exception ex)
      {
        ex.SetErrorCode<Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/EvaluationsViewModel.cs", 130);
        switch (ex)
        {
          case NoInternetConnectionException _:
          case ServerUnreachableException _:
            evaluationsViewModel._subjectAverages = evaluationsViewModel._subjectAverageDataService.GetSubjectAverages(evaluationsViewModel.ActiveProfileRealm.RolelessId);
            evaluationsViewModel.ComposeEvaluations();
            break;
        }
        ErrorHandler.Current.HandleError(ex);
      }
      evaluationsViewModel.IsLoading = false;
    }

    private void ComposeEvaluations()
    {
      this._allEvaluation = this._evaluationDataService.GetEvaluations(this.ActiveProfileRealm.RolelessId);
      if (this._allEvaluation == null)
        return;
      this.EvaluationsByDate = (IEnumerable<GroupedList<DateTime, EvaluationRealm>>) this._allEvaluation.Where<EvaluationRealm>((Func<EvaluationRealm, bool>) (x => this.IsNotCertificationType(x.Type))).ToList<EvaluationRealm>().GroupBy<EvaluationRealm, DateTime>((Func<EvaluationRealm, DateTime>) (x => x.DateLocal)).Select<IGrouping<DateTime, EvaluationRealm>, GroupedList<DateTime, EvaluationRealm>>((Func<IGrouping<DateTime, EvaluationRealm>, GroupedList<DateTime, EvaluationRealm>>) (x => new GroupedList<DateTime, EvaluationRealm>(x.Key, x.Key.ToString("D"), (IEnumerable<EvaluationRealm>) x.OrderBy<EvaluationRealm, string>((Func<EvaluationRealm, string>) (y => y.EvaluationTitle)).ToList<EvaluationRealm>(), "{0}"))).OrderByDescending<GroupedList<DateTime, EvaluationRealm>, DateTime>((Func<GroupedList<DateTime, EvaluationRealm>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, EvaluationRealm>>();
      this.EvaluationsBySubject = (IEnumerable<GroupedList<string, EvaluationRealm>>) this._allEvaluation.Where<EvaluationRealm>((Func<EvaluationRealm, bool>) (x => this.IsNotCertificationType(x.Type))).GroupBy<EvaluationRealm, string>((Func<EvaluationRealm, string>) (x => x.EvaluationTitle)).OrderBy<IGrouping<string, EvaluationRealm>, string>((Func<IGrouping<string, EvaluationRealm>, string>) (x => x.Key)).Select<IGrouping<string, EvaluationRealm>, GroupedList<string, EvaluationRealm>>((Func<IGrouping<string, EvaluationRealm>, GroupedList<string, EvaluationRealm>>) (x => new GroupedList<string, EvaluationRealm>(x.Key.ToString(), this._subjectAverages.FirstOrDefault<SubjectAverageRealm>((Func<SubjectAverageRealm, bool>) (s => s.Subject == x.FirstOrDefault<EvaluationRealm>()?.Subject))?.Value.ToString(), (IEnumerable<EvaluationRealm>) x.OrderByDescending<EvaluationRealm, DateTime>((Func<EvaluationRealm, DateTime>) (y => y.DateLocal)).ToList<EvaluationRealm>(), "{0}"))).ToList<GroupedList<string, EvaluationRealm>>();
      this.EvaluationsQuarterYear = (IEnumerable<GroupedList<string, EvaluationRealm>>) this._allEvaluation.Where<EvaluationRealm>((Func<EvaluationRealm, bool>) (x => x.Type.Contains("QuarterEvaluation"))).GroupBy<EvaluationRealm, string>((Func<EvaluationRealm, string>) (x => x.TypeName)).OrderBy<IGrouping<string, EvaluationRealm>, string>((Func<IGrouping<string, EvaluationRealm>, string>) (x => x.Key)).Select<IGrouping<string, EvaluationRealm>, GroupedList<string, EvaluationRealm>>((Func<IGrouping<string, EvaluationRealm>, GroupedList<string, EvaluationRealm>>) (x => new GroupedList<string, EvaluationRealm>(x.Key, "", (IEnumerable<EvaluationRealm>) x.OrderByDescending<EvaluationRealm, DateTime>((Func<EvaluationRealm, DateTime>) (y => y.DateLocal)).ToList<EvaluationRealm>(), "{0}"))).ToList<GroupedList<string, EvaluationRealm>>();
      this.EvaluationsHalfYear = (IEnumerable<EvaluationRealm>) this._allEvaluation.Where<EvaluationRealm>((Func<EvaluationRealm, bool>) (x => x.Type == "HalfYear")).OrderBy<EvaluationRealm, string>((Func<EvaluationRealm, string>) (x => x.EvaluationTitle)).ToList<EvaluationRealm>();
      this.EvaluationsEndYear = (IEnumerable<EvaluationRealm>) this._allEvaluation.Where<EvaluationRealm>((Func<EvaluationRealm, bool>) (x => x.Type == "EndYear")).OrderBy<EvaluationRealm, string>((Func<EvaluationRealm, string>) (x => x.EvaluationTitle)).ToList<EvaluationRealm>();
    }

    private async Task ExecuteShowDetailCommand(EvaluationRealm evaluation)
    {
      EvaluationsViewModel evaluationsViewModel = this;
      evaluationsViewModel._singleNavigation.DisableNavigation();
      int num = await evaluationsViewModel._navigationService.Navigate<EvaluationDetailViewModel, EvaluationRealm>((M1) evaluation, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }

    private bool IsNotCertificationType(string evaluationType)
    {
      return !evaluationType.Contains("QuarterEvaluation") && evaluationType != "HalfYear" && evaluationType != "EndYear";
    }
  }
}
