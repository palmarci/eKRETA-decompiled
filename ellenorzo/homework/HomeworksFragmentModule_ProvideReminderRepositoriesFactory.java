package p289hu.ekreta.ellenorzo.homework;

import java.util.ArrayList;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.reminder.ReminderRepository;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragmentModule_ProvideReminderRepositoriesFactory */
public final class HomeworksFragmentModule_ProvideReminderRepositoriesFactory implements C4463c<ArrayList<ReminderRepository>> {

    /* renamed from: a */
    public final HomeworksFragmentModule f13529a;

    /* renamed from: b */
    public final C5431a<HomeworkRepository> f13530b;

    public HomeworksFragmentModule_ProvideReminderRepositoriesFactory(HomeworksFragmentModule homeworksFragmentModule, C5431a<HomeworkRepository> aVar) {
        this.f13529a = homeworksFragmentModule;
        this.f13530b = aVar;
    }

    public ArrayList<ReminderRepository> get() {
        ArrayList<ReminderRepository> a = this.f13529a.mo13029a((HomeworkRepository) this.f13530b.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
