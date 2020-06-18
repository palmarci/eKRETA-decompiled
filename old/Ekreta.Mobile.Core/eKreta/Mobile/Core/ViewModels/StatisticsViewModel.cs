// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.StatisticsViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using eKreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class StatisticsViewModel : ViewModelBase
  {
    private string _absencesProgressColor = "#00FF00";
    private readonly IMvxMessenger _messenger;
    private readonly IMobileApi _mobileApi;
    private readonly IAbsenceDataService _absenceDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly ISubjectAverageDataService _subjectAverageDataService;
    private List<Ekreta.Mobile.Core.Models.Statistics> _statistics;
    private string _absencesSumString;
    private double _absencesProgress;

    public StatisticsViewModel(
      IMvxMessenger messenger,
      IMobileApi mobileApi,
      IAbsenceDataService absenceDataService,
      IEvaluationDataService evaluationDataService,
      ISubjectAverageDataService subjectAverageDataService)
    {
      this._messenger = messenger;
      this._mobileApi = mobileApi;
      this._absenceDataService = absenceDataService;
      this._evaluationDataService = evaluationDataService;
      this._subjectAverageDataService = subjectAverageDataService;
    }

    public List<Ekreta.Mobile.Core.Models.Statistics> Statistics
    {
      get
      {
        return this._statistics;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<List<Ekreta.Mobile.Core.Models.Statistics>>((M0&) ref this._statistics, (M0) value, nameof (Statistics));
      }
    }

    public string AbsencesSumString
    {
      get
      {
        return this._absencesSumString;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._absencesSumString, (M0) value, nameof (AbsencesSumString));
      }
    }

    public double AbsencesProgress
    {
      get
      {
        return this._absencesProgress;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<double>((M0&) ref this._absencesProgress, (M0) value, nameof (AbsencesProgress));
      }
    }

    public string AbsencesProgressColor
    {
      get
      {
        return this._absencesProgressColor;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._absencesProgressColor, (M0) value, nameof (AbsencesProgressColor));
      }
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) (async x => await this.FillList()), (MvxReference) 1, (string) null);
      this._messenger.Subscribe<ProfileSyncMessage>((Action<M0>) (async x => await this.FillList()), (MvxReference) 1, (string) null);
    }

    public virtual async Task Initialize()
    {
      await this.FillList();
    }

    private async Task FillList()
    {
      StatisticsViewModel statisticsViewModel = this;
      statisticsViewModel.Busy();
      // ISSUE: reference to a compiler-generated method
      await Task.Run(new Func<Task>(statisticsViewModel.\u003CFillList\u003Eb__24_0));
    }

    private async void ComposeStatistics(IEnumerable<SubjectAverage> subjectAverages)
    {
      StatisticsViewModel statisticsViewModel = this;
      IEnumerable<Evaluation> evaluations = statisticsViewModel._evaluationDataService.GetEvaluations(statisticsViewModel.ActiveProfile);
      IEnumerable<Absence> absences = statisticsViewModel._absenceDataService.GetAbsences(statisticsViewModel.ActiveProfile);
      if (subjectAverages != null && evaluations != null && absences != null)
      {
        int absencesDelayTimeHours = statisticsViewModel.CountAbsencesDelayTimeHours(absences);
        statisticsViewModel.AbsencesSumString = string.Format(statisticsViewModel._textProvider.GetText((string) null, (string) null, "Statistics_AllAbsences"), (object) absencesDelayTimeHours);
        statisticsViewModel.AbsencesProgress = (double) absencesDelayTimeHours / 250.0 * 300.0;
        statisticsViewModel.AbsencesProgressColor = statisticsViewModel.SetAbsencesProgressColor(absencesDelayTimeHours);
        statisticsViewModel.Statistics = subjectAverages.Where<SubjectAverage>((Func<SubjectAverage, bool>) (x => x.Subject != "Szorgalom" && x.Subject != "Magatartás")).OrderBy<SubjectAverage, string>((Func<SubjectAverage, string>) (x => x.Subject)).Select<SubjectAverage, Ekreta.Mobile.Core.Models.Statistics>((Func<SubjectAverage, Ekreta.Mobile.Core.Models.Statistics>) (x =>
        {
          Ekreta.Mobile.Core.Models.Statistics statistics = new Ekreta.Mobile.Core.Models.Statistics();
          statistics.Subject = x.Subject;
          float? nullable = x.Value;
          statistics.Average = nullable.HasValue ? new double?((double) nullable.GetValueOrDefault()) : new double?();
          statistics.EvaluationNumber = evaluations.Where<Evaluation>((Func<Evaluation, bool>) (ew => ew.Subject == x.Subject && ew.Weight != null && ew.Weight != "-" && ew.Type.Equals("MidYear"))).Count<Evaluation>();
          statistics.OtherEvaluationNumber = evaluations.Where<Evaluation>((Func<Evaluation, bool>) (ew =>
          {
            if (!(ew.Subject == x.Subject))
              return false;
            return ew.Weight == null || ew.Weight == "-" || !ew.Type.Equals("MidYear");
          })).Count<Evaluation>();
          statistics.AbsencesJustified = absences.Where<Absence>((Func<Absence, bool>) (ajw => ajw.Subject == x.Subject && ajw.JustificationState == "Justified")).Count<Absence>();
          statistics.AbsencesUnjustified = absences.Where<Absence>((Func<Absence, bool>) (auw => auw.Subject == x.Subject && auw.JustificationState == "UnJustified")).Count<Absence>();
          return statistics;
        })).ToList<Ekreta.Mobile.Core.Models.Statistics>();
      }
      await Task.Delay(1000);
    }

    private int CountAbsencesDelayTimeHours(IEnumerable<Absence> absences)
    {
      int num1 = 0;
      foreach (Absence absence in absences)
      {
        byte? delayTimeMinutes = absence.DelayTimeMinutes;
        int? nullable = delayTimeMinutes.HasValue ? new int?((int) delayTimeMinutes.GetValueOrDefault()) : new int?();
        int num2 = 0;
        if (nullable.GetValueOrDefault() == num2 & nullable.HasValue)
        {
          num1 += 45;
        }
        else
        {
          int num3 = num1;
          delayTimeMinutes = absence.DelayTimeMinutes;
          int valueOrDefault = (int) delayTimeMinutes.GetValueOrDefault();
          num1 = num3 + valueOrDefault;
        }
      }
      return num1 / 45;
    }

    private string SetAbsencesProgressColor(int absencesDelayTimeHours)
    {
      double num1 = (double) absencesDelayTimeHours / 125.0 * (double) byte.MaxValue;
      double num2 = (double) byte.MaxValue;
      if (absencesDelayTimeHours > 124)
      {
        num1 = (double) byte.MaxValue;
        num2 = (double) byte.MaxValue - (double) (absencesDelayTimeHours - 125) / 125.0 * (double) byte.MaxValue;
        if (absencesDelayTimeHours > 249)
          num2 = 0.0;
      }
      return "#" + BitConverter.ToString(new byte[3]
      {
        (byte) num1,
        (byte) num2,
        (byte) 0
      }).Replace("-", "");
    }
  }
}
