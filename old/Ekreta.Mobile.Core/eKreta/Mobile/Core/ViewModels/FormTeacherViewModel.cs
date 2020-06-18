// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.FormTeacherViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross.Commands;
using MvvmCross.ViewModels;
using Plugin.Messaging;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;
using Xamarin.Essentials;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class FormTeacherViewModel : ViewModelBase
  {
    private ObservableCollection<FormMaster> _formMasters = new ObservableCollection<FormMaster>();
    private readonly IMessaging _messaging;
    private readonly IStudentDataService _studentDataService;
    private FormMaster _selectedFormMaster;
    private string _subject;
    private string _message;
    private MvxAsyncCommand _composeMessageCommand;
    private MvxAsyncCommand _makePhoneCallCommand;
    private bool _isCallButtonVisible;
    private bool _deviceCanStartCall;

    public FormTeacherViewModel(IMessaging messaging, IStudentDataService studentDataService)
    {
      this._messaging = messaging;
      this._studentDataService = studentDataService;
    }

    public bool IsCallButtonVisible
    {
      get
      {
        return this._isCallButtonVisible;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<bool>((M0&) ref this._isCallButtonVisible, (M0) (value ? 1 : 0), nameof (IsCallButtonVisible));
      }
    }

    public FormMaster SelectedFormMaster
    {
      get
      {
        return this._selectedFormMaster;
      }
      set
      {
        if (!((MvxNotifyPropertyChanged) this).SetProperty<FormMaster>((M0&) ref this._selectedFormMaster, (M0) value, nameof (SelectedFormMaster)))
          return;
        ((MvxCommandBase) this.ComposeMessageCommand).RaiseCanExecuteChanged();
        ((MvxCommandBase) this.MakePhoneCallCommand).RaiseCanExecuteChanged();
      }
    }

    public ObservableCollection<FormMaster> FormMasters
    {
      get
      {
        return this._formMasters;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ObservableCollection<FormMaster>>((M0&) ref this._formMasters, (M0) value, nameof (FormMasters));
      }
    }

    public string Subject
    {
      get
      {
        return this._subject;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._subject, (M0) value, nameof (Subject));
      }
    }

    public string Message
    {
      get
      {
        return this._message;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._message, (M0) value, nameof (Message));
      }
    }

    public MvxAsyncCommand ComposeMessageCommand
    {
      get
      {
        return this._composeMessageCommand ?? (this._composeMessageCommand = new MvxAsyncCommand(new Func<Task>(this.Compose), (Func<bool>) (() => this.CanComposeEmail() || this.CanComposeSms()), false));
      }
    }

    public MvxAsyncCommand MakePhoneCallCommand
    {
      get
      {
        return this._makePhoneCallCommand ?? (this._makePhoneCallCommand = new MvxAsyncCommand(new Func<Task>(this.ExecuteMakePhoneCallCommand), new Func<bool>(this.CanMakePhoneCall), false));
      }
    }

    public override void Start()
    {
      base.Start();
      ((MvxCommandBase) this.ComposeMessageCommand).RaiseCanExecuteChanged();
      ((MvxCommandBase) this.MakePhoneCallCommand).RaiseCanExecuteChanged();
    }

    public override void Prepare()
    {
      base.Prepare();
      Student student = this._studentDataService.GetStudent(this.ActiveProfile);
      foreach (FormMaster formMaster1 in student.Osztalyfonokok)
      {
        FormMaster formMaster = formMaster1;
        if (formMaster.Tanar?.Alkalmazott != null && formMaster.Tanar.Alkalmazott.HasAnyPublicContact)
        {
          ClassGroup classGroup = student.OsztalyCsoportok.FirstOrDefault<ClassGroup>((Func<ClassGroup, bool>) (x => x.OsztalyfonokUid == formMaster.Uid && x.IsAktiv));
          if (classGroup != null)
          {
            formMaster.ClassGroup = classGroup;
            this.FormMasters.Add(formMaster);
          }
        }
      }
    }

    public virtual async Task Initialize()
    {
      // ISSUE: reference to a compiler-generated method
      await this.\u003C\u003En__0();
      this._deviceCanStartCall = await Launcher.CanOpenAsync(new Uri("tel:"));
    }

    private bool CanComposeEmail()
    {
      return this.SelectedFormMaster != null && this.SelectedFormMaster.HasPublicEmail && this._messaging.get_EmailMessenger().get_CanSendEmail();
    }

    private bool CanComposeSms()
    {
      return this.SelectedFormMaster != null && this.SelectedFormMaster.HasPublicPhoneNumber && this._messaging.get_SmsMessenger().get_CanSendSms();
    }

    private bool CanMakePhoneCall()
    {
      if (this.SelectedFormMaster == null)
        return false;
      bool flag = this.SelectedFormMaster.HasPublicPhoneNumber && this._deviceCanStartCall;
      this.IsCallButtonVisible = flag;
      return flag;
    }

    private async Task Compose()
    {
      FormTeacherViewModel teacherViewModel = this;
      string smsText;
      string emailText;
      try
      {
        string text1 = teacherViewModel._textProvider.GetText((string) null, (string) null, "Button_ComposeMessage_Text");
        string text2 = teacherViewModel._textProvider.GetText((string) null, (string) null, "ActionSheet_Cancel_Text");
        smsText = teacherViewModel._textProvider.GetText((string) null, (string) null, "ActionSheet_Sms_Text");
        emailText = teacherViewModel._textProvider.GetText((string) null, (string) null, "ActionSheet_Email_Text");
        List<string> stringList = new List<string>();
        if (teacherViewModel.CanComposeEmail())
          stringList.Add(emailText);
        if (teacherViewModel.CanComposeSms())
          stringList.Add(smsText);
        TaskAwaiter<string> awaiter = teacherViewModel._modalDialog.DisplayActionSheetAsync(text1, text2, (string) null, stringList.ToArray()).GetAwaiter();
        if (!awaiter.IsCompleted)
        {
          int num;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003E1__state = num = 0;
          TaskAwaiter<string> taskAwaiter = awaiter;
          // ISSUE: explicit reference operation
          // ISSUE: reference to a compiler-generated field
          (^this).\u003C\u003Et__builder.AwaitUnsafeOnCompleted<TaskAwaiter<string>, FormTeacherViewModel.\u003CCompose\u003Ed__36>(ref awaiter, this);
          return;
        }
        string result = awaiter.GetResult();
        if (result == emailText)
        {
          EmailMessageBuilder emailMessageBuilder = new EmailMessageBuilder().To(teacherViewModel.SelectedFormMaster.PublicEmail).Subject(teacherViewModel.Subject).Body(teacherViewModel.Message);
          teacherViewModel._messaging.get_EmailMessenger().SendEmail(emailMessageBuilder.Build());
        }
        else if (result == smsText)
          teacherViewModel._messaging.get_SmsMessenger().SendSms(teacherViewModel.SelectedFormMaster.PublicPhoneNumber, teacherViewModel.Message);
        ((MvxCommandBase) teacherViewModel.ComposeMessageCommand).RaiseCanExecuteChanged();
      }
      catch (Exception ex)
      {
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003E1__state = -2;
        smsText = (string) null;
        emailText = (string) null;
        // ISSUE: explicit reference operation
        // ISSUE: reference to a compiler-generated field
        (^this).\u003C\u003Et__builder.SetException(ex);
        return;
      }
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003E1__state = -2;
      smsText = (string) null;
      emailText = (string) null;
      // ISSUE: explicit reference operation
      // ISSUE: reference to a compiler-generated field
      (^this).\u003C\u003Et__builder.SetResult();
    }

    private async Task ExecuteMakePhoneCallCommand()
    {
      await Launcher.OpenAsync(new Uri("tel:" + this.SelectedFormMaster.PublicPhoneNumber));
    }
  }
}
