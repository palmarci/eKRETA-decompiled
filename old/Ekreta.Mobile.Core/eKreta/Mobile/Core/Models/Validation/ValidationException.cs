// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Validation.ValidationException
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Collections.Generic;
using System.Text;

namespace Ekreta.Mobile.Core.Models.Validation
{
  public class ValidationException
  {
    public bool IsValidationException { get; set; }

    public string ErrorType { get; set; }

    public string Message { get; set; }

    public List<ValidationItem> ValidationItems { get; set; } = new List<ValidationItem>();

    public string GetAggregatedValidationMessage()
    {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.ValidationItems.Count == 1)
      {
        stringBuilder.Append(this.ValidationItems[0].Message);
      }
      else
      {
        foreach (ValidationItem validationItem in this.ValidationItems)
        {
          stringBuilder.Append("• ");
          stringBuilder.Append(validationItem.Message);
          stringBuilder.AppendLine();
        }
      }
      return stringBuilder.ToString();
    }
  }
}
