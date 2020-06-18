package hu.ekreta.ellenorzo.util.binding;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0004H\u0007J-\u0010\u0007\u001a\u00020\u0004\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t2\u0006\u0010\n\u001a\u0002H\b2\u0006\u0010\u000b\u001a\u0002H\bH\u0007¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J-\u0010\u0013\u001a\u00020\u0004\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t2\u0006\u0010\n\u001a\u0002H\b2\u0006\u0010\u000b\u001a\u0002H\bH\u0007¢\u0006\u0002\u0010\fJ\u0014\u0010\u0014\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0004H\u0007¨\u0006\u0015"}, d2 = {"Lhu/ekreta/ellenorzo/util/binding/BindingUtil;", "", "()V", "and", "", "values", "", "gt", "T", "", "first", "second", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "isNullOrEmpty", "value", "", "isZero", "number", "", "lt", "or", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Utils.kt */
public final class BindingUtil {
    public static final BindingUtil INSTANCE = new BindingUtil();

    @JvmStatic
    public static final boolean a(boolean... zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "values");
        for (boolean z : zArr) {
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
