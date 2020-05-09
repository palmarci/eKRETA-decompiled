package p289hu.ekreta.ellenorzo.util.binding;

import android.util.Base64;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/binding/WebViewBindings;", "", "()V", "Companion", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
/* renamed from: hu.ekreta.ellenorzo.util.binding.WebViewBindings */
/* compiled from: WebViewBindings.kt */
public final class WebViewBindings {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo17461bv = {1, 0, 3}, mo17462d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, mo17463d2 = {"Lhu/ekreta/ellenorzo/util/binding/WebViewBindings$Companion;", "", "()V", "setHTML", "", "Landroid/webkit/WebView;", "html", "", "app_studentProdRelease"}, mo17464k = 1, mo17465mv = {1, 1, 15})
    /* renamed from: hu.ekreta.ellenorzo.util.binding.WebViewBindings$Companion */
    /* compiled from: WebViewBindings.kt */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo16308a(WebView webView, String str) {
            Intrinsics.checkParameterIsNotNull(webView, "$this$setHTML");
            if (str != null) {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                webView.loadData(Base64.encodeToString(bytes, 1), "text/html", "base64");
                webView.setWebViewClient(new WebViewBindings$Companion$setHTML$$inlined$let$lambda$1(webView, webView));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
