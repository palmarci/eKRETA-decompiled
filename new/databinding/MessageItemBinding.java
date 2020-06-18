package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import ru.rambler.libs.swipe_layout.SwipeLayout;

public abstract class MessageItemBinding extends ViewDataBinding {
    public final SwipeLayout A;
    public final ConstraintLayout z;

    public MessageItemBinding(Object obj, View view, int i2, ImageView imageView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout, LinearLayout linearLayout, SwipeLayout swipeLayout, ImageView imageView3, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i2);
        this.z = constraintLayout;
        this.A = swipeLayout;
    }
}
