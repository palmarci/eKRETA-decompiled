// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Lesson.LessonsForIntervalSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Lesson
{
  public class LessonsForIntervalSpecification : ProfileSpecification<LessonRealm>
  {
    public DateTimeOffset FromDate { get; set; }

    public DateTimeOffset ToDate { get; set; }

    public LessonsForIntervalSpecification(
      string rolelessProfileId,
      DateTime fromDate,
      DateTime toDate)
      : base(rolelessProfileId)
    {
      this.FromDate = new DateTimeOffset(fromDate);
      this.ToDate = new DateTimeOffset(toDate);
    }

    public override IQueryable<LessonRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<LessonRealm>) realm.All<LessonRealm>()).Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == this._rolelessProfileId && x.Date >= this.FromDate && x.Date <= this.ToDate));
    }
  }
}
