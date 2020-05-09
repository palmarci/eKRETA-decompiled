package p289hu.ekreta.ellenorzo.announcedTest;

import java.util.ArrayList;
import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.reminder.ReminderRepository;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestsFragmentModule_ProvideReminderRepositoriesFactory */
public final class AnnouncedTestsFragmentModule_ProvideReminderRepositoriesFactory implements C4463c<ArrayList<ReminderRepository>> {

    /* renamed from: a */
    public final AnnouncedTestsFragmentModule f11122a;

    /* renamed from: b */
    public final C5431a<AnnouncedTestRepository> f11123b;

    public AnnouncedTestsFragmentModule_ProvideReminderRepositoriesFactory(AnnouncedTestsFragmentModule announcedTestsFragmentModule, C5431a<AnnouncedTestRepository> aVar) {
        this.f11122a = announcedTestsFragmentModule;
        this.f11123b = aVar;
    }

    public ArrayList<ReminderRepository> get() {
        ArrayList<ReminderRepository> a = this.f11122a.mo11426a((AnnouncedTestRepository) this.f11123b.get());
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
