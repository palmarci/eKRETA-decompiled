// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Helpers.PackageInfo
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Ekreta.Mobile.Core.Helpers;

namespace eKreta.Mobile.Droid.Helpers
{
  public class PackageInfo : IPackageInfo
  {
    public string PackageName
    {
      get
      {
        return Application.get_Context().get_PackageName();
      }
    }
  }
}
