// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.InformationViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using MvvmCross;
using MvvmCross.ViewModels;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class InformationViewModel : ViewModelBase
  {
    private List<Information> _informations;
    private IPushNotificationPlatformSpecificService _pushNotificationPlatformSpecificService;

    public InformationViewModel()
    {
      this._pushNotificationPlatformSpecificService = (IPushNotificationPlatformSpecificService) Mvx.get_IoCProvider().Resolve<IPushNotificationPlatformSpecificService>();
    }

    public List<Information> Informations
    {
      get
      {
        return this._informations;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<List<Information>>((M0&) ref this._informations, (M0) value, nameof (Informations));
      }
    }

    public override void ViewAppeared()
    {
      base.ViewAppeared();
      this.SetInformations();
    }

    protected override void OnConnectivityChanged(bool isConnectedToInternet)
    {
      this.SetInformations();
    }

    private void SetInformations()
    {
      this.Busy();
      List<Information> informationList = new List<Information>(2);
      if (!this.HasInternetConnection)
        informationList.Add(new Information("Common_NoInternet_Title", "Common_NoInternet_Message"));
      if (!this._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice())
        informationList.Add(new Information("Push_NeedEnable_Title", "Push_NeedEnable"));
      this.Informations = informationList;
      this.NotBusy();
    }
  }
}
