// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.Statistics
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using MvvmCross.ViewModels;

namespace Ekreta.Mobile.Core.Models
{
  public class Statistics : MvxNotifyPropertyChanged
  {
    private string _Subject;
    private double? _Average;
    private int _EvaluationNumber;
    private int _OtherEvaluationNumber;
    private int _AbsencesJustified;
    private int _AbsencesUnjustified;

    public string Subject
    {
      get
      {
        return this._Subject;
      }
      set
      {
        this.SetProperty<string>((M0&) ref this._Subject, (M0) value, nameof (Subject));
      }
    }

    public double? Average
    {
      get
      {
        return this._Average;
      }
      set
      {
        this.SetProperty<double?>((M0&) ref this._Average, (M0) value, nameof (Average));
      }
    }

    public int EvaluationNumber
    {
      get
      {
        return this._EvaluationNumber;
      }
      set
      {
        this.SetProperty<int>((M0&) ref this._EvaluationNumber, (M0) value, nameof (EvaluationNumber));
      }
    }

    public int OtherEvaluationNumber
    {
      get
      {
        return this._OtherEvaluationNumber;
      }
      set
      {
        this.SetProperty<int>((M0&) ref this._OtherEvaluationNumber, (M0) value, nameof (OtherEvaluationNumber));
      }
    }

    public int AbsencesJustified
    {
      get
      {
        return this._AbsencesJustified;
      }
      set
      {
        this.SetProperty<int>((M0&) ref this._AbsencesJustified, (M0) value, nameof (AbsencesJustified));
      }
    }

    public int AbsencesUnjustified
    {
      get
      {
        return this._AbsencesUnjustified;
      }
      set
      {
        this.SetProperty<int>((M0&) ref this._AbsencesUnjustified, (M0) value, nameof (AbsencesUnjustified));
      }
    }

    public bool IsMediumLevel
    {
      get
      {
        double? average1 = this.Average;
        double num1 = 2.0;
        if (!(average1.GetValueOrDefault() > num1 & average1.HasValue))
          return false;
        double? average2 = this.Average;
        double num2 = 4.0;
        return average2.GetValueOrDefault() < num2 & average2.HasValue;
      }
    }

    public bool IsHighLevel
    {
      get
      {
        double? average = this.Average;
        double num = 4.0;
        return average.GetValueOrDefault() >= num & average.HasValue;
      }
    }

    public Statistics()
    {
      base.\u002Ector();
    }
  }
}
