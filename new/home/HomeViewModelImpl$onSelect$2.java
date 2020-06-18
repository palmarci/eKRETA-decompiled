package hu.ekreta.ellenorzo.home;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: HomeViewModelImpl.kt */
public final class HomeViewModelImpl$onSelect$2 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ HomeViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModelImpl$onSelect$2(HomeViewModelImpl homeViewModelImpl) {
        super(0);
        this.c = homeViewModelImpl;
    }

    public final void invoke() {
        this.c.V1().d("updateDashboardItemReadStateInRepository finished successfully");
    }
}
