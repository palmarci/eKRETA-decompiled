// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.Keystore.AndroidKeyStore
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Widget;
using Ekreta.Mobile.Core.Interfaces;
using Java.IO;
using System;
using System.IO;
using Xamarin.Auth;

namespace eKreta.Mobile.Droid.Platform.Keystore
{
  public class AndroidKeyStore : IKeyStore
  {
    private static readonly string DefaultPassword = "3295043EA18CA264B2C40E0B72051DEF2D07AD2B4593F43DDDE1515A7EC32617";
    private const string BasePassword = "System.Char[]";

    public AccountStore GetKeyStore()
    {
      try
      {
        return AccountStore.Create(Application.get_Context(), "System.Char[]");
      }
      catch (IOException ex1)
      {
        try
        {
          return AccountStore.Create(Application.get_Context(), AndroidKeyStore.DefaultPassword);
        }
        catch (IOException ex2)
        {
          try
          {
            this.ResetPasswordAndDatabase();
            return AccountStore.Create(Application.get_Context(), "System.Char[]");
          }
          catch (IOException ex3)
          {
            this.ShowErrorToast("Nagyon sajnáljuk, de hiba lépett fel az adatai beolvasása közben. Kérem telepítse újra az alkalmazást a hiba elhárításához!");
            return (AccountStore) null;
          }
        }
      }
    }

    private void ResetPasswordAndDatabase()
    {
      string[] files = Directory.GetFiles(Environment.GetFolderPath(Environment.SpecialFolder.Personal));
      for (int index = 0; index < files.Length; ++index)
      {
        if (File.Exists(files[index]))
          File.Delete(files[index]);
      }
      this.ShowErrorToast("Az alkalmazás nem tudta visszatölteni az adatait. Sajnáljuk, de újra be kell, hogy jelentkezzen!");
    }

    private void ShowErrorToast(string text)
    {
      Toast.MakeText(Application.get_Context(), text, (ToastLength) 1).Show();
    }
  }
}
