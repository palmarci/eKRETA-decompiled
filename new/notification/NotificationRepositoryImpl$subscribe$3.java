package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import k.b.b0.a;
import kotlin.Metadata;
import o.b.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotificationRepositoryImpl.kt */
public final class NotificationRepositoryImpl$subscribe$3 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotificationRepositoryImpl f5917a;
    public final /* synthetic */ Profile b;

    public NotificationRepositoryImpl$subscribe$3(NotificationRepositoryImpl notificationRepositoryImpl, Profile profile) {
        this.f5917a = notificationRepositoryImpl;
        this.b = profile;
    }

    public final void run() {
        this.f5917a.f5915d.a(FirebaseContainer.Event.GMA_REGISTER_SUCCESS, FirebaseContainer.Param.PROFILE, this.b.m());
        b access$getLogger$p = NotificationRepositoryImpl.access$getLogger$p(this.f5917a);
        StringBuilder a2 = a.b.a.a.a.a("Successfully subscribed ");
        a2.append(this.b);
        access$getLogger$p.d(a2.toString());
    }
}
