// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Extensions.StreamExtension
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Newtonsoft.Json;
using System.IO;

namespace Ekreta.Mobile.Core.Extensions
{
  public static class StreamExtension
  {
    public static T Deserialize<T>(this Stream s)
    {
      using (StreamReader streamReader = new StreamReader(s))
      {
        using (JsonTextReader jsonTextReader = new JsonTextReader((TextReader) streamReader))
          return new JsonSerializer().Deserialize<T>((JsonReader) jsonTextReader);
      }
    }

    public static void Serialize(this Stream s, object value)
    {
      using (StreamWriter streamWriter = new StreamWriter(s))
      {
        using (JsonTextWriter jsonTextWriter = new JsonTextWriter((TextWriter) streamWriter))
        {
          new JsonSerializer().Serialize((JsonWriter) jsonTextWriter, value);
          ((JsonWriter) jsonTextWriter).Flush();
        }
      }
    }
  }
}
