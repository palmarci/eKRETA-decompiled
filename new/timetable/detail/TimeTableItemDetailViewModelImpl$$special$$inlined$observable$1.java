package hu.ekreta.ellenorzo.timetable.detail;

import hu.ekreta.ellenorzo.timetable.TimeTableItem;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import java.util.List;
import k.b.f0.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<TimeTableItem> {
    public final /* synthetic */ TimeTableItemDetailViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        super(obj2);
        this.c = timeTableItemDetailViewModelImpl;
    }

    public void afterChange(KProperty<?> kProperty, TimeTableItem timeTableItem, TimeTableItem timeTableItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        TimeTableItem timeTableItem3 = timeTableItem2;
        TimeTableItem timeTableItem4 = timeTableItem;
        if (timeTableItem3 != null) {
            this.c.s(ExtensionsKt.b(timeTableItem3.n()));
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.c;
            timeTableItemDetailViewModelImpl.r(timeTableItem3.a(timeTableItemDetailViewModelImpl.x));
            this.c.t(ExtensionsKt.b(timeTableItem3.z()));
            this.c.q(ExtensionsKt.b(timeTableItem3.g()));
            this.c.u(ExtensionsKt.b(timeTableItem3.A()));
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl2 = this.c;
            String j2 = timeTableItem3.j();
            boolean z = false;
            timeTableItemDetailViewModelImpl2.e(!(j2 == null || j2.length() == 0));
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl3 = this.c;
            List<String> d2 = timeTableItem3.d();
            if (d2 == null || d2.isEmpty()) {
                z = true;
            }
            timeTableItemDetailViewModelImpl3.d(!z);
            this.c.a2();
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl4 = this.c;
            timeTableItemDetailViewModelImpl4.a(b.a(timeTableItemDetailViewModelImpl4.y.b(), (Function1) null, (Function0) null, new TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1$lambda$1(timeTableItem3, this), 3));
        }
    }
}
