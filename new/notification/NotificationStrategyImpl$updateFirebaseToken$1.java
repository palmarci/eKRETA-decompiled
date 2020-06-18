package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$updateFirebaseToken$1<T, R> implements h<T, R> {
    public static final NotificationStrategyImpl$updateFirebaseToken$1 INSTANCE = new NotificationStrategyImpl$updateFirebaseToken$1();

    /* renamed from: a */
    public final Map<String, Profile> apply(List<Profile> list) {
        Intrinsics.checkParameterIsNotNull(list, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (T next : list) {
            linkedHashMap.put(((Profile) next).m(), next);
        }
        return linkedHashMap;
    }
}
