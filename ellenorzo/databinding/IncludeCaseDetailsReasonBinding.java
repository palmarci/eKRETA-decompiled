package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsReasonBinding */
public abstract class IncludeCaseDetailsReasonBinding extends ViewDataBinding {

    /* renamed from: A */
    public final WebView f12474A;

    /* renamed from: B */
    public String f12475B;

    /* renamed from: z */
    public final TextView f12476z;

    public IncludeCaseDetailsReasonBinding(Object obj, View view, int i, TextView textView, WebView webView) {
        super(obj, view, i);
        this.f12476z = textView;
        this.f12474A = webView;
    }

    /* renamed from: q */
    public abstract void mo12436q(String str);
}
