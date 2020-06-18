package hu.ekreta.ellenorzo.notes;

import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R+\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R+\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R/\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\f\u001a\u0004\u0018\u00010!8V@VX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0014\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010(\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0014\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R+\u0010,\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0014\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R+\u00100\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0014\u001a\u0004\b1\u0010\u0010\"\u0004\b2\u0010\u0012R+\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8V@VX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0014\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012¨\u00068"}, d2 = {"Lhu/ekreta/ellenorzo/notes/NoteDetailsViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/notes/NoteDetailsViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "content", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "creatingTime", "getCreatingTime", "setCreatingTime", "creatingTime$delegate", "date", "getDate", "setDate", "date$delegate", "group", "getGroup", "setGroup", "group$delegate", "Lhu/ekreta/ellenorzo/notes/Note;", "note", "getNote", "()Lhu/ekreta/ellenorzo/notes/Note;", "setNote", "(Lhu/ekreta/ellenorzo/notes/Note;)V", "note$delegate", "seenByTutelaryUTC", "getSeenByTutelaryUTC", "setSeenByTutelaryUTC", "seenByTutelaryUTC$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "title", "getTitle", "setTitle", "title$delegate", "type", "getType", "setType", "type$delegate", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoteDetailsViewModelImpl.kt */
public final class NoteDetailsViewModelImpl extends DataBindingViewModel implements NoteDetailsViewModel {
    public static final /* synthetic */ KProperty[] t;

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f5855k = DataBindingViewModel.boundString$default(this, this, 8, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f5856l;

    /* renamed from: m  reason: collision with root package name */
    public final ReadWriteProperty f5857m;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5858n;

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5859o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5860p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5861q;
    public final ReadWriteProperty r;
    public final ReadWriteProperty s;

    static {
        Class<NoteDetailsViewModelImpl> cls = NoteDetailsViewModelImpl.class;
        t = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "type", "getType()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "title", "getTitle()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "content", "getContent()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "seenByTutelaryUTC", "getSeenByTutelaryUTC()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "creatingTime", "getCreatingTime()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "note", "getNote()Lhu/ekreta/ellenorzo/notes/Note;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteDetailsViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, GroupRepository groupRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        this.f5856l = DataBindingViewModel.boundString$default(this, this, 97, (String) null, (Function1) null, 6, (Object) null);
        this.f5857m = DataBindingViewModel.boundString$default(this, this, 98, (String) null, (Function1) null, 6, (Object) null);
        this.f5858n = DataBindingViewModel.boundString$default(this, this, 13, (String) null, (Function1) null, 6, (Object) null);
        this.f5859o = DataBindingViewModel.boundString$default(this, this, 101, (String) null, (Function1) null, 6, (Object) null);
        this.f5860p = DataBindingViewModel.boundString$default(this, this, 64, (String) null, (Function1) null, 6, (Object) null);
        this.f5861q = DataBindingViewModel.boundString$default(this, this, 48, (String) null, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundString$default(this, this, 79, (String) null, (Function1) null, 6, (Object) null);
        Delegates delegates = Delegates.INSTANCE;
        this.s = new NoteDetailsViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this, groupRepository);
    }

    public void a(Note note) {
        this.s.setValue(this, t[8], note);
    }

    public String getTitle() {
        return (String) this.f5856l.getValue(this, t[1]);
    }

    public String getType() {
        return (String) this.f5855k.getValue(this, t[0]);
    }

    public String h() {
        return (String) this.f5860p.getValue(this, t[5]);
    }

    public String m() {
        return (String) this.f5859o.getValue(this, t[4]);
    }

    public String p() {
        return (String) this.r.getValue(this, t[7]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5857m.setValue(this, t[2], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5861q.setValue(this, t[6], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5860p.setValue(this, t[5], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, t[7], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5858n.setValue(this, t[3], str);
    }

    public void v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5859o.setValue(this, t[4], str);
    }

    public void w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5856l.setValue(this, t[1], str);
    }

    public void x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5855k.setValue(this, t[0], str);
    }

    public String x0() {
        return (String) this.f5857m.getValue(this, t[2]);
    }

    public String y() {
        return (String) this.f5861q.getValue(this, t[6]);
    }
}
