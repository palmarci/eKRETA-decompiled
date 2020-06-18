package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModel;

public abstract class ActivityNoticeboardItemDetailsBinding extends ViewDataBinding {
    public final TextView A;
    public NoticeBoardItemDetailViewModel B;
    public final TextView z;

    public ActivityNoticeboardItemDetailsBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, NestedScrollView nestedScrollView, TextView textView3, View view2, TextView textView4, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = textView2;
        this.A = textView4;
    }

    public abstract void a(NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel);
}
