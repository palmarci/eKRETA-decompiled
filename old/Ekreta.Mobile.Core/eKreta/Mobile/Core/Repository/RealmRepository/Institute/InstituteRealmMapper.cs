// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Institute.InstituteRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Institute
{
  public class InstituteRealmMapper : IRealmMapper<Ekreta.Mobile.Core.Models.Institute, InstituteRealm>, IMapper<Ekreta.Mobile.Core.Models.Institute, InstituteRealm>
  {
    private static FeatureToggleSetRealmMapper _featureToggleSetMapper = new FeatureToggleSetRealmMapper();

    public Ekreta.Mobile.Core.Models.Institute From(InstituteRealm item)
    {
      return new Ekreta.Mobile.Core.Models.Institute()
      {
        InstituteCode = item.InstituteCode,
        InstituteId = item.InstituteId,
        City = item.City,
        Name = item.Name,
        Url = item.Url,
        InformationImageUrl = item.InformationImageUrl,
        InformationUrl = item.InformationUrl,
        FeatureToggleSet = InstituteRealmMapper._featureToggleSetMapper.From(item.FeatureToggleSet)
      };
    }

    public InstituteRealm To(Ekreta.Mobile.Core.Models.Institute item)
    {
      return new InstituteRealm()
      {
        InstituteCode = item.InstituteCode,
        InstituteId = item.InstituteId,
        City = item.City,
        Name = item.Name,
        Url = item.Url,
        InformationImageUrl = item.InformationImageUrl,
        InformationUrl = item.InformationUrl,
        FeatureToggleSet = InstituteRealmMapper._featureToggleSetMapper.To(item.FeatureToggleSet)
      };
    }
  }
}
