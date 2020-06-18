// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Institute.FeatureToggleSet
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Institute
{
  [Woven(typeof (FeatureToggleSet.RealmHelper))]
  [Preserve(true, false)]
  public class FeatureToggleSet : RealmObject, IReflectableType
  {
    [Preserve]
    [WovenProperty]
    public bool JustificationFeatureEnabled
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (JustificationFeatureEnabled)) : this.\u003CJustificationFeatureEnabled\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CJustificationFeatureEnabled\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (JustificationFeatureEnabled));
        }
        else
          this.SetBooleanValue(nameof (JustificationFeatureEnabled), value);
      }
    }

    [Preserve]
    public FeatureToggleSet()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<FeatureToggleSet>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new FeatureToggleSet();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        FeatureToggleSet featureToggleSet = (FeatureToggleSet) instance;
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !featureToggleSet.\u003CJustificationFeatureEnabled\u003Ek__BackingField)
          return;
        // ISSUE: reference to a compiler-generated field
        featureToggleSet.JustificationFeatureEnabled = featureToggleSet.\u003CJustificationFeatureEnabled\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        value = (object) null;
        return false;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
