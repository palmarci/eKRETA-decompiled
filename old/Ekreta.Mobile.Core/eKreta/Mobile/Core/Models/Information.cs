// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Information
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross;
using MvvmCross.Localization;

namespace Ekreta.Mobile.Core.Models
{
  public class Information
  {
    public Information(string titleKey, string displayTextKey)
    {
      IMvxTextProvider imvxTextProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
      this.Title = (object) imvxTextProvider.GetText((string) null, (string) null, titleKey);
      this.DisplayText = imvxTextProvider.GetText((string) null, (string) null, displayTextKey);
    }

    public string DisplayText { get; set; }

    public object Title { get; set; }
  }
}
