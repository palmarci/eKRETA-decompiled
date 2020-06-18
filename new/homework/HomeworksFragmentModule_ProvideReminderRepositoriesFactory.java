package hu.ekreta.ellenorzo.homework;

import h.w.v;
import hu.ekreta.ellenorzo.reminder.ReminderRepository;
import i.d.c;
import java.util.ArrayList;
import l.a.a;

public final class HomeworksFragmentModule_ProvideReminderRepositoriesFactory implements c<ArrayList<ReminderRepository>> {

    /* renamed from: a  reason: collision with root package name */
    public final HomeworksFragmentModule f5682a;
    public final a<HomeworkRepository> b;

    public HomeworksFragmentModule_ProvideReminderRepositoriesFactory(HomeworksFragmentModule homeworksFragmentModule, a<HomeworkRepository> aVar) {
        this.f5682a = homeworksFragmentModule;
        this.b = aVar;
    }

    public ArrayList<ReminderRepository> get() {
        ArrayList<ReminderRepository> a2 = this.f5682a.a(this.b.get());
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
