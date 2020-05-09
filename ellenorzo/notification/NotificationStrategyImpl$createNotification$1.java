package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "invoke"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$createNotification$1 */
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$createNotification$1 extends Lambda implements Function1<Profile, Unit> {

    /* renamed from: c */
    public final /* synthetic */ NotificationStrategyImpl f14270c;

    /* renamed from: e */
    public final /* synthetic */ PushMessage f14271e;

    public NotificationStrategyImpl$createNotification$1(NotificationStrategyImpl notificationStrategyImpl, PushMessage pushMessage) {
        this.f14270c = notificationStrategyImpl;
        this.f14271e = pushMessage;
        super(1);
    }

    /* renamed from: a */
    public final void mo13794a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        NotificationStrategyImpl notificationStrategyImpl = this.f14270c;
        notificationStrategyImpl.mo13793a(NotificationStrategyImpl.access$getNotificationChannel(notificationStrategyImpl, this.f14271e.mo13806d()), this.f14271e.mo13804b(), this.f14270c.mo13791a(profile, this.f14271e.mo13806d()), this.f14271e.hashCode());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo13794a((Profile) obj);
        return Unit.INSTANCE;
    }
}
