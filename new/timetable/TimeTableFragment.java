package hu.ekreta.ellenorzo.timetable;

import a.l.a.b;
import a.l.a.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentTimetableBinding;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "TimeTableItemViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment extends c {
    public TimeTableViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R/\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableFragment$TimeTableItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "res", "", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/timetable/TimeTableFragment;ILandroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "setModel", "(Lhu/ekreta/ellenorzo/timetable/TimeTableItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getParent", "()Landroid/view/ViewGroup;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: TimeTableFragment.kt */
    public final class TimeTableItemViewHolder extends MVVMViewHolder<TimeTableItem> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(TimeTableItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;"))};
        public final ReadWriteProperty w = new TimeTableFragment$TimeTableItemViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ TimeTableFragment x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TimeTableItemViewHolder(TimeTableFragment timeTableFragment, int i2, ViewGroup viewGroup) {
            super(i2, viewGroup);
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.x = timeTableFragment;
            this.c.setOnClickListener(new View.OnClickListener(this) {
                public final /* synthetic */ TimeTableItemViewHolder c;

                {
                    this.c = r1;
                }

                public final void onClick(View view) {
                    TimeTableViewModel C0 = this.c.x.C0();
                    TimeTableItem model = this.c.getModel();
                    if (model == null) {
                        Intrinsics.throwNpe();
                    }
                    C0.onSelect(model);
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(TimeTableItem timeTableItem) {
            this.w.setValue(this, y[0], timeTableItem);
        }

        public TimeTableItem getModel() {
            return (TimeTableItem) this.w.getValue(this, y[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final TimeTableViewModel C0() {
        TimeTableViewModel timeTableViewModel = this.a0;
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return timeTableViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentTimetableBinding a2 = FragmentTimetableBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        TimeTableViewModel timeTableViewModel = this.a0;
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(timeTableViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        TimeTableViewModel timeTableViewModel = this.a0;
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, timeTableViewModel.getUiCommand());
    }

    public View e(int i2) {
        if (this.b0 == null) {
            this.b0 = new HashMap();
        }
        View view = (View) this.b0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View H = H();
        if (H == null) {
            return null;
        }
        View findViewById = H.findViewById(i2);
        this.b0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        this.H = true;
        B0();
    }

    public void a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        MaterialCalendarView materialCalendarView = (MaterialCalendarView) e(R.id.timetable_calendar_view);
        materialCalendarView.setTitleFormatter(TimeTableFragment$onViewCreated$1$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(materialCalendarView, "this");
        materialCalendarView.a((i) new TodayDayViewDecorator(materialCalendarView));
        materialCalendarView.setDayFormatter(TimeTableFragment$onViewCreated$1$2.INSTANCE);
        materialCalendarView.setOnDateChangedListener(new TimeTableFragment$onViewCreated$$inlined$run$lambda$1(materialCalendarView, this));
        materialCalendarView.setOnMonthChangedListener(new TimeTableFragment$onViewCreated$$inlined$run$lambda$2(materialCalendarView, this));
        b d2 = b.d();
        TimeTableViewModel timeTableViewModel = this.a0;
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        timeTableViewModel.a(d2);
        MaterialCalendarView materialCalendarView2 = (MaterialCalendarView) e(R.id.timetable_calendar_view);
        Intrinsics.checkExpressionValueIsNotNull(materialCalendarView2, "timetable_calendar_view");
        materialCalendarView2.setSelectedDate(d2);
        RecyclerView recyclerView = (RecyclerView) e(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        TimeTableViewModel timeTableViewModel2 = this.a0;
        if (timeTableViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, timeTableViewModel2.getItems(), new TimeTableFragment$onViewCreated$3(this));
    }
}
