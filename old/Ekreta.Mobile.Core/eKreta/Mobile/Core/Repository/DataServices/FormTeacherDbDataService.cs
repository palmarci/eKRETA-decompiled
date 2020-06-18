// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.FormTeacherDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.FormTeacher;
using MvvmCross;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class FormTeacherDbDataService : IFormTeacherDbDataService
  {
    private readonly IFormTeacherDbRepository _formTeacherRepository;

    public FormTeacherDbDataService()
    {
      this._formTeacherRepository = (IFormTeacherDbRepository) Mvx.get_IoCProvider().Resolve<IFormTeacherDbRepository>();
    }

    public void Delete(FormTeacherRealm formTeacher)
    {
      this._formTeacherRepository.Remove(formTeacher);
    }
  }
}
