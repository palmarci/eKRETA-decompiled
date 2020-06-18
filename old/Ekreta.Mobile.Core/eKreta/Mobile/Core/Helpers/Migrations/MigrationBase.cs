// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Migrations.MigrationBase
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Newtonsoft.Json;
using Plugin.Settings.Abstractions;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Helpers.Migrations
{
  public abstract class MigrationBase
  {
    internal abstract void Migrate(ISettings appSettings, ISecureStore secureStore = null);

    protected IEnumerable<T> GetEntities<T>(ISettings appSettings)
    {
      string valueOrDefault = appSettings.GetValueOrDefault("settings_profiles_key", (string) null, (string) null);
      return !string.IsNullOrEmpty(valueOrDefault) ? (IEnumerable<T>) JsonConvert.DeserializeObject<IEnumerable<T>>(valueOrDefault) : (IEnumerable<T>) new List<T>();
    }
  }
}
