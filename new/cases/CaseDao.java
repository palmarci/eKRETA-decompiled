package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDao;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lhu/ekreta/ellenorzo/cases/CaseDao;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDao;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "getCaseById", "Lio/reactivex/Observable;", "caseId", "", "updateElement", "case", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseDao.kt */
public interface CaseDao extends ProfileSpecificDao<BaseCase> {
    n<BaseCase> a(BaseCase baseCase);
}
