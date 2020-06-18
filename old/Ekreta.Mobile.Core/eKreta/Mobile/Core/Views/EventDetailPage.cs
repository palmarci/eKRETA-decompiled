// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.EventDetailPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

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
using Xamarin.Essentials;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.PlatformConfiguration.iOSSpecific;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [MvxMasterDetailPagePresentation]
  [XamlFilePath("Views/EventDetailPage.xaml")]
  [XamlCompilation]
  public class EventDetailPage : MvxContentPage<EventDetailViewModel>
  {
    private const string http = "http";

    public EventDetailPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    private async void WebView_OnNavigating(object sender, WebNavigatingEventArgs e)
    {
      try
      {
        string url = ((WebNavigationEventArgs) e).get_Url();
        if (!url.StartsWith("http"))
          return;
        e.set_Cancel(true);
        await Launcher.OpenAsync(new Uri(url));
      }
      catch (Exception ex)
      {
        Console.WriteLine((object) ex);
      }
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (EventDetailPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/EventDetailPage.xaml");
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
        RowDefinition rowDefinition1 = new RowDefinition();
        RowDefinition rowDefinition2 = new RowDefinition();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        RowDefinition rowDefinition3 = new RowDefinition();
        RowDefinition rowDefinition4 = new RowDefinition();
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        BindingExtension bindingExtension1 = new BindingExtension();
        Label label1 = new Label();
        StaticResourceExtension resourceExtension4 = new StaticResourceExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        Label label2 = new Label();
        StackLayout stackLayout = new StackLayout();
        StaticResourceExtension resourceExtension5 = new StaticResourceExtension();
        CachedImage cachedImage = new CachedImage();
        Grid grid1 = new Grid();
        BindingExtension bindingExtension3 = new BindingExtension();
        WebView webView = new WebView();
        Grid grid2 = new Grid();
        EventDetailPage eventDetailPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (eventDetailPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) eventDetailPage, (INameScope) nameScope);
        translateExtension1.Text = "EventDetail_Page_Title";
        TranslateExtension translateExtension2 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) eventDetailPage;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) Page.TitleProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver1.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver1.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (EventDetailPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(13, 5)));
        object obj2 = ((IMarkupExtension) translateExtension2).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Page) eventDetailPage).set_Title((string) obj2);
        ((BindableObject) eventDetailPage).SetValue((BindableProperty) Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension6 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 1];
        objArray2[0] = (object) eventDetailPage;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver2.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver2.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (EventDetailPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(16, 5)));
        object obj4 = ((IMarkupExtension) resourceExtension6).ProvideValue((IServiceProvider) xamlServiceProvider2);
        ((VisualElement) eventDetailPage).set_BackgroundColor((Color) obj4);
        ((BindableObject) rowDefinition1).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("Auto"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid2).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition1);
        ((BindableObject) rowDefinition2).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("*"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid2).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition2);
        resourceExtension2.set_Key("DetailHeaderHolderStyle");
        StaticResourceExtension resourceExtension7 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 3];
        objArray3[0] = (object) grid1;
        objArray3[1] = (object) grid2;
        objArray3[2] = (object) eventDetailPage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver3.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver3.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver3.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver3.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (EventDetailPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(27, 15)));
        object obj6 = ((IMarkupExtension) resourceExtension7).ProvideValue((IServiceProvider) xamlServiceProvider3);
        ((NavigableElement) grid1).set_Style((Style) obj6);
        ((BindableObject) rowDefinition3).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("*"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid1).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition3);
        ((BindableObject) rowDefinition4).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("50"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid1).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition4);
        ((BindableObject) stackLayout).SetValue((BindableProperty) Layout.PaddingProperty, (object) new Thickness(0.0, 10.0, 0.0, 0.0));
        ((BindableObject) stackLayout).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        resourceExtension3.set_Key("DetailDataTitleStyle");
        StaticResourceExtension resourceExtension8 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 5];
        objArray4[0] = (object) label1;
        objArray4[1] = (object) stackLayout;
        objArray4[2] = (object) grid1;
        objArray4[3] = (object) grid2;
        objArray4[4] = (object) eventDetailPage;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider4.Add(type7, (object) valueTargetProvider4);
        xamlServiceProvider4.Add(typeof (IReferenceProvider), obj7);
        Type type8 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver4 = new XmlNamespaceResolver();
        namespaceResolver4.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver4.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver4.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver4.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver4.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver4.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver4.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (EventDetailPage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(33, 24)));
        object obj8 = ((IMarkupExtension) resourceExtension8).ProvideValue((IServiceProvider) xamlServiceProvider4);
        ((NavigableElement) label1).set_Style((Style) obj8);
        bindingExtension1.set_Path("Event.Title");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) label1).SetBinding((BindableProperty) Label.TextProperty, bindingBase1);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label1);
        ((BindableObject) label2).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(6.0));
        resourceExtension4.set_Key("DetailDataDescriptionStyle");
        StaticResourceExtension resourceExtension9 = resourceExtension4;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 5];
        objArray5[0] = (object) label2;
        objArray5[1] = (object) stackLayout;
        objArray5[2] = (object) grid1;
        objArray5[3] = (object) grid2;
        objArray5[4] = (object) eventDetailPage;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray5, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider5.Add(type9, (object) valueTargetProvider5);
        xamlServiceProvider5.Add(typeof (IReferenceProvider), obj9);
        Type type10 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver5 = new XmlNamespaceResolver();
        namespaceResolver5.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver5.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver5.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver5.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver5.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver5.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver5.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (EventDetailPage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(36, 21)));
        object obj10 = ((IMarkupExtension) resourceExtension9).ProvideValue((IServiceProvider) xamlServiceProvider5);
        ((NavigableElement) label2).set_Style((Style) obj10);
        bindingExtension2.set_StringFormat("{0:D}");
        bindingExtension2.set_Path("Event.Date");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) label2).SetBinding((BindableProperty) Label.TextProperty, bindingBase2);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label2);
        ((ICollection<View>) grid1.get_Children()).Add((View) stackLayout);
        ((BindableObject) cachedImage).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        resourceExtension5.set_Key("DetailHeaderBottomCachedImageStyle");
        StaticResourceExtension resourceExtension10 = resourceExtension5;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 4];
        objArray6[0] = (object) cachedImage;
        objArray6[1] = (object) grid1;
        objArray6[2] = (object) grid2;
        objArray6[3] = (object) eventDetailPage;
        SimpleValueTargetProvider valueTargetProvider6;
        object obj11 = (object) (valueTargetProvider6 = new SimpleValueTargetProvider(objArray6, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider6.Add(type11, (object) valueTargetProvider6);
        xamlServiceProvider6.Add(typeof (IReferenceProvider), obj11);
        Type type12 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver6 = new XmlNamespaceResolver();
        namespaceResolver6.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver6.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver6.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver6.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver6.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver6.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver6.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver6.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (EventDetailPage).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(40, 54)));
        object obj12 = ((IMarkupExtension) resourceExtension10).ProvideValue((IServiceProvider) xamlServiceProvider6);
        ((NavigableElement) cachedImage).set_Style((Style) obj12);
        ((ICollection<View>) grid1.get_Children()).Add((View) cachedImage);
        ((ICollection<View>) grid2.get_Children()).Add((View) grid1);
        ((BindableObject) webView).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        ((BindableObject) webView).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        webView.add_Navigating(new EventHandler<WebNavigatingEventArgs>(eventDetailPage.WebView_OnNavigating));
        bindingExtension3.set_Path("Event.WebViewSource");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        ((BindableObject) webView).SetBinding((BindableProperty) WebView.SourceProperty, bindingBase3);
        ((BindableObject) webView).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        ((ICollection<View>) grid2.get_Children()).Add((View) webView);
        ((BindableObject) eventDetailPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid2);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<EventDetailPage>((M0) this, typeof (EventDetailPage));
    }
  }
}
