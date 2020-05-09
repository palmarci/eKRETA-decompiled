package p289hu.ekreta.ellenorzo.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.databinding.FragmentAboutBinding;
import p289hu.ekreta.ellenorzo.main.MainBackNavigationTarget;
import p289hu.ekreta.ellenorzo.main.MainMenuItem;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p292i.p293c.p294h.C4459c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/about/AboutFragment;", "Ldagger/android/support/DaggerFragment;", "Lhu/ekreta/ellenorzo/main/MainBackNavigationTarget;", "()V", "aboutMenuItems", "", "Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "getAboutMenuItems", "()Ljava/util/List;", "setAboutMenuItems", "(Ljava/util/List;)V", "viewModel", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/main/MainViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/main/MainViewModel;)V", "getBackNavigationTarget", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "ViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.about.AboutFragment */
/* compiled from: AboutFragment.kt */
public final class AboutFragment extends C4459c implements MainBackNavigationTarget {

    /* renamed from: a0 */
    public MainViewModel f11025a0;

    /* renamed from: b0 */
    public List<AboutMenuItem> f11026b0 = new ArrayList();

    /* renamed from: c0 */
    public HashMap f11027c0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/about/AboutFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/about/AboutFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/about/AboutMenuItem;", "setModel", "(Lhu/ekreta/ellenorzo/about/AboutMenuItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.about.AboutFragment$ViewHolder */
    /* compiled from: AboutFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<AboutMenuItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f11028y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/about/AboutMenuItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f11029w = new AboutFragment$ViewHolder$$special$$inlined$observable$1(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ AboutFragment f11030x;

        public ViewHolder(AboutFragment aboutFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f11030x = aboutFragment;
            View inflate = aboutFragment.mo6225t().inflate(C4014R.layout.about_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "layoutInflater.inflate(R…bout_item, parent, false)");
            super(inflate);
            View view = this.f7113c;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((ConstraintLayout) view.findViewById(C4014R.C4016id.about_item_constraintlayout)).setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ViewHolder f11031c;

                {
                    this.f11031c = r1;
                }

                public final void onClick(View view) {
                    AboutMenuItem model = this.f11031c.getModel();
                    if (model != null) {
                        this.f11031c.f11030x.mo11296C0().mo13178a(model.mo11308a());
                    }
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(AboutMenuItem aboutMenuItem) {
            this.f11029w.setValue(this, f11028y[0], aboutMenuItem);
        }

        public AboutMenuItem getModel() {
            return (AboutMenuItem) this.f11029w.getValue(this, f11028y[0]);
        }
    }

    /* renamed from: B0 */
    public void mo11295B0() {
        HashMap hashMap = this.f11027c0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final MainViewModel mo11296C0() {
        MainViewModel mainViewModel = this.f11025a0;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return mainViewModel;
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        FragmentAboutBinding a = FragmentAboutBinding.m11669a(layoutInflater, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "it");
        MainViewModel mainViewModel = this.f11025a0;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        a.mo12381a(mainViewModel);
        return a.mo6093P1();
    }

    /* renamed from: e */
    public int mo11297e() {
        return 5;
    }

    /* renamed from: e */
    public View mo11298e(int i) {
        if (this.f11027c0 == null) {
            this.f11027c0 = new HashMap();
        }
        View view = (View) this.f11027c0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f11027c0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: j0 */
    public void mo6201j0() {
        this.f6932H = true;
        this.f11026b0 = CollectionsKt__CollectionsKt.mutableListOf(new AboutMenuItem(MainMenuItem.FAQ, C4014R.mipmap.menu_faq_24dp, C4014R.string.FAQ), new AboutMenuItem(MainMenuItem.PRIVACY_POLICY, C4014R.mipmap.menu_about_24dp, C4014R.string.Privacy_policy));
        RecyclerView recyclerView = (RecyclerView) mo11298e(C4014R.C4016id.about_items_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "about_items_recyclerview");
        ExtensionsKt.m14655a(recyclerView, this.f11026b0, (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new AboutFragment$onResume$1<Object,Object,Object>(this));
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo11295B0();
    }
}
