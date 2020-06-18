// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.Monitoring.GoogleMobileAnalyticsProvider
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Gms.Analytics;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Monitoring;
using Java.Lang;
using System;
using System.Collections.Generic;

namespace eKreta.Mobile.Droid.Platform.Monitoring
{
  public class GoogleMobileAnalyticsProvider : BaseMobileAnalyticsProvider, IMobileAnalyticsProvider, IDisposable
  {
    private bool _disposed;
    private static GoogleAnalytics GAInstance;
    private static Tracker GATracker;

    public GoogleMobileAnalyticsProvider()
    {
      GoogleMobileAnalyticsProvider.GAInstance = GoogleAnalytics.GetInstance(Application.get_Context());
      GoogleMobileAnalyticsProvider.GAInstance.SetLocalDispatchPeriod(10);
      GoogleMobileAnalyticsProvider.GATracker = GoogleMobileAnalyticsProvider.GAInstance.NewTracker(ConfigurationRepository.EnvironmentSetting.GoogleAnalyticsTrackingId);
      GoogleMobileAnalyticsProvider.GATracker.EnableExceptionReporting(true);
      GoogleMobileAnalyticsProvider.GATracker.EnableAdvertisingIdCollection(true);
      GoogleMobileAnalyticsProvider.GATracker.EnableAutoActivityTracking(true);
    }

    public void TrackEvent(string eventName, IDictionary<string, string> properties = null)
    {
      HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder();
      eventBuilder.SetCategory("Event");
      eventBuilder.SetLabel(this.ConvertParametersToString(properties));
      eventBuilder.SetAction(eventName);
      GoogleMobileAnalyticsProvider.GATracker.Send(((HitBuilders.HitBuilder) eventBuilder).Build());
    }

    public void TrackException(Exception exception, IDictionary<string, string> properties = null)
    {
      HitBuilders.ExceptionBuilder exceptionBuilder = new HitBuilders.ExceptionBuilder();
      exceptionBuilder.SetDescription(this.ConvertParametersToString(properties) + " || " + this.ConvertExceptionToString(exception));
      GoogleMobileAnalyticsProvider.GATracker.Send(((HitBuilders.HitBuilder) exceptionBuilder).Build());
    }

    public void TrackPageView(string pageName, IDictionary<string, string> properties = null)
    {
      GoogleMobileAnalyticsProvider.GATracker.SetScreenName(pageName);
      GoogleMobileAnalyticsProvider.GATracker.Send(((HitBuilders.HitBuilder) new HitBuilders.ScreenViewBuilder()).Build());
    }

    public void TrackTrace(string message, IDictionary<string, string> properties = null)
    {
      HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder();
      eventBuilder.SetCategory(nameof (TrackTrace));
      eventBuilder.SetAction(message);
      eventBuilder.SetLabel(this.ConvertParametersToString(properties));
      GoogleMobileAnalyticsProvider.GATracker.Send(((HitBuilders.HitBuilder) eventBuilder).Build());
    }

    public void Dispose()
    {
      this.Dispose(true);
      GC.SuppressFinalize((object) this);
    }

    private void Dispose(bool disposing)
    {
      if (this._disposed)
        return;
      if (disposing)
      {
        ((Object) GoogleMobileAnalyticsProvider.GATracker).Dispose();
        ((Object) GoogleMobileAnalyticsProvider.GAInstance).Dispose();
      }
      this._disposed = true;
    }

    ~GoogleMobileAnalyticsProvider()
    {
      this.Dispose(false);
    }
  }
}
