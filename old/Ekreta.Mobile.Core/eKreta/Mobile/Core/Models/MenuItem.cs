// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.MenuItem
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross.ViewModels;
using System;

namespace Ekreta.Mobile.Core.Models
{
  public class MenuItem : MvxNotifyPropertyChanged
  {
    private int _newItemsCount;

    public string Title { get; set; }

    public string IconUrl { get; set; }

    public Type ViewModelType { get; set; }

    public string ModelName { get; set; }

    public string NavigationUrl { get; set; }

    public int NewItemsCount
    {
      get
      {
        return this._newItemsCount;
      }
      set
      {
        this.SetProperty<int>((M0&) ref this._newItemsCount, (M0) value, nameof (NewItemsCount));
      }
    }

    public bool IsEnabled { get; set; }

    public MenuItem()
    {
      base.\u002Ector();
    }
  }
}
