package hu.ekreta.ellenorzo.notification;

import h.w.v;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.a;
import k.b.b0.f;
import k.b.b0.h;
import k.b.n;
import k.b.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.h0;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "subscription", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$unsubscribe$1<T, R> implements h<T, q<? extends R>> {
    public final /* synthetic */ NotificationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public NotificationRepositoryImpl$unsubscribe$1(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.c = notificationRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final n<h0> apply(SubscriptionForPushNotification subscriptionForPushNotification) {
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "subscription");
        return GlobalMobileApi.DefaultImpls.deregisterFromPushNotifications$default(this.c.b, this.c.e, subscriptionForPushNotification.b(), v.a(this.e), 0, (String) null, 24, (Object) null).b((a) new a(this) {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NotificationRepositoryImpl$unsubscribe$1 f5918a;

            {
                this.f5918a = r1;
            }

            public final void run() {
                this.f5918a.c.f5915d.a(FirebaseContainer.Event.GMA_UNREGISTER_SUCCESS, FirebaseContainer.Param.PROFILE, this.f5918a.e.m());
                b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f5918a.c);
                StringBuilder a2 = a.b.a.a.a.a("Successfully unsubscribed ");
                a2.append(this.f5918a.e);
                access$getLogger$p.d(a2.toString());
            }
        }).b((f<? super Throwable>) new f<Throwable>(this) {
            public final /* synthetic */ NotificationRepositoryImpl$unsubscribe$1 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.c.c.f5915d.a(FirebaseContainer.Event.GMA_UNREGISTER_FAIL, FirebaseContainer.Param.PROFILE, this.c.e.m());
                b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.c.c);
                StringBuilder a2 = a.b.a.a.a.a("Failed to unsubscribe ");
                a2.append(this.c.e);
                access$getLogger$p.c(a2.toString(), th);
            }
        });
    }
}
