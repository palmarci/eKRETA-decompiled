// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.EvaluationDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using Ekreta.Mobile.Core.Repository.RealmRepository;
using Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation;
using MvvmCross;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Linq;
using System.Linq.Expressions;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class EvaluationDetailViewModel : ViewModelBase<EvaluationRealm>
  {
    private const int FiveEvaluation = 5;
    private readonly IMvxMessenger _messenger;
    private readonly IEvaluationDbDataService _evaluationDataService;
    private bool _showRating;
    private EvaluationRealm _evaluation;
    private ClassGroupRealm _classGroup;

    public EvaluationDetailViewModel()
    {
      this._showRating = false;
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this._evaluationDataService = (IEvaluationDbDataService) Mvx.get_IoCProvider().Resolve<IEvaluationDbDataService>();
    }

    public EvaluationRealm Evaluation
    {
      get
      {
        return this._evaluation;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<EvaluationRealm>((M0&) ref this._evaluation, (M0) value, nameof (Evaluation));
      }
    }

    public ClassGroupRealm ClassGroup
    {
      get
      {
        return this._classGroup;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<ClassGroupRealm>((M0&) ref this._classGroup, (M0) value, nameof (ClassGroup));
      }
    }

    public virtual void Prepare(EvaluationRealm parameter)
    {
      this.Evaluation = parameter;
      this.ClassGroup = ((IQueryable<ClassGroupRealm>) RealmDb.Instance.All<ClassGroupRealm>()).FirstOrDefault<ClassGroupRealm>((Expression<Func<ClassGroupRealm, bool>>) (x => x.Uid == this.Evaluation.OsztalyCsoportUid && x.IsAktiv));
      this.EvaluationNewItem();
    }

    public override void ViewDisappearing()
    {
      if (this._showRating)
        this._modalDialog.InvokeRatingFlow(this._profileDataService.GetActiveProfile());
      base.ViewDisappearing();
    }

    private void EvaluationNewItem()
    {
      if (this.Evaluation.SeenByUser)
        return;
      if (this.Evaluation.NumberValue == 5 && this.Evaluation.Form.Equals("Mark"))
        this._showRating = true;
      this._evaluationDataService.AddOrUpdate(this.Evaluation, (Action<EvaluationRealm>) (evaluation => evaluation.SeenByUser = true));
      this._messenger.Publish<NewsItemsRemovedMessage>((M0) new NewsItemsRemovedMessage((object) this, 1));
    }
  }
}
