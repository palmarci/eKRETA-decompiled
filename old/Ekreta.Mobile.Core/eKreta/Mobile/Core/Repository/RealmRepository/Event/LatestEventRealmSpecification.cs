// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Event.LatestEventRealmSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Event
{
  public class LatestEventRealmSpecification : ProfileSpecification<EventRealm>
  {
    public LatestEventRealmSpecification(string rolelessProfileId, int dayRange)
      : base(rolelessProfileId)
    {
      this.DayRange = dayRange;
    }

    public int DayRange { get; }

    public override IQueryable<EventRealm> ToRealmResults(Realm realm)
    {
      DateTimeOffset day = new DateTimeOffset(DateTime.Today.AddDays((double) -this.DayRange));
      return (IQueryable<EventRealm>) ((IQueryable<EventRealm>) realm.All<EventRealm>()).Where<EventRealm>((Expression<Func<EventRealm, bool>>) (a => a.Date >= day && a.ProfileId == this._rolelessProfileId)).OrderByDescending<EventRealm, DateTimeOffset>((Expression<Func<EventRealm, DateTimeOffset>>) (x => x.Date));
    }
  }
}
