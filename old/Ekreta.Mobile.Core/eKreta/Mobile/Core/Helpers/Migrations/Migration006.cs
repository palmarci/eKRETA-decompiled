// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Migrations.Migration006
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Plugin.Settings.Abstractions;

namespace Ekreta.Mobile.Core.Helpers.Migrations
{
  public class Migration006 : MigrationBase
  {
    internal override void Migrate(ISettings appSettings, ISecureStore secureStore = null)
    {
      new Migration005().Migrate(appSettings, secureStore);
    }
  }
}
