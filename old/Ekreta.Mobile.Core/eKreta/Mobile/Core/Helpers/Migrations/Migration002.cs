// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Migrations.Migration002
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Newtonsoft.Json;
using Newtonsoft.Json.Serialization;
using Plugin.Settings.Abstractions;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Helpers.Migrations
{
  public class Migration002 : MigrationBase
  {
    internal override void Migrate(ISettings appSettings, ISecureStore secureStore = null)
    {
      JsonSerializerSettings serializerSettings1 = new JsonSerializerSettings();
      serializerSettings1.set_Error((EventHandler<ErrorEventArgs>) ((sender, args) => args.get_ErrorContext().set_Handled(true)));
      JsonSerializerSettings serializerSettings2 = serializerSettings1;
      string valueOrDefault = appSettings.GetValueOrDefault("settings_profiles_key", (string) null, (string) null);
      IEnumerable<Profile> profiles = string.IsNullOrEmpty(valueOrDefault) ? (IEnumerable<Profile>) new List<Profile>() : (IEnumerable<Profile>) JsonConvert.DeserializeObject<IEnumerable<Profile>>(valueOrDefault, serializerSettings2);
      appSettings.AddOrUpdateValue("settings_profiles_key", JsonConvert.SerializeObject((object) profiles), (string) null);
    }
  }
}
