// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Service.AppVersionData
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models.Service
{
  public class AppVersionData
  {
    public int LatestVersion { get; set; }

    public int MinimumSupportedVersion { get; set; }

    public long MinimumSupportedClientBuildNumber { get; set; }

    public ICollection<BlackListItem> BlacklistPlatformByMobileBuildVersion { get; set; }

    public string GDPRLink { get; set; }

    public DateTime GDPRUpdateDate { get; set; }

    public string AndroidMobileStoreUrl { get; set; }

    public string IOSMobileStoreUrl { get; set; }
  }
}
