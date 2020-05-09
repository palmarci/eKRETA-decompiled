package p289hu.ekreta.ellenorzo.omission;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.omission.Omission.Type;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R+\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R+\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R+\u0010#\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R+\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R/\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u000e\u001a\u0004\u0018\u00010+8V@VX\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00102\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0016\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R+\u00106\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0016\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R+\u0010:\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0016\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010\u0014¨\u0006>"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/omission/OmissionDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/util/viewmodel/DataBindingViewModel;", "Lhu/ekreta/ellenorzo/omission/OmissionDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "context", "Landroid/content/Context;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Landroid/content/Context;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "getContext", "()Landroid/content/Context;", "<set-?>", "", "creatingTime", "getCreatingTime", "()Ljava/lang/String;", "setCreatingTime", "(Ljava/lang/String;)V", "creatingTime$delegate", "Lkotlin/properties/ReadWriteProperty;", "group", "getGroup", "setGroup", "group$delegate", "justificationStateName", "getJustificationStateName", "setJustificationStateName", "justificationStateName$delegate", "lessonTimeFormatted", "getLessonTimeFormatted", "setLessonTimeFormatted", "lessonTimeFormatted$delegate", "modeName", "getModeName", "setModeName", "modeName$delegate", "numberOfLessons", "getNumberOfLessons", "setNumberOfLessons", "numberOfLessons$delegate", "Lhu/ekreta/ellenorzo/omission/Omission;", "omission", "getOmission", "()Lhu/ekreta/ellenorzo/omission/Omission;", "setOmission", "(Lhu/ekreta/ellenorzo/omission/Omission;)V", "omission$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "typeName", "getTypeName", "setTypeName", "typeName$delegate", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.omission.OmissionDetailViewModelImpl */
/* compiled from: OmissionDetailViewModelImpl.kt */
public final class OmissionDetailViewModelImpl extends DataBindingViewModel implements OmissionDetailViewModel {

    /* renamed from: u */
    public static final /* synthetic */ KProperty[] f14368u;

    /* renamed from: j */
    public final ReadWriteProperty f14369j;

    /* renamed from: k */
    public final ReadWriteProperty f14370k = DataBindingViewModel.boundString$default(this, this, 70, null, null, 6, null);

    /* renamed from: l */
    public final ReadWriteProperty f14371l = DataBindingViewModel.boundString$default(this, this, 91, null, null, 6, null);

    /* renamed from: m */
    public final ReadWriteProperty f14372m = DataBindingViewModel.boundString$default(this, this, 36, null, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f14373n = DataBindingViewModel.boundString$default(this, this, 99, null, null, 6, null);

    /* renamed from: o */
    public final ReadWriteProperty f14374o = DataBindingViewModel.boundString$default(this, this, 56, null, null, 6, null);

    /* renamed from: p */
    public final ReadWriteProperty f14375p = DataBindingViewModel.boundString$default(this, this, 77, null, null, 6, null);

    /* renamed from: q */
    public final ReadWriteProperty f14376q = DataBindingViewModel.boundString$default(this, this, 33, null, null, 6, null);

    /* renamed from: r */
    public final ReadWriteProperty f14377r = DataBindingViewModel.boundString$default(this, this, 47, null, null, 6, null);

    /* renamed from: s */
    public final ReadWriteProperty f14378s = DataBindingViewModel.boundString$default(this, this, 79, null, null, 6, null);

    /* renamed from: t */
    public final Context f14379t;

    @Metadata(mo17461bv = {1, 0, 3}, mo17464k = 3, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.omission.OmissionDetailViewModelImpl$WhenMappings */
    public final /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14380a = new int[Type.values().length];

        static {
            f14380a[Type.Absence.ordinal()] = 1;
            f14380a[Type.Lateness.ordinal()] = 2;
        }
    }

    static {
        Class<OmissionDetailViewModelImpl> cls = OmissionDetailViewModelImpl.class;
        f14368u = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "omission", "getOmission()Lhu/ekreta/ellenorzo/omission/Omission;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "modeName", "getModeName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "typeName", "getTypeName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "numberOfLessons", "getNumberOfLessons()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "justificationStateName", "getJustificationStateName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "lessonTimeFormatted", "getLessonTimeFormatted()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "creatingTime", "getCreatingTime()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;"))};
    }

    public OmissionDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, Context context, GroupRepository groupRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        super(observableImpl, executeOnceUiCommandSource);
        this.f14379t = context;
        Delegates delegates = Delegates.INSTANCE;
        this.f14369j = new OmissionDetailViewModelImpl$$special$$inlined$observable$1(null, null, this, groupRepository);
    }

    /* renamed from: M0 */
    public String mo13880M0() {
        return (String) this.f14371l.getValue(this, f14368u[2]);
    }

    /* renamed from: P1 */
    public final Context mo13889P1() {
        return this.f14379t;
    }

    /* renamed from: a */
    public void mo13881a(Omission omission) {
        this.f14369j.setValue(this, f14368u[0], omission);
    }

    /* renamed from: c1 */
    public String mo13882c1() {
        return (String) this.f14376q.getValue(this, f14368u[7]);
    }

    public String getTypeName() {
        return (String) this.f14372m.getValue(this, f14368u[3]);
    }

    /* renamed from: j */
    public String mo13884j() {
        return (String) this.f14370k.getValue(this, f14368u[1]);
    }

    /* renamed from: m */
    public String mo13885m() {
        return (String) this.f14373n.getValue(this, f14368u[4]);
    }

    /* renamed from: p */
    public String mo13886p() {
        return (String) this.f14378s.getValue(this, f14368u[9]);
    }

    /* renamed from: p */
    public void mo13890p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14370k.setValue(this, f14368u[1], str);
    }

    /* renamed from: p1 */
    public String mo13887p1() {
        return (String) this.f14375p.getValue(this, f14368u[6]);
    }

    /* renamed from: r */
    public void mo13891r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14377r.setValue(this, f14368u[8], str);
    }

    /* renamed from: s */
    public void mo13892s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14378s.setValue(this, f14368u[9], str);
    }

    /* renamed from: t */
    public void mo13893t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14375p.setValue(this, f14368u[6], str);
    }

    /* renamed from: u */
    public void mo13894u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14376q.setValue(this, f14368u[7], str);
    }

    /* renamed from: v */
    public void mo13895v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14371l.setValue(this, f14368u[2], str);
    }

    /* renamed from: w */
    public void mo13896w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14374o.setValue(this, f14368u[5], str);
    }

    /* renamed from: x */
    public void mo13897x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14373n.setValue(this, f14368u[4], str);
    }

    /* renamed from: y */
    public String mo13888y() {
        return (String) this.f14377r.getValue(this, f14368u[8]);
    }

    /* renamed from: y */
    public void mo13898y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f14372m.setValue(this, f14368u[3], str);
    }
}
