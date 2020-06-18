// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.FirebaseAnalytics.FirebaseRemoteConfigurationService
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Ekreta.Mobile.Core.Interfaces;
using Firebase.RemoteConfig;
using Newtonsoft.Json;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace eKreta.Mobile.Droid.Platform.FirebaseAnalytics
{
  public class FirebaseRemoteConfigurationService : IFirebaseRemoteConfigurationService
  {
    private readonly IRemoteConfigurationService _remoteConfigurationService;

    public FirebaseRemoteConfigurationService(
      IRemoteConfigurationService remoteConfigurationService)
    {
      this._remoteConfigurationService = remoteConfigurationService;
      FirebaseRemoteConfig.get_Instance().SetDefaults(2131689478);
    }

    public async Task FetchAndActivateAsync()
    {
      await FirebaseRemoteConfig.get_Instance().FetchAsync();
      Dictionary<string, string> all1 = this.GetAll();
      FirebaseRemoteConfig.get_Instance().ActivateFetched();
      Dictionary<string, string> all2 = this.GetAll();
      this._remoteConfigurationService.UpdateChangedList(all1, all2);
    }

    public async Task<T> GetAsync<T>(string key)
    {
      return await Task.FromResult<T>((T) JsonConvert.DeserializeObject<T>(FirebaseRemoteConfig.get_Instance().GetString(this._remoteConfigurationService.GetPrefix() + key)));
    }

    public bool CheckValueChanged(string key)
    {
      return this._remoteConfigurationService.CheckValueChanged(key);
    }

    private Dictionary<string, string> GetAll()
    {
      Dictionary<string, string> dictionary = new Dictionary<string, string>();
      foreach (string keyName in this._remoteConfigurationService.GetKeyNames())
        dictionary.Add(keyName, this.GetAsync<string>(keyName).Result);
      return dictionary;
    }
  }
}
