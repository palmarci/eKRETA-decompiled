package p289hu.ekreta.ellenorzo.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivitySubjectDetailBinding */
public abstract class ActivitySubjectDetailBinding extends ViewDataBinding {

    /* renamed from: A */
    public final SwipeRefreshLayout f12241A;

    /* renamed from: B */
    public final Toolbar f12242B;

    /* renamed from: C */
    public SubjectDetailViewModel f12243C;

    /* renamed from: z */
    public final TextView f12244z;

    public ActivitySubjectDetailBinding(Object obj, View view, int i, AppBarLayout appBarLayout, TextView textView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar) {
        super(obj, view, i);
        this.f12244z = textView;
        this.f12241A = swipeRefreshLayout;
        this.f12242B = toolbar;
    }

    /* renamed from: a */
    public abstract void mo12379a(SubjectDetailViewModel subjectDetailViewModel);
}
