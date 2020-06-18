// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Rating
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Models
{
  public class Rating
  {
    public int RatingId { get; set; }

    public DateTime LastSeenDate { get; set; }

    public int SeenCount { get; set; }

    public DateTime? Date { get; set; }

    public bool Liked { get; set; }

    public string Email { get; set; }

    public string Description { get; set; }

    public bool SensitiveData { get; set; }

    public string ProfileId { get; set; }

    public bool Show
    {
      get
      {
        return this.SeenCount < 3 && !this.Date.HasValue;
      }
    }
  }
}
