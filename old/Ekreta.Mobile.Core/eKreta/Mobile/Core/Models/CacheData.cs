// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.CacheData
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System;

namespace Ekreta.Mobile.Core.Models
{
  public class CacheData
  {
    public string Key { get; set; }

    public string Value { get; set; }

    public DateTime ExpirationDate { get; set; }

    public T Get<T>(T defaultValue)
    {
      return this.Value == null ? defaultValue : (T) Convert.ChangeType((object) this.Value, typeof (T));
    }

    public T Get<T>()
    {
      return this.Get<T>(default (T));
    }

    public T GetObject<T>()
    {
      return this.Value == null ? default (T) : JsonConvert.DeserializeObject<T>(this.Value);
    }
  }
}
