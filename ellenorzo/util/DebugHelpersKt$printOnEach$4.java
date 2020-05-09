package p289hu.ekreta.ellenorzo.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo17463d2 = {"<anonymous>", "", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/String;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.DebugHelpersKt$printOnEach$4 */
/* compiled from: DebugHelpers.kt */
public final class DebugHelpersKt$printOnEach$4 extends Lambda implements Function1<T, String> {
    public static final DebugHelpersKt$printOnEach$4 INSTANCE = new DebugHelpersKt$printOnEach$4();

    public DebugHelpersKt$printOnEach$4() {
        super(1);
    }

    public final String invoke(T t) {
        Intrinsics.checkParameterIsNotNull(t, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("OnNextNotification[");
        sb.append(t);
        sb.append(']');
        return sb.toString();
    }
}
