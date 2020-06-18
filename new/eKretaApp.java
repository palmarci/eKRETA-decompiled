package hu.ekreta.ellenorzo;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import i.c.a;
import i.c.h.b;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lhu/ekreta/ellenorzo/eKretaApp;", "Ldagger/android/support/DaggerApplication;", "()V", "appComponent", "Ldagger/android/AndroidInjector;", "getAppComponent", "()Ldagger/android/AndroidInjector;", "appComponent$delegate", "Lkotlin/Lazy;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "applicationInjector", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: eKretaApp.kt */
public final class eKretaApp extends b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f5547l = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(eKretaApp.class), "appComponent", "getAppComponent()Ldagger/android/AndroidInjector;"))};

    /* renamed from: k  reason: collision with root package name */
    public final Lazy f5548k = LazyKt__LazyJVMKt.lazy(new eKretaApp$appComponent$2(this));

    public a<eKretaApp> a() {
        Lazy lazy = this.f5548k;
        KProperty kProperty = f5547l[0];
        return (a) lazy.getValue();
    }

    public void attachBaseContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "base");
        super.attachBaseContext(context);
        h.s.a.b(this);
    }

    public void onCreate() {
        super.onCreate();
        Locale.setDefault(new Locale("hu", "HU"));
        Intrinsics.checkExpressionValueIsNotNull(FirebaseAnalytics.getInstance(this), "FirebaseAnalytics.getInstance(this)");
        q.a.a.a(new eKretaApp$onCreate$1());
    }
}
