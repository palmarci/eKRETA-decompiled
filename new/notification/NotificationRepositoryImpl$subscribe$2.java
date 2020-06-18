package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "kotlin.jvm.PlatformType", "subscription", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ NotificationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public NotificationRepositoryImpl$subscribe$2(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.c = notificationRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<SubscriptionForPushNotification> apply(final SubscriptionForPushNotification subscriptionForPushNotification) {
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "subscription");
        return this.c.c.a(this.e.m(), CollectionsKt__CollectionsJVMKt.listOf(subscriptionForPushNotification)).g(new h<T, R>() {
            /* renamed from: a */
            public final SubscriptionForPushNotification apply(List<SubscriptionForPushNotification> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                return subscriptionForPushNotification;
            }
        });
    }
}
