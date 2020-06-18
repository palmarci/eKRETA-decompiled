// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Csatolmany.CsatolmanyRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Uzenet.Csatolmany
{
  public class CsatolmanyRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany, CsatolmanyRealm>, IMapper<Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany, CsatolmanyRealm>
  {
    public Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany From(CsatolmanyRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany()
      {
        Azonosito = (long) int.Parse(item.Azonosito),
        FajlNev = item.FajlNev
      };
    }

    public CsatolmanyRealm To(Ekreta.Mobile.Core.Models.Uzenetek.Csatolmany item)
    {
      return new CsatolmanyRealm()
      {
        Azonosito = item.Azonosito.ToString(),
        FajlNev = item.FajlNev
      };
    }
  }
}
