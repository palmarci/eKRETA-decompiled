// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.MessagesPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.ViewModels;
using ImageCircle.Forms.Plugin.Abstractions;
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
  [XamlCompilation]
  [MvxMasterDetailPagePresentation]
  [XamlFilePath("Views/MessagesPage.xaml")]
  public class MessagesPage : MvxContentPage<MessagesViewModel>
  {
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private MvxContentPage<MessagesViewModel> Page;
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private ListView MessageListView;

    public MessagesPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (MessagesPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/MessagesPage.xaml");
      resourceLoadingQuery.set_Instance((object) this);
      if (ResourceLoader.CanProvideContentFor(resourceLoadingQuery))
        this.__InitComponentRuntime();
      else if (XamlLoader.get_XamlFileProvider() != null && XamlLoader.get_XamlFileProvider()(((object) this).GetType()) != null)
      {
        this.__InitComponentRuntime();
      }
      else
      {
        BindingExtension bindingExtension1 = new BindingExtension();
        StaticResourceExtension resourceExtension1 = new StaticResourceExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        EmptyView emptyView = new EmptyView();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        BindingExtension bindingExtension3 = new BindingExtension();
        BindingExtension bindingExtension4 = new BindingExtension();
        BindingExtension bindingExtension5 = new BindingExtension();
        DataTemplate dataTemplate1 = new DataTemplate();
        ListView listView = new ListView((ListViewCachingStrategy) 1);
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        BindingExtension bindingExtension6 = new BindingExtension();
        StaticResourceExtension resourceExtension4 = new StaticResourceExtension();
        BoxView boxView = new BoxView();
        StaticResourceExtension resourceExtension5 = new StaticResourceExtension();
        CircleImage circleImage = new CircleImage();
        BindingExtension bindingExtension7 = new BindingExtension();
        BindingExtension bindingExtension8 = new BindingExtension();
        ActivityIndicator activityIndicator = new ActivityIndicator();
        Grid grid1 = new Grid();
        Grid grid2 = new Grid();
        MessagesPage messagesPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (messagesPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) messagesPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("Page", (object) messagesPage);
        if (((Element) messagesPage).get_StyleId() == null)
          ((Element) messagesPage).set_StyleId("Page");
        ((INameScope) nameScope).RegisterName("MessageListView", (object) listView);
        if (((Element) listView).get_StyleId() == null)
          ((Element) listView).set_StyleId("MessageListView");
        this.Page = (MvxContentPage<MessagesViewModel>) messagesPage;
        this.MessageListView = listView;
        bindingExtension1.set_Path("TitleIncludeConnectivityState");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) messagesPage).SetBinding((BindableProperty) Xamarin.Forms.Page.TitleProperty, bindingBase1);
        ((BindableObject) messagesPage).SetValue((BindableProperty) Xamarin.Forms.PlatformConfiguration.iOSSpecific.Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension6 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) messagesPage;
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
        namespaceResolver1.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver1.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (MessagesPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(18, 5)));
        object obj2 = ((IMarkupExtension) resourceExtension6).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((VisualElement) messagesPage).set_BackgroundColor((Color) obj2);
        bindingExtension2.set_Path("PostaladaElemek.Count");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase2);
        ((ICollection<View>) grid2.get_Children()).Add((View) emptyView);
        resourceExtension2.set_Key("ListViewMonthGroupHeaderTemplate");
        StaticResourceExtension resourceExtension7 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 3];
        objArray2[0] = (object) listView;
        objArray2[1] = (object) grid2;
        objArray2[2] = (object) messagesPage;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) ListView.GroupHeaderTemplateProperty, (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver2.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver2.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (MessagesPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(28, 13)));
        object obj4 = ((IMarkupExtension) resourceExtension7).ProvideValue((IServiceProvider) xamlServiceProvider2);
        listView.set_GroupHeaderTemplate((DataTemplate) obj4);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsPullToRefreshEnabledProperty, (object) true);
        bindingExtension3.set_Path("PostaladaElemek");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase3);
        bindingExtension4.set_Path("RefreshCommand");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.RefreshCommandProperty, bindingBase4);
        bindingExtension5.set_Mode((BindingMode) 1);
        bindingExtension5.set_Path("SelectedItem");
        BindingBase bindingBase5 = ((IMarkupExtension<BindingBase>) bindingExtension5).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.SelectedItemProperty, bindingBase5);
        ((BindableObject) listView).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        DataTemplate dataTemplate2 = dataTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        MessagesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_28 xamlCdataTemplate28 = new MessagesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_28();
        object[] objArray3 = new object[0 + 4];
        objArray3[0] = (object) dataTemplate1;
        objArray3[1] = (object) listView;
        objArray3[2] = (object) grid2;
        objArray3[3] = (object) messagesPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate28.parentValues = objArray3;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate28.root = messagesPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func = new Func<object>(xamlCdataTemplate28.LoadDataTemplate);
        ((IDataTemplate) dataTemplate2).set_LoadTemplate(func);
        ((BindableObject) listView).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) grid2.get_Children()).Add((View) listView);
        resourceExtension3.set_Key("OverlayColor");
        StaticResourceExtension resourceExtension8 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 3];
        objArray4[0] = (object) grid1;
        objArray4[1] = (object) grid2;
        objArray4[2] = (object) messagesPage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray4, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver3.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver3.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver3.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver3.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (MessagesPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(101, 13)));
        object obj6 = ((IMarkupExtension) resourceExtension8).ProvideValue((IServiceProvider) xamlServiceProvider3);
        ((VisualElement) grid1).set_BackgroundColor((Color) obj6);
        bindingExtension6.set_Path("IsLoading");
        BindingBase bindingBase6 = ((IMarkupExtension<BindingBase>) bindingExtension6).ProvideValue((IServiceProvider) null);
        ((BindableObject) grid1).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase6);
        resourceExtension4.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension9 = resourceExtension4;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 4];
        objArray5[0] = (object) boxView;
        objArray5[1] = (object) grid1;
        objArray5[2] = (object) grid2;
        objArray5[3] = (object) messagesPage;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray5, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider4.Add(type7, (object) valueTargetProvider4);
        xamlServiceProvider4.Add(typeof (IReferenceProvider), obj7);
        Type type8 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver4 = new XmlNamespaceResolver();
        namespaceResolver4.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver4.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver4.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver4.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver4.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver4.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver4.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (MessagesPage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(103, 22)));
        object obj8 = ((IMarkupExtension) resourceExtension9).ProvideValue((IServiceProvider) xamlServiceProvider4);
        ((VisualElement) boxView).set_BackgroundColor((Color) obj8);
        ((ICollection<View>) grid1.get_Children()).Add((View) boxView);
        ((BindableObject) circleImage).SetValue((BindableProperty) CircleImage.FillColorProperty, (object) (Color) Color.White);
        resourceExtension5.set_Key("ListItemIconStyle");
        StaticResourceExtension resourceExtension10 = resourceExtension5;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 4];
        objArray6[0] = (object) circleImage;
        objArray6[1] = (object) grid1;
        objArray6[2] = (object) grid2;
        objArray6[3] = (object) messagesPage;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray6, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider5.Add(type9, (object) valueTargetProvider5);
        xamlServiceProvider5.Add(typeof (IReferenceProvider), obj9);
        Type type10 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver5 = new XmlNamespaceResolver();
        namespaceResolver5.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver5.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver5.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver5.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver5.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver5.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver5.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (MessagesPage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(104, 56)));
        object obj10 = ((IMarkupExtension) resourceExtension10).ProvideValue((IServiceProvider) xamlServiceProvider5);
        ((NavigableElement) circleImage).set_Style((Style) obj10);
        ((ICollection<View>) grid1.get_Children()).Add((View) circleImage);
        bindingExtension7.set_Path("IsLoading");
        BindingBase bindingBase7 = ((IMarkupExtension<BindingBase>) bindingExtension7).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) ActivityIndicator.IsRunningProperty, bindingBase7);
        bindingExtension8.set_Path("IsLoading");
        BindingBase bindingBase8 = ((IMarkupExtension<BindingBase>) bindingExtension8).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase8);
        ((ICollection<View>) grid1.get_Children()).Add((View) activityIndicator);
        ((ICollection<View>) grid2.get_Children()).Add((View) grid1);
        ((BindableObject) messagesPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid2);
      }
    }

    private void __InitComponentRuntime()
    {
      Extensions.LoadFromXaml<MessagesPage>((M0) this, typeof (MessagesPage));
      this.Page = (MvxContentPage<MessagesViewModel>) NameScopeExtensions.FindByName<MvxContentPage<MessagesViewModel>>((Element) this, "Page");
      this.MessageListView = (ListView) NameScopeExtensions.FindByName<ListView>((Element) this, "MessageListView");
    }
  }
}
