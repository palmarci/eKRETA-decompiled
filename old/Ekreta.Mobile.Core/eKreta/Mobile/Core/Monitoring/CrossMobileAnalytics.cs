// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Monitoring.CrossMobileAnalytics
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;

namespace Ekreta.Mobile.Core.Monitoring
{
  public class CrossMobileAnalytics : IMobileAnalytics
  {
    private static IMobileAnalytics _instance;
    private readonly Dictionary<Type, IMobileAnalyticsProvider> _providers;

    public CrossMobileAnalytics()
    {
      this._providers = new Dictionary<Type, IMobileAnalyticsProvider>();
    }

    public static IMobileAnalytics Current
    {
      get
      {
        if (CrossMobileAnalytics._instance == null)
          CrossMobileAnalytics._instance = (IMobileAnalytics) new CrossMobileAnalytics();
        return CrossMobileAnalytics._instance;
      }
    }

    public Dictionary<Type, IMobileAnalyticsProvider> Providers
    {
      get
      {
        return this._providers;
      }
    }

    public void Register(IMobileAnalyticsProvider instance)
    {
      Type type = instance.GetType();
      if (this._providers.ContainsKey(type))
        this._providers[type] = instance;
      else
        this._providers.Add(type, instance);
    }

    public void Register<T>() where T : IMobileAnalyticsProvider, new()
    {
      this.Register((IMobileAnalyticsProvider) new T());
    }

    public void TrackEvent(string eventName, IDictionary<string, string> properties = null)
    {
      foreach (KeyValuePair<Type, IMobileAnalyticsProvider> provider in this._providers)
        provider.Value.TrackEvent(eventName, properties);
    }

    public void TrackException(
      Exception exception,
      IDictionary<string, string> properties = null,
      [CallerMemberName] string callerMemberName = "",
      [CallerFilePath] string callerFilePath = "",
      [CallerLineNumber] int callerLineNumber = 0)
    {
      foreach (KeyValuePair<Type, IMobileAnalyticsProvider> provider in this._providers)
        provider.Value.TrackException(exception, CrossMobileAnalytics.CreatePropertiesWithCallerInfo(properties, callerMemberName, callerFilePath, callerLineNumber));
    }

    public void TrackPageView(string pageName, IDictionary<string, string> properties = null)
    {
      foreach (KeyValuePair<Type, IMobileAnalyticsProvider> provider in this._providers)
        provider.Value.TrackPageView(pageName, properties);
    }

    public void TrackTrace(
      string message,
      IDictionary<string, string> properties = null,
      [CallerMemberName] string callerMemberName = "",
      [CallerFilePath] string callerFilePath = "",
      [CallerLineNumber] int callerLineNumber = 0)
    {
      foreach (KeyValuePair<Type, IMobileAnalyticsProvider> provider in this._providers)
        provider.Value.TrackTrace(message, CrossMobileAnalytics.CreatePropertiesWithCallerInfo(properties, callerMemberName, callerFilePath, callerLineNumber));
    }

    public void Unregister<T>() where T : IMobileAnalyticsProvider, new()
    {
      this.Unregister(this._providers.FirstOrDefault<KeyValuePair<Type, IMobileAnalyticsProvider>>((Func<KeyValuePair<Type, IMobileAnalyticsProvider>, bool>) (p => (ValueType) p is T)).Key);
    }

    public void Unregister(Type type)
    {
      this._providers.Remove(type);
    }

    private static IDictionary<string, string> CreatePropertiesWithCallerInfo(
      IDictionary<string, string> properties,
      string callerMemberName,
      string callerFilePath,
      int callerLineNumber)
    {
      Dictionary<string, string> dictionary = new Dictionary<string, string>()
      {
        {
          "CallerMemberName",
          callerMemberName
        },
        {
          "CallerFilePath",
          callerFilePath
        },
        {
          "CallerLineNumber",
          callerLineNumber.ToString()
        }
      };
      if (properties != null)
      {
        foreach (KeyValuePair<string, string> property in (IEnumerable<KeyValuePair<string, string>>) properties)
          dictionary.Add(property.Key, property.Value);
      }
      return (IDictionary<string, string>) dictionary;
    }
  }
}
