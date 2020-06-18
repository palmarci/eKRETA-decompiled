package hu.ekreta.ellenorzo.reminder;

import h.w.v;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import i.d.c;
import java.util.ArrayList;
import l.a.a;

public final class RemindersFragmentModule_ProvideReminderRepositoriesFactory implements c<ArrayList<ReminderRepository>> {

    /* renamed from: a  reason: collision with root package name */
    public final RemindersFragmentModule f6062a;
    public final a<HomeworkRepository> b;
    public final a<AnnouncedTestRepository> c;

    public RemindersFragmentModule_ProvideReminderRepositoriesFactory(RemindersFragmentModule remindersFragmentModule, a<HomeworkRepository> aVar, a<AnnouncedTestRepository> aVar2) {
        this.f6062a = remindersFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public ArrayList<ReminderRepository> get() {
        ArrayList<ReminderRepository> a2 = this.f6062a.a(this.b.get(), this.c.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
