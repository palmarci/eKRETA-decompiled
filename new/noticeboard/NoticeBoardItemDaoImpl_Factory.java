package hu.ekreta.ellenorzo.noticeboard;

import i.d.c;
import k.c.c0;
import l.a.a;

public final class NoticeBoardItemDaoImpl_Factory implements c<NoticeBoardItemDaoImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c0> f5888a;

    public NoticeBoardItemDaoImpl_Factory(a<c0> aVar) {
        this.f5888a = aVar;
    }

    public NoticeBoardItemDaoImpl get() {
        return new NoticeBoardItemDaoImpl(this.f5888a.get());
    }
}
