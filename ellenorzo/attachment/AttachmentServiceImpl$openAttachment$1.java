package p289hu.ekreta.ellenorzo.attachment;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService.PermissionDeniedException;
import p300k.p313b.C5036u;
import p300k.p313b.C5040y;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Single;", "Ljava/io/File;", "granted", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$openAttachment$1 */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$1<T, R> implements C4675h<T, C5040y<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ C5036u f11147c;

    public AttachmentServiceImpl$openAttachment$1(C5036u uVar) {
        this.f11147c = uVar;
    }

    /* renamed from: a */
    public final C5036u<File> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "granted");
        if (bool.booleanValue()) {
            return this.f11147c;
        }
        C5036u<File> a = C5036u.m16976a((Throwable) new PermissionDeniedException());
        Intrinsics.checkExpressionValueIsNotNull(a, "Single.error(AttachmentS…missionDeniedException())");
        return a;
    }
}
