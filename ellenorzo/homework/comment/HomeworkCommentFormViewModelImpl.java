package p289hu.ekreta.ellenorzo.homework.comment;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p289hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import p289hu.ekreta.ellenorzo.authentication.AuthenticationService;
import p289hu.ekreta.ellenorzo.homework.HomeworkRepository;
import p289hu.ekreta.ellenorzo.profile.ProfileRepository;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import p289hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import p289hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p335f0.C4998b;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ \u0010*\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0011H\u0002J\b\u0010/\u001a\u00020+H\u0016R+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00198V@VX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016¨\u00060"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "repository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;)V", "<set-?>", "", "commentText", "getCommentText", "()Ljava/lang/String;", "setCommentText", "(Ljava/lang/String;)V", "commentText$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "homeworkCommentEnabled", "getHomeworkCommentEnabled", "()Z", "setHomeworkCommentEnabled", "(Z)V", "homeworkCommentEnabled$delegate", "homeworkId", "", "getHomeworkId", "()Ljava/lang/Long;", "setHomeworkId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "timetableElementUid", "getTimetableElementUid", "setTimetableElementUid", "addNewHomework", "", "deadline", "Ljava/util/Calendar;", "timeTableElementUid", "commentHomework", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.comment.HomeworkCommentFormViewModelImpl */
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl extends AuthenticatedViewModel implements HomeworkCommentFormViewModel {

    /* renamed from: t */
    public static final /* synthetic */ KProperty[] f13550t;

    /* renamed from: m */
    public Long f13551m;

    /* renamed from: n */
    public String f13552n;

    /* renamed from: o */
    public final ReadWriteProperty f13553o = DataBindingViewModel.boundString$default(this, this, 39, null, new HomeworkCommentFormViewModelImpl$commentText$2(this), 2, null);

    /* renamed from: p */
    public final ReadWriteProperty f13554p = DataBindingViewModel.boundBoolean$default(this, this, 8, false, null, 6, null);

    /* renamed from: q */
    public final ProfileRepository f13555q;

    /* renamed from: r */
    public final HomeworkRepository f13556r;

    /* renamed from: s */
    public final DateTimeFactory f13557s;

    static {
        Class<HomeworkCommentFormViewModelImpl> cls = HomeworkCommentFormViewModelImpl.class;
        f13550t = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "commentText", "getCommentText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "homeworkCommentEnabled", "getHomeworkCommentEnabled()Z"))};
    }

    public HomeworkCommentFormViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, AuthenticationService authenticationService, ProfileRepository profileRepository, HomeworkRepository homeworkRepository, DateTimeFactory dateTimeFactory) {
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "repository");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        super(observableImpl, executeOnceUiCommandSource, authenticationService);
        this.f13555q = profileRepository;
        this.f13556r = homeworkRepository;
        this.f13557s = dateTimeFactory;
    }

    /* renamed from: K0 */
    public String mo13046K0() {
        return (String) this.f13553o.getValue(this, f13550t[0]);
    }

    /* renamed from: P1 */
    public Long mo13052P1() {
        return this.f13551m;
    }

    /* renamed from: Q1 */
    public String mo13053Q1() {
        return this.f13552n;
    }

    /* renamed from: U0 */
    public boolean mo13047U0() {
        return ((Boolean) this.f13554p.getValue(this, f13550t[1])).booleanValue();
    }

    /* renamed from: a */
    public void mo13048a(Long l) {
        this.f13551m = l;
    }

    /* renamed from: b */
    public void mo13054b(boolean z) {
        this.f13554p.setValue(this, f13550t[1], Boolean.valueOf(z));
    }

    /* renamed from: h */
    public void mo13049h(String str) {
        this.f13552n = str;
    }

    /* renamed from: k */
    public void mo13050k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f13553o.setValue(this, f13550t[0], str);
    }

    /* renamed from: o0 */
    public void mo13051o0() {
        mo13054b(false);
        if (mo13052P1() != null) {
            C5027n c = this.f13555q.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new HomeworkCommentFormViewModelImpl$commentHomework$1<Object,Object>(this));
            Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…rized()\n                }");
            mo16413a(C4998b.m16842a(c, (Function1) new HomeworkCommentFormViewModelImpl$commentHomework$3(this), (Function0) null, (Function1) new HomeworkCommentFormViewModelImpl$commentHomework$2(this), 2));
            return;
        }
        Calendar a = this.f13557s.mo16327a();
        a.set(11, 24);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.add(3, 1);
        String Q1 = mo13053Q1();
        if (Q1 != null) {
            C5027n c2 = this.f13555q.mo14191b().mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new HomeworkCommentFormViewModelImpl$addNewHomework$1<Object,Object>(this, mo13046K0(), a, Q1));
            Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository.getAct…   .take(1)\n            }");
            mo16413a(C4998b.m16842a(mo11505a(c2), (Function1) new HomeworkCommentFormViewModelImpl$addNewHomework$3(this), (Function0) null, (Function1) new HomeworkCommentFormViewModelImpl$addNewHomework$2(this), 2));
        }
    }
}
