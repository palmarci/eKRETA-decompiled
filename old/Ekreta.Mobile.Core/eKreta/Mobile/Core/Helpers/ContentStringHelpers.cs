// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.ContentStringHelpers
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using System.Text.RegularExpressions;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Helpers
{
  public static class ContentStringHelpers
  {
    public static HtmlWebViewSource GetHtmlWebViewSource(
      this IHaveContentString iHaveContentString)
    {
      string str = "<div style=\"display: block; overflow: hidden; text-overflow: ellipsis;\">" + Regex.Replace(new Regex("(http:\\/\\/|https:\\/\\/|www.)([\\w_-]+(?:(?:\\.[\\w_-]+)+))([\\w.,@?^=%&:\\/~+#-]*[\\w@?^=%&\\/~+#-])?", RegexOptions.IgnoreCase).Replace(Regex.Replace(Regex.Replace(iHaveContentString.Content, "<a href=.*?\">", string.Empty), "</a>", string.Empty), "<a href=\"$&\" target=\"_blank\">$&</a>").Replace("href=\"www.", "href=\"http://www."), "\\r\\n|\\r|\\n", "<br>") + "</div>";
      HtmlWebViewSource htmlWebViewSource = new HtmlWebViewSource();
      htmlWebViewSource.set_Html(str);
      return htmlWebViewSource;
    }
  }
}
