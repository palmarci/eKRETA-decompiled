package p289hu.ekreta.ellenorzo.cases;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p211h.p282w.C3984v;
import p300k.p340c.C5179y;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "it", "Lio/realm/Realm;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseDaoImpl$updateElement$1 */
/* compiled from: CaseDaoImpl.kt */
public final class CaseDaoImpl$updateElement$1 extends Lambda implements Function1<C5179y, BaseCase> {

    /* renamed from: c */
    public final /* synthetic */ CaseDaoImpl f11287c;

    /* renamed from: e */
    public final /* synthetic */ BaseCase f11288e;

    public CaseDaoImpl$updateElement$1(CaseDaoImpl caseDaoImpl, BaseCase baseCase) {
        this.f11287c = caseDaoImpl;
        this.f11288e = baseCase;
        super(1);
    }

    /* renamed from: a */
    public final BaseCase invoke(C5179y yVar) {
        Intrinsics.checkParameterIsNotNull(yVar, "it");
        C3984v.m10246a(this.f11287c.modelToRealmModel(this.f11288e));
        return this.f11288e;
    }
}
