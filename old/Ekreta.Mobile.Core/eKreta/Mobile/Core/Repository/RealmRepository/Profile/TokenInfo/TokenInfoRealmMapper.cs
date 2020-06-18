// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo.TokenInfoRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo
{
  public class TokenInfoRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.TokenInfo, TokenInfoRealm>, IMapper<Ekreta.Mobile.Core.Models.TokenInfo, TokenInfoRealm>
  {
    public static string GetId(int instituteUserId, int userRole, string tutelaryId)
    {
      return !string.IsNullOrEmpty(tutelaryId) ? string.Format("${0}_{1}", (object) tutelaryId, (object) userRole) : string.Format("${0}_{1}", (object) instituteUserId, (object) userRole);
    }

    public Ekreta.Mobile.Core.Models.TokenInfo From(TokenInfoRealm item)
    {
      if (item == null)
        return new Ekreta.Mobile.Core.Models.TokenInfo();
      return new Ekreta.Mobile.Core.Models.TokenInfo()
      {
        UserId = new Guid(item.UserId),
        Role = (UserRoles) item.Role,
        InstituteUserId = item.InstituteUserId,
        SchoolYearId = item.SchoolYearId,
        TutelaryId = item.TutelaryId,
        InstituteCode = item.InstituteCode
      };
    }

    public TokenInfoRealm To(Ekreta.Mobile.Core.Models.TokenInfo item)
    {
      return new TokenInfoRealm()
      {
        Id = TokenInfoRealmMapper.GetId(item.InstituteUserId, (int) item.Role, item.TutelaryId),
        UserId = item.UserId.ToString(),
        Role = (int) item.Role,
        InstituteUserId = item.InstituteUserId,
        SchoolYearId = item.SchoolYearId,
        TutelaryId = item.TutelaryId,
        InstituteCode = item.InstituteCode
      };
    }
  }
}
