package p289hu.ekreta.ellenorzo.notification;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4670c;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\n¢\u0006\u0002\b\b"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "profilesById", "", "subscriptions", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$updateFirebaseToken$2 */
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$updateFirebaseToken$2<T1, T2, R> implements C4670c<Map<String, ? extends Profile>, List<? extends SubscriptionForPushNotification>, Map<Profile, ? extends SubscriptionForPushNotification>> {
    public static final NotificationStrategyImpl$updateFirebaseToken$2 INSTANCE = new NotificationStrategyImpl$updateFirebaseToken$2();

    /* renamed from: a */
    public final Map<Profile, SubscriptionForPushNotification> apply(Map<String, Profile> map, List<SubscriptionForPushNotification> list) {
        Intrinsics.checkParameterIsNotNull(map, "profilesById");
        Intrinsics.checkParameterIsNotNull(list, "subscriptions");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (map.containsKey(((SubscriptionForPushNotification) next).mo11318e())) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object next2 : arrayList) {
            linkedHashMap.put((Profile) MapsKt__MapsKt.getValue(map, ((SubscriptionForPushNotification) next2).mo11318e()), next2);
        }
        return linkedHashMap;
    }
}
