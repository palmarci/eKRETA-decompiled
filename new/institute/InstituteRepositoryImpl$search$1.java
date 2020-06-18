package hu.ekreta.ellenorzo.institute;

import hu.ekreta.ellenorzo.rest.globalmobile.InstituteDto;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/rest/globalmobile/InstituteDto;", "it", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: InstituteRepositoryImpl.kt */
public final class InstituteRepositoryImpl$search$1<T, R> implements h<T, R> {
    public final /* synthetic */ String c;

    public InstituteRepositoryImpl$search$1(String str) {
        this.c = str;
    }

    /* renamed from: a */
    public final List<InstituteDto> apply(List<InstituteDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            String normalize = Normalizer.normalize(((InstituteDto) next).toString(), Normalizer.Form.NFD);
            Intrinsics.checkExpressionValueIsNotNull(normalize, "Normalizer\n             …g(), Normalizer.Form.NFD)");
            String replace = new Regex("[^\\p{ASCII}]").replace((CharSequence) normalize, "");
            if (replace != null) {
                String lowerCase = replace.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) this.c, false, 2, (Object) null)) {
                    arrayList.add(next);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }
}
