package p289hu.ekreta.ellenorzo.notes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.Note;
import p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.SectionHeader;
import p300k.p313b.p314a0.C4664d;
import p300k.p313b.p315b0.C4675h;
import p365o.p372c.p373a.C5642g;
import p365o.p372c.p373a.C5650n;
import p365o.p372c.p373a.p375p.C5696j;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, mo17463d2 = {"<anonymous>", "", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "notes", "", "Lhu/ekreta/ellenorzo/notes/Note;", "apply"}, mo17464k = 3, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModelImpl$toListItems$1 */
/* compiled from: NotesViewModelImpl.kt */
public final class NotesViewModelImpl$toListItems$1<T, R> implements C4675h<T, R> {

    /* renamed from: c */
    public final /* synthetic */ NotesViewModelImpl f14124c;

    public NotesViewModelImpl$toListItems$1(NotesViewModelImpl notesViewModelImpl) {
        this.f14124c = notesViewModelImpl;
    }

    /* renamed from: a */
    public final List<ListItem> apply(List<Note> list) {
        Intrinsics.checkParameterIsNotNull(list, "notes");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) ((Note) next).mo13566o(), (CharSequence) "Elektronikus üzenet", false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new C4283x142c5d38());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : sortedWith) {
            C5650n a = C4664d.m16043a(((Note) next2).mo13561j());
            Intrinsics.checkExpressionValueIsNotNull(a, "zonedDateTime");
            Pair pair = new Pair(Integer.valueOf(a.f18303c.f18263c.f18258c), a.f18303c.f18263c.mo22068g());
            Object obj = linkedHashMap.get(pair);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(pair, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Entry entry : linkedHashMap.entrySet()) {
            Pair pair2 = (Pair) entry.getKey();
            List<Note> list2 = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(((Number) pair2.getFirst()).intValue());
            sb.append(". ");
            sb.append(((C5642g) pair2.getSecond()).mo22106a(C5696j.FULL, this.f14124c.f14121s));
            arrayList2.add(new SectionHeader(sb.toString()));
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Note note : list2) {
                arrayList3.add(new Note(note));
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }
}
