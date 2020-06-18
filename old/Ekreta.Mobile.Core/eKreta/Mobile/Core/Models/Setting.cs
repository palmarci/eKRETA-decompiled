// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Setting
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Models
{
  public class Setting
  {
    public string Key { get; set; }

    public object Value { get; set; }

    public T Get<T>(T defaultValue)
    {
      return this.Value == null ? defaultValue : (T) Convert.ChangeType(this.Value, typeof (T));
    }

    public T Get<T>()
    {
      return this.Get<T>(default (T));
    }
  }
}
