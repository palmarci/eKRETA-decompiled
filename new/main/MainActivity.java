package hu.ekreta.ellenorzo.main;

import android.view.View;
import androidx.fragment.app.Fragment;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView;
import i.c.h.a;
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
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\b\u0010%\u001a\u00020\u001aH\u0016J\u0012\u0010&\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lhu/ekreta/ellenorzo/main/MainActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "firebaseContainer", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "getFirebaseContainer", "()Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "setFirebaseContainer", "(Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "menuList", "", "Lhu/ekreta/ellenorzo/main/MainMenuItem;", "viewModel", "Lhu/ekreta/ellenorzo/main/MainViewModel;", "getViewModel", "()Lhu/ekreta/ellenorzo/main/MainViewModel;", "setViewModel", "(Lhu/ekreta/ellenorzo/main/MainViewModel;)V", "handleBadgeCount", "", "handleIfOpeningFromNotification", "savedInstanceState", "Landroid/os/Bundle;", "handleNavigationItemSelection", "handleToolbarOnClick", "handleViewStatusChange", "initMenu", "observerForViewStatusChange", "Landroidx/lifecycle/Observer;", "Lhu/ekreta/ellenorzo/main/MainViewState;", "onBackPressed", "onCreate", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: MainActivity.kt */
public final class MainActivity extends a {
    public static final /* synthetic */ KProperty[] C = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MainActivity.class), "logger", "getLogger()Lorg/slf4j/Logger;"))};
    public final List<MainMenuItem> A = CollectionsKt__CollectionsKt.listOf(MainMenuItem.DASHBOARD, MainMenuItem.LESSONS, MainMenuItem.SUBJECTS, MainMenuItem.OMISSIONS, MainMenuItem.MORE);
    public HashMap B;
    public MainViewModel x;
    public FirebaseContainer y;
    public final Lazy z = LazyKt__LazyJVMKt.lazy(new MainActivity$logger$2(this));

    public static final /* synthetic */ b access$getLogger$p(MainActivity mainActivity) {
        Lazy lazy = mainActivity.z;
        KProperty kProperty = C[0];
        return (b) lazy.getValue();
    }

    public View c(int i2) {
        if (this.B == null) {
            this.B = new HashMap();
        }
        View view = (View) this.B.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.B.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        Fragment b = g().b((int) R.id.fragmentContainer);
        if (b instanceof MainBackNavigationTarget) {
            int e = ((MainBackNavigationTarget) b).e();
            if (e == -1) {
                MainViewModel mainViewModel = this.x;
                if (mainViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                mainViewModel.t();
                return;
            }
            AdvancedBottomNavigationView advancedBottomNavigationView = (AdvancedBottomNavigationView) c(R.id.navigation);
            Intrinsics.checkExpressionValueIsNotNull(advancedBottomNavigationView, "navigation");
            advancedBottomNavigationView.setSelectedItemId(e);
            return;
        }
        AdvancedBottomNavigationView advancedBottomNavigationView2 = (AdvancedBottomNavigationView) c(R.id.navigation);
        Intrinsics.checkExpressionValueIsNotNull(advancedBottomNavigationView2, "navigation");
        advancedBottomNavigationView2.setSelectedItemId(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131427370(0x7f0b002a, float:1.8476354E38)
            androidx.databinding.ViewDataBinding r0 = h.l.g.a(r9, r0)
            java.lang.String r1 = "DataBindingUtil.setConte…, R.layout.activity_main)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            hu.ekreta.ellenorzo.databinding.ActivityMainBinding r0 = (hu.ekreta.ellenorzo.databinding.ActivityMainBinding) r0
            hu.ekreta.ellenorzo.main.MainViewModel r1 = r9.x
            java.lang.String r2 = "viewModel"
            if (r1 != 0) goto L_0x001a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x001a:
            r0.a(r1)
            int r0 = hu.ekreta.ellenorzo.R.id.toolbar
            android.view.View r0 = r9.c(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r9.a((androidx.appcompat.widget.Toolbar) r0)
            h.b.k.a r0 = r9.l()
            r1 = 0
            if (r0 == 0) goto L_0x0032
            r0.e(r1)
        L_0x0032:
            int r0 = hu.ekreta.ellenorzo.R.id.navigation
            android.view.View r0 = r9.c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            java.lang.String r3 = "navigation"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            android.view.Menu r0 = r0.getMenu()
            java.lang.String r4 = "navigation.menu"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            r0.clear()
            java.util.List<hu.ekreta.ellenorzo.main.MainMenuItem> r4 = r9.A
            java.util.Iterator r4 = r4.iterator()
        L_0x0051:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x009d
            java.lang.Object r5 = r4.next()
            hu.ekreta.ellenorzo.main.MainMenuItem r5 = (hu.ekreta.ellenorzo.main.MainMenuItem) r5
            java.lang.Integer r6 = r5.b()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.e()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.f()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.a()
            if (r6 == 0) goto L_0x0051
            java.lang.Integer r6 = r5.b()
            int r6 = r6.intValue()
            java.lang.Integer r7 = r5.e()
            int r7 = r7.intValue()
            java.lang.Integer r8 = r5.f()
            int r8 = r8.intValue()
            android.view.MenuItem r6 = r0.add(r1, r6, r7, r8)
            java.lang.Integer r5 = r5.a()
            int r5 = r5.intValue()
            r6.setIcon(r5)
            goto L_0x0051
        L_0x009d:
            int r0 = hu.ekreta.ellenorzo.R.id.navigation
            android.view.View r0 = r9.c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            r0.a()
            int r0 = hu.ekreta.ellenorzo.R.id.toolbar
            android.view.View r0 = r9.c(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            java.lang.String r4 = "toolbar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            int r5 = hu.ekreta.ellenorzo.R.id.toolbar_navigation_icon
            android.view.View r0 = r0.findViewById(r5)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$1 r5 = new hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$1
            r5.<init>(r9)
            r0.setOnClickListener(r5)
            int r0 = hu.ekreta.ellenorzo.R.id.toolbar
            android.view.View r0 = r9.c(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            int r4 = hu.ekreta.ellenorzo.R.id.toolbar_title
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$2 r4 = new hu.ekreta.ellenorzo.main.MainActivity$handleToolbarOnClick$2
            r4.<init>(r9)
            r0.setOnClickListener(r4)
            int r0 = hu.ekreta.ellenorzo.R.id.navigation
            android.view.View r0 = r9.c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            hu.ekreta.ellenorzo.main.MainActivity$handleNavigationItemSelection$1 r4 = new hu.ekreta.ellenorzo.main.MainActivity$handleNavigationItemSelection$1
            r4.<init>(r9)
            r0.setOnNavigationItemSelectedListener(r4)
            hu.ekreta.ellenorzo.main.MainViewModel r0 = r9.x
            if (r0 != 0) goto L_0x00f7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00f7:
            androidx.lifecycle.LiveData r0 = r0.getViewState()
            hu.ekreta.ellenorzo.main.MainActivity$observerForViewStatusChange$1 r4 = new hu.ekreta.ellenorzo.main.MainActivity$observerForViewStatusChange$1
            r4.<init>(r9)
            r0.a(r9, r4)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r4 = "intent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            java.lang.String r0 = hu.ekreta.ellenorzo.util.ExtensionsKt.o(r0)
            r5 = 1
            r6 = 2
            if (r0 == 0) goto L_0x019c
            android.content.Intent r0 = r9.getIntent()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            hu.ekreta.ellenorzo.notification.NotificationMessageType r0 = hu.ekreta.ellenorzo.util.ExtensionsKt.j(r0)
            if (r0 == 0) goto L_0x019c
            android.content.Intent r10 = r9.getIntent()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r4)
            hu.ekreta.ellenorzo.notification.NotificationMessageType r10 = hu.ekreta.ellenorzo.util.ExtensionsKt.j(r10)
            if (r10 == 0) goto L_0x0194
            android.content.Intent r0 = r9.getIntent()
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            java.lang.String r0 = hu.ekreta.ellenorzo.util.ExtensionsKt.o(r0)
            if (r0 == 0) goto L_0x018c
            hu.ekreta.ellenorzo.util.firebase.FirebaseContainer r4 = r9.y
            if (r4 != 0) goto L_0x0144
            java.lang.String r7 = "firebaseContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x0144:
            kotlin.Pair[] r7 = new kotlin.Pair[r6]
            java.lang.String r8 = "profile"
            kotlin.Pair r8 = kotlin.TuplesKt.to(r8, r0)
            r7[r1] = r8
            java.lang.String r1 = "push_type"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r10)
            r7[r5] = r1
            android.os.Bundle r1 = g.a.a.b.a.a((kotlin.Pair<java.lang.String, ? extends java.lang.Object>[]) r7)
            java.lang.String r5 = "push_userOpenedNotification"
            r4.a(r5, r1)
            hu.ekreta.ellenorzo.main.MainViewModel r1 = r9.x
            if (r1 != 0) goto L_0x0166
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0166:
            r1.l(r0)
            int r0 = hu.ekreta.ellenorzo.R.id.navigation
            android.view.View r0 = r9.c(r0)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r0 = (hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r0
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            int r1 = r10.a()
            r0.setSelectedItemId(r1)
            hu.ekreta.ellenorzo.main.MainMenuItem r10 = r10.b()
            if (r10 == 0) goto L_0x01ac
            hu.ekreta.ellenorzo.main.MainViewModel r0 = r9.x
            if (r0 != 0) goto L_0x0188
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0188:
            r0.a(r10)
            goto L_0x01ac
        L_0x018c:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r10.<init>(r0)
            throw r10
        L_0x0194:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type hu.ekreta.ellenorzo.notification.NotificationMessageType"
            r10.<init>(r0)
            throw r10
        L_0x019c:
            if (r10 != 0) goto L_0x01ac
            int r10 = hu.ekreta.ellenorzo.R.id.navigation
            android.view.View r10 = r9.c(r10)
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r10 = (hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r10
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r3)
            r10.setSelectedItemId(r5)
        L_0x01ac:
            hu.ekreta.ellenorzo.main.MainViewModel r10 = r9.x
            if (r10 != 0) goto L_0x01b3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01b3:
            k.b.n r10 = r10.n1()
            hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$1 r0 = new hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$1
            r0.<init>(r9)
            r1 = 0
            hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$2 r3 = new hu.ekreta.ellenorzo.main.MainActivity$handleBadgeCount$2
            r3.<init>(r9)
            k.b.f0.b.a(r10, r3, r1, r0, r6)
            hu.ekreta.ellenorzo.main.MainViewModel r10 = r9.x
            if (r10 != 0) goto L_0x01cc
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01cc:
            androidx.lifecycle.LiveData r10 = r10.getUiCommand()
            hu.ekreta.ellenorzo.util.view.ExtensionsKt.a((h.m.d.d) r9, (androidx.lifecycle.LiveData<kotlin.jvm.functions.Function1<h.m.d.d, kotlin.Unit>>) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.main.MainActivity.onCreate(android.os.Bundle):void");
    }

    public final MainViewModel q() {
        MainViewModel mainViewModel = this.x;
        if (mainViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return mainViewModel;
    }
}
