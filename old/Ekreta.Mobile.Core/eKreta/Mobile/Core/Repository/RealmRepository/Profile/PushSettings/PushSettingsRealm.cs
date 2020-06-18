// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings.PushSettingsRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings
{
  [Woven(typeof (PushSettingsRealm.RealmHelper))]
  [Preserve(true, false)]
  public class PushSettingsRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Realms.PrimaryKey]
    [Preserve]
    [WovenProperty]
    public string RegistrationId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (RegistrationId)) : this.\u003CRegistrationId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CRegistrationId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (RegistrationId));
        }
        else
          this.SetStringValueUnique(nameof (RegistrationId), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public int NotificationTypes
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (NotificationTypes))) : this.\u003CNotificationTypes\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CNotificationTypes\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (NotificationTypes));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (NotificationTypes), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public string Token
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Token)) : this.\u003CToken\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CToken\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Token));
        }
        else
          this.SetStringValue(nameof (Token), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool FirstTimePushRun
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (FirstTimePushRun)) : this.\u003CFirstTimePushRun\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFirstTimePushRun\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FirstTimePushRun));
        }
        else
          this.SetBooleanValue(nameof (FirstTimePushRun), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool UpdateEugyintezes
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (UpdateEugyintezes)) : this.\u003CUpdateEugyintezes\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CUpdateEugyintezes\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (UpdateEugyintezes));
        }
        else
          this.SetBooleanValue(nameof (UpdateEugyintezes), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.RegistrationId;
      }
    }

    [Ignored]
    public bool IsPushActive
    {
      get
      {
        return !string.IsNullOrEmpty(this.RegistrationId);
      }
    }

    [Preserve]
    public PushSettingsRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<PushSettingsRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new PushSettingsRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        PushSettingsRealm pushSettingsRealm = (PushSettingsRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || pushSettingsRealm.\u003CNotificationTypes\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          pushSettingsRealm.NotificationTypes = pushSettingsRealm.\u003CNotificationTypes\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || pushSettingsRealm.\u003CToken\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          pushSettingsRealm.Token = pushSettingsRealm.\u003CToken\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || pushSettingsRealm.\u003CFirstTimePushRun\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          pushSettingsRealm.FirstTimePushRun = pushSettingsRealm.\u003CFirstTimePushRun\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !pushSettingsRealm.\u003CUpdateEugyintezes\u003Ek__BackingField)
          return;
        // ISSUE: reference to a compiler-generated field
        pushSettingsRealm.UpdateEugyintezes = pushSettingsRealm.\u003CUpdateEugyintezes\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        PushSettingsRealm pushSettingsRealm = (PushSettingsRealm) instance;
        value = (object) pushSettingsRealm.RegistrationId;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
