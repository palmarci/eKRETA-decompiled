// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.GetProfileByUserIdAndInstituteCodeSpecification
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using Realms;
using System;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile
{
  public class GetProfileByUserIdAndInstituteCodeSpecification : IRealmSpecification<ProfileRealm>, ISpecification
  {
    private readonly string _instituteCode;
    private readonly int _instituteUserId;
    private readonly int _userRole;

    public GetProfileByUserIdAndInstituteCodeSpecification(
      string instituteCode,
      int instituteUserId,
      int userRole)
    {
      this._instituteCode = instituteCode;
      this._instituteUserId = instituteUserId;
      this._userRole = userRole;
    }

    public IQueryable<ProfileRealm> ToRealmResults(Realm realm)
    {
      ParameterExpression parameterExpression;
      // ISSUE: method reference
      // ISSUE: method reference
      // ISSUE: field reference
      TokenInfoRealm tokenInfo = ((IQueryable<TokenInfoRealm>) realm.All<TokenInfoRealm>()).Where<TokenInfoRealm>(Expression.Lambda<Func<TokenInfoRealm, bool>>((Expression) Expression.AndAlso((Expression) Expression.OrElse(x.InstituteUserId == this._instituteUserId, (Expression) Expression.Equal(x.TutelaryId, (Expression) Expression.Call(this._instituteUserId, (MethodInfo) MethodBase.GetMethodFromHandle(__methodref (int.ToString)), Array.Empty<Expression>()))), (Expression) Expression.Equal((Expression) Expression.Convert((Expression) Expression.Property((Expression) parameterExpression, (MethodInfo) MethodBase.GetMethodFromHandle(__methodref (TokenInfoRealm.get_Role))), typeof (int)), (Expression) Expression.Field((Expression) Expression.Constant((object) this, typeof (GetProfileByUserIdAndInstituteCodeSpecification)), FieldInfo.GetFieldFromHandle(__fieldref (GetProfileByUserIdAndInstituteCodeSpecification._userRole))))), parameterExpression)).FirstOrDefault<TokenInfoRealm>();
      InstituteRealm institute = (InstituteRealm) realm.Find<InstituteRealm>(this._instituteCode);
      if (tokenInfo == null)
        return Enumerable.Empty<ProfileRealm>().AsQueryable<ProfileRealm>();
      return ((IQueryable<ProfileRealm>) realm.All<ProfileRealm>()).Where<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.Institute == institute && x.TokenInfo == tokenInfo));
    }
  }
}
