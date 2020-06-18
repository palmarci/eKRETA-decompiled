// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.FirebaseAnalytics.FirebaseAnalytics
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Content;
using Android.OS;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Monitoring;
using Plugin.CurrentActivity;
using System;
using System.Collections.Generic;

namespace eKreta.Mobile.Droid.Platform.FirebaseAnalytics
{
  public class FirebaseAnalytics : IFirebaseAnalytics
  {
    public void SendEvent(string eventId)
    {
      this.SendEvent(eventId, (IDictionary<string, string>) null);
    }

    public void SendEvent(string eventId, string parameterName, string value)
    {
      this.SendEvent(eventId, (IDictionary<string, string>) new Dictionary<string, string>()
      {
        {
          parameterName,
          value
        }
      });
    }

    public void SendEvent(string eventId, IDictionary<string, string> parameters)
    {
      try
      {
        Firebase.Analytics.FirebaseAnalytics instance = Firebase.Analytics.FirebaseAnalytics.GetInstance((Context) CrossCurrentActivity.get_Current().get_Activity());
        if (parameters == null)
        {
          instance.LogEvent(eventId, (Bundle) null);
        }
        else
        {
          Bundle bundle = new Bundle();
          foreach (KeyValuePair<string, string> parameter in (IEnumerable<KeyValuePair<string, string>>) parameters)
            ((BaseBundle) bundle).PutString(parameter.Key, parameter.Value);
          instance.LogEvent(eventId, bundle);
        }
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (SendEvent), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile/eKreta.Mobile.Android/Platform/FirebaseAnalytics/FirebaseAnalytics.cs", 50);
      }
    }
  }
}
