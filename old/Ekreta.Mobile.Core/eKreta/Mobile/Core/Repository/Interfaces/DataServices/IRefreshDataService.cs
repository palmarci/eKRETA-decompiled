// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IRefreshDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification;
using System;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IRefreshDataService
  {
    Task<Profile> RefreshProfileAsync();

    Task<Profile> RefreshProfileAsync(bool forceRefresh);

    Task<Profile> RefreshProfileAsync(Profile profile, bool forceRefresh = false);

    Task<Profile> UpdateStudentWithPushMessageAsync(
      Profile profile,
      PushMessage pushMessage,
      DateTime? fromDate = null,
      DateTime? toDate = null);

    int GetProfileNewsItemCount(Profile profile);
  }
}
