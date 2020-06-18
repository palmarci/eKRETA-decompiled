// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IProfileDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IProfileDataService : IDataService
  {
    Profile GetProfile(string instituteCode, int instituteUserId, int roleId);

    Profile GetProfile(string Id);

    void SetActiveProfile(Profile profile);

    Profile GetActiveProfile();

    IEnumerable<Profile> GetProfiles();

    void AddOrUpdate(Profile profile);

    Task<bool> NotificationRegistrationAsync(Profile profile);

    Task<bool> NotificationUpdateAsync(
      Profile profile,
      NotificationMessageType notificationType,
      string token);

    [Obsolete("Sehol sem használjuk, pár verzió után kikerülhet ha nem kell 2.9.6")]
    Task SendProfileLogAsync(string phoneId, string userName, string instituteId);

    Task<bool> NotificationDeleteAsync(Profile profile, bool useGlobalMobileApiV1 = false);

    void Delete(Profile profile);

    void DeleteOnlyProfileData(Profile profile);

    void UpdateTokenData(Profile profile, TokenData tokenData);

    int CountProfilesForRolelessId(string rolelessId);

    Task DefaultPushRegistration();
  }
}
