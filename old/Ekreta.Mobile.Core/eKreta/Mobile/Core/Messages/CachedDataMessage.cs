// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Messages.CachedDataMessage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross.Plugin.Messenger;
using System;

namespace Ekreta.Mobile.Core.Messages
{
  public class CachedDataMessage : MvxMessage
  {
    public TimeSpan Expire { get; private set; }

    public CachedDataMessage(object sender, TimeSpan expire)
    {
      this.\u002Ector(sender);
      this.Expire = expire;
    }
  }
}
