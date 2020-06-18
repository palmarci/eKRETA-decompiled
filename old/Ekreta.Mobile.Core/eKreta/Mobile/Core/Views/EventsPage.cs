// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.EventsPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.Extensions;
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
  [MvxMasterDetailPagePresentation]
  [XamlFilePath("Views/EventsPage.xaml")]
  [XamlCompilation]
  public class EventsPage : MvxContentPage<EventsViewModel>
  {
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private MvxContentPage<EventsViewModel> Page;

    public EventsPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (EventsPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/EventsPage.xaml");
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
        TranslateExtension translateExtension2 = new TranslateExtension();
        Setter setter1 = new Setter();
        DataTrigger dataTrigger1 = new DataTrigger(typeof (MvxContentPage));
        BindingExtension bindingExtension2 = new BindingExtension();
        TranslateExtension translateExtension3 = new TranslateExtension();
        Setter setter2 = new Setter();
        DataTrigger dataTrigger2 = new DataTrigger(typeof (MvxContentPage));
        BindingExtension bindingExtension3 = new BindingExtension();
        TranslateExtension translateExtension4 = new TranslateExtension();
        Setter setter3 = new Setter();
        DataTrigger dataTrigger3 = new DataTrigger(typeof (MvxContentPage));
        BindingExtension bindingExtension4 = new BindingExtension();
        EmptyView emptyView = new EmptyView();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        BindingExtension bindingExtension5 = new BindingExtension();
        BindingExtension bindingExtension6 = new BindingExtension();
        DataTemplate dataTemplate1 = new DataTemplate();
        ListView listView = new ListView((ListViewCachingStrategy) 1);
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        BindingExtension bindingExtension7 = new BindingExtension();
        StaticResourceExtension resourceExtension4 = new StaticResourceExtension();
        CircleImage circleImage = new CircleImage();
        BindingExtension bindingExtension8 = new BindingExtension();
        BindingExtension bindingExtension9 = new BindingExtension();
        ActivityIndicator activityIndicator = new ActivityIndicator();
        Grid grid1 = new Grid();
        Grid grid2 = new Grid();
        EventsPage eventsPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (eventsPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) eventsPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("Page", (object) eventsPage);
        if (((Element) eventsPage).get_StyleId() == null)
          ((Element) eventsPage).set_StyleId("Page");
        this.Page = (MvxContentPage<EventsViewModel>) eventsPage;
        translateExtension1.Text = "Events_Page_Title";
        TranslateExtension translateExtension5 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) eventsPage;
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
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(16, 5)));
        object obj2 = ((IMarkupExtension) translateExtension5).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Xamarin.Forms.Page) eventsPage).set_Title((string) obj2);
        ((BindableObject) eventsPage).SetValue((BindableProperty) Xamarin.Forms.PlatformConfiguration.iOSSpecific.Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension5 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 1];
        objArray2[0] = (object) eventsPage;
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
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(19, 5)));
        object obj4 = ((IMarkupExtension) resourceExtension5).ProvideValue((IServiceProvider) xamlServiceProvider2);
        ((VisualElement) eventsPage).set_BackgroundColor((Color) obj4);
        bindingExtension1.set_Path("HasInternetConnection");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        dataTrigger1.set_Binding(bindingBase1);
        dataTrigger1.set_Value((object) "True");
        setter1.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension2.Text = "Events_Page_Title";
        TranslateExtension translateExtension6 = translateExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 3];
        objArray3[0] = (object) setter1;
        objArray3[1] = (object) dataTrigger1;
        objArray3[2] = (object) eventsPage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) typeof (Setter).GetRuntimeProperty("Value"), (INameScope) nameScope));
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
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(29, 38)));
        object obj6 = ((IMarkupExtension) translateExtension6).ProvideValue((IServiceProvider) xamlServiceProvider3);
        setter1.set_Value(obj6);
        ((ICollection<Setter>) dataTrigger1.get_Setters()).Add(setter1);
        ((ICollection<TriggerBase>) ((BindableObject) eventsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger1);
        bindingExtension2.set_Path("HasInternetConnection");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        dataTrigger2.set_Binding(bindingBase2);
        dataTrigger2.set_Value((object) "False");
        setter2.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension3.Text = "Events_Page_Offline_Title";
        TranslateExtension translateExtension7 = translateExtension3;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 3];
        objArray4[0] = (object) setter2;
        objArray4[1] = (object) dataTrigger2;
        objArray4[2] = (object) eventsPage;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) typeof (Setter).GetRuntimeProperty("Value"), (INameScope) nameScope));
        xamlServiceProvider4.Add(type7, (object) valueTargetProvider4);
        xamlServiceProvider4.Add(typeof (IReferenceProvider), obj7);
        Type type8 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver4 = new XmlNamespaceResolver();
        namespaceResolver4.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver4.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver4.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver4.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver4.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver4.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver4.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver4.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(35, 38)));
        object obj8 = ((IMarkupExtension) translateExtension7).ProvideValue((IServiceProvider) xamlServiceProvider4);
        setter2.set_Value(obj8);
        ((ICollection<Setter>) dataTrigger2.get_Setters()).Add(setter2);
        ((ICollection<TriggerBase>) ((BindableObject) eventsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger2);
        bindingExtension3.set_Path("IsOffline");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        dataTrigger3.set_Binding(bindingBase3);
        dataTrigger3.set_Value((object) "True");
        setter3.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension4.Text = "Events_Page_Offline_Title";
        TranslateExtension translateExtension8 = translateExtension4;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 3];
        objArray5[0] = (object) setter3;
        objArray5[1] = (object) dataTrigger3;
        objArray5[2] = (object) eventsPage;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray5, (object) typeof (Setter).GetRuntimeProperty("Value"), (INameScope) nameScope));
        xamlServiceProvider5.Add(type9, (object) valueTargetProvider5);
        xamlServiceProvider5.Add(typeof (IReferenceProvider), obj9);
        Type type10 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver5 = new XmlNamespaceResolver();
        namespaceResolver5.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver5.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver5.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver5.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver5.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver5.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver5.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver5.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(41, 38)));
        object obj10 = ((IMarkupExtension) translateExtension8).ProvideValue((IServiceProvider) xamlServiceProvider5);
        setter3.set_Value(obj10);
        ((ICollection<Setter>) dataTrigger3.get_Setters()).Add(setter3);
        ((ICollection<TriggerBase>) ((BindableObject) eventsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger3);
        bindingExtension4.set_Path("Events.Count");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase4);
        ((ICollection<View>) grid2.get_Children()).Add((View) emptyView);
        resourceExtension2.set_Key("ListViewGroupHeaderTemplate");
        StaticResourceExtension resourceExtension6 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 3];
        objArray6[0] = (object) listView;
        objArray6[1] = (object) grid2;
        objArray6[2] = (object) eventsPage;
        SimpleValueTargetProvider valueTargetProvider6;
        object obj11 = (object) (valueTargetProvider6 = new SimpleValueTargetProvider(objArray6, (object) ListView.GroupHeaderTemplateProperty, (INameScope) nameScope));
        xamlServiceProvider6.Add(type11, (object) valueTargetProvider6);
        xamlServiceProvider6.Add(typeof (IReferenceProvider), obj11);
        Type type12 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver6 = new XmlNamespaceResolver();
        namespaceResolver6.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver6.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver6.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver6.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver6.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver6.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver6.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver6.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver6.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(48, 13)));
        object obj12 = ((IMarkupExtension) resourceExtension6).ProvideValue((IServiceProvider) xamlServiceProvider6);
        listView.set_GroupHeaderTemplate((DataTemplate) obj12);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsGroupingEnabledProperty, (object) true);
        bindingExtension5.set_Path("Events");
        BindingBase bindingBase5 = ((IMarkupExtension<BindingBase>) bindingExtension5).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase5);
        bindingExtension6.set_Mode((BindingMode) 1);
        bindingExtension6.set_Path("SelectedItem");
        BindingBase bindingBase6 = ((IMarkupExtension<BindingBase>) bindingExtension6).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.SelectedItemProperty, bindingBase6);
        DataTemplate dataTemplate2 = dataTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        EventsPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_16 xamlCdataTemplate16 = new EventsPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_16();
        object[] objArray7 = new object[0 + 4];
        objArray7[0] = (object) dataTemplate1;
        objArray7[1] = (object) listView;
        objArray7[2] = (object) grid2;
        objArray7[3] = (object) eventsPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate16.parentValues = objArray7;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate16.root = eventsPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func = new Func<object>(xamlCdataTemplate16.LoadDataTemplate);
        ((IDataTemplate) dataTemplate2).set_LoadTemplate(func);
        ((BindableObject) listView).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) grid2.get_Children()).Add((View) listView);
        resourceExtension3.set_Key("OverlayColor");
        StaticResourceExtension resourceExtension7 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider7 = new XamlServiceProvider();
        Type type13 = typeof (IProvideValueTarget);
        object[] objArray8 = new object[0 + 3];
        objArray8[0] = (object) grid1;
        objArray8[1] = (object) grid2;
        objArray8[2] = (object) eventsPage;
        SimpleValueTargetProvider valueTargetProvider7;
        object obj13 = (object) (valueTargetProvider7 = new SimpleValueTargetProvider(objArray8, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider7.Add(type13, (object) valueTargetProvider7);
        xamlServiceProvider7.Add(typeof (IReferenceProvider), obj13);
        Type type14 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver7 = new XmlNamespaceResolver();
        namespaceResolver7.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver7.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver7.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver7.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver7.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver7.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver7.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver7.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver7.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver7.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver7.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver7 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver7, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider7.Add(type14, (object) xamlTypeResolver7);
        xamlServiceProvider7.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(101, 15)));
        object obj14 = ((IMarkupExtension) resourceExtension7).ProvideValue((IServiceProvider) xamlServiceProvider7);
        ((VisualElement) grid1).set_BackgroundColor((Color) obj14);
        bindingExtension7.set_Path("IsLoading");
        BindingBase bindingBase7 = ((IMarkupExtension<BindingBase>) bindingExtension7).ProvideValue((IServiceProvider) null);
        ((BindableObject) grid1).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase7);
        ((BindableObject) circleImage).SetValue((BindableProperty) CircleImage.FillColorProperty, (object) (Color) Color.White);
        resourceExtension4.set_Key("ListItemIconStyle");
        StaticResourceExtension resourceExtension8 = resourceExtension4;
        XamlServiceProvider xamlServiceProvider8 = new XamlServiceProvider();
        Type type15 = typeof (IProvideValueTarget);
        object[] objArray9 = new object[0 + 4];
        objArray9[0] = (object) circleImage;
        objArray9[1] = (object) grid1;
        objArray9[2] = (object) grid2;
        objArray9[3] = (object) eventsPage;
        SimpleValueTargetProvider valueTargetProvider8;
        object obj15 = (object) (valueTargetProvider8 = new SimpleValueTargetProvider(objArray9, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider8.Add(type15, (object) valueTargetProvider8);
        xamlServiceProvider8.Add(typeof (IReferenceProvider), obj15);
        Type type16 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver8 = new XmlNamespaceResolver();
        namespaceResolver8.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver8.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver8.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver8.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver8.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver8.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver8.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver8.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver8.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver8.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver8.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver8 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver8, typeof (EventsPage).GetTypeInfo().Assembly);
        xamlServiceProvider8.Add(type16, (object) xamlTypeResolver8);
        xamlServiceProvider8.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(102, 56)));
        object obj16 = ((IMarkupExtension) resourceExtension8).ProvideValue((IServiceProvider) xamlServiceProvider8);
        ((NavigableElement) circleImage).set_Style((Style) obj16);
        ((ICollection<View>) grid1.get_Children()).Add((View) circleImage);
        bindingExtension8.set_Path("IsLoading");
        BindingBase bindingBase8 = ((IMarkupExtension<BindingBase>) bindingExtension8).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) ActivityIndicator.IsRunningProperty, bindingBase8);
        bindingExtension9.set_Path("IsLoading");
        BindingBase bindingBase9 = ((IMarkupExtension<BindingBase>) bindingExtension9).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase9);
        ((ICollection<View>) grid1.get_Children()).Add((View) activityIndicator);
        ((ICollection<View>) grid2.get_Children()).Add((View) grid1);
        ((BindableObject) eventsPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid2);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<EventsPage>((M0) this, typeof (EventsPage));
      this.Page = (MvxContentPage<EventsViewModel>) NameScopeExtensions.FindByName<MvxContentPage<EventsViewModel>>((Element) this, "Page");
    }
  }
}
