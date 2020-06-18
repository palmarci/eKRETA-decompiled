// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.IErrorHandlerItem
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Helpers
{
  public interface IErrorHandlerItem
  {
    Type ExceptionType { get; set; }

    void HandleItem(Exception exception);
  }
}
