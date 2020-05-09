package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "kotlin.jvm.PlatformType", "token", "", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class C4294xa6dede90<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ NotificationRepositoryImpl f14232c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14233e;

    public C4294xa6dede90(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14232c = notificationRepositoryImpl;
        this.f14233e = profile;
    }

    /* renamed from: a */
    public final C5027n<SubscriptionForPushNotification> apply(final String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        return this.f14232c.f14218c.mo16312a(this.f14233e.mo14054m()).mo17239d().mo17268d(new C4675h<T, C5030q<? extends R>>(this) {

            /* renamed from: c */
            public final /* synthetic */ C4294xa6dede90 f14234c;

            {
                this.f14234c = r1;
            }

            /* renamed from: a */
            public final C5027n<SubscriptionForPushNotification> apply(List<SubscriptionForPushNotification> list) {
                Intrinsics.checkParameterIsNotNull(list, "subscriptions");
                SubscriptionForPushNotification subscriptionForPushNotification = (SubscriptionForPushNotification) CollectionsKt___CollectionsKt.firstOrNull(list);
                String str = "token";
                if (subscriptionForPushNotification != null) {
                    C4294xa6dede90 notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1 = this.f14234c;
                    NotificationRepositoryImpl notificationRepositoryImpl = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1.f14232c;
                    Profile profile = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$1.f14233e;
                    String str2 = str;
                    Intrinsics.checkExpressionValueIsNotNull(str2, str);
                    C5027n<SubscriptionForPushNotification> a = notificationRepositoryImpl.mo13756a(profile, subscriptionForPushNotification, str2);
                    if (a != null) {
                        return a;
                    }
                }
                C4294xa6dede90 notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$12 = this.f14234c;
                NotificationRepositoryImpl notificationRepositoryImpl2 = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$12.f14232c;
                Profile profile2 = notificationRepositoryImpl$subscribeIfSubscriptionIsMissingOrObsolete$12.f14233e;
                String str3 = str;
                Intrinsics.checkExpressionValueIsNotNull(str3, str);
                return notificationRepositoryImpl2.mo13761a(profile2, str3);
            }
        });
    }
}
