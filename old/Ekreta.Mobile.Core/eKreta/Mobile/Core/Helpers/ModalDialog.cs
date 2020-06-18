// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ModalDialog
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Views;
using MvvmCross;
using MvvmCross.Base;
using MvvmCross.Localization;
using MvvmCross.Plugin.Messenger;
using Plugin.StoreReview;
using Rg.Plugins.Popup.Pages;
using Rg.Plugins.Popup.Services;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Helpers
{
  public class ModalDialog : IModalDialog
  {
    private readonly IRatingDataService _ratingDataService;
    private readonly IMvxTextProvider _textProvider;
    private readonly IPackageInfo _packageInfo;
    private readonly IMvxMessenger _messenger;
    private readonly IProfileDataService _profileDataService;
    private readonly IFirebaseRemoteConfigurationService _remoteConfigurationService;

    public ModalDialog()
    {
      this._ratingDataService = (IRatingDataService) Mvx.get_IoCProvider().Resolve<IRatingDataService>();
      this._textProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
      this._packageInfo = (IPackageInfo) Mvx.get_IoCProvider().Resolve<IPackageInfo>();
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      this._remoteConfigurationService = (IFirebaseRemoteConfigurationService) Mvx.get_IoCProvider().Resolve<IFirebaseRemoteConfigurationService>();
      this._messenger.Subscribe<RatingChooserMessage>((Action<M0>) (async message => await this.RatingChooserMessageHandler(message.Message)), (MvxReference) 1, (string) null);
    }

    public async Task<bool> DisplayAlertAsync(
      string message,
      string title,
      string accept = "OK",
      string cancel = null)
    {
      await ((IMvxMainThreadAsyncDispatcher) Mvx.get_IoCProvider().GetSingleton<IMvxMainThreadAsyncDispatcher>()).ExecuteOnMainThreadAsync((Func<Task>) (async () =>
      {
        try
        {
          MasterDetailPage mainPage1 = Application.get_Current().get_MainPage() as MasterDetailPage;
          if (cancel == null && mainPage1 != null)
            await (mainPage1?.get_Detail() as NavigationPage).get_CurrentPage().DisplayAlert(title, message, accept);
          else if (mainPage1 != null)
          {
            int num1 = await (mainPage1?.get_Detail() as NavigationPage).get_CurrentPage().DisplayAlert(title, message, accept, cancel) ? 1 : 0;
          }
          else
          {
            NavigationPage mainPage2 = Application.get_Current().get_MainPage() as NavigationPage;
            if (cancel == null)
            {
              await ((Page) mainPage2)?.DisplayAlert(title, message, accept);
            }
            else
            {
              int num2 = await ((Page) mainPage2)?.DisplayAlert(title, message, accept, cancel) ? 1 : 0;
            }
          }
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (DisplayAlertAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/ModalDialog.cs", 80);
        }
      }), true);
      return await Task.FromResult<bool>(true);
    }

    public async Task DisplayAlertByResourceKeysAsync(string messageKey, string titleKey)
    {
      int num = await this.DisplayAlertAsync(this._textProvider.GetText((string) null, (string) null, messageKey), this._textProvider.GetText((string) null, (string) null, titleKey), "OK", (string) null) ? 1 : 0;
    }

    public async Task DisplayErrorCodeByResourceKeysAsync(
      string messageKey,
      string titleKey,
      string errorCode)
    {
      int num = await this.DisplayAlertAsync(this._textProvider.GetText((string) null, (string) null, messageKey) + Environment.NewLine + Environment.NewLine + "(" + errorCode + ")", this._textProvider.GetText((string) null, (string) null, titleKey), "OK", (string) null) ? 1 : 0;
    }

    public async Task<bool> DisplayVersionAlertAsync(
      string message,
      string title,
      string accept = "OK",
      string cancel = null)
    {
      bool result = true;
      try
      {
        MasterDetailPage mainPage1 = Application.get_Current().get_MainPage() as MasterDetailPage;
        if (cancel == null && mainPage1 != null)
          await (mainPage1?.get_Detail() as NavigationPage).get_CurrentPage().DisplayAlert(title, message, accept);
        else if (mainPage1 != null)
        {
          result = await (mainPage1?.get_Detail() as NavigationPage).get_CurrentPage().DisplayAlert(title, message, accept, cancel);
        }
        else
        {
          NavigationPage mainPage2 = Application.get_Current().get_MainPage() as NavigationPage;
          if (cancel == null)
            await ((Page) mainPage2)?.DisplayAlert(title, message, accept);
          else
            result = await ((Page) mainPage2)?.DisplayAlert(title, message, accept, cancel);
        }
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (DisplayVersionAlertAsync), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Helpers/ModalDialog.cs", 137);
      }
      return result;
    }

    public async Task<string> DisplayActionSheetAsync(
      string title,
      string cancel,
      string destruction,
      params string[] buttons)
    {
      return await (Application.get_Current().get_MainPage() is MasterDetailPage mainPage ? mainPage.get_Detail().DisplayActionSheet(title, cancel, destruction, buttons) : (Task<string>) null);
    }

    public void InvokeRatingFlow(Profile profile)
    {
      if (!this._remoteConfigurationService.GetAsync<bool>("IsRatingEnabled").Result)
        return;
      if (profile != null)
      {
        Rating ratingByProfile = this._ratingDataService.GetRatingByProfile(profile);
        if (ratingByProfile != null && (!ratingByProfile.Show || !(ratingByProfile.LastSeenDate.AddDays((double) this._ratingDataService.CancelIdleDays) < DateTime.Now)))
          return;
        this._ratingDataService.IncreaseAttempts(profile);
        PopupNavigation.get_Instance().PushAsync((PopupPage) new RatingChooser(), true);
      }
      else
        CrossMobileAnalytics.Current.TrackEvent(this._textProvider.GetText((string) null, (string) null, "Rating_NoProfileInvoke"), (IDictionary<string, string>) null);
    }

    public async Task ClosePopup()
    {
      await PopupNavigation.get_Instance().PopAsync(true);
    }

    private async Task RatingChooserMessageHandler(string message)
    {
      Profile activeProfile = this._profileDataService.GetActiveProfile();
      Rating ratingByProfile = this._ratingDataService.GetRatingByProfile(activeProfile);
      if (message == this._textProvider.GetText((string) null, (string) null, "Rating_EvaulationDislikeTitle"))
      {
        await PopupNavigation.get_Instance().PushAsync((PopupPage) new RatingPopupPage(), true);
      }
      else
      {
        if (!(message == this._textProvider.GetText((string) null, (string) null, "Rating_EvaulationLikeTitle")))
          return;
        ratingByProfile.Liked = true;
        ratingByProfile.Date = new DateTime?(DateTime.Now);
        this._ratingDataService.AddOrUpdate(activeProfile, ratingByProfile);
        CrossStoreReview.get_Current().OpenStoreReviewPage(this._packageInfo.PackageName);
      }
    }
  }
}
