﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login.ITokenValidatorDb
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.Login;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login
{
  public interface ITokenValidatorDb
  {
    TokenValidation Validate(TokenInfoRealm tokenInfo);

    string GetProfileIdFromTokenData(TokenInfoRealm tokenInfo);
  }
}
