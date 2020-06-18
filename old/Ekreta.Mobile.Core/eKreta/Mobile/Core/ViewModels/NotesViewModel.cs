// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.NotesViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
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
  public class NotesViewModel : ViewModelBase
  {
    protected readonly INoteDbDataService _noteDataService;
    protected readonly IMvxMessenger _messenger;
    protected IEnumerable<GroupedList<int, NoteRealm>> _items;
    private NoteRealm _selectedItem;
    private MvxAsyncCommand<NoteRealm> _showDetailCommand;

    public NotesViewModel(IMvxMessenger messenger, INoteDbDataService noteDataService)
    {
      this._messenger = messenger;
      this._noteDataService = noteDataService;
    }

    public IEnumerable<GroupedList<int, NoteRealm>> Items
    {
      get
      {
        return this._items;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<IEnumerable<GroupedList<int, NoteRealm>>>((M0&) ref this._items, (M0) value, nameof (Items));
      }
    }

    public NoteRealm SelectedItem
    {
      get
      {
        return this._selectedItem;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<NoteRealm>((M0&) ref this._selectedItem, (M0) value, nameof (SelectedItem)) || value == null)
          return;
        this.ShowDetailCommand.Execute(value);
      }
    }

    public MvxAsyncCommand<NoteRealm> ShowDetailCommand
    {
      get
      {
        return this._showDetailCommand ?? (this._showDetailCommand = new MvxAsyncCommand<NoteRealm>(new Func<NoteRealm, Task>(this.ExecuteShowDetailCommand), new Func<NoteRealm, bool>(this._singleNavigation.CanExecuteNavigationCommand), false));
      }
    }

    public override void Start()
    {
      base.Start();
      this._messenger.Subscribe<NewsItemsReceivedMessage>((Action<M0>) (x => this.FillList()), (MvxReference) 1, (string) null);
    }

    public override void Prepare()
    {
      base.Prepare();
      this.FillList();
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SelectedItem = (NoteRealm) null;
    }

    private void FillList()
    {
      try
      {
        this.Items = (IEnumerable<GroupedList<int, NoteRealm>>) this._noteDataService.GetNotes(this.ActiveProfile.RolelessId).GroupBy(x =>
        {
          DateTime dateLocal = x.DateLocal;
          int year = dateLocal.Year;
          dateLocal = x.DateLocal;
          int month = dateLocal.Month;
          return new{ Year = year, Month = month };
        }).Select<IGrouping<\u003C\u003Ef__AnonymousType0<int, int>, NoteRealm>, GroupedList<int, NoteRealm>>(x => new GroupedList<int, NoteRealm>(int.Parse(string.Format("{0}{1:D2}", (object) x.Key.Year, (object) x.Key.Month)), CultureInfo.CurrentUICulture.DateTimeFormat.GetMonthName(x.Key.Month), (IEnumerable<NoteRealm>) x.ToList<NoteRealm>(), "{0}")).OrderByDescending<GroupedList<int, NoteRealm>, int>((Func<GroupedList<int, NoteRealm>, int>) (x => x.Key)).ToList<GroupedList<int, NoteRealm>>();
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
    }

    private async Task ExecuteShowDetailCommand(NoteRealm note)
    {
      NotesViewModel notesViewModel = this;
      notesViewModel._singleNavigation.DisableNavigation();
      int num = await notesViewModel._navigationService.Navigate<NoteDetailViewModel, NoteRealm>((M1) note, (IMvxBundle) null, new CancellationToken()) ? 1 : 0;
    }
  }
}
