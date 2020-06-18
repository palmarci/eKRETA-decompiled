package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.List;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "kotlin.jvm.PlatformType", "token", "", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ NotificationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public NotificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.c = notificationRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<SubscriptionForPushNotification> apply(final String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        return this.c.c.a(this.e.m()).d().d(new h<T, q<? extends R>>(this) {
            public final /* synthetic */ NotificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final n<SubscriptionForPushNotification> apply(List<SubscriptionForPushNotification> list) {
                Intrinsics.checkParameterIsNotNull(list, "subscriptions");
                SubscriptionForPushNotification subscriptionForPushNotification = (SubscriptionForPushNotification) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (subscriptionForPushNotification != null) {
                    NotificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1 notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1 = this.c;
                    NotificationRepositoryImpl notificationRepositoryImpl = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1.c;
                    Profile profile = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1.e;
                    String str = str;
                    Intrinsics.checkExpressionValueIsNotNull(str, "token");
                    n<SubscriptionForPushNotification> a2 = notificationRepositoryImpl.a(profile, subscriptionForPushNotification, str);
                    if (a2 != null) {
                        return a2;
                    }
                }
                NotificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1 notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$12 = this.c;
                NotificationRepositoryImpl notificationRepositoryImpl2 = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$12.c;
                Profile profile2 = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$12.e;
                String str2 = str;
                Intrinsics.checkExpressionValueIsNotNull(str2, "token");
                return notificationRepositoryImpl2.a(profile2, str2);
            }
        });
    }
}
