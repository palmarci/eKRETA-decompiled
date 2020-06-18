// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Migration
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers.Migrations;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Monitoring;
using Plugin.Settings.Abstractions;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Helpers
{
  internal class Migration : ISettingsMigration
  {
    private readonly List<Func<int>> _actions = new List<Func<int>>();
    private ISettings _settings;
    private ISecureStore _secureStore;
    private int _currentVersion;

    int ISettingsMigration.LatestVersion
    {
      get
      {
        return 10;
      }
    }

    public Migration()
    {
      this._actions.Add((Func<int>) null);
      this._actions.Add((Func<int>) null);
      this._actions.Add(new Func<int>(this.Migrate<Migration002>));
      this._actions.Add(new Func<int>(this.Migrate<Migration003>));
      this._actions.Add(new Func<int>(this.Migrate<Migration004>));
      this._actions.Add(new Func<int>(this.Migrate<Migration005>));
      this._actions.Add(new Func<int>(this.Migrate<Migration006>));
      this._actions.Add(new Func<int>(this.Migrate<Migration007>));
      this._actions.Add(new Func<int>(this.Migrate<Migration008>));
      this._actions.Add(new Func<int>(this.Migrate<Migration009>));
      this._actions.Add(new Func<int>(this.Migrate<Migration010>));
    }

    public int Migrate(ISettings settings, ISecureStore secureStore, int currentVersion)
    {
      this._settings = settings;
      this._secureStore = secureStore;
      this._currentVersion = currentVersion;
      while (this._currentVersion < this._actions.Count - 2)
      {
        try
        {
          this._currentVersion = this._actions[this._currentVersion + 2]();
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (Migrate), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/Migration.cs", 57);
        }
      }
      return this._currentVersion;
    }

    private int Migrate<MigrationClass>()
    {
      try
      {
        if (Activator.CreateInstance<MigrationClass>() is MigrationBase instance)
          instance.Migrate(this._settings, this._secureStore);
        return this._currentVersion++;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (Migrate), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/Migration.cs", 76);
        this._settings.Clear((string) null);
      }
      return this._currentVersion;
    }
  }
}
