package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

public abstract class IncludeCaseDecisionDateBinding extends ViewDataBinding {
    public String A;
    public final TextView z;

    public IncludeCaseDecisionDateBinding(Object obj, View view, int i2, TextView textView) {
        super(obj, view, i2);
        this.z = textView;
    }

    public abstract void p(String str);
}
