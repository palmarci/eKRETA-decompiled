package p289hu.ekreta.ellenorzo.message;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.message.MessageDaoImpl_Factory */
public final class MessageDaoImpl_Factory implements C4463c<MessageDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f13823a;

    public MessageDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f13823a = aVar;
    }

    public MessageDaoImpl get() {
        return new MessageDaoImpl((C5061c0) this.f13823a.get());
    }
}
