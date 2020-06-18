// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.TeacherRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  [Woven(typeof (TeacherRealm.RealmHelper))]
  [Preserve(true, false)]
  public class TeacherRealm : RealmObject, IReflectableType
  {
    [Preserve]
    public TeacherRealm()
    {
      base.\u002Ector();
    }

    public TeacherRealm(EmployeeRealm employee)
    {
      base.\u002Ector();
      this.Alkalmazott = employee;
    }

    [PrimaryKey]
    [Preserve]
    [WovenProperty]
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
    public EmployeeRealm Alkalmazott
    {
      get
      {
        return this.get_IsManaged() ? (EmployeeRealm) this.GetObjectValue<EmployeeRealm>(nameof (Alkalmazott)) : this.\u003CAlkalmazott\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CAlkalmazott\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Alkalmazott));
        }
        else
          this.SetObjectValue<EmployeeRealm>(nameof (Alkalmazott), (M0) value);
      }
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<TeacherRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new TeacherRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        TeacherRealm teacherRealm = (TeacherRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (teacherRealm.\u003CAlkalmazott\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          teacherRealm.get_Realm().Add<EmployeeRealm>((M0) teacherRealm.\u003CAlkalmazott\u003Ek__BackingField, update);
        }
        // ISSUE: reference to a compiler-generated field
        teacherRealm.Alkalmazott = teacherRealm.\u003CAlkalmazott\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        TeacherRealm teacherRealm = (TeacherRealm) instance;
        value = (object) teacherRealm.Uid;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
