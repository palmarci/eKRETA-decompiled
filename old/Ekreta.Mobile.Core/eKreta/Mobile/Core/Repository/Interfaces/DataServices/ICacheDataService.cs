// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.ICacheDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using System;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface ICacheDataService
  {
    CacheData GetCacheData(string key);

    void SaveCacheData<T>(string key, T value, DateTime expirationDate);

    void SaveCacheData(CacheData cacheData);

    T GetObject<T>(string key);

    void ClearProfileCache(Profile profile);
  }
}
