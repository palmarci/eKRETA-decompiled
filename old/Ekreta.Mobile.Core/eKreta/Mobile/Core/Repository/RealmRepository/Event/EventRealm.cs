// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Event.EventRealm
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Realms;
using Realms.Weaving;
using System;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Event
{
  [Woven(typeof (EventRealm.RealmHelper))]
  [Preserve(true, false)]
  public class EventRealm : RealmObject, INewItem, IPrimaryKey, IReflectableType
  {
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

    [WovenProperty]
    [Preserve]
    [Realms.PrimaryKey]
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
    public string EventId
    {
      get
      {
        return this.get_IsManaged() ? this.GetStringValue(nameof (EventId)) : this.\u003CEventId\u003Ek__BackingField;
      }
      set
      {
        if (!this.get_IsManaged())
        {
          this.\u003CEventId\u003Ek__BackingField = value;
          this.RaisePropertyChanged(nameof (EventId));
        }
        else
          this.SetStringValue(nameof (EventId), value);
      }
    }

    [WovenProperty]
    [Preserve]
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

    [WovenProperty]
    [Preserve]
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

    [Indexed]
    [Preserve]
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
        return this.Id;
      }
    }

    [Preserve]
    public EventRealm()
    {
      base.\u002Ector();
    }

    public TypeInfo GetTypeInfo()
    {
      return TypeInfoHelper.GetInfo<EventRealm>();
    }

    private class RealmHelper : IRealmObjectHelper
    {
      public RealmObject CreateInstance()
      {
        return (RealmObject) new EventRealm();
      }

      [Preserve]
      public void CopyToRealm(RealmObject instance, bool update, bool skipDefaults)
      {
        EventRealm eventRealm = (EventRealm) instance;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || eventRealm.\u003CSeenByUser\u003Ek__BackingField)
        {
          // ISSUE: explicit non-virtual call
          // ISSUE: reference to a compiler-generated field
          __nonvirtual (eventRealm.SeenByUser) = eventRealm.\u003CSeenByUser\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || eventRealm.\u003CEventId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          eventRealm.EventId = eventRealm.\u003CEventId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        eventRealm.Date = eventRealm.\u003CDate\u003Ek__BackingField;
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || eventRealm.\u003CTitle\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          eventRealm.Title = eventRealm.\u003CTitle\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || eventRealm.\u003CContent\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          eventRealm.Content = eventRealm.\u003CContent\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        if (!skipDefaults || eventRealm.\u003CProfileId\u003Ek__BackingField != null)
        {
          // ISSUE: reference to a compiler-generated field
          eventRealm.ProfileId = eventRealm.\u003CProfileId\u003Ek__BackingField;
        }
        // ISSUE: reference to a compiler-generated field
        eventRealm.CreatedDate = eventRealm.\u003CCreatedDate\u003Ek__BackingField;
      }

      [Preserve]
      public bool TryGetPrimaryKeyValue(RealmObject instance, out object value)
      {
        EventRealm eventRealm = (EventRealm) instance;
        value = (object) eventRealm.Id;
        return true;
      }

      [Preserve]
      public RealmHelper()
      {
      }
    }
  }
}
