// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.ParsedMessage.ParsedMessageRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.ParsedMessage
{
  public class ParsedMessageRealmMapper : IRealmMapper<string, ParsedMessageRealm>, IMapper<string, ParsedMessageRealm>
  {
    public string From(ParsedMessageRealm item)
    {
      return item.Id;
    }

    public ParsedMessageRealm To(string item)
    {
      return new ParsedMessageRealm() { Id = item };
    }
  }
}
