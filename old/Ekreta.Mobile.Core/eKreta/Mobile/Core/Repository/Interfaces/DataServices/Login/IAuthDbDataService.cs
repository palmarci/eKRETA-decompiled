// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login.IAuthDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.RealmRepository.Credentials;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login
{
  public interface IAuthDbDataService : IDataService
  {
    Task<ProfileRealm> Login(
      InstituteRealm institute,
      string username,
      string password);

    Task Relogin(CredentialRealm credentials);

    Task<TokenData> RefreshToken(ProfileRealm profile);

    void AddNewProfile(ProfileRealm profile);

    void DeleteProfile(ProfileRealm profile);
  }
}
