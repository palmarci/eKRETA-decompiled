// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.NoteDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using Ekreta.Mobile.Core.Repository.RealmRepository.Note;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class NoteDetailViewModel : ViewModelBase<NoteRealm>
  {
    private readonly IMvxMessenger _messenger;
    private readonly INoteDbDataService _noteDataService;
    private bool _showRating;
    private NoteRealm _note;
    private ClassGroupRealm _classGroup;

    public NoteDetailViewModel()
    {
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._noteDataService = (INoteDbDataService) Mvx.get_IoCProvider().Resolve<INoteDbDataService>();
    }

    public NoteRealm Note
    {
      get
      {
        return this._note;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<NoteRealm>((M0&) ref this._note, (M0) value, nameof (Note));
      }
    }

    public ClassGroupRealm ClassGroup
    {
      get
      {
        return this._classGroup;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ClassGroupRealm>((M0&) ref this._classGroup, (M0) value, nameof (ClassGroup));
      }
    }

    public virtual void Prepare(NoteRealm parameter)
    {
      this.Note = parameter;
      this.ClassGroup = ((IQueryable<ClassGroupRealm>) RealmDb.Instance.All<ClassGroupRealm>()).FirstOrDefault<ClassGroupRealm>((Expression<Func<ClassGroupRealm, bool>>) (x => x.Uid == this.Note.OsztalyCsoportUid && x.IsAktiv));
      this.NoteNewItem();
    }

    public override void ViewDisappearing()
    {
      if (this._showRating)
        this._modalDialog.InvokeRatingFlow(this._profileDataService.GetActiveProfile());
      base.ViewDisappearing();
    }

    private void NoteNewItem()
    {
      if (this.Note.SeenByUser)
        return;
      if (this.Note.Type.ToLower().Contains("Dicséret".ToLower()))
        this._showRating = true;
      this.Note.SeenByUser();
      this._messenger.Publish<NewsItemsRemovedMessage>((M0) new NewsItemsRemovedMessage((object) this, 1));
    }
  }
}
