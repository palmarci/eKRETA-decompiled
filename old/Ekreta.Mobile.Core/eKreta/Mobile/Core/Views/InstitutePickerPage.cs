// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.InstitutePickerPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.ViewModels;
using FFImageLoading.Forms;
using MvvmCross.Commands;
using MvvmCross.Forms.Presenters.Attributes;
using MvvmCross.Forms.Views;
using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Reflection;
using System.Threading.Tasks;
using System.Xml;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.PlatformConfiguration;
using Xamarin.Forms.PlatformConfiguration.iOSSpecific;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [MvxModalPresentation(WrapInNavigationPage = false)]
  [XamlFilePath("Views/InstitutePickerPage.xaml")]
  [XamlCompilation]
  public class InstitutePickerPage : MvxContentPage<InstitutePickerViewModel>
  {
    private const int DefaultInputWaitTimeInMilliseconds = 200;
    private int _waitMs;
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private Grid MainGrid;
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private SearchBarControl SearchBar;

    public InstitutePickerPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    protected virtual void OnAppearing()
    {
      Thickness thickness = Page.SafeAreaInsets((IPlatformElementConfiguration<iOS, Page>) ((Page) this).On<iOS>());
      ((Layout) this.MainGrid).set_Padding(new Thickness(0.0, 0.0, 0.0, ((Thickness) ref thickness).get_Bottom()));
      ((View) this.SearchBar).set_Margin(new Thickness(0.0, ((Thickness) ref thickness).get_Top(), 0.0, 0.0));
      this.SearchBar.add_TextChanged(new EventHandler<TextChangedEventArgs>(this.SearchBar_TextChanged));
      Task.Run((Func<Task>) (async () => await this.get_ViewModel().RefreshCommand.ExecuteAsync((object) null)));
    }

    protected virtual void OnDisappearing()
    {
      ((MvxContentPage) this).OnDisappearing();
      this.SearchBar.remove_TextChanged(new EventHandler<TextChangedEventArgs>(this.SearchBar_TextChanged));
    }

    private async void SearchBar_TextChanged(object sender, TextChangedEventArgs e)
    {
      InstitutePickerPage institutePickerPage = this;
      if (institutePickerPage._waitMs > 0)
      {
        institutePickerPage._waitMs = 200;
      }
      else
      {
        for (institutePickerPage._waitMs = 200; institutePickerPage._waitMs > 0; --institutePickerPage._waitMs)
          await Task.Delay(1);
        ((MvxAsyncCommandBase) institutePickerPage.get_ViewModel().SearchCommand).Execute();
      }
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (InstitutePickerPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/InstitutePickerPage.xaml");
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
        OnPlatform<bool> onPlatform = new OnPlatform<bool>();
        BoxView boxView = new BoxView();
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        TranslateExtension translateExtension2 = new TranslateExtension();
        BindingExtension bindingExtension1 = new BindingExtension();
        SearchBarControl searchBarControl = new SearchBarControl();
        StaticResourceExtension resourceExtension4 = new StaticResourceExtension();
        BindingExtension bindingExtension2 = new BindingExtension();
        Setter setter1 = new Setter();
        DataTrigger dataTrigger1 = new DataTrigger(typeof (Frame));
        CachedImage cachedImage = new CachedImage();
        StaticResourceExtension resourceExtension5 = new StaticResourceExtension();
        TranslateExtension translateExtension3 = new TranslateExtension();
        Label label1 = new Label();
        StaticResourceExtension resourceExtension6 = new StaticResourceExtension();
        TranslateExtension translateExtension4 = new TranslateExtension();
        Label label2 = new Label();
        StackLayout stackLayout = new StackLayout();
        Frame frame = new Frame();
        BindingExtension bindingExtension3 = new BindingExtension();
        BindingExtension bindingExtension4 = new BindingExtension();
        BindingExtension bindingExtension5 = new BindingExtension();
        BindingExtension bindingExtension6 = new BindingExtension();
        DataTemplate dataTemplate1 = new DataTemplate();
        ListView listView = new ListView((ListViewCachingStrategy) 1);
        BindingExtension bindingExtension7 = new BindingExtension();
        TranslateExtension translateExtension5 = new TranslateExtension();
        StaticResourceExtension resourceExtension7 = new StaticResourceExtension();
        BindingExtension bindingExtension8 = new BindingExtension();
        Setter setter2 = new Setter();
        DataTrigger dataTrigger2 = new DataTrigger(typeof (Button));
        Button button1 = new Button();
        Grid grid = new Grid();
        InstitutePickerPage institutePickerPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (institutePickerPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) institutePickerPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("MainGrid", (object) grid);
        if (((Element) grid).get_StyleId() == null)
          ((Element) grid).set_StyleId("MainGrid");
        ((INameScope) nameScope).RegisterName("SearchBar", (object) searchBarControl);
        if (((Element) searchBarControl).get_StyleId() == null)
          ((Element) searchBarControl).set_StyleId("SearchBar");
        this.MainGrid = grid;
        this.SearchBar = searchBarControl;
        translateExtension1.Text = "Page_Institutes_Title";
        TranslateExtension translateExtension6 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) institutePickerPage;
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
        namespaceResolver1.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver1.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(14, 5)));
        object obj2 = ((IMarkupExtension) translateExtension6).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Page) institutePickerPage).set_Title((string) obj2);
        resourceExtension1.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension8 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 1];
        objArray2[0] = (object) institutePickerPage;
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
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver2.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(16, 5)));
        object obj4 = ((IMarkupExtension) resourceExtension8).ProvideValue((IServiceProvider) xamlServiceProvider2);
        ((VisualElement) institutePickerPage).set_BackgroundColor((Color) obj4);
        ((BindableObject) rowDefinition1).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("Auto"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition1);
        ((BindableObject) rowDefinition2).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("*"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition2);
        ((BindableObject) boxView).SetValue((BindableProperty) Grid.RowProperty, (object) 0);
        resourceExtension2.set_Key("AccentColor");
        StaticResourceExtension resourceExtension9 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 3];
        objArray3[0] = (object) boxView;
        objArray3[1] = (object) grid;
        objArray3[2] = (object) institutePickerPage;
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
        namespaceResolver3.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver3.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver3.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(26, 31)));
        object obj6 = ((IMarkupExtension) resourceExtension9).ProvideValue((IServiceProvider) xamlServiceProvider3);
        ((VisualElement) boxView).set_BackgroundColor((Color) obj6);
        onPlatform.set_Default(false);
        onPlatform.set_iOS(true);
        ((BindableObject) boxView).SetValue((BindableProperty) VisualElement.IsVisibleProperty, (object) OnPlatform<bool>.op_Implicit(onPlatform));
        ((ICollection<View>) grid.get_Children()).Add((View) boxView);
        resourceExtension3.set_Key("AccentColor");
        StaticResourceExtension resourceExtension10 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 3];
        objArray4[0] = (object) searchBarControl;
        objArray4[1] = (object) grid;
        objArray4[2] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
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
        namespaceResolver4.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver4.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver4.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(36, 13)));
        object obj8 = ((IMarkupExtension) resourceExtension10).ProvideValue((IServiceProvider) xamlServiceProvider4);
        ((VisualElement) searchBarControl).set_BackgroundColor((Color) obj8);
        ((BindableObject) searchBarControl).SetValue((BindableProperty) Xamarin.Forms.SearchBar.CancelButtonColorProperty, (object) (Color) Color.White);
        translateExtension2.Text = "InstitutePickerPage_SearchBar_Placeholder";
        TranslateExtension translateExtension7 = translateExtension2;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 3];
        objArray5[0] = (object) searchBarControl;
        objArray5[1] = (object) grid;
        objArray5[2] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray5, (object) Xamarin.Forms.SearchBar.PlaceholderProperty, (INameScope) nameScope));
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
        namespaceResolver5.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver5.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver5.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(38, 13)));
        object obj10 = ((IMarkupExtension) translateExtension7).ProvideValue((IServiceProvider) xamlServiceProvider5);
        searchBarControl.set_Placeholder((string) obj10);
        bindingExtension1.set_Mode((BindingMode) 1);
        bindingExtension1.set_Path("SearchText");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        ((BindableObject) searchBarControl).SetBinding((BindableProperty) Xamarin.Forms.SearchBar.TextProperty, bindingBase1);
        ((ICollection<View>) grid.get_Children()).Add((View) searchBarControl);
        ((BindableObject) frame).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        ((BindableObject) frame).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(12.0));
        resourceExtension4.set_Key("AccentContrastColor");
        StaticResourceExtension resourceExtension11 = resourceExtension4;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 3];
        objArray6[0] = (object) frame;
        objArray6[1] = (object) grid;
        objArray6[2] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider6;
        object obj11 = (object) (valueTargetProvider6 = new SimpleValueTargetProvider(objArray6, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
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
        namespaceResolver6.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver6.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver6.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver6.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(43, 13)));
        object obj12 = ((IMarkupExtension) resourceExtension11).ProvideValue((IServiceProvider) xamlServiceProvider6);
        ((VisualElement) frame).set_BackgroundColor((Color) obj12);
        ((BindableObject) frame).SetValue((BindableProperty) Frame.HasShadowProperty, (object) false);
        ((BindableObject) frame).SetValue((BindableProperty) VisualElement.IsVisibleProperty, new VisualElement.VisibilityConverter().ConvertFromInvariantString("False"));
        ((BindableObject) frame).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.FillAndExpand);
        bindingExtension2.set_Path("Institutes.Count");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        dataTrigger1.set_Binding(bindingBase2);
        dataTrigger1.set_Value((object) "0");
        setter1.set_Property((BindableProperty) VisualElement.IsVisibleProperty);
        setter1.set_Value((object) "True");
        setter1.set_Value(new VisualElement.VisibilityConverter().ConvertFromInvariantString("True"));
        ((ICollection<Setter>) dataTrigger1.get_Setters()).Add(setter1);
        ((ICollection<TriggerBase>) ((BindableObject) frame).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger1);
        ((BindableObject) stackLayout).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) stackLayout).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) cachedImage).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(12.0, 32.0));
        ((BindableObject) cachedImage).SetValue((BindableProperty) CachedImage.DownsampleToViewSizeProperty, (object) true);
        ((BindableObject) cachedImage).SetValue((BindableProperty) VisualElement.HeightRequestProperty, (object) 240.0);
        ((BindableObject) cachedImage).SetValue((BindableProperty) CachedImage.SourceProperty, new ImageSourceConverter().ConvertFromInvariantString("resource://Ekreta.Mobile.Core.Images.KretaMan.png?assembly=Ekreta.Mobile.Core"));
        ((BindableObject) cachedImage).SetValue((BindableProperty) VisualElement.WidthRequestProperty, (object) 320.0);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) cachedImage);
        ((BindableObject) label1).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        resourceExtension5.set_Key("ListItemTitleStyle");
        StaticResourceExtension resourceExtension12 = resourceExtension5;
        XamlServiceProvider xamlServiceProvider7 = new XamlServiceProvider();
        Type type13 = typeof (IProvideValueTarget);
        object[] objArray7 = new object[0 + 5];
        objArray7[0] = (object) label1;
        objArray7[1] = (object) stackLayout;
        objArray7[2] = (object) frame;
        objArray7[3] = (object) grid;
        objArray7[4] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider7;
        object obj13 = (object) (valueTargetProvider7 = new SimpleValueTargetProvider(objArray7, (object) VisualElement.StyleProperty, (INameScope) nameScope));
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
        namespaceResolver7.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver7.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver7.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver7.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver7 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver7, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider7.Add(type14, (object) xamlTypeResolver7);
        xamlServiceProvider7.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(64, 21)));
        object obj14 = ((IMarkupExtension) resourceExtension12).ProvideValue((IServiceProvider) xamlServiceProvider7);
        ((NavigableElement) label1).set_Style((Style) obj14);
        translateExtension3.Text = "InstitutePickerPage_ListIsEmpty";
        TranslateExtension translateExtension8 = translateExtension3;
        XamlServiceProvider xamlServiceProvider8 = new XamlServiceProvider();
        Type type15 = typeof (IProvideValueTarget);
        object[] objArray8 = new object[0 + 5];
        objArray8[0] = (object) label1;
        objArray8[1] = (object) stackLayout;
        objArray8[2] = (object) frame;
        objArray8[3] = (object) grid;
        objArray8[4] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider8;
        object obj15 = (object) (valueTargetProvider8 = new SimpleValueTargetProvider(objArray8, (object) Label.TextProperty, (INameScope) nameScope));
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
        namespaceResolver8.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver8.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver8.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver8.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver8 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver8, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider8.Add(type16, (object) xamlTypeResolver8);
        xamlServiceProvider8.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(65, 21)));
        object obj16 = ((IMarkupExtension) translateExtension8).ProvideValue((IServiceProvider) xamlServiceProvider8);
        label1.set_Text((string) obj16);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label1);
        ((BindableObject) label2).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) label2).SetValue((BindableProperty) Label.LineBreakModeProperty, (object) (LineBreakMode) 1);
        resourceExtension6.set_Key("ListItemDescriptionStyle");
        StaticResourceExtension resourceExtension13 = resourceExtension6;
        XamlServiceProvider xamlServiceProvider9 = new XamlServiceProvider();
        Type type17 = typeof (IProvideValueTarget);
        object[] objArray9 = new object[0 + 5];
        objArray9[0] = (object) label2;
        objArray9[1] = (object) stackLayout;
        objArray9[2] = (object) frame;
        objArray9[3] = (object) grid;
        objArray9[4] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider9;
        object obj17 = (object) (valueTargetProvider9 = new SimpleValueTargetProvider(objArray9, (object) VisualElement.StyleProperty, (INameScope) nameScope));
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
        namespaceResolver9.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver9.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver9.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver9.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver9 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver9, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider9.Add(type18, (object) xamlTypeResolver9);
        xamlServiceProvider9.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(69, 21)));
        object obj18 = ((IMarkupExtension) resourceExtension13).ProvideValue((IServiceProvider) xamlServiceProvider9);
        ((NavigableElement) label2).set_Style((Style) obj18);
        translateExtension4.Text = "InstitutePickerPage_NoElement";
        TranslateExtension translateExtension9 = translateExtension4;
        XamlServiceProvider xamlServiceProvider10 = new XamlServiceProvider();
        Type type19 = typeof (IProvideValueTarget);
        object[] objArray10 = new object[0 + 5];
        objArray10[0] = (object) label2;
        objArray10[1] = (object) stackLayout;
        objArray10[2] = (object) frame;
        objArray10[3] = (object) grid;
        objArray10[4] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider10;
        object obj19 = (object) (valueTargetProvider10 = new SimpleValueTargetProvider(objArray10, (object) Label.TextProperty, (INameScope) nameScope));
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
        namespaceResolver10.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver10.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver10.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver10.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver10 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver10, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider10.Add(type20, (object) xamlTypeResolver10);
        xamlServiceProvider10.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(70, 21)));
        object obj20 = ((IMarkupExtension) translateExtension9).ProvideValue((IServiceProvider) xamlServiceProvider10);
        label2.set_Text((string) obj20);
        ((BindableObject) label2).SetValue((BindableProperty) Label.XAlignProperty, new TextAlignmentConverter().ConvertFromInvariantString("Center"));
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label2);
        ((BindableObject) frame).SetValue((BindableProperty) ContentView.ContentProperty, (object) stackLayout);
        ((ICollection<View>) grid.get_Children()).Add((View) frame);
        ((BindableObject) listView).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        ((BindableObject) listView).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(0.0, 10.0, 0.0, 0.0));
        ((BindableObject) listView).SetValue((BindableProperty) ListView.HasUnevenRowsProperty, (object) true);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsGroupingEnabledProperty, (object) false);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.IsPullToRefreshEnabledProperty, (object) true);
        bindingExtension3.set_Path("IsLoading");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.IsRefreshingProperty, bindingBase3);
        bindingExtension4.set_Path("Institutes");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ItemsView<Cell>.ItemsSourceProperty, bindingBase4);
        bindingExtension5.set_Path("RefreshCommand");
        BindingBase bindingBase5 = ((IMarkupExtension<BindingBase>) bindingExtension5).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.RefreshCommandProperty, bindingBase5);
        bindingExtension6.set_Mode((BindingMode) 1);
        bindingExtension6.set_Path("SelectedInstitute");
        BindingBase bindingBase6 = ((IMarkupExtension<BindingBase>) bindingExtension6).ProvideValue((IServiceProvider) null);
        ((BindableObject) listView).SetBinding((BindableProperty) ListView.SelectedItemProperty, bindingBase6);
        ((BindableObject) listView).SetValue((BindableProperty) ListView.SeparatorVisibilityProperty, (object) (SeparatorVisibility) 1);
        DataTemplate dataTemplate2 = dataTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        InstitutePickerPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_23 xamlCdataTemplate23 = new InstitutePickerPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_23();
        object[] objArray11 = new object[0 + 4];
        objArray11[0] = (object) dataTemplate1;
        objArray11[1] = (object) listView;
        objArray11[2] = (object) grid;
        objArray11[3] = (object) institutePickerPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate23.parentValues = objArray11;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate23.root = institutePickerPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func = new Func<object>(xamlCdataTemplate23.LoadDataTemplate);
        ((IDataTemplate) dataTemplate2).set_LoadTemplate(func);
        ((BindableObject) listView).SetValue((BindableProperty) ItemsView<Cell>.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) grid.get_Children()).Add((View) listView);
        ((BindableObject) button1).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        ((BindableObject) button1).SetValue((BindableProperty) View.MarginProperty, (object) new Thickness(0.0, 0.0, 0.0, 24.0));
        ((BindableObject) button1).SetValue((BindableProperty) VisualElement.BackgroundColorProperty, (object) (Color) Color.Transparent);
        bindingExtension7.set_Path("GoBackCommand");
        BindingBase bindingBase7 = ((IMarkupExtension<BindingBase>) bindingExtension7).ProvideValue((IServiceProvider) null);
        ((BindableObject) button1).SetBinding((BindableProperty) Button.CommandProperty, bindingBase7);
        Button button2 = button1;
        // ISSUE: variable of the null type
        __Null fontSizeProperty = Button.FontSizeProperty;
        FontSizeConverter fontSizeConverter = new FontSizeConverter();
        XamlServiceProvider xamlServiceProvider11 = new XamlServiceProvider();
        Type type21 = typeof (IProvideValueTarget);
        object[] objArray12 = new object[0 + 3];
        objArray12[0] = (object) button1;
        objArray12[1] = (object) grid;
        objArray12[2] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider11;
        object obj21 = (object) (valueTargetProvider11 = new SimpleValueTargetProvider(objArray12, (object) Button.FontSizeProperty, (INameScope) nameScope));
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
        namespaceResolver11.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver11.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver11.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver11.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver11 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver11, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider11.Add(type22, (object) xamlTypeResolver11);
        xamlServiceProvider11.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(132, 13)));
        object obj22 = ((IExtendedTypeConverter) fontSizeConverter).ConvertFromInvariantString("Default", (IServiceProvider) xamlServiceProvider11);
        ((BindableObject) button2).SetValue((BindableProperty) fontSizeProperty, obj22);
        ((BindableObject) button1).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) button1).SetValue((BindableProperty) VisualElement.IsVisibleProperty, new VisualElement.VisibilityConverter().ConvertFromInvariantString("False"));
        translateExtension5.Text = "Common_BackButton_Text";
        TranslateExtension translateExtension10 = translateExtension5;
        XamlServiceProvider xamlServiceProvider12 = new XamlServiceProvider();
        Type type23 = typeof (IProvideValueTarget);
        object[] objArray13 = new object[0 + 3];
        objArray13[0] = (object) button1;
        objArray13[1] = (object) grid;
        objArray13[2] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider12;
        object obj23 = (object) (valueTargetProvider12 = new SimpleValueTargetProvider(objArray13, (object) Button.TextProperty, (INameScope) nameScope));
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
        namespaceResolver12.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver12.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver12.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver12.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver12 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver12, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider12.Add(type24, (object) xamlTypeResolver12);
        xamlServiceProvider12.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(135, 13)));
        object obj24 = ((IMarkupExtension) translateExtension10).ProvideValue((IServiceProvider) xamlServiceProvider12);
        button1.set_Text((string) obj24);
        resourceExtension7.set_Key("AccentColor");
        StaticResourceExtension resourceExtension14 = resourceExtension7;
        XamlServiceProvider xamlServiceProvider13 = new XamlServiceProvider();
        Type type25 = typeof (IProvideValueTarget);
        object[] objArray14 = new object[0 + 3];
        objArray14[0] = (object) button1;
        objArray14[1] = (object) grid;
        objArray14[2] = (object) institutePickerPage;
        SimpleValueTargetProvider valueTargetProvider13;
        object obj25 = (object) (valueTargetProvider13 = new SimpleValueTargetProvider(objArray14, (object) Button.TextColorProperty, (INameScope) nameScope));
        xamlServiceProvider13.Add(type25, (object) valueTargetProvider13);
        xamlServiceProvider13.Add(typeof (IReferenceProvider), obj25);
        Type type26 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver13 = new XmlNamespaceResolver();
        namespaceResolver13.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver13.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver13.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver13.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver13.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver13.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver13.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver13.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver13.Add("system", "clr-namespace:System;assembly=netstandard");
        namespaceResolver13.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver13 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver13, typeof (InstitutePickerPage).GetTypeInfo().Assembly);
        xamlServiceProvider13.Add(type26, (object) xamlTypeResolver13);
        xamlServiceProvider13.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(136, 13)));
        object obj26 = ((IMarkupExtension) resourceExtension14).ProvideValue((IServiceProvider) xamlServiceProvider13);
        button1.set_TextColor((Color) obj26);
        ((BindableObject) button1).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.End);
        bindingExtension8.set_Path("Institutes.Count");
        BindingBase bindingBase8 = ((IMarkupExtension<BindingBase>) bindingExtension8).ProvideValue((IServiceProvider) null);
        dataTrigger2.set_Binding(bindingBase8);
        dataTrigger2.set_Value((object) "0");
        setter2.set_Property((BindableProperty) VisualElement.IsVisibleProperty);
        setter2.set_Value((object) "True");
        setter2.set_Value(new VisualElement.VisibilityConverter().ConvertFromInvariantString("True"));
        ((ICollection<Setter>) dataTrigger2.get_Setters()).Add(setter2);
        ((ICollection<TriggerBase>) ((BindableObject) button1).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger2);
        ((ICollection<View>) grid.get_Children()).Add((View) button1);
        ((BindableObject) institutePickerPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<InstitutePickerPage>((M0) this, typeof (InstitutePickerPage));
      this.MainGrid = (Grid) NameScopeExtensions.FindByName<Grid>((Element) this, "MainGrid");
      this.SearchBar = (SearchBarControl) NameScopeExtensions.FindByName<SearchBarControl>((Element) this, "SearchBar");
    }
  }
}
