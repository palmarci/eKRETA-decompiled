package p289hu.ekreta.ellenorzo.home;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000a.p020b.p021a.p022a.C0082a;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.home.HomeViewModelImpl$onSelect$3 */
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$onSelect$3 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ HomeViewModelImpl f13357c;

    public HomeViewModelImpl$onSelect$3(HomeViewModelImpl homeViewModelImpl) {
        this.f13357c = homeViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo12849a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        C5620b access$getLogger$p = this.f13357c.mo16412M1();
        StringBuilder a = C0082a.m111a("updateDashboardItemReadStateInRepository finished with error: ");
        a.append(th.getLocalizedMessage());
        access$getLogger$p.mo115b(a.toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12849a((Throwable) obj);
        return Unit.INSTANCE;
    }
}