package p289hu.ekreta.ellenorzo.reminder;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.reminder.RemindersFragmentModule_ProvideViewModelFactory */
public final class RemindersFragmentModule_ProvideViewModelFactory implements C4463c<RemindersViewModel> {

    /* renamed from: a */
    public final RemindersFragmentModule f14665a;

    /* renamed from: b */
    public final C5431a<RemindersFragment> f14666b;

    /* renamed from: c */
    public final C5431a<RemindersViewModelImpl> f14667c;

    public RemindersFragmentModule_ProvideViewModelFactory(RemindersFragmentModule remindersFragmentModule, C5431a<RemindersFragment> aVar, C5431a<RemindersViewModelImpl> aVar2) {
        this.f14665a = remindersFragmentModule;
        this.f14666b = aVar;
        this.f14667c = aVar2;
    }

    public RemindersViewModel get() {
        RemindersViewModel a = this.f14665a.mo14315a((RemindersFragment) this.f14666b.get(), this.f14667c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
