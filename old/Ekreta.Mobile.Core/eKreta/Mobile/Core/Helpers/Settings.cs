// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Settings
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using MvvmCross;
using Newtonsoft.Json.Serialization;
using Plugin.Settings;
using Plugin.Settings.Abstractions;
using System;

namespace Ekreta.Mobile.Core.Helpers
{
  public class Settings : IApplicationSettings
  {
    private readonly ISettingsMigration _migration;
    private readonly ISecureStore _secureStore;

    public Settings()
    {
      this._migration = (ISettingsMigration) Mvx.get_IoCProvider().Resolve<ISettingsMigration>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this.Migrate();
    }

    private static ISettings AppSettings
    {
      get
      {
        return CrossSettings.get_Current();
      }
    }

    public string GeneralSettings
    {
      get
      {
        return Ekreta.Mobile.Core.Helpers.Settings.AppSettings.GetValueOrDefault("settings_key", SettingsConstants.SettingsDefault, (string) null);
      }
      set
      {
        Ekreta.Mobile.Core.Helpers.Settings.AppSettings.AddOrUpdateValue("settings_key", value, (string) null);
      }
    }

    public static Ekreta.Mobile.Core.Models.Environments.Environments Environment
    {
      get
      {
        return (Ekreta.Mobile.Core.Models.Environments.Environments) Enum.Parse(typeof (Ekreta.Mobile.Core.Models.Environments.Environments), Ekreta.Mobile.Core.Helpers.Settings.AppSettings.GetValueOrDefault("settings_environment_key", "PROD", (string) null));
      }
      set
      {
        Ekreta.Mobile.Core.Helpers.Settings.AppSettings.AddOrUpdateValue("settings_environment_key", value.ToString(), (string) null);
      }
    }

    public bool RefreshProfileInProgress
    {
      get
      {
        return Ekreta.Mobile.Core.Helpers.Settings.AppSettings.GetValueOrDefault(nameof (RefreshProfileInProgress), false, (string) null);
      }
      set
      {
        Ekreta.Mobile.Core.Helpers.Settings.AppSettings.AddOrUpdateValue(nameof (RefreshProfileInProgress), value, (string) null);
      }
    }

    public void HandleDeserializationError(object sender, ErrorEventArgs errorArgs)
    {
      errorArgs.get_ErrorContext().set_Handled(true);
    }

    public int MigrationVersion
    {
      get
      {
        return Ekreta.Mobile.Core.Helpers.Settings.AppSettings.GetValueOrDefault(nameof (MigrationVersion), this._migration.LatestVersion, (string) null);
      }
      set
      {
        Ekreta.Mobile.Core.Helpers.Settings.AppSettings.AddOrUpdateValue(nameof (MigrationVersion), value, (string) null);
      }
    }

    public void Clear()
    {
      if (Ekreta.Mobile.Core.Helpers.Settings.AppSettings == null)
        return;
      Ekreta.Mobile.Core.Helpers.Settings.AppSettings.Clear((string) null);
    }

    public static void Reset()
    {
      Ekreta.Mobile.Core.Helpers.Settings.AppSettings.Clear((string) null);
    }

    public void Migrate()
    {
      this.MigrationVersion = this._migration.Migrate(Ekreta.Mobile.Core.Helpers.Settings.AppSettings, this._secureStore, this.MigrationVersion);
    }
  }
}
