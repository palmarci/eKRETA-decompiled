// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElemTipusAdatSzotarElem.PostaladaElemTipusAdatSzotarElemRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElemTipusAdatSzotarElem
{
  public class PostaladaElemTipusAdatSzotarElemRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElemTipusAdatSzotarElem, PostaladaElemTipusAdatSzotarElemRealm>, IMapper<Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElemTipusAdatSzotarElem, PostaladaElemTipusAdatSzotarElemRealm>
  {
    public Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElemTipusAdatSzotarElem From(
      PostaladaElemTipusAdatSzotarElemRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElemTipusAdatSzotarElem()
      {
        Azonosito = (long) int.Parse(item.Azonosito),
        Kod = item.Kod,
        Leiras = item.Leiras,
        Nev = item.Nev,
        RovidNev = item.RovidNev
      };
    }

    public PostaladaElemTipusAdatSzotarElemRealm To(
      Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElemTipusAdatSzotarElem item)
    {
      return new PostaladaElemTipusAdatSzotarElemRealm()
      {
        Azonosito = item.Azonosito.ToString(),
        Kod = item.Kod,
        Leiras = item.Leiras,
        Nev = item.Nev,
        RovidNev = item.RovidNev
      };
    }
  }
}
