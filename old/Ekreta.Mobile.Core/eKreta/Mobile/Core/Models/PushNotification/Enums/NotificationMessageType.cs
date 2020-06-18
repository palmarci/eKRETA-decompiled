// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.PushNotification.Enums.NotificationMessageType
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Models.PushNotification.Enums
{
  [Flags]
  public enum NotificationMessageType
  {
    All = 1,
    Evaluation = 2,
    Absence = 4,
    Note = 8,
    Message = 16, // 0x00000010
    Homework = 32, // 0x00000020
    Exam = 64, // 0x00000040
  }
}
