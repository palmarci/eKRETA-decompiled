package p289hu.ekreta.ellenorzo.notes;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R+\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R/\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\u001f8V@VX\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0012\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R+\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R+\u0010.\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0012\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R+\u00102\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0012\u001a\u0004\b3\u0010\u000e\"\u0004\b4\u0010\u0010¨\u00066"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/notes/NoteDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/notes/NoteDetailsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "content", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "creatingTime", "getCreatingTime", "setCreatingTime", "creatingTime$delegate", "date", "getDate", "setDate", "date$delegate", "group", "getGroup", "setGroup", "group$delegate", "Lhu/ekreta/ellenorzo/notes/Note;", "note", "getNote", "()Lhu/ekreta/ellenorzo/notes/Note;", "setNote", "(Lhu/ekreta/ellenorzo/notes/Note;)V", "note$delegate", "seenByTutelaryUTC", "getSeenByTutelaryUTC", "setSeenByTutelaryUTC", "seenByTutelaryUTC$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "title", "getTitle", "setTitle", "title$delegate", "type", "getType", "setType", "type$delegate", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.notes.NoteDetailsViewModelImpl */
/* compiled from: NoteDetailsViewModelImpl.kt */
public final class NoteDetailsViewModelImpl extends DataBindingViewModel implements NoteDetailsViewModel {

    /* renamed from: s */
    public static final /* synthetic */ KProperty[] f14064s;

    /* renamed from: j */
    public final ReadWriteProperty f14065j = DataBindingViewModel.boundString$default(this, this, 9, null, null, 6, null);

    /* renamed from: k */
    public final ReadWriteProperty f14066k;

    /* renamed from: l */
    public final ReadWriteProperty f14067l;

    /* renamed from: m */
    public final ReadWriteProperty f14068m;

    /* renamed from: n */
    public final ReadWriteProperty f14069n;

    /* renamed from: o */
    public final ReadWriteProperty f14070o;

    /* renamed from: p */
    public final ReadWriteProperty f14071p;

    /* renamed from: q */
    public final ReadWriteProperty f14072q;

    /* renamed from: r */
    public final ReadWriteProperty f14073r;

    static {
        Class<NoteDetailsViewModelImpl> cls = NoteDetailsViewModelImpl.class;
        f14064s = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "type", "getType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "title", "getTitle()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "content", "getContent()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "seenByTutelaryUTC", "getSeenByTutelaryUTC()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "creatingTime", "getCreatingTime()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "note", "getNote()Lhu/ekreta/ellenorzo/notes/Note;"))};
    }

    public NoteDetailsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, GroupRepository groupRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        super(observableImpl, executeOnceUiCommandSource);
        this.f14066k = DataBindingViewModel.boundString$default(this, this, 95, null, null, 6, null);
        this.f14067l = DataBindingViewModel.boundString$default(this, this, 96, null, null, 6, null);
        this.f14068m = DataBindingViewModel.boundString$default(this, this, 14, null, null, 6, null);
        this.f14069n = DataBindingViewModel.boundString$default(this, this, 99, null, null, 6, null);
        this.f14070o = DataBindingViewModel.boundString$default(this, this, 64, null, null, 6, null);
        this.f14071p = DataBindingViewModel.boundString$default(this, this, 47, null, null, 6, null);
        this.f14072q = DataBindingViewModel.boundString$default(this, this, 79, null, null, 6, null);
        Delegates delegates = Delegates.INSTANCE;
        this.f14073r = new NoteDetailsViewModelImpl$$special$$inlined$observable$1(null, null, this, groupRepository);
    }

    /* renamed from: a */
    public void mo13578a(Note note) {
        this.f14073r.setValue(this, f14064s[8], note);
    }

    public String getTitle() {
        return (String) this.f14066k.getValue(this, f14064s[1]);
    }

    public String getType() {
        return (String) this.f14065j.getValue(this, f14064s[0]);
    }

    /* renamed from: h */
    public String mo13581h() {
        return (String) this.f14070o.getValue(this, f14064s[5]);
    }

    /* renamed from: m */
    public String mo13582m() {
        return (String) this.f14069n.getValue(this, f14064s[4]);
    }

    /* renamed from: p */
    public String mo13583p() {
        return (String) this.f14072q.getValue(this, f14064s[7]);
    }

    /* renamed from: r */
    public void mo13586r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14067l.setValue(this, f14064s[2], str);
    }

    /* renamed from: s */
    public void mo13587s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14071p.setValue(this, f14064s[6], str);
    }

    /* renamed from: t */
    public void mo13588t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14070o.setValue(this, f14064s[5], str);
    }

    /* renamed from: u */
    public void mo13589u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14072q.setValue(this, f14064s[7], str);
    }

    /* renamed from: v */
    public void mo13590v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14068m.setValue(this, f14064s[3], str);
    }

    /* renamed from: w */
    public void mo13591w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14069n.setValue(this, f14064s[4], str);
    }

    /* renamed from: x */
    public void mo13592x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14066k.setValue(this, f14064s[1], str);
    }

    /* renamed from: x0 */
    public String mo13584x0() {
        return (String) this.f14067l.getValue(this, f14064s[2]);
    }

    /* renamed from: y */
    public String mo13585y() {
        return (String) this.f14071p.getValue(this, f14064s[6]);
    }

    /* renamed from: y */
    public void mo13593y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14065j.setValue(this, f14064s[0], str);
    }
}
