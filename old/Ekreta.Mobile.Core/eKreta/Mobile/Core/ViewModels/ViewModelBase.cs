// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.ViewModelBase
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Monitoring;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.ViewModels
{
  public abstract class ViewModelBase : ViewModelBase<object>
  {
    public static string GetViewModelNameFromType(Type viewModelType)
    {
      return viewModelType.Name.Replace("ViewModel", string.Empty);
    }

    public virtual void Prepare(object parameter)
    {
    }

    public virtual void Start()
    {
      ((MvxViewModel) this).Start();
      CrossMobileAnalytics.Current.TrackPageView(ViewModelBase.GetViewModelNameFromType(((object) this).GetType()), (IDictionary<string, string>) null);
    }

    protected void SetEmptyState<T>(ref T list, string propertyName) where T : class
    {
      if ((object) list != null)
        return;
      Type type1 = typeof (T);
      if (type1.Name.StartsWith("IEnumerable") || type1.Name.StartsWith("IList"))
      {
        Type type2 = typeof (List<>).MakeGenericType(type1.GetGenericArguments());
        list = Activator.CreateInstance(type2) as T;
      }
      else
        list = Activator.CreateInstance<T>();
      ((MvxNotifyPropertyChanged) this).RaisePropertyChanged(propertyName);
    }
  }
}
