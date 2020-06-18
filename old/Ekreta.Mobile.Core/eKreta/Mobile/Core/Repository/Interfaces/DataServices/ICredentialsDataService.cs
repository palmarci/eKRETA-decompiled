// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ICredentialsDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ICredentialsDataService : IDataService
  {
    Credentials GetCredentials(string profileId);

    List<Credentials> GetAllCredentials();

    void SaveCredentials(Credentials credentials);

    void DeleteCredentialByProfileId(string profileId);

    void DeleteCredential(string userName, string password);

    string GetCredentialProfileId(string userName, string password);
  }
}
