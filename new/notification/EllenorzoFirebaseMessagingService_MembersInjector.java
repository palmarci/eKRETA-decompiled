package hu.ekreta.ellenorzo.notification;

import i.b;
import l.a.a;

public final class EllenorzoFirebaseMessagingService_MembersInjector implements b<EllenorzoFirebaseMessagingService> {

    /* renamed from: a  reason: collision with root package name */
    public final a<NotificationStrategy> f5910a;

    /* renamed from: a */
    public void injectMembers(EllenorzoFirebaseMessagingService ellenorzoFirebaseMessagingService) {
        ellenorzoFirebaseMessagingService.f5909k = this.f5910a.get();
    }

    public static void a(EllenorzoFirebaseMessagingService ellenorzoFirebaseMessagingService, NotificationStrategy notificationStrategy) {
        ellenorzoFirebaseMessagingService.f5909k = notificationStrategy;
    }
}
