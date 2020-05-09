package p289hu.ekreta.ellenorzo.timetable.detail;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<TimeTableItem> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableItemDetailViewModelImpl f15238c;

    public TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl) {
        this.f15238c = timeTableItemDetailViewModelImpl;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, TimeTableItem timeTableItem, TimeTableItem timeTableItem2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        TimeTableItem timeTableItem3 = timeTableItem2;
        TimeTableItem timeTableItem4 = timeTableItem;
        if (timeTableItem3 != null) {
            this.f15238c.mo16164t(ExtensionsKt.m14662b(timeTableItem3.mo16012n()));
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl = this.f15238c;
            timeTableItemDetailViewModelImpl.mo16163s(timeTableItem3.mo15997a(timeTableItemDetailViewModelImpl.f15234w));
            this.f15238c.mo16165u(ExtensionsKt.m14662b(timeTableItem3.mo16026z()));
            this.f15238c.mo16162r(ExtensionsKt.m14662b(timeTableItem3.mo16004g()));
            this.f15238c.mo16166v(ExtensionsKt.m14662b(timeTableItem3.mo15994A()));
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl2 = this.f15238c;
            String j = timeTableItem3.mo16008j();
            boolean z = false;
            timeTableItemDetailViewModelImpl2.mo16160d(!(j == null || j.length() == 0));
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl3 = this.f15238c;
            List d = timeTableItem3.mo15999d();
            if (d == null || d.isEmpty()) {
                z = true;
            }
            timeTableItemDetailViewModelImpl3.mo16159c(!z);
            this.f15238c.mo16157Q1();
            TimeTableItemDetailViewModelImpl timeTableItemDetailViewModelImpl4 = this.f15238c;
            timeTableItemDetailViewModelImpl4.mo16413a(C4998b.m16842a(timeTableItemDetailViewModelImpl4.f15235x.mo14191b(), (Function1) null, (Function0) null, (Function1) new C4391x33a99c95(timeTableItem3, this), 3));
        }
    }
}
