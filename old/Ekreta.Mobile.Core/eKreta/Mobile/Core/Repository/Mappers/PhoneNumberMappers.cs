// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Mappers.PhoneNumberMappers
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
  public static class PhoneNumberMappers
  {
    public static PhoneNumber Map(this PhoneNumberRealm source)
    {
      return new PhoneNumber()
      {
        Uid = source.Uid,
        IsAlapertelmezett = source.IsAlapertelmezett,
        Telefonszam = source.Telefonszam,
        Tipus = source.Tipus
      };
    }

    public static PhoneNumberRealm Map(this PhoneNumber source)
    {
      return new PhoneNumberRealm()
      {
        Uid = source.Uid,
        IsAlapertelmezett = source.IsAlapertelmezett,
        Telefonszam = source.Telefonszam,
        Tipus = source.Tipus
      };
    }

    public static List<PhoneNumber> Map(this IEnumerable<PhoneNumberRealm> source)
    {
      return source.Select<PhoneNumberRealm, PhoneNumber>((Func<PhoneNumberRealm, PhoneNumber>) (x => x.Map())).ToList<PhoneNumber>();
    }

    public static List<PhoneNumberRealm> Map(
      this IEnumerable<PhoneNumber> source)
    {
      return source.Select<PhoneNumber, PhoneNumberRealm>((Func<PhoneNumber, PhoneNumberRealm>) (x => x.Map())).ToList<PhoneNumberRealm>();
    }
  }
}
