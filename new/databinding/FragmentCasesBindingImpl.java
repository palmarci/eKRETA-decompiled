package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.cases.CasesViewModel;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;

public class FragmentCasesBindingImpl extends FragmentCasesBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.f F = null;
    public static final SparseIntArray G = new SparseIntArray();
    public final ConstraintLayout C;
    public final SwipeRefreshLayout.h D;
    public long E = -1;

    static {
        G.put(R.id.add_certificate_speedDialView, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentCasesBindingImpl(h.l.f r10, android.view.View r11) {
        /*
            r9 = this;
            androidx.databinding.ViewDataBinding$f r0 = F
            android.util.SparseIntArray r1 = G
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r10, (android.view.View) r11, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            com.leinardi.android.speeddial.SpeedDialView r6 = (com.leinardi.android.speeddial.SpeedDialView) r6
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r7 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r5 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = -1
            r9.E = r2
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.C = r10
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.C
            r0 = 0
            r10.setTag(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r10 = r9.z
            r10.setTag(r0)
            androidx.recyclerview.widget.RecyclerView r10 = r9.A
            r10.setTag(r0)
            r9.a((android.view.View) r11)
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r10 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r10.<init>(r9, r1)
            r9.D = r10
            r9.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentCasesBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        boolean z;
        synchronized (this) {
            j2 = this.E;
            this.E = 0;
        }
        CasesViewModel casesViewModel = this.B;
        int i2 = 0;
        if ((15 & j2) != 0) {
            z = ((j2 & 11) == 0 || casesViewModel == null) ? false : casesViewModel.d();
            int i3 = ((j2 & 13) > 0 ? 1 : ((j2 & 13) == 0 ? 0 : -1));
            if (i3 != 0) {
                boolean g2 = casesViewModel != null ? casesViewModel.g() : false;
                if (i3 != 0) {
                    j2 |= g2 ? 32 : 16;
                }
                if (!g2) {
                    i2 = 8;
                }
            }
        } else {
            z = false;
        }
        if ((8 & j2) != 0) {
            this.z.setOnRefreshListener(this.D);
        }
        if ((11 & j2) != 0) {
            this.z.setRefreshing(z);
        }
        if ((j2 & 13) != 0) {
            this.A.setVisibility(i2);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(CasesViewModel casesViewModel) {
        a(0, (i) casesViewModel);
        this.B = casesViewModel;
        synchronized (this) {
            this.E |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.E = 8;
        }
        b2();
    }

    public final void b(int i2) {
        CasesViewModel casesViewModel = this.B;
        if (casesViewModel != null) {
            casesViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((CasesViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.E |= 1;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.E |= 2;
            }
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            synchronized (this) {
                this.E |= 4;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        CasesViewModel casesViewModel = (CasesViewModel) obj;
        return e(i3);
    }
}
