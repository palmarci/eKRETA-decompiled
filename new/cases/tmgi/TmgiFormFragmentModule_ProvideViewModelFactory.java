package hu.ekreta.ellenorzo.cases.tmgi;

import h.w.v;
import i.d.c;
import l.a.a;

public final class TmgiFormFragmentModule_ProvideViewModelFactory implements c<TmgiFormViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final TmgiFormFragmentModule f5241a;
    public final a<TmgiFormFragment> b;
    public final a<TmgiFormViewModelImpl> c;

    public TmgiFormFragmentModule_ProvideViewModelFactory(TmgiFormFragmentModule tmgiFormFragmentModule, a<TmgiFormFragment> aVar, a<TmgiFormViewModelImpl> aVar2) {
        this.f5241a = tmgiFormFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public TmgiFormViewModel get() {
        TmgiFormViewModel a2 = this.f5241a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
