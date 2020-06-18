package hu.ekreta.ellenorzo.cases.subModelRepositories;

import hu.ekreta.ellenorzo.cases.subModels.CaseType;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "fetchCaseTypes", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: CaseTypeRepository.kt */
public final class CaseTypeRepositoryImpl implements CaseTypeRepository {

    /* renamed from: a  reason: collision with root package name */
    public final EAdminApi f5150a;

    public CaseTypeRepositoryImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f5150a = eAdminApi;
    }

    public n<List<CaseType>> a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<R> g2 = this.f5150a.getCaseTypes(MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).g(CaseTypeRepositoryImpl$fetchCaseTypes$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "eAdminApi.getCaseTypes(p…)\n            }\n        }");
        return g2;
    }
}
