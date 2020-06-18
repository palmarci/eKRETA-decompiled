package hu.ekreta.ellenorzo.util;

import java.util.List;
import k.b.b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "TModel", "it", "", "test"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$firstOrEmpty$1<T> implements i<List<? extends TModel>> {
    public static final ExtensionsKt$firstOrEmpty$1 INSTANCE = new ExtensionsKt$firstOrEmpty$1();

    /* renamed from: a */
    public final boolean test(List<? extends TModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return !list.isEmpty();
    }
}
