package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.subModels.CaseType;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/CaseTypeRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "fetchCaseTypes", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/cases/subModels/CaseType;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.CaseTypeRepositoryImpl */
/* compiled from: CaseTypeRepository.kt */
public final class CaseTypeRepositoryImpl implements CaseTypeRepository {

    /* renamed from: a */
    public final EAdminApi f11516a;

    public CaseTypeRepositoryImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f11516a = eAdminApi;
    }

    /* renamed from: a */
    public C5027n<List<CaseType>> mo11858a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<CaseType>> g = this.f11516a.getCaseTypes(MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(CaseTypeRepositoryImpl$fetchCaseTypes$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "eAdminApi.getCaseTypes(p…)\n            }\n        }");
        return g;
    }
}
