// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.ConfigurationService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.Environments;
using Newtonsoft.Json;
using System.Net.Http;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Services
{
  public class ConfigurationService : IConfigurationService
  {
    private readonly string _descriptorUrl = "https://kretamobile.blob.core.windows.net/configuration/ConfigurationDescriptor.json";
    private ConfigurationDescriptor _descriptor;
    private bool _initialized;

    public async Task InitAsync()
    {
      if (this._initialized)
        return;
      using (HttpClient client = new HttpClient((HttpMessageHandler) HttpClientHelpers.GetClientHandler(true)))
      {
        HttpResponseMessage async = await client.GetAsync(this._descriptorUrl);
        if (async.IsSuccessStatusCode)
        {
          this._descriptor = (ConfigurationDescriptor) JsonConvert.DeserializeObject<ConfigurationDescriptor>(await async.Content.ReadAsStringAsync());
          switch (ConfigurationRepository.EnvironmentSetting.Environment)
          {
            case Ekreta.Mobile.Core.Models.Environments.Environments.PROD:
              ConfigurationRepository.EnvironmentSetting.GlobalMobileApiUrl = "https://kretaglobalmobileapi2.ekreta.hu";
              break;
            case Ekreta.Mobile.Core.Models.Environments.Environments.UAT:
              ConfigurationRepository.EnvironmentSetting.GlobalMobileApiUrl = this._descriptor.GlobalMobileApiUrlUAT;
              break;
            case Ekreta.Mobile.Core.Models.Environments.Environments.TEST:
              ConfigurationRepository.EnvironmentSetting.GlobalMobileApiUrl = this._descriptor.GlobalMobileApiUrlTEST;
              break;
            case Ekreta.Mobile.Core.Models.Environments.Environments.DEV:
              ConfigurationRepository.EnvironmentSetting.GlobalMobileApiUrl = this._descriptor.GlobalMobileApiUrlDEV;
              break;
          }
          this._initialized = true;
        }
      }
    }
  }
}
