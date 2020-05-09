package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi.PushNotificationResponse;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "it", "Lhu/ekreta/ellenorzo/rest/GlobalMobileApi$PushNotificationResponse;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$subscribe$1 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ Profile f14222c;

    /* renamed from: e */
    public final /* synthetic */ NotificationMessageRole f14223e;

    /* renamed from: f */
    public final /* synthetic */ String f14224f;

    public NotificationRepositoryImpl$subscribe$1(Profile profile, NotificationMessageRole notificationMessageRole, String str) {
        this.f14222c = profile;
        this.f14223e = notificationMessageRole;
        this.f14224f = str;
    }

    /* renamed from: a */
    public final SubscriptionForPushNotification apply(PushNotificationResponse pushNotificationResponse) {
        Intrinsics.checkParameterIsNotNull(pushNotificationResponse, "it");
        return new SubscriptionForPushNotification(this.f14222c.mo14054m(), this.f14223e, pushNotificationResponse.getRegistrationID(), this.f14224f);
    }
}
