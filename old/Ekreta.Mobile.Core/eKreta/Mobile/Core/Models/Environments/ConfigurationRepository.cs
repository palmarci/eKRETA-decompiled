// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Environments.ConfigurationRepository
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.Environments.EnvironmentSettings;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models.Environments
{
  public static class ConfigurationRepository
  {
    private static readonly string ENVIRONMENT_PROTOCOL = string.Format("{0}://", (object) "ekreta");
    public const string ENVIRONMENT_PROTOCOL_NAME = "ekreta";
    private static Dictionary<Ekreta.Mobile.Core.Models.Environments.Environments, EnvironmentSetting> _settings;

    static ConfigurationRepository()
    {
      ConfigurationRepository.RegisterSettings();
      ConfigurationRepository.SetEnvironment((string) null);
    }

    private static void RegisterSettings()
    {
      ConfigurationRepository._settings = new Dictionary<Ekreta.Mobile.Core.Models.Environments.Environments, EnvironmentSetting>();
      ConfigurationRepository._settings.Add(Ekreta.Mobile.Core.Models.Environments.Environments.PROD, (EnvironmentSetting) new PRODEnvironmentSetting());
      ConfigurationRepository._settings.Add(Ekreta.Mobile.Core.Models.Environments.Environments.UAT, (EnvironmentSetting) new UATEnvironmentSetting());
      ConfigurationRepository._settings.Add(Ekreta.Mobile.Core.Models.Environments.Environments.TEST, (EnvironmentSetting) new TESTEnvironmentSetting());
      ConfigurationRepository._settings.Add(Ekreta.Mobile.Core.Models.Environments.Environments.DEV, (EnvironmentSetting) new DEVEnvironmentSetting());
    }

    public static EnvironmentSetting EnvironmentSetting { get; private set; }

    public static void SetEnvironment(string targetUrl = null)
    {
      if (!string.IsNullOrEmpty(targetUrl) && targetUrl.Contains(ConfigurationRepository.ENVIRONMENT_PROTOCOL))
      {
        Ekreta.Mobile.Core.Models.Environments.Environments result;
        if (!Enum.TryParse<Ekreta.Mobile.Core.Models.Environments.Environments>(targetUrl.TrimStart(ConfigurationRepository.ENVIRONMENT_PROTOCOL.ToCharArray()), out result))
          return;
        ConfigurationRepository.EnvironmentSetting = ConfigurationRepository._settings[result];
      }
      else
        ConfigurationRepository.EnvironmentSetting = ConfigurationRepository._settings[Ekreta.Mobile.Core.Models.Environments.Environments.PROD];
    }
  }
}
