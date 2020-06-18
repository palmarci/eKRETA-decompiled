package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.ExtensionsKt;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* compiled from: Delegates.kt */
public final class NoteDetailsViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Note> {
    public final /* synthetic */ NoteDetailsViewModelImpl c;
    public final /* synthetic */ GroupRepository e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteDetailsViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, NoteDetailsViewModelImpl noteDetailsViewModelImpl, GroupRepository groupRepository) {
        super(obj2);
        this.c = noteDetailsViewModelImpl;
        this.e = groupRepository;
    }

    public void afterChange(KProperty<?> kProperty, Note note, Note note2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Note note3 = note2;
        Note note4 = note;
        if (note3 != null) {
            this.c.x(note3.n());
            this.c.w(note3.m());
            this.c.q(ExtensionsKt.a(note3.f()));
            NoteDetailsViewModelImpl noteDetailsViewModelImpl = this.c;
            Calendar k2 = note3.k();
            noteDetailsViewModelImpl.u(ExtensionsKt.a(k2 != null ? UtilsKt.a(k2) : null));
            this.c.v(note3.l());
            this.c.s(UtilsKt.d(note3.j()));
            this.c.r(UtilsKt.d(note3.g()));
            NoteDetailsViewModelImpl noteDetailsViewModelImpl2 = this.c;
            noteDetailsViewModelImpl2.a(new NoteDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1(noteDetailsViewModelImpl2), this.e.b(note3.h()));
        }
    }
}
