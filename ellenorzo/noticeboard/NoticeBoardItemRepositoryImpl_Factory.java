package p289hu.ekreta.ellenorzo.noticeboard;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardItemRepositoryImpl_Factory */
public final class NoticeBoardItemRepositoryImpl_Factory implements C4463c<NoticeBoardItemRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f14171a;

    /* renamed from: b */
    public final C5431a<NoticeBoardItemDao> f14172b;

    public NoticeBoardItemRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<NoticeBoardItemDao> aVar2) {
        this.f14171a = aVar;
        this.f14172b = aVar2;
    }

    public NoticeBoardItemRepositoryImpl get() {
        return new NoticeBoardItemRepositoryImpl((MobileApiV3) this.f14171a.get(), (NoticeBoardItemDao) this.f14172b.get());
    }
}
