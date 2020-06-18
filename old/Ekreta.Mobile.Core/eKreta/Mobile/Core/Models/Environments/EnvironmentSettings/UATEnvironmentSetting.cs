// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings.UATEnvironmentSetting
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Plugin.VersionTracking;

namespace Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings
{
  public class UATEnvironmentSetting : EnvironmentSetting
  {
    public UATEnvironmentSetting()
    {
      this.Environment = Ekreta.Mobile.Core.Models.Environments.Environments.UAT;
      this.ConfigurationServiceApiKey = "34b347b2-bd69-4e4f-aef3-6709cf109e5b";
      this.MobileApiAudienceClientId = "69bfdce9-2c9f-4a12-aa7b-4fe15e1228dc";
      this.GoogleAnalyticsTrackingId = "UA-97112613-2";
      this.HockeyAppAndroidAppId = "58014eafdeb146c69f72ab1bc6e0fecc";
      this.HockeyAppiOSAppId = "26f6d56f30d84b079f7b654bfa9b1d46";
      this.CacheTimeoutInSeconds = 0;
      this.HttpTimeoutInSeconds = 60;
      this.MobileApiVersion = 0;
      this.AppVersionUrl = "https://kretamobile.blob.core.windows.net/configuration/EllenorzoMobilVersionInfo.json";
      this.DefaultUserAgentHeader = "Kreta.Ellenorzo/" + CrossVersionTracking.get_Current().get_CurrentVersion() + "." + CrossVersionTracking.get_Current().get_CurrentBuild();
      this.EugyintezesAPIUrl = "https://eugyintezes.mobil-fe.ekreta-dev.hu";
      this.RatingEmail = "kesztyus.imre@ekreta.hu";
    }
  }
}
