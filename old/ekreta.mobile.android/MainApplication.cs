// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.MainApplication
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.OS;
using Android.Runtime;
using Java.Interop;
using MvvmCross;
using MvvmCross.Core;
using MvvmCross.Platforms.Android.Views;
using MvvmCross.ViewModels;
using Plugin.CurrentActivity;
using System;
using System.Reflection;

namespace eKreta.Mobile.Droid
{
  [Application]
  public class MainApplication : MvxAndroidApplication, Application.IActivityLifecycleCallbacks, IJavaObject, IDisposable, IJavaPeerable
  {
    public MainApplication(IntPtr handle, JniHandleOwnership transer)
    {
      base.\u002Ector(handle, transer);
    }

    protected virtual void RegisterSetup()
    {
      MvxSetupExtensions.RegisterSetupType<Setup>((object) this, new Assembly[1]
      {
        typeof (Setup).Assembly
      });
    }

    public virtual void OnCreate()
    {
      ((Application) this).OnCreate();
      ((Application) this).RegisterActivityLifecycleCallbacks((Application.IActivityLifecycleCallbacks) this);
    }

    public virtual void OnTerminate()
    {
      ((Application) this).OnTerminate();
      ((Application) this).UnregisterActivityLifecycleCallbacks((Application.IActivityLifecycleCallbacks) this);
    }

    public void OnActivityCreated(Activity activity, Bundle savedInstanceState)
    {
      CrossCurrentActivity.get_Current().set_Activity(activity);
    }

    public void OnActivityDestroyed(Activity activity)
    {
      if (!activity.get_IsTaskRoot() || !(((object) activity).GetType() == typeof (MainActivity)))
        return;
      ((IMvxAppStart) Mvx.get_IoCProvider().Resolve<IMvxAppStart>()).ResetStart();
    }

    public void OnActivityPaused(Activity activity)
    {
    }

    public void OnActivityResumed(Activity activity)
    {
      CrossCurrentActivity.get_Current().set_Activity(activity);
    }

    public void OnActivitySaveInstanceState(Activity activity, Bundle outState)
    {
    }

    public void OnActivityStarted(Activity activity)
    {
      CrossCurrentActivity.get_Current().set_Activity(activity);
    }

    public void OnActivityStopped(Activity activity)
    {
    }
  }
}
