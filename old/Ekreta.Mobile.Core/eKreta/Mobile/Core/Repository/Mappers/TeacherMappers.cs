// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Mappers.TeacherMappers
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
  public static class TeacherMappers
  {
    public static Teacher Map(this TeacherRealm source)
    {
      return new Teacher()
      {
        Uid = source.Uid,
        Alkalmazott = source.Alkalmazott.Map()
      };
    }

    public static TeacherRealm Map(this Teacher source)
    {
      return new TeacherRealm(source.Alkalmazott.Map())
      {
        Uid = source.Uid
      };
    }

    public static List<Teacher> Map(this IEnumerable<TeacherRealm> source)
    {
      return source.Select<TeacherRealm, Teacher>((Func<TeacherRealm, Teacher>) (x => x.Map())).ToList<Teacher>();
    }

    public static List<TeacherRealm> Map(this IEnumerable<Teacher> source)
    {
      return source.Select<Teacher, TeacherRealm>((Func<Teacher, TeacherRealm>) (x => x.Map())).ToList<TeacherRealm>();
    }
  }
}
