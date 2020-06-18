﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.ISecureStore
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface ISecureStore
  {
    void SaveTokenData(string profileId, TokenData tokenData);

    TokenData GetTokenData(string profileId);

    void DeleteTokenData(string profileId);

    byte[] GetEncryptionKey();

    void MigrateOldStore();

    void MigrateProfileId(string oldProfileId, string newProfileId);
  }
}
