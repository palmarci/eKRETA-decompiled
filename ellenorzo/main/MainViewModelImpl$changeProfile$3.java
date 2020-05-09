package p289hu.ekreta.ellenorzo.main;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainViewModelImpl$changeProfile$3 */
/* compiled from: MainViewModelImpl.kt */
public final class MainViewModelImpl$changeProfile$3 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ MainViewModelImpl f13733c;

    public MainViewModelImpl$changeProfile$3(MainViewModelImpl mainViewModelImpl) {
        this.f13733c = mainViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo13199a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.f13733c.mo16412M1().mo118d(th.getMessage(), th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13199a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
