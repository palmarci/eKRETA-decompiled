package p289hu.ekreta.ellenorzo.notification;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "subscriptionsByProfile", "", "Lhu/ekreta/ellenorzo/profile/Profile;", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationStrategyImpl$updateFirebaseToken$3 */
/* compiled from: NotificationStrategyImpl.kt */
public final class NotificationStrategyImpl$updateFirebaseToken$3<T, R> implements C4675h<Map<Profile, ? extends SubscriptionForPushNotification>, C4991d> {

    /* renamed from: c */
    public final /* synthetic */ NotificationStrategyImpl f14274c;

    /* renamed from: e */
    public final /* synthetic */ String f14275e;

    public NotificationStrategyImpl$updateFirebaseToken$3(NotificationStrategyImpl notificationStrategyImpl, String str) {
        this.f14274c = notificationStrategyImpl;
        this.f14275e = str;
    }

    /* renamed from: a */
    public final C4667b apply(Map<Profile, SubscriptionForPushNotification> map) {
        Intrinsics.checkParameterIsNotNull(map, "subscriptionsByProfile");
        return C4664d.m16038a((Iterable<? extends T>) map.entrySet()).mo17236d((C4675h<? super T, ? extends C4991d>) new C4675h<Entry<? extends Profile, ? extends SubscriptionForPushNotification>, C4991d>(this) {

            /* renamed from: c */
            public final /* synthetic */ NotificationStrategyImpl$updateFirebaseToken$3 f14276c;

            {
                this.f14276c = r1;
            }

            /* renamed from: a */
            public final C4667b apply(Entry<Profile, SubscriptionForPushNotification> entry) {
                Intrinsics.checkParameterIsNotNull(entry, "<name for destructuring parameter 0>");
                final Profile profile = (Profile) entry.getKey();
                return this.f14276c.f14274c.f14264c.mo13756a(profile, (SubscriptionForPushNotification) entry.getValue(), this.f14276c.f14275e).mo17241e().mo16971a((C4673f<? super Throwable>) new C4673f<Throwable>(this) {

                    /* renamed from: c */
                    public final /* synthetic */ C43011 f14277c;

                    {
                        this.f14277c = r1;
                    }

                    /* renamed from: a */
                    public final void mo13801a() {
                        this.f14277c.f14276c.f14274c.mo13792a(profile);
                    }

                    public /* bridge */ /* synthetic */ void accept(Object obj) {
                        Throwable th = (Throwable) obj;
                        mo13801a();
                    }
                }).mo16980b();
            }
        });
    }
}
