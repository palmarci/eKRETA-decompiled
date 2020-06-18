﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.TutelaryDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using MvvmCross;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class TutelaryDataService : ITutelaryDataService
  {
    private readonly ITutelaryRepository _tutelaryRepository;

    public TutelaryDataService()
    {
      this._tutelaryRepository = (ITutelaryRepository) Mvx.get_IoCProvider().Resolve<ITutelaryRepository>();
    }

    public void Delete(Tutelary tutelary)
    {
      this._tutelaryRepository.Remove(tutelary);
    }
  }
}
