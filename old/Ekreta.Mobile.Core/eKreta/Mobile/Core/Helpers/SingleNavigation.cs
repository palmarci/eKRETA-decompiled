// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.SingleNavigation
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;

namespace Ekreta.Mobile.Core.Helpers
{
  internal class SingleNavigation : ISingleNavigation
  {
    public bool IsNavigationEnabled { get; set; } = true;

    public bool CanExecuteNavigationCommand(object obj)
    {
      return this.IsNavigationEnabled;
    }

    public bool CanExecuteNavigationCommand()
    {
      return this.IsNavigationEnabled;
    }

    public void DisableNavigation()
    {
      this.IsNavigationEnabled = false;
    }

    public void ResetNavigationEnabled()
    {
      this.IsNavigationEnabled = true;
    }
  }
}
