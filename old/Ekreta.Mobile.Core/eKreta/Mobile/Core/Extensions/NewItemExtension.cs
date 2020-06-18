// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.NewItemExtension
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using Realms;
using System;

namespace Ekreta.Mobile.Core.Extensions
{
  public static class NewItemExtension
  {
    public static void SeenByUser(this INewItem item)
    {
      RealmDb.Instance.Write((Action) (() =>
      {
        if (!(item is RealmObject))
          return;
        item.SeenByUser = true;
        RealmDb.Instance.Add(item as RealmObject, true);
      }));
    }
  }
}
