// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IMobileAnalytics
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;
using System.Runtime.CompilerServices;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IMobileAnalytics
  {
    void TrackTrace(
      string message,
      IDictionary<string, string> properties = null,
      [CallerMemberName] string callerMemberName = "",
      [CallerFilePath] string callerFilePath = "",
      [CallerLineNumber] int callerLineNumber = 0);

    void TrackEvent(string eventName, IDictionary<string, string> properties = null);

    void TrackPageView(string pageName, IDictionary<string, string> properties = null);

    void TrackException(
      Exception exception,
      IDictionary<string, string> properties = null,
      [CallerMemberName] string callerMemberName = "",
      [CallerFilePath] string callerFilePath = "",
      [CallerLineNumber] int callerLineNumber = 0);

    void Register<T>() where T : IMobileAnalyticsProvider, new();

    void Register(IMobileAnalyticsProvider instance);

    void Unregister<T>() where T : IMobileAnalyticsProvider, new();

    void Unregister(Type type);

    Dictionary<Type, IMobileAnalyticsProvider> Providers { get; }
  }
}
