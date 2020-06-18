package hu.ekreta.ellenorzo.util;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import k.b.b0.a;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0015\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/util/OnErrorRetryCache;", "T", "", "source", "Lio/reactivex/Observable;", "(Lio/reactivex/Observable;)V", "cache", "deferred", "inProgress", "singlePermit", "Ljava/util/concurrent/Semaphore;", "createWhenObserverSubscribes", "Companion", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OnErrorRetryCache.kt */
public final class OnErrorRetryCache<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final n<T> f6293a;
    public final Semaphore b = new Semaphore(1);
    public n<T> c;

    /* renamed from: d  reason: collision with root package name */
    public n<T> f6294d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004¨\u0006\u0007"}, d2 = {"Lhu/ekreta/ellenorzo/util/OnErrorRetryCache$Companion;", "", "()V", "from", "Lio/reactivex/Observable;", "T", "source", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
    /* compiled from: OnErrorRetryCache.kt */
    public static final class Companion {
        public Companion() {
        }

        public final <T> n<T> a(n<T> nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "source");
            return new OnErrorRetryCache(nVar, (DefaultConstructorMarker) null).f6293a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ OnErrorRetryCache(final n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        n<T> a2 = n.a(new Callable<q<? extends T>>() {
            public final n<T> call() {
                return OnErrorRetryCache.access$createWhenObserverSubscribes(OnErrorRetryCache.this, nVar);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a2, "Observable.defer { creat…erverSubscribes(source) }");
        this.f6293a = a2;
    }

    public static final /* synthetic */ n access$createWhenObserverSubscribes(OnErrorRetryCache onErrorRetryCache, n nVar) {
        onErrorRetryCache.b.acquireUninterruptibly();
        n<T> nVar2 = onErrorRetryCache.c;
        if (nVar2 != null) {
            onErrorRetryCache.b.release();
            return nVar2;
        }
        onErrorRetryCache.f6294d = nVar.b((a) new OnErrorRetryCache$createWhenObserverSubscribes$1(onErrorRetryCache)).c((a) new OnErrorRetryCache$createWhenObserverSubscribes$2(onErrorRetryCache)).f().k();
        return onErrorRetryCache.f6294d;
    }
}
