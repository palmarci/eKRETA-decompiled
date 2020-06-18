// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.SecureStore
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using MvvmCross;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using Xamarin.Auth;

namespace Ekreta.Mobile.Core.Helpers
{
  public class SecureStore : ISecureStore
  {
    private const string OldSecureStoreServiceId = "eKreta";
    private const string SecureStoreServiceId = "eKreta-Ellenorzo";
    private const string EncryptionKey = "RealmEncryptionKey";
    private AccountStore _store;
    private readonly IKeyStore _keyStore;

    private AccountStore Store
    {
      get
      {
        return this._store ?? (this._store = this._keyStore != null ? this._keyStore.GetKeyStore() : AccountStore.Create());
      }
    }

    public SecureStore()
    {
      if (!Mvx.get_IoCProvider().CanResolve<IKeyStore>())
        return;
      this._keyStore = (IKeyStore) Mvx.get_IoCProvider().Resolve<IKeyStore>();
    }

    public void DeleteTokenData(string profileId)
    {
      Account account = this.Store.FindAccountsForService("eKreta-Ellenorzo").FirstOrDefault<Account>((Func<Account, bool>) (x => x.get_Username() == profileId));
      if (account == null)
        return;
      this.Store.Delete(account, "eKreta-Ellenorzo");
    }

    public TokenData GetTokenData(string profileId)
    {
      TokenData tokenData = (TokenData) null;
      if (profileId == null)
        return (TokenData) null;
      Account account = this.Store.FindAccountsForService("eKreta-Ellenorzo").FirstOrDefault<Account>((Func<Account, bool>) (x => x.get_Username() == profileId));
      if (account != null)
      {
        string str1;
        account.get_Properties().TryGetValue("AccessToken", out str1);
        string str2;
        account.get_Properties().TryGetValue("RefreshToken", out str2);
        string str3;
        account.get_Properties().TryGetValue("ExpiresIn", out str3);
        string str4;
        account.get_Properties().TryGetValue("TokenType", out str4);
        string s;
        account.get_Properties().TryGetValue("ExpiresAt", out s);
        DateTime result;
        DateTime.TryParse(s, out result);
        if (!string.IsNullOrEmpty(account.get_Username()) && !string.IsNullOrEmpty(str1) && !string.IsNullOrEmpty(str2))
          tokenData = new TokenData()
          {
            AccessToken = str1,
            RefreshToken = str2,
            ExpiresIn = str3,
            TokenType = str4,
            ExpiresAt = result
          };
      }
      return tokenData;
    }

    public void SaveTokenData(string profileId, TokenData tokenData)
    {
      this.DeleteTokenData(profileId);
      Account account = new Account(profileId);
      account.get_Properties()["AccessToken"] = tokenData.AccessToken;
      account.get_Properties()["RefreshToken"] = tokenData.RefreshToken;
      account.get_Properties()["ExpiresIn"] = tokenData.ExpiresIn;
      account.get_Properties()["TokenType"] = tokenData.TokenType;
      account.get_Properties()["ExpiresAt"] = tokenData.ExpiresAt.ToString((IFormatProvider) CultureInfo.InvariantCulture);
      this.Store.Save(account, "eKreta-Ellenorzo");
    }

    public byte[] GetEncryptionKey()
    {
      string s;
      (this.Store.FindAccountsForService("eKreta-Ellenorzo").FirstOrDefault<Account>((Func<Account, bool>) (x => x.get_Username() == "RealmEncryptionKey")) ?? this.SaveEncryptionAccount()).get_Properties().TryGetValue("RealmEncryptionKey", out s);
      return Convert.FromBase64String(s);
    }

    private Account SaveEncryptionAccount()
    {
      Account account = new Account("RealmEncryptionKey");
      account.get_Properties()["RealmEncryptionKey"] = this.CreateEncryptionKey();
      this.Store.Save(account, "eKreta-Ellenorzo");
      return account;
    }

    private string CreateEncryptionKey()
    {
      byte[] numArray = new byte[64];
      new Random().NextBytes(numArray);
      return Convert.ToBase64String(numArray);
    }

    public void MigrateOldStore()
    {
      IEnumerable<Account> accountsForService = this.Store.FindAccountsForService("eKreta");
      if (accountsForService == null)
        return;
      using (IEnumerator<Account> enumerator = accountsForService.GetEnumerator())
      {
        while (((IEnumerator) enumerator).MoveNext())
        {
          Account current = enumerator.Current;
          this.Store.Save(current, "eKreta-Ellenorzo");
          this.Store.Delete(current, "eKreta");
        }
      }
    }

    public void MigrateProfileId(string oldProfileId, string newProfileId)
    {
      IEnumerable<Account> accountsForService = this.Store.FindAccountsForService("eKreta-Ellenorzo");
      Account account = accountsForService != null ? accountsForService.FirstOrDefault<Account>((Func<Account, bool>) (x => x.get_Username() == oldProfileId)) : (Account) null;
      if (account == null)
        return;
      account.set_Username(newProfileId);
      this.Store.Save(account, "eKreta-Ellenorzo");
    }
  }
}
