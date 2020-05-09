package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.notification.NotificationMessageRole.Companion;
import p289hu.ekreta.ellenorzo.util.dao.ProfileSpecificDaoImpl;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notification/NotificationDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ProfileSpecificDaoImpl;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "Lhu/ekreta/ellenorzo/notification/NotificationStateRealm;", "Lhu/ekreta/ellenorzo/notification/NotificationDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationDaoImpl */
/* compiled from: NotificationDaoImpl.kt */
public final class NotificationDaoImpl extends ProfileSpecificDaoImpl<SubscriptionForPushNotification, NotificationStateRealm> implements NotificationDao {
    public NotificationDaoImpl(C5061c0 c0Var) {
        Class<NotificationStateRealm> cls = NotificationStateRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public SubscriptionForPushNotification realmModelToModel(NotificationStateRealm notificationStateRealm) {
        Intrinsics.checkParameterIsNotNull(notificationStateRealm, "realmModel");
        try {
            String e2 = notificationStateRealm.mo13782e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            Companion companion = NotificationMessageRole.Companion;
            Integer d2 = notificationStateRealm.mo13781d2();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            NotificationMessageRole a = companion.mo13750a(d2.intValue());
            String f2 = notificationStateRealm.mo13783f2();
            if (f2 == null) {
                Intrinsics.throwNpe();
            }
            String g2 = notificationStateRealm.mo13784g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            return new SubscriptionForPushNotification(e2, a, f2, g2);
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public NotificationStateRealm modelToRealmModel(SubscriptionForPushNotification subscriptionForPushNotification) {
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "model");
        return new NotificationStateRealm(subscriptionForPushNotification.mo11318e(), Integer.valueOf(subscriptionForPushNotification.mo13812a().mo13749a()), subscriptionForPushNotification.mo13814b(), subscriptionForPushNotification.mo13815c());
    }
}
