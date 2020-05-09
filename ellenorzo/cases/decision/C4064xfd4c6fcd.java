package p289hu.ekreta.ellenorzo.cases.decision;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.attachment.AttachmentService;
import p300k.p313b.C5036u;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke", "hu/ekreta/ellenorzo/cases/decision/DecisionDetailViewModelImpl$openLocalAttachment$1$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.decision.DecisionDetailViewModelImpl$openLocalAttachment$$inlined$let$lambda$1 */
/* compiled from: DecisionDetailViewModelImpl.kt */
public final class C4064xfd4c6fcd extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ Uri f11404c;

    /* renamed from: e */
    public final /* synthetic */ DecisionDetailViewModelImpl f11405e;

    public C4064xfd4c6fcd(Uri uri, DecisionDetailViewModelImpl decisionDetailViewModelImpl) {
        this.f11404c = uri;
        this.f11405e = decisionDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo11762a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        AttachmentService access$getAttachmentService$p = this.f11405e.f11379H;
        C5036u b = C5036u.m16978b(new File(this.f11404c.getPath()));
        Intrinsics.checkExpressionValueIsNotNull(b, "Single.just(java.io.File(it.path))");
        access$getAttachmentService$p.mo11457a(dVar, b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo11762a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
