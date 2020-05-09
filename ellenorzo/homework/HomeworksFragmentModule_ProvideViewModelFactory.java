package p289hu.ekreta.ellenorzo.homework;

import p211h.p282w.C3984v;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import p289hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.homework.HomeworksFragmentModule_ProvideViewModelFactory */
public final class HomeworksFragmentModule_ProvideViewModelFactory implements C4463c<RemindersViewModel> {

    /* renamed from: a */
    public final HomeworksFragmentModule f13531a;

    /* renamed from: b */
    public final C5431a<HomeworksFragment> f13532b;

    /* renamed from: c */
    public final C5431a<RemindersViewModelImpl> f13533c;

    public HomeworksFragmentModule_ProvideViewModelFactory(HomeworksFragmentModule homeworksFragmentModule, C5431a<HomeworksFragment> aVar, C5431a<RemindersViewModelImpl> aVar2) {
        this.f13531a = homeworksFragmentModule;
        this.f13532b = aVar;
        this.f13533c = aVar2;
    }

    public RemindersViewModel get() {
        RemindersViewModel a = this.f13531a.mo13028a((HomeworksFragment) this.f13532b.get(), this.f13533c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
