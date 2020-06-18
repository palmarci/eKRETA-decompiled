package hu.ekreta.ellenorzo.attachment;

import hu.ekreta.ellenorzo.attachment.AttachmentService;
import java.io.File;
import k.b.b0.h;
import k.b.u;
import k.b.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Ljava/io/File;", "granted", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$1<T, R> implements h<T, y<? extends R>> {
    public final /* synthetic */ u c;

    public AttachmentServiceImpl$openAttachment$1(u uVar) {
        this.c = uVar;
    }

    /* renamed from: a */
    public final u<File> apply(Boolean bool) {
        Intrinsics.checkParameterIsNotNull(bool, "granted");
        if (bool.booleanValue()) {
            return this.c;
        }
        u<File> a2 = u.a((Throwable) new AttachmentService.PermissionDeniedException());
        Intrinsics.checkExpressionValueIsNotNull(a2, "Single.error(AttachmentS…missionDeniedException())");
        return a2;
    }
}
