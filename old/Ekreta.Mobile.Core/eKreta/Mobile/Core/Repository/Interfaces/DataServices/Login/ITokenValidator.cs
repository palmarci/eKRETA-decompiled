// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login.ITokenValidator
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Login;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login
{
  public interface ITokenValidator
  {
    TokenValidation Validate(TokenInfo tokenInfo);

    string GetProfileIdFromTokenData(TokenInfo tokenInfo);
  }
}
