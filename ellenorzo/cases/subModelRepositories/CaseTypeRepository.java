package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "", "fetchCaseTypes", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepository */
/* compiled from: CaseTypeRepository.kt */
public interface CaseTypeRepository {
    /* renamed from: a */
    C5027n<List<CaseType>> mo11858a(Profile profile);
}
