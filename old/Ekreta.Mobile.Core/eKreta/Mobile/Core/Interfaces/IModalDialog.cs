// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IModalDialog
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IModalDialog
  {
    Task<bool> DisplayAlertAsync(string message, string title, string accept = "OK", string cancel = null);

    Task DisplayAlertByResourceKeysAsync(string messageKey, string titleKey);

    Task DisplayErrorCodeByResourceKeysAsync(
      string messageKey,
      string titleKey,
      string errorCode);

    Task<bool> DisplayVersionAlertAsync(
      string title,
      string message,
      string accept = "OK",
      string cancel = null);

    Task<string> DisplayActionSheetAsync(
      string title,
      string cancel,
      string destruction,
      params string[] buttons);

    void InvokeRatingFlow(Profile profile);

    Task ClosePopup();
  }
}
