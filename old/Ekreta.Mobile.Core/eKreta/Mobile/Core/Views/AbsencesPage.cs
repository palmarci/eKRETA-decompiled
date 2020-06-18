// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.AbsencesPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.ViewModels;
using ImageCircle.Forms.Plugin.Abstractions;
using MvvmCross.Forms.Presenters.Attributes;
using MvvmCross.Forms.Views;
using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Reflection;
using System.Xml;
using Telerik.XamarinForms.Primitives;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [MvxMasterDetailPagePresentation]
  [XamlFilePath("Views/AbsencesPage.xaml")]
  [XamlCompilation]
  public class AbsencesPage : MvxContentPage<AbsencesViewModel>
  {
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private MvxContentPage<AbsencesViewModel> Page;
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private TabbedControl tabControl;

    public AbsencesPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    protected virtual void OnAppearing()
    {
      ((MvxContentPage) this).OnAppearing();
      this.SetSelectedTab();
    }

    private void SetSelectedTab()
    {
      if (this.get_ViewModel().DefaultJustificationState == null)
        return;
      if (((Collection<TabViewItem>) this.tabControl.get_Items()).Count != AbsencesViewModel.JustificationStates.Length)
        throw new Exception("The ViewModel.JustificationStates.Length have to be the same as the tabControl.Items.Count!");
      Device.BeginInvokeOnMainThread((Action) (() =>
      {
        try
        {
          this.tabControl.set_SelectedItem((object) ((Collection<TabViewItem>) this.tabControl.get_Items())[this.get_ViewModel().DefaultJustificationStateIndex]);
          this.get_ViewModel().DefaultJustificationState = (string) null;
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (SetSelectedTab), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Views/AbsencesPage.xaml.cs", 51);
        }
      }));
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (AbsencesPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/AbsencesPage.xaml");
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
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        BindingExtension bindingExtension1 = new BindingExtension();
        StaticResourceExtension resourceExtension4 = new StaticResourceExtension();
        ControlTemplate controlTemplate1 = new ControlTemplate();
        TabViewHeaderItem tabViewHeaderItem1 = new TabViewHeaderItem();
        BindingExtension bindingExtension2 = new BindingExtension();
        EmptyView emptyView1 = new EmptyView();
        StaticResourceExtension resourceExtension5 = new StaticResourceExtension();
        BindingExtension bindingExtension3 = new BindingExtension();
        BindingExtension bindingExtension4 = new BindingExtension();
        DataTemplate dataTemplate1 = new DataTemplate();
        ListView listView1 = new ListView((ListViewCachingStrategy) 1);
        Grid grid1 = new Grid();
        TabViewItem tabViewItem1 = new TabViewItem();
        StaticResourceExtension resourceExtension6 = new StaticResourceExtension();
        ControlTemplate controlTemplate2 = new ControlTemplate();
        TabViewHeaderItem tabViewHeaderItem2 = new TabViewHeaderItem();
        BindingExtension bindingExtension5 = new BindingExtension();
        EmptyView emptyView2 = new EmptyView();
        StaticResourceExtension resourceExtension7 = new StaticResourceExtension();
        BindingExtension bindingExtension6 = new BindingExtension();
        BindingExtension bindingExtension7 = new BindingExtension();
        DataTemplate dataTemplate2 = new DataTemplate();
        ListView listView2 = new ListView((ListViewCachingStrategy) 1);
        Grid grid2 = new Grid();
        TabViewItem tabViewItem2 = new TabViewItem();
        StaticResourceExtension resourceExtension8 = new StaticResourceExtension();
        ControlTemplate controlTemplate3 = new ControlTemplate();
        TabViewHeaderItem tabViewHeaderItem3 = new TabViewHeaderItem();
        BindingExtension bindingExtension8 = new BindingExtension();
        EmptyView emptyView3 = new EmptyView();
        StaticResourceExtension resourceExtension9 = new StaticResourceExtension();
        BindingExtension bindingExtension9 = new BindingExtension();
        BindingExtension bindingExtension10 = new BindingExtension();
        DataTemplate dataTemplate3 = new DataTemplate();
        ListView listView3 = new ListView();
        Grid grid3 = new Grid();
        TabViewItem tabViewItem3 = new TabViewItem();
        TabbedControl tabbedControl = new TabbedControl();
        StaticResourceExtension resourceExtension10 = new StaticResourceExtension();
        BindingExtension bindingExtension11 = new BindingExtension();
        StaticResourceExtension resourceExtension11 = new StaticResourceExtension();
        CircleImage circleImage = new CircleImage();
        BindingExtension bindingExtension12 = new BindingExtension();
        BindingExtension bindingExtension13 = new BindingExtension();
        ActivityIndicator activityIndicator = new ActivityIndicator();
        Grid grid4 = new Grid();
        Grid grid5 = new Grid();
        AbsencesPage absencesPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (absencesPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) absencesPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("Page", (object) absencesPage);
        if (((Element) absencesPage).get_StyleId() == null)
          ((Element) absencesPage).set_StyleId("Page");
        ((INameScope) nameScope).RegisterName("tabControl", (object) tabbedControl);
        if (((Element) tabbedControl).get_StyleId() == null)
          ((Element) tabbedControl).set_StyleId("tabControl");
        this.Page = (MvxContentPage<AbsencesViewModel>) absencesPage;
        this.tabControl = tabbedControl;
        translateExtension1.Text = "Absences_Page_Title";
        TranslateExtension translateExtension2 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) absencesPage;
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
        namespaceResolver1.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(17, 5)));
        object obj2 = ((IMarkupExtension) translateExtension2).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Xamarin.Forms.Page) absencesPage).set_Title((string) obj2);
        ((BindableObject) absencesPage).SetValue((BindableProperty) Xamarin.Forms.PlatformConfiguration.iOSSpecific.Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("MenuHeaderBackgroundColor");
        StaticResourceExtension resourceExtension12 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 1];
        objArray2[0] = (object) absencesPage;
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
        namespaceResolver2.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(20, 5)));
        object obj4 = ((IMarkupExtension) resourceExtension12).ProvideValue((IServiceProvider) xamlServiceProvider2);
        ((VisualElement) absencesPage).set_BackgroundColor((Color) obj4);
        resourceExtension2.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension13 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 2];
        objArray3[0] = (object) grid5;
        objArray3[1] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
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
        namespaceResolver3.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(25, 11)));
        object obj6 = ((IMarkupExtension) resourceExtension13).ProvideValue((IServiceProvider) xamlServiceProvider3);
        ((VisualElement) grid5).set_BackgroundColor((Color) obj6);
        tabbedControl.set_HeaderPosition((TabViewHeaderPosition) 1);
        resourceExtension3.set_Key("NegateBooleanConverter");
        StaticResourceExtension resourceExtension14 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 4];
        objArray4[0] = (object) bindingExtension1;
        objArray4[1] = (object) tabbedControl;
        objArray4[2] = (object) grid5;
        objArray4[3] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) typeof (BindingExtension).GetRuntimeProperty("Converter"), (INameScope) nameScope));
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
        namespaceResolver4.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(29, 13)));
        object obj8 = ((IMarkupExtension) resourceExtension14).ProvideValue((IServiceProvider) xamlServiceProvider4);
        bindingExtension1.set_Converter((IValueConverter) obj8);
        bindingExtension1.set_Path("IsLoading");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) tabbedControl).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase1);
        resourceExtension4.set_Key("MenuHeaderBackgroundColor");
        StaticResourceExtension resourceExtension15 = resourceExtension4;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 5];
        objArray5[0] = (object) tabViewHeaderItem1;
        objArray5[1] = (object) tabViewItem1;
        objArray5[2] = (object) tabbedControl;
        objArray5[3] = (object) grid5;
        objArray5[4] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray5, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
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
        namespaceResolver5.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(32, 58)));
        object obj10 = ((IMarkupExtension) resourceExtension15).ProvideValue((IServiceProvider) xamlServiceProvider5);
        ((VisualElement) tabViewHeaderItem1).set_BackgroundColor((Color) obj10);
        ControlTemplate controlTemplate4 = controlTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_0 xamlCdataTemplate0 = new AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_0();
        object[] objArray6 = new object[0 + 6];
        objArray6[0] = (object) controlTemplate1;
        objArray6[1] = (object) tabViewHeaderItem1;
        objArray6[2] = (object) tabViewItem1;
        objArray6[3] = (object) tabbedControl;
        objArray6[4] = (object) grid5;
        objArray6[5] = (object) absencesPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate0.parentValues = objArray6;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate0.root = absencesPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func1 = new Func<object>(xamlCdataTemplate0.LoadDataTemplate);
        ((IDataTemplate) controlTemplate4).set_LoadTemplate(func1);
        ((BindableObject) tabViewHeaderItem1).SetValue((BindableProperty) TemplatedView.ControlTemplateProperty, (object) controlTemplate1);
        ((BindableObject) tabViewItem1).SetValue((BindableProperty) TabViewItem.HeaderProperty, (object) tabViewHeaderItem1);
        bindingExtension2.set_Path("AbsencesToJustify.Count");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView1).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase2);
        ((ICollection<View>) grid1.get_Children()).Add((View) emptyView1);
        resourceExtension5.set_Key("ListViewGroupHeaderTemplate");
        StaticResourceExtension resourceExtension16 = resourceExtension5;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray7 = new object[0 + 6];
        objArray7[0] = (object) listView1;
        objArray7[1] = (object) grid1;
        objArray7[2] = (object) tabViewItem1;
        objArray7[3] = (object) tabbedControl;
        objArray7[4] = (object) grid5;
        objArray7[5] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider6;
        object obj11 = (object) (valueTargetProvider6 = new SimpleValueTargetProvider(objArray7, (object) ListView.GroupHeaderTemplateProperty, (INameScope) nameScope));
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
        namespaceResolver6.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver6.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(99, 29)));
        object obj12 = ((IMarkupExtension) resourceExtension16).ProvideValue((IServiceProvider) xamlServiceProvider6);
        listView1.set_GroupHeaderTemplate((DataTemplate) obj12);
        ((BindableObject) listView1).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView1).SetValue((BindableProperty) ListView.IsGroupingEnabledProperty, (object) true);
        bindingExtension3.set_Path("AbsencesToJustify");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView1).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase3);
        bindingExtension4.set_Mode((BindingMode) 1);
        bindingExtension4.set_Path("SelectedItem");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView1).SetBinding((BindableProperty) ListView.SelectedItemProperty, bindingBase4);
        DataTemplate dataTemplate4 = dataTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_1 xamlCdataTemplate1 = new AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_1();
        object[] objArray8 = new object[0 + 7];
        objArray8[0] = (object) dataTemplate1;
        objArray8[1] = (object) listView1;
        objArray8[2] = (object) grid1;
        objArray8[3] = (object) tabViewItem1;
        objArray8[4] = (object) tabbedControl;
        objArray8[5] = (object) grid5;
        objArray8[6] = (object) absencesPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate1.parentValues = objArray8;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate1.root = absencesPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func2 = new Func<object>(xamlCdataTemplate1.LoadDataTemplate);
        ((IDataTemplate) dataTemplate4).set_LoadTemplate(func2);
        ((BindableObject) listView1).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) grid1.get_Children()).Add((View) listView1);
        ((BindableObject) tabViewItem1).SetValue((BindableProperty) TabViewItem.ContentProperty, (object) grid1);
        ((Collection<TabViewItem>) tabbedControl.get_Items()).Add(tabViewItem1);
        resourceExtension6.set_Key("MenuHeaderBackgroundColor");
        StaticResourceExtension resourceExtension17 = resourceExtension6;
        XamlServiceProvider xamlServiceProvider7 = new XamlServiceProvider();
        Type type13 = typeof (IProvideValueTarget);
        object[] objArray9 = new object[0 + 5];
        objArray9[0] = (object) tabViewHeaderItem2;
        objArray9[1] = (object) tabViewItem2;
        objArray9[2] = (object) tabbedControl;
        objArray9[3] = (object) grid5;
        objArray9[4] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider7;
        object obj13 = (object) (valueTargetProvider7 = new SimpleValueTargetProvider(objArray9, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
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
        namespaceResolver7.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver7.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver7 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver7, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider7.Add(type14, (object) xamlTypeResolver7);
        xamlServiceProvider7.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(155, 58)));
        object obj14 = ((IMarkupExtension) resourceExtension17).ProvideValue((IServiceProvider) xamlServiceProvider7);
        ((VisualElement) tabViewHeaderItem2).set_BackgroundColor((Color) obj14);
        ControlTemplate controlTemplate5 = controlTemplate2;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_2 xamlCdataTemplate2 = new AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_2();
        object[] objArray10 = new object[0 + 6];
        objArray10[0] = (object) controlTemplate2;
        objArray10[1] = (object) tabViewHeaderItem2;
        objArray10[2] = (object) tabViewItem2;
        objArray10[3] = (object) tabbedControl;
        objArray10[4] = (object) grid5;
        objArray10[5] = (object) absencesPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate2.parentValues = objArray10;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate2.root = absencesPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func3 = new Func<object>(xamlCdataTemplate2.LoadDataTemplate);
        ((IDataTemplate) controlTemplate5).set_LoadTemplate(func3);
        ((BindableObject) tabViewHeaderItem2).SetValue((BindableProperty) TemplatedView.ControlTemplateProperty, (object) controlTemplate2);
        ((BindableObject) tabViewItem2).SetValue((BindableProperty) TabViewItem.HeaderProperty, (object) tabViewHeaderItem2);
        bindingExtension5.set_Path("AbsencesUnjustified.Count");
        BindingBase bindingBase5 = ((IMarkupExtension<BindingBase>) bindingExtension5).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView2).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase5);
        ((ICollection<View>) grid2.get_Children()).Add((View) emptyView2);
        resourceExtension7.set_Key("ListViewGroupHeaderTemplate");
        StaticResourceExtension resourceExtension18 = resourceExtension7;
        XamlServiceProvider xamlServiceProvider8 = new XamlServiceProvider();
        Type type15 = typeof (IProvideValueTarget);
        object[] objArray11 = new object[0 + 6];
        objArray11[0] = (object) listView2;
        objArray11[1] = (object) grid2;
        objArray11[2] = (object) tabViewItem2;
        objArray11[3] = (object) tabbedControl;
        objArray11[4] = (object) grid5;
        objArray11[5] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider8;
        object obj15 = (object) (valueTargetProvider8 = new SimpleValueTargetProvider(objArray11, (object) ListView.GroupHeaderTemplateProperty, (INameScope) nameScope));
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
        namespaceResolver8.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver8.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver8 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver8, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider8.Add(type16, (object) xamlTypeResolver8);
        xamlServiceProvider8.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(222, 29)));
        object obj16 = ((IMarkupExtension) resourceExtension18).ProvideValue((IServiceProvider) xamlServiceProvider8);
        listView2.set_GroupHeaderTemplate((DataTemplate) obj16);
        ((BindableObject) listView2).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView2).SetValue((BindableProperty) ListView.IsGroupingEnabledProperty, (object) true);
        bindingExtension6.set_Path("AbsencesUnjustified");
        BindingBase bindingBase6 = ((IMarkupExtension<BindingBase>) bindingExtension6).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView2).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase6);
        bindingExtension7.set_Mode((BindingMode) 1);
        bindingExtension7.set_Path("SelectedItem");
        BindingBase bindingBase7 = ((IMarkupExtension<BindingBase>) bindingExtension7).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView2).SetBinding((BindableProperty) ListView.SelectedItemProperty, bindingBase7);
        DataTemplate dataTemplate5 = dataTemplate2;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_3 xamlCdataTemplate3 = new AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_3();
        object[] objArray12 = new object[0 + 7];
        objArray12[0] = (object) dataTemplate2;
        objArray12[1] = (object) listView2;
        objArray12[2] = (object) grid2;
        objArray12[3] = (object) tabViewItem2;
        objArray12[4] = (object) tabbedControl;
        objArray12[5] = (object) grid5;
        objArray12[6] = (object) absencesPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate3.parentValues = objArray12;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate3.root = absencesPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func4 = new Func<object>(xamlCdataTemplate3.LoadDataTemplate);
        ((IDataTemplate) dataTemplate5).set_LoadTemplate(func4);
        ((BindableObject) listView2).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate2);
        ((ICollection<View>) grid2.get_Children()).Add((View) listView2);
        ((BindableObject) tabViewItem2).SetValue((BindableProperty) TabViewItem.ContentProperty, (object) grid2);
        ((Collection<TabViewItem>) tabbedControl.get_Items()).Add(tabViewItem2);
        resourceExtension8.set_Key("MenuHeaderBackgroundColor");
        StaticResourceExtension resourceExtension19 = resourceExtension8;
        XamlServiceProvider xamlServiceProvider9 = new XamlServiceProvider();
        Type type17 = typeof (IProvideValueTarget);
        object[] objArray13 = new object[0 + 5];
        objArray13[0] = (object) tabViewHeaderItem3;
        objArray13[1] = (object) tabViewItem3;
        objArray13[2] = (object) tabbedControl;
        objArray13[3] = (object) grid5;
        objArray13[4] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider9;
        object obj17 = (object) (valueTargetProvider9 = new SimpleValueTargetProvider(objArray13, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider9.Add(type17, (object) valueTargetProvider9);
        xamlServiceProvider9.Add(typeof (IReferenceProvider), obj17);
        Type type18 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver9 = new XmlNamespaceResolver();
        namespaceResolver9.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver9.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver9.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver9.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver9.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver9.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver9.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver9.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver9.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver9.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver9.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver9.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver9 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver9, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider9.Add(type18, (object) xamlTypeResolver9);
        xamlServiceProvider9.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(278, 58)));
        object obj18 = ((IMarkupExtension) resourceExtension19).ProvideValue((IServiceProvider) xamlServiceProvider9);
        ((VisualElement) tabViewHeaderItem3).set_BackgroundColor((Color) obj18);
        ControlTemplate controlTemplate6 = controlTemplate3;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_4 xamlCdataTemplate4 = new AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_4();
        object[] objArray14 = new object[0 + 6];
        objArray14[0] = (object) controlTemplate3;
        objArray14[1] = (object) tabViewHeaderItem3;
        objArray14[2] = (object) tabViewItem3;
        objArray14[3] = (object) tabbedControl;
        objArray14[4] = (object) grid5;
        objArray14[5] = (object) absencesPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate4.parentValues = objArray14;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate4.root = absencesPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func5 = new Func<object>(xamlCdataTemplate4.LoadDataTemplate);
        ((IDataTemplate) controlTemplate6).set_LoadTemplate(func5);
        ((BindableObject) tabViewHeaderItem3).SetValue((BindableProperty) TemplatedView.ControlTemplateProperty, (object) controlTemplate3);
        ((BindableObject) tabViewItem3).SetValue((BindableProperty) TabViewItem.HeaderProperty, (object) tabViewHeaderItem3);
        bindingExtension8.set_Path("AbsencesJustified.Count");
        BindingBase bindingBase8 = ((IMarkupExtension<BindingBase>) bindingExtension8).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView3).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase8);
        ((ICollection<View>) grid3.get_Children()).Add((View) emptyView3);
        resourceExtension9.set_Key("ListViewGroupHeaderTemplate");
        StaticResourceExtension resourceExtension20 = resourceExtension9;
        XamlServiceProvider xamlServiceProvider10 = new XamlServiceProvider();
        Type type19 = typeof (IProvideValueTarget);
        object[] objArray15 = new object[0 + 6];
        objArray15[0] = (object) listView3;
        objArray15[1] = (object) grid3;
        objArray15[2] = (object) tabViewItem3;
        objArray15[3] = (object) tabbedControl;
        objArray15[4] = (object) grid5;
        objArray15[5] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider10;
        object obj19 = (object) (valueTargetProvider10 = new SimpleValueTargetProvider(objArray15, (object) ListView.GroupHeaderTemplateProperty, (INameScope) nameScope));
        xamlServiceProvider10.Add(type19, (object) valueTargetProvider10);
        xamlServiceProvider10.Add(typeof (IReferenceProvider), obj19);
        Type type20 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver10 = new XmlNamespaceResolver();
        namespaceResolver10.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver10.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver10.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver10.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver10.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver10.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver10.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver10.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver10.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver10.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver10.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver10.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver10 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver10, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider10.Add(type20, (object) xamlTypeResolver10);
        xamlServiceProvider10.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(344, 29)));
        object obj20 = ((IMarkupExtension) resourceExtension20).ProvideValue((IServiceProvider) xamlServiceProvider10);
        listView3.set_GroupHeaderTemplate((DataTemplate) obj20);
        ((BindableObject) listView3).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView3).SetValue((BindableProperty) ListView.IsGroupingEnabledProperty, (object) true);
        bindingExtension9.set_Path("AbsencesJustified");
        BindingBase bindingBase9 = ((IMarkupExtension<BindingBase>) bindingExtension9).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView3).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase9);
        bindingExtension10.set_Mode((BindingMode) 1);
        bindingExtension10.set_Path("SelectedItem");
        BindingBase bindingBase10 = ((IMarkupExtension<BindingBase>) bindingExtension10).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView3).SetBinding((BindableProperty) ListView.SelectedItemProperty, bindingBase10);
        DataTemplate dataTemplate6 = dataTemplate3;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_5 xamlCdataTemplate5 = new AbsencesPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_5();
        object[] objArray16 = new object[0 + 7];
        objArray16[0] = (object) dataTemplate3;
        objArray16[1] = (object) listView3;
        objArray16[2] = (object) grid3;
        objArray16[3] = (object) tabViewItem3;
        objArray16[4] = (object) tabbedControl;
        objArray16[5] = (object) grid5;
        objArray16[6] = (object) absencesPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate5.parentValues = objArray16;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate5.root = absencesPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func6 = new Func<object>(xamlCdataTemplate5.LoadDataTemplate);
        ((IDataTemplate) dataTemplate6).set_LoadTemplate(func6);
        ((BindableObject) listView3).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate3);
        ((ICollection<View>) grid3.get_Children()).Add((View) listView3);
        ((BindableObject) tabViewItem3).SetValue((BindableProperty) TabViewItem.ContentProperty, (object) grid3);
        ((Collection<TabViewItem>) tabbedControl.get_Items()).Add(tabViewItem3);
        ((ICollection<View>) grid5.get_Children()).Add((View) tabbedControl);
        resourceExtension10.set_Key("OverlayColor");
        StaticResourceExtension resourceExtension21 = resourceExtension10;
        XamlServiceProvider xamlServiceProvider11 = new XamlServiceProvider();
        Type type21 = typeof (IProvideValueTarget);
        object[] objArray17 = new object[0 + 3];
        objArray17[0] = (object) grid4;
        objArray17[1] = (object) grid5;
        objArray17[2] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider11;
        object obj21 = (object) (valueTargetProvider11 = new SimpleValueTargetProvider(objArray17, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider11.Add(type21, (object) valueTargetProvider11);
        xamlServiceProvider11.Add(typeof (IReferenceProvider), obj21);
        Type type22 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver11 = new XmlNamespaceResolver();
        namespaceResolver11.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver11.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver11.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver11.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver11.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver11.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver11.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver11.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver11.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver11.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver11.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver11.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver11 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver11, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider11.Add(type22, (object) xamlTypeResolver11);
        xamlServiceProvider11.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(399, 15)));
        object obj22 = ((IMarkupExtension) resourceExtension21).ProvideValue((IServiceProvider) xamlServiceProvider11);
        ((VisualElement) grid4).set_BackgroundColor((Color) obj22);
        bindingExtension11.set_Path("IsLoading");
        BindingBase bindingBase11 = ((IMarkupExtension<BindingBase>) bindingExtension11).ProvideValue((IServiceProvider) null);
        ((BindableObject) grid4).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase11);
        ((BindableObject) circleImage).SetValue((BindableProperty) CircleImage.FillColorProperty, (object) (Color) Color.White);
        resourceExtension11.set_Key("ListItemIconStyle");
        StaticResourceExtension resourceExtension22 = resourceExtension11;
        XamlServiceProvider xamlServiceProvider12 = new XamlServiceProvider();
        Type type23 = typeof (IProvideValueTarget);
        object[] objArray18 = new object[0 + 4];
        objArray18[0] = (object) circleImage;
        objArray18[1] = (object) grid4;
        objArray18[2] = (object) grid5;
        objArray18[3] = (object) absencesPage;
        SimpleValueTargetProvider valueTargetProvider12;
        object obj23 = (object) (valueTargetProvider12 = new SimpleValueTargetProvider(objArray18, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider12.Add(type23, (object) valueTargetProvider12);
        xamlServiceProvider12.Add(typeof (IReferenceProvider), obj23);
        Type type24 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver12 = new XmlNamespaceResolver();
        namespaceResolver12.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver12.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver12.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver12.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver12.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver12.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver12.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver12.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver12.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver12.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver12.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver12.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver12 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver12, typeof (AbsencesPage).GetTypeInfo().Assembly);
        xamlServiceProvider12.Add(type24, (object) xamlTypeResolver12);
        xamlServiceProvider12.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(400, 56)));
        object obj24 = ((IMarkupExtension) resourceExtension22).ProvideValue((IServiceProvider) xamlServiceProvider12);
        ((NavigableElement) circleImage).set_Style((Style) obj24);
        ((ICollection<View>) grid4.get_Children()).Add((View) circleImage);
        bindingExtension12.set_Path("IsLoading");
        BindingBase bindingBase12 = ((IMarkupExtension<BindingBase>) bindingExtension12).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) ActivityIndicator.IsRunningProperty, bindingBase12);
        bindingExtension13.set_Path("IsLoading");
        BindingBase bindingBase13 = ((IMarkupExtension<BindingBase>) bindingExtension13).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase13);
        ((ICollection<View>) grid4.get_Children()).Add((View) activityIndicator);
        ((ICollection<View>) grid5.get_Children()).Add((View) grid4);
        ((BindableObject) absencesPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid5);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<AbsencesPage>((M0) this, typeof (AbsencesPage));
      this.Page = (MvxContentPage<AbsencesViewModel>) NameScopeExtensions.FindByName<MvxContentPage<AbsencesViewModel>>((Element) this, "Page");
      this.tabControl = (TabbedControl) NameScopeExtensions.FindByName<TabbedControl>((Element) this, "tabControl");
    }
  }
}
