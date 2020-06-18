// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.WebNavigation
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Monitoring;
using System;
using System.Collections.Generic;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Helpers
{
  public class WebNavigation : IWebNavigation
  {
    public void OpenUrl(string targetUrl)
    {
      try
      {
        Uri result;
        if (!Uri.TryCreate(targetUrl, UriKind.Absolute, out result))
          return;
        Device.OpenUri(result);
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (OpenUrl), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/WebNavigation.cs", 30);
      }
    }
  }
}
