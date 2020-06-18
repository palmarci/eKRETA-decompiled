// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.ProtectedAppsChecker
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Net;
using Ekreta.Mobile.Core.Helpers;
using MvvmCross;
using MvvmCross.Localization;
using System;
using System.Collections.Generic;

namespace eKreta.Mobile.Droid.Platform
{
  public class ProtectedAppsChecker
  {
    private static readonly List<Intent> PowermanagerIntents = new List<Intent>();
    private const string SkipIntentCheck = "skipAppListMessage";

    static ProtectedAppsChecker()
    {
      ProtectedAppsChecker.NewIntent("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
      ProtectedAppsChecker.NewIntent("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity");
      ProtectedAppsChecker.NewIntent("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity");
      ProtectedAppsChecker.NewIntent("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity");
      ProtectedAppsChecker.NewIntent("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity");
      ProtectedAppsChecker.NewIntent("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity");
      ProtectedAppsChecker.NewIntent("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity");
      ProtectedAppsChecker.NewIntent("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity");
      ProtectedAppsChecker.NewIntent("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager");
      ProtectedAppsChecker.NewIntent("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity");
      ProtectedAppsChecker.NewIntent("com.samsung.android.lool", "com.samsung.android.sm.ui.battery.BatteryActivity");
      ProtectedAppsChecker.NewIntent("com.htc.pitroad", "com.htc.pitroad.landingpage.activity.LandingPageActivity");
      ProtectedAppsChecker.NewIntent("com.asus.mobilemanager", "com.asus.mobilemanager.autostart.AutoStartActivity");
      ProtectedAppsChecker.NewIntent("com.dewav.dwappmanager", "com.dewav.dwappmanager.memory.SmartClearupWhiteList");
      ProtectedAppsChecker.NewIntent("com.asus.mobilemanager", "com.asus.mobilemanager.entry.FunctionActivity").SetData(Uri.Parse("mobilemanager://function/entry/AutoStart"));
    }

    public static void CheckProtectedAppsFeature(Context context)
    {
      IMvxTextProvider textProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
      string text1 = textProvider.GetText((string) null, (string) null, "ProtectedAppsCheckerTitle");
      string text2 = textProvider.GetText((string) null, (string) null, "ProtectedAppsCheckerContent");
      string text3 = textProvider.GetText((string) null, (string) null, "ProtectedAppsCheckerAccept");
      string text4 = textProvider.GetText((string) null, (string) null, "ProtectedAppsCheckerCancel");
      ISharedPreferences sharedPreferences = context.GetSharedPreferences("ProtectedApps", (FileCreationMode) 0);
      if (sharedPreferences.GetBoolean("skipAppListMessage", false))
        return;
      bool flag = false;
      ISharedPreferencesEditor editor = sharedPreferences.Edit();
      using (List<Intent>.Enumerator enumerator = ProtectedAppsChecker.PowermanagerIntents.GetEnumerator())
      {
        while (enumerator.MoveNext())
        {
          Intent intent = enumerator.Current;
          if (context.get_PackageManager().ResolveActivity(intent, (PackageInfoFlags) 65536) != null)
          {
            new AlertDialog.Builder(context).SetTitle(text1).SetMessage(text2).SetPositiveButton(text3, (EventHandler<DialogClickEventArgs>) ((o, d) =>
            {
              editor.PutBoolean("skipAppListMessage", true);
              editor.Apply();
              try
              {
                context.StartActivity(intent);
              }
              catch (Exception ex)
              {
                ErrorHandler.Current.HandleError(ex);
                new AlertDialog.Builder(context).SetTitle(textProvider.GetText((string) null, (string) null, "ProtectedAppsErrorTitle")).SetMessage(textProvider.GetText((string) null, (string) null, "ProtectedAppsErrorContent")).SetCancelable(false).SetPositiveButton(textProvider.GetText((string) null, (string) null, "ProtectedAppsAcceptButtonText"), (EventHandler<DialogClickEventArgs>) ((_param1, _param2) => {})).Show();
              }
            })).SetNegativeButton(text4, (EventHandler<DialogClickEventArgs>) ((o, d) => {})).SetCancelable(false).Show();
            flag = true;
            break;
          }
        }
      }
      if (flag)
        return;
      editor.PutBoolean("skipAppListMessage", true);
      editor.Apply();
    }

    private static Intent NewIntent(string packageName, string cls)
    {
      Intent intent = new Intent().SetComponent(new ComponentName(packageName, cls));
      ProtectedAppsChecker.PowermanagerIntents.Add(intent);
      return intent;
    }
  }
}
