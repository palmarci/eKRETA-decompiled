package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

public abstract class IncludeCaseDetailsPrintableBinding extends ViewDataBinding {
    public final TextView A;
    public String B;
    public View.OnClickListener C;
    public final TextView z;

    public IncludeCaseDetailsPrintableBinding(Object obj, View view, int i2, TextView textView, TextView textView2) {
        super(obj, view, i2);
        this.z = textView;
        this.A = textView2;
    }

    public abstract void a(View.OnClickListener onClickListener);

    public abstract void p(String str);
}
