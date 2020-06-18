// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.ExamsPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
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
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [XamlFilePath("Views/ExamsPage.xaml")]
  [MvxMasterDetailPagePresentation]
  [XamlCompilation]
  public class ExamsPage : MvxContentPage<ExamsViewModel>
  {
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private MvxContentPage<ExamsViewModel> Page;

    public ExamsPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (ExamsPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/ExamsPage.xaml");
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
        RowDefinition rowDefinition1 = new RowDefinition();
        RowDefinition rowDefinition2 = new RowDefinition();
        BindingExtension bindingExtension4 = new BindingExtension();
        EmptyView emptyView = new EmptyView();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        BindingExtension bindingExtension5 = new BindingExtension();
        BindingExtension bindingExtension6 = new BindingExtension();
        BindingExtension bindingExtension7 = new BindingExtension();
        BindingExtension bindingExtension8 = new BindingExtension();
        DataTemplate dataTemplate1 = new DataTemplate();
        ListView listView = new ListView((ListViewCachingStrategy) 1);
        Grid grid = new Grid();
        ExamsPage examsPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (examsPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) examsPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("Page", (object) examsPage);
        if (((Element) examsPage).get_StyleId() == null)
          ((Element) examsPage).set_StyleId("Page");
        this.Page = (MvxContentPage<ExamsViewModel>) examsPage;
        translateExtension1.Text = "Exams_Page_Title";
        TranslateExtension translateExtension5 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) examsPage;
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
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (ExamsPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(15, 5)));
        object obj2 = ((IMarkupExtension) translateExtension5).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Xamarin.Forms.Page) examsPage).set_Title((string) obj2);
        ((BindableObject) examsPage).SetValue((BindableProperty) Xamarin.Forms.PlatformConfiguration.iOSSpecific.Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension3 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 1];
        objArray2[0] = (object) examsPage;
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
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (ExamsPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(18, 5)));
        object obj4 = ((IMarkupExtension) resourceExtension3).ProvideValue((IServiceProvider) xamlServiceProvider2);
        ((VisualElement) examsPage).set_BackgroundColor((Color) obj4);
        bindingExtension1.set_Path("HasInternetConnection");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        dataTrigger1.set_Binding(bindingBase1);
        dataTrigger1.set_Value((object) "True");
        setter1.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension2.Text = "Exams_Page_Title";
        TranslateExtension translateExtension6 = translateExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 3];
        objArray3[0] = (object) setter1;
        objArray3[1] = (object) dataTrigger1;
        objArray3[2] = (object) examsPage;
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
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (ExamsPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(28, 38)));
        object obj6 = ((IMarkupExtension) translateExtension6).ProvideValue((IServiceProvider) xamlServiceProvider3);
        setter1.set_Value(obj6);
        ((ICollection<Setter>) dataTrigger1.get_Setters()).Add(setter1);
        ((ICollection<TriggerBase>) ((BindableObject) examsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger1);
        bindingExtension2.set_Path("HasInternetConnection");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        dataTrigger2.set_Binding(bindingBase2);
        dataTrigger2.set_Value((object) "False");
        setter2.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension3.Text = "Exams_Page_Offline_Title";
        TranslateExtension translateExtension7 = translateExtension3;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 3];
        objArray4[0] = (object) setter2;
        objArray4[1] = (object) dataTrigger2;
        objArray4[2] = (object) examsPage;
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
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (ExamsPage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(34, 38)));
        object obj8 = ((IMarkupExtension) translateExtension7).ProvideValue((IServiceProvider) xamlServiceProvider4);
        setter2.set_Value(obj8);
        ((ICollection<Setter>) dataTrigger2.get_Setters()).Add(setter2);
        ((ICollection<TriggerBase>) ((BindableObject) examsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger2);
        bindingExtension3.set_Path("IsOffline");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        dataTrigger3.set_Binding(bindingBase3);
        dataTrigger3.set_Value((object) "True");
        setter3.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension4.Text = "Exams_Page_Offline_Title";
        TranslateExtension translateExtension8 = translateExtension4;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 3];
        objArray5[0] = (object) setter3;
        objArray5[1] = (object) dataTrigger3;
        objArray5[2] = (object) examsPage;
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
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (ExamsPage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(40, 38)));
        object obj10 = ((IMarkupExtension) translateExtension8).ProvideValue((IServiceProvider) xamlServiceProvider5);
        setter3.set_Value(obj10);
        ((ICollection<Setter>) dataTrigger3.get_Setters()).Add(setter3);
        ((ICollection<TriggerBase>) ((BindableObject) examsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger3);
        ((BindableObject) rowDefinition1).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("*"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition1);
        ((BindableObject) rowDefinition2).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("Auto"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition2);
        bindingExtension4.set_Path("ItemsCount");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase4);
        ((ICollection<View>) grid.get_Children()).Add((View) emptyView);
        resourceExtension2.set_Key("ListViewMonthGroupHeaderTemplate");
        StaticResourceExtension resourceExtension4 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 3];
        objArray6[0] = (object) listView;
        objArray6[1] = (object) grid;
        objArray6[2] = (object) examsPage;
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
        namespaceResolver6.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (ExamsPage).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(51, 13)));
        object obj12 = ((IMarkupExtension) resourceExtension4).ProvideValue((IServiceProvider) xamlServiceProvider6);
        listView.set_GroupHeaderTemplate((DataTemplate) obj12);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsGroupingEnabledProperty, (object) true);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsPullToRefreshEnabledProperty, (object) true);
        bindingExtension5.set_Path("IsLoading");
        BindingBase bindingBase5 = ((IMarkupExtension<BindingBase>) bindingExtension5).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.IsRefreshingProperty, bindingBase5);
        bindingExtension6.set_Path("Items");
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
        ExamsPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_17 xamlCdataTemplate17 = new ExamsPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_17();
        object[] objArray7 = new object[0 + 4];
        objArray7[0] = (object) dataTemplate1;
        objArray7[1] = (object) listView;
        objArray7[2] = (object) grid;
        objArray7[3] = (object) examsPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate17.parentValues = objArray7;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate17.root = examsPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func = new Func<object>(xamlCdataTemplate17.LoadDataTemplate);
        ((IDataTemplate) dataTemplate2).set_LoadTemplate(func);
        ((BindableObject) listView).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) grid.get_Children()).Add((View) listView);
        ((BindableObject) examsPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<ExamsPage>((M0) this, typeof (ExamsPage));
      this.Page = (MvxContentPage<ExamsViewModel>) NameScopeExtensions.FindByName<MvxContentPage<ExamsViewModel>>((Element) this, "Page");
    }
  }
}
