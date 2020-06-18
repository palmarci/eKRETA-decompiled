// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Cache.CacheDataRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Cache
{
  public class CacheDataRealmMapper : IRealmMapper<CacheData, CacheDataRealm>, IMapper<CacheData, CacheDataRealm>
  {
    public CacheData From(CacheDataRealm item)
    {
      return new CacheData()
      {
        Key = item.Key,
        Value = item.Value,
        ExpirationDate = item.ExpirationDate.LocalDateTime
      };
    }

    public CacheDataRealm To(CacheData item)
    {
      return new CacheDataRealm()
      {
        Key = item.Key,
        Value = item.Value,
        ExpirationDate = new DateTimeOffset(item.ExpirationDate)
      };
    }
  }
}
