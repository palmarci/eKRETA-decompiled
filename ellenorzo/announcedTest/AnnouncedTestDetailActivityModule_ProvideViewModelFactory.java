package p289hu.ekreta.ellenorzo.announcedTest;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailActivityModule_ProvideViewModelFactory */
public final class AnnouncedTestDetailActivityModule_ProvideViewModelFactory implements C4463c<AnnouncedTestDetailViewModel> {

    /* renamed from: a */
    public final AnnouncedTestDetailActivityModule f11058a;

    /* renamed from: b */
    public final C5431a<AnnouncedTestDetailActivity> f11059b;

    /* renamed from: c */
    public final C5431a<AnnouncedTestDetailViewModelImpl> f11060c;

    public AnnouncedTestDetailActivityModule_ProvideViewModelFactory(AnnouncedTestDetailActivityModule announcedTestDetailActivityModule, C5431a<AnnouncedTestDetailActivity> aVar, C5431a<AnnouncedTestDetailViewModelImpl> aVar2) {
        this.f11058a = announcedTestDetailActivityModule;
        this.f11059b = aVar;
        this.f11060c = aVar2;
    }

    public AnnouncedTestDetailViewModel get() {
        AnnouncedTestDetailViewModel a = this.f11058a.mo11342a((AnnouncedTestDetailActivity) this.f11059b.get(), this.f11060c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
