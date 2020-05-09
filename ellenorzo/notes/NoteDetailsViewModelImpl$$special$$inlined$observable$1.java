package p289hu.ekreta.ellenorzo.notes;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.ExtensionsKt;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo17463d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NoteDetailsViewModelImpl$$special$$inlined$observable$1 */
/* compiled from: Delegates.kt */
public final class NoteDetailsViewModelImpl$$special$$inlined$observable$1 extends ObservableProperty<Note> {

    /* renamed from: c */
    public final /* synthetic */ NoteDetailsViewModelImpl f14074c;

    /* renamed from: e */
    public final /* synthetic */ GroupRepository f14075e;

    public NoteDetailsViewModelImpl$$special$$inlined$observable$1(Object obj, Object obj2, NoteDetailsViewModelImpl noteDetailsViewModelImpl, GroupRepository groupRepository) {
        this.f14074c = noteDetailsViewModelImpl;
        this.f14075e = groupRepository;
        super(obj2);
    }

    public void afterChange(KProperty<?> kProperty, Note note, Note note2) {
        Intrinsics.checkParameterIsNotNull(kProperty, "property");
        Note note3 = note2;
        Note note4 = note;
        if (note3 != null) {
            this.f14074c.mo13593y(note3.mo13565n());
            this.f14074c.mo13592x(note3.mo13564m());
            this.f14074c.mo13586r(ExtensionsKt.m14629a(note3.mo13556f()));
            NoteDetailsViewModelImpl noteDetailsViewModelImpl = this.f14074c;
            Calendar k = note3.mo13562k();
            noteDetailsViewModelImpl.mo13590v(ExtensionsKt.m14629a(k != null ? UtilsKt.m14828a(k) : null));
            this.f14074c.mo13591w(note3.mo13563l());
            this.f14074c.mo13588t(UtilsKt.m14841d(note3.mo13561j()));
            this.f14074c.mo13587s(UtilsKt.m14841d(note3.mo13557g()));
            NoteDetailsViewModelImpl noteDetailsViewModelImpl2 = this.f14074c;
            noteDetailsViewModelImpl2.mo16415a((KMutableProperty0<T>) new NoteDetailsViewModelImpl$$special$$inlined$observable$1$lambda$1<T>(noteDetailsViewModelImpl2), this.f14075e.mo12812b(note3.mo13558h()));
        }
    }
}
