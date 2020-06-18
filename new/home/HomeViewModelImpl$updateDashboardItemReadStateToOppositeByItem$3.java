package hu.ekreta.ellenorzo.home;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$updateDashboardItemReadStateToOppositeByItem$3 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ HomeViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModelImpl$updateDashboardItemReadStateToOppositeByItem$3(HomeViewModelImpl homeViewModelImpl) {
        super(1);
        this.c = homeViewModelImpl;
    }

    public final void a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        this.c.b0().c(true);
        DataBindingViewModel.showError$default(this.c, th, (Integer) null, (Function1) null, 6, (Object) null);
        b access$getLogger$p = this.c.V1();
        StringBuilder a2 = a.a("updateDashboardItemReadStateInRepository finished with error: ");
        a2.append(th.getLocalizedMessage());
        access$getLogger$p.d(a2.toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
