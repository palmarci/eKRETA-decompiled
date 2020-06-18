// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.UzenetKuldes.EugyintezesApi
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Models.Uzenetek;
using Ekreta.Mobile.Core.Services.Handlers;
using MvvmCross;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Services.UzenetKuldes
{
  public class EugyintezesApi : IEugyintezesApi
  {
    private const string ApiPrefix = "/integration-kretamobile-api/v1";
    private readonly ISecureStore _secureStore;
    private readonly IMobileApi _mobileApi;
    private readonly IUserAgentService _userAgentData;
    private readonly IDataViewer _dataViewer;
    private IDeviceSpecification _deviceSpecification;

    public EugyintezesApi(
      ISecureStore secureStore,
      IMobileApi mobileApi,
      IUserAgentService userAgentData,
      IDataViewer dataViewer)
    {
      this._secureStore = secureStore;
      this._mobileApi = mobileApi;
      this._userAgentData = userAgentData;
      this._dataViewer = dataViewer;
      this._deviceSpecification = (IDeviceSpecification) Mvx.get_IoCProvider().Resolve<IDeviceSpecification>();
    }

    private HttpClient BuildHttpClient(Profile profile)
    {
      return new HttpClient((HttpMessageHandler) new AuthMessageHandler(this._mobileApi, this._secureStore, profile, (HttpMessageHandler) HttpClientHelpers.GetClientHandler(true)), true)
      {
        DefaultRequestHeaders = {
          AcceptEncoding = {
            new StringWithQualityHeaderValue("gzip")
          }
        },
        Timeout = TimeSpan.FromSeconds((double) ConfigurationRepository.EnvironmentSetting.HttpTimeoutInSeconds)
      };
    }

    public async Task<IEnumerable<PostaladaElem>> GetPostaladaElemekAsync(
      Profile profile,
      string accessToken)
    {
      return await this.GetAsync<IEnumerable<PostaladaElem>>("/kommunikacio/postaladaelemek/sajat", profile, accessToken);
    }

    public async Task<PostaladaElem> GetPostaladaElemAsync(
      Profile profile,
      string accessToken,
      long azonosito)
    {
      return await this.GetAsync<PostaladaElem>(string.Format("/kommunikacio/postaladaelemek/{0}", (object) azonosito), profile, accessToken);
    }

    public async Task<string> GetCsatolmanyAsync(
      Profile profile,
      string accessToken,
      Csatolmany csatolmany)
    {
      return await this.DownloadFile(string.Format("/dokumentumok/uzenetek/{0}", (object) csatolmany.Azonosito), profile, accessToken, csatolmany);
    }

    public async Task<bool> PostPostaladaElemElolvasvaAsync(
      Profile profile,
      string accessToken,
      long azonosito)
    {
      string relativeUri = "/kommunikacio/uzenetek/olvasott";
      string content = JsonConvert.SerializeObject((object) new PostaladaElemReadRO()
      {
        IsOlvasott = true,
        UzenetAzonositoLista = new List<long>()
        {
          azonosito
        }
      });
      return await this.PostAsync<bool>(relativeUri, profile, accessToken, content);
    }

    protected async Task<string> DownloadFile(
      string relativeUri,
      Profile profile,
      string accessToken,
      Csatolmany csatolmany)
    {
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      int num = (^this).\u003C\u003E1__state;
      string filePath;
      string name;
      try
      {
        Uri requestUri = new Uri(new Uri(ConfigurationRepository.EnvironmentSetting.EugyintezesAPIUrl ?? ""), "/integration-kretamobile-api/v1" + relativeUri);
        filePath = this._dataViewer.FilePath(csatolmany.FajlNev);
        HttpClient httpClient = this.BuildHttpClient(profile);
        try
        {
          HttpRequestMessage httpMessage = new HttpRequestMessage(HttpMethod.Get, requestUri);
          try
          {
            httpMessage.Headers.Add("Accept", "application/json");
            httpMessage.Headers.Add(this._deviceSpecification.AgentName, this._userAgentData.UserAgentText);
            httpMessage.Headers.Add("Authorization", string.Format("Bearer " + accessToken));
            TaskAwaiter<HttpResponseMessage> awaiter1 = httpClient.SendAsync(httpMessage, HttpCompletionOption.ResponseHeadersRead).GetAwaiter();
            if (!awaiter1.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 0;
              TaskAwaiter<HttpResponseMessage> taskAwaiter = awaiter1;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<HttpResponseMessage>, EugyintezesApi.\u003CDownloadFile\u003Ed__12>(ref awaiter1, this);
              return;
            }
            HttpResponseMessage response = awaiter1.GetResult();
            try
            {
              FileStream fs = new FileStream(filePath, FileMode.CreateNew);
              try
              {
                TaskAwaiter awaiter2 = response.Content.CopyToAsync((Stream) fs).GetAwaiter();
                if (!awaiter2.IsCompleted)
                {
                  // ISSUE: explicit reference operation
                  // ISSUE: reference to a compiler-generated field
                  (^this).\u003C\u003E1__state = num = 1;
                  TaskAwaiter taskAwaiter = awaiter2;
                  // ISSUE: explicit reference operation
                  // ISSUE: reference to a compiler-generated field
                  (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, EugyintezesApi.\u003CDownloadFile\u003Ed__12>(ref awaiter2, this);
                  return;
                }
                awaiter2.GetResult();
                name = fs.Name;
              }
              finally
              {
                if (num < 0 && fs != null)
                  fs.Dispose();
              }
            }
            finally
            {
              if (num < 0 && response != null)
                response.Dispose();
            }
          }
          finally
          {
            if (num < 0 && httpMessage != null)
              httpMessage.Dispose();
          }
        }
        finally
        {
          if (num < 0 && httpClient != null)
            httpClient.Dispose();
        }
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        filePath = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      filePath = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(name);
    }

    protected async Task<T> PostAsync<T>(
      string relativeUri,
      Profile profile,
      string accessToken,
      string content)
    {
      Uri requestUri = new Uri(new Uri(ConfigurationRepository.EnvironmentSetting.EugyintezesAPIUrl ?? ""), "/integration-kretamobile-api/v1" + relativeUri);
      using (HttpClient httpClient = this.BuildHttpClient(profile))
      {
        using (HttpRequestMessage httpMessage = new HttpRequestMessage(HttpMethod.Post, requestUri))
        {
          httpMessage.Headers.Add("Accept", "application/json");
          httpMessage.Headers.Add(this._deviceSpecification.AgentName, this._userAgentData.UserAgentText);
          httpMessage.Headers.Add("Authorization", string.Format("Bearer " + accessToken));
          httpMessage.Content = (HttpContent) new StringContent(content, Encoding.UTF8, "application/json");
          using (HttpResponseMessage response = await httpClient.SendAsync(httpMessage, HttpCompletionOption.ResponseHeadersRead))
          {
            if (response.IsSuccessStatusCode && response.StatusCode == HttpStatusCode.OK)
              return (await response.Content.ReadAsStreamAsync()).Deserialize<T>();
            if (response.StatusCode == HttpStatusCode.NoContent)
              return await Task.FromResult<T>(default (T));
            throw new ServerUnreachableException(response);
          }
        }
      }
    }

    protected async Task<T> GetAsync<T>(
      string relativeUri,
      Profile profile,
      string accessToken)
    {
      Uri requestUri = new Uri(new Uri(ConfigurationRepository.EnvironmentSetting.EugyintezesAPIUrl ?? ""), "/integration-kretamobile-api/v1" + relativeUri);
      using (HttpClient httpClient = this.BuildHttpClient(profile))
      {
        using (HttpRequestMessage httpMessage = new HttpRequestMessage(HttpMethod.Get, requestUri))
        {
          httpMessage.Headers.Add("Accept", "application/json");
          httpMessage.Headers.Add(this._deviceSpecification.AgentName, this._userAgentData.UserAgentText);
          httpMessage.Headers.Add("Authorization", string.Format("Bearer " + accessToken));
          HttpResponseMessage response;
          try
          {
            response = await httpClient.SendAsync(httpMessage, HttpCompletionOption.ResponseHeadersRead);
          }
          catch (Exception ex)
          {
            int num = await ((IModalDialog) Mvx.get_IoCProvider().Resolve<IModalDialog>()).DisplayAlertAsync("Nem sikerült letölteni az adatokat", "Hiba", "OK", (string) null) ? 1 : 0;
            return default (T);
          }
          if (!response.IsSuccessStatusCode)
            throw new ServerUnreachableException(response);
          string str = await response.Content.ReadAsStringAsync();
          return (await response.Content.ReadAsStreamAsync()).Deserialize<T>();
        }
      }
    }
  }
}
