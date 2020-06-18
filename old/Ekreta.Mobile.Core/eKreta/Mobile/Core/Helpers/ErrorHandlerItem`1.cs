// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ErrorHandlerItem`1
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Helpers.ErrorHandlers;
using Ekreta.Mobile.Core.Interfaces;
using MvvmCross;
using System;

namespace Ekreta.Mobile.Core.Helpers
{
  public class ErrorHandlerItem<T> : IErrorHandlerItem where T : Exception
  {
    public ErrorHandlerItem(string titleKey, string contentKey)
    {
      this.ExceptionType = typeof (T);
      this.TitleKey = titleKey;
      this.ContentKey = contentKey;
    }

    public ErrorHandlerItem(string titleKey, string contentKey, System.Action action)
      : this(titleKey, contentKey)
    {
      this.ParameterlessAction = action;
    }

    public ErrorHandlerItem(string titleKey, string contentKey, System.Action<T> action)
      : this(titleKey, contentKey)
    {
      this.Action = action;
    }

    public ErrorHandlerItem(
      string titleKey,
      string contentKey,
      ICustomErrorHandler customErrorHandler)
      : this(titleKey, contentKey)
    {
      this.CustomErrorHandler = (Ekreta.Mobile.Core.Helpers.ErrorHandlers.CustomErrorHandler<T>) customErrorHandler;
    }

    public Ekreta.Mobile.Core.Helpers.ErrorHandlers.CustomErrorHandler<T> CustomErrorHandler { get; set; }

    public string ErrorCode { get; set; }

    public Type ExceptionType { get; set; }

    public string TitleKey { get; set; }

    public string ContentKey { get; set; }

    public System.Action ParameterlessAction { get; set; }

    public System.Action<T> Action { get; set; }

    public void HandleItem(T exception)
    {
      if (exception is ExceptionErrorCodeBase exceptionErrorCodeBase)
        this.ErrorCode = exceptionErrorCodeBase.ErrorCode;
      if (this.CustomErrorHandler != null)
        this.CustomErrorHandler.HandleError(exception);
      else if (this.Action != null)
        this.Action(exception);
      else if (this.ParameterlessAction != null)
        this.ParameterlessAction();
      else
        this.ShowDisplayAlert(this);
    }

    public void HandleItem(Exception exception)
    {
      this.HandleItem((T) exception);
    }

    private void ShowDisplayAlert(ErrorHandlerItem<T> errorHandlerItem)
    {
      IModalDialog modalDialog = (IModalDialog) Mvx.get_IoCProvider().Resolve<IModalDialog>();
      if (!string.IsNullOrWhiteSpace(this.ErrorCode))
        modalDialog.DisplayErrorCodeByResourceKeysAsync(errorHandlerItem.ContentKey, errorHandlerItem.TitleKey, errorHandlerItem.ErrorCode);
      else
        modalDialog.DisplayAlertByResourceKeysAsync(errorHandlerItem.ContentKey, errorHandlerItem.TitleKey);
    }
  }
}
