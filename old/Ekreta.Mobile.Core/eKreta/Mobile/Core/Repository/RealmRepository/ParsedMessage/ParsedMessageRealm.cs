// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.ParsedMessage.ParsedMessageRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.ParsedMessage
{
  [Woven(typeof (ParsedMessageRealm.RealmHelper))]
  [Preserve(true, false)]
  public class ParsedMessageRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [WovenProperty]
    [Realms.PrimaryKey]
    [Preserve]
    public string Id
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Id)) : this.\u003CId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Id));
        }
        else
          this.SetStringValueUnique(nameof (Id), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.Id;
      }
    }

    [Preserve]
    public ParsedMessageRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<ParsedMessageRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new ParsedMessageRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        ParsedMessageRealm parsedMessageRealm = (ParsedMessageRealm) instance;
        value = (object) parsedMessageRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
