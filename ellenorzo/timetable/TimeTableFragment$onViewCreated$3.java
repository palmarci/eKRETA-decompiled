package p289hu.ekreta.ellenorzo.timetable;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.timetable.TimeTableFragment.TimeTableItemViewHolder;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/timetable/TimeTableFragment$TimeTableItemViewHolder;", "Lhu/ekreta/ellenorzo/timetable/TimeTableFragment;", "parent", "Landroid/view/ViewGroup;", "<anonymous parameter 1>", "", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment$onViewCreated$3 */
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment$onViewCreated$3 extends Lambda implements Function2<ViewGroup, Integer, TimeTableItemViewHolder> {

    /* renamed from: c */
    public final /* synthetic */ TimeTableFragment f15111c;

    public TimeTableFragment$onViewCreated$3(TimeTableFragment timeTableFragment) {
        this.f15111c = timeTableFragment;
        super(2);
    }

    /* renamed from: a */
    public final TimeTableItemViewHolder mo15990a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return new TimeTableItemViewHolder(this.f15111c, C4014R.layout.timetable_item, viewGroup);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ((Number) obj2).intValue();
        return mo15990a(viewGroup);
    }
}
