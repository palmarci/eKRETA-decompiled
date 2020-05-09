package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;

/* renamed from: hu.ekreta.ellenorzo.databinding.DashboardItemBinding */
public abstract class DashboardItemBinding extends ViewDataBinding {

    /* renamed from: A */
    public final ConstraintLayout f12254A;

    /* renamed from: z */
    public final SwipeLayout f12255z;

    public DashboardItemBinding(Object obj, View view, int i, SwipeLayout swipeLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.f12255z = swipeLayout;
        this.f12254A = constraintLayout;
    }
}
