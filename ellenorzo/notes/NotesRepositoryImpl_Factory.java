package p289hu.ekreta.ellenorzo.notes;

import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p292i.p295d.C4463c;
import p351l.p352a.C5431a;

/* renamed from: hu.ekreta.ellenorzo.notes.NotesRepositoryImpl_Factory */
public final class NotesRepositoryImpl_Factory implements C4463c<NotesRepositoryImpl> {

    /* renamed from: a */
    public final C5431a<MobileApiV3> f14117a;

    /* renamed from: b */
    public final C5431a<NoteDao> f14118b;

    public NotesRepositoryImpl_Factory(C5431a<MobileApiV3> aVar, C5431a<NoteDao> aVar2) {
        this.f14117a = aVar;
        this.f14118b = aVar2;
    }

    public NotesRepositoryImpl get() {
        return new NotesRepositoryImpl((MobileApiV3) this.f14117a.get(), (NoteDao) this.f14118b.get());
    }
}
