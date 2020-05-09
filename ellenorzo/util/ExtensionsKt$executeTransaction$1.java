package p289hu.ekreta.ellenorzo.util;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p296io.realm.internal.RealmNotifier;
import p300k.p313b.C5028o;
import p300k.p313b.C5029p;
import p300k.p313b.p314a0.C4661a;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4827h.C4828a;
import p300k.p340c.C5047a;
import p300k.p340c.C5061c0;
import p300k.p340c.C5074f0;
import p300k.p340c.C5174x;
import p300k.p340c.C5179y;
import p300k.p340c.p341m1.p342r.C5124a;
import p300k.p340c.p341m1.p343s.C5126b;
import p300k.p340c.p341m1.p343s.C5128d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "R", "emitter", "Lio/reactivex/ObservableEmitter;", "subscribe"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$executeTransaction$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$executeTransaction$1<T> implements C5029p<T> {

    /* renamed from: a */
    public final /* synthetic */ C5074f0 f15335a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f15336b;

    public ExtensionsKt$executeTransaction$1(C5074f0 f0Var, Function1 function1) {
        this.f15335a = f0Var;
        this.f15336b = function1;
    }

    /* renamed from: a */
    public final void mo12747a(C5028o<R> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "emitter");
        AtomicReference atomicReference = new AtomicReference();
        C5179y b = C3984v.m10275b(this.f15335a);
        ExtensionsKt$executeTransaction$1$task$1 extensionsKt$executeTransaction$1$task$1 = new ExtensionsKt$executeTransaction$1$task$1(this, atomicReference);
        ExtensionsKt$executeTransaction$1$task$2 extensionsKt$executeTransaction$1$task$2 = new ExtensionsKt$executeTransaction$1$task$2(oVar, atomicReference);
        ExtensionsKt$executeTransaction$1$task$3 extensionsKt$executeTransaction$1$task$3 = new ExtensionsKt$executeTransaction$1$task$3(oVar);
        b.mo17277c();
        boolean a = ((C5124a) b.f17211g.capabilities).mo17388a();
        ((C5124a) b.f17211g.capabilities).mo17387a("Callback cannot be delivered on current thread.");
        C5061c0 c0Var = b.f17209e;
        RealmNotifier realmNotifier = b.f17211g.realmNotifier;
        C5128d dVar = C5047a.f17206k;
        C5174x xVar = new C5174x(b, c0Var, extensionsKt$executeTransaction$1$task$1, a, extensionsKt$executeTransaction$1$task$2, realmNotifier, extensionsKt$executeTransaction$1$task$3);
        final C5126b bVar = new C5126b(dVar.mo17391a(xVar), C5047a.f17206k);
        C44261 r0 = new C4668a() {
            public final void run() {
                C5126b bVar = bVar;
                bVar.f17352a.cancel(true);
                bVar.f17353b.getQueue().remove(bVar.f17352a);
            }
        };
        C4704b.m16116a(r0, "run is null");
        ((C4828a) oVar).mo17069a((C4663c) new C4661a(r0));
    }
}
