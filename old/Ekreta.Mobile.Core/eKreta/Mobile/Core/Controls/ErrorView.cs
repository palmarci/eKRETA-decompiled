// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.ErrorView
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using FFImageLoading.Forms;
using MvvmCross;
using MvvmCross.Localization;
using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Reflection;
using System.Xml;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Controls
{
  [XamlFilePath("Controls/ErrorView.xaml")]
  [XamlCompilation]
  public class ErrorView : ContentView
  {
    public static readonly BindableProperty TitleProperty = BindableProperty.Create(nameof (Title), typeof (string), typeof (EmptyView), (object) ((IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>()).GetText((string) null, (string) null, "Common_Error_Message_Title"), (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    public static readonly BindableProperty SubtitleProperty = BindableProperty.Create(nameof (Subtitle), typeof (string), typeof (EmptyView), (object) ((IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>()).GetText((string) null, (string) null, "Common_Error_Message_Subtitle"), (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private ContentView View;

    public ErrorView()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    public string Title
    {
      get
      {
        return (string) ((BindableObject) this).GetValue(ErrorView.TitleProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(ErrorView.TitleProperty, (object) value);
      }
    }

    public string Subtitle
    {
      get
      {
        return (string) ((BindableObject) this).GetValue(ErrorView.SubtitleProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(ErrorView.SubtitleProperty, (object) value);
      }
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (ErrorView).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Controls/ErrorView.xaml");
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
        CachedImage cachedImage = new CachedImage();
        ReferenceExtension referenceExtension1 = new ReferenceExtension();
        BindingExtension bindingExtension1 = new BindingExtension();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        Label label1 = new Label();
        ReferenceExtension referenceExtension2 = new ReferenceExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        Label label2 = new Label();
        StackLayout stackLayout = new StackLayout();
        Frame frame = new Frame();
        ErrorView errorView;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (errorView = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) errorView, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("View", (object) errorView);
        if (((Element) errorView).get_StyleId() == null)
          ((Element) errorView).set_StyleId("View");
        this.View = (ContentView) errorView;
        resourceExtension1.set_Key("AccentContrastColor");
        StaticResourceExtension resourceExtension4 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 2];
        objArray1[0] = (object) frame;
        objArray1[1] = (object) errorView;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (ErrorView).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(8, 16)));
        object obj2 = ((IMarkupExtension) resourceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((VisualElement) frame).set_BackgroundColor((Color) obj2);
        ((BindableObject) frame).SetValue((BindableProperty) Xamarin.Forms.View.MarginProperty, (object) new Thickness(12.0));
        ((BindableObject) frame).SetValue((BindableProperty) Frame.HasShadowProperty, (object) false);
        ((BindableObject) frame).SetValue((BindableProperty) Xamarin.Forms.View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        ((BindableObject) stackLayout).SetValue((BindableProperty) Xamarin.Forms.View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) stackLayout).SetValue((BindableProperty) Xamarin.Forms.View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) cachedImage).SetValue((BindableProperty) CachedImage.DownsampleToViewSizeProperty, (object) true);
        ((BindableObject) cachedImage).SetValue((BindableProperty) CachedImage.SourceProperty, new ImageSourceConverter().ConvertFromInvariantString("resource://Ekreta.Mobile.Core.Images.KretaMan.png?assembly=Ekreta.Mobile.Core"));
        ((BindableObject) cachedImage).SetValue((BindableProperty) Xamarin.Forms.View.MarginProperty, (object) new Thickness(12.0, 32.0));
        ((BindableObject) cachedImage).SetValue((BindableProperty) VisualElement.WidthRequestProperty, (object) 320.0);
        ((BindableObject) cachedImage).SetValue((BindableProperty) VisualElement.HeightRequestProperty, (object) 240.0);
        ((ICollection<Xamarin.Forms.View>) ((Layout<Xamarin.Forms.View>) stackLayout).get_Children()).Add((Xamarin.Forms.View) cachedImage);
        referenceExtension1.set_Name("View");
        ReferenceExtension referenceExtension3 = referenceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 5];
        objArray2[0] = (object) bindingExtension1;
        objArray2[1] = (object) label1;
        objArray2[2] = (object) stackLayout;
        objArray2[3] = (object) frame;
        objArray2[4] = (object) errorView;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) typeof (BindingExtension).GetRuntimeProperty("Source"), (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (ErrorView).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(11, 24)));
        object obj4 = ((IMarkupExtension) referenceExtension3).ProvideValue((IServiceProvider) xamlServiceProvider2);
        bindingExtension1.set_Source(obj4);
        bindingExtension1.set_Path("Title");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) label1).SetBinding((BindableProperty) Label.TextProperty, bindingBase1);
        resourceExtension2.set_Key("ListItemTitleStyle");
        StaticResourceExtension resourceExtension5 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 4];
        objArray3[0] = (object) label1;
        objArray3[1] = (object) stackLayout;
        objArray3[2] = (object) frame;
        objArray3[3] = (object) errorView;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (ErrorView).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(11, 74)));
        object obj6 = ((IMarkupExtension) resourceExtension5).ProvideValue((IServiceProvider) xamlServiceProvider3);
        ((NavigableElement) label1).set_Style((Style) obj6);
        ((BindableObject) label1).SetValue((BindableProperty) Xamarin.Forms.View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) label1).SetValue((BindableProperty) Label.LineBreakModeProperty, (object) (LineBreakMode) 1);
        ((BindableObject) label1).SetValue((BindableProperty) Label.XAlignProperty, new TextAlignmentConverter().ConvertFromInvariantString("Center"));
        ((ICollection<Xamarin.Forms.View>) ((Layout<Xamarin.Forms.View>) stackLayout).get_Children()).Add((Xamarin.Forms.View) label1);
        referenceExtension2.set_Name("View");
        ReferenceExtension referenceExtension4 = referenceExtension2;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 5];
        objArray4[0] = (object) bindingExtension2;
        objArray4[1] = (object) label2;
        objArray4[2] = (object) stackLayout;
        objArray4[3] = (object) frame;
        objArray4[4] = (object) errorView;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) typeof (BindingExtension).GetRuntimeProperty("Source"), (INameScope) nameScope));
        xamlServiceProvider4.Add(type7, (object) valueTargetProvider4);
        xamlServiceProvider4.Add(typeof (IReferenceProvider), obj7);
        Type type8 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver4 = new XmlNamespaceResolver();
        namespaceResolver4.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver4.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver4.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (ErrorView).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(12, 24)));
        object obj8 = ((IMarkupExtension) referenceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider4);
        bindingExtension2.set_Source(obj8);
        bindingExtension2.set_Path("Subtitle");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) label2).SetBinding((BindableProperty) Label.TextProperty, bindingBase2);
        ((BindableObject) label2).SetValue((BindableProperty) Label.LineBreakModeProperty, (object) (LineBreakMode) 1);
        ((BindableObject) label2).SetValue((BindableProperty) Label.XAlignProperty, new TextAlignmentConverter().ConvertFromInvariantString("Center"));
        ((BindableObject) label2).SetValue((BindableProperty) Xamarin.Forms.View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        resourceExtension3.set_Key("ListItemDescriptionStyle");
        StaticResourceExtension resourceExtension6 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 4];
        objArray5[0] = (object) label2;
        objArray5[1] = (object) stackLayout;
        objArray5[2] = (object) frame;
        objArray5[3] = (object) errorView;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray5, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider5.Add(type9, (object) valueTargetProvider5);
        xamlServiceProvider5.Add(typeof (IReferenceProvider), obj9);
        Type type10 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver5 = new XmlNamespaceResolver();
        namespaceResolver5.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver5.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver5.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (ErrorView).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(12, 145)));
        object obj10 = ((IMarkupExtension) resourceExtension6).ProvideValue((IServiceProvider) xamlServiceProvider5);
        ((NavigableElement) label2).set_Style((Style) obj10);
        ((ICollection<Xamarin.Forms.View>) ((Layout<Xamarin.Forms.View>) stackLayout).get_Children()).Add((Xamarin.Forms.View) label2);
        ((BindableObject) frame).SetValue((BindableProperty) ContentView.ContentProperty, (object) stackLayout);
        ((BindableObject) errorView).SetValue((BindableProperty) ContentView.ContentProperty, (object) frame);
      }
    }

    private void __InitComponentRuntime()
    {
      Extensions.LoadFromXaml<ErrorView>((M0) this, typeof (ErrorView));
      this.View = (ContentView) NameScopeExtensions.FindByName<ContentView>((Element) this, "View");
    }
  }
}
