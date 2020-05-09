package p289hu.ekreta.ellenorzo.message;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessagesServiceImpl_Factory */
public final class MessagesServiceImpl_Factory implements C4463c<MessagesServiceImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f13931a;

    public MessagesServiceImpl_Factory(C5431a<EAdminApi> aVar) {
        this.f13931a = aVar;
    }

    public MessagesServiceImpl get() {
        return new MessagesServiceImpl((EAdminApi) this.f13931a.get());
    }
}
