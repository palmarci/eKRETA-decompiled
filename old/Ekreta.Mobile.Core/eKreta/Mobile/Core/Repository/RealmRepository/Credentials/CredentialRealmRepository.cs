// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Credentials.CredentialRealmRepository
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Repository.Interfaces;
using MvvmCross;
using Realms;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Credentials
{
  public class CredentialRealmRepository : BaseRealmRepository<Ekreta.Mobile.Core.Models.Credentials, CredentialRealm>, ICredentialRealmRepository, IRepository<Ekreta.Mobile.Core.Models.Credentials>
  {
    public CredentialRealmRepository()
    {
      this._mapper = (IRealmMapper<Ekreta.Mobile.Core.Models.Credentials, CredentialRealm>) new CredentialRealmMappers();
      ISecureStore secureStore = (ISecureStore) Mvx.get_IoCProvider().Resolve<ISecureStore>();
      RealmConfiguration realmConfiguration = new RealmConfiguration("kretaellenorzo.cr.realm");
      ((RealmConfigurationBase) realmConfiguration).set_EncryptionKey(secureStore.GetEncryptionKey());
      ((RealmConfigurationBase) realmConfiguration).set_SchemaVersion(1UL);
      ((RealmConfigurationBase) realmConfiguration).set_ObjectClasses(new Type[1]
      {
        typeof (CredentialRealm)
      });
      this._realmConfiguration = realmConfiguration;
    }
  }
}
