package hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.b.b;
import o.b.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: RxViewModelImpl.kt */
public final class RxViewModelImpl$logger$2 extends Lambda implements Function0<b> {
    public final /* synthetic */ RxViewModelImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxViewModelImpl$logger$2(RxViewModelImpl rxViewModelImpl) {
        super(0);
        this.c = rxViewModelImpl;
    }

    public final b invoke() {
        return c.a(this.c.getClass());
    }
}
