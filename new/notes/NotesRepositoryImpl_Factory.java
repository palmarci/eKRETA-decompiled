package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.rest.MobileApiV3;
import i.d.c;
import l.a.a;

public final class NotesRepositoryImpl_Factory implements c<NotesRepositoryImpl> {

    /* renamed from: a  reason: collision with root package name */
    public final a<MobileApiV3> f5876a;
    public final a<NoteDao> b;

    public NotesRepositoryImpl_Factory(a<MobileApiV3> aVar, a<NoteDao> aVar2) {
        this.f5876a = aVar;
        this.b = aVar2;
    }

    public NotesRepositoryImpl get() {
        return new NotesRepositoryImpl(this.f5876a.get(), this.b.get());
    }
}
