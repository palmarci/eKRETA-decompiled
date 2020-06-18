// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Services.MailService
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Models.Environments;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using MvvmCross.Localization;
using Plugin.DeviceInfo;
using Plugin.VersionTracking;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;

namespace Ekreta.Mobile.Core.Services
{
  public class MailService : IMailService
  {
    private readonly IMvxTextProvider _textProvider;
    private readonly IDeviceSpecification _deviceSpecification;
    private readonly IStudentDataService _studentDataService;
    private readonly IWebNavigation _webNavigation;

    public MailService()
    {
      this._textProvider = (IMvxTextProvider) Mvx.get_IoCProvider().Resolve<IMvxTextProvider>();
      this._deviceSpecification = (IDeviceSpecification) Mvx.get_IoCProvider().Resolve<IDeviceSpecification>();
      this._studentDataService = (IStudentDataService) Mvx.get_IoCProvider().Resolve<IStudentDataService>();
      this._webNavigation = (IWebNavigation) Mvx.get_IoCProvider().Resolve<IWebNavigation>();
    }

    public void SendRatingMail(Rating rating, Profile profile)
    {
      try
      {
        if (profile.Student == null)
          profile.Student = this._studentDataService.GetStudent(profile);
        this.SendMail(this._textProvider.GetText((string) null, (string) null, "Rating_EmailSubject"), this.PutExtraContent(this.GetTemplateContent("EmailTemplates.RatingEmailTemplate.html").Replace("[sender]", this.GetSenderName(profile)).Replace("[message]", rating.Description), profile, rating.SensitiveData), ConfigurationRepository.EnvironmentSetting.RatingEmail);
      }
      catch (Exception ex)
      {
        throw ex;
      }
    }

    private string GetSenderName(Profile profile)
    {
      if (!profile.IsTutelary)
        return profile?.Student?.DisplayName;
      Profile profile1 = profile;
      if (profile1 == null)
        return (string) null;
      Student student = profile1.Student;
      if (student == null)
        return (string) null;
      IEnumerable<Tutelary> tutelaries = student.Tutelaries;
      if (tutelaries == null)
        return (string) null;
      IEnumerable<Tutelary> source = tutelaries.Where<Tutelary>((Func<Tutelary, bool>) (t => t.TutelaryId.ToString() == profile.TokenInfo.TutelaryId));
      if (source == null)
        return (string) null;
      return source.FirstOrDefault<Tutelary>()?.Name;
    }

    private string PutExtraContent(string content, Profile profile, bool sensitiveData)
    {
      try
      {
        string newValue = CrossVersionTracking.get_Current().get_CurrentVersion() + "." + CrossVersionTracking.get_Current().get_CurrentBuild();
        content = content.Replace("[version]", newValue);
        content = content.Replace("[os]", string.Format("{0} {1}", (object) CrossDeviceInfo.get_Current().get_Platform(), (object) CrossDeviceInfo.get_Current().get_Version()));
        content = content.Replace("[device]", CrossDeviceInfo.get_Current().get_Manufacturer() + " " + CrossDeviceInfo.get_Current().get_DeviceName() + " ");
        if (sensitiveData)
        {
          content = content.Replace("[name]", profile.Student.DisplayName);
          content = content.Replace("[institution]", profile.Institute.Name);
          content = content.Replace("[instituteCode]", profile.Student.InstituteCode);
        }
      }
      catch (Exception ex)
      {
        throw ex;
      }
      return content;
    }

    private string GetTemplateContent(string templateName)
    {
      try
      {
        using (StreamReader streamReader = new StreamReader(Assembly.GetExecutingAssembly().GetManifestResourceStream("Ekreta.Mobile.Core.Resources." + templateName)))
          return streamReader.ReadToEnd();
      }
      catch (Exception ex)
      {
        throw ex;
      }
    }

    private void SendMail(string subject, string description, string to)
    {
      try
      {
        this._webNavigation.OpenUrl("mailto:" + to + "?subject=" + subject + "&body=" + description);
      }
      catch (Exception ex)
      {
        throw ex;
      }
    }
  }
}
