// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Uzenetek.PostaladaElem
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Newtonsoft.Json;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Models.Uzenetek
{
  public class PostaladaElem : IHaveContentString
  {
    [JsonProperty("azonosito")]
    public long Azonosito { get; set; }

    [JsonProperty("isElolvasva")]
    public bool IsElolvasva { get; set; }

    [JsonProperty("isToroltElem")]
    public bool IsToroltElem { get; set; }

    [JsonProperty("tipus")]
    public PostaladaElemTipusAdatSzotarElem Tipus { get; set; }

    [JsonProperty("uzenet")]
    public Uzenet Uzenet { get; set; }

    [JsonIgnore]
    public HtmlWebViewSource WebViewSource
    {
      get
      {
        return this.GetHtmlWebViewSource();
      }
    }

    [JsonIgnore]
    public string ProfileId { get; set; }

    [JsonIgnore]
    public string Content
    {
      get
      {
        return this.Uzenet.Szoveg;
      }
    }
  }
}
