package p289hu.ekreta.ellenorzo.cases.tmgi;

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

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, mo17463d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke", "hu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModelImpl$onSelect$1$1"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormViewModelImpl$onSelect$$inlined$let$lambda$1 */
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$onSelect$$inlined$let$lambda$1 extends Lambda implements Function1<C3737d, Unit> {

    /* renamed from: c */
    public final /* synthetic */ Uri f11749c;

    /* renamed from: e */
    public final /* synthetic */ TmgiFormViewModelImpl f11750e;

    public TmgiFormViewModelImpl$onSelect$$inlined$let$lambda$1(Uri uri, TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        this.f11749c = uri;
        this.f11750e = tmgiFormViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo12195a(C3737d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        AttachmentService access$getAttachmentService$p = this.f11750e.f11723K;
        C5036u b = C5036u.m16978b(new File(this.f11749c.getPath()));
        Intrinsics.checkExpressionValueIsNotNull(b, "Single.just(java.io.File(it.path))");
        access$getAttachmentService$p.mo11457a(dVar, b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12195a((C3737d) obj);
        return Unit.INSTANCE;
    }
}
