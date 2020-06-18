// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Views.LessonsPage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Controls;
using Ekreta.Mobile.Core.Converters;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.RealmRepository.Lesson;
using Ekreta.Mobile.Core.ViewModels;
using FFImageLoading.Forms;
using ImageCircle.Forms.Plugin.Abstractions;
using MvvmCross.Forms.Presenters.Attributes;
using MvvmCross.Forms.Views;
using MvvmCross.ViewModels;
using System;
using System.CodeDom.Compiler;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Reflection;
using System.Xml;
using Telerik.XamarinForms.Primitives;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core.Views
{
  [XamlFilePath("Views/LessonsPage.xaml")]
  [MvxMasterDetailPagePresentation]
  [XamlCompilation]
  public class LessonsPage : MvxContentPage<LessonsViewModel>
  {
    private PropertyChangedEventHandler selectedTabChanged;
    private bool swipePreviousWeek;
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private MvxContentPage<LessonsViewModel> Page;
    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private TabbedControl tabControl;

    public LessonsPage()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    protected virtual void OnAppearing()
    {
      ((MvxContentPage) this).OnAppearing();
      this.SubscribeToSelectedTabChanged();
    }

    protected virtual void OnDisappearing()
    {
      ((MvxContentPage) this).OnDisappearing();
      ((MvxNotifyPropertyChanged) this.get_ViewModel()).remove_PropertyChanged(this.selectedTabChanged);
    }

    private void SubscribeToSelectedTabChanged()
    {
      this.selectedTabChanged = (PropertyChangedEventHandler) ((s, e) =>
      {
        if (!(e.PropertyName == "SelectedDay"))
          return;
        this.SetSelectedTab();
      });
      ((MvxNotifyPropertyChanged) this.get_ViewModel()).add_PropertyChanged(this.selectedTabChanged);
      this.SetSelectedTab();
    }

    private void SetSelectedTab()
    {
      Device.BeginInvokeOnMainThread((Action) (() =>
      {
        try
        {
          DateTime dateTime;
          DateTime? nullable1;
          if (!this.swipePreviousWeek)
          {
            nullable1 = this.get_ViewModel().SelectedDay?.Key;
          }
          else
          {
            GroupedList<DateTime, LessonRealm> selectedDay = this.get_ViewModel().SelectedDay;
            if (selectedDay == null)
            {
              nullable1 = new DateTime?();
            }
            else
            {
              dateTime = selectedDay.Key;
              dateTime = dateTime.Date;
              nullable1 = new DateTime?(dateTime.AddDays((double) (((Collection<TabViewItem>) this.tabControl.get_Items()).Count - 1)));
            }
          }
          DateTime? nullable2 = nullable1;
          using (IEnumerator<TabViewItem> enumerator = ((Collection<TabViewItem>) this.tabControl.get_Items()).GetEnumerator())
          {
            while (((IEnumerator) enumerator).MoveNext())
            {
              TabViewItem current = enumerator.Current;
              if (nullable2.HasValue)
              {
                DateTime? nullable3 = nullable2;
                dateTime = (((BindableObject) current).get_BindingContext() as GroupedList<DateTime, LessonRealm>).Key;
                if ((nullable3.HasValue ? (nullable3.HasValue ? (nullable3.GetValueOrDefault() == dateTime ? 1 : 0) : 1) : 0) != 0)
                {
                  this.tabControl.set_SelectedItem((object) current);
                  if (this.swipePreviousWeek)
                    this.swipePreviousWeek = false;
                }
              }
            }
          }
        }
        catch (Exception ex)
        {
          CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (SetSelectedTab), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Views/LessonsPage.xaml.cs", 82);
        }
      }));
    }

    private void OnDayTapped(object sender, EventArgs e)
    {
      this.get_ViewModel().SelectedDay = ((BindableObject) (sender as Grid)).get_BindingContext() as GroupedList<DateTime, LessonRealm>;
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (LessonsPage).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("Views/LessonsPage.xaml");
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
        DayNameToStringConverter toStringConverter = new DayNameToStringConverter();
        ResourceDictionary resourceDictionary = new ResourceDictionary();
        RowDefinition rowDefinition1 = new RowDefinition();
        RowDefinition rowDefinition2 = new RowDefinition();
        StaticResourceExtension resourceExtension2 = new StaticResourceExtension();
        StaticResourceExtension resourceExtension3 = new StaticResourceExtension();
        ColumnDefinition columnDefinition1 = new ColumnDefinition();
        ColumnDefinition columnDefinition2 = new ColumnDefinition();
        ColumnDefinition columnDefinition3 = new ColumnDefinition();
        BindingExtension bindingExtension4 = new BindingExtension();
        TapGestureRecognizer gestureRecognizer1 = new TapGestureRecognizer();
        CachedImage cachedImage1 = new CachedImage();
        StaticResourceExtension resourceExtension4 = new StaticResourceExtension();
        BindingExtension bindingExtension5 = new BindingExtension();
        Label label1 = new Label();
        StaticResourceExtension resourceExtension5 = new StaticResourceExtension();
        Label label2 = new Label();
        StaticResourceExtension resourceExtension6 = new StaticResourceExtension();
        BindingExtension bindingExtension6 = new BindingExtension();
        Label label3 = new Label();
        StackLayout stackLayout = new StackLayout();
        BindingExtension bindingExtension7 = new BindingExtension();
        TapGestureRecognizer gestureRecognizer2 = new TapGestureRecognizer();
        CachedImage cachedImage2 = new CachedImage();
        Grid grid1 = new Grid();
        BindingExtension bindingExtension8 = new BindingExtension();
        BindingExtension bindingExtension9 = new BindingExtension();
        Setter setter4 = new Setter();
        DataTrigger dataTrigger4 = new DataTrigger(typeof (TabbedControl));
        DataTemplate dataTemplate1 = new DataTemplate();
        TabbedControl tabbedControl = new TabbedControl();
        StaticResourceExtension resourceExtension7 = new StaticResourceExtension();
        BindingExtension bindingExtension10 = new BindingExtension();
        StaticResourceExtension resourceExtension8 = new StaticResourceExtension();
        BoxView boxView = new BoxView();
        StaticResourceExtension resourceExtension9 = new StaticResourceExtension();
        CircleImage circleImage = new CircleImage();
        BindingExtension bindingExtension11 = new BindingExtension();
        BindingExtension bindingExtension12 = new BindingExtension();
        ActivityIndicator activityIndicator = new ActivityIndicator();
        Grid grid2 = new Grid();
        Grid grid3 = new Grid();
        LessonsPage lessonsPage;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (lessonsPage = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) lessonsPage, (INameScope) nameScope);
        ((INameScope) nameScope).RegisterName("Page", (object) lessonsPage);
        if (((Element) lessonsPage).get_StyleId() == null)
          ((Element) lessonsPage).set_StyleId("Page");
        ((INameScope) nameScope).RegisterName("tabControl", (object) tabbedControl);
        if (((Element) tabbedControl).get_StyleId() == null)
          ((Element) tabbedControl).set_StyleId("tabControl");
        this.Page = (MvxContentPage<LessonsViewModel>) lessonsPage;
        this.tabControl = tabbedControl;
        ((VisualElement) lessonsPage).set_Resources(resourceDictionary);
        resourceDictionary.Add("DayNameToStringConverter", (object) toStringConverter);
        translateExtension1.Text = "Lessons_Page_Title";
        TranslateExtension translateExtension5 = translateExtension1;
        XamlServiceProvider xamlServiceProvider1 = new XamlServiceProvider();
        Type type1 = typeof (IProvideValueTarget);
        object[] objArray1 = new object[0 + 1];
        objArray1[0] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider1;
        object obj1 = (object) (valueTargetProvider1 = new SimpleValueTargetProvider(objArray1, (object) Xamarin.Forms.Page.TitleProperty, (INameScope) nameScope));
        xamlServiceProvider1.Add(type1, (object) valueTargetProvider1);
        xamlServiceProvider1.Add(typeof (IReferenceProvider), obj1);
        Type type2 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver1 = new XmlNamespaceResolver();
        namespaceResolver1.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver1.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver1.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver1.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver1.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver1.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver1.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver1.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver1.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver1.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver1.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver1 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver1, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider1.Add(type2, (object) xamlTypeResolver1);
        xamlServiceProvider1.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(18, 5)));
        object obj2 = ((IMarkupExtension) translateExtension5).ProvideValue((IServiceProvider) xamlServiceProvider1);
        ((Xamarin.Forms.Page) lessonsPage).set_Title((string) obj2);
        ((BindableObject) lessonsPage).SetValue((BindableProperty) Xamarin.Forms.PlatformConfiguration.iOSSpecific.Page.UseSafeAreaProperty, (object) true);
        resourceExtension1.set_Key("MenuHeaderBackgroundColor");
        StaticResourceExtension resourceExtension10 = resourceExtension1;
        XamlServiceProvider xamlServiceProvider2 = new XamlServiceProvider();
        Type type3 = typeof (IProvideValueTarget);
        object[] objArray2 = new object[0 + 1];
        objArray2[0] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider2;
        object obj3 = (object) (valueTargetProvider2 = new SimpleValueTargetProvider(objArray2, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider2.Add(type3, (object) valueTargetProvider2);
        xamlServiceProvider2.Add(typeof (IReferenceProvider), obj3);
        Type type4 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver2 = new XmlNamespaceResolver();
        namespaceResolver2.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver2.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver2.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver2.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver2.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver2.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver2.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver2.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver2.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver2.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver2.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver2 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver2, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider2.Add(type4, (object) xamlTypeResolver2);
        xamlServiceProvider2.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(21, 5)));
        object obj4 = ((IMarkupExtension) resourceExtension10).ProvideValue((IServiceProvider) xamlServiceProvider2);
        ((VisualElement) lessonsPage).set_BackgroundColor((Color) obj4);
        bindingExtension1.set_Path("HasInternetConnection");
        BindingBase bindingBase1 = ((IMarkupExtension<BindingBase>) bindingExtension1).ProvideValue((IServiceProvider) null);
        dataTrigger1.set_Binding(bindingBase1);
        dataTrigger1.set_Value((object) "True");
        setter1.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension2.Text = "Lessons_Page_Title";
        TranslateExtension translateExtension6 = translateExtension2;
        XamlServiceProvider xamlServiceProvider3 = new XamlServiceProvider();
        Type type5 = typeof (IProvideValueTarget);
        object[] objArray3 = new object[0 + 3];
        objArray3[0] = (object) setter1;
        objArray3[1] = (object) dataTrigger1;
        objArray3[2] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider3;
        object obj5 = (object) (valueTargetProvider3 = new SimpleValueTargetProvider(objArray3, (object) typeof (Setter).GetRuntimeProperty("Value"), (INameScope) nameScope));
        xamlServiceProvider3.Add(type5, (object) valueTargetProvider3);
        xamlServiceProvider3.Add(typeof (IReferenceProvider), obj5);
        Type type6 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver3 = new XmlNamespaceResolver();
        namespaceResolver3.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver3.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver3.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver3.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver3.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver3.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver3.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver3.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver3.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver3.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver3.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver3 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver3, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider3.Add(type6, (object) xamlTypeResolver3);
        xamlServiceProvider3.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(31, 38)));
        object obj6 = ((IMarkupExtension) translateExtension6).ProvideValue((IServiceProvider) xamlServiceProvider3);
        setter1.set_Value(obj6);
        ((ICollection<Setter>) dataTrigger1.get_Setters()).Add(setter1);
        ((ICollection<TriggerBase>) ((BindableObject) lessonsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger1);
        bindingExtension2.set_Path("HasInternetConnection");
        BindingBase bindingBase2 = ((IMarkupExtension<BindingBase>) bindingExtension2).ProvideValue((IServiceProvider) null);
        dataTrigger2.set_Binding(bindingBase2);
        dataTrigger2.set_Value((object) "False");
        setter2.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension3.Text = "Lessons_Page_Offline_Title";
        TranslateExtension translateExtension7 = translateExtension3;
        XamlServiceProvider xamlServiceProvider4 = new XamlServiceProvider();
        Type type7 = typeof (IProvideValueTarget);
        object[] objArray4 = new object[0 + 3];
        objArray4[0] = (object) setter2;
        objArray4[1] = (object) dataTrigger2;
        objArray4[2] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider4;
        object obj7 = (object) (valueTargetProvider4 = new SimpleValueTargetProvider(objArray4, (object) typeof (Setter).GetRuntimeProperty("Value"), (INameScope) nameScope));
        xamlServiceProvider4.Add(type7, (object) valueTargetProvider4);
        xamlServiceProvider4.Add(typeof (IReferenceProvider), obj7);
        Type type8 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver4 = new XmlNamespaceResolver();
        namespaceResolver4.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver4.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver4.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver4.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver4.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver4.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver4.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver4.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver4.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver4.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver4.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver4 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver4, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider4.Add(type8, (object) xamlTypeResolver4);
        xamlServiceProvider4.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(37, 38)));
        object obj8 = ((IMarkupExtension) translateExtension7).ProvideValue((IServiceProvider) xamlServiceProvider4);
        setter2.set_Value(obj8);
        ((ICollection<Setter>) dataTrigger2.get_Setters()).Add(setter2);
        ((ICollection<TriggerBase>) ((BindableObject) lessonsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger2);
        bindingExtension3.set_Path("IsOffline");
        BindingBase bindingBase3 = ((IMarkupExtension<BindingBase>) bindingExtension3).ProvideValue((IServiceProvider) null);
        dataTrigger3.set_Binding(bindingBase3);
        dataTrigger3.set_Value((object) "True");
        setter3.set_Property((BindableProperty) Xamarin.Forms.Page.TitleProperty);
        translateExtension4.Text = "Lessons_Page_Offline_Title";
        TranslateExtension translateExtension8 = translateExtension4;
        XamlServiceProvider xamlServiceProvider5 = new XamlServiceProvider();
        Type type9 = typeof (IProvideValueTarget);
        object[] objArray5 = new object[0 + 3];
        objArray5[0] = (object) setter3;
        objArray5[1] = (object) dataTrigger3;
        objArray5[2] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider5;
        object obj9 = (object) (valueTargetProvider5 = new SimpleValueTargetProvider(objArray5, (object) typeof (Setter).GetRuntimeProperty("Value"), (INameScope) nameScope));
        xamlServiceProvider5.Add(type9, (object) valueTargetProvider5);
        xamlServiceProvider5.Add(typeof (IReferenceProvider), obj9);
        Type type10 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver5 = new XmlNamespaceResolver();
        namespaceResolver5.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver5.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver5.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver5.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver5.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver5.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver5.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver5.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver5.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver5.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver5.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver5 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver5, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider5.Add(type10, (object) xamlTypeResolver5);
        xamlServiceProvider5.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(43, 38)));
        object obj10 = ((IMarkupExtension) translateExtension8).ProvideValue((IServiceProvider) xamlServiceProvider5);
        setter3.set_Value(obj10);
        ((ICollection<Setter>) dataTrigger3.get_Setters()).Add(setter3);
        ((ICollection<TriggerBase>) ((BindableObject) lessonsPage).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger3);
        ((VisualElement) lessonsPage).set_Resources(resourceDictionary);
        ((BindableObject) grid3).SetValue((BindableProperty) Grid.RowSpacingProperty, (object) 0.0);
        ((BindableObject) rowDefinition1).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("Auto"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid3).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition1);
        ((BindableObject) rowDefinition2).SetValue((BindableProperty) RowDefinition.HeightProperty, new GridLengthTypeConverter().ConvertFromInvariantString("*"));
        ((DefinitionCollection<RowDefinition>) ((BindableObject) grid3).GetValue((BindableProperty) Grid.RowDefinitionsProperty)).Add(rowDefinition2);
        resourceExtension2.set_Key("NavigationArrowContentHolderMargin");
        StaticResourceExtension resourceExtension11 = resourceExtension2;
        XamlServiceProvider xamlServiceProvider6 = new XamlServiceProvider();
        Type type11 = typeof (IProvideValueTarget);
        object[] objArray6 = new object[0 + 3];
        objArray6[0] = (object) grid1;
        objArray6[1] = (object) grid3;
        objArray6[2] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider6;
        object obj11 = (object) (valueTargetProvider6 = new SimpleValueTargetProvider(objArray6, (object) Layout.PaddingProperty, (INameScope) nameScope));
        xamlServiceProvider6.Add(type11, (object) valueTargetProvider6);
        xamlServiceProvider6.Add(typeof (IReferenceProvider), obj11);
        Type type12 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver6 = new XmlNamespaceResolver();
        namespaceResolver6.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver6.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver6.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver6.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver6.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver6.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver6.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver6.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver6.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver6.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver6.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver6 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver6, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider6.Add(type12, (object) xamlTypeResolver6);
        xamlServiceProvider6.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(56, 15)));
        object obj12 = ((IMarkupExtension) resourceExtension11).ProvideValue((IServiceProvider) xamlServiceProvider6);
        ((Layout) grid1).set_Padding((Thickness) obj12);
        resourceExtension3.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension12 = resourceExtension3;
        XamlServiceProvider xamlServiceProvider7 = new XamlServiceProvider();
        Type type13 = typeof (IProvideValueTarget);
        object[] objArray7 = new object[0 + 3];
        objArray7[0] = (object) grid1;
        objArray7[1] = (object) grid3;
        objArray7[2] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider7;
        object obj13 = (object) (valueTargetProvider7 = new SimpleValueTargetProvider(objArray7, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider7.Add(type13, (object) valueTargetProvider7);
        xamlServiceProvider7.Add(typeof (IReferenceProvider), obj13);
        Type type14 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver7 = new XmlNamespaceResolver();
        namespaceResolver7.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver7.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver7.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver7.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver7.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver7.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver7.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver7.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver7.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver7.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver7.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver7.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver7.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver7 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver7, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider7.Add(type14, (object) xamlTypeResolver7);
        xamlServiceProvider7.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(56, 77)));
        object obj14 = ((IMarkupExtension) resourceExtension12).ProvideValue((IServiceProvider) xamlServiceProvider7);
        ((VisualElement) grid1).set_BackgroundColor((Color) obj14);
        ((BindableObject) columnDefinition1).SetValue((BindableProperty) ColumnDefinition.WidthProperty, new GridLengthTypeConverter().ConvertFromInvariantString("Auto"));
        ((DefinitionCollection<ColumnDefinition>) ((BindableObject) grid1).GetValue((BindableProperty) Grid.ColumnDefinitionsProperty)).Add(columnDefinition1);
        ((BindableObject) columnDefinition2).SetValue((BindableProperty) ColumnDefinition.WidthProperty, new GridLengthTypeConverter().ConvertFromInvariantString("*"));
        ((DefinitionCollection<ColumnDefinition>) ((BindableObject) grid1).GetValue((BindableProperty) Grid.ColumnDefinitionsProperty)).Add(columnDefinition2);
        ((BindableObject) columnDefinition3).SetValue((BindableProperty) ColumnDefinition.WidthProperty, new GridLengthTypeConverter().ConvertFromInvariantString("Auto"));
        ((DefinitionCollection<ColumnDefinition>) ((BindableObject) grid1).GetValue((BindableProperty) Grid.ColumnDefinitionsProperty)).Add(columnDefinition3);
        ((BindableObject) cachedImage1).SetValue((BindableProperty) Grid.ColumnProperty, (object) 0);
        ((BindableObject) cachedImage1).SetValue((BindableProperty) CachedImage.DownsampleToViewSizeProperty, (object) true);
        ((BindableObject) cachedImage1).SetValue((BindableProperty) VisualElement.HeightRequestProperty, (object) 40.0);
        ((BindableObject) cachedImage1).SetValue((BindableProperty) CachedImage.SourceProperty, new ImageSourceConverter().ConvertFromInvariantString("resource://Ekreta.Mobile.Core.Images.ArrowLeft.png?assembly=Ekreta.Mobile.Core"));
        ((BindableObject) cachedImage1).SetValue((BindableProperty) VisualElement.WidthRequestProperty, (object) 40.0);
        bindingExtension4.set_Path("PreviousWeekCommand");
        BindingBase bindingBase4 = ((IMarkupExtension<BindingBase>) bindingExtension4).ProvideValue((IServiceProvider) null);
        ((BindableObject) gestureRecognizer1).SetBinding((BindableProperty) TapGestureRecognizer.CommandProperty, bindingBase4);
        ((ICollection<IGestureRecognizer>) ((View) cachedImage1).get_GestureRecognizers()).Add((IGestureRecognizer) gestureRecognizer1);
        ((ICollection<View>) grid1.get_Children()).Add((View) cachedImage1);
        ((BindableObject) stackLayout).SetValue((BindableProperty) Grid.ColumnProperty, (object) 1);
        ((BindableObject) stackLayout).SetValue((BindableProperty) View.HorizontalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        ((BindableObject) stackLayout).SetValue((BindableProperty) StackLayout.OrientationProperty, (object) (StackOrientation) 1);
        ((BindableObject) stackLayout).SetValue((BindableProperty) View.VerticalOptionsProperty, (object) (LayoutOptions) LayoutOptions.Center);
        resourceExtension4.set_Key("ListItemGroupTitleStyle");
        StaticResourceExtension resourceExtension13 = resourceExtension4;
        XamlServiceProvider xamlServiceProvider8 = new XamlServiceProvider();
        Type type15 = typeof (IProvideValueTarget);
        object[] objArray8 = new object[0 + 5];
        objArray8[0] = (object) label1;
        objArray8[1] = (object) stackLayout;
        objArray8[2] = (object) grid1;
        objArray8[3] = (object) grid3;
        objArray8[4] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider8;
        object obj15 = (object) (valueTargetProvider8 = new SimpleValueTargetProvider(objArray8, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider8.Add(type15, (object) valueTargetProvider8);
        xamlServiceProvider8.Add(typeof (IReferenceProvider), obj15);
        Type type16 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver8 = new XmlNamespaceResolver();
        namespaceResolver8.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver8.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver8.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver8.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver8.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver8.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver8.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver8.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver8.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver8.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver8.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver8.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver8.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver8 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver8, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider8.Add(type16, (object) xamlTypeResolver8);
        xamlServiceProvider8.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(79, 24)));
        object obj16 = ((IMarkupExtension) resourceExtension13).ProvideValue((IServiceProvider) xamlServiceProvider8);
        ((NavigableElement) label1).set_Style((Style) obj16);
        bindingExtension5.set_StringFormat("{0:MMM dd.}");
        bindingExtension5.set_Path("FirstDayOfWeek");
        BindingBase bindingBase5 = ((IMarkupExtension<BindingBase>) bindingExtension5).ProvideValue((IServiceProvider) null);
        ((BindableObject) label1).SetBinding((BindableProperty) Label.TextProperty, bindingBase5);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label1);
        resourceExtension5.set_Key("ListItemGroupTitleStyle");
        StaticResourceExtension resourceExtension14 = resourceExtension5;
        XamlServiceProvider xamlServiceProvider9 = new XamlServiceProvider();
        Type type17 = typeof (IProvideValueTarget);
        object[] objArray9 = new object[0 + 5];
        objArray9[0] = (object) label2;
        objArray9[1] = (object) stackLayout;
        objArray9[2] = (object) grid1;
        objArray9[3] = (object) grid3;
        objArray9[4] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider9;
        object obj17 = (object) (valueTargetProvider9 = new SimpleValueTargetProvider(objArray9, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider9.Add(type17, (object) valueTargetProvider9);
        xamlServiceProvider9.Add(typeof (IReferenceProvider), obj17);
        Type type18 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver9 = new XmlNamespaceResolver();
        namespaceResolver9.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver9.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver9.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver9.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver9.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver9.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver9.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver9.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver9.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver9.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver9.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver9.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver9.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver9 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver9, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider9.Add(type18, (object) xamlTypeResolver9);
        xamlServiceProvider9.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(80, 24)));
        object obj18 = ((IMarkupExtension) resourceExtension14).ProvideValue((IServiceProvider) xamlServiceProvider9);
        ((NavigableElement) label2).set_Style((Style) obj18);
        ((BindableObject) label2).SetValue((BindableProperty) Label.TextProperty, (object) " - ");
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label2);
        resourceExtension6.set_Key("ListItemGroupTitleStyle");
        StaticResourceExtension resourceExtension15 = resourceExtension6;
        XamlServiceProvider xamlServiceProvider10 = new XamlServiceProvider();
        Type type19 = typeof (IProvideValueTarget);
        object[] objArray10 = new object[0 + 5];
        objArray10[0] = (object) label3;
        objArray10[1] = (object) stackLayout;
        objArray10[2] = (object) grid1;
        objArray10[3] = (object) grid3;
        objArray10[4] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider10;
        object obj19 = (object) (valueTargetProvider10 = new SimpleValueTargetProvider(objArray10, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider10.Add(type19, (object) valueTargetProvider10);
        xamlServiceProvider10.Add(typeof (IReferenceProvider), obj19);
        Type type20 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver10 = new XmlNamespaceResolver();
        namespaceResolver10.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver10.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver10.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver10.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver10.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver10.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver10.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver10.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver10.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver10.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver10.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver10.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver10.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver10 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver10, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider10.Add(type20, (object) xamlTypeResolver10);
        xamlServiceProvider10.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(81, 24)));
        object obj20 = ((IMarkupExtension) resourceExtension15).ProvideValue((IServiceProvider) xamlServiceProvider10);
        ((NavigableElement) label3).set_Style((Style) obj20);
        bindingExtension6.set_StringFormat("{0:MMM dd.}");
        bindingExtension6.set_Path("LastDayOfWeekDisplay");
        BindingBase bindingBase6 = ((IMarkupExtension<BindingBase>) bindingExtension6).ProvideValue((IServiceProvider) null);
        ((BindableObject) label3).SetBinding((BindableProperty) Label.TextProperty, bindingBase6);
        ((ICollection<View>) ((Layout<View>) stackLayout).get_Children()).Add((View) label3);
        ((ICollection<View>) grid1.get_Children()).Add((View) stackLayout);
        ((BindableObject) cachedImage2).SetValue((BindableProperty) Grid.ColumnProperty, (object) 2);
        ((BindableObject) cachedImage2).SetValue((BindableProperty) CachedImage.DownsampleToViewSizeProperty, (object) true);
        ((BindableObject) cachedImage2).SetValue((BindableProperty) VisualElement.HeightRequestProperty, (object) 40.0);
        ((BindableObject) cachedImage2).SetValue((BindableProperty) CachedImage.SourceProperty, new ImageSourceConverter().ConvertFromInvariantString("resource://Ekreta.Mobile.Core.Images.ArrowRight.png?assembly=Ekreta.Mobile.Core"));
        ((BindableObject) cachedImage2).SetValue((BindableProperty) VisualElement.WidthRequestProperty, (object) 40.0);
        bindingExtension7.set_Path("NextWeekCommand");
        BindingBase bindingBase7 = ((IMarkupExtension<BindingBase>) bindingExtension7).ProvideValue((IServiceProvider) null);
        ((BindableObject) gestureRecognizer2).SetBinding((BindableProperty) TapGestureRecognizer.CommandProperty, bindingBase7);
        ((ICollection<IGestureRecognizer>) ((View) cachedImage2).get_GestureRecognizers()).Add((IGestureRecognizer) gestureRecognizer2);
        ((ICollection<View>) grid1.get_Children()).Add((View) cachedImage2);
        ((ICollection<View>) grid3.get_Children()).Add((View) grid1);
        ((BindableObject) tabbedControl).SetValue((BindableProperty) Grid.RowProperty, (object) 1);
        tabbedControl.set_HeaderPosition((TabViewHeaderPosition) 1);
        bindingExtension8.set_Path("Days");
        BindingBase bindingBase8 = ((IMarkupExtension<BindingBase>) bindingExtension8).ProvideValue((IServiceProvider) null);
        ((BindableObject) tabbedControl).SetBinding(TabbedControl.ItemsSourceProperty, bindingBase8);
        bindingExtension9.set_Path("IsLoading");
        BindingBase bindingBase9 = ((IMarkupExtension<BindingBase>) bindingExtension9).ProvideValue((IServiceProvider) null);
        dataTrigger4.set_Binding(bindingBase9);
        dataTrigger4.set_Value((object) "True");
        setter4.set_Property((BindableProperty) VisualElement.IsVisibleProperty);
        setter4.set_Value((object) "False");
        setter4.set_Value(new VisualElement.VisibilityConverter().ConvertFromInvariantString("False"));
        ((ICollection<Setter>) dataTrigger4.get_Setters()).Add(setter4);
        ((ICollection<TriggerBase>) ((BindableObject) tabbedControl).GetValue((BindableProperty) VisualElement.TriggersProperty)).Add((TriggerBase) dataTrigger4);
        DataTemplate dataTemplate2 = dataTemplate1;
        // ISSUE: object of a compiler-generated type is created
        // ISSUE: variable of a compiler-generated type
        LessonsPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_24 xamlCdataTemplate24 = new LessonsPage.\u003CInitializeComponent\u003E_anonXamlCDataTemplate_24();
        object[] objArray11 = new object[0 + 4];
        objArray11[0] = (object) dataTemplate1;
        objArray11[1] = (object) tabbedControl;
        objArray11[2] = (object) grid3;
        objArray11[3] = (object) lessonsPage;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate24.parentValues = objArray11;
        // ISSUE: reference to a compiler-generated field
        xamlCdataTemplate24.root = lessonsPage;
        // ISSUE: reference to a compiler-generated method
        Func<object> func = new Func<object>(xamlCdataTemplate24.LoadDataTemplate);
        ((IDataTemplate) dataTemplate2).set_LoadTemplate(func);
        ((BindableObject) tabbedControl).SetValue(TabbedControl.ItemTemplateProperty, (object) dataTemplate1);
        ((ICollection<View>) grid3.get_Children()).Add((View) tabbedControl);
        ((BindableObject) grid2).SetValue((BindableProperty) Grid.RowSpanProperty, (object) 2);
        resourceExtension7.set_Key("OverlayColor");
        StaticResourceExtension resourceExtension16 = resourceExtension7;
        XamlServiceProvider xamlServiceProvider11 = new XamlServiceProvider();
        Type type21 = typeof (IProvideValueTarget);
        object[] objArray12 = new object[0 + 3];
        objArray12[0] = (object) grid2;
        objArray12[1] = (object) grid3;
        objArray12[2] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider11;
        object obj21 = (object) (valueTargetProvider11 = new SimpleValueTargetProvider(objArray12, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider11.Add(type21, (object) valueTargetProvider11);
        xamlServiceProvider11.Add(typeof (IReferenceProvider), obj21);
        Type type22 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver11 = new XmlNamespaceResolver();
        namespaceResolver11.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver11.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver11.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver11.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver11.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver11.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver11.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver11.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver11.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver11.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver11.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver11.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver11.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver11 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver11, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider11.Add(type22, (object) xamlTypeResolver11);
        xamlServiceProvider11.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(332, 13)));
        object obj22 = ((IMarkupExtension) resourceExtension16).ProvideValue((IServiceProvider) xamlServiceProvider11);
        ((VisualElement) grid2).set_BackgroundColor((Color) obj22);
        bindingExtension10.set_Path("IsLoading");
        BindingBase bindingBase10 = ((IMarkupExtension<BindingBase>) bindingExtension10).ProvideValue((IServiceProvider) null);
        ((BindableObject) grid2).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase10);
        resourceExtension8.set_Key("PageBackgroundColor");
        StaticResourceExtension resourceExtension17 = resourceExtension8;
        XamlServiceProvider xamlServiceProvider12 = new XamlServiceProvider();
        Type type23 = typeof (IProvideValueTarget);
        object[] objArray13 = new object[0 + 4];
        objArray13[0] = (object) boxView;
        objArray13[1] = (object) grid2;
        objArray13[2] = (object) grid3;
        objArray13[3] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider12;
        object obj23 = (object) (valueTargetProvider12 = new SimpleValueTargetProvider(objArray13, (object) VisualElement.BackgroundColorProperty, (INameScope) nameScope));
        xamlServiceProvider12.Add(type23, (object) valueTargetProvider12);
        xamlServiceProvider12.Add(typeof (IReferenceProvider), obj23);
        Type type24 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver12 = new XmlNamespaceResolver();
        namespaceResolver12.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver12.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver12.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver12.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver12.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver12.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver12.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver12.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver12.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver12.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver12.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver12.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver12.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver12 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver12, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider12.Add(type24, (object) xamlTypeResolver12);
        xamlServiceProvider12.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(334, 22)));
        object obj24 = ((IMarkupExtension) resourceExtension17).ProvideValue((IServiceProvider) xamlServiceProvider12);
        ((VisualElement) boxView).set_BackgroundColor((Color) obj24);
        ((ICollection<View>) grid2.get_Children()).Add((View) boxView);
        ((BindableObject) circleImage).SetValue((BindableProperty) CircleImage.FillColorProperty, (object) (Color) Color.White);
        resourceExtension9.set_Key("ListItemIconStyle");
        StaticResourceExtension resourceExtension18 = resourceExtension9;
        XamlServiceProvider xamlServiceProvider13 = new XamlServiceProvider();
        Type type25 = typeof (IProvideValueTarget);
        object[] objArray14 = new object[0 + 4];
        objArray14[0] = (object) circleImage;
        objArray14[1] = (object) grid2;
        objArray14[2] = (object) grid3;
        objArray14[3] = (object) lessonsPage;
        SimpleValueTargetProvider valueTargetProvider13;
        object obj25 = (object) (valueTargetProvider13 = new SimpleValueTargetProvider(objArray14, (object) VisualElement.StyleProperty, (INameScope) nameScope));
        xamlServiceProvider13.Add(type25, (object) valueTargetProvider13);
        xamlServiceProvider13.Add(typeof (IReferenceProvider), obj25);
        Type type26 = typeof (IXamlTypeResolver);
        XmlNamespaceResolver namespaceResolver13 = new XmlNamespaceResolver();
        namespaceResolver13.Add("", "http://xamarin.com/schemas/2014/forms");
        namespaceResolver13.Add("x", "http://schemas.microsoft.com/winfx/2009/xaml");
        namespaceResolver13.Add("controls", "clr-namespace:Ekreta.Mobile.Core.Controls;assembly=Ekreta.Mobile.Core");
        namespaceResolver13.Add("converters", "clr-namespace:Ekreta.Mobile.Core.Converters;assembly=Ekreta.Mobile.Core");
        namespaceResolver13.Add("d", "http://xamarin.com/schemas/2014/forms/design");
        namespaceResolver13.Add("extensions", "clr-namespace:Ekreta.Mobile.Core.Extensions;assembly=Ekreta.Mobile.Core");
        namespaceResolver13.Add("ffimageloading", "clr-namespace:FFImageLoading.Forms;assembly=FFImageLoading.Forms");
        namespaceResolver13.Add("ios", "clr-namespace:Xamarin.Forms.PlatformConfiguration.iOSSpecific;assembly=Xamarin.Forms.Core");
        namespaceResolver13.Add("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        namespaceResolver13.Add("mvvmcross", "clr-namespace:MvvmCross.Forms.Views;assembly=MvvmCross.Forms");
        namespaceResolver13.Add("pluginImage", "clr-namespace:ImageCircle.Forms.Plugin.Abstractions;assembly=ImageCircle.Forms.Plugin.Abstractions");
        namespaceResolver13.Add("telerikPrimitives", "clr-namespace:Telerik.XamarinForms.Primitives;assembly=Telerik.XamarinForms.Primitives");
        namespaceResolver13.Add("viewModels", "clr-namespace:Ekreta.Mobile.Core.ViewModels;assembly=Ekreta.Mobile.Core");
        XamlTypeResolver xamlTypeResolver13 = new XamlTypeResolver((IXmlNamespaceResolver) namespaceResolver13, typeof (LessonsPage).GetTypeInfo().Assembly);
        xamlServiceProvider13.Add(type26, (object) xamlTypeResolver13);
        xamlServiceProvider13.Add(typeof (IXmlLineInfoProvider), (object) new XmlLineInfoProvider((IXmlLineInfo) new XmlLineInfo(335, 56)));
        object obj26 = ((IMarkupExtension) resourceExtension18).ProvideValue((IServiceProvider) xamlServiceProvider13);
        ((NavigableElement) circleImage).set_Style((Style) obj26);
        ((ICollection<View>) grid2.get_Children()).Add((View) circleImage);
        bindingExtension11.set_Path("IsLoading");
        BindingBase bindingBase11 = ((IMarkupExtension<BindingBase>) bindingExtension11).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) ActivityIndicator.IsRunningProperty, bindingBase11);
        bindingExtension12.set_Path("IsLoading");
        BindingBase bindingBase12 = ((IMarkupExtension<BindingBase>) bindingExtension12).ProvideValue((IServiceProvider) null);
        ((BindableObject) activityIndicator).SetBinding((BindableProperty) VisualElement.IsVisibleProperty, bindingBase12);
        ((ICollection<View>) grid2.get_Children()).Add((View) activityIndicator);
        ((ICollection<View>) grid3.get_Children()).Add((View) grid2);
        ((BindableObject) lessonsPage).SetValue((BindableProperty) ContentPage.ContentProperty, (object) grid3);
      }
    }

    private void __InitComponentRuntime()
    {
      Xamarin.Forms.Xaml.Extensions.LoadFromXaml<LessonsPage>((M0) this, typeof (LessonsPage));
      this.Page = (MvxContentPage<LessonsViewModel>) NameScopeExtensions.FindByName<MvxContentPage<LessonsViewModel>>((Element) this, "Page");
      this.tabControl = (TabbedControl) NameScopeExtensions.FindByName<TabbedControl>((Element) this, "tabControl");
    }
  }
}
