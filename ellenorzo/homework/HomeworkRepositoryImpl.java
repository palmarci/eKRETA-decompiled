package p289hu.ekreta.ellenorzo.homework;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.reminder.Reminder;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3.DefaultImpls;
import p289hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.CreateHomeworkPostDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.HomeworkCommentPostDto;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto;
import p289hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import p289hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import p289hu.ekreta.ellenorzo.util.firebase.FirebaseContainer.Param;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;
import p300k.p313b.C5030q;
import p300k.p313b.p315b0.C4675h;
import p300k.p313b.p338z.p339a.C5041a;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J.\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010&\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkRepositoryImpl;", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "homeworkDao", "Lhu/ekreta/ellenorzo/homework/HomeworkDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Lhu/ekreta/ellenorzo/homework/HomeworkDao;)V", "deleteHomeworkComment", "Lio/reactivex/Completable;", "comment", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchHomeworkById", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/homework/Homework;", "id", "", "fetchHomeworkCommentListById", "", "fetchHomeworks", "fetchReminders", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "getHomeworks", "getReminders", "postHomeworkComment", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "teacherHomeworkId", "homeworkCommentText", "", "postNewHomework", "homeworkText", "deadline", "Ljava/util/Calendar;", "timeTableElementUid", "updateHomework", "homework", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkRepositoryImpl */
/* compiled from: HomeworkRepositoryImpl.kt */
public final class HomeworkRepositoryImpl implements HomeworkRepository {

    /* renamed from: a */
    public final MobileApiV3 f13508a;

    /* renamed from: b */
    public final DateTimeFactory f13509b;

    /* renamed from: c */
    public final HomeworkDao f13510c;

    public HomeworkRepositoryImpl(MobileApiV3 mobileApiV3, DateTimeFactory dateTimeFactory, HomeworkDao homeworkDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        Intrinsics.checkParameterIsNotNull(homeworkDao, "homeworkDao");
        this.f13508a = mobileApiV3;
        this.f13509b = dateTimeFactory;
        this.f13510c = homeworkDao;
    }

    /* renamed from: a */
    public C5027n<Homework> mo13010a(Homework homework) {
        Intrinsics.checkParameterIsNotNull(homework, "homework");
        return this.f13510c.mo16319a(homework);
    }

    /* renamed from: b */
    public C5027n<Homework> mo13012b(long j, Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f13508a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/HaziFeladatok/");
        sb.append(j);
        C5027n<Homework> g = mobileApiV3.getHomeworkById(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(new HomeworkRepositoryImpl$fetchHomeworkById$1(profile));
        Intrinsics.checkExpressionValueIsNotNull(g, "mobileApiV3\n            …profile.id)\n            }");
        return g;
    }

    /* renamed from: g */
    public C5027n<List<Homework>> mo13013g(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f13508a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/HaziFeladatok");
        C5027n<List<Homework>> c = DefaultImpls.getHomeworks$default(mobileApiV3, sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), UtilsKt.m14839c(this.f13509b.mo16327a()), null, 8, null).mo17246g(new HomeworkRepositoryImpl$fetchHomeworks$1(profile)).mo17234c((C4675h<? super T, ? extends C5030q<? extends R>>) new HomeworkRepositoryImpl$fetchHomeworks$2<Object,Object>(this, profile));
        Intrinsics.checkExpressionValueIsNotNull(c, "mobileApiV3\n            … homeworks)\n            }");
        return c;
    }

    /* renamed from: j */
    public C5027n<List<Homework>> mo13014j(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        return this.f13510c.mo16312a(profile.mo14054m());
    }

    /* renamed from: a */
    public C5027n<List<HomeworkComment>> mo13008a(long j, Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f13508a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/HaziFeladatok/");
        sb.append(j);
        sb.append("/Kommentek");
        C5027n<List<HomeworkComment>> g = mobileApiV3.getHomeworkCommentList(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17246g(HomeworkRepositoryImpl$fetchHomeworkCommentListById$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g, "mobileApiV3\n            …orkComment)\n            }");
        return g;
    }

    /* renamed from: b */
    public C5027n<List<Reminder>> mo11408b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<Reminder>> g = mo13013g(profile);
        if (g != null) {
            return g;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }

    /* renamed from: a */
    public C5027n<NewlyCreatedHomeworkCommentDto> mo13009a(long j, String str, Profile profile) {
        Intrinsics.checkParameterIsNotNull(str, "homeworkCommentText");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f13508a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Orak/TanitasiOrak/HaziFeladatok/Kommentek");
        C5027n<NewlyCreatedHomeworkCommentDto> a = mobileApiV3.postHomeworkComment(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), new HomeworkCommentPostDto(j, str)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "mobileApiV3\n            …dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: a */
    public C5027n<NewlyCreatedHomeworkCommentDto> mo13011a(String str, Calendar calendar, String str2, Profile profile) {
        Intrinsics.checkParameterIsNotNull(str, "homeworkText");
        Intrinsics.checkParameterIsNotNull(calendar, "deadline");
        Intrinsics.checkParameterIsNotNull(str2, "timeTableElementUid");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f13508a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/Orak/OrarendiOrak/HaziFeladatok/Kommentek");
        C5027n<NewlyCreatedHomeworkCommentDto> a = mobileApiV3.postNewHomework(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d()), new CreateHomeworkPostDto(str, calendar, str2)).mo17214a(C5041a.m16999a());
        Intrinsics.checkExpressionValueIsNotNull(a, "mobileApiV3\n            …dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: a */
    public C4667b mo13007a(HomeworkComment homeworkComment, Profile profile) {
        Intrinsics.checkParameterIsNotNull(homeworkComment, "comment");
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f13508a;
        StringBuilder sb = new StringBuilder();
        sb.append(profile.mo14057p());
        sb.append("/ellenorzo/V3/Sajat/HaziFeladatok/Kommentek/");
        sb.append(homeworkComment.mo13040g());
        C4667b e = mobileApiV3.deleteHomeworkComment(sb.toString(), MobileApiV3Kt.getAsAuthorizationHeader(profile.mo14042d())).mo17241e();
        Intrinsics.checkExpressionValueIsNotNull(e, "mobileApiV3\n            …        .ignoreElements()");
        return e;
    }

    /* renamed from: a */
    public C5027n<List<Reminder>> mo11406a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, Param.PROFILE);
        C5027n<List<Reminder>> j = mo13014j(profile);
        if (j != null) {
            return j;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }
}
