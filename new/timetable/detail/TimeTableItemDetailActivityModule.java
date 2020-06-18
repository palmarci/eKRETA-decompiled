package hu.ekreta.ellenorzo.timetable.detail;

import a.k.a.c;
import h.m.d.d;
import h.p.w;
import h.p.x;
import hu.ekreta.ellenorzo.di.ActivityModuleKt$createOrReUseViewModel$1;
import hu.ekreta.ellenorzo.di.ActivityScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailActivityModule;", "", "()V", "provideRxActivityResult", "Lcom/petarmarijanovic/rxactivityresult/RxActivityResult;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "provideViewModel", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "activity", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailActivity;", "provider", "Ljavax/inject/Provider;", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl;", "Bindings", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailActivityModule.kt */
public final class TimeTableItemDetailActivityModule {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailActivityModule$Bindings;", "", "provideFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "delegate", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailActivity;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: TimeTableItemDetailActivityModule.kt */
    public interface Bindings {
    }

    public final c a(d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "fragmentActivity");
        return new c(dVar);
    }

    @ActivityScope
    public final TimeTableItemDetailViewModel a(TimeTableItemDetailActivity timeTableItemDetailActivity, a<TimeTableItemDetailViewModelImpl> aVar) {
        Intrinsics.checkParameterIsNotNull(timeTableItemDetailActivity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        w a2 = g.a.a.b.a.a((d) timeTableItemDetailActivity, (x.b) new ActivityModuleKt$createOrReUseViewModel$1(aVar)).a(TimeTableItemDetailViewModelImpl.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProviders.of(ac…iewModelImpl::class.java)");
        return (TimeTableItemDetailViewModel) a2;
    }
}
