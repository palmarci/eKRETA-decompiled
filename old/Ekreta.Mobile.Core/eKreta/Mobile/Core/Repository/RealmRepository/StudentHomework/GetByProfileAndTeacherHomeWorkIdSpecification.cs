﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework.GetByProfileAndTeacherHomeWorkIdSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework
{
  public class GetByProfileAndTeacherHomeWorkIdSpecification : ProfileSpecification<StudentHomeWorkRealm>
  {
    private readonly int _teacherHomeWorkId;

    public GetByProfileAndTeacherHomeWorkIdSpecification(
      string rolelessProfileId,
      int teacherHomeWorkId)
      : base(rolelessProfileId)
    {
      this._teacherHomeWorkId = teacherHomeWorkId;
    }

    public override IQueryable<StudentHomeWorkRealm> ToRealmResults(
      Realm realm)
    {
      return ((IQueryable<StudentHomeWorkRealm>) realm.All<StudentHomeWorkRealm>()).Where<StudentHomeWorkRealm>((Expression<Func<StudentHomeWorkRealm, bool>>) (x => x.ProfileId == this._rolelessProfileId && x.TanarHaziFeladatId == this._teacherHomeWorkId));
    }
  }
}
