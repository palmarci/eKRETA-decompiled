// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.MobileApi
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Models.Exception;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Models.Validation;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Services.Handlers;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using Newtonsoft.Json;
using Plugin.Connectivity.Abstractions;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Web;

namespace Ekreta.Mobile.Core.Services
{
  public class MobileApi : IMobileApi
  {
    private const string ApiVersion = "v1";
    private readonly ICacheDataService _cacheDataService;
    private readonly ISecureStore _secureStore;
    private readonly IUserAgentService _userAgentData;
    private readonly IMvxMessenger _messenger;
    private IDeviceSpecification _deviceSpecification;

    public MobileApi(
      ICacheDataService cacheDataService,
      ISecureStore secureStore,
      IUserAgentService userAgentData,
      IMvxMessenger messenger)
    {
      this._cacheDataService = cacheDataService;
      this._secureStore = secureStore;
      this._userAgentData = userAgentData;
      this._messenger = messenger;
      this._deviceSpecification = (IDeviceSpecification) Mvx.get_IoCProvider().Resolve<IDeviceSpecification>();
    }

    public async Task<IEnumerable<Event>> GetEventsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false)
    {
      string key;
      IEnumerable<Event> result;
      try
      {
        Dictionary<string, string> parameters = new Dictionary<string, string>();
        if (fromDate.HasValue)
          parameters.Add(nameof (fromDate), fromDate.Value.ToString("yyyy-MM-dd"));
        if (toDate.HasValue)
          parameters.Add(nameof (toDate), toDate.Value.ToString("yyyy-MM-dd"));
        string[] strArray = new string[7]
        {
          profile.Institute.InstituteCode,
          "-",
          profile.Id,
          "-Event-",
          null,
          null,
          null
        };
        ref DateTime? local1 = ref fromDate;
        DateTime valueOrDefault;
        string str1;
        if (!local1.HasValue)
        {
          str1 = (string) null;
        }
        else
        {
          valueOrDefault = local1.GetValueOrDefault();
          str1 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        strArray[4] = str1;
        strArray[5] = "-";
        ref DateTime? local2 = ref toDate;
        string str2;
        if (!local2.HasValue)
        {
          str2 = (string) null;
        }
        else
        {
          valueOrDefault = local2.GetValueOrDefault();
          str2 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        strArray[6] = str2;
        key = string.Concat(strArray);
        IEnumerable<Event> events = this.GetObjectFromCache<IEnumerable<Event>>(key);
        if (events == null | forceRefresh)
        {
          TaskAwaiter<IEnumerable<Event>> awaiter = this.SendAsync<IEnumerable<Event>>(HttpMethod.Get, profile.Institute.Url, "mapi", "EventAmi", parameters, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, false, new int?(), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<IEnumerable<Event>> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<Event>>, MobileApi.\u003CGetEventsAsync\u003Ed__7>(ref awaiter, this);
            return;
          }
          events = awaiter.GetResult();
          this.SaveObjectToCache<IEnumerable<Event>>(key, events);
        }
        else
          this.SendCachedDataMessage<IEnumerable<Event>>(key);
        result = events;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<IEnumerable<Lesson>> GetLessonsAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false)
    {
      string key;
      IEnumerable<Lesson> result;
      try
      {
        Dictionary<string, string> dictionary = new Dictionary<string, string>();
        ref DateTime? local1 = ref fromDate;
        DateTime valueOrDefault;
        string str1;
        if (!local1.HasValue)
        {
          str1 = (string) null;
        }
        else
        {
          valueOrDefault = local1.GetValueOrDefault();
          str1 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        dictionary.Add(nameof (fromDate), str1);
        ref DateTime? local2 = ref toDate;
        string str2;
        if (!local2.HasValue)
        {
          str2 = (string) null;
        }
        else
        {
          valueOrDefault = local2.GetValueOrDefault();
          str2 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        dictionary.Add(nameof (toDate), str2);
        Dictionary<string, string> parameters = dictionary;
        string[] strArray = new string[7]
        {
          profile.Institute.InstituteCode,
          "-",
          profile.Id,
          "-Lesson-",
          null,
          null,
          null
        };
        ref DateTime? local3 = ref fromDate;
        string str3;
        if (!local3.HasValue)
        {
          str3 = (string) null;
        }
        else
        {
          valueOrDefault = local3.GetValueOrDefault();
          str3 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        strArray[4] = str3;
        strArray[5] = "-";
        ref DateTime? local4 = ref toDate;
        string str4;
        if (!local4.HasValue)
        {
          str4 = (string) null;
        }
        else
        {
          valueOrDefault = local4.GetValueOrDefault();
          str4 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        strArray[6] = str4;
        key = string.Concat(strArray);
        IEnumerable<Lesson> lessons = this.GetObjectFromCache<IEnumerable<Lesson>>(key);
        if (lessons == null | forceRefresh)
        {
          TaskAwaiter<IEnumerable<Lesson>> awaiter = this.SendAsync<IEnumerable<Lesson>>(HttpMethod.Get, profile.Institute.Url, "mapi", "LessonAmi", parameters, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, false, new int?(), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<IEnumerable<Lesson>> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<Lesson>>, MobileApi.\u003CGetLessonsAsync\u003Ed__8>(ref awaiter, this);
            return;
          }
          lessons = awaiter.GetResult();
          this.SaveObjectToCache<IEnumerable<Lesson>>(key, lessons);
        }
        else
          this.SendCachedDataMessage<IEnumerable<Lesson>>(key);
        result = lessons;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<Student> GetStudentAsync(
      Profile profile,
      DateTime? fromDate = null,
      DateTime? toDate = null,
      bool forceRefresh = false)
    {
      string key;
      Student result;
      try
      {
        Dictionary<string, string> parameters = new Dictionary<string, string>();
        key = profile.Institute.InstituteCode + "-" + profile.Id + "-Student";
        DateTime valueOrDefault;
        if (fromDate.HasValue)
        {
          Dictionary<string, string> dictionary = parameters;
          ref DateTime? local = ref fromDate;
          string str;
          if (!local.HasValue)
          {
            str = (string) null;
          }
          else
          {
            valueOrDefault = local.GetValueOrDefault();
            str = valueOrDefault.ToString("yyyy-MM-ddTHH:mm:ss");
          }
          dictionary.Add(nameof (fromDate), str);
          key = key + "-" + parameters[nameof (fromDate)];
        }
        if (toDate.HasValue)
        {
          Dictionary<string, string> dictionary = parameters;
          ref DateTime? local = ref toDate;
          string str;
          if (!local.HasValue)
          {
            str = (string) null;
          }
          else
          {
            valueOrDefault = local.GetValueOrDefault();
            str = valueOrDefault.ToString("yyyy-MM-ddTHH:mm:ss");
          }
          dictionary.Add(nameof (toDate), str);
          key = key + "-" + parameters[nameof (toDate)];
        }
        Student student = this.GetObjectFromCache<Student>(key);
        if (student == null | forceRefresh)
        {
          TaskAwaiter<Student> awaiter = this.SendAsync<Student>(HttpMethod.Get, profile.Institute.Url, "mapi", "StudentAmi", parameters, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, false, new int?(), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<Student> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Student>, MobileApi.\u003CGetStudentAsync\u003Ed__9>(ref awaiter, this);
            return;
          }
          student = awaiter.GetResult();
          this.SaveObjectToCache<Student>(key, student);
        }
        else
          this.SendCachedDataMessage<Student>(key);
        result = student;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<IEnumerable<SubjectAverage>> GetSubjectAveragesAsync(
      Profile profile,
      bool forceRefresh = false)
    {
      string key;
      IEnumerable<SubjectAverage> result;
      try
      {
        key = profile.Institute.InstituteCode + "-" + profile.Id + "-SubjectAverages";
        IEnumerable<SubjectAverage> subjectAverages = this.GetObjectFromCache<IEnumerable<SubjectAverage>>(key);
        if (subjectAverages == null | forceRefresh)
        {
          TaskAwaiter<List<SubjectAverage>> awaiter = this.SendAsync<List<SubjectAverage>>(HttpMethod.Get, profile.Institute.Url, "mapi", "TantargyiAtlagAmi", (Dictionary<string, string>) null, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, false, new int?(), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<List<SubjectAverage>> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<List<SubjectAverage>>, MobileApi.\u003CGetSubjectAveragesAsync\u003Ed__10>(ref awaiter, this);
            return;
          }
          subjectAverages = (IEnumerable<SubjectAverage>) awaiter.GetResult();
          this.SaveObjectToCache<IEnumerable<SubjectAverage>>(key, subjectAverages);
        }
        else
          this.SendCachedDataMessage<IEnumerable<SubjectAverage>>(key);
        result = subjectAverages;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<IEnumerable<Exam>> GetExamsAsync(
      Profile profile,
      DateTime? DatumTol = null,
      DateTime? DatumIg = null,
      bool forceRefresh = false)
    {
      string key;
      IEnumerable<Exam> result;
      try
      {
        Dictionary<string, string> dictionary = new Dictionary<string, string>();
        ref DateTime? local1 = ref DatumTol;
        DateTime valueOrDefault;
        string str1;
        if (!local1.HasValue)
        {
          str1 = (string) null;
        }
        else
        {
          valueOrDefault = local1.GetValueOrDefault();
          str1 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        if (str1 == null)
          str1 = "null";
        dictionary.Add(nameof (DatumTol), str1);
        ref DateTime? local2 = ref DatumIg;
        string str2;
        if (!local2.HasValue)
        {
          str2 = (string) null;
        }
        else
        {
          valueOrDefault = local2.GetValueOrDefault();
          str2 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        if (str2 == null)
          str2 = "null";
        dictionary.Add(nameof (DatumIg), str2);
        Dictionary<string, string> parameters = dictionary;
        string[] strArray = new string[7]
        {
          profile.Institute.InstituteCode,
          "-",
          profile.Id,
          "-BejelentettSzamonkeres-",
          null,
          null,
          null
        };
        ref DateTime? local3 = ref DatumTol;
        string str3;
        if (!local3.HasValue)
        {
          str3 = (string) null;
        }
        else
        {
          valueOrDefault = local3.GetValueOrDefault();
          str3 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        strArray[4] = str3;
        strArray[5] = "-";
        ref DateTime? local4 = ref DatumIg;
        string str4;
        if (!local4.HasValue)
        {
          str4 = (string) null;
        }
        else
        {
          valueOrDefault = local4.GetValueOrDefault();
          str4 = valueOrDefault.ToString("yyyy-MM-dd");
        }
        strArray[6] = str4;
        key = string.Concat(strArray);
        IEnumerable<Exam> exams = this.GetObjectFromCache<IEnumerable<Exam>>(key);
        if (exams == null | forceRefresh)
        {
          TaskAwaiter<IEnumerable<Exam>> awaiter = this.SendAsync<IEnumerable<Exam>>(HttpMethod.Get, profile.Institute.Url, "mapi", "BejelentettSzamonkeresAmi", parameters, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, false, new int?(), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<IEnumerable<Exam>> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<Exam>>, MobileApi.\u003CGetExamsAsync\u003Ed__11>(ref awaiter, this);
            return;
          }
          exams = awaiter.GetResult();
          this.SaveObjectToCache<IEnumerable<Exam>>(key, exams);
        }
        else
          this.SendCachedDataMessage<IEnumerable<Event>>(key);
        result = exams;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task SendJustificationAsync(
      Profile profile,
      string verificationType,
      DateTime fromDate,
      DateTime toDate,
      string comment,
      byte[] pictureData)
    {
      Dictionary<string, string> dictionary = new Dictionary<string, string>()
      {
        {
          nameof (fromDate),
          fromDate.ToString("yyyy-MM-dd")
        },
        {
          nameof (toDate),
          toDate.ToString("yyyy-MM-dd")
        },
        {
          nameof (comment),
          comment
        },
        {
          "type",
          verificationType
        }
      };
      object obj = await this.SendAsync<object>(HttpMethod.Post, profile.Institute.Url, "mapi", "Justification", (Dictionary<string, string>) null, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, false, new int?(), true, new HttpStatusCode?());
    }

    public async Task<TokenData> GetTokenAsync(
      string instituteUrl,
      string userName,
      string password,
      string instituteCode)
    {
      Dictionary<string, string> parameters = new Dictionary<string, string>();
      parameters.Add("institute_code", instituteCode);
      parameters.Add(nameof (userName), HttpUtility.UrlEncode(userName));
      parameters.Add(nameof (password), HttpUtility.UrlEncode(password));
      parameters.Add("grant_type", nameof (password));
      parameters.Add("client_id", ConfigurationRepository.EnvironmentSetting.MobileApiAudienceClientId);
      HttpClient customHttpClient = new HttpClient((HttpMessageHandler) HttpClientHelpers.GetClientHandler(true));
      TokenData tokenData = await this.SendAsync<TokenData>(HttpMethod.Post, instituteUrl, "idp", "Token", parameters, MobileApi.ParameterBodyType.FormUrlEncoded, customHttpClient, (Profile) null, false, new int?(), true, new HttpStatusCode?());
      int result;
      int.TryParse(tokenData.ExpiresIn, out result);
      tokenData.ExpiresAt = DateTime.Now.AddSeconds((double) result);
      return tokenData;
    }

    public async Task<TokenData> RefreshTokenAsync(
      string instituteUrl,
      string refreshToken)
    {
      Dictionary<string, string> parameters = new Dictionary<string, string>()
      {
        {
          "refresh_token",
          refreshToken
        },
        {
          "grant_type",
          "refresh_token"
        },
        {
          "client_id",
          ConfigurationRepository.EnvironmentSetting.MobileApiAudienceClientId
        }
      };
      HttpClient customHttpClient = new HttpClient((HttpMessageHandler) HttpClientHelpers.GetClientHandler(true));
      TokenData tokenData;
      try
      {
        tokenData = await this.SendAsync<TokenData>(HttpMethod.Post, instituteUrl, "idp", "Token", parameters, MobileApi.ParameterBodyType.FormUrlEncoded, customHttpClient, (Profile) null, false, new int?(), true, new HttpStatusCode?());
        int result;
        int.TryParse(tokenData?.ExpiresIn, out result);
        tokenData.ExpiresAt = DateTime.Now.AddSeconds((double) result);
      }
      catch (System.Exception ex)
      {
        ex.SetErrorCode<System.Exception>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 244);
        switch (ex)
        {
          case ServerValidationException _:
          case UnauthorizedApiAccessException _:
            throw new RefreshTokenException("Nem sikerült a token frissítése");
          default:
            throw;
        }
      }
      return tokenData;
    }

    public async Task<TanarHaziFeladat> GetTanarHaziFeladatAsync(
      Profile profile,
      int tanarHaziFeladatId,
      bool forceRefresh = false)
    {
      string key;
      TanarHaziFeladat result;
      try
      {
        key = string.Format("{0}-{1}-TanarHaziFeladat-{2}", (object) profile.Institute.InstituteCode, (object) profile.Id, (object) tanarHaziFeladatId);
        TanarHaziFeladat tanarHaziFeladat = (TanarHaziFeladat) null;
        try
        {
          tanarHaziFeladat = this.GetObjectFromCache<TanarHaziFeladat>(key);
        }
        catch (KeyNotFoundException ex)
        {
        }
        if (tanarHaziFeladat == null | forceRefresh)
        {
          TaskAwaiter<TanarHaziFeladat> awaiter = this.SendAsync<TanarHaziFeladat>(HttpMethod.Get, profile.Institute.Url, "mapi", "HaziFeladat/TanarHaziFeladat", (Dictionary<string, string>) null, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, true, new int?(tanarHaziFeladatId), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<TanarHaziFeladat> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<TanarHaziFeladat>, MobileApi.\u003CGetTanarHaziFeladatAsync\u003Ed__15>(ref awaiter, this);
            return;
          }
          tanarHaziFeladat = awaiter.GetResult();
          this.SaveObjectToCache<TanarHaziFeladat>(key, tanarHaziFeladat);
        }
        result = tanarHaziFeladat;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<TanuloHaziFeladatCreateResponse> CreateTanuloHaziFeladatAsync(
      Profile profile,
      Lesson lesson,
      string feladatSzovege)
    {
      MobileApi mobileApi1 = this;
      Dictionary<string, string> dictionary1 = new Dictionary<string, string>();
      Dictionary<string, string> dictionary2;
      int? nullable;
      if (!lesson.TeacherHomeWorkId.HasValue)
      {
        Dictionary<string, string> dictionary3 = new Dictionary<string, string>();
        dictionary3.Add("OraId", lesson.LessonId.ToString());
        DateTime dateTime = lesson.Date;
        dictionary3.Add("OraDate", dateTime.ToString());
        dictionary3.Add("OraType", lesson.CalendarOraType);
        dateTime = DateTime.Today;
        dateTime = dateTime.AddDays(7.0);
        dateTime = dateTime.ToUniversalTime();
        dictionary3.Add("HataridoUtc", dateTime.ToString("yyyy-MM-ddTHH:mm:ssZ"));
        dictionary3.Add("FeladatSzovege", feladatSzovege);
        dictionary2 = dictionary3;
      }
      else
      {
        Dictionary<string, string> dictionary3 = new Dictionary<string, string>();
        nullable = lesson.TeacherHomeWorkId;
        dictionary3.Add("TanarHaziFeladatId", nullable.ToString());
        dictionary3.Add("FeladatSzovege", feladatSzovege);
        dictionary2 = dictionary3;
      }
      MobileApi mobileApi2 = mobileApi1;
      HttpMethod post = HttpMethod.Post;
      string url = profile.Institute.Url;
      Profile profile1 = profile;
      Dictionary<string, string> parameters = dictionary2;
      Profile profile2 = profile1;
      nullable = new int?();
      int? resourceId = nullable;
      HttpStatusCode? expectedSuccessStatusCode = new HttpStatusCode?();
      return await mobileApi2.SendAsync<TanuloHaziFeladatCreateResponse>(post, url, "mapi", "HaziFeladat/CreateTanuloHaziFeladat", parameters, MobileApi.ParameterBodyType.JsonBody, (HttpClient) null, profile2, false, resourceId, false, expectedSuccessStatusCode);
    }

    public async Task SaveTeacherHomeWorkDoneStatusAsync(
      Profile profile,
      string teacherHomeWorkId,
      bool done)
    {
      MobileApi mobileApi1 = this;
      Dictionary<string, string> dictionary1 = new Dictionary<string, string>();
      Dictionary<string, string> dictionary2 = new Dictionary<string, string>()
      {
        {
          "TanarHaziFeladatId",
          teacherHomeWorkId.ToString()
        },
        {
          "IsMegoldva",
          done.ToString()
        }
      };
      MobileApi mobileApi2 = mobileApi1;
      HttpMethod post = HttpMethod.Post;
      string url = profile.Institute.Url;
      Profile profile1 = profile;
      Dictionary<string, string> parameters = dictionary2;
      Profile profile2 = profile1;
      int? resourceId = new int?();
      HttpStatusCode? expectedSuccessStatusCode = new HttpStatusCode?(HttpStatusCode.NoContent);
      ValidationException validationException = await mobileApi2.SendAsync<ValidationException>(post, url, "mapi", "HaziFeladat/Megoldva", parameters, MobileApi.ParameterBodyType.JsonBody, (HttpClient) null, profile2, false, resourceId, false, expectedSuccessStatusCode);
    }

    public async Task<IEnumerable<TanuloHaziFeladat>> GetTanuloHaziFeladatListaAsync(
      Profile profile,
      int tanarHaziFeladatId,
      bool forceRefresh = true)
    {
      string key;
      IEnumerable<TanuloHaziFeladat> result;
      try
      {
        key = string.Format("{0}-{1}-TanuloHaziFeladatLista-{2}", (object) profile.Institute.InstituteCode, (object) profile.Id, (object) tanarHaziFeladatId);
        IEnumerable<TanuloHaziFeladat> tanuloHaziFeladats = (IEnumerable<TanuloHaziFeladat>) null;
        try
        {
          tanuloHaziFeladats = this.GetObjectFromCache<IEnumerable<TanuloHaziFeladat>>(key);
        }
        catch (KeyNotFoundException ex)
        {
        }
        if (tanuloHaziFeladats == null | forceRefresh)
        {
          TaskAwaiter<IEnumerable<TanuloHaziFeladat>> awaiter = this.SendAsync<IEnumerable<TanuloHaziFeladat>>(HttpMethod.Get, profile.Institute.Url, "mapi", "HaziFeladat/TanuloHaziFeladatLista", (Dictionary<string, string>) null, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, true, new int?(tanarHaziFeladatId), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<IEnumerable<TanuloHaziFeladat>> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<TanuloHaziFeladat>>, MobileApi.\u003CGetTanuloHaziFeladatListaAsync\u003Ed__18>(ref awaiter, this);
            return;
          }
          tanuloHaziFeladats = awaiter.GetResult();
          this.SaveObjectToCache<IEnumerable<TanuloHaziFeladat>>(key, tanuloHaziFeladats);
        }
        result = tanuloHaziFeladats;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<TanuloHaziFeladat> GetTanuloHaziFeladatAsync(
      Profile profile,
      int tanuloHaziFeladatId,
      bool forceRefresh = true)
    {
      string key;
      TanuloHaziFeladat result;
      try
      {
        key = string.Format("{0}-{1}-TanuloHaziFeladat-{2}", (object) profile.Institute.InstituteCode, (object) profile.Id, (object) tanuloHaziFeladatId);
        TanuloHaziFeladat tanuloHaziFeladat = (TanuloHaziFeladat) null;
        try
        {
          tanuloHaziFeladat = this.GetObjectFromCache<TanuloHaziFeladat>(key);
        }
        catch (KeyNotFoundException ex)
        {
        }
        if (tanuloHaziFeladat == null | forceRefresh)
        {
          TaskAwaiter<TanuloHaziFeladat> awaiter = this.SendAsync<TanuloHaziFeladat>(HttpMethod.Get, profile.Institute.Url, "mapi", "Hazifeladat/TanuloHaziFeladat", (Dictionary<string, string>) null, MobileApi.ParameterBodyType.None, (HttpClient) null, profile, true, new int?(tanuloHaziFeladatId), true, new HttpStatusCode?()).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<TanuloHaziFeladat> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<TanuloHaziFeladat>, MobileApi.\u003CGetTanuloHaziFeladatAsync\u003Ed__19>(ref awaiter, this);
            return;
          }
          tanuloHaziFeladat = awaiter.GetResult();
          this.SaveObjectToCache<TanuloHaziFeladat>(key, tanuloHaziFeladat);
        }
        result = tanuloHaziFeladat;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        key = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      key = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task DeleteTanuloHaziFeladatAsync(Profile profile, int tanuloHaziFeladatId)
    {
      MobileApi mobileApi1 = this;
      Dictionary<string, string> dictionary = new Dictionary<string, string>()
      {
        {
          "id",
          tanuloHaziFeladatId.ToString()
        }
      };
      MobileApi mobileApi2 = mobileApi1;
      HttpMethod delete = HttpMethod.Delete;
      string url = profile.Institute.Url;
      Profile profile1 = profile;
      Dictionary<string, string> parameters = dictionary;
      Profile profile2 = profile1;
      int? resourceId = new int?(tanuloHaziFeladatId);
      HttpStatusCode? expectedSuccessStatusCode = new HttpStatusCode?();
      TanuloHaziFeladat tanuloHaziFeladat = await mobileApi2.SendAsync<TanuloHaziFeladat>(delete, url, "mapi", "HaziFeladat/DeleteTanuloHaziFeladat", parameters, MobileApi.ParameterBodyType.JsonBody, (HttpClient) null, profile2, true, resourceId, true, expectedSuccessStatusCode);
    }

    protected async Task<T> SendAsync<T>(
      HttpMethod method,
      string instituteUrl,
      string endpointType,
      string endpoint,
      Dictionary<string, string> parameters = null,
      MobileApi.ParameterBodyType sendParametersAs = MobileApi.ParameterBodyType.None,
      HttpClient customHttpClient = null,
      Profile profile = null,
      bool isResourceUrl = false,
      int? resourceId = null,
      bool isGzipEnabled = true,
      HttpStatusCode? expectedSuccessStatusCode = null)
      where T : class
    {
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      int num = (^this).\u003C\u003E1__state;
      T result;
      Uri uri;
      IConnectivity connectivity;
      T result1;
      try
      {
        result = default (T);
        uri = (Uri) null;
        connectivity = (IConnectivity) Mvx.get_IoCProvider().Resolve<IConnectivity>();
        if (!connectivity.get_IsConnected())
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 437);
        if (isResourceUrl)
        {
          if (!resourceId.HasValue)
            throw new HttpRequestException("MobileApi.SendAsync: resourceId can't be null, if isResourceUrl is true").SetErrorCode<HttpRequestException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 446);
          uri = new Uri(new Uri(instituteUrl), string.Format("{0}/api/{1}/{2}/{3}", (object) endpointType, (object) "v1", (object) endpoint, (object) resourceId));
        }
        else
          uri = new Uri(new Uri(instituteUrl), string.Format(endpointType + "/api/v1/" + endpoint));
        HttpRequestMessage httpRequestMessage = new HttpRequestMessage(method, uri);
        switch (sendParametersAs)
        {
          case MobileApi.ParameterBodyType.None:
            if (parameters != null)
            {
              Dictionary<string, string>.Enumerator enumerator = parameters.GetEnumerator();
              try
              {
                while (enumerator.MoveNext())
                {
                  KeyValuePair<string, string> current = enumerator.Current;
                  uri = uri.AddParameter(current.Key, current.Value);
                }
              }
              finally
              {
                if (num < 0)
                  enumerator.Dispose();
              }
            }
            httpRequestMessage.RequestUri = uri;
            break;
          case MobileApi.ParameterBodyType.FormUrlEncoded:
            string content1 = string.Join("&", parameters.Select<KeyValuePair<string, string>, string>((Func<KeyValuePair<string, string>, string>) (x => string.Format(x.Key + "=" + x.Value))));
            httpRequestMessage.Content = (HttpContent) new StringContent(content1, Encoding.UTF8, "application/x-www-form-urlencoded");
            break;
          case MobileApi.ParameterBodyType.JsonBody:
            string content2 = JsonConvert.SerializeObject((object) parameters);
            httpRequestMessage.Content = (HttpContent) new StringContent(content2, Encoding.UTF8, "application/json");
            break;
        }
        httpRequestMessage.Headers.Add("Accept", "application/json");
        httpRequestMessage.Headers.Add(this._deviceSpecification.AgentName, this._userAgentData.UserAgentText);
        MobileApi.AddAccessTokenToHttpHeader(httpRequestMessage, profile);
        HttpClient httpClient = customHttpClient ?? this.BuildHttpClient(profile, isGzipEnabled);
        try
        {
          TaskAwaiter<HttpResponseMessage> awaiter1 = httpClient.SendAsync(httpRequestMessage).GetAwaiter();
          if (!awaiter1.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<HttpResponseMessage> taskAwaiter = awaiter1;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<HttpResponseMessage>, MobileApi.\u003CSendAsync\u003Ed__21<T>>(ref awaiter1, this);
            return;
          }
          HttpResponseMessage response = awaiter1.GetResult();
          TaskAwaiter<Stream> taskAwaiter1;
          if (response.IsSuccessStatusCode)
          {
            if (expectedSuccessStatusCode.HasValue)
            {
              int statusCode = (int) response.StatusCode;
              HttpStatusCode? nullable = expectedSuccessStatusCode;
              int valueOrDefault = (int) nullable.GetValueOrDefault();
              if (!(statusCode == valueOrDefault & nullable.HasValue))
                throw new NotExpectedSuccessStatusCodeException().SetErrorCode<NotExpectedSuccessStatusCodeException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 504);
            }
            if (response.StatusCode == HttpStatusCode.NoContent)
            {
              result1 = default (T);
              goto label_55;
            }
            else
            {
              TaskAwaiter<Stream> awaiter2 = response.Content.ReadAsStreamAsync().GetAwaiter();
              if (!awaiter2.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 1;
                taskAwaiter1 = awaiter2;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Stream>, MobileApi.\u003CSendAsync\u003Ed__21<T>>(ref awaiter2, this);
                return;
              }
              result = awaiter2.GetResult().Deserialize<T>();
            }
          }
          else
          {
            if (response.StatusCode == HttpStatusCode.BadRequest)
            {
              TaskAwaiter<Stream> awaiter2 = response.Content.ReadAsStreamAsync().GetAwaiter();
              if (awaiter2.IsCompleted)
                throw new ServerValidationException(awaiter2.GetResult().Deserialize<ValidationException>()).SetErrorCode<ServerValidationException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 525);
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 2;
              taskAwaiter1 = awaiter2;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Stream>, MobileApi.\u003CSendAsync\u003Ed__21<T>>(ref awaiter2, this);
              return;
            }
            if (response.StatusCode == HttpStatusCode.NotFound)
              throw new NotExistedElementException("Az elem nem található!").SetErrorCode<NotExistedElementException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 529);
            if (response.StatusCode == HttpStatusCode.Unauthorized)
            {
              TaskAwaiter<Stream> awaiter2 = response.Content.ReadAsStreamAsync().GetAwaiter();
              if (awaiter2.IsCompleted)
                throw new UnauthorizedApiAccessException("Unauthorized API Access: " + uri.AbsolutePath, awaiter2.GetResult().Deserialize<AuthorizationExceptionData>()).SetErrorCode<UnauthorizedApiAccessException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 537);
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 3;
              taskAwaiter1 = awaiter2;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Stream>, MobileApi.\u003CSendAsync\u003Ed__21<T>>(ref awaiter2, this);
              return;
            }
            if (!connectivity.get_IsConnected())
              throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 544);
            TaskAwaiter<string> awaiter3 = response.Content.ReadAsStringAsync().GetAwaiter();
            if (!awaiter3.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 4;
              TaskAwaiter<string> taskAwaiter2 = awaiter3;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<string>, MobileApi.\u003CSendAsync\u003Ed__21<T>>(ref awaiter3, this);
              return;
            }
            if (awaiter3.GetResult().Contains("User must have at least one role"))
              throw new NoUserRoleException().SetErrorCode<NoUserRoleException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 551);
            ErrorHandler.Current.HandleError((System.Exception) new ServerUnreachableException(response));
          }
          response = (HttpResponseMessage) null;
        }
        finally
        {
          if (num < 0 && httpClient != null)
            httpClient.Dispose();
        }
        httpClient = (HttpClient) null;
        result1 = result;
      }
      catch (System.Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        result = default (T);
        uri = (Uri) null;
        connectivity = (IConnectivity) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
label_55:
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      result = default (T);
      uri = (Uri) null;
      connectivity = (IConnectivity) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result1);
    }

    private void SendCachedDataMessage<T>(string key)
    {
      try
      {
        this._messenger.Publish<CachedDataMessage>((M0) new CachedDataMessage((object) this, TimeSpan.FromSeconds((double) ConfigurationRepository.EnvironmentSetting.CacheTimeoutInSeconds) - (DateTime.Now - this._cacheDataService.GetCacheData(key).ExpirationDate)));
      }
      catch (KeyNotFoundException ex)
      {
      }
      catch (System.Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "SendCachedDataMessage= " + key, "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 576);
      }
    }

    private T GetObjectFromCache<T>(string key)
    {
      try
      {
        return this._cacheDataService.GetObject<T>(key);
      }
      catch (KeyNotFoundException ex)
      {
        return default (T);
      }
      catch (System.Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "SendCachedDataMessage= " + key, "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 594);
        return default (T);
      }
    }

    private void SaveObjectToCache<T>(string key, T value)
    {
      try
      {
        this._cacheDataService.SaveCacheData<T>(key, value, DateTime.Now.AddSeconds((double) ConfigurationRepository.EnvironmentSetting.CacheTimeoutInSeconds));
      }
      catch (KeyNotFoundException ex)
      {
      }
      catch (System.Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, "SaveObjectToCache= " + key, "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/MobileApi.cs", 612);
      }
    }

    private static void AddAccessTokenToHttpHeader(HttpRequestMessage httpMessage, Profile profile)
    {
      ISecureStore secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      IProfileDataService profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      Profile profile1 = profile ?? profileDataService.GetActiveProfile();
      if (profile1 == null)
        return;
      TokenData tokenData = secureStore.GetTokenData(profile1.Id);
      if (tokenData == null)
        return;
      httpMessage.Headers.Add("Authorization", "bearer " + tokenData.AccessToken);
    }

    private HttpClient BuildHttpClient(Profile profile, bool isGzipEnabled)
    {
      HttpClient httpClient = new HttpClient((HttpMessageHandler) new AuthMessageHandler((IMobileApi) this, this._secureStore, profile, (HttpMessageHandler) HttpClientHelpers.GetClientHandler(isGzipEnabled)), true);
      if (isGzipEnabled)
        httpClient.DefaultRequestHeaders.AcceptEncoding.Add(new StringWithQualityHeaderValue("gzip"));
      httpClient.Timeout = TimeSpan.FromSeconds((double) ConfigurationRepository.EnvironmentSetting.HttpTimeoutInSeconds);
      return httpClient;
    }

    protected enum ParameterBodyType
    {
      None,
      FormUrlEncoded,
      JsonBody,
    }
  }
}
