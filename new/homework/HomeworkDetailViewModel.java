package hu.ekreta.ellenorzo.homework;

import androidx.lifecycle.LiveData;
import h.l.i;
import hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import java.util.List;
import k.b.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040'2\u0006\u0010(\u001a\u00020\u0012H&J\b\u0010)\u001a\u00020*H&J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0012H&J\b\u0010-\u001a\u00020*H&J\b\u0010.\u001a\u00020*H&J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u0004H&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\n¨\u00061"}, d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "commentButtonVisibility", "", "getCommentButtonVisibility", "()Z", "createDate", "", "getCreateDate", "()Ljava/lang/String;", "deadline", "getDeadline", "group", "getGroup", "homeworkComments", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "getHomeworkComments", "()Landroidx/lifecycle/LiveData;", "homeworkDoneText", "getHomeworkDoneText", "isHomeworkDone", "isHomeworkDoneEditable", "isStudentHomeworkEnabled", "progressVisible", "getProgressVisible", "subject", "getSubject", "teacherHomework", "Lhu/ekreta/ellenorzo/homework/Homework;", "getTeacherHomework", "()Lhu/ekreta/ellenorzo/homework/Homework;", "setTeacherHomework", "(Lhu/ekreta/ellenorzo/homework/Homework;)V", "text", "getText", "canDeleteComment", "Lio/reactivex/Observable;", "homeworkComment", "commentHomework", "", "deleteHomeworkComment", "comment", "onRefresh", "refreshList", "saveHomeworkState", "state", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkDetailViewModel.kt */
public interface HomeworkDetailViewModel extends UiCommandSource, i {
    boolean A0();

    boolean F1();

    String J0();

    boolean K0();

    String O1();

    boolean Q0();

    String T0();

    void a(Homework homework);

    void a(HomeworkComment homeworkComment);

    n<Boolean> b(HomeworkComment homeworkComment);

    void b(boolean z);

    boolean d();

    void e();

    LiveData<List<HomeworkComment>> getHomeworkComments();

    String i1();

    String j();

    void o0();

    String p();

    void r1();
}
