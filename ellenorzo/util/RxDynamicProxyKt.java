package p289hu.ekreta.ellenorzo.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u000e\b\b\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\b¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0006\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo17463d2 = {"createDelegate", "T", "", "factory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "createProxy", "invocationHandler", "Ljava/lang/reflect/InvocationHandler;", "type", "Lkotlin/reflect/KClass;", "(Ljava/lang/reflect/InvocationHandler;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.RxDynamicProxyKt */
/* compiled from: RxDynamicProxy.kt */
public final class RxDynamicProxyKt {
    /* renamed from: a */
    public static final <T> T m14767a(InvocationHandler invocationHandler, KClass<T> kClass) {
        Intrinsics.checkParameterIsNotNull(invocationHandler, "invocationHandler");
        Intrinsics.checkParameterIsNotNull(kClass, "type");
        T newProxyInstance = Proxy.newProxyInstance(JvmClassMappingKt.getJavaClass(kClass).getClassLoader(), new Class[]{JvmClassMappingKt.getJavaClass(kClass)}, invocationHandler);
        if (newProxyInstance != null) {
            return newProxyInstance;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    public static final /* synthetic */ <T> T createDelegate(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "factory");
        RxDelegateProxy rxDelegateProxy = new RxDelegateProxy(function0);
        String str = "T";
        Intrinsics.reifiedOperationMarker(4, str);
        T a = m14767a(rxDelegateProxy, Reflection.getOrCreateKotlinClass(Object.class));
        Intrinsics.reifiedOperationMarker(1, str);
        return a;
    }
}
