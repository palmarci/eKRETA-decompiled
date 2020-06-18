package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import java.util.Map;
import k.b.b;
import k.b.b0.f;
import k.b.b0.h;
import k.b.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "subscriptionsByProfile", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$updateFirebaseToken$3<T, R> implements h<Map<Profile, ? extends SubscriptionForPushNotification>, d> {
    public final /* synthetic */ NotificationStrategyImpl c;
    public final /* synthetic */ String e;

    public NotificationStrategyImpl$updateFirebaseToken$3(NotificationStrategyImpl notificationStrategyImpl, String str) {
        this.c = notificationStrategyImpl;
        this.e = str;
    }

    /* renamed from: a */
    public final b apply(Map<Profile, SubscriptionForPushNotification> map) {
        Intrinsics.checkParameterIsNotNull(map, "subscriptionsByProfile");
        return k.b.a0.d.a(map.entrySet()).d(new h<Map.Entry<? extends Profile, ? extends SubscriptionForPushNotification>, d>(this) {
            public final /* synthetic */ NotificationStrategyImpl$updateFirebaseToken$3 c;

            {
                this.c = r1;
            }

            /* renamed from: a */
            public final b apply(Map.Entry<Profile, SubscriptionForPushNotification> entry) {
                Intrinsics.checkParameterIsNotNull(entry, "<name for destructuring parameter 0>");
                final Profile key = entry.getKey();
                return this.c.c.c.a(key, entry.getValue(), this.c.e).e().a((f<? super Throwable>) new f<Throwable>(this) {
                    public final /* synthetic */ AnonymousClass1 c;

                    {
                        this.c = r1;
                    }

                    public final void a() {
                        this.c.c.c.a(key);
                    }

                    public /* bridge */ /* synthetic */ void accept(Object obj) {
                        Throwable th = (Throwable) obj;
                        a();
                    }
                }).b();
            }
        });
    }
}
