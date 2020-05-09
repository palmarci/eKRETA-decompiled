package p289hu.ekreta.ellenorzo.notification;

import kotlin.Metadata;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Event;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.p315b0.C4673f;
import p365o.p367b.C5620b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo17463d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notification.NotificationRepositoryImpl$subscribe$4 */
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$4<T> implements C4673f<Throwable> {

    /* renamed from: c */
    public final /* synthetic */ NotificationRepositoryImpl f14230c;

    /* renamed from: e */
    public final /* synthetic */ Profile f14231e;

    public NotificationRepositoryImpl$subscribe$4(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f14230c = notificationRepositoryImpl;
        this.f14231e = profile;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        this.f14230c.f14219d.mo16333a(Event.GMA_REGISTER_FAIL, Param.PROFILE, this.f14231e.mo14054m());
        C5620b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f14230c);
        StringBuilder a = C0082a.m111a("Failed to subscribe ");
        a.append(this.f14231e);
        access$getLogger$p.mo118d(a.toString(), th);
    }
}
