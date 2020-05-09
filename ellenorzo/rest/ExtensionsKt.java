package p289hu.ekreta.ellenorzo.rest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p316c0.p318b.C4704b;
import p300k.p313b.p316c0.p321e.p322a.C4733d;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo17463d2 = {"isAvailable", "Lio/reactivex/Completable;", "Lhu/ekreta/ellenorzo/rest/EAdminApi;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "app_studentProdRelease"}, mo17464k = 2, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.rest.ExtensionsKt */
/* compiled from: Extensions.kt */
public final class ExtensionsKt {
    public static final C4667b isAvailable(EAdminApi eAdminApi, Profile profile) {
        Intrinsics.checkParameterIsNotNull(eAdminApi, "$this$isAvailable");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n unreadMessagesCount = eAdminApi.getUnreadMessagesCount(MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()));
        C4704b.m16116a(unreadMessagesCount, "observable is null");
        C4667b a = C4664d.m16035a((C4667b) new C4733d(unreadMessagesCount));
        Intrinsics.checkExpressionValueIsNotNull(a, "Completable.fromObservab…n.asAuthorizationHeader))");
        return a;
    }
}
