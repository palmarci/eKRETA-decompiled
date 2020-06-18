package hu.ekreta.ellenorzo.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "T", "it", "apply", "(Ljava/lang/Object;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 15})
/* compiled from: RxDynamicProxy.kt */
public final class RxDelegateProxy$invoke$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ Method c;
    public final /* synthetic */ Object[] e;

    public RxDelegateProxy$invoke$1(Method method, Object[] objArr) {
        this.c = method;
        this.e = objArr;
    }

    public final n<? extends Object> apply(T t) {
        try {
            Method method = this.c;
            Object[] objArr = this.e;
            if (objArr == null) {
                objArr = new Object[0];
            }
            Object invoke = method.invoke(t, Arrays.copyOf(objArr, objArr.length));
            if (invoke != null) {
                return (n) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<out kotlin.Any>");
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            Intrinsics.checkExpressionValueIsNotNull(targetException, "e.targetException");
            throw targetException;
        }
    }
}
