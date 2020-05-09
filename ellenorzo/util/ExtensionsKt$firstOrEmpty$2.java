package p289hu.ekreta.ellenorzo.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo17463d2 = {"<anonymous>", "TModel", "it", "", "apply", "(Ljava/util/List;)Ljava/lang/Object;"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$firstOrEmpty$2 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$firstOrEmpty$2<T, R> implements C4675h<T, R> {
    public static final ExtensionsKt$firstOrEmpty$2 INSTANCE = new ExtensionsKt$firstOrEmpty$2();

    /* renamed from: a */
    public final TModel apply(List<? extends TModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return CollectionsKt___CollectionsKt.first(list);
    }
}
