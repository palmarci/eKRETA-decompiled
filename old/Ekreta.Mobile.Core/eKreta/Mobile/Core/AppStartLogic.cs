// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.AppStartLogic
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using Ekreta.Mobile.Core.ViewModels;
using MvvmCross.Navigation;
using MvvmCross.ViewModels;
using Plugin.VersionTracking;
using Realms;
using System;
using System.Collections.Generic;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core
{
  public class AppStartLogic : MvxAppStart
  {
    private readonly ISystemInfo _systemInfo;
    private readonly IAppVersionService _appVersionService;

    public AppStartLogic(
      IMvxApplication application,
      IMvxNavigationService navigationService,
      IAppVersionService appVersionService,
      ISystemInfo systemInfo)
    {
      this.\u002Ector(application, navigationService);
      this._appVersionService = appVersionService;
      this._systemInfo = systemInfo;
    }

    protected virtual async Task NavigateToFirstViewModel(object hint = null)
    {
      await this.Initialize(hint);
    }

    private async Task Initialize(object hint = null)
    {
      AppStartLogic appStartLogic = this;
      try
      {
        bool flag1 = await appStartLogic.CheckVersion();
        bool flag2 = false;
        try
        {
          Realm.GetInstance((RealmConfigurationBase) RealmUtils.RealmConfiguration).Dispose();
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (Initialize), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/AppStartLogic.cs", 55);
          flag2 = true;
        }
        if (flag1)
        {
          int num1 = await ((IMvxNavigationService) appStartLogic.NavigationService).Navigate<NeedUpdateViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
        }
        else if (flag2)
        {
          int num2 = await ((IMvxNavigationService) appStartLogic.NavigationService).Navigate<DatabaseErrorViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
        }
        else if (hint != null && hint is PushMessage pushMessage)
        {
          // ISSUE: variable of the null type
          __Null navigationService = appStartLogic.NavigationService;
          CancellationToken cancellationToken = new CancellationToken();
          int num3 = await ((IMvxNavigationService) navigationService).Navigate<MasterViewModel, PushMessage>((M1) pushMessage, (IMvxBundle) null, cancellationToken) ? 1 : 0;
        }
        else
        {
          int num4 = await ((IMvxNavigationService) appStartLogic.NavigationService).Navigate<MasterViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
        }
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (Initialize), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/AppStartLogic.cs", 84);
      }
    }

    private async Task<bool> CheckVersion()
    {
      return await this._appVersionService.NeedUpdateApp(this._systemInfo.Platform, CrossVersionTracking.get_Current().get_CurrentVersion(), CrossVersionTracking.get_Current().get_CurrentBuild());
    }
  }
}
