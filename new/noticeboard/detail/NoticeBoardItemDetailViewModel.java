package hu.ekreta.ellenorzo.noticeboard.detail;

import h.l.i;
import hu.ekreta.ellenorzo.noticeboard.NoticeBoardItem;
import hu.ekreta.ellenorzo.util.viewmodel.UiCommandSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lhu/ekreta/ellenorzo/noticeboard/detail/NoticeBoardItemDetailViewModel;", "Lhu/ekreta/ellenorzo/util/viewmodel/UiCommandSource;", "Landroidx/databinding/Observable;", "content", "", "getContent", "()Ljava/lang/String;", "noticeBoardItem", "Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "getNoticeBoardItem", "()Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;", "setNoticeBoardItem", "(Lhu/ekreta/ellenorzo/noticeboard/NoticeBoardItem;)V", "title", "getTitle", "app_guardianProdRelease"}, k = 1, mv = {1, 1, 15})
/* compiled from: NoticeBoardItemDetailViewModel.kt */
public interface NoticeBoardItemDetailViewModel extends UiCommandSource, i {
    void a(NoticeBoardItem noticeBoardItem);

    String getTitle();

    String x0();
}
