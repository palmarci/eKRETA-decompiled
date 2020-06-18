// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.RatingChooserViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Messages;
using MvvmCross;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using System;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class RatingChooserViewModel : ViewModelBase
  {
    private readonly IMvxMessenger _messenger;
    private MvxAsyncCommand<string> _buttonClickCommand;

    public RatingChooserViewModel()
    {
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
    }

    public MvxAsyncCommand<string> OnButtonClickCommand
    {
      get
      {
        return this._buttonClickCommand ?? (this._buttonClickCommand = new MvxAsyncCommand<string>(new Func<string, Task>(this.OnButtonClick), (Func<string, bool>) null, false));
      }
    }

    private async Task OnButtonClick(string answer)
    {
      RatingChooserViewModel chooserViewModel = this;
      await chooserViewModel._modalDialog.ClosePopup();
      chooserViewModel._messenger.Publish<RatingChooserMessage>((M0) new RatingChooserMessage((object) chooserViewModel, answer));
    }
  }
}
