// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Mappers.FormMasterMappers
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.Mappers
{
  public static class FormMasterMappers
  {
    public static FormMaster Map(this FormMasterRealm source)
    {
      return new FormMaster()
      {
        Uid = source.Uid,
        Tanar = source.Tanar.Map()
      };
    }

    public static FormMasterRealm Map(this FormMaster source)
    {
      return new FormMasterRealm(source.Tanar.Map())
      {
        Uid = source.Uid
      };
    }

    public static List<FormMaster> Map(this IEnumerable<FormMasterRealm> source)
    {
      return source.Select<FormMasterRealm, FormMaster>((Func<FormMasterRealm, FormMaster>) (x => x.Map())).ToList<FormMaster>();
    }

    public static List<FormMasterRealm> Map(this IEnumerable<FormMaster> source)
    {
      return source.Select<FormMaster, FormMasterRealm>((Func<FormMaster, FormMasterRealm>) (x => x.Map())).ToList<FormMasterRealm>();
    }
  }
}
