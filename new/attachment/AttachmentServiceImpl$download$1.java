package hu.ekreta.ellenorzo.attachment;

import android.os.Environment;
import hu.ekreta.ellenorzo.file.FileAdapter;
import hu.ekreta.ellenorzo.file.FileAdapterImplKt$save$1;
import java.io.File;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.h0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Ljava/io/File;", "it", "Lokhttp3/ResponseBody;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$download$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ AttachmentServiceImpl c;
    public final /* synthetic */ String e;

    public AttachmentServiceImpl$download$1(AttachmentServiceImpl attachmentServiceImpl, String str) {
        this.c = attachmentServiceImpl;
        this.e = str;
    }

    /* renamed from: a */
    public final n<File> apply(h0 h0Var) {
        Intrinsics.checkParameterIsNotNull(h0Var, "it");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        n.h l2 = h0Var.l();
        Intrinsics.checkExpressionValueIsNotNull(l2, "it.source()");
        FileAdapter access$getFileAdapter$p = this.c.f5044a;
        File file = new File(externalStoragePublicDirectory, this.e);
        Intrinsics.checkParameterIsNotNull(l2, "$this$save");
        Intrinsics.checkParameterIsNotNull(access$getFileAdapter$p, "fileAdapter");
        Intrinsics.checkParameterIsNotNull(file, "file");
        n<File> a2 = n.a(new FileAdapterImplKt$save$1(l2, access$getFileAdapter$p, file));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Observable.create { emit…ror(e);\n        }\n    }\n}");
        return a2;
    }
}
