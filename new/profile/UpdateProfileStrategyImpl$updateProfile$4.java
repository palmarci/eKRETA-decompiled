package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/profile/Profile;", "kotlin.jvm.PlatformType", "profile", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: UpdateProfileStrategyImpl.kt */
public final class UpdateProfileStrategyImpl$updateProfile$4<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ UpdateProfileStrategyImpl c;

    public UpdateProfileStrategyImpl$updateProfile$4(UpdateProfileStrategyImpl updateProfileStrategyImpl) {
        this.c = updateProfileStrategyImpl;
    }

    /* renamed from: a */
    public final n<Profile> apply(final Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.c.c.s(profile).g(new h<T, R>() {
            /* renamed from: a */
            public final Profile apply(SubscriptionForPushNotification subscriptionForPushNotification) {
                Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "it");
                return profile;
            }
        }).b(profile);
    }
}
