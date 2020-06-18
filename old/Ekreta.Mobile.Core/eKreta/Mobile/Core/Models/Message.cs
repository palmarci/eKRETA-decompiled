// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Message
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Models
{
  public class Message : IEquatable<Message>
  {
    public int UzenetId { get; set; }

    public string Felado { get; set; }

    public string Targy { get; set; }

    public string Tartalom { get; set; }

    public string CreatingTime { get; set; }

    public bool Equals(Message other)
    {
      return this.Equals((object) other);
    }

    public override bool Equals(object obj)
    {
      return obj is Message message && this.UzenetId == message.UzenetId && (this.Felado == message.Felado && this.Targy == message.Targy) && this.CreatingTime == message.CreatingTime && this.Tartalom == message.Tartalom;
    }

    public Message(int id, string felado, string targy, string tartalom, string creatingTime)
    {
      this.UzenetId = id;
      this.Felado = felado;
      this.Targy = targy;
      this.Tartalom = tartalom;
      this.CreatingTime = creatingTime;
    }
  }
}
