package p289hu.ekreta.ellenorzo.timetable.detail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "invoke", "hu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl$refreshTimeTableItem$1$2"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$refreshTimeTableItem$$inlined$let$lambda$2 */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class C4393xf29b6175 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl f15243c;

    public C4393xf29b6175(TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.f15243c = timeTableItemDetailViewModelImpl;
        super(1);
    }

    /* renamed from: a */
    public final void mo16169a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "it");
        DataBindingViewModel.showError$default(this.f15243c, th, null, null, 6, null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo16169a((Throwable) obj);
        return Unit.INSTANCE;
    }
}
