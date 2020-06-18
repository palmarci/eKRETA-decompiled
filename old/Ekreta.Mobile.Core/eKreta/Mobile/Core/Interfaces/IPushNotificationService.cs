// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IPushNotificationService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IPushNotificationService
  {
    Task<bool> HandleNotification(PushMessage pushMessage);

    PushMessage CreatePushMessage(IDictionary<string, string> properties);

    Task<bool> DownloadPostaladaElem(Profile profile, PushMessage pushMessage);

    Task UpdateRegistrationsAsync(string token);

    Task UpdateRegistrationsAsync(Profile profile, string token);

    Task RegisterOrUpdateRegistrationsAsync();

    bool IsPushMessageDownloaded(PushMessage pushMessage);
  }
}
