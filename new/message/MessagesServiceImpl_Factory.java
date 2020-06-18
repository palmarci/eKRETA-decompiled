package hu.ekreta.ellenorzo.message;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class MessagesServiceImpl_Factory implements c<MessagesServiceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5809a;

    public MessagesServiceImpl_Factory(a<EAdminApi> aVar) {
        this.f5809a = aVar;
    }

    public MessagesServiceImpl get() {
        return new MessagesServiceImpl(this.f5809a.get());
    }
}
