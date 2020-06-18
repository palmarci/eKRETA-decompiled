package hu.ekreta.ellenorzo.cases;

import h.w.v;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "it", "Lio/realm/Realm;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseDaoImpl.kt */
public final class CaseDaoImpl$updateElement$1 extends Lambda implements Function1<y, BaseCase> {
    public final /* synthetic */ CaseDaoImpl c;
    public final /* synthetic */ BaseCase e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaseDaoImpl$updateElement$1(CaseDaoImpl caseDaoImpl, BaseCase baseCase) {
        super(1);
        this.c = caseDaoImpl;
        this.e = baseCase;
    }

    /* renamed from: a */
    public final BaseCase invoke(y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        v.a(this.c.modelToRealmModel(this.e));
        return this.e;
    }
}
