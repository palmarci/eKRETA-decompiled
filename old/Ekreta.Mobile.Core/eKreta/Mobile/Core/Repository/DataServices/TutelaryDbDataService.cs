// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.TutelaryDbDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary;
using MvvmCross;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class TutelaryDbDataService : ITutelaryDbDataService
  {
    private readonly ITutelaryDbRepository _tutelaryRepository;

    public TutelaryDbDataService()
    {
      this._tutelaryRepository = (ITutelaryDbRepository) Mvx.get_IoCProvider().Resolve<ITutelaryDbRepository>();
    }

    public void Delete(TutelaryRealm tutelary)
    {
      this._tutelaryRepository.Remove(tutelary);
    }
  }
}
