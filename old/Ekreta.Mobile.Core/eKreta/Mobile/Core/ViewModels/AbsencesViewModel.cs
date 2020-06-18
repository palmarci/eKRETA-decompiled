// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.AbsencesViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
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
  public class AbsencesViewModel : ViewModelBase
  {
    public static readonly string[] JustificationStates = new string[3]
    {
      "BeJustified",
      "UnJustified",
      "Justified"
    };
    private readonly IAbsenceDbDataService _absenceDataService;
    private readonly IMvxMessenger _messenger;
    private string _defaultJustificationState;
    private IEnumerable<AbsenceRealm> _allAbsences;
    private AbsenceRealm _selectedItem;
    private IEnumerable<GroupedList<DateTime, AbsenceRealm>> _absencesUnjustified;
    private IEnumerable<GroupedList<DateTime, AbsenceRealm>> _absencesToJustify;
    private IEnumerable<GroupedList<DateTime, AbsenceRealm>> _absencesJustified;
    private MvxAsyncCommand<AbsenceRealm> _showDetailCommand;

    public AbsencesViewModel(IMvxMessenger messenger, IAbsenceDbDataService absenceDataService)
    {
      this._messenger = messenger;
      this._absenceDataService = absenceDataService;
    }

    public string DefaultJustificationState
    {
      get
      {
        return this._defaultJustificationState;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._defaultJustificationState, (M0) value, nameof (DefaultJustificationState));
      }
    }

    public int DefaultJustificationStateIndex
    {
      get
      {
        return Array.FindIndex<string>(AbsencesViewModel.JustificationStates, (Predicate<string>) (x => x == this.DefaultJustificationState));
      }
    }

    public AbsenceRealm SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<AbsenceRealm>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ShowDetailCommand.Execute(value);
      }
    }

    public IEnumerable<GroupedList<DateTime, AbsenceRealm>> AbsencesUnjustified
    {
      get
      {
        return this._absencesUnjustified;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<DateTime, AbsenceRealm>>>((M0&) ref this._absencesUnjustified, (M0) value, nameof (AbsencesUnjustified));
      }
    }

    public IEnumerable<GroupedList<DateTime, AbsenceRealm>> AbsencesToJustify
    {
      get
      {
        return this._absencesToJustify;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<DateTime, AbsenceRealm>>>((M0&) ref this._absencesToJustify, (M0) value, nameof (AbsencesToJustify));
      }
    }

    public IEnumerable<GroupedList<DateTime, AbsenceRealm>> AbsencesJustified
    {
      get
      {
        return this._absencesJustified;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<DateTime, AbsenceRealm>>>((M0&) ref this._absencesJustified, (M0) value, nameof (AbsencesJustified));
      }
    }

    public MvxAsyncCommand<AbsenceRealm> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxAsyncCommand<AbsenceRealm>(new Func<AbsenceRealm, Task>(this.ExecuteShowDetailCommand), new Func<AbsenceRealm, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public void Prepare(string justificationState)
    {
      this.DefaultJustificationState = justificationState;
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) (x => this.FillLists()), (MvxReference) 1, (string) null);
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SelectedItem = (AbsenceRealm) null;
    }

    public override void Prepare()
    {
      base.Prepare();
      this.ActiveProfileRealm = this._profileDbDataService.GetActiveProfile();
      this.FillLists();
    }

    private void FillLists()
    {
      this.IsLoading = true;
      if (this._allAbsences != null)
        this.IsLoading = false;
      try
      {
        this._allAbsences = this._absenceDataService.GetAbsences(this.ActiveProfileRealm.RolelessId);
        if (this._allAbsences != null)
        {
          this.AbsencesUnjustified = (IEnumerable<GroupedList<DateTime, AbsenceRealm>>) this._allAbsences.Where<AbsenceRealm>((Func<AbsenceRealm, bool>) (x => x.JustificationState == "UnJustified")).ToList<AbsenceRealm>().GroupBy<AbsenceRealm, DateTime>((Func<AbsenceRealm, DateTime>) (x => x.LessonStartTimeLocal)).Select<IGrouping<DateTime, AbsenceRealm>, GroupedList<DateTime, AbsenceRealm>>((Func<IGrouping<DateTime, AbsenceRealm>, GroupedList<DateTime, AbsenceRealm>>) (x => new GroupedList<DateTime, AbsenceRealm>(x.Key, x.Key.ToString("D"), (IEnumerable<AbsenceRealm>) x.ToList<AbsenceRealm>(), "{0}"))).OrderByDescending<GroupedList<DateTime, AbsenceRealm>, DateTime>((Func<GroupedList<DateTime, AbsenceRealm>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, AbsenceRealm>>();
          this.AbsencesToJustify = (IEnumerable<GroupedList<DateTime, AbsenceRealm>>) this._allAbsences.Where<AbsenceRealm>((Func<AbsenceRealm, bool>) (x => x.JustificationState == "BeJustified")).ToList<AbsenceRealm>().GroupBy<AbsenceRealm, DateTime>((Func<AbsenceRealm, DateTime>) (x => x.LessonStartTimeLocal)).Select<IGrouping<DateTime, AbsenceRealm>, GroupedList<DateTime, AbsenceRealm>>((Func<IGrouping<DateTime, AbsenceRealm>, GroupedList<DateTime, AbsenceRealm>>) (x => new GroupedList<DateTime, AbsenceRealm>(x.Key, x.Key.ToString("D"), (IEnumerable<AbsenceRealm>) x.ToList<AbsenceRealm>(), "{0}"))).OrderByDescending<GroupedList<DateTime, AbsenceRealm>, DateTime>((Func<GroupedList<DateTime, AbsenceRealm>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, AbsenceRealm>>();
          this.AbsencesJustified = (IEnumerable<GroupedList<DateTime, AbsenceRealm>>) this._allAbsences.Where<AbsenceRealm>((Func<AbsenceRealm, bool>) (x => x.JustificationState == "Justified")).ToList<AbsenceRealm>().GroupBy<AbsenceRealm, DateTime>((Func<AbsenceRealm, DateTime>) (x => x.LessonStartTimeLocal)).Select<IGrouping<DateTime, AbsenceRealm>, GroupedList<DateTime, AbsenceRealm>>((Func<IGrouping<DateTime, AbsenceRealm>, GroupedList<DateTime, AbsenceRealm>>) (x => new GroupedList<DateTime, AbsenceRealm>(x.Key, x.Key.ToString("D"), (IEnumerable<AbsenceRealm>) x.ToList<AbsenceRealm>(), "{0}"))).OrderByDescending<GroupedList<DateTime, AbsenceRealm>, DateTime>((Func<GroupedList<DateTime, AbsenceRealm>, DateTime>) (x => x.Key)).ToList<GroupedList<DateTime, AbsenceRealm>>();
        }
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      this.IsLoading = false;
    }

    private async Task ExecuteShowDetailCommand(AbsenceRealm absence)
    {
      AbsencesViewModel absencesViewModel = this;
      absencesViewModel._singleNavigation.DisableNavigation();
      int num = await absencesViewModel._navigationService.Navigate<AbsenceDetailViewModel, AbsenceRealm>((M1) absence, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }
  }
}
