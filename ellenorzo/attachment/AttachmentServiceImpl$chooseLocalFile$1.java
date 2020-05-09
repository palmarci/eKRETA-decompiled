package p289hu.ekreta.ellenorzo.attachment;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p173k.p174a.C2679f;
import p211h.p262m.p263d.C3727a;
import p211h.p262m.p263d.C3737d;
import p211h.p262m.p263d.C3770p;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService.PermissionDeniedException;
import p300k.p313b.C5036u;
import p300k.p313b.C5040y;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Single;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "granted", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$chooseLocalFile$1 */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$chooseLocalFile$1<T, R> implements C4675h<T, C5040y<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ AttachmentServiceImpl f11142c;

    /* renamed from: e */
    public final /* synthetic */ C3737d f11143e;

    public AttachmentServiceImpl$chooseLocalFile$1(AttachmentServiceImpl attachmentServiceImpl, C3737d dVar) {
        this.f11142c = attachmentServiceImpl;
        this.f11143e = dVar;
    }

    /* renamed from: a */
    public final C5036u<Uri> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "granted");
        if (!bool.booleanValue()) {
            return C5036u.m16976a((Throwable) new PermissionDeniedException());
        }
        final File createTempFile = File.createTempFile("image_", ".jpg", this.f11143e.getCacheDir());
        C3770p g = this.f11143e.mo10581g();
        String str = "com.petarmarijanovic.rxactivityresult.RxActivityResultFragment";
        C2679f fVar = (C2679f) g.mo10697b(str);
        if (fVar == null) {
            fVar = new C2679f();
            C3727a aVar = new C3727a(g);
            aVar.mo10551a(0, fVar, str, 1);
            aVar.mo10555b();
            g.mo10712d(true);
            g.mo10723j();
        }
        AttachmentServiceImpl attachmentServiceImpl = this.f11142c;
        C3737d dVar = this.f11143e;
        Intrinsics.checkExpressionValueIsNotNull(createTempFile, "tmpFile");
        return fVar.mo5054a(attachmentServiceImpl.mo11459a(dVar, createTempFile)).mo17259a((C4675h<? super T, ? extends C5040y<? extends R>>) new C4675h<T, C5040y<? extends R>>() {
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
                if (r2 != null) goto L_0x001c;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final p300k.p313b.C5036u<android.net.Uri> apply(p000a.p173k.p174a.C2674a r2) {
                /*
                    r1 = this;
                    java.lang.String r0 = "result"
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                    boolean r0 = r2.mo5048a()
                    if (r0 == 0) goto L_0x0021
                    android.content.Intent r2 = r2.f6078b
                    if (r2 == 0) goto L_0x0016
                    android.net.Uri r2 = r2.getData()
                    if (r2 == 0) goto L_0x0016
                    goto L_0x001c
                L_0x0016:
                    java.io.File r2 = r7
                    android.net.Uri r2 = android.net.Uri.fromFile(r2)
                L_0x001c:
                    k.b.u r2 = p300k.p313b.C5036u.m16978b(r2)
                    goto L_0x002a
                L_0x0021:
                    java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
                    r2.<init>()
                    k.b.u r2 = p300k.p313b.C5036u.m16976a(r2)
                L_0x002a:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$chooseLocalFile$1.C40241.apply(a.k.a.a):k.b.u");
            }
        });
    }
}
