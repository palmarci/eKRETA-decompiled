package hu.ekreta.ellenorzo.addresseeselector.viewmodel;

import a.b.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeFilter;", "", "()V", "createHighLiteText", "", "text", "from", "", "length", "createSearchableText", "filter", "", "Lhu/ekreta/ellenorzo/addresseeselector/viewmodel/AddresseeSelectorListItem;", "list", "searchFor", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AddresseeFilter.kt */
public final class AddresseeFilter {
    public static final AddresseeFilter INSTANCE = new AddresseeFilter();

    public final String a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int length = lowerCase.length();
        String str2 = "";
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = lowerCase.charAt(i2);
            StringBuilder a2 = a.a(str2);
            if (charAt == 225) {
                charAt = 'a';
            } else if (charAt == 233) {
                charAt = 'e';
            } else if (charAt != 237) {
                if (!(charAt == 243 || charAt == 246)) {
                    if (!(charAt == 250 || charAt == 252)) {
                        if (charAt != 337) {
                            if (charAt != 369) {
                            }
                        }
                    }
                    charAt = 'u';
                }
                charAt = 'o';
            } else {
                charAt = 'i';
            }
            a2.append(charAt);
            str2 = a2.toString();
        }
        return str2;
    }

    public final String a(String str, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        StringBuilder sb = new StringBuilder();
        sb.append(str.subSequence(0, i2));
        sb.append("<b>");
        int i4 = i3 + i2;
        sb.append(str.subSequence(i2, i4));
        sb.append("</b>");
        sb.append(str.subSequence(i4, str.length()));
        return sb.toString();
    }

    public final List<AddresseeSelectorListItem> a(List<AddresseeSelectorListItem> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        Intrinsics.checkParameterIsNotNull(str, "searchFor");
        String a2 = a(str);
        ArrayList arrayList = new ArrayList();
        for (AddresseeSelectorListItem next : list) {
            if (StringsKt__StringsKt.contains$default((CharSequence) next.f(), (CharSequence) a2, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) next.g(), (CharSequence) a2, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) next.e(), (CharSequence) a2, false, 2, (Object) null)) {
                next.a(str);
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
