package hu.ekreta.ellenorzo.noticeboard.detail;

import h.w.v;
import i.d.c;
import l.a.a;

public final class NoticeBoardItemDetailsActivityModule_ProvideViewModelFactory implements c<NoticeBoardItemDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final NoticeBoardItemDetailsActivityModule f5906a;
    public final a<NoticeBoardItemDetailActivity> b;
    public final a<NoticeBoardItemDetailViewModelImpl> c;

    public NoticeBoardItemDetailsActivityModule_ProvideViewModelFactory(NoticeBoardItemDetailsActivityModule noticeBoardItemDetailsActivityModule, a<NoticeBoardItemDetailActivity> aVar, a<NoticeBoardItemDetailViewModelImpl> aVar2) {
        this.f5906a = noticeBoardItemDetailsActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public NoticeBoardItemDetailViewModel get() {
        NoticeBoardItemDetailViewModel a2 = this.f5906a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
