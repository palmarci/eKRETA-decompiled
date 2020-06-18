package hu.ekreta.ellenorzo.util;

import k.b.b;
import k.b.b0.f;
import k.b.j;
import k.b.m;
import k.b.n;
import k.b.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\n*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000b\u001aQ\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\b\b\u0000\u0010\r*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\r0\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0010\u001aQ\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011\"\b\b\u0000\u0010\r*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\r0\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0012\u001aQ\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013\"\b\b\u0000\u0010\r*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\r0\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"debugPrint", "", "message", "", "prefix", "", "step", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "printOnEach", "Lio/reactivex/Completable;", "(Lio/reactivex/Completable;Ljava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Completable;", "Lio/reactivex/Maybe;", "T", "action", "Lkotlin/Function1;", "(Lio/reactivex/Maybe;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Maybe;", "Lio/reactivex/Observable;", "(Lio/reactivex/Observable;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "Lio/reactivex/Single;", "(Lio/reactivex/Single;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Single;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: DebugHelpers.kt */
public final class DebugHelpersKt {
    public static final <T> n<T> a(n<T> nVar, Integer num, String str, Function1<? super T, String> function1) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        n<T> a2 = nVar.a((f<? super m<T>>) new DebugHelpersKt$printOnEach$2(function1, str, num));
        Intrinsics.checkExpressionValueIsNotNull(a2, "doOnEach { debugPrint(\"$… ?: it}\", prefix, step) }");
        return a2;
    }

    public static /* synthetic */ void debugPrint$default(Object obj, String str, Integer num, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            str = "====";
        }
        Intrinsics.checkParameterIsNotNull(obj, "message");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
    }

    public static /* synthetic */ b printOnEach$default(b bVar, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i2 & 2) != 0) {
            str = "====";
        }
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(bVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str2, "prefix");
        n d2 = bVar.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "toObservable<Unit>()");
        b e = printOnEach$default(d2, num2, str2, (Function1) null, 4, (Object) null).e();
        Intrinsics.checkExpressionValueIsNotNull(e, "toObservable<Unit>().pri… prefix).ignoreElements()");
        return e;
    }

    public static /* synthetic */ n printOnEach$default(n nVar, Integer num, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            str = "====";
        }
        if ((i2 & 4) != 0) {
            function1 = DebugHelpersKt$printOnEach$1.INSTANCE;
        }
        return a(nVar, num, str, function1);
    }

    public static /* synthetic */ u printOnEach$default(u uVar, Integer num, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            str = "====";
        }
        if ((i2 & 4) != 0) {
            function1 = DebugHelpersKt$printOnEach$3.INSTANCE;
        }
        Intrinsics.checkParameterIsNotNull(uVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        n b = uVar.b();
        Intrinsics.checkExpressionValueIsNotNull(b, "toObservable()");
        u d2 = a(b, num, str, function1).d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "toObservable().printOnEa…x, action).firstOrError()");
        return d2;
    }

    public static /* synthetic */ j printOnEach$default(j jVar, Integer num, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            str = "====";
        }
        if ((i2 & 4) != 0) {
            function1 = DebugHelpersKt$printOnEach$4.INSTANCE;
        }
        Intrinsics.checkParameterIsNotNull(jVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        n b = jVar.b();
        Intrinsics.checkExpressionValueIsNotNull(b, "toObservable()");
        j c = a(b, num, str, function1).c();
        Intrinsics.checkExpressionValueIsNotNull(c, "toObservable().printOnEa…x, action).firstElement()");
        return c;
    }
}
