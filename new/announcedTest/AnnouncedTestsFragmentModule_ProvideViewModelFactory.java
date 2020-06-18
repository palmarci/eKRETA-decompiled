package hu.ekreta.ellenorzo.announcedTest;

import h.w.v;
import hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl;
import i.d.c;
import l.a.a;

public final class AnnouncedTestsFragmentModule_ProvideViewModelFactory implements c<RemindersViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final AnnouncedTestsFragmentModule f5036a;
    public final a<AnnouncedTestsFragment> b;
    public final a<RemindersViewModelImpl> c;

    public AnnouncedTestsFragmentModule_ProvideViewModelFactory(AnnouncedTestsFragmentModule announcedTestsFragmentModule, a<AnnouncedTestsFragment> aVar, a<RemindersViewModelImpl> aVar2) {
        this.f5036a = announcedTestsFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public RemindersViewModel get() {
        RemindersViewModel a2 = this.f5036a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
