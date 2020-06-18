// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.AppVersionService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Models.Service;
using Ekreta.Mobile.Core.Monitoring;
using MvvmCross;
using MvvmCross.Localization;
using Newtonsoft.Json;
using Plugin.VersionTracking;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Services
{
  public class AppVersionService : IAppVersionService
  {
    private readonly string _blob = ConfigurationRepository.EnvironmentSetting.AppVersionUrl;
    private const string defaultGDPRLink = "https://tudasbazis.ekreta.hu/pages/viewpage.action?pageId=4064926";
    private const string defaultAndroidMobileStoreUrl = "market://details?id=hu.eKreta.KretaAndroid";
    private const string defaultIOSMobileStoreUrl = "itms-apps://itunes.apple.com/hu/app/kr%C3%A9ta/id1169400318?l=hu&mt=8";
    private AppVersionData _data;

    public Task<bool> NeedUpdateApp(string platform, string version, string build)
    {
      bool result = false;
      Version appBuildVersion = new Version(version + "." + build);
      this.GetVersionData().GetAwaiter();
      if (this._data != null)
        result = Convert.ToInt64(build) < this._data.MinimumSupportedClientBuildNumber || this._data.BlacklistPlatformByMobileBuildVersion.Any<BlackListItem>((Func<BlackListItem, bool>) (x => x.MobileBuildVersions.Equals(appBuildVersion) && x.Platform.ToLower().Equals(platform.ToLower())));
      return Task.FromResult<bool>(result);
    }

    public string GetAppVersionDisplayText()
    {
      string str = ((IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>()).GetText((string) null, (string) null, "VersionNumber") + " " + CrossVersionTracking.get_Current().get_CurrentVersion() + " - " + CrossVersionTracking.get_Current().get_CurrentBuild();
      Ekreta.Mobile.Core.Models.Environments.Environments environment = ConfigurationRepository.EnvironmentSetting.Environment;
      if (environment != Ekreta.Mobile.Core.Models.Environments.Environments.PROD)
        str += string.Format(" {0}", (object) environment);
      return str;
    }

    public Task<bool> ShouldUpdateApp()
    {
      bool result = false;
      this.GetVersionData().GetAwaiter();
      if (this._data != null)
        result = this._data.LatestVersion > ConfigurationRepository.EnvironmentSetting.MobileApiVersion;
      return Task.FromResult<bool>(result);
    }

    public Task<string> GDPRLink()
    {
      string result = "https://tudasbazis.ekreta.hu/pages/viewpage.action?pageId=4064926";
      this.GetVersionData().GetAwaiter();
      if (this._data != null)
        result = this._data.GDPRLink;
      return Task.FromResult<string>(result);
    }

    public Task<DateTime?> GDPRUpdateDate()
    {
      DateTime? result = new DateTime?();
      this.GetVersionData().GetAwaiter();
      if (this._data != null)
        result = new DateTime?(this._data.GDPRUpdateDate);
      return Task.FromResult<DateTime?>(result);
    }

    public Task<string> AndroidMobileStoreUrl()
    {
      string result = "market://details?id=hu.eKreta.KretaAndroid";
      this.GetVersionData().GetAwaiter();
      if (this._data != null)
        result = this._data.AndroidMobileStoreUrl;
      return Task.FromResult<string>(result);
    }

    public Task<string> IOSMobileStoreUrl()
    {
      string result = "itms-apps://itunes.apple.com/hu/app/kr%C3%A9ta/id1169400318?l=hu&mt=8";
      this.GetVersionData().GetAwaiter();
      if (this._data != null)
        result = this._data.IOSMobileStoreUrl;
      return Task.FromResult<string>(result);
    }

    private Task GetVersionData()
    {
      try
      {
        if (this._data != null)
          return (Task) Task.FromResult<AppVersionData>(this._data);
        using (HttpClient httpClient = new HttpClient((HttpMessageHandler) HttpClientHelpers.GetClientHandler(true)))
          this._data = (AppVersionData) JsonConvert.DeserializeObject<AppVersionData>(httpClient.GetStringAsync(this._blob).GetAwaiter().GetResult());
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (GetVersionData), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/AppVersionService.cs", 146);
      }
      return (Task) Task.FromResult<AppVersionData>(this._data);
    }
  }
}
