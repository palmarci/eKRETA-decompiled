// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ErrorHandler
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions.Client.Validation;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers.ErrorHandlers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Monitoring;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Helpers
{
  public class ErrorHandler : IErrorHandler
  {
    private readonly List<IErrorHandlerItem> _errorHandlerItems = new List<IErrorHandlerItem>();
    private static IErrorHandler _instance;

    public ErrorHandler()
    {
      ErrorHandler errorHandler = this;
      IMvxMessenger messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this.AddErrorHandler<NoInternetConnectionException>("Common_NoInternet_Title", "Common_NoInternet_Message");
      this.AddErrorHandler<NoUserRoleException>("Alert_Message_NoUserRole", "Alert_NoUserRoleError_Text");
      this.AddErrorHandler<InvalidInstitudeDataException>("Alert_Message_Institute", "Alert_InstituteError_Text");
      this.AddErrorHandler<UserRoleException>("Alert_TitleLoginError_Text", "Alert_Message_UserRole");
      this.AddErrorHandler<EmptyHomeworkValidationException>("Common_EmptyHomework_Title", "Common_EmptyHomework_Message");
      this.AddErrorHandler<DuplicateUserException>("Alert_TitleDuplicateUserError_Text", "Alert_MessageDuplicateUserError_Text");
      this.AddErrorHandler<LoginException>("Alert_TitleLoginError_Text", "Alert_MessageLoginError_Text");
      this.AddErrorHandler<NotExpectedSuccessStatusCodeException>("HomeWorkStudentDetail_UpdateUnSucessful_Title", "HomeWorkStudentDetail_UpdateUnSucessful_Text");
      this.AddErrorHandler<ServerUnreachableException>((ICustomErrorHandler) new ServerUnreachableErrorHandler());
      this.AddErrorHandler<UnauthorizedApiAccessException>((ICustomErrorHandler) new UnauthorizedApiAccessErrorHandler());
      this.AddErrorHandler<HttpRequestExceptionDecorator>((ICustomErrorHandler) new HttpRequestErrorHandler());
      this.AddErrorHandler<RefreshTokenException>((ICustomErrorHandler) new RefreshTokenErrorHandler());
      this.AddErrorHandler<ServerValidationException>((Action) (() => messenger.Publish<LoginRequiredMessage>((M0) new LoginRequiredMessage((object) errorHandler))));
    }

    public static IErrorHandler Current
    {
      get
      {
        return ErrorHandler._instance ?? (ErrorHandler._instance = (IErrorHandler) new ErrorHandler());
      }
    }

    public void HandleError(Exception ex)
    {
      this._errorHandlerItems.FirstOrDefault<IErrorHandlerItem>((Func<IErrorHandlerItem, bool>) (x => x.ExceptionType.Name == ex.GetType().Name))?.HandleItem(ex);
      CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (HandleError), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/ErrorHandler.cs", 52);
    }

    private void AddErrorHandler<T>(string titleKey, string contentKey) where T : Exception
    {
      this._errorHandlerItems.Add((IErrorHandlerItem) new ErrorHandlerItem<T>(titleKey, contentKey));
    }

    private void AddErrorHandler<T>(Action customAction) where T : Exception
    {
      this._errorHandlerItems.Add((IErrorHandlerItem) new ErrorHandlerItem<T>(string.Empty, string.Empty, customAction));
    }

    private void AddErrorHandler<T>(Action<T> customAction) where T : Exception
    {
      this._errorHandlerItems.Add((IErrorHandlerItem) new ErrorHandlerItem<T>(string.Empty, string.Empty, customAction));
    }

    private void AddErrorHandler<T>(ICustomErrorHandler customErrorHandler) where T : Exception
    {
      this._errorHandlerItems.Add((IErrorHandlerItem) new ErrorHandlerItem<T>(string.Empty, string.Empty, customErrorHandler));
    }
  }
}
