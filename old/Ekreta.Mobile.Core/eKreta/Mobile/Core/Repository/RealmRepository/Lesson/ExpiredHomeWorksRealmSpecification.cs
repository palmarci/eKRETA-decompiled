// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Lesson.ExpiredHomeWorksRealmSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Lesson
{
  public class ExpiredHomeWorksRealmSpecification : IRealmSpecification<LessonRealm>, ISpecification
  {
    private readonly int _expirationDay;

    public ExpiredHomeWorksRealmSpecification(int expirationDay)
    {
      this._expirationDay = expirationDay;
    }

    public IQueryable<LessonRealm> ToRealmResults(Realm realm)
    {
      DateTimeOffset expirationTime = DateTimeOffset.Now.AddDays((double) -this._expirationDay);
      return ((IQueryable<LessonRealm>) realm.All<LessonRealm>()).Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.CreatedDate < expirationTime));
    }
  }
}
