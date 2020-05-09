package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener.Listener;
import p289hu.ekreta.ellenorzo.subject.averages.AveragesViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentAveragesBindingImpl */
public class FragmentAveragesBindingImpl extends FragmentAveragesBinding implements Listener {

    /* renamed from: G */
    public static final C2867f f12269G = null;

    /* renamed from: H */
    public static final SparseIntArray f12270H = null;

    /* renamed from: D */
    public final ConstraintLayout f12271D;

    /* renamed from: E */
    public final C2948h f12272E;

    /* renamed from: F */
    public long f12273F = -1;

    public FragmentAveragesBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 4, f12269G, f12270H);
        super(fVar, view, 1, (TextView) a[1], (SwipeRefreshLayout) a[2], (RecyclerView) a[3]);
        this.f12268z.setTag(null);
        this.f12271D = (ConstraintLayout) a[0];
        this.f12271D.setTag(null);
        this.f12265A.setTag(null);
        this.f12266B.setTag(null);
        mo6098a(view);
        this.f12272E = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.f12273F;
            this.f12273F = 0;
        }
        AveragesViewModel averagesViewModel = this.f12267C;
        boolean z3 = false;
        if ((31 & j) != 0) {
            z2 = ((j & 21) == 0 || averagesViewModel == null) ? false : averagesViewModel.mo11494d();
            z = ((j & 25) == 0 || averagesViewModel == null) ? false : averagesViewModel.mo11497g();
            if (!((j & 19) == 0 || averagesViewModel == null)) {
                z3 = averagesViewModel.mo11496f();
            }
        } else {
            z2 = false;
            z = false;
        }
        if ((19 & j) != 0) {
            this.f12268z.setVisibility(BindingConverters.m14795a(z3));
        }
        if ((16 & j) != 0) {
            this.f12265A.setOnRefreshListener(this.f12272E);
        }
        if ((21 & j) != 0) {
            this.f12265A.setRefreshing(z2);
        }
        if ((j & 25) != 0) {
            this.f12266B.setVisibility(BindingConverters.m14795a(z));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12273F != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12273F = 16;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12383a(AveragesViewModel averagesViewModel) {
        mo6103a(0, (C3705i) averagesViewModel);
        this.f12267C = averagesViewModel;
        synchronized (this) {
            this.f12273F |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12383a((AveragesViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12384e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12273F |= 1;
            }
            return true;
        } else if (i == 65) {
            synchronized (this) {
                this.f12273F |= 2;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12273F |= 4;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            synchronized (this) {
                this.f12273F |= 8;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        AveragesViewModel averagesViewModel = this.f12267C;
        if (averagesViewModel != null) {
            averagesViewModel.mo11495e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        AveragesViewModel averagesViewModel = (AveragesViewModel) obj;
        return mo12384e(i2);
    }
}
