// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.CacheDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Cache;
using MvvmCross;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class CacheDataService : ICacheDataService
  {
    private readonly ICacheDataRepository _cacheDataRepository;

    public CacheDataService()
    {
      this._cacheDataRepository = (ICacheDataRepository) Mvx.get_IoCProvider().Resolve<ICacheDataRepository>();
    }

    public CacheData GetCacheData(string key)
    {
      CacheData cacheData = this._cacheDataRepository.Find(key);
      if (cacheData == null)
        throw new KeyNotFoundException("Key: $" + key);
      if (cacheData.ExpirationDate <= DateTime.Now)
      {
        this._cacheDataRepository.Remove(cacheData);
        throw new KeyNotFoundException("Key: $" + key);
      }
      return cacheData;
    }

    public T GetObject<T>(string key)
    {
      return this.GetCacheData(key).GetObject<T>();
    }

    public void SaveCacheData<T>(string key, T value, DateTime expirationDate)
    {
      this._cacheDataRepository.AddOrUpdate(new CacheData()
      {
        Key = key,
        Value = JsonConvert.SerializeObject((object) value),
        ExpirationDate = expirationDate
      });
    }

    public void SaveCacheData(CacheData cacheData)
    {
      this._cacheDataRepository.AddOrUpdate(cacheData);
    }

    public void ClearProfileCache(Profile profile)
    {
      this._cacheDataRepository.Remove((ISpecification) new ProfileCacheSpecification(profile.Id));
    }
  }
}
