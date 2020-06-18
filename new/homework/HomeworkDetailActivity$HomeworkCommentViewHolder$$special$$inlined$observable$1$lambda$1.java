package hu.ekreta.ellenorzo.homework;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b¸\u0006\t"}, d2 = {"hu/ekreta/ellenorzo/homework/HomeworkDetailActivity$HomeworkCommentViewHolder$model$2$1$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "app_guardianProdRelease", "hu/ekreta/ellenorzo/homework/HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$apply$lambda$1"}, k = 1, mv = {1, 1, 15})
/* compiled from: HomeworkDetailActivity.kt */
public final class HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1$lambda$1 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1 f5658a;

    public HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1$lambda$1(HomeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1 homeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1) {
        this.f5658a = homeworkDetailActivity$HomeworkCommentViewHolder$$special$$inlined$observable$1;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f5658a.c.D().requestLayout();
    }
}
