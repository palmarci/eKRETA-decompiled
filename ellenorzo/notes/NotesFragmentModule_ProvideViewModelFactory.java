package p289hu.ekreta.ellenorzo.notes;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NotesFragmentModule_ProvideViewModelFactory */
public final class NotesFragmentModule_ProvideViewModelFactory implements C4463c<NotesViewModel> {

    /* renamed from: a */
    public final NotesFragmentModule f14101a;

    /* renamed from: b */
    public final C5431a<NotesFragment> f14102b;

    /* renamed from: c */
    public final C5431a<NotesViewModelImpl> f14103c;

    public NotesFragmentModule_ProvideViewModelFactory(NotesFragmentModule notesFragmentModule, C5431a<NotesFragment> aVar, C5431a<NotesViewModelImpl> aVar2) {
        this.f14101a = notesFragmentModule;
        this.f14102b = aVar;
        this.f14103c = aVar2;
    }

    public NotesViewModel get() {
        NotesViewModel a = this.f14101a.mo13634a((NotesFragment) this.f14102b.get(), this.f14103c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
