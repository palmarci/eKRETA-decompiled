package p289hu.ekreta.ellenorzo.about;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p289hu.ekreta.ellenorzo.main.MainViewModelImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.about.AboutFragmentModule_ProvideViewModelFactory */
public final class AboutFragmentModule_ProvideViewModelFactory implements C4463c<MainViewModel> {

    /* renamed from: a */
    public final AboutFragmentModule f11034a;

    /* renamed from: b */
    public final C5431a<AboutFragment> f11035b;

    /* renamed from: c */
    public final C5431a<MainViewModelImpl> f11036c;

    public AboutFragmentModule_ProvideViewModelFactory(AboutFragmentModule aboutFragmentModule, C5431a<AboutFragment> aVar, C5431a<MainViewModelImpl> aVar2) {
        this.f11034a = aboutFragmentModule;
        this.f11035b = aVar;
        this.f11036c = aVar2;
    }

    public MainViewModel get() {
        MainViewModel a = this.f11034a.mo11304a((AboutFragment) this.f11035b.get(), this.f11036c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
