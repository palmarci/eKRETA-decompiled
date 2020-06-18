package hu.ekreta.ellenorzo.homework.comment;

import hu.ekreta.ellenorzo.authentication.AuthenticatedViewModel;
import hu.ekreta.ellenorzo.authentication.AuthenticationService;
import hu.ekreta.ellenorzo.homework.HomeworkRepository;
import hu.ekreta.ellenorzo.profile.ProfileRepository;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.systemexit.SystemExit;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingViewModel;
import hu.ekreta.ellenorzo.util.viewmodel.ExecuteOnceUiCommandSource;
import hu.ekreta.ellenorzo.util.viewmodel.ObservableImpl;
import java.util.Calendar;
import k.b.f0.b;
import k.b.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J \u0010,\u001a\u00020-2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0013H\u0002J\b\u00101\u001a\u00020-H\u0016R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u001b8V@VX\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018¨\u00062"}, d2 = {"Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModelImpl;", "Lhu/ekreta/ellenorzo/authentication/AuthenticatedViewModel;", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkCommentFormViewModel;", "observable", "Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;", "uiCommandSource", "Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;", "systemExit", "Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;", "authenticationService", "Lhu/ekreta/ellenorzo/authentication/AuthenticationService;", "profileRepository", "Lhu/ekreta/ellenorzo/profile/ProfileRepository;", "repository", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "(Lhu/ekreta/ellenorzo/util/viewmodel/ObservableImpl;Lhu/ekreta/ellenorzo/util/viewmodel/ExecuteOnceUiCommandSource;Lhu/ekreta/ellenorzo/util/systemexit/SystemExit;Lhu/ekreta/ellenorzo/authentication/AuthenticationService;Lhu/ekreta/ellenorzo/profile/ProfileRepository;Lhu/ekreta/ellenorzo/homework/HomeworkRepository;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;)V", "<set-?>", "", "commentText", "getCommentText", "()Ljava/lang/String;", "setCommentText", "(Ljava/lang/String;)V", "commentText$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "homeworkCommentEnabled", "getHomeworkCommentEnabled", "()Z", "setHomeworkCommentEnabled", "(Z)V", "homeworkCommentEnabled$delegate", "homeworkId", "", "getHomeworkId", "()Ljava/lang/Long;", "setHomeworkId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "timetableElementUid", "getTimetableElementUid", "setTimetableElementUid", "addNewHomework", "", "deadline", "Ljava/util/Calendar;", "timeTableElementUid", "commentHomework", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkCommentFormViewModelImpl.kt */
public final class HomeworkCommentFormViewModelImpl extends AuthenticatedViewModel implements HomeworkCommentFormViewModel {
    public static final /* synthetic */ KProperty[] u;

    /* renamed from: n  reason: collision with root package name */
    public Long f5690n;

    /* renamed from: o  reason: collision with root package name */
    public String f5691o;

    /* renamed from: p  reason: collision with root package name */
    public final ReadWriteProperty f5692p = DataBindingViewModel.boundString$default(this, this, 39, (String) null, new HomeworkCommentFormViewModelImpl$commentText$2(this), 2, (Object) null);

    /* renamed from: q  reason: collision with root package name */
    public final ReadWriteProperty f5693q = DataBindingViewModel.boundBoolean$default(this, this, 7, false, (Function1) null, 6, (Object) null);
    public final ProfileRepository r;
    public final HomeworkRepository s;
    public final DateTimeFactory t;

    static {
        Class<HomeworkCommentFormViewModelImpl> cls = HomeworkCommentFormViewModelImpl.class;
        u = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "commentText", "getCommentText()Ljava/lang/String;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "homeworkCommentEnabled", "getHomeworkCommentEnabled()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeworkCommentFormViewModelImpl(ObservableImpl observableImpl, ExecuteOnceUiCommandSource executeOnceUiCommandSource, SystemExit systemExit, AuthenticationService authenticationService, ProfileRepository profileRepository, HomeworkRepository homeworkRepository, DateTimeFactory dateTimeFactory) {
        super(observableImpl, executeOnceUiCommandSource, systemExit, authenticationService);
        Intrinsics.checkParameterIsNotNull(observableImpl, "observable");
        Intrinsics.checkParameterIsNotNull(executeOnceUiCommandSource, "uiCommandSource");
        Intrinsics.checkParameterIsNotNull(systemExit, "systemExit");
        Intrinsics.checkParameterIsNotNull(authenticationService, "authenticationService");
        Intrinsics.checkParameterIsNotNull(profileRepository, "profileRepository");
        Intrinsics.checkParameterIsNotNull(homeworkRepository, "repository");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        this.r = profileRepository;
        this.s = homeworkRepository;
        this.t = dateTimeFactory;
    }

    public String M0() {
        return (String) this.f5692p.getValue(this, u[0]);
    }

    public boolean Y0() {
        return ((Boolean) this.f5693q.getValue(this, u[1])).booleanValue();
    }

    public Long Z1() {
        return this.f5690n;
    }

    public void a(Long l2) {
        this.f5690n = l2;
    }

    public String a2() {
        return this.f5691o;
    }

    public void c(boolean z) {
        this.f5693q.setValue(this, u[1], Boolean.valueOf(z));
    }

    public void h(String str) {
        this.f5691o = str;
    }

    public void j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f5692p.setValue(this, u[0], str);
    }

    public void o0() {
        c(false);
        if (Z1() != null) {
            n<R> c = this.r.b().c(new HomeworkCommentFormViewModelImpl$commentHomework$1(this));
            Intrinsics.checkExpressionValueIsNotNull(c, "profileRepository.getAct…rized()\n                }");
            a(b.a(c, new HomeworkCommentFormViewModelImpl$commentHomework$3(this), (Function0) null, new HomeworkCommentFormViewModelImpl$commentHomework$2(this), 2));
            return;
        }
        Calendar a2 = this.t.a();
        a2.set(11, 24);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.add(3, 1);
        String a22 = a2();
        if (a22 != null) {
            n<R> c2 = this.r.b().c(new HomeworkCommentFormViewModelImpl$addNewHomework$1(this, M0(), a2, a22));
            Intrinsics.checkExpressionValueIsNotNull(c2, "profileRepository.getAct…   .take(1)\n            }");
            a(b.a(a(c2), new HomeworkCommentFormViewModelImpl$addNewHomework$3(this), (Function0) null, new HomeworkCommentFormViewModelImpl$addNewHomework$2(this), 2));
        }
    }
}
