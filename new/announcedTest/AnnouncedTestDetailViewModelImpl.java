package hu.ekreta.ellenorzo.announcedTest;

import android.content.Context;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R+\u0010&\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0018\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R+\u0010*\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0018\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R+\u0010.\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R+\u00102\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R+\u00106\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0018\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u0016R+\u0010:\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010\u0016R+\u0010>\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\bA\u0010\u0018\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010\u0016¨\u0006B"}, d2 = {"Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "announcedAt", "getAnnouncedAt", "()Ljava/lang/String;", "setAnnouncedAt", "(Ljava/lang/String;)V", "announcedAt$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "announcedTest", "getAnnouncedTest", "()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;", "setAnnouncedTest", "(Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;)V", "announcedTest$delegate", "classScheduleNumber", "getClassScheduleNumber", "setClassScheduleNumber", "classScheduleNumber$delegate", "getContext", "()Landroid/content/Context;", "date", "getDate", "setDate", "date$delegate", "dayOfWeek", "getDayOfWeek", "setDayOfWeek", "dayOfWeek$delegate", "description", "getDescription", "setDescription", "description$delegate", "group", "getGroup", "setGroup", "group$delegate", "mode", "getMode", "setMode", "mode$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: AnnouncedTestDetailViewModelImpl.kt */
public final class AnnouncedTestDetailViewModelImpl extends AuthenticatedViewModel implements AnnouncedTestDetailViewModel {
    public static final /* synthetic */ KProperty[] y;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5016n = DataBindingViewModel.boundString$default(this, this, 64, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5017o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5018p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5019q;
    public final ReadWriteProperty r;
    public final ReadWriteProperty s;
    public final ReadWriteProperty t;
    public final ReadWriteProperty u;
    public final ReadWriteProperty v;
    public final ReadWriteProperty w;
    public final Context x;

    static {
        Class<AnnouncedTestDetailViewModelImpl> cls = AnnouncedTestDetailViewModelImpl.class;
        y = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "dayOfWeek", "getDayOfWeek()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "classScheduleNumber", "getClassScheduleNumber()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "description", "getDescription()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "mode", "getMode()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "announcedAt", "getAnnouncedAt()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "announcedTest", "getAnnouncedTest()Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTest;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnouncedTestDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, Context context, GroupRepository groupRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        this.x = context;
        this.f5017o = DataBindingViewModel.boundString$default(this, this, 46, (String) null, (Function1) null, 6, (Object) null);
        this.f5018p = DataBindingViewModel.boundString$default(this, this, 31, (String) null, (Function1) null, 6, (Object) null);
        this.f5019q = DataBindingViewModel.boundString$default(this, this, 70, (String) null, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundString$default(this, this, 101, (String) null, (Function1) null, 6, (Object) null);
        this.s = DataBindingViewModel.boundString$default(this, this, 87, (String) null, (Function1) null, 6, (Object) null);
        this.t = DataBindingViewModel.boundString$default(this, this, 8, (String) null, (Function1) null, 6, (Object) null);
        this.u = DataBindingViewModel.boundString$default(this, this, 62, (String) null, (Function1) null, 6, (Object) null);
        this.v = DataBindingViewModel.boundString$default(this, this, 79, (String) null, (Function1) null, 6, (Object) null);
        Delegates delegates = Delegates.INSTANCE;
        this.w = new AnnouncedTestDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this, groupRepository);
    }

    public final Context Z1() {
        return this.x;
    }

    public void a(AnnouncedTest announcedTest) {
        this.w.setValue(this, y[9], announcedTest);
    }

    public String d1() {
        return (String) this.u.getValue(this, y[7]);
    }

    public String getDescription() {
        return (String) this.s.getValue(this, y[5]);
    }

    public String h() {
        return (String) this.f5016n.getValue(this, y[0]);
    }

    public String j() {
        return (String) this.f5019q.getValue(this, y[3]);
    }

    public String m() {
        return (String) this.r.getValue(this, y[4]);
    }

    public void o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5019q.setValue(this, y[3], str);
    }

    public String p() {
        return (String) this.v.getValue(this, y[8]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.u.setValue(this, y[7], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5018p.setValue(this, y[2], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5016n.setValue(this, y[0], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5017o.setValue(this, y[1], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, y[5], str);
    }

    public void v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.v.setValue(this, y[8], str);
    }

    public String v0() {
        return (String) this.t.getValue(this, y[6]);
    }

    public void w(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.t.setValue(this, y[6], str);
    }

    public void x(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, y[4], str);
    }
}
