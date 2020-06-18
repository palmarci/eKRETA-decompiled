package hu.ekreta.ellenorzo.util.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KMutableProperty0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 15})
/* compiled from: RxViewModelImpl.kt */
public final class RxViewModelImpl$set$1 extends Lambda implements Function1<T, Unit> {
    public final /* synthetic */ KMutableProperty0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxViewModelImpl$set$1(KMutableProperty0 kMutableProperty0) {
        super(1);
        this.c = kMutableProperty0;
    }

    public final void invoke(T t) {
        KMutableProperty0 kMutableProperty0 = this.c;
        Intrinsics.checkExpressionValueIsNotNull(t, "it");
        kMutableProperty0.set(t);
    }
}
