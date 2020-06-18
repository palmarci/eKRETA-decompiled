// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.DateTimeExtensions
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Extensions
{
  public static class DateTimeExtensions
  {
    public static DateTime FirstDayOfWeek(this DateTime date)
    {
      return date.AddDays((double) (1 - date.DayOfWeek)).Date;
    }

    public static DateTime LastDayOfWeek(this DateTime date)
    {
      return date.FirstDayOfWeek().AddDays(6.0);
    }
  }
}
