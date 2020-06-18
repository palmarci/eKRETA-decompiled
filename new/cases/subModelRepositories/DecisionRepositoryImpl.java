package hu.ekreta.ellenorzo.cases.subModelRepositories;

import h.w.v;
import hu.ekreta.ellenorzo.cases.decision.DecisionDetailPost;
import hu.ekreta.ellenorzo.cases.subModels.OtherThingsToDoAttachment;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.EAdminApi;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.eadminapi.DecisionPostDto;
import hu.ekreta.ellenorzo.rest.eadminapi.TypeDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.ArrayList;
import java.util.List;
import k.b.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepositoryImpl;", "Lhu/ekreta/ellenorzo/cases/subModelRepositories/DecisionRepository;", "eAdminApi", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "(Lhu/ekreta/ellenorzo/rest/EAdminApi;)V", "getEAdminApi", "()Lhu/ekreta/ellenorzo/rest/EAdminApi;", "postDecision", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "decisionDetailPost", "Lhu/ekreta/ellenorzo/cases/decision/DecisionDetailPost;", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: DecisionRepository.kt */
public final class DecisionRepositoryImpl implements DecisionRepository {

    /* renamed from: a  reason: collision with root package name */
    public final EAdminApi f5154a;

    public DecisionRepositoryImpl(EAdminApi eAdminApi) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "eAdminApi");
        this.f5154a = eAdminApi;
    }

    public n<Boolean> a(Profile profile, DecisionDetailPost decisionDetailPost) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        Intrinsics.checkParameterIsNotNull(decisionDetailPost, "decisionDetailPost");
        EAdminApi eAdminApi = this.f5154a;
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.d());
        String b = decisionDetailPost.b();
        String b2 = decisionDetailPost.b();
        String d2 = decisionDetailPost.d();
        TypeDto a2 = v.a(decisionDetailPost.c());
        List<OtherThingsToDoAttachment> a3 = decisionDetailPost.a();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(a3, 10));
        for (OtherThingsToDoAttachment a4 : a3) {
            arrayList.add(v.a(a4));
        }
        n<R> i2 = eAdminApi.createDecision(asAuthorizationHeader, b, new DecisionPostDto(b2, d2, a2, arrayList)).g(DecisionRepositoryImpl$postDecision$2.INSTANCE).i(DecisionRepositoryImpl$postDecision$3.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(i2, "eAdminApi.createDecision…          false\n        }");
        return i2;
    }
}
