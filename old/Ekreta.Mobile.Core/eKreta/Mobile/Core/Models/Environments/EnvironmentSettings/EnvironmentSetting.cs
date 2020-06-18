// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings.EnvironmentSetting
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

namespace Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings
{
  public class EnvironmentSetting
  {
    public Ekreta.Mobile.Core.Models.Environments.Environments Environment { get; set; }

    public string GlobalMobileApiUrl { get; set; }

    public string ConfigurationServiceApiKey { get; set; }

    public string GoogleAnalyticsTrackingId { get; set; }

    public string MobileApiAudienceClientId { get; set; }

    public string HockeyAppAndroidAppId { get; set; }

    public string HockeyAppiOSAppId { get; set; }

    public int CacheTimeoutInSeconds { get; set; }

    public int HttpTimeoutInSeconds { get; internal set; }

    public int MobileApiVersion { get; set; }

    public string AppVersionUrl { get; set; }

    public string DefaultUserAgentHeader { get; set; }

    public string EugyintezesAPIUrl { get; set; }

    public string RatingEmail { get; set; }
  }
}
