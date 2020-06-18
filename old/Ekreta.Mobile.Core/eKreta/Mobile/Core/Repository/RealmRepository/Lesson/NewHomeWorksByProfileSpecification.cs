// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Lesson.NewHomeWorksByProfileSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Lesson
{
  public class NewHomeWorksByProfileSpecification : ProfileSpecification<LessonRealm>
  {
    public NewHomeWorksByProfileSpecification(string rolelessProfileId)
      : base(rolelessProfileId)
    {
    }

    public override IQueryable<LessonRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<LessonRealm>) realm.All<LessonRealm>()).Where<LessonRealm>((Expression<Func<LessonRealm, bool>>) (x => x.ProfileId == this._rolelessProfileId && x.TeacherHomeWorkId != new int?() && !x.SeenByUser));
    }
  }
}
