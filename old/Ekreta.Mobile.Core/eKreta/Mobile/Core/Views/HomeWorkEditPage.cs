// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.HomeWorkEditPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.ViewModels;
using MvvmCross.Forms.Presenters.Attributes;
using MvvmCross.Forms.Views;
using MvvmCross.ViewModels;
using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.ComponentModel;
using System.Reflection;
using System.Xml;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.PlatformConfiguration.iOSSpecific;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [XamlFilePath("Views/HomeWorkEditPage.xaml")]
  [MvxMasterDetailPagePresentation]
  [XamlCompilation]
  public class HomeWorkEditPage : MvxContentPage<HomeWorkEditViewModel>
  {
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private Editor UserNameEntry;

    public HomeWorkEditPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    protected virtual void OnViewModelSet()
    {
      ((MvxContentPage) this).OnViewModelSet();
      ((MvxNotifyPropertyChanged) this.get_ViewModel()).add_PropertyChanged(new PropertyChangedEventHandler(this.ViewModel_PropertyChanged));
    }

    private async void ViewModel_PropertyChanged(object sender, PropertyChangedEventArgs e)
    {
      HomeWorkEditPage homeWorkEditPage = this;
      if (!homeWorkEditPage.get_ViewModel().ShouldPopToRoot || !(e.PropertyName == "ShouldPopToRoot"))
        return;
      ((MvxNotifyPropertyChanged) homeWorkEditPage.get_ViewModel()).remove_PropertyChanged(new PropertyChangedEventHandler(homeWorkEditPage.ViewModel_PropertyChanged));
      homeWorkEditPage.set_ViewModel((HomeWorkEditViewModel) null);
      await ((NavigableElement) homeWorkEditPage).get_Navigation().PopToRootAsync();
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (HomeWorkEditPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/HomeWorkEditPage.xaml");
      resourceLoadingQuery.set_Instance((object) this);
      if (ResourceLoader.CanProvideContentFor(resourceLoadingQuery))
        this.__InitComponentRuntime();
      else if (XamlLoader.get_XamlFileProvider() != null && XamlLoader.get_XamlFileProvider()(((object) this).GetType()) != null)
      {
        this.__InitComponentRuntime();
      }
      else
      {
        StaticResourceExtension resourceExtension1 = new StaticResourceExtension();
        BindingExtension bindingExtension1 = new BindingExtension();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        BindableToolbarItem bindableToolbarItem = new BindableToolbarItem();
        BindingExtension bindingExtension3 = new BindingExtension();
        Editor editor = new Editor();
        Grid grid = new Grid();
        HomeWorkEditPage homeWorkEditPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (homeWorkEditPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) homeWorkEditPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("UserNameEntry", (object) editor);
        if (((Element) editor).get_StyleId() == null)
          ((Element) editor).set_StyleId("UserNameEntry");
        this.UserNameEntry = editor;
        ((BindableObject) homeWorkEditPage).SetValue((BindableProperty) Page.TitleProperty, (object) "Új Házi Feladat");
        ((BindableObject) homeWorkEditPage).SetValue((BindableProperty) Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension3 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) homeWorkEditPage;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver1.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (HomeWorkEditPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(15, 5)));
        object obj2 = ((IMarkupExtension) resourceExtension3).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((VisualElement) homeWorkEditPage).set_BackgroundColor((Color) obj2);
        bindingExtension1.set_Path("SaveHomeWorkCommand");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) bindableToolbarItem).SetBinding((BindableProperty) MenuItem.CommandProperty, bindingBase1);
        ((BindableObject) bindableToolbarItem).SetValue((BindableProperty) MenuItem.IconProperty, new FileImageSourceConverter().ConvertFromInvariantString("save_icon.png"));
        resourceExtension2.set_Key("NegateBooleanConverter");
        StaticResourceExtension resourceExtension4 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 3];
        objArray2[0] = (object) bindingExtension2;
        objArray2[1] = (object) bindableToolbarItem;
        objArray2[2] = (object) homeWorkEditPage;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) typeof (BindingExtension).GetRuntimeProperty("Converter"), (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver2.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (HomeWorkEditPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(32, 13)));
        object obj4 = ((IMarkupExtension) resourceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider2);
        bindingExtension2.set_Converter((IValueConverter) obj4);
        bindingExtension2.set_Path("ActiveProfile.IsTutelary");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) bindableToolbarItem).SetBinding(BindableToolbarItem.IsVisibleProperty, bindingBase2);
        ((ICollection<ToolbarItem>) ((Page) homeWorkEditPage).get_ToolbarItems()).Add((ToolbarItem) bindableToolbarItem);
        ((BindableObject) editor).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(0.0, 6.0));
        ((BindableObject) editor).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        bindingExtension3.set_Mode((BindingMode) 1);
        bindingExtension3.set_Path("Text");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        ((BindableObject) editor).SetBinding((BindableProperty) Editor.TextProperty, bindingBase3);
        ((BindableObject) editor).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        ((ICollection<View>) grid.get_Children()).Add((View) editor);
        ((BindableObject) homeWorkEditPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid);
      }
    }

    private void __InitComponentRuntime()
    {
      Extensions.LoadFromXaml<HomeWorkEditPage>((M0) this, typeof (HomeWorkEditPage));
      this.UserNameEntry = (Editor) NameScopeExtensions.FindByName<Editor>((Element) this, "UserNameEntry");
    }
  }
}
