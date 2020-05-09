package p289hu.ekreta.ellenorzo.noticeboard;

import p292i.p295d.C4463c;
import p300k.p340c.C5061c0;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemDaoImpl_Factory */
public final class NoticeBoardItemDaoImpl_Factory implements C4463c<NoticeBoardItemDaoImpl> {

    /* renamed from: a */
    public final C5431a<C5061c0> f14152a;

    public NoticeBoardItemDaoImpl_Factory(C5431a<C5061c0> aVar) {
        this.f14152a = aVar;
    }

    public NoticeBoardItemDaoImpl get() {
        return new NoticeBoardItemDaoImpl((C5061c0) this.f14152a.get());
    }
}
