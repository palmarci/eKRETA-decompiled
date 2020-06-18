package hu.ekreta.ellenorzo.omission.detail;

import h.l.i;
import hu.ekreta.ellenorzo.omission.Omission;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"Lhu/ekreta/ellenorzo/omission/detail/OmissionDetailViewModel;", "Landroidx/databinding/Observable;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "creatingTime", "", "getCreatingTime", "()Ljava/lang/String;", "group", "getGroup", "justificationStateName", "getJustificationStateName", "lessonTimeFormatted", "getLessonTimeFormatted", "modeName", "getModeName", "omissionParameter", "Lhu/ekreta/ellenorzo/omission/Omission;", "getOmissionParameter", "()Lhu/ekreta/ellenorzo/omission/Omission;", "setOmissionParameter", "(Lhu/ekreta/ellenorzo/omission/Omission;)V", "subject", "getSubject", "teacher", "getTeacher", "typeName", "getTypeName", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: OmissionDetailViewModel.kt */
public interface OmissionDetailViewModel extends i, UiCommandSource {
    String O0();

    void a(Omission omission);

    String g1();

    String getTypeName();

    String j();

    String m();

    String p();

    String w1();

    String y();
}
