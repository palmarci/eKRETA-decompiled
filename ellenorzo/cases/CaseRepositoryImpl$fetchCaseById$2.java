package p289hu.ekreta.ellenorzo.cases;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "response", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseRepositoryImpl$fetchCaseById$2 */
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCaseById$2<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ CaseRepositoryImpl f11319c;

    /* renamed from: e */
    public final /* synthetic */ Profile f11320e;

    public CaseRepositoryImpl$fetchCaseById$2(CaseRepositoryImpl caseRepositoryImpl, Profile profile) {
        this.f11319c = caseRepositoryImpl;
        this.f11320e = profile;
    }

    /* renamed from: a */
    public final BaseCase apply(CaseDto caseDto) {
        Intrinsics.checkParameterIsNotNull(caseDto, "response");
        return this.f11319c.mo11670a(caseDto, this.f11320e.mo14054m());
    }
}
