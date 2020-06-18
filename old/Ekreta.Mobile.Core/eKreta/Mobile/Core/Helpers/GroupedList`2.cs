// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.GroupedList`2
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Helpers
{
  public class GroupedList<TKey, TItem> : List<TItem>
  {
    public TKey Key { get; private set; }

    public string KeyValue { get; private set; }

    public string KeyFormatString { get; set; }

    public GroupedList(TKey key, IEnumerable<TItem> items, string keyFormatString = "{0}")
    {
      this.Key = key;
      this.KeyValue = key.ToString();
      this.KeyFormatString = keyFormatString;
      if (items == null)
        return;
      this.AddRange(items);
    }

    public GroupedList(
      TKey key,
      string keyValue,
      IEnumerable<TItem> items,
      string keyFormatString = "{0}")
    {
      this.Key = key;
      this.KeyValue = keyValue;
      this.KeyFormatString = keyFormatString;
      if (items == null)
        return;
      this.AddRange(items);
    }

    public override string ToString()
    {
      return string.Format(this.KeyFormatString, (object) this.KeyValue);
    }
  }
}
