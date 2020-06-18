// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ErrorHandlers.CustomErrorHandler`1
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;

namespace Ekreta.Mobile.Core.Helpers.ErrorHandlers
{
  public abstract class CustomErrorHandler<T> : ICustomErrorHandler
  {
    public abstract void HandleError(T exception);

    public string GetErrorCode(T exception)
    {
      return exception is ExceptionErrorCodeBase exceptionErrorCodeBase ? exceptionErrorCodeBase.ErrorCode : string.Empty;
    }
  }
}
