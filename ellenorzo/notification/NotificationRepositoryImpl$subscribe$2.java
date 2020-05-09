package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "kotlin.jvm.PlatformType", "subscription", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$subscribe$2 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ NotificationRepositoryImpl f14225c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14226e;

    public NotificationRepositoryImpl$subscribe$2(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14225c = notificationRepositoryImpl;
        this.f14226e = profile;
    }

    /* renamed from: a */
    public final C5027n<SubscriptionForPushNotification> apply(final SubscriptionForPushNotification subscriptionForPushNotification) {
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "subscription");
        return this.f14225c.f14218c.mo13307a(this.f14226e.mo14054m(), CollectionsKt__CollectionsJVMKt.listOf(subscriptionForPushNotification)).mo17246g(new C4675h<T, R>() {
            /* renamed from: a */
            public final SubscriptionForPushNotification apply(List<SubscriptionForPushNotification> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                return subscriptionForPushNotification;
            }
        });
    }
}
