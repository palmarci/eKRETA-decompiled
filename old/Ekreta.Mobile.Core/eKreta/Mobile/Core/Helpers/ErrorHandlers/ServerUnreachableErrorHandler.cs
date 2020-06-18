// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ErrorHandlers.ServerUnreachableErrorHandler
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Login;
using MvvmCross;
using Plugin.Connectivity.Abstractions;
using System;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Helpers.ErrorHandlers
{
  public class ServerUnreachableErrorHandler : CustomErrorHandler<ServerUnreachableException>
  {
    public override void HandleError(ServerUnreachableException exception)
    {
      IAuthDataService authDataService = (IAuthDataService) Mvx.get_IoCProvider().Resolve<IAuthDataService>();
      IProfileDataService profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      M0 m0 = Mvx.get_IoCProvider().Resolve<IConnectivity>();
      ICredentialsDataService credentialsDataService = (ICredentialsDataService) Mvx.get_IoCProvider().Resolve<ICredentialsDataService>();
      if (((IConnectivity) m0).get_IsConnected())
      {
        Profile profile = profileDataService.GetActiveProfile();
        try
        {
          if (profile == null)
          {
            this.DisplayServerUnreachableErrorMessage(exception);
          }
          else
          {
            Credentials credentials = credentialsDataService.GetCredentials(profile?.Id);
            if (credentials != null)
              Task.Run<Profile>((Func<Task<Profile>>) (() => authDataService.Login(profile.Institute, credentials.UserName, credentials.Password))).Wait();
            else
              Task.Run<TokenData>((Func<Task<TokenData>>) (() => authDataService.RefreshToken(profile))).Wait();
          }
        }
        catch (AggregateException ex)
        {
          foreach (Exception innerException in ex.Flatten().InnerExceptions)
          {
            if (innerException is ServerUnreachableException exception1)
            {
              this.DisplayServerUnreachableErrorMessage(exception1);
              ErrorHandler.Current.HandleError((Exception) new RefreshTokenException("Sikertelen relogin vagy token refresh", profile).SetErrorCode<RefreshTokenException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/ErrorHandlers/ServerUnreachableErrorHandler.cs", 58));
            }
            else
              ErrorHandler.Current.HandleError(innerException);
          }
        }
      }
      else
        ErrorHandler.Current.HandleError((Exception) new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/ErrorHandlers/ServerUnreachableErrorHandler.cs", 69));
    }

    private void DisplayServerUnreachableErrorMessage(ServerUnreachableException exception)
    {
      IModalDialog modalDialog = (IModalDialog) Mvx.get_IoCProvider().Resolve<IModalDialog>();
      string errorCode1 = this.GetErrorCode(exception);
      if (exception.Response != null)
      {
        string errorCode2 = exception.Response.StatusCode.ToString() + "_" + errorCode1;
        modalDialog.DisplayErrorCodeByResourceKeysAsync("Common_NoServer_Message", "Common_NoServer_Title", errorCode2);
      }
      else
        modalDialog.DisplayErrorCodeByResourceKeysAsync("Common_NoServer_Message", "Common_NoServer_Title", errorCode1);
    }
  }
}
