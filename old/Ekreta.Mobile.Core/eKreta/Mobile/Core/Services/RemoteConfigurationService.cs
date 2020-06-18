// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.RemoteConfigurationService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.EnumConstants;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.Environments;
using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;

namespace Ekreta.Mobile.Core.Services
{
  public class RemoteConfigurationService : IRemoteConfigurationService
  {
    private static ConcurrentDictionary<string, bool> ChangedConfigList = new ConcurrentDictionary<string, bool>();
    private static List<string> KeyNames = new List<string>();
    private static string Prefix = "";

    public RemoteConfigurationService()
    {
      RemoteConfigurationService.KeyNames = ((IEnumerable<FieldInfo>) typeof (FirebaseRemoteConfigConstants).GetFields(BindingFlags.Static | BindingFlags.Public | BindingFlags.FlattenHierarchy)).Where<FieldInfo>((Func<FieldInfo, bool>) (fi => fi.IsLiteral && !fi.IsInitOnly)).Select<FieldInfo, string>((Func<FieldInfo, string>) (x => (string) x.GetRawConstantValue())).ToList<string>();
      foreach (string keyName in RemoteConfigurationService.KeyNames)
        RemoteConfigurationService.ChangedConfigList.AddOrUpdate(keyName, false, (Func<string, bool, bool>) ((_, oldvalue) => false));
      Ekreta.Mobile.Core.Models.Environments.Environments environment = ConfigurationRepository.EnvironmentSetting.Environment;
      if (environment != Ekreta.Mobile.Core.Models.Environments.Environments.PROD)
        return;
      RemoteConfigurationService.Prefix = string.Format("{0}", (object) environment);
    }

    public bool CheckValueChanged(string key)
    {
      return RemoteConfigurationService.ChangedConfigList[key];
    }

    public List<string> GetKeyNames()
    {
      return RemoteConfigurationService.KeyNames;
    }

    public string GetPrefix()
    {
      return RemoteConfigurationService.Prefix;
    }

    public void UpdateChangedList(
      Dictionary<string, string> oldValues,
      Dictionary<string, string> newValues)
    {
      foreach (string keyName in this.GetKeyNames())
      {
        string oldValue = oldValues[keyName];
        bool isEquals = (oldValue != null ? (oldValue.Equals(newValues[keyName]) ? 1 : 0) : 1) != 0;
        RemoteConfigurationService.ChangedConfigList.AddOrUpdate(keyName, !isEquals, (Func<string, bool, bool>) ((_, oldvalue) => !isEquals));
      }
    }
  }
}
