package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import hu.ekreta.ellenorzo.subject.averages.AveragesViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class FragmentAveragesBindingImpl extends FragmentAveragesBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.f G = null;
    public static final SparseIntArray H = null;
    public final ConstraintLayout D;
    public final SwipeRefreshLayout.h E;
    public long F = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentAveragesBindingImpl(h.l.f r11, android.view.View r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = G
            android.util.SparseIntArray r1 = H
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r8 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r8
            r2 = 3
            r2 = r0[r2]
            r9 = r2
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r6 = 1
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.F = r2
            android.widget.TextView r11 = r10.z
            r2 = 0
            r11.setTag(r2)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.D = r11
            androidx.constraintlayout.widget.ConstraintLayout r11 = r10.D
            r11.setTag(r2)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = r10.A
            r11.setTag(r2)
            androidx.recyclerview.widget.RecyclerView r11 = r10.B
            r11.setTag(r2)
            r10.a((android.view.View) r12)
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r11.<init>(r10, r1)
            r10.E = r11
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentAveragesBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        boolean z;
        boolean z2;
        synchronized (this) {
            j2 = this.F;
            this.F = 0;
        }
        AveragesViewModel averagesViewModel = this.C;
        boolean z3 = false;
        if ((31 & j2) != 0) {
            z2 = ((j2 & 21) == 0 || averagesViewModel == null) ? false : averagesViewModel.d();
            z = ((j2 & 25) == 0 || averagesViewModel == null) ? false : averagesViewModel.g();
            if (!((j2 & 19) == 0 || averagesViewModel == null)) {
                z3 = averagesViewModel.f();
            }
        } else {
            z2 = false;
            z = false;
        }
        if ((19 & j2) != 0) {
            this.z.setVisibility(BindingConverters.a(z3));
        }
        if ((16 & j2) != 0) {
            this.A.setOnRefreshListener(this.E);
        }
        if ((21 & j2) != 0) {
            this.A.setRefreshing(z2);
        }
        if ((j2 & 25) != 0) {
            this.B.setVisibility(BindingConverters.a(z));
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(AveragesViewModel averagesViewModel) {
        a(0, (i) averagesViewModel);
        this.C = averagesViewModel;
        synchronized (this) {
            this.F |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.F = 16;
        }
        b2();
    }

    public final void b(int i2) {
        AveragesViewModel averagesViewModel = this.C;
        if (averagesViewModel != null) {
            averagesViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((AveragesViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        } else if (i2 == 65) {
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.F |= 4;
            }
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            synchronized (this) {
                this.F |= 8;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        AveragesViewModel averagesViewModel = (AveragesViewModel) obj;
        return e(i3);
    }
}
