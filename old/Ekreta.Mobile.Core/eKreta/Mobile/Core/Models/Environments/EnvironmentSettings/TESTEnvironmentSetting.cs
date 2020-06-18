// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings.TESTEnvironmentSetting
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Plugin.VersionTracking;

namespace Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings
{
  public class TESTEnvironmentSetting : EnvironmentSetting
  {
    public TESTEnvironmentSetting()
    {
      this.Environment = Ekreta.Mobile.Core.Models.Environments.Environments.TEST;
      this.ConfigurationServiceApiKey = "c9f72983-a6c6-44d5-ab21-40d80b087366";
      this.MobileApiAudienceClientId = "4596201c-ec1c-4df7-99c0-940d035946c8";
      this.GoogleAnalyticsTrackingId = "UA-97112613-2";
      this.HockeyAppAndroidAppId = "58014eafdeb146c69f72ab1bc6e0fecc";
      this.HockeyAppiOSAppId = "26f6d56f30d84b079f7b654bfa9b1d46";
      this.CacheTimeoutInSeconds = 300;
      this.HttpTimeoutInSeconds = 60;
      this.MobileApiVersion = 0;
      this.AppVersionUrl = "https://kretamobile.blob.core.windows.net/configuration/EllenorzoMobilVersionInfo.json";
      this.DefaultUserAgentHeader = "Kreta.Ellenorzo/" + CrossVersionTracking.get_Current().get_CurrentVersion() + "." + CrossVersionTracking.get_Current().get_CurrentBuild();
      this.EugyintezesAPIUrl = "https://eugyintezes.ekreta-mobil.hu";
      this.RatingEmail = "kesztyus.imre@ekreta.hu";
    }
  }
}
