package hu.ekreta.ellenorzo.notification;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class NotificationDaoImpl_Factory implements c<NotificationDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5911a;

    public NotificationDaoImpl_Factory(a<c0> aVar) {
        this.f5911a = aVar;
    }

    public NotificationDaoImpl get() {
        return new NotificationDaoImpl(this.f5911a.get());
    }
}
