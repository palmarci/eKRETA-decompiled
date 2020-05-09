package p289hu.ekreta.ellenorzo.homework;

import android.app.Activity;
import android.content.Intent;
import java.util.List;
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
import p211h.p271p.C3824r;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.group.GroupRepository;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C4667b;
import p300k.p313b.C4991d;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p314a0.C4663c;
import p300k.p313b.p315b0.C4668a;
import p300k.p313b.p315b0.C4673f;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110E2\u0006\u0010F\u001a\u00020+H\u0016J\b\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020+H\u0016J\b\u0010K\u001a\u00020HH\u0016J\b\u0010L\u001a\u00020HH\u0016R+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010 \u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR+\u0010$\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0018\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R+\u0010.\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0018\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R+\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R+\u00105\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0018\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR/\u0010:\u001a\u0004\u0018\u0001092\b\u0010\u0010\u001a\u0004\u0018\u0001098V@VX\u0002¢\u0006\u0012\n\u0004\b?\u0010\u0018\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010@\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\bC\u0010\u0018\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001e¨\u0006M"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "repository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "groupRepository", "Lhu/ekreta/ellenorzo/group/GroupRepository;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Lhu/ekreta/ellenorzo/group/GroupRepository;)V", "<set-?>", "", "commentButtonVisibility", "getCommentButtonVisibility", "()Z", "setCommentButtonVisibility", "(Z)V", "commentButtonVisibility$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "createDate", "getCreateDate", "()Ljava/lang/String;", "setCreateDate", "(Ljava/lang/String;)V", "createDate$delegate", "deadline", "getDeadline", "setDeadline", "deadline$delegate", "group", "getGroup", "setGroup", "group$delegate", "homeworkComments", "Landroidx/lifecycle/MutableLiveData;", "", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "getHomeworkComments", "()Landroidx/lifecycle/MutableLiveData;", "isStudentHomeworkEnabled", "setStudentHomeworkEnabled", "isStudentHomeworkEnabled$delegate", "progressVisible", "getProgressVisible", "setProgressVisible", "progressVisible$delegate", "subject", "getSubject", "setSubject", "subject$delegate", "Lhu/ekreta/ellenorzo/homework/Homework;", "teacherHomework", "getTeacherHomework", "()Lhu/ekreta/ellenorzo/homework/Homework;", "setTeacherHomework", "(Lhu/ekreta/ellenorzo/homework/Homework;)V", "teacherHomework$delegate", "text", "getText", "setText", "text$delegate", "canDeleteComment", "Lio/reactivex/Observable;", "homeworkComment", "commentHomework", "", "deleteHomeworkComment", "comment", "onRefresh", "refreshList", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModelImpl */
/* compiled from: HomeworkDetailViewModelImpl.kt */
public final class HomeworkDetailViewModelImpl extends AuthenticatedViewModel implements HomeworkDetailViewModel {

    /* renamed from: y */
    public static final /* synthetic */ KProperty[] f13461y;

    /* renamed from: m */
    public final ReadWriteProperty f13462m = DataBindingViewModel.boundString$default(this, this, 70, null, null, 6, null);

    /* renamed from: n */
    public final ReadWriteProperty f13463n;

    /* renamed from: o */
    public final ReadWriteProperty f13464o;

    /* renamed from: p */
    public final ReadWriteProperty f13465p;

    /* renamed from: q */
    public final ReadWriteProperty f13466q;

    /* renamed from: r */
    public final ReadWriteProperty f13467r;

    /* renamed from: s */
    public final ReadWriteProperty f13468s;

    /* renamed from: t */
    public final ReadWriteProperty f13469t;

    /* renamed from: u */
    public final ReadWriteProperty f13470u;

    /* renamed from: v */
    public final C3824r<List<HomeworkComment>> f13471v;

    /* renamed from: w */
    public final ProfileRepository f13472w;

    /* renamed from: x */
    public final HomeworkRepository f13473x;

    static {
        Class<HomeworkDetailViewModelImpl> cls = HomeworkDetailViewModelImpl.class;
        f13461y = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "subject", "getSubject()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "text", "getText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "deadline", "getDeadline()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "createDate", "getCreateDate()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "isStudentHomeworkEnabled", "isStudentHomeworkEnabled()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "commentButtonVisibility", "getCommentButtonVisibility()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "group", "getGroup()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "progressVisible", "getProgressVisible()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "teacherHomework", "getTeacherHomework()Lhu/ekreta/ellenorzo/homework/Homework;"))};
    }

    public HomeworkDetailViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, HomeworkRepository homeworkRepository, GroupRepository groupRepository) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "repository");
        Intrinsics.checkParameterIsNotNull(groupRepository, "groupRepository");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f13472w = profileRepository;
        this.f13473x = homeworkRepository;
        this.f13463n = DataBindingViewModel.boundString$default(this, this, 15, null, null, 6, null);
        this.f13464o = DataBindingViewModel.boundString$default(this, this, 53, null, null, 6, null);
        this.f13465p = DataBindingViewModel.boundString$default(this, this, 54, null, null, 6, null);
        this.f13466q = DataBindingViewModel.boundBoolean$default(this, this, 81, false, null, 6, null);
        this.f13467r = DataBindingViewModel.boundBoolean$default(this, this, 94, false, null, 6, null);
        this.f13468s = DataBindingViewModel.boundString$default(this, this, 79, null, null, 6, null);
        this.f13469t = DataBindingViewModel.boundBoolean$default(this, this, 37, true, null, 4, null);
        Delegates delegates = Delegates.INSTANCE;
        this.f13470u = new HomeworkDetailViewModelImpl$$special$$inlined$observable$1(null, null, this, groupRepository);
        this.f13471v = new C3824r<>();
    }

    /* renamed from: F1 */
    public String mo12939F1() {
        return (String) this.f13464o.getValue(this, f13461y[2]);
    }

    /* renamed from: I0 */
    public String mo12940I0() {
        return (String) this.f13463n.getValue(this, f13461y[1]);
    }

    /* renamed from: N0 */
    public boolean mo12941N0() {
        return ((Boolean) this.f13467r.getValue(this, f13461y[5])).booleanValue();
    }

    /* renamed from: P1 */
    public Homework mo12954P1() {
        return (Homework) this.f13470u.getValue(this, f13461y[8]);
    }

    /* renamed from: Q0 */
    public String mo12942Q0() {
        return (String) this.f13465p.getValue(this, f13461y[3]);
    }

    /* renamed from: a */
    public void mo12943a(Homework homework) {
        this.f13470u.setValue(this, f13461y[8], homework);
    }

    /* renamed from: a */
    public void mo12944a(HomeworkComment homeworkComment) {
        Intrinsics.checkParameterIsNotNull(homeworkComment, "comment");
        C4667b a = this.f13472w.mo14191b().mo17236d((C4675h<? super T, ? extends C4991d>) new HomeworkDetailViewModelImpl$deleteHomeworkComment$1<Object,Object>(this, homeworkComment)).mo16975a(C5041a.m16999a()).mo16973a((C4675h<? super Throwable, ? extends C4991d>) HomeworkDetailViewModelImpl$deleteHomeworkComment$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository.getAct…          }\n            }");
        mo16413a(C4998b.m16838a(a, (Function1<? super Throwable, Unit>) new HomeworkDetailViewModelImpl$deleteHomeworkComment$4<Object,Unit>(this), (Function0<Unit>) new HomeworkDetailViewModelImpl$deleteHomeworkComment$3<Unit>(this)));
    }

    /* renamed from: b */
    public C5027n<Boolean> mo12945b(HomeworkComment homeworkComment) {
        Intrinsics.checkParameterIsNotNull(homeworkComment, "homeworkComment");
        C5027n<Boolean> g = this.f13472w.mo14191b().mo17246g(new HomeworkDetailViewModelImpl$canDeleteComment$1(homeworkComment));
        Intrinsics.checkExpressionValueIsNotNull(g, "profileRepository\n      …dByTeacher)\n            }");
        return g;
    }

    /* renamed from: b */
    public void mo12955b(boolean z) {
        this.f13467r.setValue(this, f13461y[5], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo12956c(boolean z) {
        this.f13469t.setValue(this, f13461y[7], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo12957d(boolean z) {
        this.f13466q.setValue(this, f13461y[4], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public boolean mo12946d() {
        return ((Boolean) this.f13469t.getValue(this, f13461y[7])).booleanValue();
    }

    /* renamed from: e */
    public void mo12947e() {
        mo12950l1();
    }

    /* renamed from: j */
    public String mo12949j() {
        return (String) this.f13462m.getValue(this, f13461y[0]);
    }

    /* renamed from: l1 */
    public void mo12950l1() {
        Homework P1 = mo12954P1();
        if (P1 != null) {
            C5027n a = this.f13472w.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$1<Object,Object>(P1, this)).mo17238d((C4673f<? super C4663c>) new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$2<Object>(this)).mo17232c((C4668a) new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$3(this)).mo17214a(C5041a.m16999a());
            Intrinsics.checkExpressionValueIsNotNull(a, "profileRepository.getAct…dSchedulers.mainThread())");
            mo16413a(C4998b.m16842a(a, (Function1) new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$5(this), (Function0) null, (Function1) new HomeworkDetailViewModelImpl$refreshList$$inlined$let$lambda$4(this), 2));
        }
    }

    /* renamed from: o0 */
    public void mo12951o0() {
        mo16376b((Function1<? super Activity, ? extends Intent>) new HomeworkDetailViewModelImpl$commentHomework$1<Object,Object>(this));
    }

    /* renamed from: p */
    public String mo12952p() {
        return (String) this.f13468s.getValue(this, f13461y[6]);
    }

    /* renamed from: p */
    public void mo12958p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13462m.setValue(this, f13461y[0], str);
    }

    /* renamed from: r */
    public void mo12959r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13465p.setValue(this, f13461y[3], str);
    }

    /* renamed from: s */
    public void mo12960s(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13464o.setValue(this, f13461y[2], str);
    }

    /* renamed from: t */
    public void mo12961t(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13468s.setValue(this, f13461y[6], str);
    }

    /* renamed from: u */
    public void mo12962u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13463n.setValue(this, f13461y[1], str);
    }

    /* renamed from: x1 */
    public boolean mo12953x1() {
        return ((Boolean) this.f13466q.getValue(this, f13461y[4])).booleanValue();
    }

    public C3824r<List<HomeworkComment>> getHomeworkComments() {
        return this.f13471v;
    }
}
