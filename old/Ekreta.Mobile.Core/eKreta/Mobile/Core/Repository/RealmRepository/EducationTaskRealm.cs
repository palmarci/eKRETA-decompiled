// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.EducationTaskRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  [Woven(typeof (EducationTaskRealm.RealmHelper))]
  [Preserve(true, false)]
  public class EducationTaskRealm : RealmObject, IReflectableType
  {
    [PrimaryKey]
    [WovenProperty]
    [Preserve]
    public string Uid
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Uid)) : this.\u003CUid\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CUid\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Uid));
        }
        else
          this.SetStringValueUnique(nameof (Uid), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Leiras
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Leiras)) : this.\u003CLeiras\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CLeiras\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Leiras));
        }
        else
          this.SetStringValue(nameof (Leiras), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Nev
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Nev)) : this.\u003CNev\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CNev\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Nev));
        }
        else
          this.SetStringValue(nameof (Nev), value);
      }
    }

    [Preserve]
    public EducationTaskRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<EducationTaskRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new EducationTaskRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        EducationTaskRealm educationTaskRealm = (EducationTaskRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || educationTaskRealm.\u003CLeiras\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          educationTaskRealm.Leiras = educationTaskRealm.\u003CLeiras\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && educationTaskRealm.\u003CNev\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        educationTaskRealm.Nev = educationTaskRealm.\u003CNev\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        EducationTaskRealm educationTaskRealm = (EducationTaskRealm) instance;
        value = (object) educationTaskRealm.Uid;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
