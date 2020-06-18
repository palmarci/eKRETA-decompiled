// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IProfileDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Repository.RealmRepository.Profile;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IProfileDbDataService : IDataService
  {
    ProfileRealm GetProfile(string instituteCode, int instituteUserId, int roleId);

    ProfileRealm GetProfile(string Id);

    void SetActiveProfile(ProfileRealm profile);

    ProfileRealm GetActiveProfile();

    IEnumerable<ProfileRealm> GetProfiles();

    void AddOrUpdate(ProfileRealm profile, Action<ProfileRealm> action = null);

    Task AddOrUpdateAsync(ProfileRealm profile, Action<ProfileRealm> action = null);

    Task<bool> NotificationRegistrationAsync(ProfileRealm profile);

    Task<bool> NotificationUpdateAsync(
      ProfileRealm profile,
      NotificationMessageType notificationType,
      string token);

    Task<bool> NotificationDeleteAsync(ProfileRealm profile, bool useGlobalMobileApiV1 = false);

    void Delete(ProfileRealm profile);

    void DeleteOnlyProfileData(ProfileRealm profile);

    void UpdateTokenData(ProfileRealm profile, TokenData tokenData);

    int CountProfilesForRolelessId(string rolelessId);

    Task DefaultPushRegistration();
  }
}
