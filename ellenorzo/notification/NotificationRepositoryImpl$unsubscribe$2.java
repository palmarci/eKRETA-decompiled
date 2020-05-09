package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "call"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$unsubscribe$2 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$unsubscribe$2<V> implements Callable<C5030q<? extends T>> {

    /* renamed from: c */
    public final /* synthetic */ NotificationRepositoryImpl f14240c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14241e;

    public NotificationRepositoryImpl$unsubscribe$2(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14240c = notificationRepositoryImpl;
        this.f14241e = profile;
    }

    public final C5027n<List<SubscriptionForPushNotification>> call() {
        return this.f14240c.f14218c.mo13307a(this.f14241e.mo14054m(), CollectionsKt__CollectionsKt.emptyList());
    }
}
