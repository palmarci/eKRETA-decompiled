package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.reminder.Reminder;
import hu.ekreta.ellenorzo.rest.MobileApiV3;
import hu.ekreta.ellenorzo.rest.MobileApiV3Kt;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.CreateHomeworkPostDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkCommentPostDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.HomeworkStatePostDto;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NewlyCreatedHomeworkCommentDto;
import hu.ekreta.ellenorzo.util.datetime.DateTimeFactory;
import hu.ekreta.ellenorzo.util.datetime.UtilsKt;
import hu.ekreta.ellenorzo.util.firebase.FirebaseContainer;
import java.util.Calendar;
import java.util.List;
import k.b.b;
import k.b.n;
import k.b.z.a.a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u000eH\u0016J.\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010*\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkRepositoryImpl;", "Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "mobileApiV3", "Lhu/ekreta/ellenorzo/rest/MobileApiV3;", "dateTimeFactory", "Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;", "homeworkDao", "Lhu/ekreta/ellenorzo/homework/HomeworkDao;", "(Lhu/ekreta/ellenorzo/rest/MobileApiV3;Lhu/ekreta/ellenorzo/util/datetime/DateTimeFactory;Lhu/ekreta/ellenorzo/homework/HomeworkDao;)V", "deleteHomeworkComment", "Lio/reactivex/Completable;", "comment", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchHomeworkById", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/homework/Homework;", "id", "", "fetchHomeworkCommentListById", "", "fetchHomeworks", "fetchReminders", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "getHomeworks", "getReminders", "postHomeworkComment", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "teacherHomeworkId", "homeworkCommentText", "", "postHomeworkState", "teacherHomeworkUid", "isDone", "", "postNewHomework", "homeworkText", "deadline", "Ljava/util/Calendar;", "timeTableElementUid", "updateHomework", "homework", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkRepositoryImpl.kt */
public final class HomeworkRepositoryImpl implements HomeworkRepository {

    /* renamed from: a  reason: collision with root package name */
    public final MobileApiV3 f5680a;
    public final DateTimeFactory b;
    public final HomeworkDao c;

    public HomeworkRepositoryImpl(MobileApiV3 mobileApiV3, DateTimeFactory dateTimeFactory, HomeworkDao homeworkDao) {
        Intrinsics.checkParameterIsNotNull(mobileApiV3, "mobileApiV3");
        Intrinsics.checkParameterIsNotNull(dateTimeFactory, "dateTimeFactory");
        Intrinsics.checkParameterIsNotNull(homeworkDao, "homeworkDao");
        this.f5680a = mobileApiV3;
        this.b = dateTimeFactory;
        this.c = homeworkDao;
    }

    public n<Homework> a(Homework homework) {
        Intrinsics.checkParameterIsNotNull(homework, "homework");
        return this.c.a(homework);
    }

    public n<Homework> b(long j2, Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f5680a;
        n<R> g2 = mobileApiV3.getHomeworkById(profile.p() + "/ellenorzo/V3/Sajat/HaziFeladatok/" + j2, MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).g(new HomeworkRepositoryImpl$fetchHomeworkById$1(profile));
        Intrinsics.checkExpressionValueIsNotNull(g2, "mobileApiV3\n            …profile.id)\n            }");
        return g2;
    }

    public n<List<Homework>> g(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f5680a;
        String str = profile.p() + "/ellenorzo/V3/Sajat/HaziFeladatok";
        String asAuthorizationHeader = MobileApiV3Kt.getAsAuthorizationHeader(profile.d());
        Object clone = this.b.a().clone();
        if (clone != null) {
            Calendar calendar = (Calendar) clone;
            UtilsKt.a(calendar, 3, 3);
            n<List<Homework>> c2 = MobileApiV3.DefaultImpls.getHomeworks$default(mobileApiV3, str, asAuthorizationHeader, UtilsKt.c(calendar), (String) null, 8, (Object) null).g(new HomeworkRepositoryImpl$fetchHomeworks$1(profile)).c(new HomeworkRepositoryImpl$fetchHomeworks$2(this, profile));
            Intrinsics.checkExpressionValueIsNotNull(c2, "mobileApiV3\n            … homeworks)\n            }");
            return c2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
    }

    public n<List<Homework>> j(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        return this.c.a(profile.m());
    }

    public n<List<HomeworkComment>> a(long j2, Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f5680a;
        n<R> g2 = mobileApiV3.getHomeworkCommentList(profile.p() + "/ellenorzo/V3/Sajat/HaziFeladatok/" + j2 + "/Kommentek", MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).g(HomeworkRepositoryImpl$fetchHomeworkCommentListById$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(g2, "mobileApiV3\n            …orkComment)\n            }");
        return g2;
    }

    public n<List<Reminder>> b(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<List<Homework>> g2 = g(profile);
        if (g2 != null) {
            return g2;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }

    public n<NewlyCreatedHomeworkCommentDto> a(long j2, String str, Profile profile) {
        Intrinsics.checkParameterIsNotNull(str, "homeworkCommentText");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f5680a;
        n<NewlyCreatedHomeworkCommentDto> a2 = mobileApiV3.postHomeworkComment(profile.p() + "/ellenorzo/V3/Sajat/Orak/TanitasiOrak/HaziFeladatok/Kommentek", MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), new HomeworkCommentPostDto(j2, str)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "mobileApiV3\n            …dSchedulers.mainThread())");
        return a2;
    }

    public n<NewlyCreatedHomeworkCommentDto> a(String str, Calendar calendar, String str2, Profile profile) {
        Intrinsics.checkParameterIsNotNull(str, "homeworkText");
        Intrinsics.checkParameterIsNotNull(calendar, "deadline");
        Intrinsics.checkParameterIsNotNull(str2, "timeTableElementUid");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f5680a;
        n<NewlyCreatedHomeworkCommentDto> a2 = mobileApiV3.postNewHomework(profile.p() + "/ellenorzo/V3/Sajat/Orak/OrarendiOrak/HaziFeladatok/Kommentek", MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), new CreateHomeworkPostDto(str, calendar, str2)).a(a.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "mobileApiV3\n            …dSchedulers.mainThread())");
        return a2;
    }

    public b a(String str, boolean z, Profile profile) {
        Intrinsics.checkParameterIsNotNull(str, "teacherHomeworkUid");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f5680a;
        b e = mobileApiV3.postHomeworkState(profile.p() + "/ellenorzo/V3/Sajat/HaziFeladatok/Megoldva", MobileApiV3Kt.getAsAuthorizationHeader(profile.d()), CollectionsKt__CollectionsJVMKt.listOf(new HomeworkStatePostDto(str, z))).a(a.a()).e();
        Intrinsics.checkExpressionValueIsNotNull(e, "mobileApiV3\n            …        .ignoreElements()");
        return e;
    }

    public b a(HomeworkComment homeworkComment, Profile profile) {
        Intrinsics.checkParameterIsNotNull(homeworkComment, "comment");
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        MobileApiV3 mobileApiV3 = this.f5680a;
        b e = mobileApiV3.deleteHomeworkComment(profile.p() + "/ellenorzo/V3/Sajat/HaziFeladatok/Kommentek/" + homeworkComment.g(), MobileApiV3Kt.getAsAuthorizationHeader(profile.d())).e();
        Intrinsics.checkExpressionValueIsNotNull(e, "mobileApiV3\n            …        .ignoreElements()");
        return e;
    }

    public n<List<Reminder>> a(Profile profile) {
        Intrinsics.checkParameterIsNotNull(profile, FirebaseContainer.Param.PROFILE);
        n<List<Homework>> j2 = j(profile);
        if (j2 != null) {
            return j2;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<hu.ekreta.ellenorzo.reminder.Reminder>>");
    }
}
