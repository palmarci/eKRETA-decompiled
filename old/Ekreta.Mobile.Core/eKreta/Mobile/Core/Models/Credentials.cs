// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Credentials
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.ViewModels;

namespace Ekreta.Mobile.Core.Models
{
  public class Credentials
  {
    public Credentials()
    {
    }

    public Credentials(NewProfileViewModel newProfileViewModel)
    {
      this.UserId = newProfileViewModel.ActiveProfile.Id;
      this.Password = newProfileViewModel.SaveMyPassword ? newProfileViewModel.Password : string.Empty;
      this.UserName = newProfileViewModel.UserName;
      this.InstitudeId = newProfileViewModel.SelectedInstitute.InstituteId;
    }

    public string Id { get; set; }

    public string Password { get; set; }

    public string UserName { get; set; }

    public string InstitudeId { get; set; }

    public string UserId { get; set; }
  }
}
