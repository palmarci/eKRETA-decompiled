// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Exam.ExamRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Exam
{
  [Woven(typeof (ExamRealm.RealmHelper))]
  [Preserve(true, false)]
  public class ExamRealm : RealmObject, IPrimaryKey, INewItem, IReflectableType
  {
    [Preserve]
    [Realms.PrimaryKey]
    [WovenProperty]
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
          this.SetStringValue(nameof (Uid), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public int ExamId
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (ExamId))) : this.\u003CExamId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CExamId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (ExamId));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (ExamId), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset Datum
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (Datum)) : this.\u003CDatum\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDatum\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Datum));
        }
        else
          this.SetDateTimeOffsetValue(nameof (Datum), value);
      }
    }

    [Ignored]
    public DateTime DatumLocal
    {
      get
      {
        return this.Datum.LocalDateTime;
      }
    }

    [WovenProperty]
    [Preserve]
    public string HetNapja
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (HetNapja)) : this.\u003CHetNapja\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CHetNapja\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (HetNapja));
        }
        else
          this.SetStringValue(nameof (HetNapja), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public int Oraszam
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (Oraszam))) : this.\u003COraszam\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COraszam\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Oraszam));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (Oraszam), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [WovenProperty]
    [Preserve]
    public string Tantargy
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Tantargy)) : this.\u003CTantargy\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTantargy\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Tantargy));
        }
        else
          this.SetStringValue(nameof (Tantargy), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Tanar
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Tanar)) : this.\u003CTanar\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTanar\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Tanar));
        }
        else
          this.SetStringValue(nameof (Tanar), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string SzamonkeresMegnevezese
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (SzamonkeresMegnevezese)) : this.\u003CSzamonkeresMegnevezese\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSzamonkeresMegnevezese\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SzamonkeresMegnevezese));
        }
        else
          this.SetStringValue(nameof (SzamonkeresMegnevezese), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string SzamonkeresModja
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (SzamonkeresModja)) : this.\u003CSzamonkeresModja\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSzamonkeresModja\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SzamonkeresModja));
        }
        else
          this.SetStringValue(nameof (SzamonkeresModja), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public DateTimeOffset BejelentesDatuma
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (BejelentesDatuma)) : this.\u003CBejelentesDatuma\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CBejelentesDatuma\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (BejelentesDatuma));
        }
        else
          this.SetDateTimeOffsetValue(nameof (BejelentesDatuma), value);
      }
    }

    [Ignored]
    public DateTime BejelentesDatumaLocal
    {
      get
      {
        return this.BejelentesDatuma.LocalDateTime;
      }
    }

    [WovenProperty]
    [Preserve]
    [Indexed]
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

    public string PrimaryKey
    {
      get
      {
        return this.Id;
      }
    }

    [Preserve]
    [WovenProperty]
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

    [Preserve]
    public ExamRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<ExamRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new ExamRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        ExamRealm examRealm = (ExamRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CUid\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.Uid = examRealm.\u003CUid\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CExamId\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.ExamId = examRealm.\u003CExamId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        examRealm.Datum = examRealm.\u003CDatum\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CHetNapja\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.HetNapja = examRealm.\u003CHetNapja\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003COraszam\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.Oraszam = examRealm.\u003COraszam\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CTantargy\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.Tantargy = examRealm.\u003CTantargy\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CTanar\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.Tanar = examRealm.\u003CTanar\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CSzamonkeresMegnevezese\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.SzamonkeresMegnevezese = examRealm.\u003CSzamonkeresMegnevezese\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CSzamonkeresModja\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.SzamonkeresModja = examRealm.\u003CSzamonkeresModja\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        examRealm.BejelentesDatuma = examRealm.\u003CBejelentesDatuma\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || examRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          examRealm.ProfileId = examRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && !examRealm.\u003CSeenByUser\u003Ek__BackingField)
          return;
        // ISSUE: explicit non-virtual call
        // ISSUE: reference to a compiler-generated field
        __nonvirtual (examRealm.SeenByUser) = examRealm.\u003CSeenByUser\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        ExamRealm examRealm = (ExamRealm) instance;
        value = (object) examRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
