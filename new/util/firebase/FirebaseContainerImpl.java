package hu.ekreta.ellenorzo.util.firebase;

import a.h.a.b.m.g;
import a.h.b.k.a;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import k.b.u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainerImpl;", "Lhu/ekreta/ellenorzo/util/firebase/FirebaseContainer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "getContext", "()Landroid/content/Context;", "instanceId", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "getInstanceId", "()Lcom/google/android/gms/tasks/Task;", "performance", "Lcom/google/firebase/perf/FirebasePerformance;", "getPerformance", "()Lcom/google/firebase/perf/FirebasePerformance;", "traces", "Ljava/util/HashMap;", "", "Lcom/google/firebase/perf/metrics/Trace;", "Lkotlin/collections/HashMap;", "getToken", "Lio/reactivex/Single;", "getTrace", "traceKey", "logEvent", "", "key", "bundle", "Landroid/os/Bundle;", "eventKey", "paramKey", "value", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: FirebaseContainerImpl.kt */
public final class FirebaseContainerImpl implements FirebaseContainer {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Trace> f6311a;
    public final Context b;

    public FirebaseContainerImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.b = context;
        if (!FirebaseContainer.Companion.a()) {
            FirebaseContainer.Companion.a(this);
            this.f6311a = new HashMap<>();
            return;
        }
        throw new Exception("FirebaseContainer already initialized.");
    }

    public Trace a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "traceKey");
        Trace trace = this.f6311a.get(str);
        if (trace == null) {
            trace = d().a(str);
            HashMap<String, Trace> hashMap = this.f6311a;
            Intrinsics.checkExpressionValueIsNotNull(trace, "it");
            hashMap.put(str, trace);
        }
        Intrinsics.checkExpressionValueIsNotNull(trace, "traces[traceKey] ?: perf…{ traces[traceKey] = it }");
        return trace;
    }

    public FirebaseAnalytics b() {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this.b);
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseAnalytics.getInstance(context)");
        return instance;
    }

    public g<a> c() {
        FirebaseInstanceId m2 = FirebaseInstanceId.m();
        Intrinsics.checkExpressionValueIsNotNull(m2, "FirebaseInstanceId.getInstance()");
        g<a> b2 = m2.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "FirebaseInstanceId.getInstance().instanceId");
        return b2;
    }

    public a.h.b.o.a d() {
        a.h.b.o.a b2 = a.h.b.o.a.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "FirebasePerformance.getInstance()");
        return b2;
    }

    public u<String> a() {
        u<String> a2 = u.a(new FirebaseContainerImpl$getToken$1(this));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Single.create<String> { …tion()) }\n        }\n    }");
        return a2;
    }

    public void a(String str, String str2, String str3) {
        a.b.a.a.a.a(str, "eventKey", str2, "paramKey", str3, "value");
        a(str, g.a.a.b.a.a((Pair<String, ? extends Object>[]) new Pair[]{TuplesKt.to(str2, str3)}));
    }

    public void a(String str, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        b().a(str, bundle);
    }
}
