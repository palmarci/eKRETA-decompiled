// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Dialogs
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Acr.UserDialogs;
using MvvmCross;
using MvvmCross.Localization;
using System;

namespace Ekreta.Mobile.Core.Helpers
{
  public static class Dialogs
  {
    public static void ShowToast(string messageKey)
    {
      WeakReference weakReference = new WeakReference((object) ((IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>()).GetText((string) null, (string) null, messageKey));
      if (!weakReference.IsAlive)
        return;
      ((IUserDialogs) Mvx.get_IoCProvider().Resolve<IUserDialogs>()).Toast(weakReference.Target as string, new TimeSpan?(TimeSpan.FromSeconds(10.0)));
    }
  }
}
