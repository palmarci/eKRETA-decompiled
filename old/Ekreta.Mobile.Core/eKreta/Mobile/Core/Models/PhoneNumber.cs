// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.PhoneNumber
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;

namespace Ekreta.Mobile.Core.Models
{
  public class PhoneNumber
  {
    public string Uid { get; set; }

    public string Telefonszam { get; set; }

    public string Tipus { get; set; }

    public bool IsAlapertelmezett { get; set; }

    [JsonIgnore]
    public bool IsPublic
    {
      get
      {
        return this.Tipus == "PublikusTelefonszam";
      }
    }
  }
}
