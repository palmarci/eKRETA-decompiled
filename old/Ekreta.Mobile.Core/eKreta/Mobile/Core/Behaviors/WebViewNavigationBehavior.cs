// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Behaviors.WebViewNavigationBehavior
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Monitoring;
using System;
using System.Collections.Generic;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Behaviors
{
  public class WebViewNavigationBehavior : Behavior<WebView>
  {
    protected virtual void OnAttachedTo(WebView bindable)
    {
      base.OnAttachedTo(bindable);
      bindable.add_Navigating(new EventHandler<WebNavigatingEventArgs>(this.WebViewNavigating));
    }

    protected virtual void OnDetachingFrom(WebView bindable)
    {
      base.OnDetachingFrom(bindable);
      bindable.remove_Navigating(new EventHandler<WebNavigatingEventArgs>(this.WebViewNavigating));
    }

    private void WebViewNavigating(object sender, WebNavigatingEventArgs e)
    {
      WebView webView = (WebView) sender;
      UrlWebViewSource urlWebViewSource = (UrlWebViewSource) null;
      string str1 = (string) null;
      if (webView.get_Source() is UrlWebViewSource)
      {
        urlWebViewSource = webView.get_Source() as UrlWebViewSource;
        str1 = urlWebViewSource.get_Url();
      }
      if (webView.get_Source() is HtmlWebViewSource)
        webView.get_Source();
      if (webView.get_Source() is UrlWebViewSource && (urlWebViewSource == null || string.IsNullOrEmpty(((WebNavigationEventArgs) e).get_Url())))
        return;
      string uriString = ((WebNavigationEventArgs) e).get_Url().TrimEnd('/');
      string str2;
      if (str1 == null)
        str2 = (string) null;
      else
        str2 = str1.TrimEnd('/');
      string str3 = str2;
      if (!(uriString != str3))
        return;
      if (!uriString.StartsWith("http"))
        return;
      try
      {
        Uri result = (Uri) null;
        if (!Uri.TryCreate(uriString, UriKind.Absolute, out result))
          return;
        Device.OpenUri(result);
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (WebViewNavigating), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Behaviors/WebViewNavigationBehavior.cs", 68);
      }
      finally
      {
        e.set_Cancel(true);
      }
    }

    public WebViewNavigationBehavior()
    {
      base.\u002Ector();
    }
  }
}
