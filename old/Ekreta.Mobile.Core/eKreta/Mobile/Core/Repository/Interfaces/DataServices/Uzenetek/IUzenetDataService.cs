// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek.IUzenetDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Uzenetek;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek
{
  public interface IUzenetDataService : IDataService
  {
    Task<IEnumerable<PostaladaElem>> FetchPostaladaElemek(
      Profile profile);

    Task<PostaladaElem> FetchPostaladaElem(Profile profile, long azonosito);

    Task<string> FetchCsatolmany(Profile profile, Csatolmany csatolmany);

    PostaladaElem OverridePostaladaElem(Profile profile, PostaladaElem uzenet);

    IEnumerable<PostaladaElem> OverridePostaladaElemek(
      Profile profile,
      IEnumerable<PostaladaElem> newPostaladaElemek);

    IEnumerable<PostaladaElem> GetPostaladaElemek(Profile profile);

    PostaladaElem GetPostaladaElem(int itemId);

    void AddOrUpdate(Profile profile, PostaladaElem postaladaElem);

    int GetNewItemCount();

    int GetNewItemCount(Profile profile);

    Task ReadPostaladaElem(Profile profile, PostaladaElem postaladaElem);

    void Delete(Profile profile);
  }
}
