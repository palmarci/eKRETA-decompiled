// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Profile
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models.HomeWork;
using Ekreta.Mobile.Core.Models.PushNotification;
using Newtonsoft.Json;
using System.Collections.Generic;

namespace Ekreta.Mobile.Core.Models
{
  public class Profile
  {
    public string Id { get; set; }

    [JsonIgnore]
    public string RolelessId
    {
      get
      {
        if (!this.Id.Contains("_"))
          return this.Id;
        return this.Id.Split('_')[0];
      }
    }

    public Student Student { get; set; }

    public Institute Institute { get; set; }

    public bool IsActive { get; set; }

    public IEnumerable<Event> Events { get; set; }

    [JsonIgnore]
    public IEnumerable<Exam> Exams { get; set; }

    public List<TanarHaziFeladat> TeacherHomeWorks { get; set; } = new List<TanarHaziFeladat>();

    public List<TanuloHaziFeladat> StudentHomeWorks { get; set; } = new List<TanuloHaziFeladat>();

    public IDictionary<string, List<NewsItem>> NewItems { get; set; } = (IDictionary<string, List<NewsItem>>) new Dictionary<string, List<NewsItem>>();

    public TokenInfo TokenInfo { get; set; }

    public PushSettings PushSettings { get; set; }

    [JsonIgnore]
    public bool IsTutelary
    {
      get
      {
        return this.TokenInfo.Role == UserRoles.Tutelary;
      }
    }

    [JsonIgnore]
    public int NewItemsCount { get; set; }

    public bool IsFirstLogin { get; set; } = true;
  }
}
