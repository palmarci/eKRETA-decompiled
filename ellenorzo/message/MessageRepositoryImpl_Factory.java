package p289hu.ekreta.ellenorzo.message;

import p289hu.ekreta.ellenorzo.rest.EAdminApi;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessageRepositoryImpl_Factory */
public final class MessageRepositoryImpl_Factory implements C4463c<MessageRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<EAdminApi> f13909a;

    /* renamed from: b */
    public final C5431a<MessageDao> f13910b;

    public MessageRepositoryImpl_Factory(C5431a<EAdminApi> aVar, C5431a<MessageDao> aVar2) {
        this.f13909a = aVar;
        this.f13910b = aVar2;
    }

    public MessageRepositoryImpl get() {
        return new MessageRepositoryImpl((EAdminApi) this.f13909a.get(), (MessageDao) this.f13910b.get());
    }
}
