// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings.PushSettingsRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Profile.PushSettings
{
  public class PushSettingsRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.PushNotification.PushSettings, PushSettingsRealm>, IMapper<Ekreta.Mobile.Core.Models.PushNotification.PushSettings, PushSettingsRealm>
  {
    public Ekreta.Mobile.Core.Models.PushNotification.PushSettings From(
      PushSettingsRealm item)
    {
      if (item == null)
        return (Ekreta.Mobile.Core.Models.PushNotification.PushSettings) null;
      return new Ekreta.Mobile.Core.Models.PushNotification.PushSettings()
      {
        RegistrationId = item.RegistrationId,
        NotificationTypes = (NotificationMessageType) item.NotificationTypes,
        Token = item.Token,
        FirstTimePushRun = item.FirstTimePushRun,
        UpdateEugyintezes = item.UpdateEugyintezes
      };
    }

    public PushSettingsRealm To(Ekreta.Mobile.Core.Models.PushNotification.PushSettings item)
    {
      if (item == null)
        return (PushSettingsRealm) null;
      return new PushSettingsRealm()
      {
        RegistrationId = item.RegistrationId,
        NotificationTypes = (int) item.NotificationTypes,
        Token = item.Token,
        FirstTimePushRun = item.FirstTimePushRun,
        UpdateEugyintezes = item.UpdateEugyintezes
      };
    }
  }
}
