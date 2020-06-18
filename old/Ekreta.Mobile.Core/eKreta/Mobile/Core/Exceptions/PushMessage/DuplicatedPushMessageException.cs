// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.PushMessage.DuplicatedPushMessageException
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Exceptions.PushMessage
{
  public class DuplicatedPushMessageException : ExceptionErrorCodeBase
  {
    public string MessageId { get; set; }

    public IDictionary<string, string> NotificationMessage { get; set; }

    public DuplicatedPushMessageException(string message)
      : base(message)
    {
    }

    public DuplicatedPushMessageException(
      IDictionary<string, string> notificationMessage,
      string messageId)
      : base("Duplicated Message with MessageId: " + messageId + " /n/n pushMessage: " + notificationMessage.ToString())
    {
      this.MessageId = this.MessageId;
      this.NotificationMessage = notificationMessage;
    }
  }
}
