// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IMobileAnalyticsProvider
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IMobileAnalyticsProvider
  {
    void TrackTrace(string message, IDictionary<string, string> properties = null);

    void TrackEvent(string eventName, IDictionary<string, string> properties = null);

    void TrackPageView(string pageName, IDictionary<string, string> properties = null);

    void TrackException(Exception exception, IDictionary<string, string> properties = null);
  }
}
