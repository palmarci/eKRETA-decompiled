// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork.TeacherHomeWorkRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.TeacherHomeWork
{
  public class TeacherHomeWorkRealmMapper : IRealmMapper<TanarHaziFeladat, TeacherHomeWorkRealm>, IMapper<TanarHaziFeladat, TeacherHomeWorkRealm>
  {
    public TanarHaziFeladat From(TeacherHomeWorkRealm item)
    {
      return new TanarHaziFeladat()
      {
        Id = int.Parse(item.Id),
        OsztalyCsoport = item.OsztalyCsoport,
        Tantargy = item.Tantargy,
        Rogzito = item.Rogzito,
        IsTanarRogzitette = item.IsTanarRogzitette,
        TanitasiOraId = item.TanitasiOraId,
        Szoveg = item.Szoveg,
        FeladasDatuma = item.FeladasDatuma.LocalDateTime,
        Hatarido = item.Hatarido.LocalDateTime,
        EnableTanuloHazifeladat = item.EnableTanuloHazifeladat,
        Done = item.Done
      };
    }

    public TeacherHomeWorkRealm To(TanarHaziFeladat item)
    {
      return new TeacherHomeWorkRealm()
      {
        Id = item.Id.ToString(),
        OsztalyCsoport = item.OsztalyCsoport,
        Tantargy = item.Tantargy,
        Rogzito = item.Rogzito,
        IsTanarRogzitette = item.IsTanarRogzitette,
        TanitasiOraId = item.TanitasiOraId,
        Szoveg = item.Szoveg,
        FeladasDatuma = new DateTimeOffset(item.FeladasDatuma),
        Hatarido = new DateTimeOffset(item.Hatarido),
        EnableTanuloHazifeladat = item.EnableTanuloHazifeladat,
        Done = item.Done
      };
    }
  }
}
