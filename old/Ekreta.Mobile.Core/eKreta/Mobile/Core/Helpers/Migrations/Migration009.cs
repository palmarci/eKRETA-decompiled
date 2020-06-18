// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Helpers.Migrations.Migration009
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using eKreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using Newtonsoft.Json;
using Plugin.Settings.Abstractions;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Helpers.Migrations
{
  public class Migration009 : MigrationBase
  {
    internal override void Migrate(ISettings appSettings, ISecureStore secureStore = null)
    {
      Mvx.get_IoCProvider().Resolve<IRefreshDataService>();
      string valueOrDefault1 = appSettings.GetValueOrDefault("settings_profiles_key", (string) null, (string) null);
      IEnumerable<Profile> profiles = string.IsNullOrEmpty(valueOrDefault1) ? (IEnumerable<Profile>) new List<Profile>() : (IEnumerable<Profile>) JsonConvert.DeserializeObject<IEnumerable<Profile>>(valueOrDefault1);
      string valueOrDefault2 = appSettings.GetValueOrDefault("settings_active_profile_guid", (string) null, (string) null);
      foreach (Profile profile1 in profiles)
      {
        string id = profile1.Id;
        if (valueOrDefault2 != null && id == valueOrDefault2)
          profile1.IsActive = true;
        Institute institute = profile1.Institute;
        TokenInfo tokenInfo = profile1.TokenInfo;
        PushSettings pushSettings = profile1.PushSettings;
        int role = (int) tokenInfo.Role;
        string newProfileRolelessId = string.Format("{0}-{1}", (object) institute.InstituteCode, (object) tokenInfo.InstituteUserId);
        string newProfileId = string.Format("{0}-{1}_{2}", (object) institute.InstituteCode, (object) tokenInfo.InstituteUserId, (object) role);
        if (profile1.Student != null)
        {
          Student student1 = profile1.Student;
          IEnumerable<Absence> absences1 = profile1.Student.Absences;
          IEnumerable<Absence> absences2 = absences1 != null ? absences1.Select<Absence, Absence>((Func<Absence, Absence>) (x =>
          {
            x.ProfileId = newProfileRolelessId;
            x.SeenByUser = true;
            return x;
          })) : (IEnumerable<Absence>) null;
          student1.Absences = absences2;
          Student student2 = profile1.Student;
          IEnumerable<Evaluation> evaluations1 = profile1.Student.Evaluations;
          IEnumerable<Evaluation> evaluations2 = evaluations1 != null ? evaluations1.Select<Evaluation, Evaluation>((Func<Evaluation, Evaluation>) (x =>
          {
            x.ProfileId = newProfileRolelessId;
            x.SeenByUser = true;
            return x;
          })) : (IEnumerable<Evaluation>) null;
          student2.Evaluations = evaluations2;
          Student student3 = profile1.Student;
          IEnumerable<Note> notes1 = profile1.Student.Notes;
          IEnumerable<Note> notes2 = notes1 != null ? notes1.Select<Note, Note>((Func<Note, Note>) (x =>
          {
            x.ProfileId = newProfileRolelessId;
            x.SeenByUser = true;
            return x;
          })) : (IEnumerable<Note>) null;
          student3.Notes = notes2;
          Profile profile2 = profile1;
          IEnumerable<Event> events1 = profile1.Events;
          IEnumerable<Event> events2 = events1 != null ? events1.Select<Event, Event>((Func<Event, Event>) (x =>
          {
            x.ProfileId = newProfileRolelessId;
            x.SeenByUser = true;
            return x;
          })) : (IEnumerable<Event>) null;
          profile2.Events = events2;
          profile1.Student.ProfileId = newProfileRolelessId;
          secureStore.MigrateProfileId(profile1.Id, newProfileId);
          profile1.Id = newProfileId;
        }
      }
    }
  }
}
