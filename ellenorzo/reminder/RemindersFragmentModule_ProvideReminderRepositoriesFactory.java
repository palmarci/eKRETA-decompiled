package p289hu.ekreta.ellenorzo.reminder;

import java.util.ArrayList;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersFragmentModule_ProvideReminderRepositoriesFactory */
public final class RemindersFragmentModule_ProvideReminderRepositoriesFactory implements C4463c<ArrayList<ReminderRepository>> {

    /* renamed from: a */
    public final RemindersFragmentModule f14662a;

    /* renamed from: b */
    public final C5431a<HomeworkRepository> f14663b;

    /* renamed from: c */
    public final C5431a<AnnouncedTestRepository> f14664c;

    public RemindersFragmentModule_ProvideReminderRepositoriesFactory(RemindersFragmentModule remindersFragmentModule, C5431a<HomeworkRepository> aVar, C5431a<AnnouncedTestRepository> aVar2) {
        this.f14662a = remindersFragmentModule;
        this.f14663b = aVar;
        this.f14664c = aVar2;
    }

    public ArrayList<ReminderRepository> get() {
        ArrayList<ReminderRepository> a = this.f14662a.mo14316a((HomeworkRepository) this.f14663b.get(), (AnnouncedTestRepository) this.f14664c.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
