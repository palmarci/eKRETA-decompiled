// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.RootContentPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.ViewModels;
using FFImageLoading.Forms;
using MvvmCross.Forms.Presenters.Attributes;
using MvvmCross.Forms.Views;
using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Reflection;
using System.Xml;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [XamlFilePath("Views/RootContentPage.xaml")]
  [XamlCompilation]
  [MvxMasterDetailPagePresentation]
  public class RootContentPage : MvxContentPage<RootContentViewModel>
  {
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private MvxContentPage<RootContentViewModel> Page;
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private EmptyView EmptyView;

    public RootContentPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    protected virtual void OnAppearing()
    {
      ((MvxContentPage) this).OnAppearing();
      this.EmptyView.Title = this.get_ViewModel().EmptyViewTitle;
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (RootContentPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/RootContentPage.xaml");
      resourceLoadingQuery.set_Instance((object) this);
      if (ResourceLoader.CanProvideContentFor(resourceLoadingQuery))
        this.__InitComponentRuntime();
      else if (XamlLoader.get_XamlFileProvider() != null && XamlLoader.get_XamlFileProvider()(((object) this).GetType()) != null)
      {
        this.__InitComponentRuntime();
      }
      else
      {
        TranslateExtension translateExtension1 = new TranslateExtension();
        StaticResourceExtension resourceExtension1 = new StaticResourceExtension();
        BindingExtension bindingExtension1 = new BindingExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        BindableToolbarItem bindableToolbarItem = new BindableToolbarItem();
        RowDefinition rowDefinition1 = new RowDefinition();
        RowDefinition rowDefinition2 = new RowDefinition();
        BindingExtension bindingExtension3 = new BindingExtension();
        BindingExtension bindingExtension4 = new BindingExtension();
        EmptyView emptyView = new EmptyView();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        BindingExtension bindingExtension5 = new BindingExtension();
        BindingExtension bindingExtension6 = new BindingExtension();
        BindingExtension bindingExtension7 = new BindingExtension();
        BindingExtension bindingExtension8 = new BindingExtension();
        DataTemplate dataTemplate1 = new DataTemplate();
        ListView listView = new ListView((ListViewCachingStrategy) 1);
        BindingExtension bindingExtension9 = new BindingExtension();
        BindingExtension bindingExtension10 = new BindingExtension();
        BindingExtension bindingExtension11 = new BindingExtension();
        TapGestureRecognizer gestureRecognizer = new TapGestureRecognizer();
        CachedImage cachedImage = new CachedImage();
        Grid grid = new Grid();
        RootContentPage rootContentPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (rootContentPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) rootContentPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("Page", (object) rootContentPage);
        if (((Element) rootContentPage).get_StyleId() == null)
          ((Element) rootContentPage).set_StyleId("Page");
        ((INameScope) nameScope).RegisterName("EmptyView", (object) emptyView);
        if (((Element) emptyView).get_StyleId() == null)
          ((Element) emptyView).set_StyleId("EmptyView");
        this.Page = (MvxContentPage<RootContentViewModel>) rootContentPage;
        this.EmptyView = emptyView;
        translateExtension1.Text = "RootContentPage_Title";
        TranslateExtension translateExtension2 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) rootContentPage;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) Xamarin.Forms.Page.TitleProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver1.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver1.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver1.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver1.Add("telerikChart", "clr-namespace:Telerik.XamarinForms.Chart;assembly=Telerik.XamarinForms.Chart");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (RootContentPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(17, 5)));
        object obj2 = ((IMarkupExtension) translateExtension2).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Xamarin.Forms.Page) rootContentPage).set_Title((string) obj2);
        ((BindableObject) rootContentPage).SetValue((BindableProperty) Xamarin.Forms.PlatformConfiguration.iOSSpecific.Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension3 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 1];
        objArray2[0] = (object) rootContentPage;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver2.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver2.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver2.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver2.Add("telerikChart", "clr-namespace:Telerik.XamarinForms.Chart;assembly=Telerik.XamarinForms.Chart");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (RootContentPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(20, 5)));
        object obj4 = ((IMarkupExtension) resourceExtension3).ProvideValue((IServiceProvider) xamlServiceProvider2);
        ((VisualElement) rootContentPage).set_BackgroundColor((Color) obj4);
        bindingExtension1.set_Path("ShowInformationPageCommand");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) bindableToolbarItem).SetBinding((BindableProperty) MenuItem.CommandProperty, bindingBase1);
        ((BindableObject) bindableToolbarItem).SetValue((BindableProperty) MenuItem.IconImageSourceProperty, new ImageSourceConverter().ConvertFromInvariantString("info_icon_white.png"));
        bindingExtension2.set_Path("HasAnyInformationToShow");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) bindableToolbarItem).SetBinding(BindableToolbarItem.IsVisibleProperty, bindingBase2);
        ((ICollection<ToolbarItem>) ((Xamarin.Forms.Page) rootContentPage).get_ToolbarItems()).Add((ToolbarItem) bindableToolbarItem);
        ((BindableObject) rowDefinition1).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("*"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition1);
        ((BindableObject) rowDefinition2).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("Auto"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition2);
        bindingExtension3.set_Path("EmptyViewTitle");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView).SetBinding(EmptyView.TitleProperty, bindingBase3);
        bindingExtension4.set_Path("ListItems.Count");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase4);
        ((BindableObject) emptyView).SetValue(EmptyView.IsSubtitleVisibleProperty, (object) false);
        ((ICollection<View>) grid.get_Children()).Add((View) emptyView);
        ((BindableObject) listView).SetValue((BindableProperty) Grid.RowProperty, (object) 0);
        ((BindableObject) listView).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(3.0, 6.0, 3.0, 3.0));
        resourceExtension2.set_Key("ListViewGroupHeaderTemplate");
        StaticResourceExtension resourceExtension4 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 3];
        objArray3[0] = (object) listView;
        objArray3[1] = (object) grid;
        objArray3[2] = (object) rootContentPage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) ListView.GroupHeaderTemplateProperty, (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver3.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver3.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver3.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver3.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver3.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver3.Add("telerikChart", "clr-namespace:Telerik.XamarinForms.Chart;assembly=Telerik.XamarinForms.Chart");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (RootContentPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(45, 13)));
        object obj6 = ((IMarkupExtension) resourceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider3);
        listView.set_GroupHeaderTemplate((DataTemplate) obj6);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsGroupingEnabledProperty, (object) true);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsPullToRefreshEnabledProperty, (object) true);
        bindingExtension5.set_Path("IsLoading");
        BindingBase bindingBase5 = ((IMarkupExtension<BindingBase>) bindingExtension5).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.IsRefreshingProperty, bindingBase5);
        bindingExtension6.set_Path("ListItems");
        BindingBase bindingBase6 = ((IMarkupExtension<BindingBase>) bindingExtension6).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase6);
        bindingExtension7.set_Path("RefreshCommand");
        BindingBase bindingBase7 = ((IMarkupExtension<BindingBase>) bindingExtension7).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.RefreshCommandProperty, bindingBase7);
        bindingExtension8.set_Mode((BindingMode) 1);
        bindingExtension8.set_Path("SelectedItem");
        BindingBase bindingBase8 = ((IMarkupExtension<BindingBase>) bindingExtension8).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.SelectedItemProperty, bindingBase8);
        DataTemplate dataTemplate2 = dataTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        RootContentPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_32 xamlCdataTemplate32 = new RootContentPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_32();
        object[] objArray4 = new object[0 + 4];
        objArray4[0] = (object) dataTemplate1;
        objArray4[1] = (object) listView;
        objArray4[2] = (object) grid;
        objArray4[3] = (object) rootContentPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate32.parentValues = objArray4;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate32.root = rootContentPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func = new Func<object>(xamlCdataTemplate32.LoadDataTemplate);
        ((IDataTemplate) dataTemplate2).set_LoadTemplate(func);
        ((BindableObject) listView).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) grid.get_Children()).Add((View) listView);
        ((BindableObject) cachedImage).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        ((BindableObject) cachedImage).SetValue((BindableProperty) VisualElement.HeightRequestProperty, (object) 50.0);
        ((BindableObject) cachedImage).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        bindingExtension9.set_Path("ActiveProfile.Institute.HasAdvertisingUrl");
        BindingBase bindingBase9 = ((IMarkupExtension<BindingBase>) bindingExtension9).ProvideValue((IServiceProvider) null);
        ((BindableObject) cachedImage).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase9);
        bindingExtension10.set_Path("ActiveProfile.Institute.InformationImageUrl");
        BindingBase bindingBase10 = ((IMarkupExtension<BindingBase>) bindingExtension10).ProvideValue((IServiceProvider) null);
        ((BindableObject) cachedImage).SetBinding((BindableProperty) CachedImage.SourceProperty, bindingBase10);
        ((BindableObject) cachedImage).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        bindingExtension11.set_Path("NavigateToInformationUrlCommand");
        BindingBase bindingBase11 = ((IMarkupExtension<BindingBase>) bindingExtension11).ProvideValue((IServiceProvider) null);
        ((BindableObject) gestureRecognizer).SetBinding((BindableProperty) TapGestureRecognizer.CommandProperty, bindingBase11);
        ((ICollection<IGestureRecognizer>) ((View) cachedImage).get_GestureRecognizers()).Add((IGestureRecognizer) gestureRecognizer);
        ((ICollection<View>) grid.get_Children()).Add((View) cachedImage);
        ((BindableObject) rootContentPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<RootContentPage>((M0) this, typeof (RootContentPage));
      this.Page = (MvxContentPage<RootContentViewModel>) NameScopeExtensions.FindByName<MvxContentPage<RootContentViewModel>>((Element) this, "Page");
      this.EmptyView = (EmptyView) NameScopeExtensions.FindByName<EmptyView>((Element) this, "EmptyView");
    }
  }
}
