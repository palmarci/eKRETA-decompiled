// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher.FormTeacherRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher
{
  public class FormTeacherRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.FormTeacher, FormTeacherRealm>, IMapper<Ekreta.Mobile.Core.Models.FormTeacher, FormTeacherRealm>
  {
    public Ekreta.Mobile.Core.Models.FormTeacher From(FormTeacherRealm item)
    {
      return new Ekreta.Mobile.Core.Models.FormTeacher()
      {
        TeacherId = int.Parse(item.Id),
        Name = item.Name,
        Email = item.Email,
        PhoneNumber = item.PhoneNumber
      };
    }

    public FormTeacherRealm To(Ekreta.Mobile.Core.Models.FormTeacher item)
    {
      return new FormTeacherRealm()
      {
        Id = item.TeacherId.ToString(),
        Name = item.Name,
        Email = item.Email,
        PhoneNumber = item.PhoneNumber
      };
    }
  }
}
