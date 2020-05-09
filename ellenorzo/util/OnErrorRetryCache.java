package p289hu.ekreta.ellenorzo.util;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4668a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0015\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/OnErrorRetryCache;", "T", "", "source", "Lio/reactivex/Observable;", "(Lio/reactivex/Observable;)V", "cache", "deferred", "inProgress", "singlePermit", "Ljava/util/concurrent/Semaphore;", "createWhenObserverSubscribes", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.OnErrorRetryCache */
/* compiled from: OnErrorRetryCache.kt */
public final class OnErrorRetryCache<T> {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final C5027n<T> f15359a;

    /* renamed from: b */
    public final Semaphore f15360b = new Semaphore(1);

    /* renamed from: c */
    public C5027n<T> f15361c;

    /* renamed from: d */
    public C5027n<T> f15362d;

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/OnErrorRetryCache$Companion;", "", "()V", "from", "Lio/reactivex/Observable;", "T", "source", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.OnErrorRetryCache$Companion */
    /* compiled from: OnErrorRetryCache.kt */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final <T> C5027n<T> mo16290a(C5027n<T> nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "source");
            return new OnErrorRetryCache(nVar, null).f15359a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ OnErrorRetryCache(final C5027n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        C5027n<T> a = C5027n.m16888a((Callable<? extends C5030q<? extends T>>) new Callable<C5030q<? extends T>>() {
            public final C5027n<T> call() {
                return OnErrorRetryCache.access$createWhenObserverSubscribes(OnErrorRetryCache.this, nVar);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(a, "Observable.defer { creat…erverSubscribes(source) }");
        this.f15359a = a;
    }

    public static final /* synthetic */ C5027n access$createWhenObserverSubscribes(OnErrorRetryCache onErrorRetryCache, C5027n nVar) {
        onErrorRetryCache.f15360b.acquireUninterruptibly();
        C5027n<T> nVar2 = onErrorRetryCache.f15361c;
        if (nVar2 != null) {
            onErrorRetryCache.f15360b.release();
            return nVar2;
        }
        onErrorRetryCache.f15362d = nVar.mo17223b((C4668a) new OnErrorRetryCache$createWhenObserverSubscribes$1(onErrorRetryCache)).mo17232c((C4668a) new OnErrorRetryCache$createWhenObserverSubscribes$2(onErrorRetryCache)).mo17243f().mo17159k();
        return onErrorRetryCache.f15362d;
    }
}
