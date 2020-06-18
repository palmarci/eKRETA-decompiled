package hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;

public abstract class ActivitySubjectDetailBinding extends ViewDataBinding {
    public final SwipeRefreshLayout A;
    public final Toolbar B;
    public SubjectDetailViewModel C;
    public final TextView z;

    public ActivitySubjectDetailBinding(Object obj, View view, int i2, AppBarLayout appBarLayout, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, i2);
        this.z = textView;
        this.A = swipeRefreshLayout;
        this.B = toolbar;
    }

    public abstract void a(SubjectDetailViewModel subjectDetailViewModel);
}
