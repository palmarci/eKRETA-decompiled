package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

public abstract class IncludeCaseDetailsAdministratornameBinding extends ViewDataBinding {
    public final TextView A;
    public String B;
    public final TextView z;

    public IncludeCaseDetailsAdministratornameBinding(Object obj, View view, int i2, TextView textView, TextView textView2) {
        super(obj, view, i2);
        this.z = textView;
        this.A = textView2;
    }

    public abstract void p(String str);
}
