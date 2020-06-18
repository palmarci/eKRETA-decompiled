package hu.ekreta.ellenorzo.notification;

import hu.ekreta.ellenorzo.rest.GlobalMobileApi;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import i.d.c;
import l.a.a;

public final class NotificationRepositoryImpl_Factory implements c<NotificationRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<GlobalMobileApi> f5920a;
    public final a<NotificationDao> b;
    public final a<FirebaseContainer> c;

    /* renamed from: d  reason: collision with root package name */
    public final a<String> f5921d;

    public NotificationRepositoryImpl_Factory(a<GlobalMobileApi> aVar, a<NotificationDao> aVar2, a<FirebaseContainer> aVar3, a<String> aVar4) {
        this.f5920a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f5921d = aVar4;
    }

    public NotificationRepositoryImpl get() {
        return new NotificationRepositoryImpl(this.f5920a.get(), this.b.get(), this.c.get(), this.f5921d.get());
    }
}
