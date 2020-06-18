// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation.EvaluationRealmMapper
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using eKreta.Mobile.Core.Models;
using Ekreta.Mobile.Core.Repository.Interfaces;
using System;

namespace Ekreta.Mobile.Core.Repository.RealmRepository.Evaluation
{
  public class EvaluationRealmMapper : IRealmMapper<eKreta.Mobile.Core.Models.Evaluation, EvaluationRealm>, IMapper<eKreta.Mobile.Core.Models.Evaluation, EvaluationRealm>
  {
    public eKreta.Mobile.Core.Models.Evaluation From(EvaluationRealm item)
    {
      eKreta.Mobile.Core.Models.Evaluation evaluation = new eKreta.Mobile.Core.Models.Evaluation();
      evaluation.EvaluationId = this.GetId(item);
      evaluation.CreatingTime = item.CreatingTime.LocalDateTime;
      evaluation.Date = item.Date.LocalDateTime;
      evaluation.Form = item.Form;
      evaluation.FormName = item.FormName;
      evaluation.Mode = item.Mode;
      evaluation.NumberValue = item.NumberValue;
      evaluation.Subject = item.Subject;
      evaluation.SubjectCategory = item.SubjectCategory;
      evaluation.SubjectCategoryName = item.SubjectCategoryName;
      evaluation.Teacher = item.Teacher;
      evaluation.Theme = item.Theme;
      evaluation.Type = item.Type;
      evaluation.TypeName = item.TypeName;
      evaluation.Value = item.Value;
      evaluation.Weight = item.Weight;
      evaluation.ProfileId = item.ProfileId;
      evaluation.SeenByUser = item.SeenByUser;
      evaluation.OsztalyCsoportUid = item.OsztalyCsoportUid;
      if (item.EvaluationNatureRealm != null)
        evaluation.EvaluationNature = new EvaluationNature()
        {
          Id = item.EvaluationNatureRealm.Id,
          Description = item.EvaluationNatureRealm.Description,
          Name = item.EvaluationNatureRealm.Name
        };
      return evaluation;
    }

    public EvaluationRealm To(eKreta.Mobile.Core.Models.Evaluation item)
    {
      EvaluationRealm evaluationRealm = new EvaluationRealm();
      evaluationRealm.Id = EvaluationHelper.GetId(item);
      evaluationRealm.CreatingTime = new DateTimeOffset(item.CreatingTime);
      evaluationRealm.Date = new DateTimeOffset(item.Date);
      evaluationRealm.Form = item.Form;
      evaluationRealm.FormName = item.FormName;
      evaluationRealm.Mode = item.Mode;
      evaluationRealm.NumberValue = item.NumberValue;
      evaluationRealm.Subject = item.Subject;
      evaluationRealm.SubjectCategory = item.SubjectCategory;
      evaluationRealm.SubjectCategoryName = item.SubjectCategoryName;
      evaluationRealm.Teacher = item.Teacher;
      evaluationRealm.Theme = item.Theme;
      evaluationRealm.Type = item.Type;
      evaluationRealm.TypeName = item.TypeName;
      evaluationRealm.Value = item.Value;
      evaluationRealm.Weight = item.Weight;
      evaluationRealm.ProfileId = item.ProfileId;
      evaluationRealm.SeenByUser = item.SeenByUser;
      evaluationRealm.OsztalyCsoportUid = item.OsztalyCsoportUid;
      if (item.EvaluationNature != null)
        evaluationRealm.EvaluationNatureRealm = new EvaluationNatureRealm()
        {
          Id = item.EvaluationNature.Id,
          Description = item.EvaluationNature.Description,
          Name = item.EvaluationNature.Name
        };
      return evaluationRealm;
    }

    private int GetId(EvaluationRealm item)
    {
      string id;
      if (!item.Id.Contains("_"))
        id = item.Id;
      else
        id = item.Id.Split('_')[0];
      return int.Parse(id);
    }
  }
}
