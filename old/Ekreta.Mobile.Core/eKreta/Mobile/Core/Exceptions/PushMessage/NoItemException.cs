// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.PushMessage.NoItemException
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.PushNotification.Enums;

namespace Ekreta.Mobile.Core.Exceptions.PushMessage
{
  public class NoItemException : ExceptionErrorCodeBase
  {
    public string InstituteCode { get; set; }

    public int InstituteUserId { get; set; }

    public int ItemId { get; set; }

    public NotificationMessageType Type { get; set; }

    public NoItemException(string message)
      : base(message)
    {
    }

    public NoItemException(
      string instituteCode,
      int instituteUserId,
      int itemId,
      NotificationMessageType type)
      : base(string.Format("No Item present for instituteCode: {0}, instituteUserId: {1},", (object) instituteCode, (object) instituteUserId) + string.Format("itemId: {0}, Type: {1}", (object) itemId, (object) type.ToString()))
    {
      this.InstituteCode = instituteCode;
      this.InstituteUserId = instituteUserId;
      this.ItemId = itemId;
      this.Type = type;
    }
  }
}
