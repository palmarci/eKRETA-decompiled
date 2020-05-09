package p289hu.ekreta.ellenorzo.timetable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000a.p175l.p176a.C2682b;
import p000a.p175l.p176a.C2699i;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentTimetableBinding;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/timetable/TimeTableViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "TimeTableItemViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment */
/* compiled from: TimeTableFragment.kt */
public final class TimeTableFragment extends C4459c {

    /* renamed from: a0 */
    public TimeTableViewModel f15100a0;

    /* renamed from: b0 */
    public HashMap f15101b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R/\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/TimeTableFragment$TimeTableItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "res", "", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/timetable/TimeTableFragment;ILandroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "setModel", "(Lhu/ekreta/ellenorzo/timetable/TimeTableItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "getParent", "()Landroid/view/ViewGroup;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.timetable.TimeTableFragment$TimeTableItemViewHolder */
    /* compiled from: TimeTableFragment.kt */
    public final class TimeTableItemViewHolder extends MVVMViewHolder<TimeTableItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f15102y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(TimeTableItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f15103w = new C4383x3644b7d0(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ TimeTableFragment f15104x;

        public TimeTableItemViewHolder(TimeTableFragment timeTableFragment, int i, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f15104x = timeTableFragment;
            super(i, viewGroup);
            this.f7113c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ TimeTableItemViewHolder f15105c;

                {
                    this.f15105c = r1;
                }

                public final void onClick(View view) {
                    TimeTableViewModel C0 = this.f15105c.f15104x.mo15985C0();
                    TimeTableItem model = this.f15105c.getModel();
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
            this.f15103w.setValue(this, f15102y[0], timeTableItem);
        }

        public TimeTableItem getModel() {
            return (TimeTableItem) this.f15103w.getValue(this, f15102y[0]);
        }
    }

    /* renamed from: B0 */
    public void mo15984B0() {
        HashMap hashMap = this.f15101b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final TimeTableViewModel mo15985C0() {
        TimeTableViewModel timeTableViewModel = this.f15100a0;
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return timeTableViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentTimetableBinding a = FragmentTimetableBinding.m11810a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        TimeTableViewModel timeTableViewModel = this.f15100a0;
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12412a(timeTableViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        TimeTableViewModel timeTableViewModel = this.f15100a0;
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, timeTableViewModel.getUiCommand());
    }

    /* renamed from: e */
    public View mo15986e(int i) {
        if (this.f15101b0 == null) {
            this.f15101b0 = new HashMap();
        }
        View view = (View) this.f15101b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f15101b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo15984B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        MaterialCalendarView materialCalendarView = (MaterialCalendarView) mo15986e(C4014R.C4016id.timetable_calendar_view);
        materialCalendarView.setTitleFormatter(TimeTableFragment$onViewCreated$1$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(materialCalendarView, "this");
        materialCalendarView.mo8439a((C2699i) new TodayDayViewDecorator(materialCalendarView));
        materialCalendarView.setDayFormatter(TimeTableFragment$onViewCreated$1$2.INSTANCE);
        materialCalendarView.setOnDateChangedListener(new TimeTableFragment$onViewCreated$$inlined$run$lambda$1(materialCalendarView, this));
        materialCalendarView.setOnMonthChangedListener(new TimeTableFragment$onViewCreated$$inlined$run$lambda$2(materialCalendarView, this));
        C2682b d = C2682b.m5589d();
        TimeTableViewModel timeTableViewModel = this.f15100a0;
        String str = "viewModel";
        if (timeTableViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        timeTableViewModel.mo16130a(d);
        MaterialCalendarView materialCalendarView2 = (MaterialCalendarView) mo15986e(C4014R.C4016id.timetable_calendar_view);
        Intrinsics.checkExpressionValueIsNotNull(materialCalendarView2, "timetable_calendar_view");
        materialCalendarView2.setSelectedDate(d);
        RecyclerView recyclerView = (RecyclerView) mo15986e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        TimeTableViewModel timeTableViewModel2 = this.f15100a0;
        if (timeTableViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14654a(recyclerView, (C3818m) this, timeTableViewModel2.getItems(), (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new TimeTableFragment$onViewCreated$3<Object,Object,Object>(this));
    }
}
