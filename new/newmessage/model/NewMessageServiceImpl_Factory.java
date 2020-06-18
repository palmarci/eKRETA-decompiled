package hu.ekreta.ellenorzo.newmessage.model;

import hu.ekreta.ellenorzo.rest.EAdminApi;
import i.d.c;
import l.a.a;

public final class NewMessageServiceImpl_Factory implements c<NewMessageServiceImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<EAdminApi> f5828a;

    public NewMessageServiceImpl_Factory(a<EAdminApi> aVar) {
        this.f5828a = aVar;
    }

    public NewMessageServiceImpl get() {
        return new NewMessageServiceImpl(this.f5828a.get());
    }
}
