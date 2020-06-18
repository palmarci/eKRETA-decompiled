// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Note.NoteRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Realms;
using Realms.Weaving;
using System;
using System.Reflection;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Note
{
  [Preserve(true, false)]
  [Woven(typeof (NoteRealm.RealmHelper))]
  public class NoteRealm : RealmObject, IPrimaryKey, INewItem, IHaveContentString, IReflectableType
  {
    [Preserve]
    [WovenProperty]
    [Realms.PrimaryKey]
    public string PrimaryId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (PrimaryId)) : this.\u003CPrimaryId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CPrimaryId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (PrimaryId));
        }
        else
          this.SetStringValueUnique(nameof (PrimaryId), value);
      }
    }

    [Preserve]
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
          this.SetStringValue(nameof (Id), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Type
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Type)) : this.\u003CType\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CType\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Type));
        }
        else
          this.SetStringValue(nameof (Type), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Title
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Title)) : this.\u003CTitle\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTitle\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Title));
        }
        else
          this.SetStringValue(nameof (Title), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Content
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Content)) : this.\u003CContent\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CContent\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Content));
        }
        else
          this.SetStringValue(nameof (Content), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public string Teacher
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Teacher)) : this.\u003CTeacher\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CTeacher\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Teacher));
        }
        else
          this.SetStringValue(nameof (Teacher), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset Date
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (Date)) : this.\u003CDate\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDate\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Date));
        }
        else
          this.SetDateTimeOffsetValue(nameof (Date), value);
      }
    }

    [Ignored]
    public DateTime DateLocal
    {
      get
      {
        return this.Date.LocalDateTime;
      }
    }

    [WovenProperty]
    [Preserve]
    public DateTimeOffset CreatingTime
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (CreatingTime)) : this.\u003CCreatingTime\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCreatingTime\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (CreatingTime));
        }
        else
          this.SetDateTimeOffsetValue(nameof (CreatingTime), value);
      }
    }

    [Ignored]
    public DateTime CreatingTimeLocal
    {
      get
      {
        return this.CreatingTime.LocalDateTime;
      }
    }

    [Preserve]
    [WovenProperty]
    public string OsztalyCsoportUid
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (OsztalyCsoportUid)) : this.\u003COsztalyCsoportUid\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003COsztalyCsoportUid\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (OsztalyCsoportUid));
        }
        else
          this.SetStringValue(nameof (OsztalyCsoportUid), value);
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

    [Indexed]
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

    [Indexed]
    [Preserve]
    [WovenProperty]
    public DateTimeOffset CreatedDate
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (CreatedDate)) : this.\u003CCreatedDate\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CCreatedDate\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (CreatedDate));
        }
        else
          this.SetDateTimeOffsetValue(nameof (CreatedDate), value);
      }
    }

    public string PrimaryKey
    {
      get
      {
        return this.PrimaryId;
      }
    }

    [Ignored]
    public HtmlWebViewSource WebViewSource
    {
      get
      {
        return this.GetHtmlWebViewSource();
      }
    }

    [Preserve]
    public NoteRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<NoteRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new NoteRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        NoteRealm noteRealm = (NoteRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003CId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          noteRealm.Id = noteRealm.\u003CId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003CType\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          noteRealm.Type = noteRealm.\u003CType\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003CTitle\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          noteRealm.Title = noteRealm.\u003CTitle\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003CContent\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          noteRealm.Content = noteRealm.\u003CContent\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003CTeacher\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          noteRealm.Teacher = noteRealm.\u003CTeacher\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        noteRealm.Date = noteRealm.\u003CDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        noteRealm.CreatingTime = noteRealm.\u003CCreatingTime\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003COsztalyCsoportUid\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          noteRealm.OsztalyCsoportUid = noteRealm.\u003COsztalyCsoportUid\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003CSeenByUser\u003Ek__BackingField)
        {
          // ISSUE: explicit non-virtual call
          // ISSUE: reference to a compiler-generated field
          __nonvirtual (noteRealm.SeenByUser) = noteRealm.\u003CSeenByUser\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || noteRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          noteRealm.ProfileId = noteRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        noteRealm.CreatedDate = noteRealm.\u003CCreatedDate\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        NoteRealm noteRealm = (NoteRealm) instance;
        value = (object) noteRealm.PrimaryId;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
