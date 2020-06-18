// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary.TutelaryRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Tutelary
{
  public class TutelaryRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Tutelary, TutelaryRealm>, IMapper<Ekreta.Mobile.Core.Models.Tutelary, TutelaryRealm>
  {
    public Ekreta.Mobile.Core.Models.Tutelary From(TutelaryRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Tutelary()
      {
        TutelaryId = int.Parse(item.Id),
        Name = item.Name,
        Email = item.Email,
        PhoneNumber = item.PhoneNumber
      };
    }

    public TutelaryRealm To(Ekreta.Mobile.Core.Models.Tutelary item)
    {
      return new TutelaryRealm()
      {
        Id = item.TutelaryId.ToString(),
        Name = item.Name,
        Email = item.Email,
        PhoneNumber = item.PhoneNumber
      };
    }
  }
}
