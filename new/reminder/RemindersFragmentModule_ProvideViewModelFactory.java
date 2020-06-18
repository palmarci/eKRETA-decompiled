package hu.ekreta.ellenorzo.reminder;

import h.w.v;
import i.d.c;
import l.a.a;

public final class RemindersFragmentModule_ProvideViewModelFactory implements c<RemindersViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final RemindersFragmentModule f6063a;
    public final a<RemindersFragment> b;
    public final a<RemindersViewModelImpl> c;

    public RemindersFragmentModule_ProvideViewModelFactory(RemindersFragmentModule remindersFragmentModule, a<RemindersFragment> aVar, a<RemindersViewModelImpl> aVar2) {
        this.f6063a = remindersFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public RemindersViewModel get() {
        RemindersViewModel a2 = this.f6063a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
