package p289hu.ekreta.ellenorzo.notes;

import p211h.p282w.C3984v;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NoteDetailsActivityModule_ProvideViewModelFactory */
public final class NoteDetailsActivityModule_ProvideViewModelFactory implements C4463c<NoteDetailsViewModel> {

    /* renamed from: a */
    public final NoteDetailsActivityModule f14058a;

    /* renamed from: b */
    public final C5431a<NoteDetailsActivity> f14059b;

    /* renamed from: c */
    public final C5431a<NoteDetailsViewModelImpl> f14060c;

    public NoteDetailsActivityModule_ProvideViewModelFactory(NoteDetailsActivityModule noteDetailsActivityModule, C5431a<NoteDetailsActivity> aVar, C5431a<NoteDetailsViewModelImpl> aVar2) {
        this.f14058a = noteDetailsActivityModule;
        this.f14059b = aVar;
        this.f14060c = aVar2;
    }

    public NoteDetailsViewModel get() {
        NoteDetailsViewModel a = this.f14058a.mo13575a((NoteDetailsActivity) this.f14059b.get(), this.f14060c);
        C3984v.m10272b(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
