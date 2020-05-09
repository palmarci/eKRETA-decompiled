package p289hu.ekreta.ellenorzo.cases;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.cases.factory.CaseFactory;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.eadminapi.CaseDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001a0\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001a0\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001d\u001a\u00020\u0014*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/CaseRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/CaseRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "caseDao", "Lhu/ekreta/ellenorzo/cases/CaseDao;", "caseFactory", "Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;Lhu/ekreta/ellenorzo/cases/CaseDao;Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;)V", "adapter", "hu/ekreta/ellenorzo/cases/CaseRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/cases/CaseRepositoryImpl$adapter$1;", "getCaseDao", "()Lhu/ekreta/ellenorzo/cases/CaseDao;", "getCaseFactory", "()Lhu/ekreta/ellenorzo/cases/factory/CaseFactory;", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "fetchCaseById", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/cases/BaseCase;", "caseId", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchCasesByProfile", "", "getCaseById", "getCasesByProfile", "toCase", "Lhu/ekreta/ellenorzo/rest/eadminapi/CaseDto;", "profileId", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.CaseRepositoryImpl */
/* compiled from: CaseRepositoryImpl.kt */
public final class CaseRepositoryImpl implements CaseRepository {

    /* renamed from: a */
    public final CaseRepositoryImpl$adapter$1 f11311a = new CaseRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final EAdminApi f11312b;

    /* renamed from: c */
    public final CaseDao f11313c;

    /* renamed from: d */
    public final CaseFactory f11314d;

    public CaseRepositoryImpl(EAdminApi eAdminApi, CaseDao caseDao, CaseFactory caseFactory) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        Intrinsics.checkParameterIsNotNull(caseDao, "caseDao");
        Intrinsics.checkParameterIsNotNull(caseFactory, "caseFactory");
        this.f11312b = eAdminApi;
        this.f11313c = caseDao;
        this.f11314d = caseFactory;
    }

    /* renamed from: B */
    public C5027n<List<BaseCase>> mo11667B(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<BaseCase>> c = this.f11312b.getCases(MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), true).mo17246g(new CaseRepositoryImpl$fetchCasesByProfile$1(this, profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new CaseRepositoryImpl$fetchCasesByProfile$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .g….id, cases)\n            }");
        return c;
    }

    /* renamed from: a */
    public final CaseDao mo11671a() {
        return this.f11313c;
    }

    /* renamed from: o */
    public C5027n<List<BaseCase>> mo11669o(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f11311a.mo11672a(profile);
    }

    /* renamed from: a */
    public C5027n<BaseCase> mo11668a(String str, Profile profile) {
        Intrinsics.checkParameterIsNotNull(str, "caseId");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<BaseCase> c = this.f11312b.getCase(str, MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17247h(CaseRepositoryImpl$fetchCaseById$1.INSTANCE).mo17246g(new CaseRepositoryImpl$fetchCaseById$2(this, profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new CaseRepositoryImpl$fetchCaseById$3<Object,Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(c, "eAdminApi\n            .g…Dao.updateElement(case) }");
        return c;
    }

    /* renamed from: a */
    public final BaseCase mo11670a(CaseDto caseDto, String str) {
        Intrinsics.checkParameterIsNotNull(caseDto, "$this$toCase");
        Intrinsics.checkParameterIsNotNull(str, "profileId");
        return this.f11314d.mo11852a(str, caseDto);
    }
}
