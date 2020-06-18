package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$createNotification$1 extends Lambda implements Function1<Profile, Unit> {
    public final /* synthetic */ NotificationStrategyImpl c;
    public final /* synthetic */ PushMessage e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationStrategyImpl$createNotification$1(NotificationStrategyImpl notificationStrategyImpl, PushMessage pushMessage) {
        super(1);
        this.c = notificationStrategyImpl;
        this.e = pushMessage;
    }

    public final void a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        NotificationStrategyImpl notificationStrategyImpl = this.c;
        notificationStrategyImpl.a(NotificationStrategyImpl.access$getNotificationChannel(notificationStrategyImpl, this.e.d()), this.e.b(), this.c.a(profile, this.e.d()), this.e.hashCode());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Profile) obj);
        return Unit.INSTANCE;
    }
}
