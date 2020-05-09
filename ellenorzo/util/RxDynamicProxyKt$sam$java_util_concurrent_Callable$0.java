package p289hu.ekreta.ellenorzo.util;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.RxDynamicProxyKt$sam$java_util_concurrent_Callable$0 */
/* compiled from: RxDynamicProxy.kt */
public final class RxDynamicProxyKt$sam$java_util_concurrent_Callable$0 implements Callable {

    /* renamed from: c */
    public final /* synthetic */ Function0 f15370c;

    public RxDynamicProxyKt$sam$java_util_concurrent_Callable$0(Function0 function0) {
        this.f15370c = function0;
    }

    public final /* synthetic */ Object call() {
        return this.f15370c.invoke();
    }
}
