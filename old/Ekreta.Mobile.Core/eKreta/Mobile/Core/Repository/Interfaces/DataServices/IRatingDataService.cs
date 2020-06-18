// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.IRatingDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices
{
  public interface IRatingDataService
  {
    int IdleDays { get; }

    int CancelIdleDays { get; }

    void AddOrUpdate(Profile profile, Rating rating);

    Rating GetRatingByProfile(Profile profile);

    Rating IncreaseAttempts(Profile profile);

    Rating Init(Profile profile, bool firebaseConfigChanged);
  }
}
