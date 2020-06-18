package hu.ekreta.ellenorzo.attachment;

import a.a.a.f;
import a.b.a.a.a;
import a.o.a.e;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import h.m.d.d;
import h.w.v;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.file.FileAdapter;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import java.io.File;
import k.b.f0.b;
import k.b.n;
import k.b.u;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentServiceImpl;", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "fileAdapter", "Lhu/ekreta/ellenorzo/file/FileAdapter;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/file/FileAdapter;Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "chooseLocalFile", "Lio/reactivex/Single;", "Landroid/net/Uri;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "createChooserIntentForLocalFile", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "tmpFile", "Ljava/io/File;", "createGetContentIntent", "createImageCaptureIntent", "download", "Lio/reactivex/Observable;", "attachment", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "url", "", "accessToken", "toFileName", "openAttachment", "", "fileSource", "showAttachmentServiceError", "Lcom/afollestad/materialdialogs/MaterialDialog;", "throwable", "", "uniqueFilename", "fileName", "id", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl implements AttachmentService {

    /* renamed from: a  reason: collision with root package name */
    public final FileAdapter f5044a;
    public final EAdminApi b;

    public AttachmentServiceImpl(FileAdapter fileAdapter, EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(fileAdapter, "fileAdapter");
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f5044a = fileAdapter;
        this.b = eAdminApi;
    }

    public n<File> a(String str, String str2, String str3) {
        a.a(str, "url", str2, "toFileName", str3, "accessToken");
        n<R> c = this.b.downloadAttachment(str, MobileApiV3Kt.getAsAuthorizationHeader(str3)).c(new AttachmentServiceImpl$download$1(this, str2));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .d…oFileName))\n            }");
        return c;
    }

    public n<File> a(Attachment attachment, String str, String str2) {
        String str3;
        Intrinsics.checkParameterIsNotNull(attachment, "attachment");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "accessToken");
        String str4 = str + '/' + attachment.l();
        String i2 = attachment.i();
        if (i2 == null) {
            Intrinsics.throwNpe();
        }
        long l2 = (long) attachment.l();
        int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) i2, '.', 0, false, 6, (Object) null);
        if (lastIndexOf$default < 0) {
            str3 = i2 + '.' + l2;
        } else if (i2 != null) {
            String substring = i2.substring(0, lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring2 = i2.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
            str3 = substring + '.' + l2 + substring2;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return a(str4, str3, str2);
    }

    public u<Uri> a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "fragmentActivity");
        u<Uri> a2 = n.d(e.b).a(new a.o.a.d(new e(dVar), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})).d().a(new AttachmentServiceImpl$chooseLocalFile$1(this, dVar));
        Intrinsics.checkExpressionValueIsNotNull(a2, "RxPermissions(fragmentAc…iedException())\n        }");
        return a2;
    }

    public final Intent a(d dVar, File file) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        Intent createChooser = Intent.createChooser(intent, dVar.getString(R.string.browse_file));
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", FileProvider.a(dVar, "hu.ekreta.guardian.provider", file));
        Intrinsics.checkExpressionValueIsNotNull(putExtra, "Intent(MediaStore.ACTION…e\n            )\n        )");
        return createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{putExtra});
    }

    public void a(d dVar, u<File> uVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "fragmentActivity");
        Intrinsics.checkParameterIsNotNull(uVar, "fileSource");
        n a2 = n.d(e.b).a(new a.o.a.d(new e(dVar), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})).f(new AttachmentServiceImpl$openAttachment$1(uVar)).g(new AttachmentServiceImpl$openAttachment$2(dVar)).g(new AttachmentServiceImpl$openAttachment$3(dVar)).g(new AttachmentServiceImpl$openAttachment$4(dVar)).a(k.b.z.a.a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "RxPermissions(fragmentAc…dSchedulers.mainThread())");
        b.a(a2, new AttachmentServiceImpl$openAttachment$6(this, dVar), (Function0) null, new AttachmentServiceImpl$openAttachment$5(dVar), 2);
    }

    public final f a(d dVar, Throwable th) {
        f fVar = new f(dVar, (a.a.a.b) null, 2);
        f.a(fVar, Integer.valueOf(v.a(th)), (CharSequence) null, (Function1) null, 6);
        f.c(fVar, Integer.valueOf(R.string.Alert_ButtonOk_Text), (CharSequence) null, (Function1) null, 6);
        fVar.show();
        return fVar;
    }
}
