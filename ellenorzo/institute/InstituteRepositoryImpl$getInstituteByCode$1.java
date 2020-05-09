package p289hu.ekreta.ellenorzo.institute;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/institute/Institute;", "it", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.institute.InstituteRepositoryImpl$getInstituteByCode$1 */
/* compiled from: InstituteRepositoryImpl.kt */
public final class InstituteRepositoryImpl$getInstituteByCode$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ String f13613c;

    public InstituteRepositoryImpl$getInstituteByCode$1(String str) {
        this.f13613c = str;
    }

    /* renamed from: a */
    public final List<Institute> apply(List<Institute> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (Intrinsics.areEqual((Object) ((Institute) next).mo13066b(), (Object) this.f13613c)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
