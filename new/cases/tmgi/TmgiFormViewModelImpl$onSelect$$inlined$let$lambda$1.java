package hu.ekreta.ellenorzo.cases.tmgi;

import android.net.Uri;
import h.m.d.d;
import hu.ekreta.ellenorzo.attachment.AttachmentService;
import java.io.File;
import k.b.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/fragment/app/FragmentActivity;", "invoke", "hu/ekreta/ellenorzo/cases/tmgi/TmgiFormViewModelImpl$onSelect$1$1"}, k = 3, mv = {1, 1, 15})
/* compiled from: TmgiFormViewModelImpl.kt */
public final class TmgiFormViewModelImpl$onSelect$$inlined$let$lambda$1 extends Lambda implements Function1<d, Unit> {
    public final /* synthetic */ Uri c;
    public final /* synthetic */ TmgiFormViewModelImpl e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TmgiFormViewModelImpl$onSelect$$inlined$let$lambda$1(Uri uri, TmgiFormViewModelImpl tmgiFormViewModelImpl) {
        super(1);
        this.c = uri;
        this.e = tmgiFormViewModelImpl;
    }

    public final void a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
        AttachmentService access$getAttachmentService$p = this.e.L;
        u b = u.b(new File(this.c.getPath()));
        Intrinsics.checkExpressionValueIsNotNull(b, "Single.just(java.io.File(it.path))");
        access$getAttachmentService$p.a(dVar, b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return Unit.INSTANCE;
    }
}
