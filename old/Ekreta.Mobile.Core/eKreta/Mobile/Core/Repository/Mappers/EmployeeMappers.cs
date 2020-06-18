// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Mappers.EmployeeMappers
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.Mappers
{
  public static class EmployeeMappers
  {
    public static Employee Map(this EmployeeRealm source)
    {
      Employee employee = new Employee();
      employee.Uid = source.Uid;
      employee.Nev = source.Nev;
      IList<EmailAddressRealm> emailek = source.Emailek;
      employee.Emailek = emailek != null ? emailek.Map() : (IEnumerable<EmailAddress>) null;
      IList<PhoneNumberRealm> telefonok = source.Telefonok;
      employee.Telefonok = telefonok != null ? (IEnumerable<PhoneNumber>) telefonok.Map() : (IEnumerable<PhoneNumber>) null;
      return employee;
    }

    public static EmployeeRealm Map(this Employee source)
    {
      EmployeeRealm employeeRealm = new EmployeeRealm()
      {
        Uid = source.Uid,
        Nev = source.Nev
      };
      if (source.Telefonok != null)
      {
        foreach (PhoneNumber source1 in source.Telefonok)
          employeeRealm.Telefonok.Add(source1.Map());
      }
      if (source.Emailek != null)
      {
        foreach (EmailAddress source1 in source.Emailek)
          employeeRealm.Emailek.Add(source1.Map());
      }
      return employeeRealm;
    }
  }
}
