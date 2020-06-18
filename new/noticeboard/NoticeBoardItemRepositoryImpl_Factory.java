package hu.ekreta.ellenorzo.noticeboard;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class NoticeBoardItemRepositoryImpl_Factory implements c<NoticeBoardItemRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f5895a;
    public final a<NoticeBoardItemDao> b;

    public NoticeBoardItemRepositoryImpl_Factory(a<MobileApiV3> aVar, a<NoticeBoardItemDao> aVar2) {
        this.f5895a = aVar;
        this.b = aVar2;
    }

    public NoticeBoardItemRepositoryImpl get() {
        return new NoticeBoardItemRepositoryImpl(this.f5895a.get(), this.b.get());
    }
}
