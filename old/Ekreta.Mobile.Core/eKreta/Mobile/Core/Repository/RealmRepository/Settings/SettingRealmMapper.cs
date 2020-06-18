// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Settings.SettingRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Settings
{
  public class SettingRealmMapper : IRealmMapper<Setting, SettingRealm>, IMapper<Setting, SettingRealm>
  {
    public Setting From(SettingRealm item)
    {
      return new Setting()
      {
        Key = item.Key,
        Value = (object) item.Value
      };
    }

    public SettingRealm To(Setting item)
    {
      return new SettingRealm()
      {
        Key = item.Key,
        Value = item.Value.ToString()
      };
    }
  }
}
