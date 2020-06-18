// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Student.StudentByProfileSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Student
{
  public class StudentByProfileSpecification : ProfileSpecification<StudentRealm>
  {
    public StudentByProfileSpecification(string rolelessProfileId)
      : base(rolelessProfileId)
    {
    }

    public override IQueryable<StudentRealm> ToRealmResults(Realm realm)
    {
      return ((IQueryable<StudentRealm>) realm.All<StudentRealm>()).Where<StudentRealm>((Expression<Func<StudentRealm, bool>>) (x => x.ProfileId == this._rolelessProfileId));
    }
  }
}
