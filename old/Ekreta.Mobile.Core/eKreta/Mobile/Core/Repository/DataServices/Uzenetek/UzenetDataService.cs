// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.Uzenetek.UzenetDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Uzenetek;
using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories.Uzenetek;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Specifications;
using Ekreta.Mobile.Core.Services.UzenetKuldes;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Repository.DataServices.Uzenetek
{
  public class UzenetDataService : IUzenetDataService, IDataService
  {
    private readonly ISecureStore _secureStore;
    private readonly IEugyintezesApi _eugyintezesApi;
    private readonly IPostaladaElemRepository _postaladaElemRepository;
    private readonly IUzenetRepository _uzenetRepository;
    private readonly ICsatolmanyRepository _csatolmanyRepository;
    private readonly ICimzettRepository _cimzettRepository;
    private readonly IDataViewer _dataViewer;
    private readonly IPermissionManager _permissionManager;

    public UzenetDataService()
    {
      this._secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      this._eugyintezesApi = (IEugyintezesApi) Mvx.get_IoCProvider().Resolve<IEugyintezesApi>();
      this._postaladaElemRepository = (IPostaladaElemRepository) Mvx.get_IoCProvider().Resolve<IPostaladaElemRepository>();
      this._uzenetRepository = (IUzenetRepository) Mvx.get_IoCProvider().Resolve<IUzenetRepository>();
      this._csatolmanyRepository = (ICsatolmanyRepository) Mvx.get_IoCProvider().Resolve<ICsatolmanyRepository>();
      this._cimzettRepository = (ICimzettRepository) Mvx.get_IoCProvider().Resolve<ICimzettRepository>();
      this._dataViewer = (IDataViewer) Mvx.get_IoCProvider().Resolve<IDataViewer>();
      this._permissionManager = (IPermissionManager) Mvx.get_IoCProvider().Resolve<IPermissionManager>();
    }

    public PostaladaElem GetPostaladaElem(int itemId)
    {
      return this._postaladaElemRepository.Find(itemId.ToString());
    }

    public void AddOrUpdate(Ekreta.Mobile.Core.Models.Uzenetek.Uzenet uzenet)
    {
      this._uzenetRepository.AddOrUpdate(uzenet);
    }

    public async Task<IEnumerable<PostaladaElem>> FetchPostaladaElemek(
      Profile profile)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      TokenData tokenData = this._secureStore.GetTokenData(profile.Id);
      if (tokenData == null)
        throw new UnauthorizedApiAccessException().SetErrorCode<UnauthorizedApiAccessException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Uzenetek/PostaladaElemDataService.cs", 58);
      return await this._eugyintezesApi.GetPostaladaElemekAsync(profile, tokenData.AccessToken);
    }

    public async Task<PostaladaElem> FetchPostaladaElem(
      Profile profile,
      long azonosito)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      TokenData tokenData = this._secureStore.GetTokenData(profile.Id);
      if (tokenData == null)
        throw new UnauthorizedApiAccessException().SetErrorCode<UnauthorizedApiAccessException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Uzenetek/PostaladaElemDataService.cs", 74);
      return await this._eugyintezesApi.GetPostaladaElemAsync(profile, tokenData.AccessToken, azonosito);
    }

    public Task<string> FetchCsatolmany(Profile profile, Csatolmany csatolmany)
    {
      if (profile == null)
        throw new ArgumentNullException(nameof (profile));
      TokenData tokenData = this._secureStore.GetTokenData(profile.Id);
      if (tokenData == null)
        throw new UnauthorizedApiAccessException().SetErrorCode<UnauthorizedApiAccessException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Uzenetek/PostaladaElemDataService.cs", 90);
      if (this._permissionManager != null && !this._permissionManager.PermissionGranted())
        this._permissionManager.RequestPermission();
      return this._dataViewer.IsFileExists(csatolmany.FajlNev) ? Task.FromResult<string>(this._dataViewer.FilePath(csatolmany.FajlNev)) : this._eugyintezesApi.GetCsatolmanyAsync(profile, tokenData.AccessToken, csatolmany);
    }

    public IEnumerable<PostaladaElem> GetPostaladaElemek(Profile profile)
    {
      this._postaladaElemRepository.Query();
      return this._postaladaElemRepository.Query((ISpecification) new PostaladaElemekByProfileSpecification(profile.Id));
    }

    public void AddOrUpdate(Profile profile, IEnumerable<PostaladaElem> postaladaElemek)
    {
      if (postaladaElemek == null || !postaladaElemek.Any<PostaladaElem>())
        return;
      string profileId = profile.Id;
      postaladaElemek = postaladaElemek.Select<PostaladaElem, PostaladaElem>((Func<PostaladaElem, PostaladaElem>) (x =>
      {
        x.ProfileId = profileId;
        return x;
      }));
      this._postaladaElemRepository.AddOrUpdate(postaladaElemek);
    }

    public void AddOrUpdate(Profile profile, PostaladaElem postaladaElem)
    {
      if (postaladaElem == null)
        return;
      postaladaElem.ProfileId = profile.Id;
      this._postaladaElemRepository.AddOrUpdate(postaladaElem);
    }

    public IEnumerable<PostaladaElem> OverridePostaladaElemek(
      Profile profile,
      IEnumerable<PostaladaElem> newPostaladaElemek)
    {
      IEnumerable<PostaladaElem> postaladaElemek = this._postaladaElemRepository.Query((ISpecification) new PostaladaElemekByProfileSpecification(profile.Id));
      newPostaladaElemek = newPostaladaElemek.Where<PostaladaElem>((Func<PostaladaElem, bool>) (x => x.Tipus.Azonosito == PostaladaElemTipus.BEERKEZETT.Azonosito)).Select<PostaladaElem, PostaladaElem>((Func<PostaladaElem, PostaladaElem>) (x =>
      {
        PostaladaElem postaladaElem = postaladaElemek.FirstOrDefault<PostaladaElem>((Func<PostaladaElem, bool>) (y => x.Azonosito == y.Azonosito));
        if (postaladaElem != null && postaladaElem.Uzenet != null)
          x.Uzenet.Szoveg = postaladaElem.Uzenet.Szoveg;
        return x;
      }));
      this.AddOrUpdate(profile, newPostaladaElemek);
      return newPostaladaElemek;
    }

    public void Delete(Profile profile)
    {
      IEnumerable<PostaladaElem> postaladaElems = this._postaladaElemRepository.Query((ISpecification) new PostaladaElemekByProfileSpecification(profile.Id));
      if (postaladaElems == null)
        return;
      foreach (PostaladaElem postaladaElem in postaladaElems)
      {
        this._csatolmanyRepository.Remove((IEnumerable<Csatolmany>) postaladaElem.Uzenet?.Csatolmanyok);
        this._cimzettRepository.Remove((IEnumerable<Cimzett>) postaladaElem.Uzenet?.CimzettLista);
        this._uzenetRepository.Remove(postaladaElem.Uzenet);
        this._postaladaElemRepository.Remove(postaladaElem);
      }
    }

    public int GetNewItemCount()
    {
      return this._postaladaElemRepository.Count((ISpecification) new NewPostaladaElemSpecification());
    }

    public int GetNewItemCount(Profile profile)
    {
      return this._postaladaElemRepository.Count((ISpecification) new NewPostaladaElemByProfileSpecification(profile.Id));
    }

    public async Task ReadPostaladaElem(Profile profile, PostaladaElem postaladaElem)
    {
      TokenData tokenData = this._secureStore.GetTokenData(profile.Id);
      if (tokenData == null)
        throw new UnauthorizedApiAccessException().SetErrorCode<UnauthorizedApiAccessException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Repository/DataServices/Uzenetek/PostaladaElemDataService.cs", 183);
      int num = await this._eugyintezesApi.PostPostaladaElemElolvasvaAsync(profile, tokenData.AccessToken, postaladaElem.Uzenet.Azonosito) ? 1 : 0;
    }

    public PostaladaElem OverridePostaladaElem(
      Profile profile,
      PostaladaElem postaladaElem)
    {
      PostaladaElem postaladaElem1 = this._postaladaElemRepository.Find(postaladaElem.Azonosito.ToString());
      if (postaladaElem1 != null)
        postaladaElem.Uzenet.Szoveg = postaladaElem1.Uzenet.Szoveg;
      this.AddOrUpdate(profile, postaladaElem);
      return postaladaElem;
    }
  }
}
