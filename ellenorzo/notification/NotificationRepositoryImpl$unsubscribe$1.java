package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.GlobalMobileApi.DefaultImpls;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Event;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p353m.C5456h0;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lokhttp3/ResponseBody;", "kotlin.jvm.PlatformType", "subscription", "Lhu/ekreta/ellenorzo/notification/SubscriptionForPushNotification;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$unsubscribe$1 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$unsubscribe$1<T, R> implements C4675h<T, C5030q<? extends R>> {

    /* renamed from: c */
    public final /* synthetic */ NotificationRepositoryImpl f14236c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14237e;

    public NotificationRepositoryImpl$unsubscribe$1(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14236c = notificationRepositoryImpl;
        this.f14237e = profile;
    }

    /* renamed from: a */
    public final C5027n<C5456h0> apply(SubscriptionForPushNotification subscriptionForPushNotification) {
        Intrinsics.checkParameterIsNotNull(subscriptionForPushNotification, "subscription");
        return DefaultImpls.deregisterFromPushNotifications$default(this.f14236c.f14217b, this.f14236c.f14220e, subscriptionForPushNotification.mo13814b(), C3984v.m10159a(this.f14237e), 0, null, 24, null).mo17223b((C4668a) new C4668a(this) {

            /* renamed from: a */
            public final /* synthetic */ NotificationRepositoryImpl$unsubscribe$1 f14238a;

            {
                this.f14238a = r1;
            }

            public final void run() {
                this.f14238a.f14236c.f14219d.mo16333a(Event.GMA_UNREGISTER_SUCCESS, Param.PROFILE, this.f14238a.f14237e.mo14054m());
                C5620b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f14238a.f14236c);
                StringBuilder a = C0082a.m111a("Successfully unsubscribed ");
                a.append(this.f14238a.f14237e);
                access$getLogger$p.mo115b(a.toString());
            }
        }).mo17224b((C4673f<? super Throwable>) new C4673f<Throwable>(this) {

            /* renamed from: c */
            public final /* synthetic */ NotificationRepositoryImpl$unsubscribe$1 f14239c;

            {
                this.f14239c = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.f14239c.f14236c.f14219d.mo16333a(Event.GMA_UNREGISTER_FAIL, Param.PROFILE, this.f14239c.f14237e.mo14054m());
                C5620b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f14239c.f14236c);
                StringBuilder a = C0082a.m111a("Failed to unsubscribe ");
                a.append(this.f14239c.f14237e);
                access$getLogger$p.mo118d(a.toString(), th);
            }
        });
    }
}
