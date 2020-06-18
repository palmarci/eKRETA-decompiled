package hu.ekreta.ellenorzo.util;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* compiled from: RxDynamicProxy.kt */
public final class RxDynamicProxyKt$sam$java_util_concurrent_Callable$0 implements Callable {
    public final /* synthetic */ Function0 c;

    public RxDynamicProxyKt$sam$java_util_concurrent_Callable$0(Function0 function0) {
        this.c = function0;
    }

    public final /* synthetic */ Object call() {
        return this.c.invoke();
    }
}
