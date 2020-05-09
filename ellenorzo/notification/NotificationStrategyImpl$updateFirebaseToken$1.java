package p289hu.ekreta.ellenorzo.notification;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$updateFirebaseToken$1 */
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$updateFirebaseToken$1<T, R> implements C4675h<T, R> {
    public static final NotificationStrategyImpl$updateFirebaseToken$1 INSTANCE = new NotificationStrategyImpl$updateFirebaseToken$1();

    /* renamed from: a */
    public final Map<String, Profile> apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((Profile) next).mo14054m(), next);
        }
        return linkedHashMap;
    }
}
