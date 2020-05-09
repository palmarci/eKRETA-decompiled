package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import p388ru.rambler.libs.swipe_layout.SwipeLayout;

/* renamed from: hu.ekreta.ellenorzo.databinding.MessageItemBinding */
public abstract class MessageItemBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeLayout f12530A;

    /* renamed from: z */
    public final ConstraintLayout f12531z;

    public MessageItemBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout, LinearLayout linearLayout, SwipeLayout swipeLayout, ImageView imageView3, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.f12531z = constraintLayout;
        this.f12530A = swipeLayout;
    }
}
