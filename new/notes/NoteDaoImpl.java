package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NoteDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/notes/Note;", "Lhu/ekreta/ellenorzo/notes/NoteRealm;", "Lhu/ekreta/ellenorzo/notes/NoteDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoteDaoImpl.kt */
public final class NoteDaoImpl extends ReadableByUserDaoImpl<Note, NoteRealm> implements NoteDao {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NoteDaoImpl(k.c.c0 r3) {
        /*
            r2 = this;
            java.lang.Class<hu.ekreta.ellenorzo.notes.NoteRealm> r0 = hu.ekreta.ellenorzo.notes.NoteRealm.class
            java.lang.String r1 = "config"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r2.<init>(r0)
            a.q.a.b$a r1 = a.q.a.b.b
            r1.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.notes.NoteDaoImpl.<init>(k.c.c0):void");
    }

    /* renamed from: a */
    public Note realmModelToModel(NoteRealm noteRealm) {
        Intrinsics.checkParameterIsNotNull(noteRealm, "realmModel");
        try {
            String d2 = noteRealm.d();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            String m2 = noteRealm.m2();
            if (m2 == null) {
                Intrinsics.throwNpe();
            }
            String l2 = noteRealm.l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            String k2 = noteRealm.k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            String e2 = noteRealm.e2();
            if (e2 == null) {
                Intrinsics.throwNpe();
            }
            Date i2 = noteRealm.i2();
            Calendar b = i2 != null ? UtilsKt.b(i2) : null;
            String j2 = noteRealm.j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.b(noteRealm.g2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b3 = UtilsKt.b(noteRealm.f2());
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            Boolean u = noteRealm.u();
            String h2 = noteRealm.h2();
            if (h2 == null) {
                Intrinsics.throwNpe();
            }
            return new Note(d2, m2, l2, k2, e2, b, j2, b2, b3, h2, (String) null, u, 1024, (DefaultConstructorMarker) null);
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public NoteRealm modelToRealmModel(Note note) {
        Intrinsics.checkParameterIsNotNull(note, "model");
        String d2 = note.d();
        String o2 = note.o();
        String n2 = note.n();
        String m2 = note.m();
        String f = note.f();
        Calendar k2 = note.k();
        return new NoteRealm(d2, o2, n2, m2, f, k2 != null ? k2.getTime() : null, note.l(), note.j().getTime(), note.g().getTime(), note.e(), note.i());
    }
}
