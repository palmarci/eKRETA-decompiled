// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Controls.EmptyView
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
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
  [XamlFilePath("Controls/EmptyView.xaml")]
  [XamlCompilation]
  public class EmptyView : ContentView
  {
    public static readonly BindableProperty ImageProperty = BindableProperty.Create(nameof (Image), typeof (string), typeof (EmptyView), (object) "resource://Ekreta.Mobile.Core.Images.KretaMan_smile.png?assembly=Ekreta.Mobile.Core", (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    public static readonly BindableProperty TitleProperty = BindableProperty.Create(nameof (Title), typeof (string), typeof (EmptyView), (object) ((IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>()).GetText((string) null, (string) null, "Common_ListIsEmpty"), (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    public static readonly BindableProperty IsSubtitleVisibleProperty = BindableProperty.Create(nameof (IsSubtitleVisible), typeof (bool), typeof (EmptyView), (object) true, (BindingMode) 2, (BindableProperty.ValidateValueDelegate) null, (BindableProperty.BindingPropertyChangedDelegate) null, (BindableProperty.BindingPropertyChangingDelegate) null, (BindableProperty.CoerceValueDelegate) null, (BindableProperty.CreateDefaultValueDelegate) null);
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private ContentView View;

    public EmptyView()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    public string Image
    {
      get
      {
        return (string) ((BindableObject) this).GetValue(EmptyView.ImageProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(EmptyView.ImageProperty, (object) value);
      }
    }

    public string Title
    {
      get
      {
        return (string) ((BindableObject) this).GetValue(EmptyView.TitleProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(EmptyView.TitleProperty, (object) value);
      }
    }

    public bool IsSubtitleVisible
    {
      get
      {
        return (bool) ((BindableObject) this).GetValue(EmptyView.IsSubtitleVisibleProperty);
      }
      set
      {
        ((BindableObject) this).SetValue(EmptyView.IsSubtitleVisibleProperty, (object) value);
      }
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (EmptyView).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Controls/EmptyView.xaml");
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
        Setter setter = new Setter();
        DataTrigger dataTrigger = new DataTrigger(typeof (ContentView));
        StaticResourceExtension resourceExtension1 = new StaticResourceExtension();
        ReferenceExtension referenceExtension1 = new ReferenceExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        CachedImage cachedImage = new CachedImage();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        ReferenceExtension referenceExtension2 = new ReferenceExtension();
        BindingExtension bindingExtension3 = new BindingExtension();
        Label label1 = new Label();
        ReferenceExtension referenceExtension3 = new ReferenceExtension();
        BindingExtension bindingExtension4 = new BindingExtension();
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        TranslateExtension translateExtension1 = new TranslateExtension();
        Label label2 = new Label();
        StackLayout stackLayout = new StackLayout();
        Frame frame = new Frame();
        EmptyView emptyView;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (emptyView = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) emptyView, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("View", (object) emptyView);
        if (((Element) emptyView).get_StyleId() == null)
          ((Element) emptyView).set_StyleId("View");
        this.View = (ContentView) emptyView;
        ((BindableObject) emptyView).SetValue((BindableProperty) VisualElement.IsVisibleProperty, new VisualElement.VisibilityConverter().ConvertFromInvariantString("False"));
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        dataTrigger.set_Binding(bindingBase1);
        dataTrigger.set_Value((object) "0");
        setter.set_Property((BindableProperty) VisualElement.IsVisibleProperty);
        setter.set_Value((object) "True");
        setter.set_Value(new VisualElement.VisibilityConverter().ConvertFromInvariantString("True"));
        ((ICollection<Setter>) dataTrigger.get_Setters()).Add(setter);
        ((ICollection<TriggerBase>) ((BindableObject) emptyView).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger);
        ((BindableObject) frame).SetValue((BindableProperty) Xamarin.Forms.View.MarginProperty, (object) new Thickness(12.0));
        resourceExtension1.set_Key("AccentContrastColor");
        StaticResourceExtension resourceExtension4 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 2];
        objArray1[0] = (object) frame;
        objArray1[1] = (object) emptyView;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (EmptyView).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(21, 13)));
        object obj2 = ((IMarkupExtension) resourceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((VisualElement) frame).set_BackgroundColor((Color) obj2);
        ((BindableObject) frame).SetValue((BindableProperty) Frame.HasShadowProperty, (object) false);
        ((BindableObject) frame).SetValue((BindableProperty) Xamarin.Forms.View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        ((BindableObject) stackLayout).SetValue((BindableProperty) Xamarin.Forms.View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) stackLayout).SetValue((BindableProperty) Xamarin.Forms.View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) cachedImage).SetValue((BindableProperty) Xamarin.Forms.View.MarginProperty, (object) new Thickness(12.0, 32.0));
        ((BindableObject) cachedImage).SetValue((BindableProperty) CachedImage.DownsampleToViewSizeProperty, (object) true);
        ((BindableObject) cachedImage).SetValue((BindableProperty) VisualElement.HeightRequestProperty, (object) 240.0);
        referenceExtension1.set_Name("View");
        ReferenceExtension referenceExtension4 = referenceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 5];
        objArray2[0] = (object) bindingExtension2;
        objArray2[1] = (object) cachedImage;
        objArray2[2] = (object) stackLayout;
        objArray2[3] = (object) frame;
        objArray2[4] = (object) emptyView;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) typeof (BindingExtension).GetRuntimeProperty("Source"), (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (EmptyView).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(29, 21)));
        object obj4 = ((IMarkupExtension) referenceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider2);
        bindingExtension2.set_Source(obj4);
        bindingExtension2.set_Path("Image");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) cachedImage).SetBinding((BindableProperty) CachedImage.SourceProperty, bindingBase2);
        ((BindableObject) cachedImage).SetValue((BindableProperty) VisualElement.WidthRequestProperty, (object) 320.0);
        ((ICollection<Xamarin.Forms.View>) ((Layout<Xamarin.Forms.View>) stackLayout).get_Children()).Add((Xamarin.Forms.View) cachedImage);
        ((BindableObject) label1).SetValue((BindableProperty) Xamarin.Forms.View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) label1).SetValue((BindableProperty) Label.LineBreakModeProperty, (object) (LineBreakMode) 1);
        resourceExtension2.set_Key("ListItemTitleStyle");
        StaticResourceExtension resourceExtension5 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 4];
        objArray3[0] = (object) label1;
        objArray3[1] = (object) stackLayout;
        objArray3[2] = (object) frame;
        objArray3[3] = (object) emptyView;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (EmptyView).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(34, 21)));
        object obj6 = ((IMarkupExtension) resourceExtension5).ProvideValue((IServiceProvider) xamlServiceProvider3);
        ((NavigableElement) label1).set_Style((Style) obj6);
        referenceExtension2.set_Name("View");
        ReferenceExtension referenceExtension5 = referenceExtension2;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 5];
        objArray4[0] = (object) bindingExtension3;
        objArray4[1] = (object) label1;
        objArray4[2] = (object) stackLayout;
        objArray4[3] = (object) frame;
        objArray4[4] = (object) emptyView;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) typeof (BindingExtension).GetRuntimeProperty("Source"), (INameScope) nameScope));
        xamlServiceProvider4.Add(type7, (object) valueTargetProvider4);
        xamlServiceProvider4.Add(typeof (IReferenceProvider), obj7);
        Type type8 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver4 = new XmlNamespaceResolver();
        namespaceResolver4.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver4.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver4.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (EmptyView).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(35, 21)));
        object obj8 = ((IMarkupExtension) referenceExtension5).ProvideValue((IServiceProvider) xamlServiceProvider4);
        bindingExtension3.set_Source(obj8);
        bindingExtension3.set_Path("Title");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        ((BindableObject) label1).SetBinding((BindableProperty) Label.TextProperty, bindingBase3);
        ((BindableObject) label1).SetValue((BindableProperty) Label.XAlignProperty, new TextAlignmentConverter().ConvertFromInvariantString("Center"));
        ((ICollection<Xamarin.Forms.View>) ((Layout<Xamarin.Forms.View>) stackLayout).get_Children()).Add((Xamarin.Forms.View) label1);
        ((BindableObject) label2).SetValue((BindableProperty) Xamarin.Forms.View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        referenceExtension3.set_Name("View");
        ReferenceExtension referenceExtension6 = referenceExtension3;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 5];
        objArray5[0] = (object) bindingExtension4;
        objArray5[1] = (object) label2;
        objArray5[2] = (object) stackLayout;
        objArray5[3] = (object) frame;
        objArray5[4] = (object) emptyView;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray5, (object) typeof (BindingExtension).GetRuntimeProperty("Source"), (INameScope) nameScope));
        xamlServiceProvider5.Add(type9, (object) valueTargetProvider5);
        xamlServiceProvider5.Add(typeof (IReferenceProvider), obj9);
        Type type10 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver5 = new XmlNamespaceResolver();
        namespaceResolver5.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver5.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver5.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (EmptyView).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(39, 21)));
        object obj10 = ((IMarkupExtension) referenceExtension6).ProvideValue((IServiceProvider) xamlServiceProvider5);
        bindingExtension4.set_Source(obj10);
        bindingExtension4.set_Path("IsSubtitleVisible");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) label2).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase4);
        ((BindableObject) label2).SetValue((BindableProperty) Label.LineBreakModeProperty, (object) (LineBreakMode) 1);
        resourceExtension3.set_Key("ListItemDescriptionStyle");
        StaticResourceExtension resourceExtension6 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 4];
        objArray6[0] = (object) label2;
        objArray6[1] = (object) stackLayout;
        objArray6[2] = (object) frame;
        objArray6[3] = (object) emptyView;
        SimpleValueTargetProvider valueTargetProvider6;
        object obj11 = (object) (valueTargetProvider6 = new SimpleValueTargetProvider(objArray6, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider6.Add(type11, (object) valueTargetProvider6);
        xamlServiceProvider6.Add(typeof (IReferenceProvider), obj11);
        Type type12 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver6 = new XmlNamespaceResolver();
        namespaceResolver6.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver6.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver6.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (EmptyView).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(41, 21)));
        object obj12 = ((IMarkupExtension) resourceExtension6).ProvideValue((IServiceProvider) xamlServiceProvider6);
        ((NavigableElement) label2).set_Style((Style) obj12);
        translateExtension1.Text = "Common_NoElement";
        TranslateExtension translateExtension2 = translateExtension1;
        XamlServiceProvider xamlServiceProvider7 = new XamlServiceProvider();
        Type type13 = typeof (IProvideValueTarget);
        object[] objArray7 = new object[0 + 4];
        objArray7[0] = (object) label2;
        objArray7[1] = (object) stackLayout;
        objArray7[2] = (object) frame;
        objArray7[3] = (object) emptyView;
        SimpleValueTargetProvider valueTargetProvider7;
        object obj13 = (object) (valueTargetProvider7 = new SimpleValueTargetProvider(objArray7, (object) Label.TextProperty, (INameScope) nameScope));
        xamlServiceProvider7.Add(type13, (object) valueTargetProvider7);
        xamlServiceProvider7.Add(typeof (IReferenceProvider), obj13);
        Type type14 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver7 = new XmlNamespaceResolver();
        namespaceResolver7.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver7.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver7.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver7.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        XamlTypeResolver xamlTypeResolver7 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver7, typeof (EmptyView).GetTypeInfo().Assembly);
        xamlServiceProvider7.Add(type14, (object) xamlTypeResolver7);
        xamlServiceProvider7.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(42, 21)));
        object obj14 = ((IMarkupExtension) translateExtension2).ProvideValue((IServiceProvider) xamlServiceProvider7);
        label2.set_Text((string) obj14);
        ((ICollection<Xamarin.Forms.View>) ((Layout<Xamarin.Forms.View>) stackLayout).get_Children()).Add((Xamarin.Forms.View) label2);
        ((BindableObject) frame).SetValue((BindableProperty) ContentView.ContentProperty, (object) stackLayout);
        ((BindableObject) emptyView).SetValue((BindableProperty) ContentView.ContentProperty, (object) frame);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<EmptyView>((M0) this, typeof (EmptyView));
      this.View = (ContentView) NameScopeExtensions.FindByName<ContentView>((Element) this, "View");
    }
  }
}
