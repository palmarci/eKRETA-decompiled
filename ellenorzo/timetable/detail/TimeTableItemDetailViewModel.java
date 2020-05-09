package p289hu.ekreta.ellenorzo.timetable.detail;

import kotlin.Metadata;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.timetable.TimeTableItem;
import p289hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020+H&J\b\u0010-\u001a\u00020+H&J\b\u0010.\u001a\u00020+H&R\u001a\u0010\u0003\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\r8gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8gX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\r8gX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00048gX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\r8gX¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u0004\u0018\u00010\"X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\r8gX¦\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011¨\u0006/"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/timetable/detail/TimeTableItemDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "addNewHomeworkButtonVisible", "", "getAddNewHomeworkButtonVisible", "()Z", "setAddNewHomeworkButtonVisible", "(Z)V", "announcedTestButtonVisible", "getAnnouncedTestButtonVisible", "setAnnouncedTestButtonVisible", "classroom", "", "getClassroom", "()Ljava/lang/String;", "setClassroom", "(Ljava/lang/String;)V", "date", "getDate", "setDate", "homeworkButtonVisible", "getHomeworkButtonVisible", "setHomeworkButtonVisible", "name", "getName", "setName", "progressVisible", "getProgressVisible", "setProgressVisible", "teacher", "getTeacher", "setTeacher", "timeTableItem", "Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "getTimeTableItem", "()Lhu/ekreta/ellenorzo/timetable/TimeTableItem;", "setTimeTableItem", "(Lhu/ekreta/ellenorzo/timetable/TimeTableItem;)V", "topic", "getTopic", "setTopic", "addHomework", "", "loadAnnouncedTest", "loadHomework", "refreshTimeTableItem", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModel */
/* compiled from: TimeTableItemDetailViewModel.kt */
public interface TimeTableItemDetailViewModel extends UiCommandSource, C3705i {
    /* renamed from: H1 */
    void mo16144H1();

    /* renamed from: J0 */
    boolean mo16145J0();

    /* renamed from: R0 */
    boolean mo16146R0();

    /* renamed from: V0 */
    void mo16147V0();

    /* renamed from: X0 */
    boolean mo16148X0();

    /* renamed from: a */
    void mo16149a(TimeTableItem timeTableItem);

    /* renamed from: d */
    boolean mo16150d();

    String getName();

    /* renamed from: h */
    String mo16152h();

    /* renamed from: m */
    String mo16153m();

    /* renamed from: r1 */
    String mo16154r1();

    /* renamed from: y1 */
    void mo16155y1();
}
