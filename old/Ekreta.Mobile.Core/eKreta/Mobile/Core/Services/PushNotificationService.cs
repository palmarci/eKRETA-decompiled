// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.PushNotificationService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Exceptions;
using Ekreta.Mobile.Core.Exceptions.PushMessage;
using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using eKreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.PushNotification.Enums;
using Ekreta.Mobile.Core.Models.Uzenetek;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using MvvmCross;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.Services
{
  public class PushNotificationService : IPushNotificationService
  {
    private const string PushNotificationEvent = "Push Notification";
    private const string PushNotificationNoProfileEvent = "Push Notification || No Profile";
    private const string PushNotificationNoItemEvent = "Push Notification || No Item";
    private const string PushNotificationDuplicatedMessageEvent = "Push Notification || Duplicated Message";
    private readonly IPushNotificationHandler _pushNotificationHandler;
    private readonly IParsedMessageDataService _parsedMessageDataService;
    private readonly IProfileDataService _profileDataService;
    private readonly IEvaluationDataService _evaluationDataService;
    private readonly IAbsenceDataService _absenceDataService;
    private readonly INoteDataService _noteDataService;
    private readonly IUzenetDataService _uzenetDataService;
    private readonly ILessonDataService _lessonDataService;
    private readonly IExamDataService _examDataService;

    public PushNotificationService()
    {
      this._pushNotificationHandler = (IPushNotificationHandler) Mvx.get_IoCProvider().Resolve<IPushNotificationHandler>();
      this._parsedMessageDataService = (IParsedMessageDataService) Mvx.get_IoCProvider().Resolve<IParsedMessageDataService>();
      this._profileDataService = (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
      this._evaluationDataService = (IEvaluationDataService) Mvx.get_IoCProvider().Resolve<IEvaluationDataService>();
      this._absenceDataService = (IAbsenceDataService) Mvx.get_IoCProvider().Resolve<IAbsenceDataService>();
      this._noteDataService = (INoteDataService) Mvx.get_IoCProvider().Resolve<INoteDataService>();
      this._uzenetDataService = (IUzenetDataService) Mvx.get_IoCProvider().Resolve<IUzenetDataService>();
      this._lessonDataService = (ILessonDataService) Mvx.get_IoCProvider().Resolve<ILessonDataService>();
      this._examDataService = (IExamDataService) Mvx.get_IoCProvider().Resolve<IExamDataService>();
    }

    public Ekreta.Mobile.Core.Models.PushNotification.PushMessage CreatePushMessage(
      IDictionary<string, string> properties)
    {
      Ekreta.Mobile.Core.Models.PushNotification.PushMessage pushMessage = (Ekreta.Mobile.Core.Models.PushNotification.PushMessage) null;
      bool flag = false;
      try
      {
        string str1;
        if (!properties.TryGetValue("Version", out str1))
          return (Ekreta.Mobile.Core.Models.PushNotification.PushMessage) null;
        string str2;
        properties.TryGetValue("InstituteCode", out str2);
        string s1;
        properties.TryGetValue("UserId", out s1);
        string s2;
        properties.TryGetValue("InstituteUserId", out s2);
        string s3;
        properties.TryGetValue("ItemId", out s3);
        string str3;
        properties.TryGetValue("Message", out str3);
        string str4;
        properties.TryGetValue("MessageId", out str4);
        string str5;
        properties.TryGetValue("NotificationType", out str5);
        string s4;
        properties.TryGetValue("NotificationRole", out s4);
        pushMessage = new Ekreta.Mobile.Core.Models.PushNotification.PushMessage()
        {
          Message = str3,
          MessageId = str4,
          NotificationRole = int.Parse(s4)
        };
        --pushMessage.NotificationRole;
        pushMessage.Version = str1;
        if (string.IsNullOrEmpty(str2))
          throw new InvalidPushNotificationException(properties, "InstituteCode", str2).SetErrorCode<InvalidPushNotificationException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 95);
        pushMessage.InstituteCode = str2;
        int result1;
        if (!string.IsNullOrEmpty(s1) && int.TryParse(s1, out result1))
        {
          pushMessage.UserId = result1;
        }
        else
        {
          int result2;
          if (string.IsNullOrEmpty(s2) || !int.TryParse(s2, out result2))
            throw new InvalidPushNotificationException(properties, "InstituteUserId", s2).SetErrorCode<InvalidPushNotificationException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 115);
          pushMessage.UserId = result2;
          CrossMobileAnalytics.Current.TrackException((Exception) new InvalidPushNotificationException(properties, "UserId", s1).SetErrorCode<InvalidPushNotificationException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 106), (IDictionary<string, string>) null, nameof (CreatePushMessage), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 109);
          flag = true;
        }
        int result3;
        if (string.IsNullOrEmpty(s3) || !int.TryParse(s3, out result3))
          throw new InvalidPushNotificationException(properties, "ItemId", s3).SetErrorCode<InvalidPushNotificationException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 124);
        pushMessage.ItemId = result3;
        NotificationMessageType result4;
        if (string.IsNullOrEmpty(str5) || !Enum.TryParse<NotificationMessageType>(str5, out result4))
          throw new InvalidPushNotificationException(properties, "NotificationType", str5).SetErrorCode<InvalidPushNotificationException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 133);
        pushMessage.NotificationType = result4;
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (CreatePushMessage), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 138);
      }
      if (flag)
        this.UpdateRegistrationsAsync(this._pushNotificationHandler.Token).Wait();
      return pushMessage;
    }

    public async Task<bool> HandleNotification(Ekreta.Mobile.Core.Models.PushNotification.PushMessage pushMessage)
    {
      object obj;
      int num;
      try
      {
        this.CheckMessageIsProcessed(pushMessage.MessageId);
        CrossMobileAnalytics.Current.TrackEvent("Push Notification", this.CreateAnonymMessageDictionary(pushMessage));
        this._parsedMessageDataService.AddMessageId(pushMessage.MessageId);
        return await Task.FromResult<bool>(true);
      }
      catch (DuplicatedPushMessageException ex)
      {
        obj = (object) ex;
        num = 1;
      }
      catch (Exception ex)
      {
        obj = (object) ex;
        num = 2;
      }
      switch (num)
      {
        case 1:
          CrossMobileAnalytics.Current.TrackEvent("Push Notification || Duplicated Message", this.CreateAnonymMessageDictionary(pushMessage));
          return await Task.FromResult<bool>(false);
        case 2:
          CrossMobileAnalytics.Current.TrackException((Exception) obj, this.CreateAnonymMessageDictionary(pushMessage), nameof (HandleNotification), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 169);
          return await Task.FromResult<bool>(false);
        default:
          bool flag;
          return flag;
      }
    }

    public async Task<bool> DownloadPostaladaElem(Profile profile, Ekreta.Mobile.Core.Models.PushNotification.PushMessage pushMessage)
    {
      try
      {
        PostaladaElem uzenet = await this._uzenetDataService.FetchPostaladaElem(profile, (long) pushMessage.ItemId);
        if (uzenet != null)
        {
          this._uzenetDataService.OverridePostaladaElem(profile, uzenet);
          return true;
        }
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      return false;
    }

    public async Task UpdateRegistrationsAsync(string token)
    {
      foreach (Profile profile in this._profileDataService.GetProfiles())
        await this.UpdateRegistrationsAsync(profile, token);
    }

    public async Task UpdateRegistrationsAsync(Profile profile, string token)
    {
      if (profile.PushSettings == null || !profile.PushSettings.IsPushActive)
        return;
      if (await this._profileDataService.NotificationUpdateAsync(profile, NotificationMessageType.All, token))
        return;
      int num = await this._profileDataService.NotificationRegistrationAsync(profile) ? 1 : 0;
    }

    public async Task RegisterOrUpdateRegistrationsAsync()
    {
      IEnumerable<Profile> profiles = this._profileDataService.GetProfiles();
      if (profiles == null)
        return;
      foreach (Profile profile1 in profiles)
      {
        Profile profile = profile1;
        if (profile.PushSettings == null || !profile.PushSettings.FirstTimePushRun)
        {
          if (profile.PushSettings != null && profile.PushSettings.RegistrationId != null)
          {
            int num1 = await this._profileDataService.NotificationDeleteAsync(profile, true) ? 1 : 0;
          }
          int num2 = await this._profileDataService.NotificationRegistrationAsync(profile) ? 1 : 0;
        }
        else if (profile.PushSettings.IsPushActive && profile.PushSettings.Token != this._pushNotificationHandler.Token && this._pushNotificationHandler.Token != null)
          await this.UpdateRegistrationsAsync(profile, this._pushNotificationHandler.Token);
        else if (!profile.PushSettings.UpdateEugyintezes)
          await this.UpdateRegistrationsAsync(profile, this._pushNotificationHandler.Token);
        profile = (Profile) null;
      }
    }

    private void CheckMessageIsProcessed(string messageId)
    {
      if (this._parsedMessageDataService.IsMessageParsed(messageId))
        throw new DuplicatedPushMessageException("Push Notification || Duplicated").SetErrorCode<DuplicatedPushMessageException>("/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/Services/PushNotificationService.cs", 251);
    }

    public bool IsPushMessageDownloaded(Ekreta.Mobile.Core.Models.PushNotification.PushMessage pushMessage)
    {
      NotificationMessageType notificationType = pushMessage.NotificationType;
      int itemId = pushMessage.ItemId;
      object obj;
      switch (notificationType)
      {
        case NotificationMessageType.Evaluation:
          obj = (object) this._evaluationDataService.GetEvaluations(this._profileDataService.GetActiveProfile()).Where<Evaluation>((Func<Evaluation, bool>) (x => x.EvaluationId == itemId)).FirstOrDefault<Evaluation>();
          break;
        case NotificationMessageType.Absence:
          obj = (object) this._absenceDataService.Get(itemId);
          break;
        case NotificationMessageType.Note:
          obj = (object) this._noteDataService.Get(this._profileDataService.GetActiveProfile(), itemId);
          break;
        case NotificationMessageType.Message:
          obj = (object) this._uzenetDataService.GetPostaladaElem(itemId);
          break;
        case NotificationMessageType.Homework:
          obj = (object) this._lessonDataService.GetByTeacherHomeworkId(itemId);
          break;
        case NotificationMessageType.Exam:
          obj = (object) this._examDataService.GetByUid(itemId);
          break;
        default:
          return false;
      }
      return obj != null;
    }

    private IDictionary<string, string> CreateAnonymMessageDictionary(
      Ekreta.Mobile.Core.Models.PushNotification.PushMessage pushMessage)
    {
      IDictionary<string, string> dictionary = pushMessage.AsStringDictionary(BindingFlags.Instance | BindingFlags.Public);
      dictionary.Remove("Message");
      dictionary.Remove("NotificationType");
      dictionary.Remove("ItemId");
      return dictionary;
    }
  }
}
