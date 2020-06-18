// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.PermissionManager.PermissionManager
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Support.Design.Widget;
using Android.Support.V4.App;
using Android.Support.V4.Content;
using Android.Views;
using Android.Widget;
using Ekreta.Mobile.Core.Interfaces;
using System;

namespace eKreta.Mobile.Droid.Platform.PermissionManager
{
  public class PermissionManager : IPermissionManager
  {
    private const string readPermission = "android.permission.READ_EXTERNAL_STORAGE";
    private const string writePermission = "android.permission.WRITE_EXTERNAL_STORAGE";
    private const string rationalizeText = "A csatolmányok letöltéséhez engedélyeznie kell a külső tárolóhoz való hozzáférést!";
    private const int requestStorageId = 1;

    public bool PermissionGranted()
    {
      return ContextCompat.CheckSelfPermission(Application.get_Context(), "android.permission.READ_EXTERNAL_STORAGE") == 0 | ContextCompat.CheckSelfPermission(Application.get_Context(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public void RequestPermission()
    {
      string[] permissions = new string[2]
      {
        "android.permission.READ_EXTERNAL_STORAGE",
        "android.permission.WRITE_EXTERNAL_STORAGE"
      };
      if (MainActivity.instance == null)
        Toast.MakeText(Application.get_Context(), "A csatolmányok letöltéséhez engedélyeznie kell a külső tárolóhoz való hozzáférést!", (ToastLength) 1).Show();
      else if (ActivityCompat.ShouldShowRequestPermissionRationale((Activity) MainActivity.instance, "android.permission.WRITE_EXTERNAL_STORAGE"))
        ((BaseTransientBottomBar) Snackbar.Make(((Activity) MainActivity.instance).FindViewById(16908290), "A csatolmányok letöltéséhez engedélyeznie kell a külső tárolóhoz való hozzáférést!", -2).SetAction("OK", (Action<View>) (v => ActivityCompat.RequestPermissions((Activity) MainActivity.instance, permissions, 1)))).Show();
      else
        ActivityCompat.RequestPermissions((Activity) MainActivity.instance, permissions, 1);
    }
  }
}
