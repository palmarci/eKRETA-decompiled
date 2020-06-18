// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.HomeWorkEditViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.Client.Validation;
using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using MvvmCross;
using MvvmCross.Base;
using MvvmCross.Commands;
using MvvmCross.ViewModels;
using System;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class HomeWorkEditViewModel : ViewModelBase<LessonRealm, TanuloHaziFeladatCreateResponse>
  {
    private readonly IStudentHomeWorkDbDataService _studentHomeWorkDataService;
    private LessonRealm _lesson;
    private string _text;
    private bool _shouldPopToRoot;

    public HomeWorkEditViewModel()
    {
      this._studentHomeWorkDataService = (IStudentHomeWorkDbDataService) Mvx.get_IoCProvider().Resolve<IStudentHomeWorkDbDataService>();
      this.SaveHomeWorkCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteSaveHomeWorkCommand), (Func<bool>) null, false);
    }

    public LessonRealm Lesson
    {
      get
      {
        return this._lesson;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<LessonRealm>((M0&) ref this._lesson, (M0) value, nameof (Lesson));
      }
    }

    public string Text
    {
      get
      {
        return this._text;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._text, (M0) value, nameof (Text));
      }
    }

    public bool ShouldPopToRoot
    {
      get
      {
        return this._shouldPopToRoot;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._shouldPopToRoot, (M0) (value ? 1 : 0), nameof (ShouldPopToRoot));
      }
    }

    public MvxAsyncCommand SaveHomeWorkCommand { get; private set; }

    public virtual void Prepare(LessonRealm parameter)
    {
      this.Lesson = parameter;
    }

    public override void ViewDisappearing()
    {
      ((MvxViewModelResult<TanuloHaziFeladatCreateResponse>) this).get_CloseCompletionSource()?.TrySetResult((object) false);
      base.ViewDisappearing();
    }

    private string ConvertToHtml(string text)
    {
      return text.Replace("\r\n", "<br/>").Replace("\r", "<br/>").Replace("\n", "<br/>");
    }

    private async Task ExecuteSaveHomeWorkCommand()
    {
      HomeWorkEditViewModel workEditViewModel = this;
      try
      {
        if (!workEditViewModel.HasInternetConnection)
          throw new NoInternetConnectionException().SetErrorCode<NoInternetConnectionException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkEditViewModel.cs", 76);
        workEditViewModel.IsLoading = true;
        if (string.IsNullOrWhiteSpace(workEditViewModel.Text))
          throw new EmptyHomeworkValidationException().SetErrorCode<EmptyHomeworkValidationException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/HomeWorkEditViewModel.cs", 83);
        workEditViewModel.IsLoading = true;
        TanuloHaziFeladatCreateResponse studentHomeWorkAsync = await workEditViewModel._studentHomeWorkDataService.CreateStudentHomeWorkAsync(workEditViewModel.ActiveProfileRealm, workEditViewModel.Lesson, workEditViewModel.ConvertToHtml(workEditViewModel.Text));
        workEditViewModel.IsLoading = false;
        // ISSUE: reference to a compiler-generated method
        ((MvxMainThreadDispatchingObject) workEditViewModel).InvokeOnMainThread(new Action(workEditViewModel.\u003CExecuteSaveHomeWorkCommand\u003Eb__21_0), true);
        int num = await workEditViewModel._navigationService.Close<TanuloHaziFeladatCreateResponse>((IMvxViewModelResult<M0>) workEditViewModel, (M0) studentHomeWorkAsync, new CancellationToken()) ? 1 : 0;
      }
      catch (Exception ex)
      {
        switch (ex)
        {
          case ServerValidationException validationException:
            await workEditViewModel._userDialogs.AlertAsync(validationException.ValidationException.GetAggregatedValidationMessage(), validationException.ValidationException.Message, workEditViewModel._textProvider.GetText((string) null, (string) null, "Alert_ButtonOk_Text"), new CancellationToken?());
            break;
          case NotExistedElementException _:
            if (await workEditViewModel._userDialogs.ConfirmAsync(workEditViewModel._textProvider.GetText((string) null, (string) null, "NotExistedElement_Message"), workEditViewModel._textProvider.GetText((string) null, (string) null, "NotExistedElement_Title"), workEditViewModel._textProvider.GetText((string) null, (string) null, "NotExistedElement_Navigate"), workEditViewModel._textProvider.GetText((string) null, (string) null, "ActionSheet_Cancel_Text"), new CancellationToken?()))
            {
              int num = await workEditViewModel._navigationService.Close<TanuloHaziFeladatCreateResponse>((IMvxViewModelResult<M0>) workEditViewModel, (M0) null, new CancellationToken()) ? 1 : 0;
              workEditViewModel.ShouldPopToRoot = true;
              break;
            }
            break;
          default:
            ErrorHandler.Current.HandleError(ex);
            break;
        }
      }
      finally
      {
        workEditViewModel.IsLoading = false;
      }
    }
  }
}
