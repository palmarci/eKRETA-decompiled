package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.Repository;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00042\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/CaseRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "fetchCaseById", "Lio/reactivex/Observable;", "caseId", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchCasesByProfile", "", "getCaseById", "getCasesByProfile", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseRepository.kt */
public interface CaseRepository extends Repository<BaseCase> {
    n<List<BaseCase>> B(Profile profile);

    n<BaseCase> a(String str, Profile profile);

    n<List<BaseCase>> o(Profile profile);
}
