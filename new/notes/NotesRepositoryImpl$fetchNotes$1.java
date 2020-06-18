package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NoteDto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/notes/Note;", "noteList", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NoteDto;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotesRepositoryImpl.kt */
public final class NotesRepositoryImpl$fetchNotes$1<T, R> implements h<T, R> {
    public final /* synthetic */ Profile c;

    public NotesRepositoryImpl$fetchNotes$1(Profile profile) {
        this.c = profile;
    }

    /* renamed from: a */
    public final List<Note> apply(List<NoteDto> list) {
        List<NoteDto> list2 = list;
        Intrinsics.checkParameterIsNotNull(list2, "noteList");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (NoteDto noteDto : list) {
            String uid = noteDto.getUid();
            String m2 = this.c.m();
            String typeName = noteDto.getTypeName();
            String typeDescription = noteDto.getTypeDescription();
            String title = noteDto.getTitle();
            String content = noteDto.getContent();
            Calendar seenByTutelaryUTC = noteDto.getSeenByTutelaryUTC();
            String teacher = noteDto.getTeacher();
            Calendar date = noteDto.getDate();
            Calendar creatingTime = noteDto.getCreatingTime();
            String groupUid = noteDto.getGroupUid();
            Note note = r3;
            Note note2 = new Note(uid, typeName, typeDescription, title, content, seenByTutelaryUTC, teacher, date, creatingTime, m2, groupUid, (Boolean) null);
            arrayList.add(note);
        }
        return arrayList;
    }
}
