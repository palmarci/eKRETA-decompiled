// Decompiled with JetBrains decompiler
// Type: Ekreta.Mobile.Core.ViewModels.MessageDetailViewModel
// Assembly: Ekreta.Mobile.Core, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AA13053-CF9F-480D-A76A-8A5D6C4EE194
// Assembly location: C:\fakepath\\Desktop\Ekreta.Mobile.Core.dll

using Ekreta.Mobile.Core.Helpers;
using Ekreta.Mobile.Core.Interfaces;
using Ekreta.Mobile.Core.Messages;
using Ekreta.Mobile.Core.Models.Uzenetek;
using Ekreta.Mobile.Core.Monitoring;
using Ekreta.Mobile.Core.Repository.Interfaces.DataServices.Uzenetek;
using MvvmCross;
using MvvmCross.Commands;
using MvvmCross.Plugin.Messenger;
using MvvmCross.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ekreta.Mobile.Core.ViewModels
{
  public class MessageDetailViewModel : ViewModelBase<PostaladaElem>
  {
    private readonly IMvxMessenger _messenger;
    private readonly IUzenetDataService _uzenetDataService;
    private readonly IDataViewer _dataViewer;
    private PostaladaElem _postaladaElem;
    private MvxAsyncCommand<Csatolmany> _downloadCsatolmany;
    private string _cimzettek;

    public MessageDetailViewModel()
    {
      this._uzenetDataService = (IUzenetDataService) Mvx.get_IoCProvider().Resolve<IUzenetDataService>();
      this._dataViewer = (IDataViewer) Mvx.get_IoCProvider().Resolve<IDataViewer>();
      this._messenger = (IMvxMessenger) Mvx.get_IoCProvider().Resolve<IMvxMessenger>();
      this.SetTitle("MessageDetail_Page_Title");
    }

    public PostaladaElem PostaladaElem
    {
      get
      {
        return this._postaladaElem;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<PostaladaElem>((M0&) ref this._postaladaElem, (M0) value, nameof (PostaladaElem));
      }
    }

    public string Cimzettek
    {
      get
      {
        return this._cimzettek;
      }
      set
      {
        ((MvxNotifyPropertyChanged) this).SetProperty<string>((M0&) ref this._cimzettek, (M0) value, nameof (Cimzettek));
      }
    }

    public bool IsPossibliTruncated
    {
      get
      {
        return !this.HasInternetConnection && !this.PostaladaElem.IsElolvasva;
      }
    }

    public MvxAsyncCommand<Csatolmany> DownloadCsatolmany
    {
      get
      {
        return this._downloadCsatolmany ?? (this._downloadCsatolmany = new MvxAsyncCommand<Csatolmany>((Func<Csatolmany, Task>) (async x =>
        {
          MessageDetailViewModel messageDetailViewModel = this;
          try
          {
            messageDetailViewModel.IsLoading = true;
            string str = await messageDetailViewModel._uzenetDataService.FetchCsatolmany(messageDetailViewModel.ActiveProfile, x);
            messageDetailViewModel.IsLoading = false;
            messageDetailViewModel._dataViewer.ShowAttachment(x.FajlNev);
          }
          catch (Exception ex)
          {
            CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (DownloadCsatolmany), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MessageDetailViewModel.cs", 60);
          }
          finally
          {
            messageDetailViewModel.IsLoading = false;
          }
        }), (Func<Csatolmany, bool>) null, false));
      }
    }

    public virtual void Prepare(PostaladaElem parameter)
    {
      this.Prepare();
      this.PostaladaElem = parameter;
      this.Cimzettek = string.Join(",", parameter.Uzenet.CimzettLista.Select<Cimzett, string>((Func<Cimzett, string>) (x => x.Tipus.Nev + ": " + x.Nev)));
    }

    public virtual async Task Initialize()
    {
      MessageDetailViewModel messageDetailViewModel = this;
      try
      {
        messageDetailViewModel.IsLoading = true;
        PostaladaElem postaladaElem = await messageDetailViewModel._uzenetDataService.FetchPostaladaElem(messageDetailViewModel.ActiveProfile, messageDetailViewModel.PostaladaElem.Azonosito);
        messageDetailViewModel._uzenetDataService.AddOrUpdate(messageDetailViewModel.ActiveProfile, postaladaElem);
        messageDetailViewModel.PostaladaElem = postaladaElem;
        messageDetailViewModel._messenger.Publish<NewsItemsRemovedMessage>((M0) new NewsItemsRemovedMessage((object) messageDetailViewModel, 1));
        ((MvxNotifyPropertyChanged) messageDetailViewModel).RaisePropertyChanged("PostaladaElem");
        if (!messageDetailViewModel.PostaladaElem.IsElolvasva)
          await messageDetailViewModel._uzenetDataService.ReadPostaladaElem(messageDetailViewModel.ActiveProfile, messageDetailViewModel.PostaladaElem);
      }
      catch (Exception ex)
      {
        ErrorHandler.Current.HandleError(ex);
      }
      finally
      {
        messageDetailViewModel.IsLoading = false;
      }
      // ISSUE: reference to a compiler-generated method
      await messageDetailViewModel.\u003C\u003En__0();
    }

    private async Task ExecuteDownloadAttachment(Csatolmany attachment)
    {
      MessageDetailViewModel messageDetailViewModel = this;
      try
      {
        messageDetailViewModel.Busy();
        string str = await messageDetailViewModel._uzenetDataService.FetchCsatolmany(messageDetailViewModel.ActiveProfile, attachment);
        messageDetailViewModel.NotBusy();
        messageDetailViewModel._dataViewer.ShowAttachment(attachment.FajlNev);
      }
      catch (Exception ex)
      {
        CrossMobileAnalytics.Current.TrackException(ex, (IDictionary<string, string>) null, nameof (ExecuteDownloadAttachment), "/Users/admin/myagent/macMiniBlack3/_work/2/s/eKreta.Mobile/eKreta.Mobile.Core.Standard/ViewModels/MessageDetailViewModel.cs", (int) sbyte.MaxValue);
      }
      finally
      {
        messageDetailViewModel.NotBusy();
      }
    }
  }
}
