// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.DatabaseErrorViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using MvvmCross;
using MvvmCross.Commands;
using MvvmCross.Navigation;
using MvvmCross.ViewModels;
using Realms;
using System;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class DatabaseErrorViewModel : ViewModelBase
  {
    private MvxAsyncCommand _okCommand;

    public MvxAsyncCommand OkCommand
    {
      get
      {
        return this._okCommand ?? (this._okCommand = new MvxAsyncCommand(new Func<Task>(this.HandleDatabaseError), (Func<bool>) null, false));
      }
    }

    private async Task HandleDatabaseError()
    {
      DatabaseErrorViewModel databaseErrorViewModel = this;
      databaseErrorViewModel.Busy();
      await Task.Delay(100);
      Realm.DeleteRealm((RealmConfigurationBase) RealmUtils.RealmConfiguration);
      int num = await databaseErrorViewModel._navigationService.Navigate<LoginViewModel>((IMvxBundle) null, new CancellationToken()) ? 1 : 0;
      Credentials credentials = ((ICredentialsDataService) Mvx.get_IoCProvider().Resolve<ICredentialsDataService>()).GetAllCredentials().FirstOrDefault<Credentials>();
      if (credentials != null)
        await databaseErrorViewModel.NavigateToLogin<LoginViewModel>(credentials);
      databaseErrorViewModel.NotBusy();
    }

    private async Task NavigateToLogin<T>(Credentials credentials) where T : IMvxViewModel<Profile>
    {
      DatabaseErrorViewModel databaseErrorViewModel = this;
      databaseErrorViewModel.Busy();
      IMvxNavigationService navigationService = databaseErrorViewModel._navigationService;
      Profile profile = new Profile();
      profile.Id = credentials.UserId;
      CancellationToken cancellationToken = new CancellationToken();
      int num = await navigationService.Navigate<T, Profile>((M1) profile, (IMvxBundle) null, cancellationToken) ? 1 : 0;
      databaseErrorViewModel.NotBusy();
    }
  }
}
