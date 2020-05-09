package p289hu.ekreta.ellenorzo.attachment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.attachment.AttachmentServiceImpl$openAttachment$6 */
/* compiled from: AttachmentServiceImpl.kt */
public final class AttachmentServiceImpl$openAttachment$6 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ AttachmentServiceImpl f11152c;

    /* renamed from: e */
    public final /* synthetic */ C3737d f11153e;

    public AttachmentServiceImpl$openAttachment$6(AttachmentServiceImpl attachmentServiceImpl, C3737d dVar) {
        this.f11152c = attachmentServiceImpl;
        this.f11153e = dVar;
        super(1);
    }

    /* renamed from: a */
    public final void mo11468a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.f11152c.mo11458a(this.f11153e, th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11468a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
