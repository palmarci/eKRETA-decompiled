package hu.ekreta.ellenorzo.util;

import h.w.v;
import java.util.concurrent.atomic.AtomicReference;
import k.b.a0.c;
import k.b.c0.e.e.h;
import k.b.o;
import k.b.p;
import k.c.f0;
import k.c.m1.r.a;
import k.c.m1.s.b;
import k.c.x;
import k.c.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "emitter", "Lio/reactivex/ObservableEmitter;", "subscribe"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$executeTransaction$1<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0 f6283a;
    public final /* synthetic */ Function1 b;

    public ExtensionsKt$executeTransaction$1(f0 f0Var, Function1 function1) {
        this.f6283a = f0Var;
        this.b = function1;
    }

    public final void a(o<R> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "emitter");
        AtomicReference atomicReference = new AtomicReference();
        y b2 = v.b(this.f6283a);
        ExtensionsKt$executeTransaction$1$task$1 extensionsKt$executeTransaction$1$task$1 = new ExtensionsKt$executeTransaction$1$task$1(this, atomicReference);
        ExtensionsKt$executeTransaction$1$task$2 extensionsKt$executeTransaction$1$task$2 = new ExtensionsKt$executeTransaction$1$task$2(oVar, atomicReference);
        ExtensionsKt$executeTransaction$1$task$3 extensionsKt$executeTransaction$1$task$3 = new ExtensionsKt$executeTransaction$1$task$3(oVar);
        b2.c();
        boolean a2 = ((a) b2.f7101g.capabilities).a();
        ((a) b2.f7101g.capabilities).a("Callback cannot be delivered on current thread.");
        final b bVar = new b(k.c.a.f7099k.a(new x(b2, b2.e, extensionsKt$executeTransaction$1$task$1, a2, extensionsKt$executeTransaction$1$task$2, b2.f7101g.realmNotifier, extensionsKt$executeTransaction$1$task$3)), k.c.a.f7099k);
        AnonymousClass1 r0 = new k.b.b0.a() {
            public final void run() {
                b bVar = bVar;
                bVar.f7171a.cancel(true);
                bVar.b.getQueue().remove(bVar.f7171a);
            }
        };
        k.b.c0.b.b.a(r0, "run is null");
        ((h.a) oVar).a((c) new k.b.a0.a(r0));
    }
}
