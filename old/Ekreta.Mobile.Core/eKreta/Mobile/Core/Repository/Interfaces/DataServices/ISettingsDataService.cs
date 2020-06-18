// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ISettingsDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ISettingsDataService
  {
    int NewsItemExpirationDay { get; }

    int GetDashboardDayRange();

    void SetDashboardDayRange(int value);

    int GetBadgeCount();

    void SetBadgeCount(int value);

    int DecreaseAndGetBadgeCount();

    int IncreaseAndGetBadgeCount();

    void SetUserAgentText(string text);

    string GetUserAgentText();
  }
}
