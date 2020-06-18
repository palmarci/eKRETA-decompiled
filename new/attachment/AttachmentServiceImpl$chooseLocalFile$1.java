package hu.ekreta.ellenorzo.attachment;

import a.k.a.f;
import android.content.Intent;
import android.net.Uri;
import h.m.d.a;
import h.m.d.d;
import h.m.d.p;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import java.io.File;
import java.util.NoSuchElementException;
import k.b.b0.h;
import k.b.u;
import k.b.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "granted", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$chooseLocalFile$1<T, R> implements h<T, y<? extends R>> {
    public final /* synthetic */ AttachmentServiceImpl c;
    public final /* synthetic */ d e;

    public AttachmentServiceImpl$chooseLocalFile$1(AttachmentServiceImpl attachmentServiceImpl, d dVar) {
        this.c = attachmentServiceImpl;
        this.e = dVar;
    }

    /* renamed from: a */
    public final u<Uri> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "granted");
        if (!bool.booleanValue()) {
            return u.a((Throwable) new AttachmentService.PermissionDeniedException());
        }
        final File createTempFile = File.createTempFile("image_", ".jpg", this.e.getCacheDir());
        p g2 = this.e.g();
        f fVar = (f) g2.b("com.petarmarijanovic.rxactivityresult.RxActivityResultFragment");
        if (fVar == null) {
            fVar = new f();
            a aVar = new a(g2);
            aVar.a(0, fVar, "com.petarmarijanovic.rxactivityresult.RxActivityResultFragment", 1);
            aVar.b();
            g2.d(true);
            g2.j();
        }
        AttachmentServiceImpl attachmentServiceImpl = this.c;
        d dVar = this.e;
        Intrinsics.checkExpressionValueIsNotNull(createTempFile, "tmpFile");
        return fVar.a(attachmentServiceImpl.a(dVar, createTempFile)).a(new h<T, y<? extends R>>() {
            /* renamed from: a */
            public final u<Uri> apply(a.k.a.a aVar) {
                Uri uri;
                Intrinsics.checkParameterIsNotNull(aVar, "result");
                if (!aVar.a()) {
                    return u.a((Throwable) new NoSuchElementException());
                }
                Intent intent = aVar.b;
                if (intent == null || (uri = intent.getData()) == null) {
                    uri = Uri.fromFile(createTempFile);
                }
                return u.b(uri);
            }
        });
    }
}
