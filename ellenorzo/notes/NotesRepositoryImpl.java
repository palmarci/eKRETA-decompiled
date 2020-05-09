package p289hu.ekreta.ellenorzo.notes;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3.DefaultImpls;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesRepositoryImpl;", "Lhu/ekreta/ellenorzo/notes/NotesRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "noteDao", "Lhu/ekreta/ellenorzo/notes/NoteDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/notes/NoteDao;)V", "adapter", "hu/ekreta/ellenorzo/notes/NotesRepositoryImpl$adapter$1", "Lhu/ekreta/ellenorzo/notes/NotesRepositoryImpl$adapter$1;", "getMobileApiV3", "()Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "getNoteDao", "()Lhu/ekreta/ellenorzo/notes/NoteDao;", "fetchNotes", "Lio/reactivex/Observable;", "", "Lhu/ekreta/ellenorzo/notes/Note;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getNotes", "updateNote", "note", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesRepositoryImpl */
/* compiled from: NotesRepositoryImpl.kt */
public final class NotesRepositoryImpl implements NotesRepository {

    /* renamed from: a */
    public final NotesRepositoryImpl$adapter$1 f14106a = new NotesRepositoryImpl$adapter$1(this);

    /* renamed from: b */
    public final MobileApiV3 f14107b;

    /* renamed from: c */
    public final NoteDao f14108c;

    public NotesRepositoryImpl(MobileApiV3 mobileApiV3, NoteDao noteDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(noteDao, "noteDao");
        this.f14107b = mobileApiV3;
        this.f14108c = noteDao;
    }

    /* renamed from: A */
    public C5027n<List<Note>> mo13637A(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f14106a.mo13642a(profile);
    }

    /* renamed from: a */
    public final NoteDao mo13640a() {
        return this.f14108c;
    }

    /* renamed from: x */
    public C5027n<List<Note>> mo13639x(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f14107b;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Feljegyzesek");
        C5027n<List<Note>> c = DefaultImpls.getNotes$default(mobileApiV3, sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), null, null, 12, null).mo17246g(new NotesRepositoryImpl$fetchNotes$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new NotesRepositoryImpl$fetchNotes$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "mobileApiV3.getNotes(\n  …ile.id, it)\n            }");
        return c;
    }

    /* renamed from: a */
    public C5027n<Note> mo13638a(Note note) {
        Intrinsics.checkParameterIsNotNull(note, "note");
        return this.f14106a.mo13641a(note);
    }
}
