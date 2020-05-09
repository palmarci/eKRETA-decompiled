package p289hu.ekreta.ellenorzo.cases;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00042\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/CaseRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "fetchCaseById", "Lio/reactivex/Observable;", "caseId", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchCasesByProfile", "", "getCaseById", "getCasesByProfile", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseRepository */
/* compiled from: CaseRepository.kt */
public interface CaseRepository extends Repository<BaseCase> {
    /* renamed from: B */
    C5027n<List<BaseCase>> mo11667B(Profile profile);

    /* renamed from: a */
    C5027n<BaseCase> mo11668a(String str, Profile profile);

    /* renamed from: o */
    C5027n<List<BaseCase>> mo11669o(Profile profile);
}
