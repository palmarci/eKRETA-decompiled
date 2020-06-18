// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Cimzett.CimzettRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.CimzettTipusAdatSzotarElem;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Cimzett
{
  public class CimzettRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Uzenetek.Cimzett, CimzettRealm>, IMapper<Ekreta.Mobile.Core.Models.Uzenetek.Cimzett, CimzettRealm>
  {
    private static readonly CimzettTipusAdatSzotarElemRealmMapper cimzettTipusAdatSzotarElemRealmMapper = new CimzettTipusAdatSzotarElemRealmMapper();

    public Ekreta.Mobile.Core.Models.Uzenetek.Cimzett From(CimzettRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Uzenetek.Cimzett()
      {
        Azonosito = (long) int.Parse(item.Azonosito),
        KretaAzonosito = item.KretaAzonosito,
        Nev = item.Nev,
        Tipus = CimzettRealmMapper.cimzettTipusAdatSzotarElemRealmMapper.From(item.Tipus)
      };
    }

    public CimzettRealm To(Ekreta.Mobile.Core.Models.Uzenetek.Cimzett item)
    {
      return new CimzettRealm()
      {
        Azonosito = item.Azonosito.ToString(),
        KretaAzonosito = item.KretaAzonosito,
        Nev = item.Nev,
        Tipus = CimzettRealmMapper.cimzettTipusAdatSzotarElemRealmMapper.To(item.Tipus)
      };
    }
  }
}
