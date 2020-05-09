package p289hu.ekreta.ellenorzo.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "T", "it", "apply", "(Ljava/lang/Object;)Lio/reactivex/Observable;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.RxDelegateProxy$invoke$1 */
/* compiled from: RxDynamicProxy.kt */
public final class RxDelegateProxy$invoke$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ Method f15368c;

    /* renamed from: e */
    public final /* synthetic */ Object[] f15369e;

    public RxDelegateProxy$invoke$1(Method method, Object[] objArr) {
        this.f15368c = method;
        this.f15369e = objArr;
    }

    public final C5027n<? extends Object> apply(T t) {
        try {
            Method method = this.f15368c;
            Object[] objArr = this.f15369e;
            if (objArr == null) {
                objArr = new Object[0];
            }
            Object invoke = method.invoke(t, Arrays.copyOf(objArr, objArr.length));
            if (invoke != null) {
                return (C5027n) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<out kotlin.Any>");
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            Intrinsics.checkExpressionValueIsNotNull(targetException, "e.targetException");
            throw targetException;
        }
    }
}
