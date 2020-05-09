package p289hu.ekreta.ellenorzo.timetable.detail;

import android.content.Context;
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
import p000a.p173k.p174a.C2676c;
import p211h.p262m.p263d.C3737d;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestRepository;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItemRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;
import p351l.p352a.C5431a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\u0010\u0016J\b\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020KH\u0016J\b\u0010M\u001a\u00020KH\u0016J\b\u0010N\u001a\u00020KH\u0016R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188V@VX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020$8V@VX\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u0010+\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020$8V@VX\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001f\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R+\u0010/\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188V@VX\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u00103\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020$8V@VX\u0002¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u00107\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188V@VX\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000R+\u0010;\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020$8V@VX\u0002¢\u0006\u0012\n\u0004\b>\u0010\u001f\u001a\u0004\b<\u0010'\"\u0004\b=\u0010)R/\u0010@\u001a\u0004\u0018\u00010?2\b\u0010\u0017\u001a\u0004\u0018\u00010?8V@VX\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R+\u0010F\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020$8V@VX\u0002¢\u0006\u0012\n\u0004\bI\u0010\u001f\u001a\u0004\bG\u0010'\"\u0004\bH\u0010)¨\u0006O"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "context", "Landroid/content/Context;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "homeworkRepository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "announcedTestRepository", "Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;", "timeTableItemRepository", "Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;", "rxActivityResultProvider", "Ljavax/inject/Provider;", "Lcom/petarmarijanovic/rxactivityresult/RxActivityResult;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Landroid/content/Context;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Lhu/ekreta/ellenorzo/announcedTest/AnnouncedTestRepository;Lhu/ekreta/ellenorzo/timetable/TimeTableItemRepository;Ljavax/inject/Provider;)V", "<set-?>", "", "addNewHomeworkButtonVisible", "getAddNewHomeworkButtonVisible", "()Z", "setAddNewHomeworkButtonVisible", "(Z)V", "addNewHomeworkButtonVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "announcedTestButtonVisible", "getAnnouncedTestButtonVisible", "setAnnouncedTestButtonVisible", "announcedTestButtonVisible$delegate", "", "classroom", "getClassroom", "()Ljava/lang/String;", "setClassroom", "(Ljava/lang/String;)V", "classroom$delegate", "date", "getDate", "setDate", "date$delegate", "homeworkButtonVisible", "getHomeworkButtonVisible", "setHomeworkButtonVisible", "homeworkButtonVisible$delegate", "name", "getName", "setName", "name$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "teacher", "getTeacher", "setTeacher", "teacher$delegate", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "timeTableItem", "getTimeTableItem", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "setTimeTableItem", "(Lhu/ekreta/ellenorzo/timetable/TimeTableItem;)V", "timeTableItem$delegate", "topic", "getTopic", "setTopic", "topic$delegate", "addHomework", "", "loadAnnouncedTest", "loadHomework", "refreshTimeTableItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModelImpl */
/* compiled from: TimeTableItemDetailViewModelImpl.kt */
public final class TimeTableItemDetailViewModelImpl extends AuthenticatedViewModel implements TimeTableItemDetailViewModel {

    /* renamed from: C */
    public static final /* synthetic */ KProperty[] f15221C;

    /* renamed from: A */
    public final TimeTableItemRepository f15222A;

    /* renamed from: B */
    public final C5431a<C2676c> f15223B;

    /* renamed from: m */
    public final ReadWriteProperty f15224m = new TimeTableItemDetailViewModelImpl$$special$$inlined$observable$1(null, null, this);

    /* renamed from: n */
    public final ReadWriteProperty f15225n;

    /* renamed from: o */
    public final ReadWriteProperty f15226o;

    /* renamed from: p */
    public final ReadWriteProperty f15227p;

    /* renamed from: q */
    public final ReadWriteProperty f15228q;

    /* renamed from: r */
    public final ReadWriteProperty f15229r;

    /* renamed from: s */
    public final ReadWriteProperty f15230s;

    /* renamed from: t */
    public final ReadWriteProperty f15231t;

    /* renamed from: u */
    public final ReadWriteProperty f15232u;

    /* renamed from: v */
    public final ReadWriteProperty f15233v;

    /* renamed from: w */
    public final Context f15234w;

    /* renamed from: x */
    public final ProfileRepository f15235x;

    /* renamed from: y */
    public final HomeworkRepository f15236y;

    /* renamed from: z */
    public final AnnouncedTestRepository f15237z;

    static {
        Class<TimeTableItemDetailViewModelImpl> cls = TimeTableItemDetailViewModelImpl.class;
        f15221C = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "timeTableItem", "getTimeTableItem()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "name", "getName()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "date", "getDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "topic", "getTopic()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacher", "getTeacher()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "classroom", "getClassroom()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "addNewHomeworkButtonVisible", "getAddNewHomeworkButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "homeworkButtonVisible", "getHomeworkButtonVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "announcedTestButtonVisible", "getAnnouncedTestButtonVisible()Z"))};
    }

    public TimeTableItemDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, Context context, ProfileRepository profileRepository, HomeworkRepository homeworkRepository, AnnouncedTestRepository announcedTestRepository, TimeTableItemRepository timeTableItemRepository, C5431a<C2676c> aVar) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "homeworkRepository");
        Intrinsics.checkParameterIsNotNull(announcedTestRepository, "announcedTestRepository");
        Intrinsics.checkParameterIsNotNull(timeTableItemRepository, "timeTableItemRepository");
        Intrinsics.checkParameterIsNotNull(aVar, "rxActivityResultProvider");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f15234w = context;
        this.f15235x = profileRepository;
        this.f15236y = homeworkRepository;
        this.f15237z = announcedTestRepository;
        this.f15222A = timeTableItemRepository;
        this.f15223B = aVar;
        Delegates delegates = Delegates.INSTANCE;
        this.f15225n = DataBindingViewModel.boundBoolean$default(this, this, 37, false, null, 6, null);
        this.f15226o = DataBindingViewModel.boundString$default(this, this, 87, null, null, 6, null);
        this.f15227p = DataBindingViewModel.boundString$default(this, this, 64, null, null, 6, null);
        this.f15228q = DataBindingViewModel.boundString$default(this, this, 89, null, null, 6, null);
        this.f15229r = DataBindingViewModel.boundString$default(this, this, 99, null, null, 6, null);
        this.f15230s = DataBindingViewModel.boundString$default(this, this, 20, null, null, 6, null);
        this.f15231t = DataBindingViewModel.boundBoolean$default(this, this, 90, false, null, 6, null);
        this.f15232u = DataBindingViewModel.boundBoolean$default(this, this, 11, false, null, 6, null);
        this.f15233v = DataBindingViewModel.boundBoolean$default(this, this, 7, false, null, 6, null);
    }

    /* renamed from: H1 */
    public void mo16144H1() {
        mo16373a((Function1<? super C3737d, Unit>) new TimeTableItemDetailViewModelImpl$addHomework$1<Object,Unit>(this));
    }

    /* renamed from: J0 */
    public boolean mo16145J0() {
        return ((Boolean) this.f15232u.getValue(this, f15221C[8])).booleanValue();
    }

    /* renamed from: P1 */
    public TimeTableItem mo16156P1() {
        return (TimeTableItem) this.f15224m.getValue(this, f15221C[0]);
    }

    /* renamed from: Q1 */
    public void mo16157Q1() {
        TimeTableItem P1 = mo16156P1();
        if (P1 != null) {
            C5027n c = this.f15235x.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new C4392xf29b6174<Object,Object>(P1, this));
            Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…rized()\n                }");
            mo16413a(C4998b.m16842a(c, (Function1) new C4393xf29b6175(this), (Function0) null, (Function1) null, 6));
        }
    }

    /* renamed from: R0 */
    public boolean mo16146R0() {
        return ((Boolean) this.f15231t.getValue(this, f15221C[7])).booleanValue();
    }

    /* renamed from: V0 */
    public void mo16147V0() {
        C5027n a = this.f15235x.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$1<Object,Object>(this)).mo17238d((C4673f<? super C4663c>) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$2<Object>(this)).mo17223b((C4668a) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$3(this)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository\n      …dSchedulers.mainThread())");
        mo16413a(C4998b.m16842a(a, (Function1) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$5(this), (Function0) null, (Function1) new TimeTableItemDetailViewModelImpl$loadAnnouncedTest$4(this), 2));
    }

    /* renamed from: X0 */
    public boolean mo16148X0() {
        return ((Boolean) this.f15233v.getValue(this, f15221C[9])).booleanValue();
    }

    /* renamed from: a */
    public void mo16149a(TimeTableItem timeTableItem) {
        this.f15224m.setValue(this, f15221C[0], timeTableItem);
    }

    /* renamed from: b */
    public void mo16158b(boolean z) {
        this.f15231t.setValue(this, f15221C[7], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo16159c(boolean z) {
        this.f15233v.setValue(this, f15221C[9], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo16160d(boolean z) {
        this.f15232u.setValue(this, f15221C[8], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo16150d() {
        return ((Boolean) this.f15225n.getValue(this, f15221C[1])).booleanValue();
    }

    /* renamed from: e */
    public void mo16161e(boolean z) {
        this.f15225n.setValue(this, f15221C[1], Boolean.valueOf(z));
    }

    public String getName() {
        return (String) this.f15226o.getValue(this, f15221C[2]);
    }

    /* renamed from: h */
    public String mo16152h() {
        return (String) this.f15227p.getValue(this, f15221C[3]);
    }

    /* renamed from: m */
    public String mo16153m() {
        return (String) this.f15229r.getValue(this, f15221C[5]);
    }

    /* renamed from: r */
    public void mo16162r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15230s.setValue(this, f15221C[6], str);
    }

    /* renamed from: r1 */
    public String mo16154r1() {
        return (String) this.f15230s.getValue(this, f15221C[6]);
    }

    /* renamed from: s */
    public void mo16163s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15227p.setValue(this, f15221C[3], str);
    }

    /* renamed from: t */
    public void mo16164t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15226o.setValue(this, f15221C[2], str);
    }

    /* renamed from: u */
    public void mo16165u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15229r.setValue(this, f15221C[5], str);
    }

    /* renamed from: v */
    public void mo16166v(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f15228q.setValue(this, f15221C[4], str);
    }

    /* renamed from: y1 */
    public void mo16155y1() {
        C5027n a = this.f15235x.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new TimeTableItemDetailViewModelImpl$loadHomework$1<Object,Object>(this)).mo17238d((C4673f<? super C4663c>) new TimeTableItemDetailViewModelImpl$loadHomework$2<Object>(this)).mo17223b((C4668a) new TimeTableItemDetailViewModelImpl$loadHomework$3(this)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository\n      …dSchedulers.mainThread())");
        mo16413a(C4998b.m16842a(a, (Function1) new TimeTableItemDetailViewModelImpl$loadHomework$5(this), (Function0) null, (Function1) new TimeTableItemDetailViewModelImpl$loadHomework$4(this), 2));
    }
}
