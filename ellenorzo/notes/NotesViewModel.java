package p289hu.ekreta.ellenorzo.notes;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000a.p020b.p021a.p022a.C0082a;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingListViewModel;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "ListItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModel */
/* compiled from: NotesViewModel.kt */
public interface NotesViewModel extends DataBindingListViewModel<ListItem> {

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModel$DefaultImpls */
    /* compiled from: NotesViewModel.kt */
    public static final class DefaultImpls {
    }

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "", "()V", "Note", "SectionHeader", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem$Note;", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModel$ListItem */
    /* compiled from: NotesViewModel.kt */
    public static abstract class ListItem {

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem$Note;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "note", "Lhu/ekreta/ellenorzo/notes/Note;", "(Lhu/ekreta/ellenorzo/notes/Note;)V", "getNote", "()Lhu/ekreta/ellenorzo/notes/Note;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModel$ListItem$Note */
        /* compiled from: NotesViewModel.kt */
        public static final class Note extends ListItem {

            /* renamed from: a */
            public final Note f14119a;

            public Note(Note note) {
                Intrinsics.checkParameterIsNotNull(note, "note");
                super(null);
                this.f14119a = note;
            }

            public static /* synthetic */ Note copy$default(Note note, Note note2, int i, Object obj) {
                if ((i & 1) != 0) {
                    note2 = note.f14119a;
                }
                return note.mo13647a(note2);
            }

            /* renamed from: a */
            public final Note mo13646a() {
                return this.f14119a;
            }

            /* renamed from: a */
            public final Note mo13647a(Note note) {
                Intrinsics.checkParameterIsNotNull(note, "note");
                return new Note(note);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14119a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.Note) r2).f14119a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.Note
                    if (r0 == 0) goto L_0x0013
                    hu.ekreta.ellenorzo.notes.NotesViewModel$ListItem$Note r2 = (p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.Note) r2
                    hu.ekreta.ellenorzo.notes.Note r0 = r1.f14119a
                    hu.ekreta.ellenorzo.notes.Note r2 = r2.f14119a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.Note.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                Note note = this.f14119a;
                if (note != null) {
                    return note.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a = C0082a.m111a("Note(note=");
                a.append(this.f14119a);
                a.append(")");
                return a.toString();
            }
        }

        @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem$SectionHeader;", "Lhu/ekreta/ellenorzo/notes/NotesViewModel$ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
        /* renamed from: hu.ekreta.ellenorzo.notes.NotesViewModel$ListItem$SectionHeader */
        /* compiled from: NotesViewModel.kt */
        public static final class SectionHeader extends ListItem {

            /* renamed from: a */
            public final String f14120a;

            public SectionHeader(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                super(null);
                this.f14120a = str;
            }

            public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sectionHeader.f14120a;
                }
                return sectionHeader.mo13651a(str);
            }

            /* renamed from: a */
            public final SectionHeader mo13651a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "title");
                return new SectionHeader(str);
            }

            /* renamed from: a */
            public final String mo13652a() {
                return this.f14120a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f14120a, (java.lang.Object) ((p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.SectionHeader) r2).f14120a) != false) goto L_0x0015;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r2) {
                /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015
                    boolean r0 = r2 instanceof p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.SectionHeader
                    if (r0 == 0) goto L_0x0013
                    hu.ekreta.ellenorzo.notes.NotesViewModel$ListItem$SectionHeader r2 = (p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.SectionHeader) r2
                    java.lang.String r0 = r1.f14120a
                    java.lang.String r2 = r2.f14120a
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r2 = 0
                    return r2
                L_0x0015:
                    r2 = 1
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: p289hu.ekreta.ellenorzo.notes.NotesViewModel.ListItem.SectionHeader.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                String str = this.f14120a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            public String toString() {
                return C0082a.m106a(C0082a.m111a("SectionHeader(title="), this.f14120a, ")");
            }
        }

        public ListItem() {
        }

        public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
