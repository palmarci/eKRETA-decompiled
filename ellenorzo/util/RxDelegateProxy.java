package p289hu.ekreta.ellenorzo.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p326e.C4799a0;
import p300k.p313b.p336g0.C5006b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/RxDelegateProxy;", "T", "Ljava/lang/reflect/InvocationHandler;", "factory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "delegate", "Lio/reactivex/Observable;", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.RxDelegateProxy */
/* compiled from: RxDynamicProxy.kt */
public class RxDelegateProxy<T> implements InvocationHandler {

    /* renamed from: a */
    public final C5027n<T> f15367a;

    public RxDelegateProxy(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "factory");
        RxDynamicProxyKt$sam$java_util_concurrent_Callable$0 rxDynamicProxyKt$sam$java_util_concurrent_Callable$0 = new RxDynamicProxyKt$sam$java_util_concurrent_Callable$0(function0);
        C4704b.m16116a(rxDynamicProxyKt$sam$java_util_concurrent_Callable$0, "supplier is null");
        C5027n<T> k = C4664d.m16039a((C5027n<T>) new C4799a0<T>(rxDynamicProxyKt$sam$java_util_concurrent_Callable$0)).mo17227b(C5006b.m16847a()).mo17219b(1).mo17159k();
        Intrinsics.checkExpressionValueIsNotNull(k, "Observable.fromCallable(…1)\n        .autoConnect()");
        this.f15367a = k;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(obj, "proxy");
        Intrinsics.checkParameterIsNotNull(method, "method");
        C5027n c = this.f15367a.mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new RxDelegateProxy$invoke$1<Object,Object>(method, objArr));
        Intrinsics.checkExpressionValueIsNotNull(c, "delegate.flatMap {\n     …n\n            }\n        }");
        return c;
    }
}
