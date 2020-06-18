// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.ExamsDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Extensions;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository.Exam;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class ExamsDetailViewModel : ViewModelBase<ExamRealm>
  {
    private readonly IMvxMessenger _messenger;
    private readonly IExamDbDataService _examDataService;
    private ExamRealm _exam;

    public ExamsDetailViewModel()
    {
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._examDataService = (IExamDbDataService) Mvx.get_IoCProvider().Resolve<IExamDbDataService>();
    }

    public ExamRealm Exam
    {
      get
      {
        return this._exam;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ExamRealm>((M0&) ref this._exam, (M0) value, nameof (Exam));
      }
    }

    public virtual void Prepare(ExamRealm parameter)
    {
      this.Exam = parameter;
      if (this.Exam.SeenByUser)
        return;
      this.Exam.SeenByUser();
      this._messenger.Publish<NewsItemsRemovedMessage>((M0) new NewsItemsRemovedMessage((object) this, 1));
    }
  }
}
