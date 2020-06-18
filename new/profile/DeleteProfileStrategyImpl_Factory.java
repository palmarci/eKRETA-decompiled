package hu.ekreta.ellenorzo.profile;

import hu.ekreta.ellenorzo.notification.NotificationRepository;
import i.d.c;
import l.a.a;

public final class DeleteProfileStrategyImpl_Factory implements c<DeleteProfileStrategyImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<NotificationRepository> f5995a;
    public final a<ProfileDao> b;

    public DeleteProfileStrategyImpl_Factory(a<NotificationRepository> aVar, a<ProfileDao> aVar2) {
        this.f5995a = aVar;
        this.b = aVar2;
    }

    public DeleteProfileStrategyImpl get() {
        return new DeleteProfileStrategyImpl(this.f5995a.get(), this.b.get());
    }
}
