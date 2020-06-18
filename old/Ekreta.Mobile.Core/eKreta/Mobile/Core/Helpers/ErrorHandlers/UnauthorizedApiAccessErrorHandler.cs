// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ErrorHandlers.UnauthorizedApiAccessErrorHandler
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using System;

namespace Ekreta.Mobile.Core.Helpers.ErrorHandlers
{
  public class UnauthorizedApiAccessErrorHandler : CustomErrorHandler<UnauthorizedApiAccessException>
  {
    public override void HandleError(UnauthorizedApiAccessException exception)
    {
      if (exception.ExceptionData?.ErrorDescription != null && exception.ExceptionData.ErrorDescription.StartsWith("Invalid login name or password", StringComparison.Ordinal))
      {
        string errorCode = this.GetErrorCode(exception);
        ((IModalDialog) Mvx.Resolve<IModalDialog>()).DisplayErrorCodeByResourceKeysAsync("Alert_MessageLoginError_Text", "Alert_TitleLoginError_Text", exception.ExceptionData.ErrorCode + "_" + errorCode);
      }
      else
        ((IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>()).Publish<LoginRequiredMessage>((M0) new LoginRequiredMessage((object) this));
    }
  }
}
