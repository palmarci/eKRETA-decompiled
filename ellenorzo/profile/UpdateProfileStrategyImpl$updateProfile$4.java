package p289hu.ekreta.ellenorzo.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "profile", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.profile.UpdateProfileStrategyImpl$updateProfile$4 */
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$4<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ UpdateProfileStrategyImpl f14554c;

    public UpdateProfileStrategyImpl$updateProfile$4(UpdateProfileStrategyImpl updateProfileStrategyImpl) {
        this.f14554c = updateProfileStrategyImpl;
    }

    /* renamed from: a */
    public final C5027n<Profile> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14554c.f14546c.mo13758s(profile).mo17246g(new C4675h<T, R>() {
            /* renamed from: a */
            public final Profile apply(SubscriptionForPushNotification subscriptionForPushNotification) {
                Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "it");
                return profile;
            }
        }).mo17222b(profile);
    }
}
