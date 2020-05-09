package p289hu.ekreta.ellenorzo.util.binding;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n¸\u0006\u0000"}, mo17463d2 = {"hu/ekreta/ellenorzo/util/binding/WebViewBindings$Companion$setHTML$1$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "shouldOverrideUrlLoading", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.binding.WebViewBindings$Companion$setHTML$$inlined$let$lambda$1 */
/* compiled from: WebViewBindings.kt */
public final class WebViewBindings$Companion$setHTML$$inlined$let$lambda$1 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ WebView f15388a;

    public WebViewBindings$Companion$setHTML$$inlined$let$lambda$1(WebView webView, WebView webView2) {
        this.f15388a = webView2;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f15388a.getParent().requestLayout();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Intrinsics.checkParameterIsNotNull(webView, "view");
        Intrinsics.checkParameterIsNotNull(str, "url");
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
