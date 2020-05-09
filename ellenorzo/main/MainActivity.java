package p289hu.ekreta.ellenorzo.main;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView;
import p292i.p293c.p294h.C4457a;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\b\u0010%\u001a\u00020\u001aH\u0016J\u0012\u0010&\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/main/MainActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "firebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "getFirebaseContainer", "()Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "setFirebaseContainer", "(Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "menuList", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "viewModel", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/main/MainViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/main/MainViewModel;)V", "handleBadgeCount", "", "handleIfOpeningFromNotification", "savedInstanceState", "Landroid/os/Bundle;", "handleNavigationItemSelection", "handleToolbarOnClick", "handleViewStatusChange", "initMenu", "observerForViewStatusChange", "Landroidx/lifecycle/Observer;", "Lhu/ekreta/ellenorzo/main/MainViewState;", "onBackPressed", "onCreate", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.main.MainActivity */
/* compiled from: MainActivity.kt */
public final class MainActivity extends C4457a {

    /* renamed from: C */
    public static final /* synthetic */ KProperty[] f13680C = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MainActivity.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};

    /* renamed from: A */
    public final List<MainMenuItem> f13681A = CollectionsKt__CollectionsKt.listOf(MainMenuItem.DASHBOARD, MainMenuItem.LESSONS, MainMenuItem.SUBJECTS, MainMenuItem.OMISSIONS, MainMenuItem.MORE);

    /* renamed from: B */
    public HashMap f13682B;

    /* renamed from: x */
    public MainViewModel f13683x;

    /* renamed from: y */
    public FirebaseContainer f13684y;

    /* renamed from: z */
    public final Lazy f13685z = LazyKt__LazyJVMKt.lazy(new MainActivity$logger$2(this));

    public static final /* synthetic */ C5620b access$getLogger$p(MainActivity mainActivity) {
        Lazy lazy = mainActivity.f13685z;
        KProperty kProperty = f13680C[0];
        return (C5620b) lazy.getValue();
    }

    /* renamed from: c */
    public View mo13159c(int i) {
        if (this.f13682B == null) {
            this.f13682B = new HashMap();
        }
        View view = (View) this.f13682B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13682B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        Fragment b = mo10581g().mo10696b((int) C4014R.C4016id.fragmentContainer);
        String str = "navigation";
        if (b instanceof MainBackNavigationTarget) {
            int e = ((MainBackNavigationTarget) b).mo11297e();
            if (e == -1) {
                MainViewModel mainViewModel = this.f13683x;
                if (mainViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                mainViewModel.mo13183t();
                return;
            }
            AdvancedBottomNavigationView advancedBottomNavigationView = (AdvancedBottomNavigationView) mo13159c(C4014R.C4016id.navigation);
            Intrinsics.checkExpressionValueIsNotNull(advancedBottomNavigationView, str);
            advancedBottomNavigationView.setSelectedItemId(e);
            return;
        }
        AdvancedBottomNavigationView advancedBottomNavigationView2 = (AdvancedBottomNavigationView) mo13159c(C4014R.C4016id.navigation);
        Intrinsics.checkExpressionValueIsNotNull(advancedBottomNavigationView2, str);
        advancedBottomNavigationView2.setSelectedItemId(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131427369(0x7f0b0029, float:1.8476352E38)
            androidx.databinding.ViewDataBinding r0 = p211h.p258l.C3703g.m9412a(r9, r0)
            java.lang.String r1 = "DataBindingUtil.setConte…, R.layout.activity_main)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            hu.ekreta.ellenorzo.databinding.ActivityMainBinding r0 = (p289hu.ekreta.ellenorzo.databinding.ActivityMainBinding) r0
            hu.ekreta.ellenorzo.main.MainViewModel r1 = r9.f13683x
            java.lang.String r2 = "viewModel"
            if (r1 != 0) goto L_0x001a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x001a:
            r0.mo12359a(r1)
            int r0 = p289hu.ekreta.ellenorzo.C4014R.C4016id.toolbar
            android.view.View r0 = r9.mo13159c(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r9.mo8719a(r0)
            h.b.k.a r0 = r9.mo8735l()
            r1 = 0
            if (r0 == 0) goto L_0x0032
            r0.mo8691e(r1)
        L_0x0032:
            int r0 = p289hu.ekreta.ellenorzo.C4014R.C4016id.navigation
            android.view.View r0 = r9.mo13159c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            java.lang.String r3 = "navigation"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            android.view.Menu r0 = r0.getMenu()
            java.lang.String r4 = "navigation.menu"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            r0.clear()
            java.util.List<hu.ekreta.ellenorzo.main.MainMenuItem> r4 = r9.f13681A
            java.util.Iterator r4 = r4.iterator()
        L_0x0051:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x009d
            java.lang.Object r5 = r4.next()
            hu.ekreta.ellenorzo.main.MainMenuItem r5 = (p289hu.ekreta.ellenorzo.main.MainMenuItem) r5
            java.lang.Integer r6 = r5.mo13170b()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.mo13172e()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.mo13173f()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.mo13169a()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.mo13170b()
            int r6 = r6.intValue()
            java.lang.Integer r7 = r5.mo13172e()
            int r7 = r7.intValue()
            java.lang.Integer r8 = r5.mo13173f()
            int r8 = r8.intValue()
            android.view.MenuItem r6 = r0.add(r1, r6, r7, r8)
            java.lang.Integer r5 = r5.mo13169a()
            int r5 = r5.intValue()
            r6.setIcon(r5)
            goto L_0x0051
        L_0x009d:
            int r0 = p289hu.ekreta.ellenorzo.C4014R.C4016id.navigation
            android.view.View r0 = r9.mo13159c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            r0.mo16358a()
            int r0 = p289hu.ekreta.ellenorzo.C4014R.C4016id.toolbar
            android.view.View r0 = r9.mo13159c(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            java.lang.String r4 = "toolbar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            int r5 = p289hu.ekreta.ellenorzo.C4014R.C4016id.toolbar_navigation_icon
            android.view.View r0 = r0.findViewById(r5)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$1 r5 = new hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$1
            r5.<init>(r9)
            r0.setOnClickListener(r5)
            int r0 = p289hu.ekreta.ellenorzo.C4014R.C4016id.toolbar
            android.view.View r0 = r9.mo13159c(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            int r4 = p289hu.ekreta.ellenorzo.C4014R.C4016id.toolbar_title
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$2 r4 = new hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$2
            r4.<init>(r9)
            r0.setOnClickListener(r4)
            int r0 = p289hu.ekreta.ellenorzo.C4014R.C4016id.navigation
            android.view.View r0 = r9.mo13159c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            hu.ekreta.ellenorzo.main.MainActivity$handleNavigationItemSelection$1 r4 = new hu.ekreta.ellenorzo.main.MainActivity$handleNavigationItemSelection$1
            r4.<init>(r9)
            r0.setOnNavigationItemSelectedListener(r4)
            hu.ekreta.ellenorzo.main.MainViewModel r0 = r9.f13683x
            if (r0 != 0) goto L_0x00f7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00f7:
            androidx.lifecycle.LiveData r0 = r0.getViewState()
            hu.ekreta.ellenorzo.main.MainActivity$observerForViewStatusChange$1 r4 = new hu.ekreta.ellenorzo.main.MainActivity$observerForViewStatusChange$1
            r4.<init>(r9)
            r0.mo6265a(r9, r4)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r4 = "intent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            java.lang.String r0 = p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14677n(r0)
            r5 = 1
            r6 = 2
            if (r0 == 0) goto L_0x018c
            android.content.Intent r0 = r9.getIntent()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            hu.ekreta.ellenorzo.notification.NotificationMessageType r0 = p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14672i(r0)
            if (r0 == 0) goto L_0x018c
            android.content.Intent r10 = r9.getIntent()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r4)
            hu.ekreta.ellenorzo.notification.NotificationMessageType r10 = p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14672i(r10)
            if (r10 == 0) goto L_0x0184
            android.content.Intent r0 = r9.getIntent()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            java.lang.String r0 = p289hu.ekreta.ellenorzo.util.ExtensionsKt.m14677n(r0)
            if (r0 == 0) goto L_0x017c
            hu.ekreta.ellenorzo.util.firebase.FirebaseContainer r4 = r9.f13684y
            if (r4 != 0) goto L_0x0144
            java.lang.String r7 = "firebaseContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0144:
            kotlin.Pair[] r7 = new kotlin.Pair[r6]
            java.lang.String r8 = "profile"
            kotlin.Pair r8 = kotlin.TuplesKt.m17868to(r8, r0)
            r7[r1] = r8
            java.lang.String r1 = "push_type"
            kotlin.Pair r1 = kotlin.TuplesKt.m17868to(r1, r10)
            r7[r5] = r1
            android.os.Bundle r1 = p204g.p205a.p206a.p208b.C3158a.m7816a((kotlin.Pair<java.lang.String, ? extends java.lang.Object>[]) r7)
            java.lang.String r5 = "push_userDidOpenNotification"
            r4.mo16332a(r5, r1)
            hu.ekreta.ellenorzo.main.MainViewModel r1 = r9.f13683x
            if (r1 != 0) goto L_0x0166
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0166:
            r1.mo13181l(r0)
            int r0 = p289hu.ekreta.ellenorzo.C4014R.C4016id.navigation
            android.view.View r0 = r9.mo13159c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            int r10 = r10.mo13753a()
            r0.setSelectedItemId(r10)
            goto L_0x019c
        L_0x017c:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r10.<init>(r0)
            throw r10
        L_0x0184:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type hu.ekreta.ellenorzo.notification.NotificationMessageType"
            r10.<init>(r0)
            throw r10
        L_0x018c:
            if (r10 != 0) goto L_0x019c
            int r10 = p289hu.ekreta.ellenorzo.C4014R.C4016id.navigation
            android.view.View r10 = r9.mo13159c(r10)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r10 = (p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r10
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r3)
            r10.setSelectedItemId(r5)
        L_0x019c:
            hu.ekreta.ellenorzo.main.MainViewModel r10 = r9.f13683x
            if (r10 != 0) goto L_0x01a3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01a3:
            k.b.n r10 = r10.mo13179g1()
            hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$1 r0 = new hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$1
            r0.<init>(r9)
            r1 = 0
            hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$2 r3 = new hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$2
            r3.<init>(r9)
            p300k.p313b.p335f0.C4998b.m16842a(r10, r3, r1, r0, r6)
            hu.ekreta.ellenorzo.main.MainViewModel r10 = r9.f13683x
            if (r10 != 0) goto L_0x01bc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01bc:
            androidx.lifecycle.LiveData r10 = r10.getUiCommand()
            p289hu.ekreta.ellenorzo.util.view.ExtensionsKt.m14883a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.main.MainActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: q */
    public final MainViewModel mo13160q() {
        MainViewModel mainViewModel = this.f13683x;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return mainViewModel;
    }
}
