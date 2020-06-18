// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Migrations.Migration007
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Newtonsoft.Json;
using Plugin.Settings.Abstractions;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Helpers.Migrations
{
  public class Migration007 : MigrationBase
  {
    internal override void Migrate(ISettings appSettings, ISecureStore secureStore = null)
    {
      string valueOrDefault = appSettings.GetValueOrDefault("settings_profiles_key", (string) null, (string) null);
      foreach (Profile profile in string.IsNullOrEmpty(valueOrDefault) ? (IEnumerable<Profile>) new List<Profile>() : (IEnumerable<Profile>) JsonConvert.DeserializeObject<IEnumerable<Profile>>(valueOrDefault))
      {
        if (profile.IsActive)
        {
          appSettings.AddOrUpdateValue("settings_active_profile_guid", profile.Id.ToString(), (string) null);
          break;
        }
      }
    }
  }
}
