package p289hu.ekreta.ellenorzo.notes;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000a.p191q.p192a.C2769b;
import p289hu.ekreta.ellenorzo.util.dao.ReadableByUserDaoImpl;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.mapper.DaoMapperException;
import p300k.p340c.C5061c0;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NoteDaoImpl;", "Lhu/ekreta/ellenorzo/util/dao/ReadableByUserDaoImpl;", "Lhu/ekreta/ellenorzo/notes/Note;", "Lhu/ekreta/ellenorzo/notes/NoteRealm;", "Lhu/ekreta/ellenorzo/notes/NoteDao;", "config", "Lio/realm/RealmConfiguration;", "(Lio/realm/RealmConfiguration;)V", "modelToRealmModel", "model", "realmModelToModel", "realmModel", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NoteDaoImpl */
/* compiled from: NoteDaoImpl.kt */
public final class NoteDaoImpl extends ReadableByUserDaoImpl<Note, NoteRealm> implements NoteDao {
    public NoteDaoImpl(C5061c0 c0Var) {
        Class<NoteRealm> cls = NoteRealm.class;
        Intrinsics.checkParameterIsNotNull(c0Var, "config");
        super(cls);
        C2769b.f6264b.mo5214a(cls, c0Var);
    }

    /* renamed from: a */
    public Note realmModelToModel(NoteRealm noteRealm) {
        Intrinsics.checkParameterIsNotNull(noteRealm, "realmModel");
        try {
            String d = noteRealm.mo11376d();
            if (d == null) {
                Intrinsics.throwNpe();
            }
            String l2 = noteRealm.mo13620l2();
            if (l2 == null) {
                Intrinsics.throwNpe();
            }
            String k2 = noteRealm.mo13619k2();
            if (k2 == null) {
                Intrinsics.throwNpe();
            }
            String j2 = noteRealm.mo13617j2();
            if (j2 == null) {
                Intrinsics.throwNpe();
            }
            String d2 = noteRealm.mo13606d2();
            if (d2 == null) {
                Intrinsics.throwNpe();
            }
            Date h2 = noteRealm.mo13614h2();
            Calendar b = h2 != null ? UtilsKt.m14838b(h2) : null;
            String i2 = noteRealm.mo13615i2();
            if (i2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b2 = UtilsKt.m14838b(noteRealm.mo13610f2());
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            Calendar b3 = UtilsKt.m14838b(noteRealm.mo13607e2());
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            Boolean u = noteRealm.mo11399u();
            String g2 = noteRealm.mo13613g2();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            Note note = new Note(d, l2, k2, j2, d2, b, i2, b2, b3, g2, null, u, 1024, null);
            return note;
        } catch (NullPointerException unused) {
            throw new DaoMapperException("Some field are null");
        }
    }

    /* renamed from: a */
    public NoteRealm modelToRealmModel(Note note) {
        Intrinsics.checkParameterIsNotNull(note, "model");
        String d = note.mo11316d();
        String o = note.mo13566o();
        String n = note.mo13565n();
        String m = note.mo13564m();
        String f = note.mo13556f();
        Calendar k = note.mo13562k();
        NoteRealm noteRealm = new NoteRealm(d, o, n, m, f, k != null ? k.getTime() : null, note.mo13563l(), note.mo13561j().getTime(), note.mo13557g().getTime(), note.mo11318e(), note.mo13560i());
        return noteRealm;
    }
}
