package hu.ekreta.ellenorzo.notes;

import h.w.v;
import i.d.c;
import l.a.a;

public final class NotesFragmentModule_ProvideViewModelFactory implements c<NotesViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final NotesFragmentModule f5872a;
    public final a<NotesFragment> b;
    public final a<NotesViewModelImpl> c;

    public NotesFragmentModule_ProvideViewModelFactory(NotesFragmentModule notesFragmentModule, a<NotesFragment> aVar, a<NotesViewModelImpl> aVar2) {
        this.f5872a = notesFragmentModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public NotesViewModel get() {
        NotesViewModel a2 = this.f5872a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
