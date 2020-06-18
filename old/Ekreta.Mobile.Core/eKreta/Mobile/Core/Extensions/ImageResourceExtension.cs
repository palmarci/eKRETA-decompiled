// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.ImageResourceExtension
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Reflection;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Ekreta.Mobile.Core.Extensions
{
  [ContentProperty("Source")]
  public class ImageResourceExtension : IMarkupExtension
  {
    public string Source { get; set; }

    public object ProvideValue(IServiceProvider serviceProvider)
    {
      return this.Source == null ? (object) null : (object) ImageSource.FromResource(this.Source, (Assembly) null);
    }
  }
}
