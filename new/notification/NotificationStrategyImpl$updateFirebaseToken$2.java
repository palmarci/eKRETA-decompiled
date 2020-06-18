package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import java.util.Map;
import k.b.b0.c;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "profilesById", "", "subscriptions", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$updateFirebaseToken$2<T1, T2, R> implements c<Map<String, ? extends Profile>, List<? extends SubscriptionForPushNotification>, Map<Profile, ? extends SubscriptionForPushNotification>> {
    public static final NotificationStrategyImpl$updateFirebaseToken$2 INSTANCE = new NotificationStrategyImpl$updateFirebaseToken$2();

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, hu.ekreta.ellenorzo.profile.Profile>, java.util.Map, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<hu.ekreta.ellenorzo.profile.Profile, hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification> apply(java.util.Map<java.lang.String, hu.ekreta.ellenorzo.profile.Profile> r4, java.util.List<hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "profilesById"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "subscriptions"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0013:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r5.next()
            r2 = r1
            hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification r2 = (hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification) r2
            java.lang.String r2 = r2.e()
            boolean r2 = r4.containsKey(r2)
            if (r2 == 0) goto L_0x0013
            r0.add(r1)
            goto L_0x0013
        L_0x002e:
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, r5)
            int r5 = kotlin.collections.MapsKt__MapsKt.mapCapacity(r5)
            r1 = 16
            int r5 = kotlin.ranges.RangesKt___RangesKt.coerceAtLeast((int) r5, (int) r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r5)
            java.util.Iterator r5 = r0.iterator()
        L_0x0047:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r5.next()
            r2 = r0
            hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification r2 = (hu.ekreta.ellenorzo.notification.SubscriptionForPushNotification) r2
            java.lang.String r2 = r2.e()
            java.lang.Object r2 = kotlin.collections.MapsKt__MapsKt.getValue(r4, r2)
            hu.ekreta.ellenorzo.profile.Profile r2 = (hu.ekreta.ellenorzo.profile.Profile) r2
            r1.put(r2, r0)
            goto L_0x0047
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$updateFirebaseToken$2.apply(java.util.Map, java.util.List):java.util.Map");
    }
}
