// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.ProfileDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Client;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using MvvmCross;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class ProfileDataService : IProfileDataService, IDataService
  {
    private const NotificationMessageType DefaultNotificationType = NotificationMessageType.All;
    private const NotificationMessageSource DefaultNotificationMessageSource = NotificationMessageSource.Kreta;
    private const int BothStudentAndTutelaryShouldReceivePush = 2;
    private readonly IProfileRepository _profileRepository;
    private readonly ITokenInfoRepository _tokenInfoRepository;
    private readonly IPushSettingsRepository _pushSettingsRepository;
    private readonly ISecureStore _secureStore;
    private readonly IGlobalMobileApi _globalMobileApi;
    private readonly IMobileApi _mobileApi;
    private readonly IPushNotificationHandler _pushNotificationHandler;
    private readonly IPushNotificationPlatformSpecificService _pushNotificationPlatformSpecificService;

    public ProfileDataService()
    {
      this._profileRepository = (IProfileRepository) Mvx.get_IoCProvider().Resolve<IProfileRepository>();
      this._tokenInfoRepository = (ITokenInfoRepository) Mvx.get_IoCProvider().Resolve<ITokenInfoRepository>();
      this._pushSettingsRepository = (IPushSettingsRepository) Mvx.get_IoCProvider().Resolve<IPushSettingsRepository>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._globalMobileApi = (IGlobalMobileApi) Mvx.get_IoCProvider().Resolve<IGlobalMobileApi>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
      this._pushNotificationHandler = (IPushNotificationHandler) Mvx.get_IoCProvider().Resolve<IPushNotificationHandler>();
      this._pushNotificationPlatformSpecificService = (IPushNotificationPlatformSpecificService) Mvx.get_IoCProvider().Resolve<IPushNotificationPlatformSpecificService>();
    }

    public Ekreta.Mobile.Core.Models.Profile GetProfile(TokenInfo tokenInfo)
    {
      return this._profileRepository.Query((ISpecification) new GetProfileByTokenInfoSpecification(tokenInfo.UserId.ToString(), (int) tokenInfo.Role, tokenInfo.InstituteUserId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Profile>();
    }

    public Ekreta.Mobile.Core.Models.Profile GetProfileByComplexKey(TokenInfo tokenInfo)
    {
      return this._profileRepository.Query((ISpecification) new GetProfileByComplexKeySpecification(tokenInfo.InstituteUserId, tokenInfo.TutelaryId, tokenInfo.InstituteCode, tokenInfo.SchoolYearId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Profile>();
    }

    public Ekreta.Mobile.Core.Models.Profile GetProfile(
      string instituteCode,
      int instituteUserId,
      int roleId)
    {
      Ekreta.Mobile.Core.Models.Profile activeProfile = this.GetActiveProfile();
      return roleId != 2 ? this._profileRepository.Query((ISpecification) new GetProfileByUserIdAndInstituteCodeSpecification(instituteCode, instituteUserId, roleId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Profile>() : (activeProfile.TokenInfo.InstituteUserId == instituteUserId ? activeProfile : this._profileRepository.Query((ISpecification) new GetProfileByInstituteUserIdSpecification(instituteCode, instituteUserId)).FirstOrDefault<Ekreta.Mobile.Core.Models.Profile>());
    }

    public Ekreta.Mobile.Core.Models.Profile GetProfile(string id)
    {
      return this._profileRepository.Find(id);
    }

    public IEnumerable<Ekreta.Mobile.Core.Models.Profile> GetProfiles()
    {
      return this._profileRepository.Query();
    }

    public Ekreta.Mobile.Core.Models.Profile GetActiveProfile()
    {
      return this._profileRepository.Query((ISpecification) new ActiveProfileSpecification()).FirstOrDefault<Ekreta.Mobile.Core.Models.Profile>();
    }

    public void SetActiveProfile(Ekreta.Mobile.Core.Models.Profile profile)
    {
      IEnumerable<Ekreta.Mobile.Core.Models.Profile> profiles = this.GetProfiles();
      foreach (Ekreta.Mobile.Core.Models.Profile profile1 in profiles)
        profile1.IsActive = profile1.Id == profile.Id;
      if (profiles.Any<Ekreta.Mobile.Core.Models.Profile>((Func<Ekreta.Mobile.Core.Models.Profile, bool>) (x => x.PushSettings != null && x.PushSettings.IsPushActive)) && !this._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice())
        Dialogs.ShowToast("Push_SubscribedNeedEnable");
      profile.IsActive = true;
      this._profileRepository.AddOrUpdate(profiles);
      this.DefaultPushRegistration().Wait(30000);
    }

    public void AddOrUpdate(Ekreta.Mobile.Core.Models.Profile profile)
    {
      this._profileRepository.AddOrUpdate(profile);
    }

    public async Task<bool> NotificationRegistrationAsync(Ekreta.Mobile.Core.Models.Profile profile)
    {
      try
      {
        if (!this._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice())
          throw new DisabledPushByDeviceException().SetErrorCode<DisabledPushByDeviceException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDataService.cs", 123);
        string platform = this._pushNotificationHandler.Platform.ToString();
        NotificationMessageType notificationType = NotificationMessageType.All;
        string handle = this._pushNotificationHandler.Token;
        NotificationMessageSource notificationSource = NotificationMessageSource.Kreta;
        TokenData tokenData = this._secureStore.GetTokenData(profile.Id);
        if (tokenData.ExpiresAt <= DateTime.Now)
          tokenData = await ((IAuthDataService) Mvx.get_IoCProvider().Resolve<IAuthDataService>()).RefreshToken(profile);
        if (tokenData == null)
          return false;
        profile.TokenInfo = (TokenInfo) JsonConvert.DeserializeObject<TokenInfo>(TokenDecoder.Decode(tokenData.AccessToken));
        PushSettings pushSettings = await this._globalMobileApi.NotificationRegistrationAsync(profile.TokenInfo.InstituteCode, profile.TokenInfo.InstituteUserId, profile.TokenInfo.TutelaryId, platform, handle, profile.TokenInfo.Role, notificationSource, (int) notificationType, profile.Id);
        if (pushSettings != null)
        {
          pushSettings.NotificationTypes = notificationType;
          pushSettings.FirstTimePushRun = true;
          pushSettings.UpdateEugyintezes = true;
          pushSettings.Token = handle;
          profile.PushSettings = pushSettings;
        }
        else if (profile.PushSettings != null)
          profile.PushSettings.FirstTimePushRun = true;
        else
          profile.PushSettings = new PushSettings()
          {
            FirstTimePushRun = true
          };
        this.AddOrUpdate(profile);
        return pushSettings != null;
      }
      catch (DisabledPushByDeviceException ex)
      {
        ex.SetErrorCode<DisabledPushByDeviceException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDataService.cs", 180);
        throw;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "ProfileDataService.NotificationRegistrationAsync", "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDataService.cs", 75);
        return false;
      }
    }

    public async Task<bool> NotificationUpdateAsync(
      Ekreta.Mobile.Core.Models.Profile profile,
      NotificationMessageType notificationType,
      string token)
    {
      try
      {
        PushSettings pushSettings = await this._globalMobileApi.NotificationUpdateAsync(profile.PushSettings.RegistrationId, (int) notificationType, NotificationMessageSource.Kreta, token);
        profile.PushSettings.NotificationTypes = notificationType;
        profile.PushSettings.Token = token;
        this.AddOrUpdate(profile);
        return true;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (NotificationUpdateAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDataService.cs", 206);
        return false;
      }
    }

    public async Task<bool> NotificationDeleteAsync(Ekreta.Mobile.Core.Models.Profile profile, bool useGlobalMobileApiV1 = false)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      PushSettings pushSettings;
      try
      {
        pushSettings = await this._globalMobileApi.NotificationDeleteAsync(profile?.PushSettings?.RegistrationId, NotificationMessageSource.Kreta, useGlobalMobileApiV1);
      }
      catch (KeyNotFoundException ex)
      {
        profile.PushSettings = (PushSettings) null;
        this._profileRepository.AddOrUpdate(profile);
        pushSettings = new PushSettings();
      }
      if (pushSettings != null)
      {
        pushSettings.FirstTimePushRun = true;
        pushSettings.UpdateEugyintezes = true;
        profile.PushSettings = pushSettings;
        this._profileRepository.AddOrUpdate(profile);
      }
      return pushSettings != null;
    }

    public async Task SendProfileLogAsync(string phoneId, string userName, string instituteId)
    {
      await this._globalMobileApi.SendProfileLogAsync(phoneId, userName, instituteId);
    }

    public void Delete(Ekreta.Mobile.Core.Models.Profile profile)
    {
      ((ICredentialsDataService) Mvx.get_IoCProvider().Resolve<ICredentialsDataService>()).DeleteCredentialByProfileId(profile.Id);
      this._tokenInfoRepository.Remove(profile.TokenInfo);
      switch (profile.PushSettings?.RegistrationId)
      {
        case null:
          this._profileRepository.Remove(profile);
          break;
        default:
          this._pushSettingsRepository.Remove(profile.PushSettings);
          goto case null;
      }
    }

    public void DeleteOnlyProfileData(Ekreta.Mobile.Core.Models.Profile profile)
    {
      switch (profile.PushSettings?.RegistrationId)
      {
        case null:
          this._profileRepository.Remove(profile);
          break;
        default:
          this._pushSettingsRepository.Remove(profile.PushSettings);
          goto case null;
      }
    }

    public void UpdateTokenData(Ekreta.Mobile.Core.Models.Profile profile, TokenData tokenData)
    {
      TokenInfo tokenInfo = (TokenInfo) JsonConvert.DeserializeObject<TokenInfo>(TokenDecoder.Decode(tokenData.AccessToken));
      profile.TokenInfo = tokenInfo;
      this.AddOrUpdate(profile);
      this._secureStore.SaveTokenData(profile.Id, tokenData);
    }

    public int CountProfilesForRolelessId(string rolelessId)
    {
      return this._profileRepository.Count((ISpecification) new RolelessIdProfileCountSpecification(rolelessId));
    }

    public async Task DefaultPushRegistration()
    {
      try
      {
        await ((IPushNotificationService) Mvx.get_IoCProvider().Resolve<IPushNotificationService>()).RegisterOrUpdateRegistrationsAsync();
      }
      catch (DisabledPushByDeviceException ex)
      {
        Dialogs.ShowToast("Push_NeedEnable");
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "MasterViewModel", "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDataService.cs", 216);
      }
    }
  }
}
