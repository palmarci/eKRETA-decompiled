package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.noticeboard.detail.NoticeBoardItemDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityNoticeboardItemDetailsBinding */
public abstract class ActivityNoticeboardItemDetailsBinding extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f12179A;

    /* renamed from: B */
    public NoticeBoardItemDetailViewModel f12180B;

    /* renamed from: z */
    public final TextView f12181z;

    public ActivityNoticeboardItemDetailsBinding(Object obj, View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, NestedScrollView nestedScrollView, TextView textView3, View view2, TextView textView4, Toolbar toolbar) {
        super(obj, view, i);
        this.f12181z = textView2;
        this.f12179A = textView4;
    }

    /* renamed from: a */
    public abstract void mo12368a(NoticeBoardItemDetailViewModel noticeBoardItemDetailViewModel);
}
