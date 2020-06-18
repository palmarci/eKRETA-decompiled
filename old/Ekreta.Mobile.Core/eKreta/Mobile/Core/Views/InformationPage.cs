// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.InformationPage
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
using Xamarin.Forms.PlatformConfiguration.iOSSpecific;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [XamlFilePath("Views/InformationPage.xaml")]
  [MvxMasterDetailPagePresentation]
  [XamlCompilation]
  public class InformationPage : MvxContentPage<InformationViewModel>
  {
    public InformationPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (InformationPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/InformationPage.xaml");
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
        DataTemplate dataTemplate1 = new DataTemplate();
        ListView listView = new ListView((ListViewCachingStrategy) 1);
        StackLayout stackLayout = new StackLayout();
        TranslateExtension translateExtension2 = new TranslateExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        EmptyView emptyView = new EmptyView();
        Grid grid = new Grid();
        InformationPage informationPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (informationPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) informationPage, (INameScope) nameScope);
        translateExtension1.Text = "Information_Page_Title";
        TranslateExtension translateExtension3 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) informationPage;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) Page.TitleProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver1.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("iOsSpecific", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (InformationPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(13, 5)));
        object obj2 = ((IMarkupExtension) translateExtension3).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Page) informationPage).set_Title((string) obj2);
        ((BindableObject) informationPage).SetValue((BindableProperty) Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("ListViewMonthGroupHeaderTemplate");
        StaticResourceExtension resourceExtension2 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 4];
        objArray2[0] = (object) listView;
        objArray2[1] = (object) stackLayout;
        objArray2[2] = (object) grid;
        objArray2[3] = (object) informationPage;
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
        namespaceResolver2.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("iOsSpecific", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (InformationPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(25, 21)));
        object obj4 = ((IMarkupExtension) resourceExtension2).ProvideValue((IServiceProvider) xamlServiceProvider2);
        listView.set_GroupHeaderTemplate((DataTemplate) obj4);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        bindingExtension1.set_Path("Informations");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase1);
        ((BindableObject) listView).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        DataTemplate dataTemplate2 = dataTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        InformationPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_22 xamlCdataTemplate22 = new InformationPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_22();
        object[] objArray3 = new object[0 + 5];
        objArray3[0] = (object) dataTemplate1;
        objArray3[1] = (object) listView;
        objArray3[2] = (object) stackLayout;
        objArray3[3] = (object) grid;
        objArray3[4] = (object) informationPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate22.parentValues = objArray3;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate22.root = informationPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func = new Func<object>(xamlCdataTemplate22.LoadDataTemplate);
        ((IDataTemplate) dataTemplate2).set_LoadTemplate(func);
        ((BindableObject) listView).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) listView);
        ((ICollection<View>) grid.get_Children()).Add((View) stackLayout);
        translateExtension2.Text = "Information_Page_Empty_List";
        TranslateExtension translateExtension4 = translateExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 3];
        objArray4[0] = (object) emptyView;
        objArray4[1] = (object) grid;
        objArray4[2] = (object) informationPage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray4, (object) EmptyView.TitleProperty, (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver3.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("iOsSpecific", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver3.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("views", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (InformationPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(65, 17)));
        object obj6 = ((IMarkupExtension) translateExtension4).ProvideValue((IServiceProvider) xamlServiceProvider3);
        emptyView.Title = (string) obj6;
        ((BindableObject) emptyView).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(0.0, -12.0, 0.0, 0.0));
        bindingExtension2.set_Path("Informations.Count");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        ((BindableObject) emptyView).SetBinding((BindableProperty) BindableObject.BindingContextProperty, bindingBase2);
        ((BindableObject) emptyView).SetValue(EmptyView.ImageProperty, (object) "resource://Ekreta.Mobile.Core.Images.KretaMan_smile.png?assembly=Ekreta.Mobile.Core");
        ((BindableObject) emptyView).SetValue(EmptyView.IsSubtitleVisibleProperty, (object) false);
        ((ICollection<View>) grid.get_Children()).Add((View) emptyView);
        ((BindableObject) informationPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<InformationPage>((M0) this, typeof (InformationPage));
    }
  }
}
