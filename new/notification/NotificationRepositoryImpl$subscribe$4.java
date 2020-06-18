package hu.ekreta.ellenorzo.notification;

import a.b.a.a.a;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.f;
import kotlin.Metadata;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$4<T> implements f<Throwable> {
    public final /* synthetic */ NotificationRepositoryImpl c;
    public final /* synthetic */ Profile e;

    public NotificationRepositoryImpl$subscribe$4(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.c = notificationRepositoryImpl;
        this.e = profile;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        this.c.f5915d.a(FirebaseContainer.Event.GMA_REGISTER_FAIL, FirebaseContainer.Param.PROFILE, this.e.m());
        b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.c);
        StringBuilder a2 = a.a("Failed to subscribe ");
        a2.append(this.e);
        access$getLogger$p.c(a2.toString(), th);
    }
}
