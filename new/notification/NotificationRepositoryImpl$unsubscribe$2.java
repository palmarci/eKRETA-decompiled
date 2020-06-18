package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import java.util.concurrent.Callable;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "call"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$unsubscribe$2<V> implements Callable<q<? extends T>> {
    public final /* synthetic */ NotificationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public NotificationRepositoryImpl$unsubscribe$2(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.c = notificationRepositoryImpl;
        this.e = profile;
    }

    public final n<List<SubscriptionForPushNotification>> call() {
        return this.c.c.a(this.e.m(), CollectionsKt__CollectionsKt.emptyList());
    }
}
