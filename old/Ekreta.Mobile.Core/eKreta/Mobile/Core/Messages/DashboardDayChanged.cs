// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Messages.DashboardDayChanged
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross.Plugin.Messenger;

namespace Ekreta.Mobile.Core.Messages
{
  public class DashboardDayChanged : MvxMessage
  {
    public int Day { get; private set; }

    public DashboardDayChanged(object sender, int day)
    {
      this.\u002Ector(sender);
      this.Day = day;
    }
  }
}
