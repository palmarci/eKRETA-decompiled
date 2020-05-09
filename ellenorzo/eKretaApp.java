package p289hu.ekreta.ellenorzo;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p211h.p276s.C3852a;
import p292i.p293c.C4448a;
import p292i.p293c.p294h.C4458b;
import p386q.p387a.C5834a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/eKretaApp;", "Ldagger/android/support/DaggerApplication;", "()V", "appComponent", "Ldagger/android/AndroidInjector;", "getAppComponent", "()Ldagger/android/AndroidInjector;", "appComponent$delegate", "Lkotlin/Lazy;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "applicationInjector", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.eKretaApp */
/* compiled from: eKretaApp.kt */
public final class eKretaApp extends C4458b {

    /* renamed from: l */
    public static final /* synthetic */ KProperty[] f13162l = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(eKretaApp.class), "appComponent", "getAppComponent()Ldagger/android/AndroidInjector;"))};

    /* renamed from: k */
    public final Lazy f13163k = LazyKt__LazyJVMKt.lazy(new eKretaApp$appComponent$2(this));

    /* renamed from: a */
    public C4448a<eKretaApp> mo12579a() {
        Lazy lazy = this.f13163k;
        KProperty kProperty = f13162l[0];
        return (C4448a) lazy.getValue();
    }

    public void attachBaseContext(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "base");
        super.attachBaseContext(context);
        C3852a.m9741b(this);
    }

    public void onCreate() {
        super.onCreate();
        Locale.setDefault(new Locale("hu", "HU"));
        Intrinsics.checkExpressionValueIsNotNull(FirebaseAnalytics.getInstance(this), "FirebaseAnalytics.getInstance(this)");
        C5834a.m19289a(new eKretaApp$onCreate$1());
    }
}
