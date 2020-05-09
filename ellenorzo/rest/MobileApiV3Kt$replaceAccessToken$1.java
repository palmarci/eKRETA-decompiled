package p289hu.ekreta.ellenorzo.rest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.authentication.LoggedIn;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, mo17463d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.MobileApiV3Kt$replaceAccessToken$1 */
/* compiled from: MobileApiV3.kt */
public final class MobileApiV3Kt$replaceAccessToken$1 implements InvocationHandler {
    public final /* synthetic */ LoggedIn $state;
    public final /* synthetic */ InvocationHandler $this_replaceAccessToken;

    public MobileApiV3Kt$replaceAccessToken$1(InvocationHandler invocationHandler, LoggedIn loggedIn) {
        this.$this_replaceAccessToken = invocationHandler;
        this.$state = loggedIn;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Intrinsics.checkParameterIsNotNull(obj, "proxy");
        Intrinsics.checkParameterIsNotNull(method, "method");
        InvocationHandler invocationHandler = this.$this_replaceAccessToken;
        Integer valueOf = Integer.valueOf(MobileApiV3Kt.getAuthorizationHeaderIndex(method));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (objArr == null) {
                Intrinsics.throwNpe();
            }
            objArr = Arrays.copyOf(objArr, objArr.length);
            objArr[intValue] = MobileApiV3Kt.getAsAuthorizationHeader(this.$state.mo11553a().mo14042d());
        }
        return invocationHandler.invoke(obj, method, objArr);
    }
}
