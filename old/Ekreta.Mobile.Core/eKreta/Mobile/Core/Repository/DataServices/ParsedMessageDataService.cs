// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.DataServices.ParsedMessageDataService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.Repositories;
using MvvmCross;

namespace Ekreta.Mobile.Core.Repository.DataServices
{
  public class ParsedMessageDataService : IParsedMessageDataService, IDataService
  {
    private readonly IParsedMessageRepository _parsedMessageRepository;

    public ParsedMessageDataService()
    {
      this._parsedMessageRepository = (IParsedMessageRepository) Mvx.get_IoCProvider().Resolve<IParsedMessageRepository>();
    }

    public void AddMessageId(string id)
    {
      this._parsedMessageRepository.AddOrUpdate(id);
    }

    public bool IsMessageParsed(string id)
    {
      return this._parsedMessageRepository.Find(id) != null;
    }
  }
}
