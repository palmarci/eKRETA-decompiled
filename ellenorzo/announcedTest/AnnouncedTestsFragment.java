package p289hu.ekreta.ellenorzo.announcedTest;

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

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestsFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "viewModel", "Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/reminder/RemindersViewModel;)V", "getBackNavigationTarget", "", "inflate", "Landroid/view/View;", "kotlin.jvm.PlatformType", "parent", "Landroid/view/ViewGroup;", "resource", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onViewCreated", "view", "ReminderItemViewHolder", "SectionHeaderViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment */
/* compiled from: AnnouncedTestsFragment.kt */
public final class AnnouncedTestsFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public RemindersViewModel f11111a0;

    /* renamed from: b0 */
    public HashMap f11112b0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestsFragment$ReminderItemViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestsFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment$ReminderItemViewHolder */
    /* compiled from: AnnouncedTestsFragment.kt */
    public final class ReminderItemViewHolder extends MVVMViewHolder<ReminderListItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f11113y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReminderItemViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f11114w = new C4022xf98cfc3e(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ AnnouncedTestsFragment f11115x;

        public ReminderItemViewHolder(AnnouncedTestsFragment announcedTestsFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f11115x = announcedTestsFragment;
            View access$inflate = announcedTestsFragment.mo6225t().inflate(C4014R.layout.reminder_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(parent, R.layout.reminder_item)");
            super(access$inflate);
            this.f7113c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ReminderItemViewHolder f11116c;

                {
                    this.f11116c = r1;
                }

                public final void onClick(View view) {
                    ReminderListItem model = this.f11116c.getModel();
                    if (model != null) {
                        this.f11116c.f11115x.mo11417C0().onSelect(model);
                    }
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.f11114w.setValue(this, f11113y[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.f11114w.getValue(this, f11113y[0]);
        }
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestsFragment$SectionHeaderViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestsFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;", "setModel", "(Lhu/ekreta/ellenorzo/reminder/ReminderListItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragment$SectionHeaderViewHolder */
    /* compiled from: AnnouncedTestsFragment.kt */
    public final class SectionHeaderViewHolder extends MVVMViewHolder<ReminderListItem> {

        /* renamed from: x */
        public static final /* synthetic */ KProperty[] f11117x = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SectionHeaderViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/reminder/ReminderListItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f11118w = new C4023xc65235cd(null, null, this);

        public SectionHeaderViewHolder(AnnouncedTestsFragment announcedTestsFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View access$inflate = announcedTestsFragment.mo6225t().inflate(C4014R.layout.section_header, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(access$inflate, "inflate(\n               …tion_header\n            )");
            super(access$inflate);
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(ReminderListItem reminderListItem) {
            this.f11118w.setValue(this, f11117x[0], reminderListItem);
        }

        public ReminderListItem getModel() {
            return (ReminderListItem) this.f11118w.getValue(this, f11117x[0]);
        }
    }

    /* renamed from: B0 */
    public void mo11416B0() {
        HashMap hashMap = this.f11112b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final RemindersViewModel mo11417C0() {
        RemindersViewModel remindersViewModel = this.f11111a0;
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
        RemindersViewModel remindersViewModel = this.f11111a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12408a(remindersViewModel);
        return a.mo6093P1();
    }

    /* renamed from: b */
    public void mo4182b(Bundle bundle) {
        super.mo4182b(bundle);
        RemindersViewModel remindersViewModel = this.f11111a0;
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
    public View mo11418e(int i) {
        if (this.f11112b0 == null) {
            this.f11112b0 = new HashMap();
        }
        View view = (View) this.f11112b0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f11112b0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo11416B0();
    }

    /* renamed from: a */
    public void mo6159a(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        AnnouncedTestsFragment$onViewCreated$adapter$1 announcedTestsFragment$onViewCreated$adapter$1 = new AnnouncedTestsFragment$onViewCreated$adapter$1(this, new AnnouncedTestsFragment$onViewCreated$adapter$2(this));
        RecyclerView recyclerView = (RecyclerView) mo11418e(C4014R.C4016id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view");
        RemindersViewModel remindersViewModel = this.f11111a0;
        if (remindersViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14653a(recyclerView, (C3818m) this, remindersViewModel.getItems(), (MVVMRecyclerViewAdapter<ItemViewModel, ViewHolder>) announcedTestsFragment$onViewCreated$adapter$1);
    }
}
