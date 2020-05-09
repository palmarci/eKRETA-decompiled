package p289hu.ekreta.ellenorzo.notes;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NoteDaoImpl_Factory */
public final class NoteDaoImpl_Factory implements C4463c<NoteDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f14055a;

    public NoteDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f14055a = aVar;
    }

    public NoteDaoImpl get() {
        return new NoteDaoImpl((C5061c0) this.f14055a.get());
    }
}
