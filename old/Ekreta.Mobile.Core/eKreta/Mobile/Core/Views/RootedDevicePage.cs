﻿// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.RootedDevicePage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.ViewModels;
using MvvmCross.Forms.Presenters.Attributes;
using MvvmCross.Forms.Views;
using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Reflection;
using System.Xml;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.PlatformConfiguration.iOSSpecific;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [XamlCompilation]
  [MvxContentPagePresentation(Animated = true, NoHistory = true, WrapInNavigationPage = true)]
  [XamlFilePath("Views/RootedDevicePage.xaml")]
  public class RootedDevicePage : MvxContentPage<RootedDeviceViewModel>
  {
    public RootedDevicePage()
    {
      base.\u002Ector();
      this.InitializeComponent();
      NavigationPage.SetHasNavigationBar((BindableObject) this, false);
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (RootedDevicePage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/RootedDevicePage.xaml");
      resourceLoadingQuery.set_Instance((object) this);
      if (ResourceLoader.CanProvideContentFor(resourceLoadingQuery))
        this.__InitComponentRuntime();
      else if (XamlLoader.get_XamlFileProvider() != null && XamlLoader.get_XamlFileProvider()(((object) this).GetType()) != null)
      {
        this.__InitComponentRuntime();
      }
      else
      {
        RowDefinition rowDefinition1 = new RowDefinition();
        RowDefinition rowDefinition2 = new RowDefinition();
        Image image = new Image();
        TranslateExtension translateExtension1 = new TranslateExtension();
        StaticResourceExtension resourceExtension1 = new StaticResourceExtension();
        Label label1 = new Label();
        TranslateExtension translateExtension2 = new TranslateExtension();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        Label label2 = new Label();
        BindingExtension bindingExtension = new BindingExtension();
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        TranslateExtension translateExtension3 = new TranslateExtension();
        Button button = new Button();
        StackLayout stackLayout = new StackLayout();
        Frame frame = new Frame();
        Grid grid = new Grid();
        RootedDevicePage rootedDevicePage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (rootedDevicePage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) rootedDevicePage, (INameScope) nameScope);
        ((BindableObject) rootedDevicePage).SetValue((BindableProperty) Page.UseSafeAreaProperty, (object) true);
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition1);
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition2);
        ((BindableObject) image).SetValue((BindableProperty) Grid.RowSpanProperty, (object) 2);
        ((BindableObject) image).SetValue((BindableProperty) Image.AspectProperty, (object) (Aspect) 1);
        ((BindableObject) image).SetValue((BindableProperty) Image.SourceProperty, new ImageSourceConverter().ConvertFromInvariantString("Splash.png"));
        ((ICollection<View>) grid.get_Children()).Add((View) image);
        ((BindableObject) frame).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        ((BindableObject) frame).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.End);
        ((BindableObject) label1).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(0.0, 0.0));
        ((BindableObject) label1).SetValue((BindableProperty) Label.FontProperty, new FontTypeConverter().ConvertFromInvariantString("Bold,20"));
        ((BindableObject) label1).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Start);
        ((BindableObject) label1).SetValue((BindableProperty) Label.HorizontalTextAlignmentProperty, new TextAlignmentConverter().ConvertFromInvariantString("Start"));
        translateExtension1.Text = "RootedDevice_Title";
        TranslateExtension translateExtension4 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 5];
        objArray1[0] = (object) label1;
        objArray1[1] = (object) stackLayout;
        objArray1[2] = (object) frame;
        objArray1[3] = (object) grid;
        objArray1[4] = (object) rootedDevicePage;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) Label.TextProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver1.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (RootedDevicePage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(34, 21)));
        object obj2 = ((IMarkupExtension) translateExtension4).ProvideValue((IServiceProvider) xamlServiceProvider1);
        label1.set_Text((string) obj2);
        resourceExtension1.set_Key("DarkTextColor");
        StaticResourceExtension resourceExtension4 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 5];
        objArray2[0] = (object) label1;
        objArray2[1] = (object) stackLayout;
        objArray2[2] = (object) frame;
        objArray2[3] = (object) grid;
        objArray2[4] = (object) rootedDevicePage;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) Label.TextColorProperty, (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver2.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (RootedDevicePage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(35, 21)));
        object obj4 = ((IMarkupExtension) resourceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider2);
        label1.set_TextColor((Color) obj4);
        ((BindableObject) label1).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label1);
        ((BindableObject) label2).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(0.0, 8.0));
        ((BindableObject) label2).SetValue((BindableProperty) Label.FontProperty, new FontTypeConverter().ConvertFromInvariantString("None,14"));
        ((BindableObject) label2).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Start);
        ((BindableObject) label2).SetValue((BindableProperty) Label.HorizontalTextAlignmentProperty, new TextAlignmentConverter().ConvertFromInvariantString("Start"));
        translateExtension2.Text = "RootedDevice_Message";
        TranslateExtension translateExtension5 = translateExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 5];
        objArray3[0] = (object) label2;
        objArray3[1] = (object) stackLayout;
        objArray3[2] = (object) frame;
        objArray3[3] = (object) grid;
        objArray3[4] = (object) rootedDevicePage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) Label.TextProperty, (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver3.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver3.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (RootedDevicePage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(42, 21)));
        object obj6 = ((IMarkupExtension) translateExtension5).ProvideValue((IServiceProvider) xamlServiceProvider3);
        label2.set_Text((string) obj6);
        resourceExtension2.set_Key("DarkTextColor");
        StaticResourceExtension resourceExtension5 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 5];
        objArray4[0] = (object) label2;
        objArray4[1] = (object) stackLayout;
        objArray4[2] = (object) frame;
        objArray4[3] = (object) grid;
        objArray4[4] = (object) rootedDevicePage;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) Label.TextColorProperty, (INameScope) nameScope));
        xamlServiceProvider4.Add(type7, (object) valueTargetProvider4);
        xamlServiceProvider4.Add(typeof (IReferenceProvider), obj7);
        Type type8 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver4 = new XmlNamespaceResolver();
        namespaceResolver4.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver4.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver4.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver4.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver4.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (RootedDevicePage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(43, 21)));
        object obj8 = ((IMarkupExtension) resourceExtension5).ProvideValue((IServiceProvider) xamlServiceProvider4);
        label2.set_TextColor((Color) obj8);
        ((BindableObject) label2).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label2);
        ((BindableObject) button).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(0.0, 12.0, 0.0, 0.0));
        bindingExtension.set_Path("CloseCommand");
        BindingBase bindingBase = ((IMarkupExtension<BindingBase>) bindingExtension).ProvideValue((IServiceProvider) null);
        ((BindableObject) button).SetBinding((BindableProperty) Button.CommandProperty, bindingBase);
        resourceExtension3.set_Key("FormButtonStyle");
        StaticResourceExtension resourceExtension6 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 5];
        objArray5[0] = (object) button;
        objArray5[1] = (object) stackLayout;
        objArray5[2] = (object) frame;
        objArray5[3] = (object) grid;
        objArray5[4] = (object) rootedDevicePage;
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
        namespaceResolver5.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver5.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (RootedDevicePage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(48, 21)));
        object obj10 = ((IMarkupExtension) resourceExtension6).ProvideValue((IServiceProvider) xamlServiceProvider5);
        ((NavigableElement) button).set_Style((Style) obj10);
        translateExtension3.Text = "RootedDevice_Button_Title";
        TranslateExtension translateExtension6 = translateExtension3;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 5];
        objArray6[0] = (object) button;
        objArray6[1] = (object) stackLayout;
        objArray6[2] = (object) frame;
        objArray6[3] = (object) grid;
        objArray6[4] = (object) rootedDevicePage;
        SimpleValueTargetProvider valueTargetProvider6;
        object obj11 = (object) (valueTargetProvider6 = new SimpleValueTargetProvider(objArray6, (object) Button.TextProperty, (INameScope) nameScope));
        xamlServiceProvider6.Add(type11, (object) valueTargetProvider6);
        xamlServiceProvider6.Add(typeof (IReferenceProvider), obj11);
        Type type12 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver6 = new XmlNamespaceResolver();
        namespaceResolver6.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver6.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver6.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver6.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver6.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver6.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (RootedDevicePage).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(49, 21)));
        object obj12 = ((IMarkupExtension) translateExtension6).ProvideValue((IServiceProvider) xamlServiceProvider6);
        button.set_Text((string) obj12);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) button);
        ((BindableObject) frame).SetValue((BindableProperty) ContentView.ContentProperty, (object) stackLayout);
        ((ICollection<View>) grid.get_Children()).Add((View) frame);
        ((BindableObject) rootedDevicePage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<RootedDevicePage>((M0) this, typeof (RootedDevicePage));
    }
  }
}
