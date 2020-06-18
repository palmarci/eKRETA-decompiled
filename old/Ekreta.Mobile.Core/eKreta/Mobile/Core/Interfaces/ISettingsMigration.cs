// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.ISettingsMigration
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Plugin.Settings.Abstractions;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface ISettingsMigration
  {
    int LatestVersion { get; }

    int Migrate(ISettings settings, ISecureStore secureStore, int currentVersion);
  }
}
