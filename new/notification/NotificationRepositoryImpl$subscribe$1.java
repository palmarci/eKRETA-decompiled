package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.globalmobile.PushNotificationRegistrationDto;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "it", "Lhu/ekreta/ellenorzo/rest/globalmobile/PushNotificationRegistrationDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;
    public final /* synthetic */ NotificationMessageRole e;
    public final /* synthetic */ String f;

    public NotificationRepositoryImpl$subscribe$1(Profile profile, NotificationMessageRole notificationMessageRole, String str) {
        this.c = profile;
        this.e = notificationMessageRole;
        this.f = str;
    }

    /* renamed from: a */
    public final SubscriptionForPushNotification apply(PushNotificationRegistrationDto pushNotificationRegistrationDto) {
        Intrinsics.checkParameterIsNotNull(pushNotificationRegistrationDto, "it");
        return new SubscriptionForPushNotification(this.c.m(), this.e, pushNotificationRegistrationDto.getRegistrationID(), this.f);
    }
}
