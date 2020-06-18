// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.ExceptionErrorCodeBase
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Exceptions
{
  public abstract class ExceptionErrorCodeBase : Exception
  {
    protected ExceptionErrorCodeBase(string errorCode)
    {
      this.ErrorCode = errorCode;
    }

    protected ExceptionErrorCodeBase()
    {
    }

    public string ErrorCode { get; set; }
  }
}
