﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.SystemInfo
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Helpers
{
  public class SystemInfo : ISystemInfo
  {
    public string Platform
    {
      get
      {
        return Device.get_RuntimePlatform();
      }
    }
  }
}
