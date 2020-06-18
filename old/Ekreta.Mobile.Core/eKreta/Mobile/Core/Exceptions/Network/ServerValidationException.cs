// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.Network.ServerValidationException
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.Validation;

namespace Ekreta.Mobile.Core.Exceptions.Network
{
  public class ServerValidationException : ExceptionErrorCodeBase
  {
    public ValidationException ValidationException { get; set; }

    public ServerValidationException(ValidationException validationException)
      : base(validationException?.Message + " : " + validationException?.GetAggregatedValidationMessage())
    {
      this.ValidationException = validationException;
    }
  }
}
