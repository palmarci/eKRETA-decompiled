package hu.ekreta.ellenorzo.announcedTest;

import h.w.v;
import i.d.c;
import l.a.a;

public final class AnnouncedTestDetailActivityModule_ProvideViewModelFactory implements c<AnnouncedTestDetailViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final AnnouncedTestDetailActivityModule f5014a;
    public final a<AnnouncedTestDetailActivity> b;
    public final a<AnnouncedTestDetailViewModelImpl> c;

    public AnnouncedTestDetailActivityModule_ProvideViewModelFactory(AnnouncedTestDetailActivityModule announcedTestDetailActivityModule, a<AnnouncedTestDetailActivity> aVar, a<AnnouncedTestDetailViewModelImpl> aVar2) {
        this.f5014a = announcedTestDetailActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public AnnouncedTestDetailViewModel get() {
        AnnouncedTestDetailViewModel a2 = this.f5014a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
