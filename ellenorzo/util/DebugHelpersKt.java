package p289hu.ekreta.ellenorzo.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.C4667b;
import p300k.p313b.C5023j;
import p300k.p313b.C5026m;
import p300k.p313b.C5027n;
import p300k.p313b.C5036u;
import p300k.p313b.p315b0.C4673f;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\n*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000b\u001aQ\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\b\b\u0000\u0010\r*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\r0\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0010\u001aQ\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011\"\b\b\u0000\u0010\r*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\r0\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0012\u001aQ\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013\"\b\b\u0000\u0010\r*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\r0\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, mo17463d2 = {"debugPrint", "", "message", "", "prefix", "", "step", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "printOnEach", "Lio/reactivex/Completable;", "(Lio/reactivex/Completable;Ljava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Completable;", "Lio/reactivex/Maybe;", "T", "action", "Lkotlin/Function1;", "(Lio/reactivex/Maybe;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Maybe;", "Lio/reactivex/Observable;", "(Lio/reactivex/Observable;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "Lio/reactivex/Single;", "(Lio/reactivex/Single;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Single;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.DebugHelpersKt */
/* compiled from: DebugHelpers.kt */
public final class DebugHelpersKt {
    /* renamed from: a */
    public static final <T> C5027n<T> m14622a(C5027n<T> nVar, Integer num, String str, Function1<? super T, String> function1) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        C5027n<T> a = nVar.mo17202a((C4673f<? super C5026m<T>>) new DebugHelpersKt$printOnEach$2<Object>(function1, str, num));
        Intrinsics.checkExpressionValueIsNotNull(a, "doOnEach { debugPrint(\"$… ?: it}\", prefix, step) }");
        return a;
    }

    public static /* synthetic */ void debugPrint$default(Object obj, String str, Integer num, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "====";
        }
        Intrinsics.checkParameterIsNotNull(obj, "message");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
    }

    public static /* synthetic */ C4667b printOnEach$default(C4667b bVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            str = "====";
        }
        String str2 = str;
        Intrinsics.checkParameterIsNotNull(bVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str2, "prefix");
        C5027n d = bVar.mo16983d();
        Intrinsics.checkExpressionValueIsNotNull(d, "toObservable<Unit>()");
        C4667b e = printOnEach$default(d, num2, str2, (Function1) null, 4, (Object) null).mo17241e();
        Intrinsics.checkExpressionValueIsNotNull(e, "toObservable<Unit>().pri… prefix).ignoreElements()");
        return e;
    }

    public static /* synthetic */ C5027n printOnEach$default(C5027n nVar, Integer num, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = "====";
        }
        if ((i & 4) != 0) {
            function1 = DebugHelpersKt$printOnEach$1.INSTANCE;
        }
        return m14622a(nVar, num, str, function1);
    }

    public static /* synthetic */ C5036u printOnEach$default(C5036u uVar, Integer num, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = "====";
        }
        if ((i & 4) != 0) {
            function1 = DebugHelpersKt$printOnEach$3.INSTANCE;
        }
        Intrinsics.checkParameterIsNotNull(uVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        C5027n b = uVar.mo17264b();
        Intrinsics.checkExpressionValueIsNotNull(b, "toObservable()");
        C5036u d = m14622a(b, num, str, function1).mo17239d();
        Intrinsics.checkExpressionValueIsNotNull(d, "toObservable().printOnEa…x, action).firstOrError()");
        return d;
    }

    public static /* synthetic */ C5023j printOnEach$default(C5023j jVar, Integer num, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = "====";
        }
        if ((i & 4) != 0) {
            function1 = DebugHelpersKt$printOnEach$4.INSTANCE;
        }
        Intrinsics.checkParameterIsNotNull(jVar, "$this$printOnEach");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        C5027n b = jVar.mo17187b();
        Intrinsics.checkExpressionValueIsNotNull(b, "toObservable()");
        C5023j c = m14622a(b, num, str, function1).mo17229c();
        Intrinsics.checkExpressionValueIsNotNull(c, "toObservable().printOnEa…x, action).firstElement()");
        return c;
    }
}
