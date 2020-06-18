// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Monitoring.BaseMobileAnalyticsProvider
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Monitoring
{
  public class BaseMobileAnalyticsProvider
  {
    protected BaseMobileAnalyticsProvider()
    {
    }

    protected string ConvertParametersToString(IDictionary<string, string> properties)
    {
      if (properties == null)
        return string.Empty;
      List<string> stringList = new List<string>();
      foreach (string key in (IEnumerable<string>) properties.Keys)
        stringList.Add(key + "=" + properties[key]);
      return string.Join("|", stringList.ToArray());
    }

    protected string ConvertExceptionToString(Exception exception)
    {
      if (exception == null)
        return "";
      return exception.Message + " | " + exception.StackTrace + " | " + this.ConvertExceptionToString(exception.InnerException);
    }

    protected Dictionary<string, string> CreateParametersByType(
      string type,
      IDictionary<string, string> properties)
    {
      Dictionary<string, string> parameters = new Dictionary<string, string>()
      {
        {
          "Type",
          type
        }
      };
      if (properties != null)
        parameters = parameters.Concat<KeyValuePair<string, string>>(properties.Where<KeyValuePair<string, string>>((Func<KeyValuePair<string, string>, bool>) (p => !parameters.Keys.Contains<string>(p.Key)))).ToDictionary<KeyValuePair<string, string>, string, string>((Func<KeyValuePair<string, string>, string>) (p => p.Key), (Func<KeyValuePair<string, string>, string>) (p => p.Value));
      return parameters;
    }
  }
}
