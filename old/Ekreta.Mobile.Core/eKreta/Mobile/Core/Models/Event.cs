// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Event
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using Xamarin.Forms;

namespace Ekreta.Mobile.Core.Models
{
  public class Event : IEquatable<Event>, INewItem, IHaveContentString
  {
    public string ImageSource { get; set; }

    public bool SeenByUser { get; set; }

    [JsonIgnore]
    public string Id { get; set; } = Guid.NewGuid().ToString();

    public int EventId { get; set; }

    public DateTime Date { get; set; }

    public string Content { get; set; }

    public string Title { get; set; }

    [JsonIgnore]
    public string ProfileId { get; set; }

    [JsonIgnore]
    public HtmlWebViewSource WebViewSource
    {
      get
      {
        return this.GetHtmlWebViewSource();
      }
    }

    public override bool Equals(object obj)
    {
      return obj is Event @event && this.Id == @event.Id && (this.EventId == @event.EventId && this.Date == @event.Date) && this.Title == @event.Title && this.Content == @event.Content;
    }

    public bool Equals(Event other)
    {
      return this.Equals((object) other);
    }

    public override int GetHashCode()
    {
      return (((-942168464 * -1521134295 + this.EventId.GetHashCode()) * -1521134295 + this.Date.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Content)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Title);
    }
  }
}
