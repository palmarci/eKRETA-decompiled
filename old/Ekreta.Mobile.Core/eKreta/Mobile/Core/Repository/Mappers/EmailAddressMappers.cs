// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Mappers.EmailAddressMappers
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
  public static class EmailAddressMappers
  {
    public static EmailAddress Map(this EmailAddressRealm source)
    {
      return new EmailAddress()
      {
        Uid = source.Uid,
        Email = source.Email,
        IsAlapertelmezett = source.IsAlapertelmezett,
        Tipus = source.Tipus
      };
    }

    public static EmailAddressRealm Map(this EmailAddress source)
    {
      return new EmailAddressRealm()
      {
        Uid = source.Uid,
        IsAlapertelmezett = source.IsAlapertelmezett,
        Email = source.Email,
        Tipus = source.Tipus
      };
    }

    public static IEnumerable<EmailAddress> Map(
      this IEnumerable<EmailAddressRealm> source)
    {
      return (IEnumerable<EmailAddress>) source.Select<EmailAddressRealm, EmailAddress>((Func<EmailAddressRealm, EmailAddress>) (x => x.Map())).ToList<EmailAddress>();
    }

    public static List<EmailAddressRealm> Map(
      this IEnumerable<EmailAddress> source)
    {
      return source.Select<EmailAddress, EmailAddressRealm>((Func<EmailAddress, EmailAddressRealm>) (x => x.Map())).ToList<EmailAddressRealm>();
    }
  }
}
