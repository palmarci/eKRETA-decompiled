// Decompiled with JetBrains decompiler
// Type: eKreta.Mobile.Droid.Platform.DataViewer.DataViewer
// Assembly: ekreta.mobile.android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null
// MVID: 5AC5B4C2-D6F9-4E4C-B9A2-B3DB64BB8F15
// Assembly location: C:\fakepath\\Desktop\ekreta.mobile.android.dll

using Android.App;
using Android.Content;
using Android.Net;
using Android.OS;
using Android.Support.V4.Content;
using Android.Webkit;
using Android.Widget;
using Ekreta.Mobile.Core.Interfaces;
using Java.IO;
using Java.Lang;
using System;
using Xamarin.Forms;

namespace eKreta.Mobile.Droid.Platform.DataViewer
{
  public class DataViewer : IDataViewer
  {
    public void ShowAttachment(string AttachmentName)
    {
      File attachment = this.GetFilePath(AttachmentName);
      if (!attachment.Exists())
        return;
      Device.BeginInvokeOnMainThread((Action) (() =>
      {
        Uri uriForFile = FileProvider.GetUriForFile(Application.get_Context(), "hu.eKreta.KretaAndroid.provider", attachment);
        Intent intent = new Intent("android.intent.action.VIEW");
        string typeFromExtension = MimeTypeMap.get_Singleton().GetMimeTypeFromExtension(MimeTypeMap.GetFileExtensionFromUrl(Object.op_Explicit((Object) uriForFile)).ToLower());
        intent.SetDataAndType(uriForFile, typeFromExtension);
        intent.SetFlags((ActivityFlags) 268959744);
        intent.AddFlags((ActivityFlags) 1);
        try
        {
          Xamarin.Forms.Forms.get_Context().StartActivity(intent);
        }
        catch (Exception ex)
        {
          Toast.MakeText(Xamarin.Forms.Forms.get_Context(), "No Application Available to View this file", (ToastLength) 0).Show();
        }
      }));
    }

    public string GetFolderPath()
    {
      return Environment.GetExternalStoragePublicDirectory(Environment.get_DirectoryDownloads()).get_AbsolutePath();
    }

    private File GetFilePath(string AttachmentName)
    {
      return new File(this.GetFolderPath(), AttachmentName);
    }

    public bool IsFileExists(string AttachmentName)
    {
      return this.GetFilePath(AttachmentName).Exists();
    }

    public string FilePath(string AttachmentName)
    {
      return this.GetFilePath(AttachmentName).get_AbsolutePath();
    }
  }
}
