package hu.ekreta.ellenorzo.homework;

import h.w.v;
import hu.ekreta.ellenorzo.reminder.RemindersViewModel;
import hu.ekreta.ellenorzo.reminder.RemindersViewModelImpl;
import i.d.c;
import l.a.a;

public final class HomeworksFragmentModule_ProvideViewModelFactory implements c<RemindersViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final HomeworksFragmentModule f5683a;
    public final a<HomeworksFragment> b;
    public final a<RemindersViewModelImpl> c;

    public HomeworksFragmentModule_ProvideViewModelFactory(HomeworksFragmentModule homeworksFragmentModule, a<HomeworksFragment> aVar, a<RemindersViewModelImpl> aVar2) {
        this.f5683a = homeworksFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public RemindersViewModel get() {
        RemindersViewModel a2 = this.f5683a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
