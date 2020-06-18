// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Lesson.LessonRealmRepository
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Lesson
{
  public class LessonRealmRepository : BaseRealmRepository<Ekreta.Mobile.Core.Models.Lesson, LessonRealm>, ILessonRepository, IRepository<Ekreta.Mobile.Core.Models.Lesson>
  {
    public LessonRealmRepository()
    {
      this._mapper = (IRealmMapper<Ekreta.Mobile.Core.Models.Lesson, LessonRealm>) new LessonRealmMapper();
    }
  }
}
