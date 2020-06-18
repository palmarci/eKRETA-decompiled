// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.Models.ClassGroupContainerNotUid
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Repository.Interfaces.DataServices;
using MvvmCross;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;

namespace Ekreta.Mobile.Core.Models
{
  public abstract class ClassGroupContainerNotUid
  {
    private ClassGroup _classGroup;

    [JsonIgnore]
    public ClassGroup ClassGroupD
    {
      get
      {
        if (this._classGroup == null)
        {
          List<ClassGroup> osztalyCsoportok = this.GetActiveStudent().OsztalyCsoportok;
          this._classGroup = osztalyCsoportok != null ? osztalyCsoportok.FirstOrDefault<ClassGroup>((Func<ClassGroup, bool>) (x => x.IsAktiv && x.Uid == this.OsztalyCsoportId)) : (ClassGroup) null;
        }
        return this._classGroup;
      }
    }

    public string OsztalyCsoportId { get; set; }

    protected IStudentDataService GetStudentDataService()
    {
      return (IStudentDataService) Mvx.get_IoCProvider().Resolve<IStudentDataService>();
    }

    protected IProfileDataService GetProfileDataService()
    {
      return (IProfileDataService) Mvx.get_IoCProvider().Resolve<IProfileDataService>();
    }

    protected Student GetActiveStudent()
    {
      return this.GetStudentDataService().GetStudent(this.GetProfileDataService().GetActiveProfile());
    }
  }
}
