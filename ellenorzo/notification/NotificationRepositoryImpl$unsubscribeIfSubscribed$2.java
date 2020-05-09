package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Completable;", "subscriptions", "", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$unsubscribeIfSubscribed$2 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$unsubscribeIfSubscribed$2<T, R> implements C4675h<List<? extends SubscriptionForPushNotification>, C4991d> {

    /* renamed from: c */
    public final /* synthetic */ NotificationRepositoryImpl f14242c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14243e;

    public NotificationRepositoryImpl$unsubscribeIfSubscribed$2(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14242c = notificationRepositoryImpl;
        this.f14243e = profile;
    }

    /* renamed from: a */
    public final C4667b apply(List<SubscriptionForPushNotification> list) {
        Intrinsics.checkParameterIsNotNull(list, "subscriptions");
        return this.f14242c.mo13760a(this.f14243e, (Iterable<SubscriptionForPushNotification>) list);
    }
}
