// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation.EvaluationNatureRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation
{
  [Preserve(true, false)]
  [Woven(typeof (EvaluationNatureRealm.RealmHelper))]
  public class EvaluationNatureRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Realms.PrimaryKey]
    [WovenProperty]
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

    [WovenProperty]
    [Preserve]
    public string Name
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Name)) : this.\u003CName\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CName\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Name));
        }
        else
          this.SetStringValue(nameof (Name), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Description
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Description)) : this.\u003CDescription\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDescription\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Description));
        }
        else
          this.SetStringValue(nameof (Description), value);
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
    public EvaluationNatureRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<EvaluationNatureRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new EvaluationNatureRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        EvaluationNatureRealm evaluationNatureRealm = (EvaluationNatureRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || evaluationNatureRealm.\u003CName\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          evaluationNatureRealm.Name = evaluationNatureRealm.\u003CName\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && evaluationNatureRealm.\u003CDescription\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        evaluationNatureRealm.Description = evaluationNatureRealm.\u003CDescription\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        EvaluationNatureRealm evaluationNatureRealm = (EvaluationNatureRealm) instance;
        value = (object) evaluationNatureRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
