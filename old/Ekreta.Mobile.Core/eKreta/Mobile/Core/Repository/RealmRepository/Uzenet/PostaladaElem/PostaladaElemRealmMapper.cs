// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem.PostaladaElemRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElemTipusAdatSzotarElem;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.PostaladaElem
{
  public class PostaladaElemRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem, PostaladaElemRealm>, IMapper<Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem, PostaladaElemRealm>
  {
    private static readonly PostaladaElemTipusAdatSzotarElemRealmMapper postaladaElemRealmMapper = new PostaladaElemTipusAdatSzotarElemRealmMapper();
    private static readonly UzenetRealmMapper uzenetRealmMapper = new UzenetRealmMapper();

    public Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem From(
      PostaladaElemRealm item)
    {
      Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem postaladaElem = new Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem()
      {
        Azonosito = (long) int.Parse(item.Azonosito),
        IsElolvasva = item.IsElolvasva,
        IsToroltElem = item.IsToroltElem,
        Tipus = PostaladaElemRealmMapper.postaladaElemRealmMapper.From(item.Tipus),
        ProfileId = item.ProfileId
      };
      if (item.Uzenet != null)
        postaladaElem.Uzenet = PostaladaElemRealmMapper.uzenetRealmMapper.From(item.Uzenet);
      return postaladaElem;
    }

    public PostaladaElemRealm To(Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem item)
    {
      return new PostaladaElemRealm()
      {
        Azonosito = item.Azonosito.ToString(),
        IsElolvasva = item.IsElolvasva,
        IsToroltElem = item.IsToroltElem,
        Tipus = PostaladaElemRealmMapper.postaladaElemRealmMapper.To(item.Tipus),
        Uzenet = PostaladaElemRealmMapper.uzenetRealmMapper.To(item.Uzenet),
        ProfileId = item.ProfileId
      };
    }
  }
}
