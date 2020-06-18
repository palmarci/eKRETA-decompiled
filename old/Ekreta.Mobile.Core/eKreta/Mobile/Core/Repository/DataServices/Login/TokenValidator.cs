// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.Login.TokenValidator
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;

namespace Ekreta.Mobile.Core.Repository.DataServices.Login
{
  public class TokenValidator : ITokenValidator
  {
    public string GetProfileIdFromTokenData(TokenInfo tokenInfo)
    {
      string str = string.Format("{0}-{1}-{2}_{3}", (object) tokenInfo.InstituteCode, (object) tokenInfo.InstituteUserId, (object) tokenInfo.SchoolYearId, (object) (int) tokenInfo.Role);
      if (!string.IsNullOrWhiteSpace(tokenInfo.TutelaryId))
        str = str + "-" + tokenInfo.TutelaryId;
      return str;
    }

    public TokenValidation Validate(TokenInfo tokenInfo)
    {
      if (tokenInfo == null)
        return TokenValidation.UNEXPECTED_TOKEN_INFO_FORMAT;
      return !this.ValidateUserRole(tokenInfo) ? TokenValidation.INVALID_USER_ROLE : TokenValidation.VALID;
    }

    private bool ValidateUserRole(TokenInfo tokenInfo)
    {
      return tokenInfo.Role == UserRoles.Student || tokenInfo.Role == UserRoles.Tutelary;
    }
  }
}
