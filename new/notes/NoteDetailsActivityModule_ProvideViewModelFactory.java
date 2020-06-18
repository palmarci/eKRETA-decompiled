package hu.ekreta.ellenorzo.notes;

import h.w.v;
import i.d.c;
import l.a.a;

public final class NoteDetailsActivityModule_ProvideViewModelFactory implements c<NoteDetailsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final NoteDetailsActivityModule f5853a;
    public final a<NoteDetailsActivity> b;
    public final a<NoteDetailsViewModelImpl> c;

    public NoteDetailsActivityModule_ProvideViewModelFactory(NoteDetailsActivityModule noteDetailsActivityModule, a<NoteDetailsActivity> aVar, a<NoteDetailsViewModelImpl> aVar2) {
        this.f5853a = noteDetailsActivityModule;
        this.b = aVar;
        this.c = aVar2;
    }

    public NoteDetailsViewModel get() {
        NoteDetailsViewModel a2 = this.f5853a.a(this.b.get(), this.c);
        v.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
