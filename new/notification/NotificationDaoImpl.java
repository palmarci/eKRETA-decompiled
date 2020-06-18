package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.notification.NotificationMessageRole;
import hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "Lhu/ekreta/ellenorzo/notification/NotificationStateRealm;", "Lhu/ekreta/ellenorzo/notification/NotificationDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NotificationDaoImpl.kt */
public final class NotificationDaoImpl extends ProfileSpecificDaoImpl<SubscriptionForPushNotification, NotificationStateRealm> implements NotificationDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NotificationDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.notification.NotificationStateRealm> r0 = hu.ekreta.ellenorzo.notification.NotificationStateRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.notification.NotificationDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public SubscriptionForPushNotification realmModelToModel(NotificationStateRealm notificationStateRealm) {
        Intrinsics.checkParameterIsNotNull(notificationStateRealm, "realmModel");
        try {
            String f2 = notificationStateRealm.f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            NotificationMessageRole.Companion companion = NotificationMessageRole.Companion;
            Integer e2 = notificationStateRealm.e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            NotificationMessageRole a2 = companion.a(e2.intValue());
            String g2 = notificationStateRealm.g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            String h2 = notificationStateRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            return new SubscriptionForPushNotification(f2, a2, g2, h2);
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public NotificationStateRealm modelToRealmModel(SubscriptionForPushNotification subscriptionForPushNotification) {
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "model");
        return new NotificationStateRealm(subscriptionForPushNotification.e(), Integer.valueOf(subscriptionForPushNotification.a().a()), subscriptionForPushNotification.b(), subscriptionForPushNotification.c());
    }
}
