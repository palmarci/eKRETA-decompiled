// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.SearchBarControl
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Controls
{
  public class SearchBarControl : SearchBar
  {
    public SearchBarControl()
    {
      base.\u002Ector();
      this.add_TextChanged(new EventHandler<TextChangedEventArgs>(this.SearchBarControl_TextChanged));
    }

    private void SearchBarControl_TextChanged(object sender, TextChangedEventArgs e)
    {
      if (!string.IsNullOrEmpty(e.get_NewTextValue()) || this.get_SearchCommand() == null || !this.get_SearchCommand().CanExecute(this.get_SearchCommandParameter()))
        return;
      this.get_SearchCommand().Execute((object) e.get_NewTextValue());
    }
  }
}
