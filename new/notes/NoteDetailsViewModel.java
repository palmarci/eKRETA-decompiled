package hu.ekreta.ellenorzo.notes;

import h.l.i;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000eX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NoteDetailsViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "content", "", "getContent", "()Ljava/lang/String;", "creatingTime", "getCreatingTime", "date", "getDate", "group", "getGroup", "note", "Lhu/ekreta/ellenorzo/notes/Note;", "getNote", "()Lhu/ekreta/ellenorzo/notes/Note;", "setNote", "(Lhu/ekreta/ellenorzo/notes/Note;)V", "seenByTutelaryUTC", "getSeenByTutelaryUTC", "teacher", "getTeacher", "title", "getTitle", "type", "getType", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoteDetailsViewModel.kt */
public interface NoteDetailsViewModel extends UiCommandSource, i {
    void a(Note note);

    String getTitle();

    String getType();

    String h();

    String m();

    String p();

    String x0();

    String y();
}
