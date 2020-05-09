package p289hu.ekreta.ellenorzo.announcedTest;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u00178V@VX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R+\u0010$\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R+\u0010(\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0016\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R+\u0010,\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0016\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014R+\u00100\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0016\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R+\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0016\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u0014R+\u00108\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0016\u001a\u0004\b9\u0010\u0012\"\u0004\b:\u0010\u0014R+\u0010<\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@VX\u0002¢\u0006\u0012\n\u0004\b?\u0010\u0016\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u0014¨\u0006@"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "announcedAt", "getAnnouncedAt", "()Ljava/lang/String;", "setAnnouncedAt", "(Ljava/lang/String;)V", "announcedAt$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "announcedTest", "getAnnouncedTest", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "setAnnouncedTest", "(Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;)V", "announcedTest$delegate", "classScheduleNumber", "getClassScheduleNumber", "setClassScheduleNumber", "classScheduleNumber$delegate", "getContext", "()Landroid/content/Context;", "date", "getDate", "setDate", "date$delegate", "dayOfWeek", "getDayOfWeek", "setDayOfWeek", "dayOfWeek$delegate", "description", "getDescription", "setDescription", "description$delegate", "group", "getGroup", "setGroup", "group$delegate", "mode", "getMode", "setMode", "mode$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailViewModelImpl */
/* compiled from: AnnouncedTestDetailViewModelImpl.kt */
public final class AnnouncedTestDetailViewModelImpl extends AuthenticatedViewModel implements AnnouncedTestDetailViewModel {

    /* renamed from: x */
    public static final /* synthetic */ KProperty[] f11064x;

    /* renamed from: m */
    public final ReadWriteProperty f11065m = DataBindingViewModel.boundString$default(this, this, 64, null, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f11066n;

    /* renamed from: o */
    public final ReadWriteProperty f11067o;

    /* renamed from: p */
    public final ReadWriteProperty f11068p;

    /* renamed from: q */
    public final ReadWriteProperty f11069q;

    /* renamed from: r */
    public final ReadWriteProperty f11070r;

    /* renamed from: s */
    public final ReadWriteProperty f11071s;

    /* renamed from: t */
    public final ReadWriteProperty f11072t;

    /* renamed from: u */
    public final ReadWriteProperty f11073u;

    /* renamed from: v */
    public final ReadWriteProperty f11074v;

    /* renamed from: w */
    public final Context f11075w;

    static {
        Class<AnnouncedTestDetailViewModelImpl> cls = AnnouncedTestDetailViewModelImpl.class;
        f11064x = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "dayOfWeek", "getDayOfWeek()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "classScheduleNumber", "getClassScheduleNumber()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "description", "getDescription()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mode", "getMode()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "announcedAt", "getAnnouncedAt()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "announcedTest", "getAnnouncedTest()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;"))};
    }

    public AnnouncedTestDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, Context context, GroupRepository groupRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f11075w = context;
        this.f11066n = DataBindingViewModel.boundString$default(this, this, 45, null, null, 6, null);
        this.f11067o = DataBindingViewModel.boundString$default(this, this, 31, null, null, 6, null);
        this.f11068p = DataBindingViewModel.boundString$default(this, this, 70, null, null, 6, null);
        this.f11069q = DataBindingViewModel.boundString$default(this, this, 99, null, null, 6, null);
        this.f11070r = DataBindingViewModel.boundString$default(this, this, 87, null, null, 6, null);
        this.f11071s = DataBindingViewModel.boundString$default(this, this, 9, null, null, 6, null);
        this.f11072t = DataBindingViewModel.boundString$default(this, this, 62, null, null, 6, null);
        this.f11073u = DataBindingViewModel.boundString$default(this, this, 79, null, null, 6, null);
        Delegates delegates = Delegates.INSTANCE;
        this.f11074v = new AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1(null, null, this, groupRepository);
    }

    /* renamed from: P1 */
    public final Context mo11353P1() {
        return this.f11075w;
    }

    /* renamed from: Z0 */
    public String mo11345Z0() {
        return (String) this.f11072t.getValue(this, f11064x[7]);
    }

    /* renamed from: a */
    public void mo11346a(AnnouncedTest announcedTest) {
        this.f11074v.setValue(this, f11064x[9], announcedTest);
    }

    public String getDescription() {
        return (String) this.f11070r.getValue(this, f11064x[5]);
    }

    /* renamed from: h */
    public String mo11348h() {
        return (String) this.f11065m.getValue(this, f11064x[0]);
    }

    /* renamed from: j */
    public String mo11349j() {
        return (String) this.f11068p.getValue(this, f11064x[3]);
    }

    /* renamed from: m */
    public String mo11350m() {
        return (String) this.f11069q.getValue(this, f11064x[4]);
    }

    /* renamed from: p */
    public String mo11351p() {
        return (String) this.f11073u.getValue(this, f11064x[8]);
    }

    /* renamed from: p */
    public void mo11354p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11068p.setValue(this, f11064x[3], str);
    }

    /* renamed from: r */
    public void mo11355r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11072t.setValue(this, f11064x[7], str);
    }

    /* renamed from: s */
    public void mo11356s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11067o.setValue(this, f11064x[2], str);
    }

    /* renamed from: t */
    public void mo11357t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11065m.setValue(this, f11064x[0], str);
    }

    /* renamed from: u */
    public void mo11358u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11066n.setValue(this, f11064x[1], str);
    }

    /* renamed from: u0 */
    public String mo11352u0() {
        return (String) this.f11071s.getValue(this, f11064x[6]);
    }

    /* renamed from: v */
    public void mo11359v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11070r.setValue(this, f11064x[5], str);
    }

    /* renamed from: w */
    public void mo11360w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11073u.setValue(this, f11064x[8], str);
    }

    /* renamed from: x */
    public void mo11361x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11071s.setValue(this, f11064x[6], str);
    }

    /* renamed from: y */
    public void mo11362y(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f11069q.setValue(this, f11064x[4], str);
    }
}
