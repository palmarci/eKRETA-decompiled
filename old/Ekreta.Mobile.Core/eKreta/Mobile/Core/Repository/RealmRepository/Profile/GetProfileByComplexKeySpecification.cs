// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.GetProfileByComplexKeySpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile
{
  public class GetProfileByComplexKeySpecification : IRealmSpecification<ProfileRealm>, ISpecification
  {
    private readonly int _instituteUserId;
    private readonly string _tutelaryId;
    private readonly string _instituteCode;
    private readonly string _schoolYearId;

    public GetProfileByComplexKeySpecification(
      int instituteUserId,
      string tutelaryId,
      string instituteCode,
      string schoolYearId)
    {
      this._instituteUserId = instituteUserId;
      this._tutelaryId = tutelaryId;
      this._instituteCode = instituteCode;
      this._schoolYearId = schoolYearId;
    }

    public IQueryable<ProfileRealm> ToRealmResults(Realm realm)
    {
      TokenInfoRealm tokenInfo = ((IQueryable<TokenInfoRealm>) realm.All<TokenInfoRealm>()).Where<TokenInfoRealm>((Expression<Func<TokenInfoRealm, bool>>) (x => x.InstituteUserId == this._instituteUserId && x.TutelaryId == this._tutelaryId && x.InstituteCode == this._instituteCode && x.SchoolYearId == this._schoolYearId)).FirstOrDefault<TokenInfoRealm>();
      return ((IQueryable<ProfileRealm>) realm.All<ProfileRealm>()).Where<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.TokenInfo == tokenInfo));
    }
  }
}
