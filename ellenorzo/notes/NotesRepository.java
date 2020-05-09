package p289hu.ekreta.ellenorzo.notes;

import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H&¨\u0006\u000b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/notes/Note;", "fetchNotes", "Lio/reactivex/Observable;", "", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "getNotes", "updateNote", "note", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesRepository */
/* compiled from: NotesRepository.kt */
public interface NotesRepository extends Repository<Note> {
    /* renamed from: A */
    C5027n<List<Note>> mo13637A(Profile profile);

    /* renamed from: a */
    C5027n<Note> mo13638a(Note note);

    /* renamed from: x */
    C5027n<List<Note>> mo13639x(Profile profile);
}
