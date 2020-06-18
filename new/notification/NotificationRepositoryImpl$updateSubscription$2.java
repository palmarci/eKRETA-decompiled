package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.List;
import k.b.b0.a;
import k.b.b0.f;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "kotlin.jvm.PlatformType", "subscription", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$updateSubscription$2<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ NotificationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public NotificationRepositoryImpl$updateSubscription$2(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
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
        }).b((a) new a(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NotificationRepositoryImpl$updateSubscription$2 f5919a;

            {
                this.f5919a = r1;
            }

            public final void run() {
                this.f5919a.c.f5915d.a(FirebaseContainer.Event.GMA_UPDATE_SUCCESS, FirebaseContainer.Param.PROFILE, this.f5919a.e.m());
                b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f5919a.c);
                StringBuilder a2 = a.b.a.a.a.a("Successfully updated subscription ");
                a2.append(subscriptionForPushNotification);
                access$getLogger$p.d(a2.toString());
            }
        }).b((f<? super Throwable>) new f<Throwable>(this) {
            public final /* synthetic */ NotificationRepositoryImpl$updateSubscription$2 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.c.c.f5915d.a(FirebaseContainer.Event.GMA_UPDATE_FAIL, FirebaseContainer.Param.PROFILE, this.c.e.m());
                b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.c.c);
                StringBuilder a2 = a.b.a.a.a.a("Failed to update subscription ");
                a2.append(subscriptionForPushNotification);
                access$getLogger$p.c(a2.toString(), th);
            }
        });
    }
}
