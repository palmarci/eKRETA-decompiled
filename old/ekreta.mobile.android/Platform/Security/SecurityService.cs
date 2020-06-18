// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.Security.SecurityService
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.OS;
using Ekreta.Mobile.Core.Interfaces;
using Java.IO;
using Java.Lang;
using System;
using System.IO;

namespace eKreta.Mobile.Droid.Platform.Security
{
  public class SecurityService : ISecurityService
  {
    public void CloseApplication()
    {
      Process.KillProcess(Process.MyPid());
    }

    public bool IsDeviceRooted()
    {
      return this.IsRootAvailable() && this.IsRootGiven();
    }

    private bool IsRootAvailable()
    {
      foreach (string path1 in Environment.GetEnvironmentVariable("PATH").Split(':', StringSplitOptions.None))
      {
        if (File.Exists(Path.Combine(path1, "su")))
          return true;
      }
      return false;
    }

    private bool IsRootGiven()
    {
      Process process = (Process) null;
      try
      {
        process = Runtime.GetRuntime().Exec(new string[3]
        {
          "su",
          "-c",
          "id"
        });
        string str = new BufferedReader((Reader) new InputStreamReader(process.get_InputStream())).ReadLine();
        if (str != null)
        {
          if (str.ToLower().Contains("uid=0"))
            return true;
        }
      }
      catch (Exception ex)
      {
      }
      finally
      {
        process?.Destroy();
      }
      return false;
    }
  }
}
