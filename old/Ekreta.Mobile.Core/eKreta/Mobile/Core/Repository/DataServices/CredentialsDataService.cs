// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.CredentialsDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Credentials;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class CredentialsDataService : ICredentialsDataService, IDataService
  {
    private readonly ICredentialRealmRepository _credentialsRepository;

    public CredentialsDataService()
    {
      this._credentialsRepository = (ICredentialRealmRepository) Mvx.get_IoCProvider().Resolve<ICredentialRealmRepository>();
    }

    public Ekreta.Mobile.Core.Models.Credentials GetCredentials(string profileId)
    {
      return this._credentialsRepository.Query((ISpecification) new CredentialsByProfileId(profileId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Credentials>();
    }

    public List<Ekreta.Mobile.Core.Models.Credentials> GetAllCredentials()
    {
      return this._credentialsRepository.Query((ISpecification) new AllCredentialsQuery()).ToList<Ekreta.Mobile.Core.Models.Credentials>();
    }

    public void SaveCredentials(Ekreta.Mobile.Core.Models.Credentials credentials)
    {
      Ekreta.Mobile.Core.Models.Credentials credentials1 = this.GetCredentials(credentials.UserId);
      if (credentials1 == null)
      {
        credentials.Id = Guid.NewGuid().ToString();
        this._credentialsRepository.AddOrUpdate(credentials);
      }
      else
      {
        credentials1.Password = credentials.Password;
        credentials1.UserName = credentials.UserName;
        credentials1.InstitudeId = credentials.InstitudeId;
        this._credentialsRepository.AddOrUpdate(credentials1);
      }
    }

    public void DeleteCredentialByProfileId(string profileId)
    {
      Ekreta.Mobile.Core.Models.Credentials credentials = this.GetCredentials(profileId);
      if (credentials == null)
        return;
      this._credentialsRepository.Remove(credentials);
    }

    public void DeleteCredential(string userName, string password)
    {
      Ekreta.Mobile.Core.Models.Credentials credentials = this.GetAllCredentials().FirstOrDefault<Ekreta.Mobile.Core.Models.Credentials>((Func<Ekreta.Mobile.Core.Models.Credentials, bool>) (x => x.UserName == userName && x.Password == password));
      if (credentials == null)
        return;
      this._credentialsRepository.Remove(credentials);
    }

    public string GetCredentialProfileId(string userName, string password)
    {
      return this.GetAllCredentials().FirstOrDefault<Ekreta.Mobile.Core.Models.Credentials>((Func<Ekreta.Mobile.Core.Models.Credentials, bool>) (x => x.Password == password && x.UserName == userName))?.UserId ?? string.Empty;
    }
  }
}
