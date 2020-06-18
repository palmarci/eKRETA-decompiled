package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "response", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl$fetchCaseById$2<T, R> implements h<T, R> {
    public final /* synthetic */ CaseRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public CaseRepositoryImpl$fetchCaseById$2(CaseRepositoryImpl caseRepositoryImpl, Profile profile) {
        this.c = caseRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final BaseCase apply(CaseDto caseDto) {
        Intrinsics.checkParameterIsNotNull(caseDto, "response");
        return this.c.a(caseDto, this.e.m());
    }
}
