// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Event.ExpiredEventsRealmSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Event
{
  public class ExpiredEventsRealmSpecification : IRealmSpecification<EventRealm>, ISpecification
  {
    private readonly int _expirationDay;

    public ExpiredEventsRealmSpecification(int expirationDay)
    {
      this._expirationDay = expirationDay;
    }

    public IQueryable<EventRealm> ToRealmResults(Realm realm)
    {
      DateTimeOffset expirationTime = DateTimeOffset.Now.AddDays((double) -this._expirationDay);
      return ((IQueryable<EventRealm>) realm.All<EventRealm>()).Where<EventRealm>((Expression<Func<EventRealm, bool>>) (x => x.CreatedDate < expirationTime));
    }
  }
}
