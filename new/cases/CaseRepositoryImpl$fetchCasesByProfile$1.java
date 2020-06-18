package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import java.util.ArrayList;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "response", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCasesByProfile$1<T, R> implements h<T, R> {
    public final /* synthetic */ CaseRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public CaseRepositoryImpl$fetchCasesByProfile$1(CaseRepositoryImpl caseRepositoryImpl, Profile profile) {
        this.c = caseRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final List<BaseCase> apply(List<CaseDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "response");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CaseDto a2 : list) {
            arrayList.add(this.c.a(a2, this.e.m()));
        }
        return arrayList;
    }
}
