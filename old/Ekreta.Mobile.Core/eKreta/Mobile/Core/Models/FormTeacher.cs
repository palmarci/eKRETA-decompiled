// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.FormTeacher
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System;

namespace Ekreta.Mobile.Core.Models
{
  [Obsolete("Az új apiban már nem hsználjuk")]
  public class FormTeacher
  {
    public int TeacherId { get; set; }

    public string Name { get; set; }

    public string Email { get; set; }

    [JsonIgnore]
    public bool HasEmail
    {
      get
      {
        return !string.IsNullOrWhiteSpace(this.Email);
      }
    }

    public string PhoneNumber { get; set; }

    [JsonIgnore]
    public bool HasPhoneNumber
    {
      get
      {
        return !string.IsNullOrWhiteSpace(this.PhoneNumber);
      }
    }

    public bool HasEmailOrPhoneNumber
    {
      get
      {
        return this.HasEmail && this.HasPhoneNumber;
      }
    }
  }
}
