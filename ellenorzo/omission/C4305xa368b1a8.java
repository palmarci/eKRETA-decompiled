package p289hu.ekreta.ellenorzo.omission;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.omission.Omission.JustificationState;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/omission/Omission;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionRepositoryImpl$getOmissionsWithBeJustifiedStateCountByProfile$1 */
/* compiled from: OmissionRepositoryImpl.kt */
public final class C4305xa368b1a8<T, R> implements C4675h<T, R> {
    public static final C4305xa368b1a8 INSTANCE = new C4305xa368b1a8();

    /* renamed from: a */
    public final List<Omission> apply(List<Omission> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Omission) next).mo13847j() == JustificationState.BeJustified) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
