package p289hu.ekreta.ellenorzo.cases.factory;

import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.cases.BaseCase;
import p289hu.ekreta.ellenorzo.cases.CaseRealm;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "", "fromApiModel", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "profileId", "", "caseDto", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "fromRealmModel", "caseRealm", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "toRealmModel", "model", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.factory.CaseFactory */
/* compiled from: CaseFactory.kt */
public interface CaseFactory {
    /* renamed from: a */
    BaseCase mo11851a(CaseRealm caseRealm);

    /* renamed from: a */
    BaseCase mo11852a(String str, CaseDto caseDto);

    /* renamed from: a */
    CaseRealm mo11853a(BaseCase baseCase);
}
