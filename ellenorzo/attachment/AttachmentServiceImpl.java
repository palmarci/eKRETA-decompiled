package p289hu.ekreta.ellenorzo.attachment;

import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p000a.p001a.p002a.C0006f;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p183o.p184a.C2728d;
import p000a.p183o.p184a.C2729e;
import p211h.p262m.p263d.C3737d;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.file.FileAdapter;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.C5031r;
import p300k.p313b.C5036u;
import p300k.p313b.C5040y;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/attachment/AttachmentServiceImpl;", "Lhu/ekreta/ellenorzo/attachment/AttachmentService;", "fileAdapter", "Lhu/ekreta/ellenorzo/file/FileAdapter;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/file/FileAdapter;Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "chooseLocalFile", "Lio/reactivex/Single;", "Landroid/net/Uri;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "createChooserIntentForLocalFile", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "tmpFile", "Ljava/io/File;", "createGetContentIntent", "createImageCaptureIntent", "download", "Lio/reactivex/Observable;", "attachment", "Lhu/ekreta/ellenorzo/attachment/Attachment;", "url", "", "accessToken", "toFileName", "openAttachment", "", "fileSource", "showAttachmentServiceError", "Lcom/afollestad/materialdialogs/MaterialDialog;", "throwable", "", "uniqueFilename", "fileName", "id", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl implements AttachmentService {

    /* renamed from: a */
    public final FileAdapter f11140a;

    /* renamed from: b */
    public final EAdminApi f11141b;

    public AttachmentServiceImpl(FileAdapter fileAdapter, EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(fileAdapter, "fileAdapter");
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f11140a = fileAdapter;
        this.f11141b = eAdminApi;
    }

    /* renamed from: a */
    public C5027n<File> mo11455a(String str, String str2, String str3) {
        C0082a.m114a(str, "url", str2, "toFileName", str3, "accessToken");
        C5027n<File> c = this.f11141b.downloadAttachment(str, MobileApiV3Kt.getAsAuthorizationHeader(str3)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new AttachmentServiceImpl$download$1<Object,Object>(this, str2));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .d…oFileName))\n            }");
        return c;
    }

    /* renamed from: a */
    public C5027n<File> mo11454a(Attachment attachment, String str, String str2) {
        String str3;
        Intrinsics.checkParameterIsNotNull(attachment, "attachment");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "accessToken");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(attachment.mo11437i());
        String sb2 = sb.toString();
        String h = attachment.mo11435h();
        if (h == null) {
            Intrinsics.throwNpe();
        }
        long i = (long) attachment.mo11437i();
        int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) h, '.', 0, false, 6, (Object) null);
        if (lastIndexOf$default < 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(h);
            sb3.append('.');
            sb3.append(i);
            str3 = sb3.toString();
        } else if (h != null) {
            String substring = h.substring(0, lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring2 = h.substring(lastIndexOf$default);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(substring);
            sb4.append('.');
            sb4.append(i);
            sb4.append(substring2);
            str3 = sb4.toString();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        return mo11455a(sb2, str3, str2);
    }

    /* renamed from: a */
    public C5036u<Uri> mo11456a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "fragmentActivity");
        C5036u<Uri> a = C5027n.m16898d(C2729e.f6181b).mo17213a((C5031r<? super T, ? extends R>) new C2728d<Object,Object>(new C2729e(dVar), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})).mo17239d().mo17259a((C4675h<? super T, ? extends C5040y<? extends R>>) new AttachmentServiceImpl$chooseLocalFile$1<Object,Object>(this, dVar));
        Intrinsics.checkExpressionValueIsNotNull(a, "RxPermissions(fragmentAc…iedException())\n        }");
        return a;
    }

    /* renamed from: a */
    public final Intent mo11459a(C3737d dVar, File file) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        Intent createChooser = Intent.createChooser(intent, dVar.getString(C4014R.string.browse_file));
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", FileProvider.m5990a(dVar, "hu.ekreta.student.provider", file));
        Intrinsics.checkExpressionValueIsNotNull(putExtra, "Intent(MediaStore.ACTION…e\n            )\n        )");
        return createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{putExtra});
    }

    /* renamed from: a */
    public void mo11457a(C3737d dVar, C5036u<File> uVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "fragmentActivity");
        Intrinsics.checkParameterIsNotNull(uVar, "fileSource");
        C5027n a = C5027n.m16898d(C2729e.f6181b).mo17213a((C5031r<? super T, ? extends R>) new C2728d<Object,Object>(new C2729e(dVar), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})).mo17244f(new AttachmentServiceImpl$openAttachment$1(uVar)).mo17246g(new AttachmentServiceImpl$openAttachment$2(dVar)).mo17246g(new AttachmentServiceImpl$openAttachment$3(dVar)).mo17246g(new AttachmentServiceImpl$openAttachment$4(dVar)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "RxPermissions(fragmentAc…dSchedulers.mainThread())");
        C4998b.m16842a(a, (Function1) new AttachmentServiceImpl$openAttachment$6(this, dVar), (Function0) null, (Function1) new AttachmentServiceImpl$openAttachment$5(dVar), 2);
    }

    /* renamed from: a */
    public final C0006f mo11458a(C3737d dVar, Throwable th) {
        C0006f fVar = new C0006f(dVar, null, 2);
        C0006f.m8a(fVar, Integer.valueOf(C3984v.m10119a(th)), null, null, 6);
        C0006f.m11c(fVar, Integer.valueOf(C4014R.string.Alert_ButtonOk_Text), null, null, 6);
        fVar.show();
        return fVar;
    }
}
