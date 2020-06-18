// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings.PRODEnvironmentSetting
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Plugin.VersionTracking;

namespace Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings
{
  public class PRODEnvironmentSetting : EnvironmentSetting
  {
    public PRODEnvironmentSetting()
    {
      this.Environment = Ekreta.Mobile.Core.Models.Environments.Environments.PROD;
      this.ConfigurationServiceApiKey = "7856d350-1fda-45f5-822d-e1a2f3f1acf0";
      this.MobileApiAudienceClientId = "919e0c1c-76a2-4646-a2fb-7085bbbf3c56";
      this.GoogleAnalyticsTrackingId = "UA-110150737-1";
      this.HockeyAppAndroidAppId = "58014eafdeb146c69f72ab1bc6e0fecc";
      this.HockeyAppiOSAppId = "26f6d56f30d84b079f7b654bfa9b1d46";
      this.CacheTimeoutInSeconds = 300;
      this.HttpTimeoutInSeconds = 60;
      this.MobileApiVersion = 0;
      this.AppVersionUrl = "https://kretamobile.blob.core.windows.net/configuration/EllenorzoMobilVersionInfo.json";
      this.DefaultUserAgentHeader = "Kreta.Ellenorzo/" + CrossVersionTracking.get_Current().get_CurrentVersion() + "." + CrossVersionTracking.get_Current().get_CurrentBuild();
      this.EugyintezesAPIUrl = "https://eugyintezes.e-kreta.hu";
      this.RatingEmail = "ugyfelszolgalat@ekreta.hu";
    }
  }
}
