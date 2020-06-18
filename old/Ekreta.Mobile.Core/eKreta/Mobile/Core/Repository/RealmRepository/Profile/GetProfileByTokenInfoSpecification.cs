// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.GetProfileByTokenInfoSpecification
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
  public class GetProfileByTokenInfoSpecification : IRealmSpecification<ProfileRealm>, ISpecification
  {
    private readonly string _userId;
    private readonly int _userRole;
    private readonly int _instituteUserId;

    public GetProfileByTokenInfoSpecification(string userId, int userRole, int instituteUserId)
    {
      this._userId = userId;
      this._userRole = userRole;
      this._instituteUserId = instituteUserId;
    }

    public IQueryable<ProfileRealm> ToRealmResults(Realm realm)
    {
      TokenInfoRealm tokenInfo = ((IQueryable<TokenInfoRealm>) realm.All<TokenInfoRealm>()).Where<TokenInfoRealm>((Expression<Func<TokenInfoRealm, bool>>) (x => x.UserId == this._userId && x.Role == this._userRole && x.InstituteUserId == this._instituteUserId)).FirstOrDefault<TokenInfoRealm>();
      return ((IQueryable<ProfileRealm>) realm.All<ProfileRealm>()).Where<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.TokenInfo == tokenInfo));
    }
  }
}
