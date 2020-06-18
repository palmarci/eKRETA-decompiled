// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IGlobalMobileApi
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IGlobalMobileApi
  {
    Task<IEnumerable<Institute>> GetInstitutesAsync();

    Task<Institute> GetInstituteAsync(Institute institute);

    Task SendProfileLogAsync(string phoneId, string userName, string instituteId);

    Task<PushSettings> NotificationRegistrationAsync(
      string instituteCode,
      int instituteUserId,
      string tutelaryId,
      string platform,
      string handle,
      UserRoles notificationRole,
      NotificationMessageSource notificationSource,
      int notificationType,
      string profileId);

    Task<PushSettings> NotificationUpdateAsync(
      string registrationId,
      int notificationType,
      NotificationMessageSource notificationSource,
      string handle);

    Task<PushSettings> NotificationDeleteAsync(
      string registrationId,
      NotificationMessageSource notificationSource,
      bool useGlobalMobileApiV1 = false);
  }
}
