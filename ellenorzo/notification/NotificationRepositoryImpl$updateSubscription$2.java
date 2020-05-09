package p289hu.ekreta.ellenorzo.notification;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Event;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "kotlin.jvm.PlatformType", "subscription", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$updateSubscription$2 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$updateSubscription$2<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ NotificationRepositoryImpl f14246c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14247e;

    public NotificationRepositoryImpl$updateSubscription$2(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14246c = notificationRepositoryImpl;
        this.f14247e = profile;
    }

    /* renamed from: a */
    public final C5027n<SubscriptionForPushNotification> apply(final SubscriptionForPushNotification subscriptionForPushNotification) {
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "subscription");
        return this.f14246c.f14218c.mo13307a(this.f14247e.mo14054m(), CollectionsKt__CollectionsJVMKt.listOf(subscriptionForPushNotification)).mo17246g(new C4675h<T, R>() {
            /* renamed from: a */
            public final SubscriptionForPushNotification apply(List<SubscriptionForPushNotification> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
                return subscriptionForPushNotification;
            }
        }).mo17223b((C4668a) new C4668a(this) {

            /* renamed from: a */
            public final /* synthetic */ NotificationRepositoryImpl$updateSubscription$2 f14249a;

            {
                this.f14249a = r1;
            }

            public final void run() {
                this.f14249a.f14246c.f14219d.mo16333a(Event.GMA_UPDATE_SUCCESS, Param.PROFILE, this.f14249a.f14247e.mo14054m());
                C5620b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f14249a.f14246c);
                StringBuilder a = C0082a.m111a("Successfully updated subscription ");
                a.append(subscriptionForPushNotification);
                access$getLogger$p.mo115b(a.toString());
            }
        }).mo17224b((C4673f<? super Throwable>) new C4673f<Throwable>(this) {

            /* renamed from: c */
            public final /* synthetic */ NotificationRepositoryImpl$updateSubscription$2 f14251c;

            {
                this.f14251c = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.f14251c.f14246c.f14219d.mo16333a(Event.GMA_UPDATE_FAIL, Param.PROFILE, this.f14251c.f14247e.mo14054m());
                C5620b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f14251c.f14246c);
                StringBuilder a = C0082a.m111a("Failed to update subscription ");
                a.append(subscriptionForPushNotification);
                access$getLogger$p.mo118d(a.toString(), th);
            }
        });
    }
}
