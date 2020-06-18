// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.ProfileRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile
{
  public class ProfileRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Profile, ProfileRealm>, IMapper<Ekreta.Mobile.Core.Models.Profile, ProfileRealm>
  {
    private static readonly PushSettingsRealmMapper pushSettingsMapper = new PushSettingsRealmMapper();
    private static readonly InstituteRealmMapper instituteMapper = new InstituteRealmMapper();
    private static readonly TokenInfoRealmMapper tokenInfoMapper = new TokenInfoRealmMapper();

    public Ekreta.Mobile.Core.Models.Profile From(ProfileRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Profile()
      {
        Id = item.Id,
        IsActive = item.IsActive,
        PushSettings = ProfileRealmMapper.pushSettingsMapper.From(item.PushSettings),
        Institute = ProfileRealmMapper.instituteMapper.From(item.Institute),
        TokenInfo = ProfileRealmMapper.tokenInfoMapper.From(item.TokenInfo),
        IsFirstLogin = item.IsFirstLogin
      };
    }

    public ProfileRealm To(Ekreta.Mobile.Core.Models.Profile item)
    {
      return new ProfileRealm()
      {
        Id = item.Id,
        IsActive = item.IsActive,
        IsFirstLogin = item.IsFirstLogin,
        PushSettings = ProfileRealmMapper.pushSettingsMapper.To(item.PushSettings),
        Institute = ProfileRealmMapper.instituteMapper.To(item.Institute),
        TokenInfo = ProfileRealmMapper.tokenInfoMapper.To(item.TokenInfo)
      };
    }
  }
}
