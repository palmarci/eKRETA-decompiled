package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import com.google.android.material.appbar.AppBarLayout;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener.Listener;
import p289hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivitySubjectDetailBindingImpl */
public class ActivitySubjectDetailBindingImpl extends ActivitySubjectDetailBinding implements Listener {

    /* renamed from: G */
    public static final C2867f f12245G = null;

    /* renamed from: H */
    public static final SparseIntArray f12246H = new SparseIntArray();

    /* renamed from: D */
    public final CoordinatorLayout f12247D;

    /* renamed from: E */
    public final C2948h f12248E;

    /* renamed from: F */
    public long f12249F = -1;

    static {
        f12246H.put(C4014R.C4016id.app_bar_layout, 4);
        f12246H.put(C4014R.C4016id.evaluationRecyclerView, 5);
    }

    public ActivitySubjectDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 6, f12245G, f12246H);
        super(fVar, view, 1, (AppBarLayout) a[4], (TextView) a[3], (RecyclerView) a[5], (SwipeRefreshLayout) a[2], (Toolbar) a[1]);
        this.f12244z.setTag(null);
        this.f12247D = (CoordinatorLayout) a[0];
        this.f12247D.setTag(null);
        this.f12241A.setTag(null);
        this.f12242B.setTag(null);
        mo6098a(view);
        this.f12248E = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.f12249F;
            this.f12249F = 0;
        }
        SubjectDetailViewModel subjectDetailViewModel = this.f12243C;
        String str = null;
        boolean z2 = false;
        if ((31 & j) != 0) {
            z = ((j & 21) == 0 || subjectDetailViewModel == null) ? false : subjectDetailViewModel.mo15888d();
            if (!((j & 25) == 0 || subjectDetailViewModel == null)) {
                z2 = subjectDetailViewModel.mo15890f();
            }
            if (!((j & 19) == 0 || subjectDetailViewModel == null)) {
                str = subjectDetailViewModel.getTitle();
            }
        } else {
            z = false;
        }
        if ((25 & j) != 0) {
            this.f12244z.setVisibility(BindingConverters.m14795a(z2));
        }
        if ((16 & j) != 0) {
            this.f12241A.setOnRefreshListener(this.f12248E);
        }
        if ((21 & j) != 0) {
            this.f12241A.setRefreshing(z);
        }
        if ((j & 19) != 0) {
            this.f12242B.setTitle((CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12249F != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12249F = 16;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12379a(SubjectDetailViewModel subjectDetailViewModel) {
        mo6103a(0, (C3705i) subjectDetailViewModel);
        this.f12243C = subjectDetailViewModel;
        synchronized (this) {
            this.f12249F |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12379a((SubjectDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12380e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12249F |= 1;
            }
            return true;
        } else if (i == 95) {
            synchronized (this) {
                this.f12249F |= 2;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12249F |= 4;
            }
            return true;
        } else if (i != 65) {
            return false;
        } else {
            synchronized (this) {
                this.f12249F |= 8;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        SubjectDetailViewModel subjectDetailViewModel = this.f12243C;
        if (subjectDetailViewModel != null) {
            subjectDetailViewModel.mo15889e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        SubjectDetailViewModel subjectDetailViewModel = (SubjectDetailViewModel) obj;
        return mo12380e(i2);
    }
}
