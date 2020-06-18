package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;

public abstract class IncludeCaseDecisionAdjudicationBinding extends ViewDataBinding {
    public String A;
    public final WebView z;

    public IncludeCaseDecisionAdjudicationBinding(Object obj, View view, int i2, WebView webView) {
        super(obj, view, i2);
        this.z = webView;
    }

    public abstract void p(String str);
}
