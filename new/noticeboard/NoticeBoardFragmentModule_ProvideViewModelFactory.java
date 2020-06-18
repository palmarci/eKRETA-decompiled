package hu.ekreta.ellenorzo.noticeboard;

import h.w.v;
import i.d.c;
import l.a.a;

public final class NoticeBoardFragmentModule_ProvideViewModelFactory implements c<NoticeBoardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final NoticeBoardFragmentModule f5882a;
    public final a<NoticeBoardFragment> b;
    public final a<NoticeBoardViewModelImpl> c;

    public NoticeBoardFragmentModule_ProvideViewModelFactory(NoticeBoardFragmentModule noticeBoardFragmentModule, a<NoticeBoardFragment> aVar, a<NoticeBoardViewModelImpl> aVar2) {
        this.f5882a = noticeBoardFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public NoticeBoardViewModel get() {
        NoticeBoardViewModel a2 = this.f5882a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
