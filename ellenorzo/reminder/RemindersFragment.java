package p289hu.ekreta.ellenorzo.reminder;

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
import p289hu.ekreta.ellenorzo.util.adapter.MVVMRecyclerViewAdapter;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p289hu.ekreta.ellenorzo.util.view.ExtensionsKt;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\rH\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/RemindersFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;)V", "createViewHolder", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "viewType", "", "parent", "Landroid/view/ViewGroup;", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "resource", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "ReminderItemViewHolder", "SectionHeaderViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersFragment */
/* compiled from: RemindersFragment.kt */
public final class RemindersFragment extends C4459c {

    /* renamed from: a0 */
    public RemindersViewModel f14651a0;

    /* renamed from: b0 */
    public HashMap f14652b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/RemindersFragment$ReminderItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/reminder/RemindersFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.reminder.RemindersFragment$ReminderItemViewHolder */
    /* compiled from: RemindersFragment.kt */
    public final class ReminderItemViewHolder extends MVVMViewHolder<ReminderListItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f14653y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReminderItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14654w = new C4326xa1e33b39(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ RemindersFragment f14655x;

        public ReminderItemViewHolder(RemindersFragment remindersFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f14655x = remindersFragment;
            View access$inflate = remindersFragment.mo6225t().inflate(C4014R.layout.reminder_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(parent, R.layout.reminder_item)");
            super(access$inflate);
            this.f7113c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ReminderItemViewHolder f14656c;

                {
                    this.f14656c = r1;
                }

                public final void onClick(View view) {
                    ReminderListItem model = this.f14656c.getModel();
                    if (model != null) {
                        this.f14656c.f14655x.mo14306C0().onSelect(model);
                    }
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.f14654w.setValue(this, f14653y[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.f14654w.getValue(this, f14653y[0]);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/reminder/RemindersFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/reminder/RemindersFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.reminder.RemindersFragment$SectionHeaderViewHolder */
    /* compiled from: RemindersFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<ReminderListItem> {

        /* renamed from: x */
        public static final /* synthetic */ KProperty[] f14657x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f14658w = new C4327x28c3d632(null, null, this);

        public SectionHeaderViewHolder(RemindersFragment remindersFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View access$inflate = remindersFragment.mo6225t().inflate(C4014R.layout.section_header, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(parent, R.layout.section_header)");
            super(access$inflate);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.f14658w.setValue(this, f14657x[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.f14658w.getValue(this, f14657x[0]);
        }
    }

    /* renamed from: B0 */
    public void mo14305B0() {
        HashMap hashMap = this.f14652b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final RemindersViewModel mo14306C0() {
        RemindersViewModel remindersViewModel = this.f14651a0;
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
        RemindersViewModel remindersViewModel = this.f14651a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12408a(remindersViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        RemindersViewModel remindersViewModel = this.f14651a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        ExtensionsKt.m14882a((Fragment) this, remindersViewModel.getUiCommand());
    }

    /* renamed from: e */
    public View mo14308e(int i) {
        if (this.f14652b0 == null) {
            this.f14652b0 = new HashMap();
        }
        View view = (View) this.f14652b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f14652b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo14305B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        RemindersFragment$onViewCreated$adapter$1 remindersFragment$onViewCreated$adapter$1 = new RemindersFragment$onViewCreated$adapter$1(this, new RemindersFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) mo14308e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        RemindersViewModel remindersViewModel = this.f14651a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, remindersViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) remindersFragment$onViewCreated$adapter$1);
    }

    /* renamed from: a */
    public final MVVMViewHolder<ReminderListItem> mo14307a(int i, ViewGroup viewGroup) {
        if (i != 0) {
            return new ReminderItemViewHolder(this, viewGroup);
        }
        return new SectionHeaderViewHolder(this, viewGroup);
    }
}
