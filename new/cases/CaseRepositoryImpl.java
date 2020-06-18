package hu.ekreta.ellenorzo.cases;

import hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001a0\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001a0\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001d\u001a\u00020\u0014*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lhu/ekreta/ellenorzo/cases/CaseRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "caseDao", "Lhu/ekreta/ellenorzo/cases/CaseDao;", "caseFactory", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;Lhu/ekreta/ellenorzo/cases/CaseDao;Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;)V", "adapter", "hu/ekreta/ellenorzo/cases/CaseRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/cases/CaseRepositoryImpl$adapter$1;", "getCaseDao", "()Lhu/ekreta/ellenorzo/cases/CaseDao;", "getCaseFactory", "()Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "fetchCaseById", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "caseId", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchCasesByProfile", "", "getCaseById", "getCasesByProfile", "toCase", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "profileId", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl implements CaseRepository {

    /* renamed from: a  reason: collision with root package name */
    public final CaseRepositoryImpl$adapter$1 f5100a = new CaseRepositoryImpl$adapter$1(this);
    public final EAdminApi b;
    public final CaseDao c;

    /* renamed from: d  reason: collision with root package name */
    public final CaseFactory f5101d;

    public CaseRepositoryImpl(EAdminApi eAdminApi, CaseDao caseDao, CaseFactory caseFactory) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        Intrinsics.checkParameterIsNotNull(caseDao, "caseDao");
        Intrinsics.checkParameterIsNotNull(caseFactory, "caseFactory");
        this.b = eAdminApi;
        this.c = caseDao;
        this.f5101d = caseFactory;
    }

    public n<List<BaseCase>> B(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> c2 = this.b.getCases(MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), true).g(new CaseRepositoryImpl$fetchCasesByProfile$1(this, profile)).c(new CaseRepositoryImpl$fetchCasesByProfile$2(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c2, "eAdminApi\n            .g….id, cases)\n            }");
        return c2;
    }

    public final CaseDao a() {
        return this.c;
    }

    public n<List<BaseCase>> o(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.f5100a.a(profile);
    }

    public n<BaseCase> a(String str, Profile profile) {
        Intrinsics.checkParameterIsNotNull(str, "caseId");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> c2 = this.b.getCase(str, MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).h(CaseRepositoryImpl$fetchCaseById$1.INSTANCE).g(new CaseRepositoryImpl$fetchCaseById$2(this, profile)).c(new CaseRepositoryImpl$fetchCaseById$3(this));
        Intrinsics.checkExpressionValueIsNotNull(c2, "eAdminApi\n            .g…Dao.updateElement(case) }");
        return c2;
    }

    public final BaseCase a(CaseDto caseDto, String str) {
        Intrinsics.checkParameterIsNotNull(caseDto, "$this$toCase");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return this.f5101d.a(str, caseDto);
    }
}
