package hu.ekreta.ellenorzo.notification;

import java.util.List;
import k.b.b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "subscriptions", "", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "test"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$unsubscribeIfSubscribed$1<T> implements i<List<? extends SubscriptionForPushNotification>> {
    public static final NotificationRepositoryImpl$unsubscribeIfSubscribed$1 INSTANCE = new NotificationRepositoryImpl$unsubscribeIfSubscribed$1();

    /* renamed from: a */
    public final boolean test(List<SubscriptionForPushNotification> list) {
        Intrinsics.checkParameterIsNotNull(list, "subscriptions");
        return !list.isEmpty();
    }
}
