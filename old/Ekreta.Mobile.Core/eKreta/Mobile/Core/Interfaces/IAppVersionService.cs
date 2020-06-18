// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Interfaces.IAppVersionService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using System;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Interfaces
{
  public interface IAppVersionService
  {
    Task<bool> NeedUpdateApp(string platform, string version, string build);

    Task<bool> ShouldUpdateApp();

    Task<string> GDPRLink();

    string GetAppVersionDisplayText();

    Task<DateTime?> GDPRUpdateDate();

    Task<string> AndroidMobileStoreUrl();

    Task<string> IOSMobileStoreUrl();
  }
}
