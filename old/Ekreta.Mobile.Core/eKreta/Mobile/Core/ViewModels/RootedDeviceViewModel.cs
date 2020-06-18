// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.RootedDeviceViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using MvvmCross;
using MvvmCross.Commands;
using System;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class RootedDeviceViewModel : ViewModelBase
  {
    private readonly ISecurityService _securityService;
    private MvxCommand _closeCommand;

    public RootedDeviceViewModel()
    {
      this._securityService = (ISecurityService) Mvx.get_IoCProvider().Resolve<ISecurityService>();
    }

    public MvxCommand CloseCommand
    {
      get
      {
        return this._closeCommand ?? (this._closeCommand = new MvxCommand((Action) (() => this._securityService.CloseApplication())));
      }
    }
  }
}
