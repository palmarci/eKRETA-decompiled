// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Exam.ExpiredExamsRealmSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Exam
{
  public class ExpiredExamsRealmSpecification : IRealmSpecification<ExamRealm>, ISpecification
  {
    private readonly int _expirationDay;

    public ExpiredExamsRealmSpecification(int expirationDay)
    {
      this._expirationDay = expirationDay;
    }

    public IQueryable<ExamRealm> ToRealmResults(Realm realm)
    {
      DateTimeOffset expirationTime = DateTimeOffset.Now.AddDays((double) -this._expirationDay);
      return ((IQueryable<ExamRealm>) realm.All<ExamRealm>()).Where<ExamRealm>((Expression<Func<ExamRealm, bool>>) (x => x.BejelentesDatuma < expirationTime));
    }
  }
}
