package p289hu.ekreta.ellenorzo.util.firebase;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p000a.p054h.p055a.p067b.p104m.C1930g;
import p000a.p054h.p133b.p146k.C2246a;
import p000a.p054h.p133b.p151o.C2323a;
import p204g.p205a.p206a.p208b.C3158a;
import p300k.p313b.C5036u;
import p300k.p313b.C5039x;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainerImpl;", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "getContext", "()Landroid/content/Context;", "instanceId", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "getInstanceId", "()Lcom/google/android/gms/tasks/Task;", "performance", "Lcom/google/firebase/perf/FirebasePerformance;", "getPerformance", "()Lcom/google/firebase/perf/FirebasePerformance;", "traces", "Ljava/util/HashMap;", "", "Lcom/google/firebase/perf/metrics/Trace;", "Lkotlin/collections/HashMap;", "getToken", "Lio/reactivex/Single;", "getTrace", "traceKey", "logEvent", "", "key", "bundle", "Landroid/os/Bundle;", "eventKey", "paramKey", "value", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.firebase.FirebaseContainerImpl */
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl implements FirebaseContainer {

    /* renamed from: a */
    public final HashMap<String, Trace> f15410a;

    /* renamed from: b */
    public final Context f15411b;

    public FirebaseContainerImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f15411b = context;
        if (!FirebaseContainer.Companion.mo16335a()) {
            FirebaseContainer.Companion.mo16334a(this);
            this.f15410a = new HashMap<>();
            return;
        }
        throw new Exception("FirebaseContainer already initialized.");
    }

    /* renamed from: a */
    public Trace mo16330a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "traceKey");
        Trace trace = (Trace) this.f15410a.get(str);
        if (trace == null) {
            trace = mo16339d().mo4394a(str);
            HashMap<String, Trace> hashMap = this.f15410a;
            Intrinsics.checkExpressionValueIsNotNull(trace, "it");
            hashMap.put(str, trace);
        }
        Intrinsics.checkExpressionValueIsNotNull(trace, "traces[traceKey] ?: perf…{ traces[traceKey] = it }");
        return trace;
    }

    /* renamed from: b */
    public FirebaseAnalytics mo16337b() {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this.f15411b);
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseAnalytics.getInstance(context)");
        return instance;
    }

    /* renamed from: c */
    public C1930g<C2246a> mo16338c() {
        FirebaseInstanceId m = FirebaseInstanceId.m7577m();
        Intrinsics.checkExpressionValueIsNotNull(m, "FirebaseInstanceId.getInstance()");
        C1930g<C2246a> b = m.mo8278b();
        Intrinsics.checkExpressionValueIsNotNull(b, "FirebaseInstanceId.getInstance().instanceId");
        return b;
    }

    /* renamed from: d */
    public C2323a mo16339d() {
        C2323a b = C2323a.m5090b();
        Intrinsics.checkExpressionValueIsNotNull(b, "FirebasePerformance.getInstance()");
        return b;
    }

    /* renamed from: a */
    public C5036u<String> mo16331a() {
        C5036u<String> a = C5036u.m16977a((C5039x<T>) new FirebaseContainerImpl$getToken$1<T>(this));
        Intrinsics.checkExpressionValueIsNotNull(a, "Single.create<String> { …tion()) }\n        }\n    }");
        return a;
    }

    /* renamed from: a */
    public void mo16333a(String str, String str2, String str3) {
        C0082a.m114a(str, "eventKey", str2, "paramKey", str3, "value");
        mo16332a(str, C3158a.m7816a((Pair<String, ? extends Object>[]) new Pair[]{TuplesKt.m17868to(str2, str3)}));
    }

    /* renamed from: a */
    public void mo16332a(String str, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        mo16337b().mo8265a(str, bundle);
    }
}
