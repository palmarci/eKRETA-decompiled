package p289hu.ekreta.ellenorzo.notification;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notification.NotificationDaoImpl_Factory */
public final class NotificationDaoImpl_Factory implements C4463c<NotificationDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f14202a;

    public NotificationDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f14202a = aVar;
    }

    public NotificationDaoImpl get() {
        return new NotificationDaoImpl((C5061c0) this.f14202a.get());
    }
}
