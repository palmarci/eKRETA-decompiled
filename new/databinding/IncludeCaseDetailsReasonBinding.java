package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

public abstract class IncludeCaseDetailsReasonBinding extends ViewDataBinding {
    public final WebView A;
    public String B;
    public final TextView z;

    public IncludeCaseDetailsReasonBinding(Object obj, View view, int i2, TextView textView, WebView webView) {
        super(obj, view, i2);
        this.z = textView;
        this.A = webView;
    }

    public abstract void p(String str);
}
