package p289hu.ekreta.ellenorzo.cases.subModelRepositories;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost;
import p289hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto;
import p289hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "postDecision", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "decisionDetailPost", "Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailPost;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.cases.subModelRepositories.DecisionRepositoryImpl */
/* compiled from: DecisionRepository.kt */
public final class DecisionRepositoryImpl implements DecisionRepository {

    /* renamed from: a */
    public final EAdminApi f11520a;

    public DecisionRepositoryImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f11520a = eAdminApi;
    }

    /* renamed from: a */
    public C5027n<Boolean> mo11862a(Profile profile, DecisionDetailPost decisionDetailPost) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(decisionDetailPost, "decisionDetailPost");
        EAdminApi eAdminApi = this.f11520a;
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d());
        String b = decisionDetailPost.mo11720b();
        String b2 = decisionDetailPost.mo11720b();
        String d = decisionDetailPost.mo11722d();
        TypeDto a = C3984v.m10163a(decisionDetailPost.mo11721c());
        List<OtherThingsToDoAttachment> a2 = decisionDetailPost.mo11719a();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(a2, 10));
        for (OtherThingsToDoAttachment a3 : a2) {
            arrayList.add(C3984v.m10162a(a3));
        }
        C5027n<Boolean> i = eAdminApi.createDecision(asAuthorizationHeader, b, new DecisionPostDto(b2, d, a, arrayList)).mo17246g(DecisionRepositoryImpl$postDecision$2.INSTANCE).mo17250i(DecisionRepositoryImpl$postDecision$3.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(i, "eAdminApi.createDecision…          false\n        }");
        return i;
    }
}
