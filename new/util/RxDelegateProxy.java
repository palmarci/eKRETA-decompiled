package hu.ekreta.ellenorzo.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import k.b.a0.d;
import k.b.c0.b.b;
import k.b.c0.e.e.a0;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lhu/ekreta/ellenorzo/util/RxDelegateProxy;", "T", "Ljava/lang/reflect/InvocationHandler;", "factory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "delegate", "Lio/reactivex/Observable;", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: RxDynamicProxy.kt */
public class RxDelegateProxy<T> implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final n<T> f6297a;

    public RxDelegateProxy(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "factory");
        RxDynamicProxyKt$sam$java_util_concurrent_Callable$0 rxDynamicProxyKt$sam$java_util_concurrent_Callable$0 = new RxDynamicProxyKt$sam$java_util_concurrent_Callable$0(function0);
        b.a(rxDynamicProxyKt$sam$java_util_concurrent_Callable$0, "supplier is null");
        n<T> k2 = d.a(new a0(rxDynamicProxyKt$sam$java_util_concurrent_Callable$0)).b(k.b.g0.b.a()).b(1).k();
        Intrinsics.checkExpressionValueIsNotNull(k2, "Observable.fromCallable(…1)\n        .autoConnect()");
        this.f6297a = k2;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(obj, "proxy");
        Intrinsics.checkParameterIsNotNull(method, "method");
        n<R> c = this.f6297a.c(new RxDelegateProxy$invoke$1(method, objArr));
        Intrinsics.checkExpressionValueIsNotNull(c, "delegate.flatMap {\n     …n\n            }\n        }");
        return c;
    }
}
