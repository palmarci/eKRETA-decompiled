// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.ClassGroup
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

namespace Ekreta.Mobile.Core.Models
{
  public class ClassGroup
  {
    public string OsztalyCsoportTipus { get; set; }

    public string Nev { get; set; }

    public bool IsAktiv { get; set; }

    public string Uid { get; set; }

    public string OsztalyfonokUid { get; set; }

    public EducationTask OktatasNevelesiFeladat { get; set; }
  }
}
