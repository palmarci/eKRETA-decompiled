package hu.ekreta.ellenorzo.rest;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.eadminapi.StatusDto;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.a0.d;
import k.b.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"isAvailable", "Lio/reactivex/Completable;", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_guardianProdRelease"}, k = 2, mv = {1, 1, 15})
/* compiled from: Extensions.kt */
public final class ExtensionsKt {
    public static final b isAvailable(EAdminApi eAdminApi, Profile profile) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "$this$isAvailable");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<StatusDto> status = eAdminApi.getStatus(MobileApiV3Kt.getAsAuthorizationHeader(profile.d()));
        k.b.c0.b.b.a(status, "observable is null");
        b a2 = d.a((b) new k.b.c0.e.a.d(status));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Completable.fromObservab…n.asAuthorizationHeader))");
        return a2;
    }
}
