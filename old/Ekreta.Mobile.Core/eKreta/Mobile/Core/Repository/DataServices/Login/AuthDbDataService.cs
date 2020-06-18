// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.Login.AuthDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Client.Validation;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using Ekreta.Mobile.Core.Repository.RealmRepository.Credentials;
using Ekreta.Mobile.Core.Repository.RealmRepository.Institute;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using Newtonsoft.Json;
using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices.Login
{
  public class AuthDbDataService : IAuthDbDataService, IDataService
  {
    private static ConcurrentDictionary<string, int> refreshThrottleCounters = new ConcurrentDictionary<string, int>();
    private readonly SemaphoreSlim _semaphore = new SemaphoreSlim(1, 1);
    private readonly IDbMobileApi _mobileApi;
    private readonly ITokenValidatorDb _tokenValidator;
    private readonly ISecureStore _secureStore;
    private readonly IMvxMessenger _messenger;
    private readonly IProfileDbDataService _profileDataService;
    private readonly IAbsenceDbDataService _absenceDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly INoteDbDataService _noteDataService;
    private readonly ILessonDataService _lessonDataService;
    private readonly ISubjectAverageDataService _subjectAverageDataService;
    private readonly IStudentDataService _studentDataService;
    private readonly IEventDataService _eventDataService;
    private readonly ITeacherHomeWorkDataService _teacherHomeWorkDataService;
    private readonly IStudentHomeWorkDataService _studentHomeWorkDataService;
    private readonly ICacheDataService _cacheDataService;
    private readonly IUzenetDataService _uzenetDataService;
    private readonly IExamDataService _examDataService;
    private readonly IInstituteDataService _instituteDataService;

    public AuthDbDataService()
    {
      this._mobileApi = (IDbMobileApi) Mvx.get_IoCProvider().Resolve<IDbMobileApi>();
      this._tokenValidator = (ITokenValidatorDb) Mvx.get_IoCProvider().Resolve<ITokenValidatorDb>();
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._profileDataService = (IProfileDbDataService) Mvx.get_IoCProvider().Resolve<IProfileDbDataService>();
      this._absenceDataService = (IAbsenceDbDataService) Mvx.get_IoCProvider().Resolve<IAbsenceDbDataService>();
      this._evaluationDataService = (IEvaluationDataService) Mvx.get_IoCProvider().Resolve<IEvaluationDataService>();
      this._noteDataService = (INoteDbDataService) Mvx.get_IoCProvider().Resolve<INoteDbDataService>();
      this._lessonDataService = (ILessonDataService) Mvx.get_IoCProvider().Resolve<ILessonDataService>();
      this._subjectAverageDataService = (ISubjectAverageDataService) Mvx.get_IoCProvider().Resolve<ISubjectAverageDataService>();
      this._studentDataService = (IStudentDataService) Mvx.get_IoCProvider().Resolve<IStudentDataService>();
      this._eventDataService = (IEventDataService) Mvx.get_IoCProvider().Resolve<IEventDataService>();
      this._teacherHomeWorkDataService = (ITeacherHomeWorkDataService) Mvx.get_IoCProvider().Resolve<ITeacherHomeWorkDataService>();
      this._studentHomeWorkDataService = (IStudentHomeWorkDataService) Mvx.get_IoCProvider().Resolve<IStudentHomeWorkDataService>();
      this._cacheDataService = (ICacheDataService) Mvx.get_IoCProvider().Resolve<ICacheDataService>();
      this._uzenetDataService = (IUzenetDataService) Mvx.get_IoCProvider().Resolve<IUzenetDataService>();
      this._examDataService = (IExamDataService) Mvx.get_IoCProvider().Resolve<IExamDataService>();
      this._instituteDataService = (IInstituteDataService) Mvx.get_IoCProvider().Resolve<IInstituteDataService>();
    }

    public async Task<ProfileRealm> Login(
      InstituteRealm institute,
      string username,
      string password)
    {
      if (!this.IsInstituteValid(institute))
        throw new InvalidInstitudeDataException(nameof (institute)).SetErrorCode<InvalidInstitudeDataException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDbDataService.cs", 82);
      if (!this.IsUserNameValid(username))
        throw new ArgumentException(nameof (username));
      if (!this.IsPasswordValid(password))
        throw new ArgumentException(nameof (password));
      TokenData tokenAsync = await this._mobileApi.GetTokenAsync(institute.Url, username, password, institute.InstituteCode);
      TokenInfoRealm tokenInfo = new TokenInfoRealmMapper().To((Ekreta.Mobile.Core.Models.TokenInfo) JsonConvert.DeserializeObject<Ekreta.Mobile.Core.Models.TokenInfo>(TokenDecoder.Decode(tokenAsync.AccessToken)));
      switch (this._tokenValidator.Validate(tokenInfo))
      {
        case TokenValidation.VALID:
          this.DeleteOldSchoolYearIdProfiles(tokenInfo);
          return this.ProcessValidToken(institute, tokenAsync, tokenInfo);
        case TokenValidation.INVALID_USER_ROLE:
          throw new UserRoleException("Invalid User Role").SetErrorCode<UserRoleException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDbDataService.cs", 103);
        default:
          throw new LoginException("Invalid TokenData").SetErrorCode<LoginException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDbDataService.cs", 107);
      }
    }

    public async Task Relogin(CredentialRealm credentials)
    {
    }

    public void AddNewProfile(ProfileRealm profile)
    {
      this._profileDataService.AddOrUpdate(profile, (Action<ProfileRealm>) null);
    }

    public void DeleteProfile(ProfileRealm profile)
    {
      this._profileDataService.Delete(profile);
      if (!this.ShouldDeleteDataFromProfile(profile.RolelessId))
        return;
      this._absenceDataService.Delete(profile.RolelessId);
      this._noteDataService.Delete(profile.RolelessId);
    }

    public async Task<TokenData> RefreshToken(ProfileRealm profile)
    {
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      int num1 = (^this).\u003C\u003E1__state;
      TokenData storedTokenData;
      TokenData tokenData;
      TokenData result;
      try
      {
        storedTokenData = this._secureStore.GetTokenData(profile.Id);
        AuthDbDataService.refreshThrottleCounters.AddOrUpdate(profile.Id, 1, (Func<string, int, int>) ((key, oldValue) => oldValue++));
        TaskAwaiter awaiter1 = this._semaphore.WaitAsync().GetAwaiter();
        if (!awaiter1.IsCompleted)
        {
          int num2;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num2 = 0;
          TaskAwaiter taskAwaiter = awaiter1;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, AuthDbDataService.\u003CRefreshToken\u003Ed__25>(ref awaiter1, this);
          return;
        }
        awaiter1.GetResult();
        tokenData = (TokenData) null;
        try
        {
          if (AuthDbDataService.refreshThrottleCounters[profile.Id] > 1 && storedTokenData != null)
          {
            tokenData = storedTokenData;
          }
          else
          {
            TaskAwaiter<TokenData> awaiter2 = this._mobileApi.RefreshTokenAsync(profile.Institute.Url, storedTokenData?.RefreshToken).GetAwaiter();
            if (!awaiter2.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num1 = 1;
              TaskAwaiter<TokenData> taskAwaiter = awaiter2;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<TokenData>, AuthDbDataService.\u003CRefreshToken\u003Ed__25>(ref awaiter2, this);
              return;
            }
            tokenData = awaiter2.GetResult();
            this._secureStore.SaveTokenData(profile.Id, tokenData);
          }
        }
        catch (RefreshTokenDbException ex)
        {
          ex.SetErrorCode<RefreshTokenDbException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDbDataService.cs", 189);
          ex.Profile = profile;
          ErrorHandler.Current.HandleError((Exception) ex);
        }
        finally
        {
          if (num1 < 0)
          {
            int num2 = AuthDbDataService.refreshThrottleCounters[profile.Id]--;
            if (AuthDbDataService.refreshThrottleCounters[profile.Id] == 0)
              AuthDbDataService.refreshThrottleCounters.TryRemove(profile.Id, out num2);
            this._semaphore.Release();
          }
        }
        result = tokenData;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        storedTokenData = (TokenData) null;
        tokenData = (TokenData) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      storedTokenData = (TokenData) null;
      tokenData = (TokenData) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    private void DeleteOldSchoolYearIdProfiles(TokenInfoRealm tokenInfo)
    {
      List<ProfileRealm> list = this._profileDataService.GetProfiles().Where<ProfileRealm>((Func<ProfileRealm, bool>) (x => x.TokenInfo?.InstituteCode == tokenInfo.InstituteCode && x.TokenInfo?.SchoolYearId != tokenInfo?.SchoolYearId)).ToList<ProfileRealm>();
      int num = list.Count<ProfileRealm>();
      for (int index = 0; index < num; ++index)
        this.DeleteProfile(list[index]);
    }

    private ProfileRealm ProcessValidToken(
      InstituteRealm institute,
      TokenData tokenData,
      TokenInfoRealm tokenInfo)
    {
      ProfileRealm profile = this._profileDataService.GetProfile(this._tokenValidator.GetProfileIdFromTokenData(tokenInfo)) ?? this.CreateNewProfile(institute, tokenInfo);
      this._profileDataService.UpdateTokenData(profile, tokenData);
      if (profile == null)
        throw new LoginException("Can't create profile. Profile was null in ProcessValidToken(TokenData)").SetErrorCode<LoginException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDbDataService.cs", 232);
      this._profileDataService.SetActiveProfile(profile);
      return profile;
    }

    private ProfileRealm CreateNewProfile(
      InstituteRealm institute,
      TokenInfoRealm tokenInfo)
    {
      string profileIdFromTokenData = this._tokenValidator.GetProfileIdFromTokenData(tokenInfo);
      return new ProfileRealm()
      {
        Id = profileIdFromTokenData,
        TokenInfo = tokenInfo,
        Institute = institute
      };
    }

    private bool IsInstituteValid(InstituteRealm institute)
    {
      return institute != null && !string.IsNullOrWhiteSpace(institute.InstituteCode) && (!string.IsNullOrWhiteSpace(institute.InstituteId) && !string.IsNullOrWhiteSpace(institute.Url)) && Uri.IsWellFormedUriString(institute.Url, UriKind.Absolute);
    }

    private bool IsPasswordValid(string password)
    {
      return !string.IsNullOrWhiteSpace(password);
    }

    private bool IsUserNameValid(string username)
    {
      return !string.IsNullOrWhiteSpace(username);
    }

    private bool ShouldDeleteDataFromProfile(string rolelessId)
    {
      return this._profileDataService.CountProfilesForRolelessId(rolelessId) == 0;
    }
  }
}
