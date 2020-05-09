package p289hu.ekreta.ellenorzo.cases;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "response", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseRepositoryImpl$fetchCasesByProfile$1 */
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCasesByProfile$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ CaseRepositoryImpl f11322c;

    /* renamed from: e */
    public final /* synthetic */ Profile f11323e;

    public CaseRepositoryImpl$fetchCasesByProfile$1(CaseRepositoryImpl caseRepositoryImpl, Profile profile) {
        this.f11322c = caseRepositoryImpl;
        this.f11323e = profile;
    }

    /* renamed from: a */
    public final List<BaseCase> apply(List<CaseDto> list) {
        Intrinsics.checkParameterIsNotNull(list, "response");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CaseDto a : list) {
            arrayList.add(this.f11322c.mo11670a(a, this.f11323e.mo14054m()));
        }
        return arrayList;
    }
}
