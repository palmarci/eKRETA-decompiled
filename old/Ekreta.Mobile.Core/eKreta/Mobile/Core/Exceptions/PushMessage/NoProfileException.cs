// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.PushMessage.NoProfileException
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

namespace Ekreta.Mobile.Core.Exceptions.PushMessage
{
  public class NoProfileException : ExceptionErrorCodeBase
  {
    public string InstituteCode { get; set; }

    public int InstituteUserId { get; set; }

    public NoProfileException(string message)
      : base(message)
    {
    }

    public NoProfileException(string instituteCode, int instituteUserId, string message)
      : base(message)
    {
      this.InstituteCode = instituteCode;
      this.InstituteUserId = instituteUserId;
    }

    public NoProfileException(string instituteCode, int instituteUserId)
      : base(string.Format("No Profile saved with instituteCode: {0}, instituteUserId: {1}", (object) instituteCode, (object) instituteUserId))
    {
      this.InstituteCode = instituteCode;
      this.InstituteUserId = instituteUserId;
    }
  }
}
