package p289hu.ekreta.ellenorzo.cases.tmgi;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormFragmentModule_ProvideViewModelFactory */
public final class TmgiFormFragmentModule_ProvideViewModelFactory implements C4463c<TmgiFormViewModel> {

    /* renamed from: a */
    public final TmgiFormFragmentModule f11697a;

    /* renamed from: b */
    public final C5431a<TmgiFormFragment> f11698b;

    /* renamed from: c */
    public final C5431a<TmgiFormViewModelImpl> f11699c;

    public TmgiFormFragmentModule_ProvideViewModelFactory(TmgiFormFragmentModule tmgiFormFragmentModule, C5431a<TmgiFormFragment> aVar, C5431a<TmgiFormViewModelImpl> aVar2) {
        this.f11697a = tmgiFormFragmentModule;
        this.f11698b = aVar;
        this.f11699c = aVar2;
    }

    public TmgiFormViewModel get() {
        TmgiFormViewModel a = this.f11697a.mo12121a((TmgiFormFragment) this.f11698b.get(), this.f11699c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
