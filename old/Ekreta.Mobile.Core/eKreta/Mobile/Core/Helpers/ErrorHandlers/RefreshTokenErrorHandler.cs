// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ErrorHandlers.RefreshTokenErrorHandler
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions.Network;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using MvvmCross.Plugin.Messenger;

namespace Ekreta.Mobile.Core.Helpers.ErrorHandlers
{
  public class RefreshTokenErrorHandler : CustomErrorHandler<RefreshTokenException>
  {
    public override void HandleError(RefreshTokenException exception)
    {
      IProfileDataService profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      M0 m0 = Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      profileDataService.DeleteOnlyProfileData(exception.Profile);
      LoginRequiredMessage loginRequiredMessage = new LoginRequiredMessage((object) this, exception.Profile);
      ((IMvxMessenger) m0).Publish<LoginRequiredMessage>((M0) loginRequiredMessage);
    }
  }
}
