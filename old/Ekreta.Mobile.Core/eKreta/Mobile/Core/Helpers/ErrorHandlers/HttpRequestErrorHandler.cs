// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ErrorHandlers.HttpRequestErrorHandler
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Interfaces;
using MvvmCross;
using System.Net;

namespace Ekreta.Mobile.Core.Helpers.ErrorHandlers
{
  public class HttpRequestErrorHandler : CustomErrorHandler<HttpRequestExceptionDecorator>
  {
    public override void HandleError(HttpRequestExceptionDecorator exception)
    {
      if (exception.HttpRequestException.InnerException == null || !(exception.HttpRequestException.InnerException is WebException innerException))
        return;
      ((IModalDialog) Mvx.Resolve<IModalDialog>()).DisplayErrorCodeByResourceKeysAsync("Common_NoServer_Message", "Common_NoServer_Title", this.GetErrorCode(exception) + "_" + innerException.Status.ToString());
    }
  }
}
