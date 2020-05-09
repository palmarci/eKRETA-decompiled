package p289hu.ekreta.ellenorzo.homework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p211h.p271p.C3818m;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentRemindersBinding;
import p289hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import p289hu.ekreta.ellenorzo.reminder.ReminderListItem;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;)V", "getBackNavigationTarget", "", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "parent", "Landroid/view/ViewGroup;", "resource", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "ReminderItemViewHolder", "SectionHeaderViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragment */
/* compiled from: HomeworksFragment.kt */
public final class HomeworksFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public RemindersViewModel f13518a0;

    /* renamed from: b0 */
    public HashMap f13519b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragment$ReminderItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/homework/HomeworksFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragment$ReminderItemViewHolder */
    /* compiled from: HomeworksFragment.kt */
    public final class ReminderItemViewHolder extends MVVMViewHolder<ReminderListItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f13520y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReminderItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f13521w = new C4207x51243f7b(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ HomeworksFragment f13522x;

        public ReminderItemViewHolder(HomeworksFragment homeworksFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f13522x = homeworksFragment;
            View access$inflate = homeworksFragment.mo6225t().inflate(C4014R.layout.reminder_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(parent, R.layout.reminder_item)");
            super(access$inflate);
            this.f7113c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ReminderItemViewHolder f13523c;

                {
                    this.f13523c = r1;
                }

                public final void onClick(View view) {
                    ReminderListItem model = this.f13523c.getModel();
                    if (model != null) {
                        this.f13523c.f13522x.mo13020C0().onSelect(model);
                    }
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.f13521w.setValue(this, f13520y[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.f13521w.getValue(this, f13520y[0]);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworksFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/homework/HomeworksFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragment$SectionHeaderViewHolder */
    /* compiled from: HomeworksFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<ReminderListItem> {

        /* renamed from: x */
        public static final /* synthetic */ KProperty[] f13524x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f13525w = new C4208x61a35a30(null, null, this);

        public SectionHeaderViewHolder(HomeworksFragment homeworksFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View access$inflate = homeworksFragment.mo6225t().inflate(C4014R.layout.section_header, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(\n               …tion_header\n            )");
            super(access$inflate);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.f13525w.setValue(this, f13524x[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.f13525w.getValue(this, f13524x[0]);
        }
    }

    /* renamed from: B0 */
    public void mo13019B0() {
        HashMap hashMap = this.f13519b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final RemindersViewModel mo13020C0() {
        RemindersViewModel remindersViewModel = this.f13518a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return remindersViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentRemindersBinding a = FragmentRemindersBinding.m11791a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        RemindersViewModel remindersViewModel = this.f13518a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12408a(remindersViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        RemindersViewModel remindersViewModel = this.f13518a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, remindersViewModel.getUiCommand());
    }

    /* renamed from: e */
    public int mo11297e() {
        return 5;
    }

    /* renamed from: e */
    public View mo13021e(int i) {
        if (this.f13519b0 == null) {
            this.f13519b0 = new HashMap();
        }
        View view = (View) this.f13519b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f13519b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo13019B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        HomeworksFragment$onViewCreated$adapter$1 homeworksFragment$onViewCreated$adapter$1 = new HomeworksFragment$onViewCreated$adapter$1(this, new HomeworksFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) mo13021e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        RemindersViewModel remindersViewModel = this.f13518a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, remindersViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) homeworksFragment$onViewCreated$adapter$1);
    }
}
