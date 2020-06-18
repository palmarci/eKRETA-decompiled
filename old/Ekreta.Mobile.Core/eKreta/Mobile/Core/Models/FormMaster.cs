// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.FormMaster
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross;
using MvvmCross.Localization;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Models
{
  public class FormMaster
  {
    private readonly IMvxTextProvider _textProvider;

    public FormMaster()
    {
      this._textProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
    }

    public string Uid { get; set; }

    public Teacher Tanar { get; set; }

    [JsonIgnore]
    public string TanarDisplayName
    {
      get
      {
        return this.ClassGroup != null ? this.Tanar.Alkalmazott.Nev + " " + this.ClassGroup.Nev + " " + this.ClassGroup.OktatasNevelesiFeladat.Leiras : this.Tanar?.Alkalmazott?.Nev;
      }
    }

    public string PublicEmail
    {
      get
      {
        Teacher tanar = this.Tanar;
        string str;
        if (tanar == null)
        {
          str = (string) null;
        }
        else
        {
          Employee alkalmazott = tanar.Alkalmazott;
          if (alkalmazott == null)
          {
            str = (string) null;
          }
          else
          {
            IEnumerable<EmailAddress> emailek = alkalmazott.Emailek;
            str = emailek != null ? emailek.FirstOrDefault<EmailAddress>((Func<EmailAddress, bool>) (x => x.IsPublic))?.Email : (string) null;
          }
        }
        return str ?? string.Empty;
      }
    }

    [JsonIgnore]
    public string PublicPhoneNumber
    {
      get
      {
        Teacher tanar = this.Tanar;
        string str;
        if (tanar == null)
        {
          str = (string) null;
        }
        else
        {
          Employee alkalmazott = tanar.Alkalmazott;
          str = alkalmazott != null ? alkalmazott.Telefonok.FirstOrDefault<PhoneNumber>((Func<PhoneNumber, bool>) (x => x.IsPublic))?.Telefonszam : (string) null;
        }
        return str ?? string.Empty;
      }
    }

    [JsonIgnore]
    public bool HasPublicPhoneNumber
    {
      get
      {
        return !string.IsNullOrWhiteSpace(this.PublicPhoneNumber);
      }
    }

    [JsonIgnore]
    public bool HasPublicEmail
    {
      get
      {
        return !string.IsNullOrWhiteSpace(this.PublicEmail);
      }
    }

    [JsonIgnore]
    public bool HasPublicContact
    {
      get
      {
        return this.Tanar.Alkalmazott.HasAnyPublicContact;
      }
    }

    [JsonIgnore]
    public ClassGroup ClassGroup { get; set; }
  }
}
