package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.notes.NotesViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.b.a0.d;
import k.b.b0.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.c.a.g;
import o.c.a.n;
import o.c.a.p.j;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "notes", "", "Lhu/ekreta/ellenorzo/notes/Note;", "apply"}, k = 3, mv = {1, 1, 15})
/* compiled from: NotesViewModelImpl.kt */
public final class NotesViewModelImpl$toListItems$1<T, R> implements h<T, R> {
    public final /* synthetic */ NotesViewModelImpl c;

    public NotesViewModelImpl$toListItems$1(NotesViewModelImpl notesViewModelImpl) {
        this.c = notesViewModelImpl;
    }

    /* renamed from: a */
    public final List<NotesViewModel.ListItem> apply(List<Note> list) {
        Intrinsics.checkParameterIsNotNull(list, "notes");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) ((Note) next).o(), (CharSequence) "Elektronikus üzenet", false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new NotesViewModelImpl$toListItems$1$$special$$inlined$sortedByDescending$1());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : sortedWith) {
            n a2 = d.a(((Note) next2).j());
            Intrinsics.checkExpressionValueIsNotNull(a2, "zonedDateTime");
            Pair pair = new Pair(Integer.valueOf(a2.c.c.c), a2.c.c.g());
            Object obj = linkedHashMap.get(pair);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(pair, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Pair pair2 = (Pair) entry.getKey();
            List<Note> list2 = (List) entry.getValue();
            arrayList2.add(new NotesViewModel.ListItem.SectionHeader(((Number) pair2.getFirst()).intValue() + ". " + ((g) pair2.getSecond()).a(j.FULL, this.c.t)));
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Note note : list2) {
                arrayList3.add(new NotesViewModel.ListItem.Note(note));
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }
}
