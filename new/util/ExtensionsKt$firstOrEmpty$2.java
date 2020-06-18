package hu.ekreta.ellenorzo.util;

import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "TModel", "it", "", "apply", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt$firstOrEmpty$2<T, R> implements h<T, R> {
    public static final ExtensionsKt$firstOrEmpty$2 INSTANCE = new ExtensionsKt$firstOrEmpty$2();

    /* renamed from: a */
    public final TModel apply(List<? extends TModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return CollectionsKt___CollectionsKt.first(list);
    }
}
