// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.NeedUpdateViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using MvvmCross.Commands;
using System;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class NeedUpdateViewModel : ViewModelBase
  {
    private const string iOSPlatform = "iOS";
    private readonly IWebNavigation _webNavigation;
    private readonly IAppVersionService _appVersionService;
    private readonly ISystemInfo _systemInfo;
    private MvxCommand _updateCommand;

    public NeedUpdateViewModel(
      ISystemInfo systemInfo,
      IWebNavigation webNvigation,
      IAppVersionService appVersionService)
    {
      this._systemInfo = systemInfo;
      this._webNavigation = webNvigation;
      this._appVersionService = appVersionService;
    }

    public string StoreUrl { get; private set; }

    public MvxCommand UpdateCommand
    {
      get
      {
        return this._updateCommand ?? (this._updateCommand = new MvxCommand(new Action(this.ExecuteUpdateCommand)));
      }
    }

    public virtual async Task Initialize()
    {
      // ISSUE: reference to a compiler-generated method
      await this.\u003C\u003En__0();
      string str;
      if (this._systemInfo.Platform == "iOS")
        str = await this._appVersionService.IOSMobileStoreUrl();
      else
        str = await this._appVersionService.AndroidMobileStoreUrl();
      this.StoreUrl = str;
    }

    private void ExecuteUpdateCommand()
    {
      this._webNavigation.OpenUrl(this.StoreUrl);
    }
  }
}
