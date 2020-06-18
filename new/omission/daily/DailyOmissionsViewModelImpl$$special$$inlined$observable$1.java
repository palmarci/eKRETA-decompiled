package hu.ekreta.ellenorzo.omission.daily;

import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.omission.OmissionViewModel;
import hu.ekreta.ellenorzo.omission.daily.DailyOmissionsViewModelImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class DailyOmissionsViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<List<? extends Omission>> {
    public final /* synthetic */ DailyOmissionsViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DailyOmissionsViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, DailyOmissionsViewModelImpl dailyOmissionsViewModelImpl) {
        super(obj2);
        this.c = dailyOmissionsViewModelImpl;
    }

    public void afterChange(KProperty<?> kProperty, List<? extends Omission> list, List<? extends Omission> list2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        List list3 = list2;
        List list4 = list;
        if (list3 != null) {
            r items = this.c.getItems();
            List<Omission> sortedWith = CollectionsKt___CollectionsKt.sortedWith(list3, new DailyOmissionsViewModelImpl$$special$$inlined$observable$1$lambda$1());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
            for (Omission omission : sortedWith) {
                String u = omission.u();
                String access$typeNameByType = this.c.b(omission);
                Integer f = omission.f();
                String access$getLessonStartTimeWithEndTime = this.c.a(omission.n(), omission.m());
                int i2 = DailyOmissionsViewModelImpl.WhenMappings.b[omission.j().ordinal()];
                arrayList.add(new OmissionViewModel(u, access$typeNameByType, f, access$getLessonStartTimeWithEndTime, i2 != 1 ? i2 != 2 ? R.drawable.ic_unjustified_32dp : R.drawable.ic_justified_32dp : R.drawable.ic_bejustified_32dp, omission));
            }
            items.setValue(arrayList);
        }
    }
}
