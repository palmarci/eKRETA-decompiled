// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.PushNotification.PushSettings
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Newtonsoft.Json;

namespace Ekreta.Mobile.Core.Models.PushNotification
{
  public class PushSettings
  {
    public string RegistrationId { get; set; }

    public NotificationMessageType NotificationTypes { get; set; }

    public string Token { get; set; }

    public bool FirstTimePushRun { get; set; }

    public bool UpdateEugyintezes { get; set; }

    [JsonIgnore]
    public bool IsPushActive
    {
      get
      {
        return !string.IsNullOrEmpty(this.RegistrationId);
      }
    }
  }
}
