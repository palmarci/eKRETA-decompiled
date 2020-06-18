// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.CimzettTipusAdatSzotarElem.CimzettTipusAdatSzotarElemRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.CimzettTipusAdatSzotarElem
{
  public class CimzettTipusAdatSzotarElemRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Uzenetek.CimzettTipusAdatSzotarElem, CimzettTipusAdatSzotarElemRealm>, IMapper<Ekreta.Mobile.Core.Models.Uzenetek.CimzettTipusAdatSzotarElem, CimzettTipusAdatSzotarElemRealm>
  {
    public Ekreta.Mobile.Core.Models.Uzenetek.CimzettTipusAdatSzotarElem From(
      CimzettTipusAdatSzotarElemRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Uzenetek.CimzettTipusAdatSzotarElem()
      {
        Azonosito = (long) int.Parse(item.Azonosito),
        Kod = item.Kod,
        RovidNev = item.RovidNev,
        Nev = item.Nev,
        Leiras = item.Leiras
      };
    }

    public CimzettTipusAdatSzotarElemRealm To(
      Ekreta.Mobile.Core.Models.Uzenetek.CimzettTipusAdatSzotarElem item)
    {
      return new CimzettTipusAdatSzotarElemRealm()
      {
        Azonosito = item.Azonosito.ToString(),
        Kod = item.Kod,
        RovidNev = item.RovidNev,
        Nev = item.Nev,
        Leiras = item.Leiras
      };
    }
  }
}
