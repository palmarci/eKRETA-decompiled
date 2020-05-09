package p289hu.ekreta.ellenorzo.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4676i;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "TModel", "it", "", "test"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.ExtensionsKt$firstOrEmpty$1 */
/* compiled from: Extensions.kt */
public final class ExtensionsKt$firstOrEmpty$1<T> implements C4676i<List<? extends TModel>> {
    public static final ExtensionsKt$firstOrEmpty$1 INSTANCE = new ExtensionsKt$firstOrEmpty$1();

    /* renamed from: a */
    public final boolean test(List<? extends TModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return !list.isEmpty();
    }
}
