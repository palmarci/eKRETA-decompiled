// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IRemoteConfigurationService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IRemoteConfigurationService
  {
    List<string> GetKeyNames();

    bool CheckValueChanged(string key);

    void UpdateChangedList(
      Dictionary<string, string> oldValues,
      Dictionary<string, string> newValues);

    string GetPrefix();
  }
}
