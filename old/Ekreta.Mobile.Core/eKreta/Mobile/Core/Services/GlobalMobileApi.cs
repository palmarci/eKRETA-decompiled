// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.GlobalMobileApi
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Services
{
  public class GlobalMobileApi : IGlobalMobileApi
  {
    private const string _apiVersion = "v2";
    private const string globalMobileApiV1BaseUrl = "https://kretaglobalmobileapi.ekreta.hu";
    private const string profileEndpointName = "Profile";
    private const string notificationEndpointName = "Registration";
    private readonly IConfigurationService _configurationService;

    public GlobalMobileApi(IConfigurationService configurationService)
    {
      this._configurationService = configurationService;
    }

    private HttpClient BuildHttpClient()
    {
      return new HttpClient((HttpMessageHandler) HttpClientHelpers.GetClientHandler(true))
      {
        DefaultRequestHeaders = {
          AcceptEncoding = {
            new StringWithQualityHeaderValue("gzip")
          }
        }
      };
    }

    public async Task SendProfileLogAsync(string phoneId, string userName, string instituteId)
    {
      object obj = await this.SendAsync<object>(HttpMethod.Post, "Profile", new Dictionary<string, string>()
      {
        {
          nameof (phoneId),
          phoneId
        },
        {
          nameof (userName),
          userName
        },
        {
          nameof (instituteId),
          instituteId
        }
      }, false, (string) null);
    }

    public async Task<Institute> GetInstituteAsync(Institute savedInstitute)
    {
      Institute downloadedInstitute;
      Institute result;
      try
      {
        downloadedInstitute = (Institute) null;
        int num;
        try
        {
          TaskAwaiter<Institute> awaiter = this.SendAsync<Institute>(HttpMethod.Get, "Institute/" + savedInstitute.InstituteId, (Dictionary<string, string>) null, false, (string) null).GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter<Institute> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<Institute>, GlobalMobileApi.\u003CGetInstituteAsync\u003Ed__8>(ref awaiter, this);
            return;
          }
          downloadedInstitute = awaiter.GetResult();
        }
        catch (KeyNotFoundException ex)
        {
          CrossMobileAnalytics.Current.TrackException((Exception) ex, (IDictionary<string, string>) null, nameof (GetInstituteAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/GlobalMobileApi.cs", 70);
        }
        finally
        {
          if (downloadedInstitute == null || downloadedInstitute.InstituteCode != savedInstitute.InstituteCode || downloadedInstitute.InstituteId != savedInstitute.InstituteId)
          {
            TaskAwaiter<IEnumerable<Institute>> awaiter = this.GetInstitutesAsync().GetAwaiter();
            if (!awaiter.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 1;
              TaskAwaiter<IEnumerable<Institute>> taskAwaiter = awaiter;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<IEnumerable<Institute>>, GlobalMobileApi.\u003CGetInstituteAsync\u003Ed__8>(ref awaiter, this);
              return;
            }
            downloadedInstitute = awaiter.GetResult().Where<Institute>((Func<Institute, bool>) (i => i.InstituteCode == savedInstitute.InstituteCode)).FirstOrDefault<Institute>();
          }
        }
        result = downloadedInstitute ?? savedInstitute;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        downloadedInstitute = (Institute) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      downloadedInstitute = (Institute) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result);
    }

    public async Task<IEnumerable<Institute>> GetInstitutesAsync()
    {
      return (IEnumerable<Institute>) await this.SendAsync<List<Institute>>(HttpMethod.Get, "Institute", (Dictionary<string, string>) null, false, (string) null);
    }

    public async Task<PushSettings> NotificationRegistrationAsync(
      string instituteCode,
      int instituteUserId,
      string tutelaryId,
      string platform,
      string handle,
      UserRoles notificationRole,
      NotificationMessageSource notificationSource,
      int notificationType,
      string profileId)
    {
      return await this.SendAsync<PushSettings>(HttpMethod.Post, "Registration", new Dictionary<string, string>()
      {
        {
          "InstituteCode",
          instituteCode
        },
        {
          "InstituteUserId",
          instituteUserId.ToString()
        },
        {
          "TutelaryId",
          tutelaryId
        },
        {
          "Platform",
          platform
        },
        {
          "NotificationType",
          "All"
        },
        {
          "NotificationRole",
          notificationRole.ToString()
        },
        {
          "NotificationSource",
          notificationSource.ToString()
        },
        {
          "NotificationEnvironment",
          "Ellenorzo_Xamarin"
        },
        {
          "SchoolYearId",
          this.GetSchoolYearId()
        },
        {
          "Handle",
          handle
        }
      }, false, profileId);
    }

    public async Task<PushSettings> NotificationUpdateAsync(
      string registrationId,
      int notificationType,
      NotificationMessageSource notificationSource,
      string handle)
    {
      return await this.SendAsync<PushSettings>(HttpMethod.Put, "Registration", new Dictionary<string, string>()
      {
        {
          "RegistrationId",
          registrationId
        },
        {
          "NotificationType",
          notificationType.ToString()
        },
        {
          "NotificationSource",
          notificationSource.ToString()
        },
        {
          "NotificationEnvironment",
          "Ellenorzo_Xamarin"
        },
        {
          "Handle",
          handle
        },
        {
          "SchoolYearId",
          this.GetSchoolYearId()
        }
      }, false, (string) null);
    }

    public async Task<PushSettings> NotificationDeleteAsync(
      string registrationId,
      NotificationMessageSource notificationSource,
      bool useGlobalMobileApiV1 = false)
    {
      return await this.SendAsync<PushSettings>(HttpMethod.Delete, "Registration", new Dictionary<string, string>()
      {
        {
          nameof (registrationId),
          registrationId
        },
        {
          nameof (notificationSource),
          notificationSource.ToString()
        },
        {
          "NotificationEnvironment",
          "Ellenorzo_Xamarin"
        },
        {
          "SchoolYearId",
          this.GetSchoolYearId()
        }
      }, useGlobalMobileApiV1, (string) null);
    }

    protected async Task<T> SendAsync<T>(
      HttpMethod method,
      string endpoint,
      Dictionary<string, string> parameters = null,
      bool useGlobalMobileApiV1 = false,
      string profileId = null)
      where T : class
    {
      T obj;
      try
      {
        await this._configurationService.InitAsync();
        Uri uri = new Uri(new Uri(!useGlobalMobileApiV1 || ConfigurationRepository.EnvironmentSetting.Environment != Ekreta.Mobile.Core.Models.Environments.Environments.PROD ? ConfigurationRepository.EnvironmentSetting.GlobalMobileApiUrl : "https://kretaglobalmobileapi.ekreta.hu"), string.Format("api/v2/" + endpoint));
        if (parameters != null)
        {
          foreach (KeyValuePair<string, string> parameter in parameters)
          {
            string str = WebUtility.UrlEncode(parameter.Value);
            uri = uri.AddParameter(parameter.Key, str);
          }
        }
        HttpRequestMessage httpRequestMessage = new HttpRequestMessage(method, uri);
        httpRequestMessage.Headers.Add("Accept", "application/json");
        httpRequestMessage.Headers.Add("apiKey", ConfigurationRepository.EnvironmentSetting.ConfigurationServiceApiKey);
        GlobalMobileApi.AddAccessTokenToHttpHeader<T>(httpRequestMessage, profileId);
        using (HttpClient httpClient = this.BuildHttpClient())
        {
          int num1;
          int num2 = num1 - 1;
          try
          {
            HttpResponseMessage response = await httpClient.SendAsync(httpRequestMessage);
            if (response.IsSuccessStatusCode)
            {
              obj = (T) JsonConvert.DeserializeObject<T>(await response.Content.ReadAsStringAsync());
              response = (HttpResponseMessage) null;
            }
            else
            {
              if (response.StatusCode == HttpStatusCode.NotFound)
                throw new KeyNotFoundException();
              string str = await response.Content.ReadAsStringAsync();
              throw new ServerUnreachableException(response);
            }
          }
          catch (Exception ex)
          {
            CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) new Dictionary<string, string>()
            {
              {
                "uri",
                uri.ToString()
              }
            }, nameof (SendAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/GlobalMobileApi.cs", 205);
            throw;
          }
        }
        uri = (Uri) null;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (SendAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/GlobalMobileApi.cs", 213);
        throw;
      }
      return obj;
    }

    private static void AddAccessTokenToHttpHeader<T>(
      HttpRequestMessage httpMessage,
      string profileId)
      where T : class
    {
      ISecureStore secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      IProfileDataService profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      Profile profile = profileId != null ? profileDataService.GetProfile(profileId) : profileDataService.GetActiveProfile();
      if (profile == null)
        return;
      TokenData tokenData = secureStore.GetTokenData(profile.Id);
      if (tokenData == null)
        return;
      httpMessage.Headers.Add("Authorization", "bearer " + tokenData.AccessToken);
    }

    private string GetSchoolYearId()
    {
      return ((IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>()).GetActiveProfile().TokenInfo.SchoolYearId;
    }
  }
}
