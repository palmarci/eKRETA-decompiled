package p289hu.ekreta.ellenorzo.util;

import kotlin.Metadata;
import p300k.p313b.p315b0.C4668a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo17463d2 = {"<anonymous>", "", "T", "run"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.OnErrorRetryCache$createWhenObserverSubscribes$2 */
/* compiled from: OnErrorRetryCache.kt */
public final class OnErrorRetryCache$createWhenObserverSubscribes$2 implements C4668a {

    /* renamed from: a */
    public final /* synthetic */ OnErrorRetryCache f15366a;

    public OnErrorRetryCache$createWhenObserverSubscribes$2(OnErrorRetryCache onErrorRetryCache) {
        this.f15366a = onErrorRetryCache;
    }

    public final void run() {
        this.f15366a.f15362d = null;
        this.f15366a.f15360b.release();
    }
}
