// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Exceptions.ExceptionExtensions
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text.RegularExpressions;

namespace Ekreta.Mobile.Core.Exceptions
{
  public static class ExceptionExtensions
  {
    public static T SetErrorCode<T>(this T exception, [CallerFilePath] string callerFilePath = "", [CallerLineNumber] int lineNumber = 0) where T : Exception
    {
      if (exception is ExceptionErrorCodeBase exceptionErrorCodeBase && string.IsNullOrWhiteSpace(exceptionErrorCodeBase.ErrorCode))
      {
        MatchCollection source = Regex.Matches(Regex.Match(callerFilePath, "[a-zA-Z]{0,99}.cs").Value, "[A-Z]+");
        string str = string.Join(string.Empty, source.Cast<Match>().Select<Match, string>((Func<Match, string>) (match => match.Value)));
        exceptionErrorCodeBase.ErrorCode = string.Format("{0}{1}", (object) str, (object) lineNumber);
      }
      return exception;
    }
  }
}
