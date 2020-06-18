package hu.ekreta.ellenorzo.util.binding;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/util/binding/BindingConverters;", "", "()V", "booleanToVisibility", "", "isVisible", "", "listToVisibility", "list", "", "stringToVisibility", "text", "", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: Utils.kt */
public final class BindingConverters {
    public static final BindingConverters INSTANCE = new BindingConverters();

    @JvmStatic
    public static final int a(List<?> list) {
        return (list == null || list.isEmpty()) ? 8 : 0;
    }

    @JvmStatic
    public static final int a(boolean z) {
        return z ? 0 : 8;
    }

    @JvmStatic
    public static final int a(String str) {
        return str == null || str.length() == 0 ? 8 : 0;
    }
}
