// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem.PostaladaElemRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElemTipusAdatSzotarElem;
using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem
{
  [Preserve(true, false)]
  [Woven(typeof (PostaladaElemRealm.RealmHelper))]
  public class PostaladaElemRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Realms.PrimaryKey]
    [Preserve]
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

    [WovenProperty]
    [Preserve]
    public bool IsElolvasva
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsElolvasva)) : this.\u003CIsElolvasva\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsElolvasva\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsElolvasva));
        }
        else
          this.SetBooleanValue(nameof (IsElolvasva), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool IsToroltElem
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (IsToroltElem)) : this.\u003CIsToroltElem\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CIsToroltElem\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (IsToroltElem));
        }
        else
          this.SetBooleanValue(nameof (IsToroltElem), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public PostaladaElemTipusAdatSzotarElemRealm Tipus
    {
      get
      {
        return this.get_IsManaged() ? (PostaladaElemTipusAdatSzotarElemRealm) this.GetObjectValue<PostaladaElemTipusAdatSzotarElemRealm>(nameof (Tipus)) : this.\u003CTipus\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTipus\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Tipus));
        }
        else
          this.SetObjectValue<PostaladaElemTipusAdatSzotarElemRealm>(nameof (Tipus), (M0) value);
      }
    }

    [WovenProperty]
    [Preserve]
    public UzenetRealm Uzenet
    {
      get
      {
        return this.get_IsManaged() ? (UzenetRealm) this.GetObjectValue<UzenetRealm>(nameof (Uzenet)) : this.\u003CUzenet\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CUzenet\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Uzenet));
        }
        else
          this.SetObjectValue<UzenetRealm>(nameof (Uzenet), (M0) value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string ProfileId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (ProfileId)) : this.\u003CProfileId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CProfileId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ProfileId));
        }
        else
          this.SetStringValue(nameof (ProfileId), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public bool SeenByUser
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (SeenByUser)) : this.\u003CSeenByUser\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSeenByUser\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SeenByUser));
        }
        else
          this.SetBooleanValue(nameof (SeenByUser), value);
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
    public PostaladaElemRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<PostaladaElemRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new PostaladaElemRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        PostaladaElemRealm postaladaElemRealm = (PostaladaElemRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || postaladaElemRealm.\u003CIsElolvasva\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          postaladaElemRealm.IsElolvasva = postaladaElemRealm.\u003CIsElolvasva\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || postaladaElemRealm.\u003CIsToroltElem\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          postaladaElemRealm.IsToroltElem = postaladaElemRealm.\u003CIsToroltElem\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (postaladaElemRealm.\u003CTipus\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          postaladaElemRealm.get_Realm().Add<PostaladaElemTipusAdatSzotarElemRealm>((M0) postaladaElemRealm.\u003CTipus\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        postaladaElemRealm.Tipus = postaladaElemRealm.\u003CTipus\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (postaladaElemRealm.\u003CUzenet\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          postaladaElemRealm.get_Realm().Add<UzenetRealm>((M0) postaladaElemRealm.\u003CUzenet\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        postaladaElemRealm.Uzenet = postaladaElemRealm.\u003CUzenet\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || postaladaElemRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          postaladaElemRealm.ProfileId = postaladaElemRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !postaladaElemRealm.\u003CSeenByUser\u003Ek__BackingField)
          return;
        // ISSUE: reference to a compiler-generated field
        postaladaElemRealm.SeenByUser = postaladaElemRealm.\u003CSeenByUser\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        PostaladaElemRealm postaladaElemRealm = (PostaladaElemRealm) instance;
        value = (object) postaladaElemRealm.Azonosito;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
