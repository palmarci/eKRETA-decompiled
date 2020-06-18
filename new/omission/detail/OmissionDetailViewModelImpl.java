package hu.ekreta.ellenorzo.omission.detail;

import android.content.Context;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.omission.Omission;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R+\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R+\u0010!\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R+\u0010%\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R/\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0010\u001a\u0004\u0018\u00010)8V@VX\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0018\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00100\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0018\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R+\u00104\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0018\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R+\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0018\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u0010\u0016¨\u0006<"}, d2 = {"Lhu/ekreta/ellenorzo/omission/detail/OmissionDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/omission/detail/OmissionDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "context", "Landroid/content/Context;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Landroid/content/Context;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "", "creatingTime", "getCreatingTime", "()Ljava/lang/String;", "setCreatingTime", "(Ljava/lang/String;)V", "creatingTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "group", "getGroup", "setGroup", "group$delegate", "justificationStateName", "getJustificationStateName", "setJustificationStateName", "justificationStateName$delegate", "lessonTimeFormatted", "getLessonTimeFormatted", "setLessonTimeFormatted", "lessonTimeFormatted$delegate", "modeName", "getModeName", "setModeName", "modeName$delegate", "Lhu/ekreta/ellenorzo/omission/Omission;", "omissionParameter", "getOmissionParameter", "()Lhu/ekreta/ellenorzo/omission/Omission;", "setOmissionParameter", "(Lhu/ekreta/ellenorzo/omission/Omission;)V", "omissionParameter$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "typeName", "getTypeName", "setTypeName", "typeName$delegate", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionDetailViewModelImpl.kt */
public final class OmissionDetailViewModelImpl extends DataBindingViewModel implements OmissionDetailViewModel {
    public static final /* synthetic */ KProperty[] u;

    /* renamed from: k  reason: collision with root package name */
    public final ReadWriteProperty f5980k;

    /* renamed from: l  reason: collision with root package name */
    public final ReadWriteProperty f5981l = DataBindingViewModel.boundString$default(this, this, 70, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: m  reason: collision with root package name */
    public final ReadWriteProperty f5982m = DataBindingViewModel.boundString$default(this, this, 91, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5983n = DataBindingViewModel.boundString$default(this, this, 36, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5984o = DataBindingViewModel.boundString$default(this, this, 101, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5985p = DataBindingViewModel.boundString$default(this, this, 77, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5986q = DataBindingViewModel.boundString$default(this, this, 33, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty r = DataBindingViewModel.boundString$default(this, this, 48, (String) null, (Function1) null, 6, (Object) null);
    public final ReadWriteProperty s = DataBindingViewModel.boundString$default(this, this, 79, (String) null, (Function1) null, 6, (Object) null);
    public final Context t;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5987a = new int[Omission.Type.values().length];

        static {
            f5987a[Omission.Type.Absence.ordinal()] = 1;
            f5987a[Omission.Type.Lateness.ordinal()] = 2;
        }
    }

    static {
        Class<OmissionDetailViewModelImpl> cls = OmissionDetailViewModelImpl.class;
        u = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "omissionParameter", "getOmissionParameter()Lhu/ekreta/ellenorzo/omission/Omission;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "modeName", "getModeName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "typeName", "getTypeName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "justificationStateName", "getJustificationStateName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "lessonTimeFormatted", "getLessonTimeFormatted()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "creatingTime", "getCreatingTime()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OmissionDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, Context context, GroupRepository groupRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        this.t = context;
        Delegates delegates = Delegates.INSTANCE;
        this.f5980k = new OmissionDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this, groupRepository);
    }

    public String O0() {
        return (String) this.f5982m.getValue(this, u[2]);
    }

    public final Context Z1() {
        return this.t;
    }

    public void a(Omission omission) {
        this.f5980k.setValue(this, u[0], omission);
    }

    public String g1() {
        return (String) this.f5986q.getValue(this, u[6]);
    }

    public String getTypeName() {
        return (String) this.f5983n.getValue(this, u[3]);
    }

    public String j() {
        return (String) this.f5981l.getValue(this, u[1]);
    }

    public String m() {
        return (String) this.f5984o.getValue(this, u[4]);
    }

    public void o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5981l.setValue(this, u[1], str);
    }

    public String p() {
        return (String) this.s.getValue(this, u[8]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, u[7], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, u[8], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5985p.setValue(this, u[5], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5986q.setValue(this, u[6], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5982m.setValue(this, u[2], str);
    }

    public void v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5984o.setValue(this, u[4], str);
    }

    public void w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5983n.setValue(this, u[3], str);
    }

    public String w1() {
        return (String) this.f5985p.getValue(this, u[5]);
    }

    public String y() {
        return (String) this.r.getValue(this, u[7]);
    }
}
