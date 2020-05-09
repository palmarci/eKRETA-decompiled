package p289hu.ekreta.ellenorzo.cases.tmgi;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.cases.tmgi.TmgiFormActivityModule_ProvideViewModelFactory */
public final class TmgiFormActivityModule_ProvideViewModelFactory implements C4463c<TmgiFormViewModel> {

    /* renamed from: a */
    public final TmgiFormActivityModule f11690a;

    /* renamed from: b */
    public final C5431a<TmgiFormActivity> f11691b;

    /* renamed from: c */
    public final C5431a<TmgiFormViewModelImpl> f11692c;

    public TmgiFormViewModel get() {
        TmgiFormViewModel a = this.f11690a.mo12112a((TmgiFormActivity) this.f11691b.get(), this.f11692c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
