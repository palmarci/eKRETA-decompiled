// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.RatingPopupViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using MvvmCross.Commands;
using MvvmCross.ViewModels;
using System;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class RatingPopupViewModel : ViewModelBase
  {
    private readonly IRatingDataService _ratingDataService;
    private readonly IMailService _mailService;
    private readonly IWebNavigation _webNavigation;
    private readonly IAppVersionService _appVersionService;
    private string _message;
    private string _email;
    private bool _sensitiveData;
    private Rating _rating;
    private MvxAsyncCommand _sendCommand;
    private MvxAsyncCommand _closeCommand;
    private MvxCommand _sensitiveDataTapCommand;
    private MvxAsyncCommand _openGDPRCommand;

    public RatingPopupViewModel()
    {
      this._ratingDataService = (IRatingDataService) Mvx.get_IoCProvider().GetSingleton<IRatingDataService>();
      this._mailService = (IMailService) Mvx.get_IoCProvider().GetSingleton<IMailService>();
      this._webNavigation = (IWebNavigation) Mvx.get_IoCProvider().Resolve<IWebNavigation>();
      this._appVersionService = (IAppVersionService) Mvx.get_IoCProvider().GetSingleton<IAppVersionService>();
      this._rating = this._ratingDataService.GetRatingByProfile(this._profileDataService.GetActiveProfile());
      this.SensitiveData = false;
    }

    public string Message
    {
      get
      {
        return this._message;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._message, (M0) value, nameof (Message));
      }
    }

    public string Email
    {
      get
      {
        return this._email;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._email, (M0) value, nameof (Email));
      }
    }

    public bool SensitiveData
    {
      get
      {
        return this._sensitiveData;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._sensitiveData, (M0) (value ? 1 : 0), nameof (SensitiveData));
      }
    }

    public MvxAsyncCommand OnSaveClicked
    {
      get
      {
        return this._sendCommand ?? (this._sendCommand = new MvxAsyncCommand(new Func<Task>(this.SaveRating), new Func<bool>(this.ValidateRatingMessage), false));
      }
    }

    public MvxAsyncCommand CloseClicked
    {
      get
      {
        return this._closeCommand ?? (this._closeCommand = new MvxAsyncCommand(new Func<Task>(this.CloseCommand), (Func<bool>) null, false));
      }
    }

    public MvxCommand SensitiveDataTap
    {
      get
      {
        return this._sensitiveDataTapCommand ?? (this._sensitiveDataTapCommand = new MvxCommand(new Action(this.ChangeSensitiveData)));
      }
    }

    public MvxAsyncCommand OpenGDPRCommand
    {
      get
      {
        return this._openGDPRCommand ?? (this._openGDPRCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteOpenGDPRCommand), (Func<bool>) null, false));
      }
    }

    private void ChangeSensitiveData()
    {
      this.SensitiveData = !this.SensitiveData;
    }

    private async Task CloseCommand()
    {
      await this._modalDialog.ClosePopup();
    }

    private bool ValidateRatingMessage()
    {
      return this.Message != null && this.Message.Trim().Length >= 25 && this.SensitiveData;
    }

    private async Task SaveRating()
    {
      RatingPopupViewModel ratingPopupViewModel = this;
      ratingPopupViewModel._rating.Date = new DateTime?(DateTime.Now);
      ratingPopupViewModel._rating.Description = ratingPopupViewModel.Message;
      ratingPopupViewModel._rating.Email = ratingPopupViewModel.Email;
      ratingPopupViewModel._rating.SensitiveData = ratingPopupViewModel.SensitiveData;
      ratingPopupViewModel._mailService.SendRatingMail(ratingPopupViewModel._rating, ratingPopupViewModel._profileDataService.GetActiveProfile());
      ratingPopupViewModel._ratingDataService.AddOrUpdate(ratingPopupViewModel._profileDataService.GetActiveProfile(), ratingPopupViewModel._rating);
      await ratingPopupViewModel._modalDialog.ClosePopup();
    }

    private async Task ExecuteOpenGDPRCommand()
    {
      RatingPopupViewModel ratingPopupViewModel = this;
      if (ratingPopupViewModel._connectivity.get_IsConnected())
      {
        string result = ratingPopupViewModel._appVersionService.GDPRLink().GetAwaiter().GetResult();
        ratingPopupViewModel._webNavigation.OpenUrl(result);
      }
      else
      {
        int num = await ratingPopupViewModel._modalDialog.DisplayAlertAsync(ratingPopupViewModel._textProvider.GetText((string) null, (string) null, "GDPR_Connection_Error_Message"), ratingPopupViewModel._textProvider.GetText((string) null, (string) null, "GDPR_Connection_Error_Title"), "OK", (string) null) ? 1 : 0;
      }
    }
  }
}
