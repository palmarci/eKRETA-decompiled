// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Note
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
  public class Note : ClassGroupContainer, IEquatable<Note>, INewItem, IHaveContentString
  {
    public string PrimaryId
    {
      get
      {
        return string.Format("{0}-{1}", (object) this.NoteId, (object) this.ProfileId);
      }
    }

    public string ImageSource { get; set; }

    public bool SeenByUser { get; set; }

    public int NoteId { get; set; }

    public string Type { get; set; }

    public string Title { get; set; }

    public string Content { get; set; }

    public string Teacher { get; set; }

    public DateTime Date { get; set; }

    public DateTime CreatingTime { get; set; }

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
      return obj is Note note && this.NoteId == note.NoteId && (this.Type == note.Type && this.Title == note.Title) && (this.Content == note.Content && this.Teacher == note.Teacher && this.Date == note.Date) && this.CreatingTime == note.CreatingTime;
    }

    public bool Equals(Note other)
    {
      return this.Equals((object) other);
    }

    public override int GetHashCode()
    {
      return ((((((381964712 * -1521134295 + this.NoteId.GetHashCode()) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Type)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Title)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Content)) * -1521134295 + EqualityComparer<string>.Default.GetHashCode(this.Teacher)) * -1521134295 + this.Date.GetHashCode()) * -1521134295 + this.CreatingTime.GetHashCode();
    }
  }
}
