// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.GroupedListExtensions
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Helpers
{
  public static class GroupedListExtensions
  {
    public static void AddRange<TKey, TItem>(
      this IEnumerable<GroupedList<TKey, TItem>> list,
      IEnumerable<GroupedList<TKey, TItem>> items)
    {
      foreach (GroupedList<TKey, TItem> groupedList1 in items)
      {
        GroupedList<TKey, TItem> item = groupedList1;
        GroupedList<TKey, TItem> groupedList2 = list.FirstOrDefault<GroupedList<TKey, TItem>>((Func<GroupedList<TKey, TItem>, bool>) (x => x.Key.Equals((object) item.Key)));
        if (groupedList2 != null)
          groupedList2.AddRange((IEnumerable<TItem>) ((IEnumerable<TItem>) item).ToList<TItem>());
        else
          ((IList) list).Add((object) item);
      }
    }
  }
}
