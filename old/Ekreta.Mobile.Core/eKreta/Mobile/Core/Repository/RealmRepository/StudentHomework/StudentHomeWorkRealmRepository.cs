// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework.StudentHomeWorkRealmRepository
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.StudentHomework
{
  public class StudentHomeWorkRealmRepository : BaseRealmRepository<TanuloHaziFeladat, StudentHomeWorkRealm>, IStudentHomeWorkRepository, IRepository<TanuloHaziFeladat>
  {
    public StudentHomeWorkRealmRepository()
    {
      this._mapper = (IRealmMapper<TanuloHaziFeladat, StudentHomeWorkRealm>) new StudentHomeWorkRealmMapper();
    }
  }
}
