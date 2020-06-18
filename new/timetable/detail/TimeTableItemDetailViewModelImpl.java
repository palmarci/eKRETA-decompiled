package hu.ekreta.ellenorzo.timetable.detail;

import a.k.a.c;
import android.content.Context;
import h.m.d.d;
import hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.timetable.TimeTableItem;
import hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import k.b.b0.f;
import k.b.f0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import l.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\u0010\u0018J\b\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020MH\u0016J\b\u0010O\u001a\u00020MH\u0016J\b\u0010P\u001a\u00020MH\u0016R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0002¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R+\u0010'\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020&8V@VX\u0002¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010-\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020&8V@VX\u0002¢\u0006\u0012\n\u0004\b0\u0010!\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R+\u00101\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0002¢\u0006\u0012\n\u0004\b4\u0010!\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u00105\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020&8V@VX\u0002¢\u0006\u0012\n\u0004\b8\u0010!\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u00109\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0002¢\u0006\u0012\n\u0004\b<\u0010!\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R+\u0010=\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020&8V@VX\u0002¢\u0006\u0012\n\u0004\b@\u0010!\u001a\u0004\b>\u0010)\"\u0004\b?\u0010+R/\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u0019\u001a\u0004\u0018\u00010A8V@VX\u0002¢\u0006\u0012\n\u0004\bG\u0010!\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R+\u0010H\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020&8V@VX\u0002¢\u0006\u0012\n\u0004\bK\u0010!\u001a\u0004\bI\u0010)\"\u0004\bJ\u0010+¨\u0006Q"}, d2 = {"Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "homeworkRepository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "announcedTestRepository", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "timeTableItemRepository", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "rxActivityResultProvider", "Ljavax/inject/Provider;", "Lcom/petarmarijanovic/rxactivityresult/RxActivityResult;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;Ljavax/inject/Provider;)V", "<set-?>", "", "addNewHomeworkButtonVisible", "getAddNewHomeworkButtonVisible", "()Z", "setAddNewHomeworkButtonVisible", "(Z)V", "addNewHomeworkButtonVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "announcedTestButtonVisible", "getAnnouncedTestButtonVisible", "setAnnouncedTestButtonVisible", "announcedTestButtonVisible$delegate", "", "classroom", "getClassroom", "()Ljava/lang/String;", "setClassroom", "(Ljava/lang/String;)V", "classroom$delegate", "date", "getDate", "setDate", "date$delegate", "homeworkButtonVisible", "getHomeworkButtonVisible", "setHomeworkButtonVisible", "homeworkButtonVisible$delegate", "name", "getName", "setName", "name$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "timeTableItem", "getTimeTableItem", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "setTimeTableItem", "(Lhu/ekreta/ellenorzo/timetable/TimeTableItem;)V", "timeTableItem$delegate", "topic", "getTopic", "setTopic", "topic$delegate", "addHomework", "", "loadAnnouncedTest", "loadHomework", "refreshTimeTableItem", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl extends AuthenticatedViewModel implements TimeTableItemDetailViewModel {
    public static final /* synthetic */ KProperty[] D;
    public final AnnouncedTestRepository A;
    public final TimeTableItemRepository B;
    public final a<c> C;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f6258n = new TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f6259o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f6260p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f6261q;
    public final ReadWriteProperty r;
    public final ReadWriteProperty s;
    public final ReadWriteProperty t;
    public final ReadWriteProperty u;
    public final ReadWriteProperty v;
    public final ReadWriteProperty w;
    public final Context x;
    public final ProfileRepository y;
    public final HomeworkRepository z;

    static {
        Class<TimeTableItemDetailViewModelImpl> cls = TimeTableItemDetailViewModelImpl.class;
        D = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "timeTableItem", "getTimeTableItem()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "name", "getName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "topic", "getTopic()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "classroom", "getClassroom()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addNewHomeworkButtonVisible", "getAddNewHomeworkButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "homeworkButtonVisible", "getHomeworkButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "announcedTestButtonVisible", "getAnnouncedTestButtonVisible()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeTableItemDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, Context context, ProfileRepository profileRepository, HomeworkRepository homeworkRepository, AnnouncedTestRepository announcedTestRepository, TimeTableItemRepository timeTableItemRepository, a<c> aVar) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "homeworkRepository");
        Intrinsics.checkParameterIsNotNull(announcedTestRepository, "announcedTestRepository");
        Intrinsics.checkParameterIsNotNull(timeTableItemRepository, "timeTableItemRepository");
        Intrinsics.checkParameterIsNotNull(aVar, "rxActivityResultProvider");
        this.x = context;
        this.y = profileRepository;
        this.z = homeworkRepository;
        this.A = announcedTestRepository;
        this.B = timeTableItemRepository;
        this.C = aVar;
        Delegates delegates = Delegates.INSTANCE;
        this.f6259o = DataBindingViewModel.boundBoolean$default(this, this, 37, false, (Function1) null, 6, (Object) null);
        this.f6260p = DataBindingViewModel.boundString$default(this, this, 87, (String) null, (Function1) null, 6, (Object) null);
        this.f6261q = DataBindingViewModel.boundString$default(this, this, 64, (String) null, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundString$default(this, this, 89, (String) null, (Function1) null, 6, (Object) null);
        this.s = DataBindingViewModel.boundString$default(this, this, 101, (String) null, (Function1) null, 6, (Object) null);
        this.t = DataBindingViewModel.boundString$default(this, this, 21, (String) null, (Function1) null, 6, (Object) null);
        this.u = DataBindingViewModel.boundBoolean$default(this, this, 90, false, (Function1) null, 6, (Object) null);
        this.v = DataBindingViewModel.boundBoolean$default(this, this, 10, false, (Function1) null, 6, (Object) null);
        this.w = DataBindingViewModel.boundBoolean$default(this, this, 6, false, (Function1) null, 6, (Object) null);
    }

    public void G1() {
        n<R> a2 = this.y.b().c(new TimeTableItemDetailViewModelImpl$loadHomework$1(this)).d((f<? super k.b.a0.c>) new TimeTableItemDetailViewModelImpl$loadHomework$2(this)).b((k.b.b0.a) new TimeTableItemDetailViewModelImpl$loadHomework$3(this)).a(k.b.z.a.a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository\n      …dSchedulers.mainThread())");
        a(b.a(a2, new TimeTableItemDetailViewModelImpl$loadHomework$5(this), (Function0) null, new TimeTableItemDetailViewModelImpl$loadHomework$4(this), 2));
    }

    public boolean L0() {
        return ((Boolean) this.v.getValue(this, D[8])).booleanValue();
    }

    public void Q1() {
        a((Function1<? super d, Unit>) new TimeTableItemDetailViewModelImpl$addHomework$1(this));
    }

    public boolean U0() {
        return ((Boolean) this.u.getValue(this, D[7])).booleanValue();
    }

    public void Z0() {
        n<R> a2 = this.y.b().c(new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$1(this)).d((f<? super k.b.a0.c>) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$2(this)).b((k.b.b0.a) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$3(this)).a(k.b.z.a.a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository\n      …dSchedulers.mainThread())");
        a(b.a(a2, new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$5(this), (Function0) null, new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4(this), 2));
    }

    public TimeTableItem Z1() {
        return (TimeTableItem) this.f6258n.getValue(this, D[0]);
    }

    public void a(TimeTableItem timeTableItem) {
        this.f6258n.setValue(this, D[0], timeTableItem);
    }

    public void a2() {
        TimeTableItem Z1 = Z1();
        if (Z1 != null) {
            n<R> c = this.y.b().c(new TimeTableItemDetailViewModelImpl$refreshTimeTableItem$$inlined$let$lambda$1(Z1, this));
            Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…rized()\n                }");
            a(b.a(c, new TimeTableItemDetailViewModelImpl$refreshTimeTableItem$$inlined$let$lambda$2(this), (Function0) null, (Function1) null, 6));
        }
    }

    public boolean b1() {
        return ((Boolean) this.w.getValue(this, D[9])).booleanValue();
    }

    public void c(boolean z2) {
        this.u.setValue(this, D[7], Boolean.valueOf(z2));
    }

    public void d(boolean z2) {
        this.w.setValue(this, D[9], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.f6259o.getValue(this, D[1])).booleanValue();
    }

    public void e(boolean z2) {
        this.v.setValue(this, D[8], Boolean.valueOf(z2));
    }

    public void f(boolean z2) {
        this.f6259o.setValue(this, D[1], Boolean.valueOf(z2));
    }

    public String getName() {
        return (String) this.f6260p.getValue(this, D[2]);
    }

    public String h() {
        return (String) this.f6261q.getValue(this, D[3]);
    }

    public String m() {
        return (String) this.s.getValue(this, D[5]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.t.setValue(this, D[6], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6261q.setValue(this, D[3], str);
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f6260p.setValue(this, D[2], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.s.setValue(this, D[5], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.r.setValue(this, D[4], str);
    }

    public String z1() {
        return (String) this.t.getValue(this, D[6]);
    }
}
