package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class MessageRepositoryImpl_Factory implements c<MessageRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5804a;
    public final a<MessageDao> b;

    public MessageRepositoryImpl_Factory(a<EAdminApi> aVar, a<MessageDao> aVar2) {
        this.f5804a = aVar;
        this.b = aVar2;
    }

    public MessageRepositoryImpl get() {
        return new MessageRepositoryImpl(this.f5804a.get(), this.b.get());
    }
}
