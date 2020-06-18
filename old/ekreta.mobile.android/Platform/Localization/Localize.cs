// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.Localization.Localize
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Ekreta.Mobile.Core.Interfaces;
using Java.Util;
using System.Globalization;
using System.Threading;

namespace eKreta.Mobile.Droid.Platform.Localization
{
  public class Localize : ILocalize
  {
    public CultureInfo GetCurrentCultureInfo()
    {
      return new CultureInfo(((object) Locale.get_Default()).ToString().Replace("_", "-"));
    }

    public void SetCultureInfo(CultureInfo cultureInfo)
    {
      Thread.CurrentThread.CurrentCulture = cultureInfo;
      Thread.CurrentThread.CurrentUICulture = cultureInfo;
    }
  }
}
