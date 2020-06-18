// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Rating.RatingRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Rating
{
  [Preserve(true, false)]
  [Woven(typeof (RatingRealm.RealmHelper))]
  public class RatingRealm : RealmObject, IPrimaryKey, IReflectableType
  {
    [Realms.PrimaryKey]
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
          this.SetStringValueUnique(nameof (Id), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public DateTimeOffset LastSeenDate
    {
      get
      {
        return this.get_IsManaged() ? this.GetDateTimeOffsetValue(nameof (LastSeenDate)) : this.\u003CLastSeenDate\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CLastSeenDate\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (LastSeenDate));
        }
        else
          this.SetDateTimeOffsetValue(nameof (LastSeenDate), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public int SeenCount
    {
      get
      {
        return this.get_IsManaged() ? RealmInteger<int>.op_Implicit((RealmInteger<int>) this.GetRealmIntegerValue<int>(nameof (SeenCount))) : this.\u003CSeenCount\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSeenCount\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SeenCount));
        }
        else
          this.SetRealmIntegerValue<int>(nameof (SeenCount), (RealmInteger<M0>) RealmInteger<int>.op_Implicit(value));
      }
    }

    [WovenProperty]
    [Preserve]
    public DateTimeOffset? Date
    {
      get
      {
        return this.get_IsManaged() ? this.GetNullableDateTimeOffsetValue(nameof (Date)) : this.\u003CDate\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CDate\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Date));
        }
        else
          this.SetNullableDateTimeOffsetValue(nameof (Date), value);
      }
    }

    [Preserve]
    [WovenProperty]
    public bool Liked
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (Liked)) : this.\u003CLiked\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CLiked\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Liked));
        }
        else
          this.SetBooleanValue(nameof (Liked), value);
      }
    }

    [WovenProperty]
    [Preserve]
    public string Email
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (Email)) : this.\u003CEmail\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CEmail\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (Email));
        }
        else
          this.SetStringValue(nameof (Email), value);
      }
    }

    [Preserve]
    [WovenProperty]
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

    [WovenProperty]
    [Preserve]
    public bool SensitiveData
    {
      get
      {
        return this.get_IsManaged() ? this.GetBooleanValue(nameof (SensitiveData)) : this.\u003CSensitiveData\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CSensitiveData\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (SensitiveData));
        }
        else
          this.SetBooleanValue(nameof (SensitiveData), value);
      }
    }

    [Preserve]
    [Indexed]
    [WovenProperty]
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
    public RatingRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<RatingRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new RatingRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        RatingRealm ratingRealm = (RatingRealm) instance;
        // ISSUE: reference to a compiler-generated field
        ratingRealm.LastSeenDate = ratingRealm.\u003CLastSeenDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || ratingRealm.\u003CSeenCount\u003Ek__BackingField != 0)
        {
          // ISSUE: reference to a compiler-generated field
          ratingRealm.SeenCount = ratingRealm.\u003CSeenCount\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        ratingRealm.Date = ratingRealm.\u003CDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || ratingRealm.\u003CLiked\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          ratingRealm.Liked = ratingRealm.\u003CLiked\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || ratingRealm.\u003CEmail\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          ratingRealm.Email = ratingRealm.\u003CEmail\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || ratingRealm.\u003CDescription\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          ratingRealm.Description = ratingRealm.\u003CDescription\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || ratingRealm.\u003CSensitiveData\u003Ek__BackingField)
        {
          // ISSUE: reference to a compiler-generated field
          ratingRealm.SensitiveData = ratingRealm.\u003CSensitiveData\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (skipDefaults && ratingRealm.\u003CProfileId\u003Ek__BackingField == null)
          return;
        // ISSUE: reference to a compiler-generated field
        ratingRealm.ProfileId = ratingRealm.\u003CProfileId\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        RatingRealm ratingRealm = (RatingRealm) instance;
        value = (object) ratingRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
