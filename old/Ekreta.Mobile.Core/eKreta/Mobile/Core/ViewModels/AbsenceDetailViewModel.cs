// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.AbsenceDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using Ekreta.Mobile.Core.Repository.RealmRepository.Absence;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class AbsenceDetailViewModel : ViewModelBase<AbsenceRealm>
  {
    private readonly IMvxMessenger _messenger;
    private readonly IAbsenceDbDataService _absenceDataService;
    private AbsenceRealm _absence;
    private ClassGroupRealm _classGroup;

    public AbsenceDetailViewModel()
    {
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._absenceDataService = (IAbsenceDbDataService) Mvx.get_IoCProvider().Resolve<IAbsenceDbDataService>();
    }

    public AbsenceRealm Absence
    {
      get
      {
        return this._absence;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<AbsenceRealm>((M0&) ref this._absence, (M0) value, nameof (Absence));
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

    public virtual void Prepare(AbsenceRealm parameter)
    {
      this.Absence = parameter;
      this.ClassGroup = ((IQueryable<ClassGroupRealm>) RealmDb.Instance.All<ClassGroupRealm>()).FirstOrDefault<ClassGroupRealm>((Expression<Func<ClassGroupRealm, bool>>) (x => x.Uid == this.Absence.OsztalyCsoportUid && x.IsAktiv));
      this.AbsenceNewItem();
    }

    private void AbsenceNewItem()
    {
      if (this.Absence.SeenByUser)
        return;
      this.Absence.SeenByUser();
      this._messenger.Publish<NewsItemsRemovedMessage>((M0) new NewsItemsRemovedMessage((object) this, 1));
    }
  }
}
