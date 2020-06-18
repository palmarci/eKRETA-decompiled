// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.SubjectAverage
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;

namespace Ekreta.Mobile.Core.Models
{
  public class SubjectAverage
  {
    public string SubjectUid { get; set; }

    public int SortIndex { get; set; }

    public string Subject { get; set; }

    public string SubjectCategory { get; set; }

    public string SubjectCategoryName { get; set; }

    public float? Value { get; set; }

    public float? ClassValue { get; set; }

    public float? Difference { get; set; }

    [Obsolete]
    public string ProfileId { get; set; }
  }
}
