package hu.ekreta.ellenorzo.cases.tmgi;

import h.w.v;
import i.d.c;
import l.a.a;

public final class TmgiFormActivityModule_ProvideViewModelFactory implements c<TmgiFormViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final TmgiFormActivityModule f5239a;
    public final a<TmgiFormActivity> b;
    public final a<TmgiFormViewModelImpl> c;

    public TmgiFormViewModel get() {
        TmgiFormViewModel a2 = this.f5239a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
