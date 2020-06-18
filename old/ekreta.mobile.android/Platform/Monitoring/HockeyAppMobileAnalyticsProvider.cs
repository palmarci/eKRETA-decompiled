// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.Monitoring.HockeyAppMobileAnalyticsProvider
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Monitoring;
using HockeyApp.Android;
using HockeyApp.Android.Metrics;
using Java.Lang;
using System;
using System.Collections.Generic;

namespace eKreta.Mobile.Droid.Platform.Monitoring
{
  public class HockeyAppMobileAnalyticsProvider : BaseMobileAnalyticsProvider, IMobileAnalyticsProvider
  {
    public HockeyAppMobileAnalyticsProvider()
    {
      CrashManager.Register(Application.get_Context(), ConfigurationRepository.EnvironmentSetting.HockeyAppAndroidAppId);
      MetricsManager.Register((Application) Application.get_Context(), ConfigurationRepository.EnvironmentSetting.HockeyAppAndroidAppId);
    }

    public void TrackEvent(string eventName, IDictionary<string, string> properties = null)
    {
      MetricsManager.TrackEvent(eventName, (IDictionary<string, string>) this.CreateParametersByType("Event", properties), (IDictionary<string, Double>) null);
    }

    public void TrackException(Exception exception, IDictionary<string, string> properties = null)
    {
      MetricsManager.TrackEvent(this.ConvertExceptionToString(exception), (IDictionary<string, string>) this.CreateParametersByType("Exception", properties), (IDictionary<string, Double>) null);
    }

    public void TrackPageView(string pageName, IDictionary<string, string> properties = null)
    {
      MetricsManager.TrackEvent(pageName, (IDictionary<string, string>) this.CreateParametersByType("Screen", properties), (IDictionary<string, Double>) null);
    }

    public void TrackTrace(string message, IDictionary<string, string> properties = null)
    {
      MetricsManager.TrackEvent(message, (IDictionary<string, string>) this.CreateParametersByType("Trace", properties), (IDictionary<string, Double>) null);
    }
  }
}
