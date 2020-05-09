package p289hu.ekreta.ellenorzo.announcedTest;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragmentModule_ProvideViewModelFactory */
public final class AnnouncedTestsFragmentModule_ProvideViewModelFactory implements C4463c<RemindersViewModel> {

    /* renamed from: a */
    public final AnnouncedTestsFragmentModule f11124a;

    /* renamed from: b */
    public final C5431a<AnnouncedTestsFragment> f11125b;

    /* renamed from: c */
    public final C5431a<RemindersViewModelImpl> f11126c;

    public AnnouncedTestsFragmentModule_ProvideViewModelFactory(AnnouncedTestsFragmentModule announcedTestsFragmentModule, C5431a<AnnouncedTestsFragment> aVar, C5431a<RemindersViewModelImpl> aVar2) {
        this.f11124a = announcedTestsFragmentModule;
        this.f11125b = aVar;
        this.f11126c = aVar2;
    }

    public RemindersViewModel get() {
        RemindersViewModel a = this.f11124a.mo11425a((AnnouncedTestsFragment) this.f11125b.get(), this.f11126c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
