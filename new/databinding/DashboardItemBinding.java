package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import ru.rambler.libs.swipe_layout.SwipeLayout;

public abstract class DashboardItemBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public final SwipeLayout z;

    public DashboardItemBinding(Object obj, View view, int i2, SwipeLayout swipeLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i2);
        this.z = swipeLayout;
        this.A = constraintLayout;
    }
}
