// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.ClassGroupMappers
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Mappers;

namespace Ekreta.Mobile.Core.Repository.RealmRepository
{
  public static class ClassGroupMappers
  {
    public static ClassGroupRealm Map(this ClassGroup source)
    {
      return new ClassGroupRealm()
      {
        Uid = source.Uid,
        IsAktiv = source.IsAktiv,
        Nev = source.Nev,
        OsztalyfonokUid = source.OsztalyfonokUid,
        OktatasNevelesiFeladat = source.OktatasNevelesiFeladat.Map(),
        OsztalyCsoportTipus = source.OsztalyCsoportTipus
      };
    }

    public static ClassGroup Map(this ClassGroupRealm source)
    {
      return new ClassGroup()
      {
        Uid = source.Uid,
        IsAktiv = source.IsAktiv,
        Nev = source.Nev,
        OsztalyfonokUid = source.OsztalyfonokUid,
        OktatasNevelesiFeladat = source.OktatasNevelesiFeladat.Map(),
        OsztalyCsoportTipus = source.OsztalyCsoportTipus
      };
    }
  }
}
