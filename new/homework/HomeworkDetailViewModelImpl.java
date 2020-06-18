package hu.ekreta.ellenorzo.homework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.p.r;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.group.GroupRepository;
import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.Calendar;
import java.util.List;
import k.b.a0.c;
import k.b.b;
import k.b.b0.f;
import k.b.b0.h;
import k.b.d;
import k.b.n;
import k.b.z.a.a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150S2\u0006\u0010T\u001a\u00020/H\u0016J\b\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020/H\u0016J\b\u0010Y\u001a\u00020VH\u0016J\b\u0010Z\u001a\u00020VH\u0016J\u0010\u0010[\u001a\u00020V2\u0006\u0010\\\u001a\u00020\u0015H\u0016J\b\u0010]\u001a\u00020VH\u0002R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010$\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R+\u0010(\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R+\u00102\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001c\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R+\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001c\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR+\u00109\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001c\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR+\u0010<\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\b>\u0010\u001c\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u0010?\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0002¢\u0006\u0012\n\u0004\bB\u0010\u001c\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u0010C\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bF\u0010\u001c\u001a\u0004\bD\u0010 \"\u0004\bE\u0010\"R/\u0010H\u001a\u0004\u0018\u00010G2\b\u0010\u0014\u001a\u0004\u0018\u00010G8V@VX\u0002¢\u0006\u0012\n\u0004\bM\u0010\u001c\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010N\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8V@VX\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u001c\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"¨\u0006^"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "repository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "context", "Landroid/content/Context;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Landroid/content/Context;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "commentButtonVisibility", "getCommentButtonVisibility", "()Z", "setCommentButtonVisibility", "(Z)V", "commentButtonVisibility$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "createDate", "getCreateDate", "()Ljava/lang/String;", "setCreateDate", "(Ljava/lang/String;)V", "createDate$delegate", "deadline", "getDeadline", "setDeadline", "deadline$delegate", "group", "getGroup", "setGroup", "group$delegate", "homeworkComments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "getHomeworkComments", "()Landroidx/lifecycle/MutableLiveData;", "homeworkDoneText", "getHomeworkDoneText", "setHomeworkDoneText", "homeworkDoneText$delegate", "isHomeworkDone", "setHomeworkDone", "isHomeworkDone$delegate", "isHomeworkDoneEditable", "setHomeworkDoneEditable", "isHomeworkDoneEditable$delegate", "isStudentHomeworkEnabled", "setStudentHomeworkEnabled", "isStudentHomeworkEnabled$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "Lhu/ekreta/ellenorzo/homework/Homework;", "teacherHomework", "getTeacherHomework", "()Lhu/ekreta/ellenorzo/homework/Homework;", "setTeacherHomework", "(Lhu/ekreta/ellenorzo/homework/Homework;)V", "teacherHomework$delegate", "text", "getText", "setText", "text$delegate", "canDeleteComment", "Lio/reactivex/Observable;", "homeworkComment", "commentHomework", "", "deleteHomeworkComment", "comment", "onRefresh", "refreshList", "saveHomeworkState", "state", "setHomeworkDoneLabelText", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl extends AuthenticatedViewModel implements HomeworkDetailViewModel {
    public static final /* synthetic */ KProperty[] D;
    public final ProfileRepository A;
    public final HomeworkRepository B;
    public final Context C;

    /* renamed from: n  reason: collision with root package name */
    public final ReadWriteProperty f5661n = DataBindingViewModel.boundString$default(this, this, 70, (String) null, (Function1) null, 6, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    public final ReadWriteProperty f5662o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5663p;

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5664q;
    public final ReadWriteProperty r;
    public final ReadWriteProperty s;
    public final ReadWriteProperty t;
    public final ReadWriteProperty u;
    public final ReadWriteProperty v;
    public final ReadWriteProperty w;
    public final ReadWriteProperty x;
    public final ReadWriteProperty y;
    public final r<List<HomeworkComment>> z;

    static {
        Class<HomeworkDetailViewModelImpl> cls = HomeworkDetailViewModelImpl.class;
        D = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "text", "getText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "deadline", "getDeadline()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "createDate", "getCreateDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "isStudentHomeworkEnabled", "isStudentHomeworkEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "commentButtonVisibility", "getCommentButtonVisibility()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "isHomeworkDoneEditable", "isHomeworkDoneEditable()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "isHomeworkDone", "isHomeworkDone()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "homeworkDoneText", "getHomeworkDoneText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacherHomework", "getTeacherHomework()Lhu/ekreta/ellenorzo/homework/Homework;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, HomeworkRepository homeworkRepository, Context context, GroupRepository groupRepository) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "repository");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        this.A = profileRepository;
        this.B = homeworkRepository;
        this.C = context;
        this.f5662o = DataBindingViewModel.boundString$default(this, this, 14, (String) null, (Function1) null, 6, (Object) null);
        this.f5663p = DataBindingViewModel.boundString$default(this, this, 54, (String) null, (Function1) null, 6, (Object) null);
        this.f5664q = DataBindingViewModel.boundString$default(this, this, 55, (String) null, (Function1) null, 6, (Object) null);
        this.r = DataBindingViewModel.boundBoolean$default(this, this, 81, false, (Function1) null, 6, (Object) null);
        this.s = DataBindingViewModel.boundBoolean$default(this, this, 96, false, (Function1) null, 6, (Object) null);
        this.t = DataBindingViewModel.boundString$default(this, this, 79, (String) null, (Function1) null, 6, (Object) null);
        this.u = DataBindingViewModel.boundBoolean$default(this, this, 37, true, (Function1) null, 4, (Object) null);
        this.v = DataBindingViewModel.boundBoolean$default(this, this, 107, false, (Function1) null, 6, (Object) null);
        this.w = DataBindingViewModel.boundBoolean$default(this, this, 86, false, (Function1) null, 6, (Object) null);
        this.x = DataBindingViewModel.boundString$default(this, this, 117, (String) null, (Function1) null, 6, (Object) null);
        Delegates delegates = Delegates.INSTANCE;
        this.y = new HomeworkDetailViewModelImpl$$special$$inlined$observable$1((Object) null, (Object) null, this, groupRepository);
        this.z = new r<>();
    }

    public boolean A0() {
        return ((Boolean) this.w.getValue(this, D[9])).booleanValue();
    }

    public boolean F1() {
        return ((Boolean) this.r.getValue(this, D[4])).booleanValue();
    }

    public String J0() {
        return (String) this.f5662o.getValue(this, D[1]);
    }

    public boolean K0() {
        return ((Boolean) this.v.getValue(this, D[8])).booleanValue();
    }

    public String O1() {
        return (String) this.f5663p.getValue(this, D[2]);
    }

    public boolean Q0() {
        return ((Boolean) this.s.getValue(this, D[5])).booleanValue();
    }

    public String T0() {
        return (String) this.f5664q.getValue(this, D[3]);
    }

    public Homework Z1() {
        return (Homework) this.y.getValue(this, D[11]);
    }

    public void a(Homework homework) {
        this.y.setValue(this, D[11], homework);
    }

    public void a(HomeworkComment homeworkComment) {
        Intrinsics.checkParameterIsNotNull(homeworkComment, "comment");
        b a2 = this.A.b().d(new HomeworkDetailViewModelImpl$deleteHomeworkComment$1(this, homeworkComment)).a(a.a()).a((h<? super Throwable, ? extends d>) HomeworkDetailViewModelImpl$deleteHomeworkComment$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository.getAct…          }\n            }");
        a(k.b.f0.b.a(a2, (Function1<? super Throwable, Unit>) new HomeworkDetailViewModelImpl$deleteHomeworkComment$4(this), (Function0<Unit>) new HomeworkDetailViewModelImpl$deleteHomeworkComment$3(this)));
    }

    public final void a2() {
        String string = this.C.getString(A0() ? R.string.homework_done_label : R.string.homework_not_done_label);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(if (is….homework_not_done_label)");
        t(string);
    }

    public n<Boolean> b(HomeworkComment homeworkComment) {
        Intrinsics.checkParameterIsNotNull(homeworkComment, "homeworkComment");
        n<R> g2 = this.A.b().g(new HomeworkDetailViewModelImpl$canDeleteComment$1(homeworkComment));
        Intrinsics.checkExpressionValueIsNotNull(g2, "profileRepository\n      …dByTeacher)\n            }");
        return g2;
    }

    public void c(boolean z2) {
        this.s.setValue(this, D[5], Boolean.valueOf(z2));
    }

    public void d(boolean z2) {
        this.w.setValue(this, D[9], Boolean.valueOf(z2));
    }

    public boolean d() {
        return ((Boolean) this.u.getValue(this, D[7])).booleanValue();
    }

    public void e() {
        r1();
    }

    public void e(boolean z2) {
        this.v.setValue(this, D[8], Boolean.valueOf(z2));
    }

    public void f(boolean z2) {
        this.u.setValue(this, D[7], Boolean.valueOf(z2));
    }

    public void g(boolean z2) {
        this.r.setValue(this, D[4], Boolean.valueOf(z2));
    }

    public String i1() {
        return (String) this.x.getValue(this, D[10]);
    }

    public String j() {
        return (String) this.f5661n.getValue(this, D[0]);
    }

    public void o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5661n.setValue(this, D[0], str);
    }

    public void o0() {
        b((Function1<? super Activity, ? extends Intent>) new HomeworkDetailViewModelImpl$commentHomework$1(this));
    }

    public String p() {
        return (String) this.t.getValue(this, D[6]);
    }

    public void q(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5664q.setValue(this, D[3], str);
    }

    public void r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5663p.setValue(this, D[2], str);
    }

    public void r1() {
        Homework Z1 = Z1();
        if (Z1 != null) {
            n<R> a2 = this.A.b().c(new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$1(Z1, this)).d((f<? super c>) new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$2(this)).c((k.b.b0.a) new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$3(this)).a(a.a());
            Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository.getAct…dSchedulers.mainThread())");
            a(k.b.f0.b.a(a2, new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$5(this), (Function0) null, new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$4(this), 2));
        }
    }

    public void s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.t.setValue(this, D[6], str);
    }

    public void t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.x.setValue(this, D[10], str);
    }

    public void u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5662o.setValue(this, D[1], str);
    }

    public r<List<HomeworkComment>> getHomeworkComments() {
        return this.z;
    }

    public void b(boolean z2) {
        d(z2);
        a2();
        b a2 = this.A.b().a(HomeworkDetailViewModelImpl$saveHomeworkState$1.INSTANCE).d(new HomeworkDetailViewModelImpl$saveHomeworkState$2(this, z2)).a(a.a()).a((h<? super Throwable, ? extends d>) HomeworkDetailViewModelImpl$saveHomeworkState$3.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(a2, "profileRepository\n      …          }\n            }");
        a(k.b.f0.b.a(a2, (Function1<? super Throwable, Unit>) new HomeworkDetailViewModelImpl$saveHomeworkState$5(this), (Function0<Unit>) new HomeworkDetailViewModelImpl$saveHomeworkState$4(this)));
        HomeworkRepository homeworkRepository = this.B;
        Homework Z1 = Z1();
        if (Z1 == null) {
            Intrinsics.throwNpe();
        }
        c i2 = homeworkRepository.a(Homework.copy$default(Z1, (String) null, (String) null, (String) null, (String) null, false, (String) null, (Calendar) null, (Calendar) null, (Calendar) null, false, z2, (Boolean) null, (String) null, 7167, (Object) null)).i();
        Intrinsics.checkExpressionValueIsNotNull(i2, "repository.updateHomewor…\n            .subscribe()");
        a(i2);
    }
}
