package hu.ekreta.ellenorzo.message;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class MessageDaoImpl_Factory implements c<MessageDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5781a;

    public MessageDaoImpl_Factory(a<c0> aVar) {
        this.f5781a = aVar;
    }

    public MessageDaoImpl get() {
        return new MessageDaoImpl(this.f5781a.get());
    }
}
