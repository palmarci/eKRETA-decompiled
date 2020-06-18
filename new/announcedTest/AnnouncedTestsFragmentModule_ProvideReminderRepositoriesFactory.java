package hu.ekreta.ellenorzo.announcedTest;

import h.w.v;
import hu.ekreta.ellenorzo.reminder.ReminderRepository;
import i.d.c;
import java.util.ArrayList;
import l.a.a;

public final class AnnouncedTestsFragmentModule_ProvideReminderRepositoriesFactory implements c<ArrayList<ReminderRepository>> {

    /* renamed from: a  reason: collision with root package name */
    public final AnnouncedTestsFragmentModule f5035a;
    public final a<AnnouncedTestRepository> b;

    public AnnouncedTestsFragmentModule_ProvideReminderRepositoriesFactory(AnnouncedTestsFragmentModule announcedTestsFragmentModule, a<AnnouncedTestRepository> aVar) {
        this.f5035a = announcedTestsFragmentModule;
        this.b = aVar;
    }

    public ArrayList<ReminderRepository> get() {
        ArrayList<ReminderRepository> a2 = this.f5035a.a(this.b.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
