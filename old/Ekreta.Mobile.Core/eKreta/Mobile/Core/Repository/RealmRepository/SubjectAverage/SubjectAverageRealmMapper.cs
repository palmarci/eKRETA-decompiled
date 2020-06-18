// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage.SubjectAverageRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.SubjectAverage
{
  public class SubjectAverageRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.SubjectAverage, SubjectAverageRealm>, IMapper<Ekreta.Mobile.Core.Models.SubjectAverage, SubjectAverageRealm>
  {
    public Ekreta.Mobile.Core.Models.SubjectAverage From(SubjectAverageRealm item)
    {
      return new Ekreta.Mobile.Core.Models.SubjectAverage()
      {
        Subject = item.Subject,
        SubjectCategory = item.SubjectCategory,
        SubjectCategoryName = item.SubjectCategoryName,
        Value = item.Value,
        ClassValue = item.ClassValue,
        Difference = item.Difference,
        ProfileId = item.ProfileId,
        SubjectUid = item.SubjectUid,
        SortIndex = item.SortIndex
      };
    }

    public SubjectAverageRealm To(Ekreta.Mobile.Core.Models.SubjectAverage item)
    {
      return new SubjectAverageRealm()
      {
        Subject = item.Subject,
        SubjectCategory = item.SubjectCategory,
        SubjectCategoryName = item.SubjectCategoryName,
        Value = item.Value,
        ClassValue = item.ClassValue,
        Difference = item.Difference,
        ProfileId = item.ProfileId,
        SubjectUid = item.SubjectUid,
        SortIndex = item.SortIndex
      };
    }
  }
}
