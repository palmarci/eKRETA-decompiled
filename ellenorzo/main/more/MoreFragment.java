package p289hu.ekreta.ellenorzo.main.more;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.main.MainMenuItem;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.adapter.MVVMViewHolder;
import p292i.p293c.p294h.C4459c;
import p300k.p313b.p314a0.C4662b;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/more/MoreFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "disposeBag", "Lio/reactivex/disposables/CompositeDisposable;", "moreMenuItems", "", "Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "viewModel", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/main/MainViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/main/MainViewModel;)V", "calculateBadgeText", "", "count", "", "isTutelary", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onResume", "ViewHolder", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.more.MoreFragment */
/* compiled from: MoreFragment.kt */
public final class MoreFragment extends C4459c {

    /* renamed from: a0 */
    public MainViewModel f13754a0;

    /* renamed from: b0 */
    public C4662b f13755b0 = new C4662b();

    /* renamed from: c0 */
    public List<MoreMenuItem> f13756c0 = new ArrayList();

    /* renamed from: d0 */
    public HashMap f13757d0;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R/\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/more/MoreFragment$ViewHolder;", "Lhu/ekreta/ellenorzo/util/adapter/MVVMViewHolder;", "Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "parent", "Landroid/view/ViewGroup;", "(Lhu/ekreta/ellenorzo/main/more/MoreFragment;Landroid/view/ViewGroup;)V", "<set-?>", "model", "getModel", "()Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;", "setModel", "(Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.main.more.MoreFragment$ViewHolder */
    /* compiled from: MoreFragment.kt */
    public final class ViewHolder extends MVVMViewHolder<MoreMenuItem> {

        /* renamed from: y */
        public static final /* synthetic */ KProperty[] f13758y = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewHolder.class), "model", "getModel()Lhu/ekreta/ellenorzo/main/more/MoreMenuItem;"))};

        /* renamed from: w */
        public final ReadWriteProperty f13759w = new MoreFragment$ViewHolder$$special$$inlined$observable$1(null, null, this);

        /* renamed from: x */
        public final /* synthetic */ MoreFragment f13760x;

        public ViewHolder(MoreFragment moreFragment, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            this.f13760x = moreFragment;
            View inflate = moreFragment.mo6225t().inflate(C4014R.layout.more_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "layoutInflater.inflate(R…more_item, parent, false)");
            super(inflate);
            this.f7113c.setOnClickListener(new OnClickListener(this) {

                /* renamed from: c */
                public final /* synthetic */ ViewHolder f13761c;

                {
                    this.f13761c = r1;
                }

                public final void onClick(View view) {
                    MoreMenuItem model = this.f13761c.getModel();
                    if (model != null) {
                        this.f13761c.f13760x.mo13209C0().mo13178a(model.mo13223b());
                    }
                }
            });
            Delegates delegates = Delegates.INSTANCE;
        }

        /* renamed from: a */
        public void setModel(MoreMenuItem moreMenuItem) {
            this.f13759w.setValue(this, f13758y[0], moreMenuItem);
        }

        public MoreMenuItem getModel() {
            return (MoreMenuItem) this.f13759w.getValue(this, f13758y[0]);
        }
    }

    /* renamed from: B0 */
    public void mo13208B0() {
        HashMap hashMap = this.f13757d0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: C0 */
    public final MainViewModel mo13209C0() {
        MainViewModel mainViewModel = this.f13754a0;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return mainViewModel;
    }

    /* renamed from: Y */
    public void mo6145Y() {
        this.f13755b0.mo16965b();
        super.mo6145Y();
    }

    /* renamed from: a */
    public View mo4179a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(C4014R.layout.fragment_more, viewGroup, false);
    }

    /* renamed from: e */
    public View mo13210e(int i) {
        if (this.f13757d0 == null) {
            this.f13757d0 = new HashMap();
        }
        View view = (View) this.f13757d0.get(Integer.valueOf(i));
        if (view == null) {
            View H = mo6128H();
            if (H == null) {
                return null;
            }
            view = H.findViewById(i);
            this.f13757d0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public final String mo13211f(int i) {
        return i > 0 ? String.valueOf(i) : "";
    }

    /* renamed from: j0 */
    public void mo6201j0() {
        this.f6932H = true;
        MainViewModel mainViewModel = this.f13754a0;
        String str = "viewModel";
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        String str2 = null;
        ExtensionsKt.m14660a(C4998b.m16842a(mainViewModel.mo13179g1(), (Function1) MoreFragment$onResume$2.INSTANCE, (Function0) null, (Function1) new MoreFragment$onResume$1(this), 2), this.f13755b0);
        MoreMenuItem moreMenuItem = new MoreMenuItem(MainMenuItem.MESSAGES, C4014R.mipmap.menu_messages_24dp, C4014R.string.MenuItem_Messages_Title, null, 8, null);
        MoreMenuItem moreMenuItem2 = new MoreMenuItem(MainMenuItem.NOTES, C4014R.mipmap.menu_notes_24dp, C4014R.string.MenuItem_Notes_Title, null, 8, null);
        MoreMenuItem moreMenuItem3 = new MoreMenuItem(MainMenuItem.HOMEWORKS, C4014R.mipmap.menu_homeworks_24dp, C4014R.string.MenuItem_Homeworks_Title, null, 8, null);
        MoreMenuItem moreMenuItem4 = new MoreMenuItem(MainMenuItem.ANNOUNCED_TESTS, C4014R.mipmap.menu_announcedtest_24dp, C4014R.string.MenuItem_Tests_Title, null, 8, null);
        MoreMenuItem moreMenuItem5 = new MoreMenuItem(MainMenuItem.CLASS_MASTERS, C4014R.mipmap.menu_classmaster_24dp, C4014R.string.MenuItem_NotifyClassMaster_Title, null, 8, null);
        MoreMenuItem moreMenuItem6 = new MoreMenuItem(MainMenuItem.NOTICE_BOARD, C4014R.mipmap.menu_noticeboard_24dp, C4014R.string.MenuItem_Notice_Board, null, 8, null);
        MoreMenuItem moreMenuItem7 = new MoreMenuItem(MainMenuItem.ABOUT, C4014R.mipmap.menu_about_24dp, C4014R.string.MenuItem_About_Title, null, 8, null);
        this.f13756c0 = CollectionsKt__CollectionsKt.mutableListOf(moreMenuItem, moreMenuItem2, moreMenuItem3, moreMenuItem4, moreMenuItem5, moreMenuItem6, moreMenuItem7);
        MainViewModel mainViewModel2 = this.f13754a0;
        if (mainViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
        }
        String L0 = mainViewModel2.mo13177L0();
        Context n = mo6209n();
        if (n != null) {
            str2 = n.getString(C4014R.string.ActiveProfile_Role_Tutelary);
        }
        if (Intrinsics.areEqual((Object) L0, (Object) str2)) {
            List<MoreMenuItem> list = this.f13756c0;
            MoreMenuItem moreMenuItem8 = new MoreMenuItem(MainMenuItem.POST_TMGI, C4014R.mipmap.menu_sendtmgi_24dp, C4014R.string.MenuItem_Tmgi_Post_Title, null, 8, null);
            list.add(1, moreMenuItem8);
            List<MoreMenuItem> list2 = this.f13756c0;
            MoreMenuItem moreMenuItem9 = new MoreMenuItem(MainMenuItem.CASES, C4014R.mipmap.menu_cases_24dp, C4014R.string.MenuItem_Cases_Title, null, 8, null);
            list2.add(5, moreMenuItem9);
        }
        RecyclerView recyclerView = (RecyclerView) mo13210e(C4014R.C4016id.more_recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "more_recyclerview");
        ExtensionsKt.m14655a(recyclerView, this.f13756c0, (Function2<? super ViewGroup, ? super Integer, ? extends ViewHolder>) new MoreFragment$onResume$3<Object,Object,Object>(this));
    }

    public /* synthetic */ void onDestroyView() {
        this.f6932H = true;
        mo13208B0();
    }
}
