// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.FormMasterRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  [Preserve(true, false)]
  [Woven(typeof (FormMasterRealm.RealmHelper))]
  public class FormMasterRealm : RealmObject, IReflectableType
  {
    [Preserve]
    public FormMasterRealm()
    {
      base.\u002Ector();
    }

    public FormMasterRealm(TeacherRealm teacher)
    {
      base.\u002Ector();
      this.Tanar = teacher;
    }

    [WovenProperty]
    [PrimaryKey]
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

    [WovenProperty]
    [Preserve]
    public TeacherRealm Tanar
    {
      get
      {
        return this.get_IsManaged() ? (TeacherRealm) this.GetObjectValue<TeacherRealm>(nameof (Tanar)) : this.\u003CTanar\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanar\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Tanar));
        }
        else
          this.SetObjectValue<TeacherRealm>(nameof (Tanar), (M0) value);
      }
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<FormMasterRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new FormMasterRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        FormMasterRealm formMasterRealm = (FormMasterRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (formMasterRealm.\u003CTanar\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          formMasterRealm.get_Realm().Add<TeacherRealm>((M0) formMasterRealm.\u003CTanar\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        formMasterRealm.Tanar = formMasterRealm.\u003CTanar\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        FormMasterRealm formMasterRealm = (FormMasterRealm) instance;
        value = (object) formMasterRealm.Uid;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
