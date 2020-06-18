// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Effects.OnDrawableTouchListener
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.Runtime;
using Android.Text.Method;
using Android.Views;
using Android.Widget;
using Java.Interop;
using Java.Lang;
using System;

namespace eKreta.Mobile.Droid.Effects
{
  public class OnDrawableTouchListener : Object, View.IOnTouchListener, IJavaObject, IDisposable, IJavaPeerable
  {
    public bool OnTouch(View v, MotionEvent e)
    {
      if (v is EditText && e.get_Action() == 1)
      {
        EditText editText = (EditText) v;
        if ((double) e.get_RawX() >= (double) (((View) editText).get_Right() - ((TextView) editText).GetCompoundDrawables()[2].get_Bounds().Width()))
        {
          if (((TextView) editText).get_TransformationMethod() == null)
          {
            ((TextView) editText).set_TransformationMethod((ITransformationMethod) PasswordTransformationMethod.get_Instance());
            ((TextView) editText).SetCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 2131165500, 0);
          }
          else
          {
            ((TextView) editText).set_TransformationMethod((ITransformationMethod) null);
            ((TextView) editText).SetCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 2131165501, 0);
          }
          editText.SetSelection(((TextView) editText).get_Text().Length);
          return false;
        }
      }
      return false;
    }

    public OnDrawableTouchListener()
    {
      base.\u002Ector();
    }
  }
}
