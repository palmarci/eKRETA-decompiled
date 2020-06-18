// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.TranslateExtension
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross;
using MvvmCross.Localization;
using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Ekreta.Mobile.Core.Extensions
{
  [ContentProperty("Text")]
  public class TranslateExtension : IMarkupExtension
  {
    private readonly IMvxTextProvider _textProvider;

    public TranslateExtension()
    {
      this._textProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
    }

    public string Text { get; set; }

    public object ProvideValue(IServiceProvider serviceProvider)
    {
      return string.IsNullOrEmpty(this.Text) ? (object) null : (object) this._textProvider.GetText((string) null, (string) null, this.Text);
    }
  }
}
