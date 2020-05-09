package p289hu.ekreta.ellenorzo.main.more;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p289hu.ekreta.ellenorzo.main.MainViewModelImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.main.more.MoreFragmentModule_ProvideViewModelFactory */
public final class MoreFragmentModule_ProvideViewModelFactory implements C4463c<MainViewModel> {

    /* renamed from: a */
    public final MoreFragmentModule f13765a;

    /* renamed from: b */
    public final C5431a<MoreFragment> f13766b;

    /* renamed from: c */
    public final C5431a<MainViewModelImpl> f13767c;

    public MoreFragmentModule_ProvideViewModelFactory(MoreFragmentModule moreFragmentModule, C5431a<MoreFragment> aVar, C5431a<MainViewModelImpl> aVar2) {
        this.f13765a = moreFragmentModule;
        this.f13766b = aVar;
        this.f13767c = aVar2;
    }

    public MainViewModel get() {
        MainViewModel a = this.f13765a.mo13218a((MoreFragment) this.f13766b.get(), this.f13767c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
