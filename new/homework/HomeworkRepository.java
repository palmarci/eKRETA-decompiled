package hu.ekreta.ellenorzo.homework;

import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.profile.Profile;
import hu.ekreta.ellenorzo.reminder.Reminder;
import hu.ekreta.ellenorzo.reminder.ReminderRepository;
import hu.ekreta.ellenorzo.rest.mobileapi.v3.NewlyCreatedHomeworkCommentDto;
import hu.ekreta.ellenorzo.util.Repository;
import java.util.Calendar;
import java.util.List;
import k.b.b;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH&J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b2\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b2\u0006\u0010\b\u001a\u00020\tH&J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH&J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH&J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\"\u001a\u00020\fH&¨\u0006#"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkRepository;", "Lhu/ekreta/ellenorzo/util/Repository;", "Lhu/ekreta/ellenorzo/reminder/Reminder;", "Lhu/ekreta/ellenorzo/reminder/ReminderRepository;", "deleteHomeworkComment", "Lio/reactivex/Completable;", "comment", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "profile", "Lhu/ekreta/ellenorzo/profile/Profile;", "fetchHomeworkById", "Lio/reactivex/Observable;", "Lhu/ekreta/ellenorzo/homework/Homework;", "id", "", "fetchHomeworkCommentListById", "", "fetchHomeworks", "getHomeworks", "postHomeworkComment", "Lhu/ekreta/ellenorzo/rest/mobileapi/v3/NewlyCreatedHomeworkCommentDto;", "teacherHomeworkId", "homeworkCommentText", "", "postHomeworkState", "teacherHomeworkUid", "isDone", "", "postNewHomework", "homeworkText", "deadline", "Ljava/util/Calendar;", "timeTableElementUid", "updateHomework", "homework", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkRepository.kt */
public interface HomeworkRepository extends Repository<Reminder>, ReminderRepository {
    b a(HomeworkComment homeworkComment, Profile profile);

    b a(String str, boolean z, Profile profile);

    n<List<HomeworkComment>> a(long j2, Profile profile);

    n<NewlyCreatedHomeworkCommentDto> a(long j2, String str, Profile profile);

    n<Homework> a(Homework homework);

    n<NewlyCreatedHomeworkCommentDto> a(String str, Calendar calendar, String str2, Profile profile);

    n<Homework> b(long j2, Profile profile);

    n<List<Homework>> g(Profile profile);

    n<List<Homework>> j(Profile profile);
}
