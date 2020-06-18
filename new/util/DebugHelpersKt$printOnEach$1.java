package hu.ekreta.ellenorzo.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/String;"}, k = 3, mv = {1, 1, 15})
/* compiled from: DebugHelpers.kt */
public final class DebugHelpersKt$printOnEach$1 extends Lambda implements Function1<T, String> {
    public static final DebugHelpersKt$printOnEach$1 INSTANCE = new DebugHelpersKt$printOnEach$1();

    public DebugHelpersKt$printOnEach$1() {
        super(1);
    }

    public final String invoke(T t) {
        Intrinsics.checkParameterIsNotNull(t, "it");
        return "OnNextNotification[" + t + ']';
    }
}
