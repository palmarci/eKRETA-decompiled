package hu.ekreta.ellenorzo.notification;

import android.content.Context;
import h.i.e.m;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import i.d.c;
import l.a.a;

public final class NotificationStrategyImpl_Factory implements c<NotificationStrategyImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<ProfileRepository> f5927a;
    public final a<NotificationRepository> b;
    public final a<Context> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<m> f5928d;
    public final a<FirebaseContainer> e;

    public NotificationStrategyImpl_Factory(a<ProfileRepository> aVar, a<NotificationRepository> aVar2, a<Context> aVar3, a<m> aVar4, a<FirebaseContainer> aVar5) {
        this.f5927a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5928d = aVar4;
        this.e = aVar5;
    }

    public NotificationStrategyImpl get() {
        return new NotificationStrategyImpl(this.f5927a.get(), this.b.get(), this.c.get(), this.f5928d.get(), this.e.get());
    }
}
