// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.Login.AuthDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Client.Validation;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
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
  public class AuthDataService : IAuthDataService, IDataService
  {
    private static ConcurrentDictionary<string, int> refreshThrottleCounters = new ConcurrentDictionary<string, int>();
    private readonly SemaphoreSlim _semaphore = new SemaphoreSlim(1, 1);
    private readonly IMobileApi _mobileApi;
    private readonly ITokenValidator _tokenValidator;
    private readonly ISecureStore _secureStore;
    private readonly IMvxMessenger _messenger;
    private readonly IProfileDataService _profileDataService;
    private readonly IAbsenceDataService _absenceDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly INoteDataService _noteDataService;
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

    public AuthDataService()
    {
      this._mobileApi = (IMobileApi) Mvx.get_IoCProvider().Resolve<IMobileApi>();
      this._tokenValidator = (ITokenValidator) Mvx.get_IoCProvider().Resolve<ITokenValidator>();
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      this._absenceDataService = (IAbsenceDataService) Mvx.get_IoCProvider().Resolve<IAbsenceDataService>();
      this._evaluationDataService = (IEvaluationDataService) Mvx.get_IoCProvider().Resolve<IEvaluationDataService>();
      this._noteDataService = (INoteDataService) Mvx.get_IoCProvider().Resolve<INoteDataService>();
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

    public async Task<Profile> Login(
      Institute institute,
      string username,
      string password)
    {
      if (!this.IsInstituteValid(institute))
        throw new InvalidInstitudeDataException(nameof (institute)).SetErrorCode<InvalidInstitudeDataException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDataService.cs", 78);
      if (!this.IsUserNameValid(username))
        throw new ArgumentException(nameof (username));
      if (!this.IsPasswordValid(password))
        throw new ArgumentException(nameof (password));
      TokenData tokenAsync = await this._mobileApi.GetTokenAsync(institute.Url, username, password, institute.InstituteCode);
      TokenInfo tokenInfo = (TokenInfo) JsonConvert.DeserializeObject<TokenInfo>(TokenDecoder.Decode(tokenAsync.AccessToken));
      switch (this._tokenValidator.Validate(tokenInfo))
      {
        case TokenValidation.VALID:
          this.DeleteOldSchoolYearIdProfiles(tokenInfo);
          return this.ProcessValidToken(institute, tokenAsync, tokenInfo);
        case TokenValidation.INVALID_USER_ROLE:
          throw new UserRoleException("Invalid User Role").SetErrorCode<UserRoleException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDataService.cs", 97);
        default:
          throw new LoginException("Invalid TokenData").SetErrorCode<LoginException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDataService.cs", 101);
      }
    }

    public async Task Relogin(Credentials credentials)
    {
      try
      {
        Profile profile = await this.Login(this._instituteDataService.GetInstituteById(credentials.InstitudeId), credentials.UserName, credentials.Password);
      }
      catch (Exception ex)
      {
        throw new RefreshTokenException("Sikertelen újra loginolás").SetErrorCode<RefreshTokenException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDataService.cs", 114);
      }
    }

    public void AddNewProfile(Profile profile)
    {
      this._profileDataService.AddOrUpdate(profile);
      this._absenceDataService.AddOrUpdate(profile, profile.Student.Absences);
      this._evaluationDataService.AddOrUpdate(profile, profile.Student.Evaluations);
      this._noteDataService.AddOrUpdate(profile, profile.Student.Notes);
      this._lessonDataService.AddOrUpdate(profile, profile.Student.Lessons);
      this._studentDataService.AddOrUpdate(profile, profile.Student);
      this._eventDataService.AddOrUpdate(profile, profile.Events);
      this._examDataService.AddOrUpdate(profile, profile.Exams);
    }

    public void DeleteProfile(Profile profile)
    {
      this._profileDataService.Delete(profile);
      if (this.ShouldDeleteDataFromProfile(profile.RolelessId))
      {
        this._absenceDataService.Delete(profile);
        this._evaluationDataService.Delete(profile);
        this._noteDataService.Delete(profile);
        this._lessonDataService.Delete(profile);
        this._subjectAverageDataService.Delete(profile);
        this._teacherHomeWorkDataService.Delete(profile);
        this._studentHomeWorkDataService.Delete(profile);
        this._eventDataService.Delete(profile);
        this._uzenetDataService.Delete(profile);
        this._examDataService.Delete(profile);
        this._studentDataService.Delete(this._studentDataService.GetStudent(profile));
      }
      this._secureStore.DeleteTokenData(profile.Id);
      this._cacheDataService.ClearProfileCache(profile);
    }

    public async Task<TokenData> RefreshToken(Profile profile)
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
        AuthDataService.refreshThrottleCounters.AddOrUpdate(profile.Id, 1, (Func<string, int, int>) ((key, oldValue) => oldValue++));
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
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, AuthDataService.\u003CRefreshToken\u003Ed__25>(ref awaiter1, this);
          return;
        }
        awaiter1.GetResult();
        tokenData = (TokenData) null;
        try
        {
          if (AuthDataService.refreshThrottleCounters[profile.Id] > 1 && storedTokenData != null)
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
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<TokenData>, AuthDataService.\u003CRefreshToken\u003Ed__25>(ref awaiter2, this);
              return;
            }
            tokenData = awaiter2.GetResult();
            this._secureStore.SaveTokenData(profile.Id, tokenData);
          }
        }
        catch (RefreshTokenException ex)
        {
          ex.SetErrorCode<RefreshTokenException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDataService.cs", 182);
          ex.Profile = profile;
          ErrorHandler.Current.HandleError((Exception) ex);
        }
        finally
        {
          if (num1 < 0)
          {
            int num2 = AuthDataService.refreshThrottleCounters[profile.Id]--;
            if (AuthDataService.refreshThrottleCounters[profile.Id] == 0)
              AuthDataService.refreshThrottleCounters.TryRemove(profile.Id, out num2);
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

    private void DeleteOldSchoolYearIdProfiles(TokenInfo tokenInfo)
    {
      List<Profile> list = this._profileDataService.GetProfiles().Where<Profile>((Func<Profile, bool>) (x => x.TokenInfo?.InstituteCode == tokenInfo.InstituteCode && x.TokenInfo?.SchoolYearId != tokenInfo?.SchoolYearId)).ToList<Profile>();
      int num = list.Count<Profile>();
      for (int index = 0; index < num; ++index)
        this.DeleteProfile(list[index]);
    }

    private Profile ProcessValidToken(
      Institute institute,
      TokenData tokenData,
      TokenInfo tokenInfo)
    {
      Profile profile = this._profileDataService.GetProfile(this._tokenValidator.GetProfileIdFromTokenData(tokenInfo)) ?? this.CreateNewProfile(institute, tokenInfo);
      this._profileDataService.UpdateTokenData(profile, tokenData);
      if (profile == null)
        throw new LoginException("Can't create profile. Profile was null in ProcessValidToken(TokenData)").SetErrorCode<LoginException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Login/AuthDataService.cs", 225);
      this._profileDataService.SetActiveProfile(profile);
      this._messenger.Publish<ActiveProfileChangedMessage>((M0) new ActiveProfileChangedMessage((object) this, profile));
      return profile;
    }

    private Profile CreateNewProfile(Institute institute, TokenInfo tokenInfo)
    {
      string profileIdFromTokenData = this._tokenValidator.GetProfileIdFromTokenData(tokenInfo);
      return new Profile()
      {
        Id = profileIdFromTokenData,
        TokenInfo = tokenInfo,
        Institute = institute
      };
    }

    private bool IsInstituteValid(Institute institute)
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
