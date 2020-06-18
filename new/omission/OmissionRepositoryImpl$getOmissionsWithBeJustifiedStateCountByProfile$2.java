package hu.ekreta.ellenorzo.omission;

import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: OmissionRepositoryImpl.kt */
public final class OmissionRepositoryImpl$getOmissionsWithBeJustifiedStateCountByProfile$2<T, R> implements h<T, R> {
    public static final OmissionRepositoryImpl$getOmissionsWithBeJustifiedStateCountByProfile$2 INSTANCE = new OmissionRepositoryImpl$getOmissionsWithBeJustifiedStateCountByProfile$2();

    public final int a(List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return list.size();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Integer.valueOf(a((List) obj));
    }
}
