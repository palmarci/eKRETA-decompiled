package p289hu.ekreta.ellenorzo.subject.averages;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.subject.averages.AveragesFragmentModule_ProvideViewModelFactory */
public final class AveragesFragmentModule_ProvideViewModelFactory implements C4463c<AveragesViewModel> {

    /* renamed from: a */
    public final AveragesFragmentModule f14909a;

    /* renamed from: b */
    public final C5431a<AveragesFragment> f14910b;

    /* renamed from: c */
    public final C5431a<AveragesViewModelImpl> f14911c;

    public AveragesFragmentModule_ProvideViewModelFactory(AveragesFragmentModule averagesFragmentModule, C5431a<AveragesFragment> aVar, C5431a<AveragesViewModelImpl> aVar2) {
        this.f14909a = averagesFragmentModule;
        this.f14910b = aVar;
        this.f14911c = aVar2;
    }

    public AveragesViewModel get() {
        AveragesViewModel a = this.f14909a.mo15779a((AveragesFragment) this.f14910b.get(), this.f14911c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
