// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework.StudentHomeWorkRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework
{
  public class StudentHomeWorkRealmMapper : IRealmMapper<TanuloHaziFeladat, StudentHomeWorkRealm>, IMapper<TanuloHaziFeladat, StudentHomeWorkRealm>
  {
    public TanuloHaziFeladat From(StudentHomeWorkRealm item)
    {
      return new TanuloHaziFeladat()
      {
        Id = int.Parse(item.Id),
        TanuloNev = item.TanuloNev,
        FeladasDatuma = item.FeladasDatuma.LocalDateTime,
        FeladatSzovege = item.FeladatSzovege,
        RogzitoId = item.RogzitoId,
        TanuloAltalTorolt = item.TanuloAltalTorolt,
        TanarAltalTorolt = item.TanarAltalTorolt,
        TeacherHomeWorkId = item.TanarHaziFeladatId,
        CanDeleteByUser = item.CanDeleteByUser,
        ProfileId = item.ProfileId
      };
    }

    public StudentHomeWorkRealm To(TanuloHaziFeladat item)
    {
      return new StudentHomeWorkRealm()
      {
        Id = item.Id.ToString(),
        TanuloNev = item.TanuloNev,
        FeladasDatuma = new DateTimeOffset(item.FeladasDatuma),
        FeladatSzovege = item.FeladatSzovege,
        RogzitoId = item.RogzitoId,
        TanuloAltalTorolt = item.TanuloAltalTorolt,
        TanarAltalTorolt = item.TanarAltalTorolt,
        TanarHaziFeladatId = item.TeacherHomeWorkId,
        CanDeleteByUser = item.CanDeleteByUser,
        ProfileId = item.ProfileId
      };
    }
  }
}
