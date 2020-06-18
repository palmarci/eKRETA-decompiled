// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Csatolmany.CsatolmanyRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Csatolmany
{
  [Preserve(true, false)]
  [Woven(typeof (CsatolmanyRealm.RealmHelper))]
  public class CsatolmanyRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Preserve]
    [Realms.PrimaryKey]
    [WovenProperty]
    public string Azonosito
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Azonosito)) : this.\u003CAzonosito\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CAzonosito\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Azonosito));
        }
        else
          this.SetStringValueUnique(nameof (Azonosito), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string FajlNev
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (FajlNev)) : this.\u003CFajlNev\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CFajlNev\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (FajlNev));
        }
        else
          this.SetStringValue(nameof (FajlNev), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.Azonosito;
      }
    }

    [Preserve]
    public CsatolmanyRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<CsatolmanyRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new CsatolmanyRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        CsatolmanyRealm csatolmanyRealm = (CsatolmanyRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && csatolmanyRealm.\u003CFajlNev\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        csatolmanyRealm.FajlNev = csatolmanyRealm.\u003CFajlNev\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        CsatolmanyRealm csatolmanyRealm = (CsatolmanyRealm) instance;
        value = (object) csatolmanyRealm.Azonosito;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
