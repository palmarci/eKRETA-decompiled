// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.ProfileDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Client;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using MvvmCross;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class ProfileDbDataService : IProfileDbDataService, IDataService
  {
    private const NotificationMessageType DefaultNotificationType = NotificationMessageType.All;
    private const NotificationMessageSource DefaultNotificationMessageSource = NotificationMessageSource.Kreta;
    private const int BothStudentAndTutelaryShouldReceivePush = 2;
    private readonly IProfileDbRepository _profileRepository;
    private readonly ITokenInfoDbRepository _tokenInfoRepository;
    private readonly IPushSettingsDbRepository _pushSettingsRepository;
    private readonly ISecureStore _secureStore;
    private readonly IGlobalMobileApi _globalMobileApi;
    private readonly IMobileApi _mobileApi;
    private readonly IPushNotificationHandler _pushNotificationHandler;
    private readonly IPushNotificationPlatformSpecificService _pushNotificationPlatformSpecificService;

    public ProfileDbDataService()
    {
      this._profileRepository = (IProfileDbRepository) Mvx.get_IoCProvider().Resolve<IProfileDbRepository>();
      this._tokenInfoRepository = (ITokenInfoDbRepository) Mvx.get_IoCProvider().Resolve<ITokenInfoDbRepository>();
      this._pushSettingsRepository = (IPushSettingsDbRepository) Mvx.get_IoCProvider().Resolve<IPushSettingsDbRepository>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._globalMobileApi = (IGlobalMobileApi) Mvx.get_IoCProvider().Resolve<IGlobalMobileApi>();
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
      this._pushNotificationHandler = (IPushNotificationHandler) Mvx.get_IoCProvider().Resolve<IPushNotificationHandler>();
      this._pushNotificationPlatformSpecificService = (IPushNotificationPlatformSpecificService) Mvx.get_IoCProvider().Resolve<IPushNotificationPlatformSpecificService>();
    }

    public ProfileRealm GetProfile(TokenInfoRealm tokenInfo)
    {
      return this._profileRepository.Query().FirstOrDefault<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.TokenInfo.UserId == tokenInfo.UserId && x.TokenInfo.Role == tokenInfo.Role && x.TokenInfo.InstituteUserId == tokenInfo.InstituteUserId));
    }

    public ProfileRealm GetProfileByComplexKey(TokenInfoRealm tokenInfo)
    {
      return this._profileRepository.Query().FirstOrDefault<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.TokenInfo.InstituteUserId == tokenInfo.InstituteUserId && x.TokenInfo.TutelaryId == tokenInfo.TutelaryId && x.TokenInfo.InstituteCode == tokenInfo.InstituteCode && x.TokenInfo.SchoolYearId == tokenInfo.SchoolYearId));
    }

    public ProfileRealm GetProfile(
      string instituteCode,
      int instituteUserId,
      int roleId)
    {
      ProfileRealm activeProfile = this.GetActiveProfile();
      return roleId != 2 ? this._profileRepository.Query().ToList<ProfileRealm>().FirstOrDefault<ProfileRealm>((Func<ProfileRealm, bool>) (x =>
      {
        ParameterExpression parameterExpression;
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        // ISSUE: method reference
        // ISSUE: method reference
        // ISSUE: field reference
        TokenInfoRealm tokenInfoRealm = this._tokenInfoRepository.Query().FirstOrDefault<TokenInfoRealm>(Expression.Lambda<Func<TokenInfoRealm, bool>>((Expression) Expression.AndAlso((Expression) Expression.OrElse(token.InstituteUserId == this.instituteUserId, (Expression) Expression.Equal(token.TutelaryId, (Expression) Expression.Call(this.instituteUserId, (MethodInfo) MethodBase.GetMethodFromHandle(__methodref (int.ToString)), Array.Empty<Expression>()))), (Expression) Expression.Equal((Expression) Expression.Convert((Expression) Expression.Property((Expression) parameterExpression, (MethodInfo) MethodBase.GetMethodFromHandle(__methodref (TokenInfoRealm.get_Role))), typeof (int)), (Expression) Expression.Field((Expression) Expression.Constant((object) this, typeof (ProfileDbDataService.\u003C\u003Ec__DisplayClass14_0)), FieldInfo.GetFieldFromHandle(__fieldref (ProfileDbDataService.\u003C\u003Ec__DisplayClass14_0.roleId))))), parameterExpression));
        InstituteRealm instituteRealm = (InstituteRealm) RealmDb.Instance.Find<InstituteRealm>(instituteCode);
        return tokenInfoRealm != null && x.Institute == instituteRealm && x.TokenInfo == tokenInfoRealm;
      })) : (activeProfile.TokenInfo.InstituteUserId == instituteUserId ? activeProfile : this._profileRepository.Query().ToList<ProfileRealm>().FirstOrDefault<ProfileRealm>((Func<ProfileRealm, bool>) (x =>
      {
        ParameterExpression parameterExpression;
        // ISSUE: reference to a compiler-generated field
        // ISSUE: reference to a compiler-generated field
        // ISSUE: method reference
        TokenInfoRealm tokenInfoRealm = this._tokenInfoRepository.Query().FirstOrDefault<TokenInfoRealm>(Expression.Lambda<Func<TokenInfoRealm, bool>>((Expression) Expression.OrElse(token.InstituteUserId == this.instituteUserId, (Expression) Expression.Equal(token.TutelaryId, (Expression) Expression.Call(this.instituteUserId, (MethodInfo) MethodBase.GetMethodFromHandle(__methodref (int.ToString)), Array.Empty<Expression>()))), parameterExpression));
        InstituteRealm instituteRealm = (InstituteRealm) RealmDb.Instance.Find<InstituteRealm>(instituteCode);
        return tokenInfoRealm != null && x.Institute == instituteRealm && x.TokenInfo == tokenInfoRealm;
      })));
    }

    public ProfileRealm GetProfile(string id)
    {
      return this._profileRepository.Find(id);
    }

    public IEnumerable<ProfileRealm> GetProfiles()
    {
      return (IEnumerable<ProfileRealm>) this._profileRepository.Query();
    }

    public ProfileRealm GetActiveProfile()
    {
      return this._profileRepository.Query().FirstOrDefault<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.IsActive));
    }

    public void SetActiveProfile(ProfileRealm profile)
    {
      IEnumerable<ProfileRealm> profiles = this.GetProfiles();
      this._profileRepository.AddOrUpdate(profiles, (Action<ProfileRealm>) (p => p.IsActive = p.Id == profile.Id));
      if (profiles.Any<ProfileRealm>((Func<ProfileRealm, bool>) (x => x.PushSettings != null && x.PushSettings.IsPushActive)) && !this._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice())
        Dialogs.ShowToast("Push_SubscribedNeedEnable");
      this.DefaultPushRegistration().Wait(30000);
    }

    public void AddOrUpdate(ProfileRealm profile, Action<ProfileRealm> action = null)
    {
      this._profileRepository.AddOrUpdate(profile, action);
    }

    public async Task AddOrUpdateAsync(ProfileRealm profile, Action<ProfileRealm> action = null)
    {
      await this._profileRepository.AddOrUpdateAsync(profile, action);
    }

    public async Task<bool> NotificationRegistrationAsync(ProfileRealm profile)
    {
      try
      {
        if (!this._pushNotificationPlatformSpecificService.IsPushNotificationEnabledByDevice())
          throw new DisabledPushByDeviceException().SetErrorCode<DisabledPushByDeviceException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDbDataService.cs", 168);
        string platform = this._pushNotificationHandler.Platform.ToString();
        NotificationMessageType notificationType = NotificationMessageType.All;
        string handle = this._pushNotificationHandler.Token;
        NotificationMessageSource notificationSource = NotificationMessageSource.Kreta;
        TokenData tokenData = this._secureStore.GetTokenData(profile.Id);
        if (tokenData.ExpiresAt <= DateTime.Now)
          tokenData = await ((IAuthDbDataService) Mvx.get_IoCProvider().Resolve<IAuthDbDataService>()).RefreshToken(profile);
        if (tokenData == null)
          return false;
        this._tokenInfoRepository.AddOrUpdate(new TokenInfoRealmMapper().To((Ekreta.Mobile.Core.Models.TokenInfo) JsonConvert.DeserializeObject<Ekreta.Mobile.Core.Models.TokenInfo>(TokenDecoder.Decode(tokenData.AccessToken))), (Action<TokenInfoRealm>) null);
        Ekreta.Mobile.Core.Models.PushNotification.PushSettings pushSettings = await this._globalMobileApi.NotificationRegistrationAsync(profile.TokenInfo.InstituteCode, profile.TokenInfo.InstituteUserId, profile.TokenInfo.TutelaryId, platform, handle, (UserRoles) profile.TokenInfo.Role, notificationSource, (int) notificationType, profile.Id);
        PushSettingsRealm pushSettingsRealm = new PushSettingsRealmMapper().To(pushSettings);
        if (pushSettingsRealm != null)
        {
          this._pushSettingsRepository.AddOrUpdate(pushSettingsRealm, (Action<PushSettingsRealm>) (ps =>
          {
            ps.NotificationTypes = (int) notificationType;
            ps.FirstTimePushRun = true;
            ps.UpdateEugyintezes = true;
            ps.Token = handle;
          }));
          this.AddOrUpdate(profile, (Action<ProfileRealm>) (p => p.PushSettings = pushSettingsRealm));
        }
        else if (profile.PushSettings != null)
          this.AddOrUpdate(profile, (Action<ProfileRealm>) (p => p.PushSettings.FirstTimePushRun = true));
        else
          this.AddOrUpdate(profile, (Action<ProfileRealm>) (p => p.PushSettings = new PushSettingsRealm()
          {
            FirstTimePushRun = true
          }));
        return pushSettings != null;
      }
      catch (DisabledPushByDeviceException ex)
      {
        ex.SetErrorCode<DisabledPushByDeviceException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDbDataService.cs", 243);
        throw;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "ProfileDataService.NotificationRegistrationAsync", "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDbDataService.cs", 75);
        return false;
      }
    }

    public async Task<bool> NotificationUpdateAsync(
      ProfileRealm profile,
      NotificationMessageType notificationType,
      string token)
    {
      try
      {
        Ekreta.Mobile.Core.Models.PushNotification.PushSettings pushSettings = await this._globalMobileApi.NotificationUpdateAsync(profile.PushSettings.RegistrationId, (int) notificationType, NotificationMessageSource.Kreta, token);
        profile.PushSettings.NotificationTypes = (int) notificationType;
        profile.PushSettings.Token = token;
        this.AddOrUpdate(profile, (Action<ProfileRealm>) null);
        return true;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (NotificationUpdateAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDbDataService.cs", 269);
        return false;
      }
    }

    public async Task<bool> NotificationDeleteAsync(
      ProfileRealm profile,
      bool useGlobalMobileApiV1 = false)
    {
      bool result;
      try
      {
        if (profile == null)
          throw new ArgumentNullException(nameof (profile));
        PushSettingsRealm pushSettingsRealm = (PushSettingsRealm) null;
        try
        {
          TaskAwaiter<Ekreta.Mobile.Core.Models.PushNotification.PushSettings> awaiter = this._globalMobileApi.NotificationDeleteAsync(profile?.PushSettings?.RegistrationId, NotificationMessageSource.Kreta, useGlobalMobileApiV1).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<Ekreta.Mobile.Core.Models.PushNotification.PushSettings> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Ekreta.Mobile.Core.Models.PushNotification.PushSettings>, ProfileDbDataService.\u003CNotificationDeleteAsync\u003Ed__23>(ref awaiter, this);
            return;
          }
          pushSettingsRealm = new PushSettingsRealmMapper().To(awaiter.GetResult());
        }
        catch (KeyNotFoundException ex)
        {
          this._profileRepository.AddOrUpdate(profile, (Action<ProfileRealm>) (p => p.PushSettings = (PushSettingsRealm) null));
          pushSettingsRealm = new PushSettingsRealm();
        }
        if (pushSettingsRealm != null)
        {
          this._pushSettingsRepository.AddOrUpdate(pushSettingsRealm, (Action<PushSettingsRealm>) (ps =>
          {
            ps.FirstTimePushRun = true;
            ps.UpdateEugyintezes = true;
          }));
          this._profileRepository.AddOrUpdate(profile, (Action<ProfileRealm>) (p => p.PushSettings = pushSettingsRealm));
        }
        result = pushSettingsRealm != null;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public void Delete(ProfileRealm profile)
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

    public void DeleteOnlyProfileData(ProfileRealm profile)
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

    public void UpdateTokenData(ProfileRealm profile, TokenData tokenData)
    {
      TokenInfoRealm tokenInfoRealm = (TokenInfoRealm) JsonConvert.DeserializeObject<TokenInfoRealm>(TokenDecoder.Decode(tokenData.AccessToken));
      profile.TokenInfo = tokenInfoRealm;
      this.AddOrUpdate(profile, (Action<ProfileRealm>) null);
      this._secureStore.SaveTokenData(profile.Id, tokenData);
    }

    public int CountProfilesForRolelessId(string rolelessId)
    {
      return this._profileRepository.Query().Where<ProfileRealm>((Expression<Func<ProfileRealm, bool>>) (x => x.Id.StartsWith(rolelessId))).Count<ProfileRealm>();
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
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "MasterViewModel", "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/ProfileDbDataService.cs", 216);
      }
    }
  }
}
