package p289hu.ekreta.ellenorzo.noticeboard;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.NoticeBoardFragmentModule_ProvideViewModelFactory */
public final class NoticeBoardFragmentModule_ProvideViewModelFactory implements C4463c<NoticeBoardViewModel> {

    /* renamed from: a */
    public final NoticeBoardFragmentModule f14140a;

    /* renamed from: b */
    public final C5431a<NoticeBoardFragment> f14141b;

    /* renamed from: c */
    public final C5431a<NoticeBoardViewModelImpl> f14142c;

    public NoticeBoardFragmentModule_ProvideViewModelFactory(NoticeBoardFragmentModule noticeBoardFragmentModule, C5431a<NoticeBoardFragment> aVar, C5431a<NoticeBoardViewModelImpl> aVar2) {
        this.f14140a = noticeBoardFragmentModule;
        this.f14141b = aVar;
        this.f14142c = aVar2;
    }

    public NoticeBoardViewModel get() {
        NoticeBoardViewModel a = this.f14140a.mo13670a((NoticeBoardFragment) this.f14141b.get(), this.f14142c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
