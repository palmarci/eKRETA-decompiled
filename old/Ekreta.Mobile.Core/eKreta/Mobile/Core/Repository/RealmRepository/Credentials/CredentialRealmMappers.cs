// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Credentials.CredentialRealmMappers
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Credentials
{
  public class CredentialRealmMappers : IRealmMapper<Ekreta.Mobile.Core.Models.Credentials, CredentialRealm>, IMapper<Ekreta.Mobile.Core.Models.Credentials, CredentialRealm>
  {
    public CredentialRealm To(Ekreta.Mobile.Core.Models.Credentials item)
    {
      return new CredentialRealm()
      {
        Id = item.Id,
        UserName = item.UserName,
        InstitudeId = item.InstitudeId,
        Password = item.Password,
        UserId = item.UserId
      };
    }

    public Ekreta.Mobile.Core.Models.Credentials From(CredentialRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Credentials()
      {
        Id = item.Id,
        UserName = item.UserName,
        InstitudeId = item.InstitudeId,
        Password = item.Password,
        UserId = item.UserId
      };
    }
  }
}
