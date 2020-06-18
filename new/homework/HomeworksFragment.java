package hu.ekreta.ellenorzo.homework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import h.p.m;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.databinding.FragmentRemindersBinding;
import hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import hu.ekreta.ellenorzo.reminder.ReminderListItem;
import hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import i.c.h.c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;)V", "getBackNavigationTarget", "", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "parent", "Landroid/view/ViewGroup;", "resource", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "ReminderItemViewHolder", "SectionHeaderViewHolder", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworksFragment.kt */
public final class HomeworksFragment extends c implements MainBackNavigationTarget {
    public RemindersViewModel a0;
    public HashMap b0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragment$ReminderItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/homework/HomeworksFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: HomeworksFragment.kt */
    public final class ReminderItemViewHolder extends MVVMViewHolder<ReminderListItem> {
        public static final /* synthetic */ KProperty[] y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReminderItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};
        public final ReadWriteProperty w = new HomeworksFragment$ReminderItemViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);
        public final /* synthetic */ HomeworksFragment x;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReminderItemViewHolder(hu.ekreta.ellenorzo.homework.HomeworksFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r1.x = r2
                r0 = 2131427524(0x7f0b00c4, float:1.8476667E38)
                android.view.View r2 = r2.t().inflate(r0, r3, false)
                java.lang.String r3 = "inflate(parent, R.layout.reminder_item)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                android.view.View r2 = r1.c
                hu.ekreta.ellenorzo.homework.HomeworksFragment$ReminderItemViewHolder$1 r3 = new hu.ekreta.ellenorzo.homework.HomeworksFragment$ReminderItemViewHolder$1
                r3.<init>(r1)
                r2.setOnClickListener(r3)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.homework.HomeworksFragment$ReminderItemViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.homework.HomeworksFragment$ReminderItemViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.homework.HomeworksFragment.ReminderItemViewHolder.<init>(hu.ekreta.ellenorzo.homework.HomeworksFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.w.setValue(this, y[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.w.getValue(this, y[0]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/homework/HomeworksFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: HomeworksFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<ReminderListItem> {
        public static final /* synthetic */ KProperty[] x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};
        public final ReadWriteProperty w = new HomeworksFragment$SectionHeaderViewHolder$$special$$inlined$observable$1((Object) null, (Object) null, this);

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SectionHeaderViewHolder(hu.ekreta.ellenorzo.homework.HomeworksFragment r2, android.view.ViewGroup r3) {
            /*
                r1 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                r0 = 2131427526(0x7f0b00c6, float:1.847667E38)
                android.view.View r2 = r2.t().inflate(r0, r3, false)
                java.lang.String r3 = "inflate(parent, R.layout.section_header)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r1.<init>(r2)
                kotlin.properties.Delegates r2 = kotlin.properties.Delegates.INSTANCE
                hu.ekreta.ellenorzo.homework.HomeworksFragment$SectionHeaderViewHolder$$special$$inlined$observable$1 r2 = new hu.ekreta.ellenorzo.homework.HomeworksFragment$SectionHeaderViewHolder$$special$$inlined$observable$1
                r3 = 0
                r2.<init>(r3, r3, r1)
                r1.w = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.homework.HomeworksFragment.SectionHeaderViewHolder.<init>(hu.ekreta.ellenorzo.homework.HomeworksFragment, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.w.setValue(this, x[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.w.getValue(this, x[0]);
        }
    }

    public void B0() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final RemindersViewModel C0() {
        RemindersViewModel remindersViewModel = this.a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return remindersViewModel;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentRemindersBinding a2 = FragmentRemindersBinding.a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "it");
        RemindersViewModel remindersViewModel = this.a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a2.a(remindersViewModel);
        return a2.Y1();
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        RemindersViewModel remindersViewModel = this.a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.a((Fragment) this, remindersViewModel.getUiCommand());
    }

    public int e() {
        return 5;
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
        HomeworksFragment$onViewCreated$adapter$1 homeworksFragment$onViewCreated$adapter$1 = new HomeworksFragment$onViewCreated$adapter$1(this, new HomeworksFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) e(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        RemindersViewModel remindersViewModel = this.a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        hu.ekreta.ellenorzo.util.ExtensionsKt.a(recyclerView, (m) this, remindersViewModel.getItems(), homeworksFragment$onViewCreated$adapter$1);
    }
}
