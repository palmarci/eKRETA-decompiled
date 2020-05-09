package p289hu.ekreta.ellenorzo.homework;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.homework.comment.HomeworkComment;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import p300k.p313b.C5027n;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#2\u0006\u0010$\u001a\u00020\u0012H&J\b\u0010%\u001a\u00020&H&J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0012H&J\b\u0010)\u001a\u00020&H&J\b\u0010*\u001a\u00020&H&R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\n¨\u0006+"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/homework/HomeworkDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "commentButtonVisibility", "", "getCommentButtonVisibility", "()Z", "createDate", "", "getCreateDate", "()Ljava/lang/String;", "deadline", "getDeadline", "group", "getGroup", "homeworkComments", "Landroidx/lifecycle/LiveData;", "", "Lhu/ekreta/ellenorzo/homework/comment/HomeworkComment;", "getHomeworkComments", "()Landroidx/lifecycle/LiveData;", "isStudentHomeworkEnabled", "progressVisible", "getProgressVisible", "subject", "getSubject", "teacherHomework", "Lhu/ekreta/ellenorzo/homework/Homework;", "getTeacherHomework", "()Lhu/ekreta/ellenorzo/homework/Homework;", "setTeacherHomework", "(Lhu/ekreta/ellenorzo/homework/Homework;)V", "text", "getText", "canDeleteComment", "Lio/reactivex/Observable;", "homeworkComment", "commentHomework", "", "deleteHomeworkComment", "comment", "onRefresh", "refreshList", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.homework.HomeworkDetailViewModel */
/* compiled from: HomeworkDetailViewModel.kt */
public interface HomeworkDetailViewModel extends UiCommandSource, C3705i {
    /* renamed from: F1 */
    String mo12939F1();

    /* renamed from: I0 */
    String mo12940I0();

    /* renamed from: N0 */
    boolean mo12941N0();

    /* renamed from: Q0 */
    String mo12942Q0();

    /* renamed from: a */
    void mo12943a(Homework homework);

    /* renamed from: a */
    void mo12944a(HomeworkComment homeworkComment);

    /* renamed from: b */
    C5027n<Boolean> mo12945b(HomeworkComment homeworkComment);

    /* renamed from: d */
    boolean mo12946d();

    /* renamed from: e */
    void mo12947e();

    LiveData<List<HomeworkComment>> getHomeworkComments();

    /* renamed from: j */
    String mo12949j();

    /* renamed from: l1 */
    void mo12950l1();

    /* renamed from: o0 */
    void mo12951o0();

    /* renamed from: p */
    String mo12952p();

    /* renamed from: x1 */
    boolean mo12953x1();
}
