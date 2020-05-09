package p289hu.ekreta.ellenorzo.noticeboard.detail;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailsActivityModule_ProvideViewModelFactory */
public final class NoticeBoardItemDetailsActivityModule_ProvideViewModelFactory implements C4463c<NoticeBoardItemDetailViewModel> {

    /* renamed from: a */
    public final NoticeBoardItemDetailsActivityModule f14193a;

    /* renamed from: b */
    public final C5431a<NoticeBoardItemDetailActivity> f14194b;

    /* renamed from: c */
    public final C5431a<NoticeBoardItemDetailViewModelImpl> f14195c;

    public NoticeBoardItemDetailsActivityModule_ProvideViewModelFactory(NoticeBoardItemDetailsActivityModule noticeBoardItemDetailsActivityModule, C5431a<NoticeBoardItemDetailActivity> aVar, C5431a<NoticeBoardItemDetailViewModelImpl> aVar2) {
        this.f14193a = noticeBoardItemDetailsActivityModule;
        this.f14194b = aVar;
        this.f14195c = aVar2;
    }

    public NoticeBoardItemDetailViewModel get() {
        NoticeBoardItemDetailViewModel a = this.f14193a.mo13740a((NoticeBoardItemDetailActivity) this.f14194b.get(), this.f14195c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
