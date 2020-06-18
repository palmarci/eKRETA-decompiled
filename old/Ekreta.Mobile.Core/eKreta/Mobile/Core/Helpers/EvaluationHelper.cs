// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.EvaluationHelper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using eKreta.Mobile.Core.Models;

namespace Ekreta.Mobile.Core.Helpers
{
  public static class EvaluationHelper
  {
    public static string GetId(Evaluation item)
    {
      return item.EvaluationId.ToString() + "_" + item.EvaluationTitle;
    }
  }
}
