package p289hu.ekreta.ellenorzo.omission;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionRepositoryImpl$getOmissionsWithBeJustifiedStateCountByProfile$2 */
/* compiled from: OmissionRepositoryImpl.kt */
public final class C4306xa368b1a9<T, R> implements C4675h<T, R> {
    public static final C4306xa368b1a9 INSTANCE = new C4306xa368b1a9();

    /* renamed from: a */
    public final int mo13980a(List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        return list.size();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Integer.valueOf(mo13980a((List) obj));
    }
}
