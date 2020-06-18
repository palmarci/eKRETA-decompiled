package hu.ekreta.ellenorzo.attachment;

import a.a.a.f;
import h.m.d.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$6 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ AttachmentServiceImpl c;
    public final /* synthetic */ d e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentServiceImpl$openAttachment$6(AttachmentServiceImpl attachmentServiceImpl, d dVar) {
        super(1);
        this.c = attachmentServiceImpl;
        this.e = dVar;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        f unused = this.c.a(this.e, th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
