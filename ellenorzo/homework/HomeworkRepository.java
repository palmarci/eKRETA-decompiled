package p289hu.ekreta.ellenorzo.homework;

import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.profile.Profile;
import p289hu.ekreta.ellenorzo.reminder.Reminder;
import p289hu.ekreta.ellenorzo.reminder.ReminderRepository;
import p289hu.ekreta.ellenorzo.rest.mobileapi.p291v3.NewlyCreatedHomeworkCommentDto;
import p289hu.ekreta.ellenorzo.util.Repository;
import p300k.p313b.C4667b;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH&J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b2\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b2\u0006\u0010\b\u001a\u00020\tH&J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH&J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001e\u001a\u00020\fH&¨\u0006\u001f"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "deleteHomeworkComment", "Lio/reactivex/Completable;", "comment", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchHomeworkById", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/homework/Homework;", "id", "", "fetchHomeworkCommentListById", "", "fetchHomeworks", "getHomeworks", "postHomeworkComment", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "teacherHomeworkId", "homeworkCommentText", "", "postNewHomework", "homeworkText", "deadline", "Ljava/util/Calendar;", "timeTableElementUid", "updateHomework", "homework", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkRepository */
/* compiled from: HomeworkRepository.kt */
public interface HomeworkRepository extends Repository<Reminder>, ReminderRepository {
    /* renamed from: a */
    C4667b mo13007a(HomeworkComment homeworkComment, Profile profile);

    /* renamed from: a */
    C5027n<List<HomeworkComment>> mo13008a(long j, Profile profile);

    /* renamed from: a */
    C5027n<NewlyCreatedHomeworkCommentDto> mo13009a(long j, String str, Profile profile);

    /* renamed from: a */
    C5027n<Homework> mo13010a(Homework homework);

    /* renamed from: a */
    C5027n<NewlyCreatedHomeworkCommentDto> mo13011a(String str, Calendar calendar, String str2, Profile profile);

    /* renamed from: b */
    C5027n<Homework> mo13012b(long j, Profile profile);

    /* renamed from: g */
    C5027n<List<Homework>> mo13013g(Profile profile);

    /* renamed from: j */
    C5027n<List<Homework>> mo13014j(Profile profile);
}
