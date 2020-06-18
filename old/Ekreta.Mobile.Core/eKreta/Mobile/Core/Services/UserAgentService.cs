// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.UserAgentService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using Plugin.DeviceInfo;
using System.Text.RegularExpressions;

namespace Ekreta.Mobile.Core.Services
{
  public class UserAgentService : IUserAgentService
  {
    private const string ApplicationName = "Kreta.Ellenorzo";
    private ISettingsDataService _settingsDataService;
    private UserAgent _userAgent;

    public UserAgentService()
    {
      this._settingsDataService = (ISettingsDataService) Mvx.get_IoCProvider().Resolve<ISettingsDataService>();
    }

    public UserAgent UserAgent
    {
      get
      {
        if (this._userAgent == null)
          this._userAgent = new UserAgent()
          {
            AppName = "Kreta.Ellenorzo",
            AppVersion = CrossDeviceInfo.get_Current().get_AppVersion() ?? "",
            BuildNumber = CrossDeviceInfo.get_Current().get_AppBuild() ?? "",
            ModelVersion = CrossDeviceInfo.get_Current().get_DeviceName() ?? "",
            PlatformVersion = CrossDeviceInfo.get_Current().get_Platform().ToString() ?? "",
            VersionNumber = string.Format("{0}", (object) CrossDeviceInfo.get_Current().get_VersionNumber())
          };
        return this._userAgent;
      }
    }

    public string UserAgentText
    {
      get
      {
        try
        {
          string text = Regex.Replace((this.UserAgent.AppName + "/" + this.UserAgent.AppVersion + "." + this.UserAgent.BuildNumber + " (" + this.UserAgent.PlatformVersion + "; " + this.UserAgent.ModelVersion + " " + this.UserAgent.VersionNumber + ")").Englified(), "[^\\u0020-\\u007E]", string.Empty);
          this._settingsDataService.SetUserAgentText(text);
          return text;
        }
        catch
        {
          return this._settingsDataService.GetUserAgentText();
        }
      }
    }
  }
}
