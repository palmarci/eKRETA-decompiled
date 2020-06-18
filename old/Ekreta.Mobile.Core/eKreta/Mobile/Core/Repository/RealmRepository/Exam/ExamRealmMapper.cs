// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Exam.ExamRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Exam
{
  public class ExamRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Exam, ExamRealm>, IMapper<Ekreta.Mobile.Core.Models.Exam, ExamRealm>
  {
    public Ekreta.Mobile.Core.Models.Exam From(ExamRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Exam()
      {
        Uid = item.Uid,
        Id = item.Id,
        ExamId = item.ExamId,
        Datum = item.Datum.UtcDateTime.ToLocalTime(),
        HetNapja = item.HetNapja,
        Oraszam = item.Oraszam,
        Tantargy = item.Tantargy,
        Tanar = item.Tanar,
        SzamonkeresMegnevezese = item.SzamonkeresMegnevezese,
        SzamonkeresModja = item.SzamonkeresModja,
        BejelentesDatuma = item.BejelentesDatuma.UtcDateTime.ToLocalTime(),
        ProfileId = item.ProfileId,
        SeenByUser = item.SeenByUser
      };
    }

    public ExamRealm To(Ekreta.Mobile.Core.Models.Exam item)
    {
      return new ExamRealm()
      {
        Uid = item.Uid,
        Id = item.Id,
        ExamId = item.ExamId,
        Datum = new DateTimeOffset(item.Datum),
        HetNapja = item.HetNapja,
        Oraszam = item.Oraszam,
        Tantargy = item.Tantargy,
        Tanar = item.Tanar,
        SzamonkeresMegnevezese = item.SzamonkeresMegnevezese,
        SzamonkeresModja = item.SzamonkeresModja,
        BejelentesDatuma = new DateTimeOffset(item.BejelentesDatuma),
        ProfileId = item.ProfileId,
        SeenByUser = item.SeenByUser
      };
    }
  }
}
