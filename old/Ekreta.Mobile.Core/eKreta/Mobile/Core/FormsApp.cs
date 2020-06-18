// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.FormsApp
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross.Forms.Core;
using System;
using System.CodeDom.Compiler;
using System.Reflection;
using System.Xml;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.Xaml;
using Xamarin.Forms.Xaml.Internals;

namespace Ekreta.Mobile.Core
{
  [XamlCompilation]
  [XamlFilePath("FormsApp.xaml")]
  public class FormsApp : MvxFormsApplication
  {
    public FormsApp()
    {
      base.\u002Ector();
      this.InitializeComponent();
    }

    [GeneratedCode("Xamarin.Forms.Build.Tasks.XamlG", "2.0.0.0")]
    private void InitializeComponent()
    {
      ResourceLoader.ResourceLoadingQuery resourceLoadingQuery = new ResourceLoader.ResourceLoadingQuery();
      resourceLoadingQuery.set_AssemblyName(typeof (FormsApp).GetTypeInfo().Assembly.GetName());
      resourceLoadingQuery.set_ResourcePath("FormsApp.xaml");
      resourceLoadingQuery.set_Instance((object) this);
      if (ResourceLoader.CanProvideContentFor(resourceLoadingQuery))
        this.__InitComponentRuntime();
      else if (XamlLoader.get_XamlFileProvider() != null && XamlLoader.get_XamlFileProvider()(((object) this).GetType()) != null)
      {
        this.__InitComponentRuntime();
      }
      else
      {
        ResourceDictionary resourceDictionary1 = new ResourceDictionary();
        FormsApp formsApp;
        NameScope nameScope = (NameScope) (NameScope.GetNameScope((BindableObject) (formsApp = this)) ?? (INameScope) new NameScope());
        NameScope.SetNameScope((BindableObject) formsApp, (INameScope) nameScope);
        ((Application) formsApp).set_Resources(resourceDictionary1);
        ResourceDictionary resourceDictionary2 = resourceDictionary1;
        Uri uri1;
        resourceDictionary1.SetAndLoadSource(uri1 = new Uri("Styles.xaml", UriKind.RelativeOrAbsolute), "Styles.xaml", typeof (FormsApp).GetTypeInfo().Assembly, (IXmlLineInfo) new XmlLineInfo(9, 29));
        Uri uri2 = uri1;
        resourceDictionary2.set_Source(uri2);
        ((Application) formsApp).set_Resources(resourceDictionary1);
      }
    }

    private void __InitComponentRuntime()
    {
      Extensions.LoadFromXaml<FormsApp>((M0) this, typeof (FormsApp));
    }
  }
}
