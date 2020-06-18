// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Employee
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Models
{
  public class Employee
  {
    public string Uid { get; set; }

    public string Nev { get; set; }

    public IEnumerable<PhoneNumber> Telefonok { get; set; }

    public IEnumerable<EmailAddress> Emailek { get; set; }

    [JsonIgnore]
    public bool HasAnyPublicContact
    {
      get
      {
        IEnumerable<PhoneNumber> telefonok = this.Telefonok;
        bool? nullable1 = telefonok != null ? new bool?(telefonok.Any<PhoneNumber>((Func<PhoneNumber, bool>) (x => x.IsPublic))) : new bool?();
        IEnumerable<EmailAddress> emailek = this.Emailek;
        bool? nullable2 = emailek != null ? new bool?(emailek.Any<EmailAddress>((Func<EmailAddress, bool>) (x => x.IsPublic))) : new bool?();
        if (nullable2.HasValue && nullable2.Value)
          return true;
        return nullable1.HasValue && nullable1.Value;
      }
    }
  }
}
