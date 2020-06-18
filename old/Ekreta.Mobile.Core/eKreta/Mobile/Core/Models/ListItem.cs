// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.ListItem
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Models
{
  public class ListItem
  {
    public int Id { get; set; }

    public string StringId { get; set; }

    public Type Type { get; set; }

    public string Title { get; set; }

    public string Subtitle { get; set; }

    public string DateTitle { get; set; }

    public string ImageSource { get; set; }

    public DateTime Date { get; set; }

    public DateTime CreatingTime { get; set; }

    public bool SeenByUser { get; set; }
  }
}
