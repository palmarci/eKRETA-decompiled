// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.Network.UnauthorizedApiAccessException
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.Exception;

namespace Ekreta.Mobile.Core.Exceptions.Network
{
  public class UnauthorizedApiAccessException : ExceptionErrorCodeBase
  {
    public AuthorizationExceptionData ExceptionData { get; }

    public UnauthorizedApiAccessException()
    {
    }

    public UnauthorizedApiAccessException(string message, AuthorizationExceptionData exceptionData)
      : base(message)
    {
      this.ExceptionData = exceptionData;
    }
  }
}
