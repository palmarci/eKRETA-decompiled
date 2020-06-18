// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.UzenetKuldes.IEugyintezesApi
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Uzenetek;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Services.UzenetKuldes
{
  public interface IEugyintezesApi
  {
    Task<IEnumerable<PostaladaElem>> GetPostaladaElemekAsync(
      Profile profile,
      string accessToken);

    Task<PostaladaElem> GetPostaladaElemAsync(
      Profile profile,
      string accessToken,
      long azonosito);

    Task<string> GetCsatolmanyAsync(Profile profile, string accessToken, Csatolmany csatolmany);

    Task<bool> PostPostaladaElemElolvasvaAsync(
      Profile profile,
      string accessToken,
      long azonosito);
  }
}
