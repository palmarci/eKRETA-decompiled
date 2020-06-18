package hu.ekreta.ellenorzo.rest;

import hu.ekreta.ellenorzo.authentication.LoggedIn;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p.t.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"API_VERSION_NUMBER", "", "HEADER_AUTHORIZATION", "", "HEADER_USER_AGENT", "authorizationHeaderIndexByMethod", "Ljava/util/HashMap;", "Ljava/lang/reflect/Method;", "getAuthorizationHeaderIndexByMethod", "()Ljava/util/HashMap;", "asAuthorizationHeader", "getAsAuthorizationHeader", "(Ljava/lang/String;)Ljava/lang/String;", "authorizationHeaderIndex", "getAuthorizationHeaderIndex", "(Ljava/lang/reflect/Method;)I", "replaceAccessToken", "Ljava/lang/reflect/InvocationHandler;", "state", "Lhu/ekreta/ellenorzo/authentication/LoggedIn;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: MobileApiV3.kt */
public final class MobileApiV3Kt {
    public static final int API_VERSION_NUMBER = 3;
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final HashMap<Method, Integer> authorizationHeaderIndexByMethod = new HashMap<>();

    public static final String getAsAuthorizationHeader(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$asAuthorizationHeader");
        return "bearer " + str;
    }

    public static final int getAuthorizationHeaderIndex(Method method) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(method, "$this$authorizationHeaderIndex");
        Integer num = authorizationHeaderIndexByMethod.get(method);
        if (num == null) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.checkExpressionValueIsNotNull(parameterAnnotations, "parameterAnnotations");
            int length = parameterAnnotations.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                Annotation[] annotationArr = parameterAnnotations[i2];
                Intrinsics.checkExpressionValueIsNotNull(annotationArr, "it");
                int length2 = annotationArr.length;
                int i3 = 0;
                while (true) {
                    z = true;
                    if (i3 >= length2) {
                        z = false;
                        break;
                    }
                    Annotation annotation = annotationArr[i3];
                    if ((annotation instanceof i) && Intrinsics.areEqual((Object) ((i) annotation).value(), (Object) HEADER_AUTHORIZATION)) {
                        break;
                    }
                    i3++;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            num = Integer.valueOf(i2);
            authorizationHeaderIndexByMethod.put(method, Integer.valueOf(num.intValue()));
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "authorizationHeaderIndex…ndexByMethod[this] = it }");
        return num.intValue();
    }

    public static final HashMap<Method, Integer> getAuthorizationHeaderIndexByMethod() {
        return authorizationHeaderIndexByMethod;
    }

    public static final InvocationHandler replaceAccessToken(InvocationHandler invocationHandler, LoggedIn loggedIn) {
        Intrinsics.checkParameterIsNotNull(invocationHandler, "$this$replaceAccessToken");
        Intrinsics.checkParameterIsNotNull(loggedIn, "state");
        return new MobileApiV3Kt$replaceAccessToken$1(invocationHandler, loggedIn);
    }
}
