// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.PushNotification.PushMessage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.PushNotification.Enums;

namespace Ekreta.Mobile.Core.Models.PushNotification
{
  public class PushMessage
  {
    public int UserId { get; set; }

    public string InstituteCode { get; set; }

    public NotificationMessageType NotificationType { get; set; }

    public int ItemId { get; set; }

    public string Message { get; set; }

    public string MessageId { get; set; }

    public string Version { get; set; }

    public int NotificationRole { get; set; }

    public override string ToString()
    {
      return "PushMessage{UserId=" + this.UserId.ToString() + ", InstituteCode='" + this.InstituteCode + "', NotificationType=" + this.NotificationType.ToString() + ", NotificationRole=" + this.NotificationRole.ToString() + ", ItemId=" + this.ItemId.ToString() + ", Message='" + this.Message + "', MessageId='" + this.MessageId + "'}";
    }
  }
}
