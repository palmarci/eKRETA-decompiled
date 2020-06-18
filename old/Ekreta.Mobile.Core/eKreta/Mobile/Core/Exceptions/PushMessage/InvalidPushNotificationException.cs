// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.PushMessage.InvalidPushNotificationException
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Exceptions.PushMessage
{
  public class InvalidPushNotificationException : ExceptionErrorCodeBase
  {
    private string ParameterName { get; set; }

    private string Value { get; set; }

    public IDictionary<string, string> NotificationMessage { get; set; }

    public InvalidPushNotificationException(string message)
      : base(message)
    {
    }

    public InvalidPushNotificationException(
      IDictionary<string, string> notificationMessage,
      string parameterName,
      string value)
      : base("Can't parse this " + parameterName + " parameter with value: " + value + " /n/n pushMessage: " + notificationMessage.ToString())
    {
      this.NotificationMessage = notificationMessage;
      this.ParameterName = parameterName;
      this.Value = value;
    }
  }
}
