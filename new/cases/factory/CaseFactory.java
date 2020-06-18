package hu.ekreta.ellenorzo.cases.factory;

import hu.ekreta.ellenorzo.cases.BaseCase;
import hu.ekreta.ellenorzo.cases.CaseRealm;
import hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "", "fromApiModel", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "profileId", "", "caseDto", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "fromRealmModel", "caseRealm", "Lhu/ekreta/ellenorzo/cases/CaseRealm;", "toRealmModel", "model", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseFactory.kt */
public interface CaseFactory {
    BaseCase a(CaseRealm caseRealm);

    BaseCase a(String str, CaseDto caseDto);

    CaseRealm a(BaseCase baseCase);
}
