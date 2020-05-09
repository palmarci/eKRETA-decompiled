package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Event;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.p315b0.C4668a;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo17463d2 = {"<anonymous>", "", "run"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$subscribe$3 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$3 implements C4668a {

    /* renamed from: a */
    public final /* synthetic */ NotificationRepositoryImpl f14228a;

    /* renamed from: b */
    public final /* synthetic */ Profile f14229b;

    public NotificationRepositoryImpl$subscribe$3(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14228a = notificationRepositoryImpl;
        this.f14229b = profile;
    }

    public final void run() {
        this.f14228a.f14219d.mo16333a(Event.GMA_REGISTER_SUCCESS, Param.PROFILE, this.f14229b.mo14054m());
        C5620b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f14228a);
        StringBuilder a = C0082a.m111a("Successfully subscribed ");
        a.append(this.f14229b);
        access$getLogger$p.mo115b(a.toString());
    }
}
