// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login.IAuthDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login
{
  public interface IAuthDataService : IDataService
  {
    Task<Profile> Login(Institute institute, string username, string password);

    Task Relogin(Credentials credentials);

    Task<TokenData> RefreshToken(Profile profile);

    void AddNewProfile(Profile profile);

    void DeleteProfile(Profile profile);
  }
}
