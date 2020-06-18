// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.Handlers.AuthDbMessageHandler
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile.TokenInfo;
using MvvmCross;
using Newtonsoft.Json;
using Plugin.Connectivity.Abstractions;
using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Services.Handlers
{
  internal class AuthDbMessageHandler : DelegatingHandler
  {
    private readonly SemaphoreSlim _semaphore = new SemaphoreSlim(1, 1);
    private readonly IDbMobileApi _mobileApi;
    private readonly ISecureStore _secureStore;
    private readonly ProfileRealm _profile;
    private readonly ITokenInfoDbRepository _tokenInfoRepository;

    public AuthDbMessageHandler(
      IDbMobileApi mobileApi,
      ISecureStore secureStore,
      ProfileRealm profile,
      HttpMessageHandler handler)
      : base(handler)
    {
      this._mobileApi = mobileApi;
      this._secureStore = secureStore;
      this._profile = profile;
      this._tokenInfoRepository = (ITokenInfoDbRepository) Mvx.get_IoCProvider().Resolve<ITokenInfoDbRepository>();
    }

    protected override async Task<HttpResponseMessage> SendAsync(
      HttpRequestMessage request,
      CancellationToken cancellationToken)
    {
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      int num = (^this).\u003C\u003E1__state;
      HttpResponseMessage response;
      HttpResponseMessage result1;
      try
      {
        response = (HttpResponseMessage) null;
        try
        {
          TaskAwaiter awaiter1 = this._semaphore.WaitAsync().GetAwaiter();
          if (!awaiter1.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 0;
            TaskAwaiter taskAwaiter = awaiter1;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter, AuthDbMessageHandler.\u003CSendAsync\u003Ed__6>(ref awaiter1, this);
            return;
          }
          awaiter1.GetResult();
          TaskAwaiter<HttpRequestMessage> taskAwaiter1;
          HttpRequestMessage result2;
          if (this._secureStore.GetTokenData(this._profile.Id).ExpiresAt <= DateTime.Now)
          {
            TaskAwaiter<TokenData> awaiter2 = ((IAuthDbDataService) Mvx.get_IoCProvider().Resolve<IAuthDbDataService>()).RefreshToken(this._profile).GetAwaiter();
            if (!awaiter2.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 1;
              TaskAwaiter<TokenData> taskAwaiter2 = awaiter2;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<TokenData>, AuthDbMessageHandler.\u003CSendAsync\u003Ed__6>(ref awaiter2, this);
              return;
            }
            TokenData result3 = awaiter2.GetResult();
            if (result3 == null)
            {
              result1 = (HttpResponseMessage) null;
              goto label_26;
            }
            else
            {
              this._tokenInfoRepository.AddOrUpdate(new TokenInfoRealmMapper().To((Ekreta.Mobile.Core.Models.TokenInfo) JsonConvert.DeserializeObject<Ekreta.Mobile.Core.Models.TokenInfo>(TokenDecoder.Decode(result3.AccessToken))), (Action<TokenInfoRealm>) null);
              TaskAwaiter<HttpRequestMessage> awaiter3 = this.CloneRequest(request, result3).GetAwaiter();
              if (!awaiter3.IsCompleted)
              {
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003E1__state = num = 2;
                taskAwaiter1 = awaiter3;
                // ISSUE: explicit reference operation
                // ISSUE: reference to a compiler-generated field
                (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<HttpRequestMessage>, AuthDbMessageHandler.\u003CSendAsync\u003Ed__6>(ref awaiter3, this);
                return;
              }
              result2 = awaiter3.GetResult();
            }
          }
          else
          {
            TaskAwaiter<HttpRequestMessage> awaiter2 = this.CloneRequest(request, (TokenData) null).GetAwaiter();
            if (!awaiter2.IsCompleted)
            {
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003E1__state = num = 3;
              taskAwaiter1 = awaiter2;
              // ISSUE: explicit reference operation
              // ISSUE: reference to a compiler-generated field
              (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<HttpRequestMessage>, AuthDbMessageHandler.\u003CSendAsync\u003Ed__6>(ref awaiter2, this);
              return;
            }
            result2 = awaiter2.GetResult();
          }
          TaskAwaiter<HttpResponseMessage> awaiter4 = base.SendAsync(result2, cancellationToken).GetAwaiter();
          if (!awaiter4.IsCompleted)
          {
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num = 4;
            TaskAwaiter<HttpResponseMessage> taskAwaiter2 = awaiter4;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<HttpResponseMessage>, AuthDbMessageHandler.\u003CSendAsync\u003Ed__6>(ref awaiter4, this);
            return;
          }
          response = awaiter4.GetResult();
          result1 = response;
        }
        catch (InvalidOperationException ex)
        {
          result1 = response;
        }
        catch (HttpRequestException ex)
        {
          if (!((IConnectivity) Mvx.get_IoCProvider().Resolve<IConnectivity>()).get_IsConnected())
            throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/Handlers/AuthDbMessageHandler.cs", 99);
          throw;
        }
        finally
        {
          if (num < 0)
            this._semaphore.Release();
        }
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        response = (HttpResponseMessage) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
label_26:
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      response = (HttpResponseMessage) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result1);
    }

    private async Task<HttpRequestMessage> CloneRequest(
      HttpRequestMessage request,
      TokenData tokenData = null)
    {
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      int num1 = (^this).\u003C\u003E1__state;
      HttpRequestMessage result;
      HttpRequestMessage result1;
      try
      {
        result = new HttpRequestMessage(request.Method, request.RequestUri);
        IEnumerator<KeyValuePair<string, IEnumerable<string>>> enumerator1 = request.Headers.GetEnumerator();
        try
        {
          while (enumerator1.MoveNext())
          {
            KeyValuePair<string, IEnumerable<string>> current = enumerator1.Current;
            if (tokenData != null && current.Key == "Authorization")
              result.Headers.Add(current.Key, string.Format("Bearer " + tokenData.AccessToken));
            else
              result.Headers.Add(current.Key, current.Value);
          }
        }
        finally
        {
          if (num1 < 0 && enumerator1 != null)
            enumerator1.Dispose();
        }
        if (request.Content?.Headers.ContentType != null)
        {
          TaskAwaiter<string> awaiter = request.Content.ReadAsStringAsync().GetAwaiter();
          if (!awaiter.IsCompleted)
          {
            int num2;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003E1__state = num2 = 0;
            TaskAwaiter<string> taskAwaiter = awaiter;
            // ISSUE: explicit reference operation
            // ISSUE: reference to a compiler-generated field
            (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<string>, AuthDbMessageHandler.\u003CCloneRequest\u003Ed__7>(ref awaiter, this);
            return;
          }
          result.Content = (HttpContent) new StringContent(awaiter.GetResult(), Encoding.UTF8, request.Content.Headers.ContentType.MediaType);
          IEnumerator<KeyValuePair<string, IEnumerable<string>>> enumerator2 = request.Content.Headers.GetEnumerator();
          try
          {
            while (enumerator2.MoveNext())
            {
              KeyValuePair<string, IEnumerable<string>> current = enumerator2.Current;
              if (!current.Key.Equals("Content-Type", StringComparison.OrdinalIgnoreCase))
                result.Content.Headers.Add(current.Key, current.Value);
            }
          }
          finally
          {
            if (num1 < 0 && enumerator2 != null)
              enumerator2.Dispose();
          }
        }
        result1 = result;
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        result = (HttpRequestMessage) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      result = (HttpRequestMessage) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult(result1);
    }
  }
}
