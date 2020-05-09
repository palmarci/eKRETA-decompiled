package p289hu.ekreta.ellenorzo.attachment;

import android.os.Environment;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.file.FileAdapter;
import p289hu.ekreta.ellenorzo.file.FileAdapterImplKt$save$1;
import p300k.p313b.C5027n;
import p300k.p313b.C5029p;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p353m.C5456h0;
import p364n.C5594h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "it", "Lokhttp3/ResponseBody;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$download$1 */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$download$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ AttachmentServiceImpl f11145c;

    /* renamed from: e */
    public final /* synthetic */ String f11146e;

    public AttachmentServiceImpl$download$1(AttachmentServiceImpl attachmentServiceImpl, String str) {
        this.f11145c = attachmentServiceImpl;
        this.f11146e = str;
    }

    /* renamed from: a */
    public final C5027n<File> apply(C5456h0 h0Var) {
        Intrinsics.checkParameterIsNotNull(h0Var, "it");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        C5594h c = h0Var.mo21564c();
        Intrinsics.checkExpressionValueIsNotNull(c, "it.source()");
        FileAdapter access$getFileAdapter$p = this.f11145c.f11140a;
        File file = new File(externalStoragePublicDirectory, this.f11146e);
        Intrinsics.checkParameterIsNotNull(c, "$this$save");
        Intrinsics.checkParameterIsNotNull(access$getFileAdapter$p, "fileAdapter");
        Intrinsics.checkParameterIsNotNull(file, "file");
        C5027n<File> a = C5027n.m16890a((C5029p<T>) new FileAdapterImplKt$save$1<T>(c, access$getFileAdapter$p, file));
        Intrinsics.checkExpressionValueIsNotNull(a, "Observable.create { emit…ror(e);\n        }\n    }\n}");
        return a;
    }
}
