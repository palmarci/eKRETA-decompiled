package p289hu.ekreta.ellenorzo.notification;

import p292i.C4447b;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notification.EllenorzoFirebaseMessagingService_MembersInjector */
public final class EllenorzoFirebaseMessagingService_MembersInjector implements C4447b<EllenorzoFirebaseMessagingService> {

    /* renamed from: a */
    public final C5431a<NotificationStrategy> f14199a;

    /* renamed from: a */
    public void injectMembers(EllenorzoFirebaseMessagingService ellenorzoFirebaseMessagingService) {
        ellenorzoFirebaseMessagingService.f14198k = (NotificationStrategy) this.f14199a.get();
    }

    /* renamed from: a */
    public static void m13395a(EllenorzoFirebaseMessagingService ellenorzoFirebaseMessagingService, NotificationStrategy notificationStrategy) {
        ellenorzoFirebaseMessagingService.f14198k = notificationStrategy;
    }
}
