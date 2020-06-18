// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.UzenetRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Cimzett;
using Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Csatolmany;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet
{
  public class UzenetRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Uzenetek.Uzenet, UzenetRealm>, IMapper<Ekreta.Mobile.Core.Models.Uzenetek.Uzenet, UzenetRealm>
  {
    private static readonly CsatolmanyRealmMapper csatolmanyRealmMapper = new CsatolmanyRealmMapper();
    private static readonly CimzettRealmMapper cimzettRealmMapper = new CimzettRealmMapper();

    public Ekreta.Mobile.Core.Models.Uzenetek.Uzenet From(UzenetRealm item)
    {
      Ekreta.Mobile.Core.Models.Uzenetek.Uzenet uzenet = new Ekreta.Mobile.Core.Models.Uzenetek.Uzenet();
      uzenet.Azonosito = (long) int.Parse(item.Azonosito);
      uzenet.KuldesDatum = item.KuldesDatum;
      uzenet.FeladoNev = item.FeladoNev;
      uzenet.FeladoTitulus = item.FeladoTitulus;
      uzenet.Szoveg = item.Szoveg;
      uzenet.Targy = item.Targy;
      IList<CsatolmanyRealm> csatolmanyok = item.Csatolmanyok;
      uzenet.Csatolmanyok = csatolmanyok != null ? csatolmanyok.Select<CsatolmanyRealm, Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany>((Func<CsatolmanyRealm, Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany>) (x => UzenetRealmMapper.csatolmanyRealmMapper.From(x))).ToList<Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany>() : (List<Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany>) null;
      IList<CimzettRealm> cimzettLista = item.CimzettLista;
      uzenet.CimzettLista = cimzettLista != null ? cimzettLista.Select<CimzettRealm, Ekreta.Mobile.Core.Models.Uzenetek.Cimzett>((Func<CimzettRealm, Ekreta.Mobile.Core.Models.Uzenetek.Cimzett>) (x => UzenetRealmMapper.cimzettRealmMapper.From(x))).ToList<Ekreta.Mobile.Core.Models.Uzenetek.Cimzett>() : (List<Ekreta.Mobile.Core.Models.Uzenetek.Cimzett>) null;
      return uzenet;
    }

    public UzenetRealm To(Ekreta.Mobile.Core.Models.Uzenetek.Uzenet item)
    {
      UzenetRealm uzenetRealm = new UzenetRealm()
      {
        Azonosito = item.Azonosito.ToString(),
        KuldesDatum = item.KuldesDatum,
        FeladoNev = item.FeladoNev,
        FeladoTitulus = item.FeladoTitulus,
        Szoveg = item.Szoveg,
        Targy = item.Targy
      };
      if (item.Csatolmanyok != null)
      {
        foreach (Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany csatolmany in item.Csatolmanyok)
          uzenetRealm.Csatolmanyok.Add(UzenetRealmMapper.csatolmanyRealmMapper.To(csatolmany));
      }
      if (item.CimzettLista != null)
      {
        foreach (Ekreta.Mobile.Core.Models.Uzenetek.Cimzett cimzett in item.CimzettLista)
          uzenetRealm.CimzettLista.Add(UzenetRealmMapper.cimzettRealmMapper.To(cimzett));
      }
      return uzenetRealm;
    }
  }
}
