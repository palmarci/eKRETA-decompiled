// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.RealmDb
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Realms;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  public sealed class RealmDb
  {
    private static Realm _instance = (Realm) null;
    private static readonly object _lock = new object();

    public static Realm Instance
    {
      get
      {
        lock (RealmDb._lock)
        {
          if (RealmDb._instance == null)
            RealmDb._instance = Realm.GetInstance((RealmConfigurationBase) RealmUtils.RealmConfiguration);
          return RealmDb._instance;
        }
      }
    }
  }
}
