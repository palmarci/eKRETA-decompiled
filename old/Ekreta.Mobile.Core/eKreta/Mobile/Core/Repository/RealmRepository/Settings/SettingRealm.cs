// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Settings.SettingRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Settings
{
  [Woven(typeof (SettingRealm.RealmHelper))]
  [Preserve(true, false)]
  public class SettingRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [WovenProperty]
    [Preserve]
    [Realms.PrimaryKey]
    public string Key
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Key)) : this.\u003CKey\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CKey\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Key));
        }
        else
          this.SetStringValueUnique(nameof (Key), value);
      }
    }

    [Indexed]
    [Preserve]
    [WovenProperty]
    public string Value
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Value)) : this.\u003CValue\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CValue\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Value));
        }
        else
          this.SetStringValue(nameof (Value), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.Key;
      }
    }

    [Preserve]
    public SettingRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<SettingRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new SettingRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        SettingRealm settingRealm = (SettingRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && settingRealm.\u003CValue\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        settingRealm.Value = settingRealm.\u003CValue\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        SettingRealm settingRealm = (SettingRealm) instance;
        value = (object) settingRealm.Key;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
