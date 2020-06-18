package hu.ekreta.ellenorzo.about;

import h.w.v;
import hu.ekreta.ellenorzo.main.MainViewModel;
import hu.ekreta.ellenorzo.main.MainViewModelImpl;
import i.d.c;
import l.a.a;

public final class AboutFragmentModule_ProvideViewModelFactory implements c<MainViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final AboutFragmentModule f4968a;
    public final a<AboutFragment> b;
    public final a<MainViewModelImpl> c;

    public AboutFragmentModule_ProvideViewModelFactory(AboutFragmentModule aboutFragmentModule, a<AboutFragment> aVar, a<MainViewModelImpl> aVar2) {
        this.f4968a = aboutFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public MainViewModel get() {
        MainViewModel a2 = this.f4968a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
