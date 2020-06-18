// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Institute.FeatureToggleSetRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Institute
{
  public class FeatureToggleSetRealmMapper : IRealmMapper<IDictionary<string, bool>, FeatureToggleSet>, IMapper<IDictionary<string, bool>, FeatureToggleSet>
  {
    public IDictionary<string, bool> From(FeatureToggleSet item)
    {
      return (IDictionary<string, bool>) new Dictionary<string, bool>()
      {
        {
          "JustificationFeatureEnabled",
          item.JustificationFeatureEnabled
        }
      };
    }

    public FeatureToggleSet To(IDictionary<string, bool> item)
    {
      bool flag;
      item.TryGetValue("JustificationFeatureEnabled", out flag);
      return new FeatureToggleSet()
      {
        JustificationFeatureEnabled = flag
      };
    }
  }
}
