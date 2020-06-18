// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.SettingsDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using MvvmCross;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class SettingsDataService : ISettingsDataService
  {
    private const string DashboardDayRange = "DashboardDayRange";
    private const string BadgeCount = "BadgeCount";
    private const string UserAgentText = "UserAgentText";
    private const int defaultDashboardDayRange = 7;
    private const int newsItemExpirationDay = 1;
    private readonly ISettingRepository _settingRepository;

    public SettingsDataService()
    {
      this._settingRepository = (ISettingRepository) Mvx.get_IoCProvider().Resolve<ISettingRepository>();
    }

    public int GetDashboardDayRange()
    {
      Setting setting = this._settingRepository.Find("DashboardDayRange");
      return setting == null ? 7 : setting.Get<int>(7);
    }

    public void SetDashboardDayRange(int value)
    {
      this._settingRepository.AddOrUpdate(new Setting()
      {
        Key = "DashboardDayRange",
        Value = (object) value
      });
    }

    public int GetBadgeCount()
    {
      Setting setting = this._settingRepository.Find("BadgeCount");
      return setting == null ? 0 : setting.Get<int>();
    }

    public void SetBadgeCount(int value)
    {
      this._settingRepository.AddOrUpdate(new Setting()
      {
        Key = "BadgeCount",
        Value = (object) value
      });
    }

    public int IncreaseAndGetBadgeCount()
    {
      Setting setting = this._settingRepository.Find("BadgeCount");
      if (setting == null)
        setting = new Setting()
        {
          Key = "BadgeCount",
          Value = (object) 0
        };
      setting.Value = (object) (setting.Get<int>() + 1);
      this._settingRepository.AddOrUpdate(setting);
      return setting.Get<int>();
    }

    public int DecreaseAndGetBadgeCount()
    {
      Setting setting = this._settingRepository.Find("BadgeCount");
      if (setting == null)
        setting = new Setting()
        {
          Key = "BadgeCount",
          Value = (object) 0
        };
      setting.Value = (object) (setting.Get<int>() - 1);
      this._settingRepository.AddOrUpdate(setting);
      return setting.Get<int>();
    }

    public void SetUserAgentText(string text)
    {
      this._settingRepository.AddOrUpdate(new Setting()
      {
        Key = "UserAgentText",
        Value = (object) text
      });
    }

    public string GetUserAgentText()
    {
      return this._settingRepository.Find("UserAgentText").Get<string>(ConfigurationRepository.EnvironmentSetting.DefaultUserAgentHeader);
    }

    public int NewsItemExpirationDay
    {
      get
      {
        return 1;
      }
    }
  }
}
