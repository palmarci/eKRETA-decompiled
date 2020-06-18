// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.SettingsDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Settings;
using MvvmCross;
using System;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class SettingsDbDataService : ISettingsDbDataService
  {
    private const string DashboardDayRange = "DashboardDayRange";
    private const string BadgeCount = "BadgeCount";
    private const string UserAgentText = "UserAgentText";
    private const string DoneHomeWorkFilter = "DoneHomeWorkFilter";
    private const int defaultDashboardDayRange = 7;
    private const int newsItemExpirationDay = 1;
    private const bool defaultDoneHomeWorkFilterState = false;
    private readonly ISettingDbRepository _settingRepository;

    public SettingsDbDataService()
    {
      this._settingRepository = (ISettingDbRepository) Mvx.get_IoCProvider().Resolve<ISettingDbRepository>();
    }

    public int GetDashboardDayRange()
    {
      SettingRealm settingRealm = this._settingRepository.Find("DashboardDayRange");
      return settingRealm == null || settingRealm.Value == null ? 7 : int.Parse(settingRealm.Value);
    }

    public void SetDashboardDayRange(int value)
    {
      this._settingRepository.AddOrUpdate(new SettingRealm()
      {
        Key = "DashboardDayRange",
        Value = value.ToString()
      }, (Action<SettingRealm>) null);
    }

    public void SetUserAgentText(string text)
    {
      this._settingRepository.AddOrUpdate(new SettingRealm()
      {
        Key = "UserAgentText",
        Value = text
      }, (Action<SettingRealm>) null);
    }

    public string GetUserAgentText()
    {
      return this._settingRepository.Find("UserAgentText").Value ?? ConfigurationRepository.EnvironmentSetting.DefaultUserAgentHeader;
    }

    public int NewsItemExpirationDay
    {
      get
      {
        return 1;
      }
    }

    public bool GetDoneHomeWorkFilterSetting()
    {
      SettingRealm settingRealm = this._settingRepository.Find("DoneHomeWorkFilter");
      return settingRealm != null && settingRealm.Value != null && bool.Parse(settingRealm.Value);
    }

    public void SetDoneHomeWorkFilterSetting(bool value)
    {
      this._settingRepository.AddOrUpdate(new SettingRealm()
      {
        Key = "DoneHomeWorkFilter",
        Value = value.ToString()
      }, (Action<SettingRealm>) null);
    }
  }
}
