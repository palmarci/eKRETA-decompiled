using Android.App;
using Android.Runtime;
using Ekreta.Mobile.Core.Controls;
using eKreta.Mobile.Droid.Effects;
using eKreta.Mobile.Droid.Helpers;
using eKreta.Mobile.Droid.Platform.Keystore;
using eKreta.Mobile.Droid.Platform.Localization;
using eKreta.Mobile.Droid.Platform.PushNotification;
using eKreta.Mobile.Droid.Platform.Security;
using eKreta.Mobile.Droid.Platform.Styles;
using eKreta.Mobile.Droid.Renderers;
using System.Reflection;
using System.Runtime.InteropServices;
using Xamarin.Forms;

[assembly: ExportRenderer(typeof (HtmlLabel), typeof (HtmlLabelRenderer))]
[assembly: ExportRenderer(typeof (Button), typeof (FlatButtonRenderer))]
[assembly: ExportRenderer(typeof (SearchBar), typeof (CustomSearchBarRenderer))]
[assembly: ExportRenderer(typeof (Label), typeof (AndroidLabelRenderer))]
[assembly: Dependency(typeof (PlatformStyleProvider))]
[assembly: Dependency(typeof (SecurityService))]
[assembly: Dependency(typeof (AndroidPushNotificationHandler))]
[assembly: Dependency(typeof (eKreta.Mobile.Droid.Platform.PermissionManager.PermissionManager))]
[assembly: Dependency(typeof (AndroidKeyStore))]
[assembly: Dependency(typeof (eKreta.Mobile.Droid.Platform.DataViewer.DataViewer))]
[assembly: Dependency(typeof (PackageInfo))]
[assembly: ExportEffect(typeof (ShowHidePassEffect), "ShowHidePassEffect")]
[assembly: ResolutionGroupName("Xamarin")]
[assembly: ExportRenderer(typeof (ListView), typeof (eKreta.Mobile.ListViewCustomRenderer.ListViewCustomRenderer))]
[assembly: ExportRenderer(typeof (WebView), typeof (ScrollableWebViewRendererAndroid))]
[assembly: ExportRenderer(typeof (StrikeThroughLabel), typeof (StrikeThroughLabelRenderer))]
[assembly: ExportRenderer(typeof (ViewCell), typeof (ViewCellItemSelectedCustomRenderer))]
[assembly: UsesPermission("android.permission.WRITE_EXTERNAL_STORAGE")]
[assembly: UsesPermission("android.permission.INTERNET")]
[assembly: AssemblyFileVersion("1.0.0.0")]
[assembly: AssemblyTrademark("")]
[assembly: AssemblyCopyright("Copyright ©  2014")]
[assembly: ComVisible(false)]
[assembly: AssemblyCompany("")]
[assembly: AssemblyConfiguration("")]
[assembly: AssemblyDescription("")]
[assembly: AssemblyTitle("eKreta.Mobile.Android")]
[assembly: ResourceDesigner("eKreta.Mobile.Droid.Resource", IsApplication = true)]
[assembly: AssemblyProduct("eKreta.Mobile.Android")]
[assembly: Dependency(typeof (Localize))]
[assembly: AssemblyVersion("1.0.0.0")]
