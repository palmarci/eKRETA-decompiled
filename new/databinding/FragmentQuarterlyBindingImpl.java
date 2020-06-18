package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModel;

public class FragmentQuarterlyBindingImpl extends FragmentQuarterlyBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.f D = null;
    public static final SparseIntArray E = new SparseIntArray();
    public final SwipeRefreshLayout.h B;
    public long C = -1;

    static {
        E.put(R.id.recycler_view, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentQuarterlyBindingImpl(h.l.f r9, android.view.View r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding$f r0 = D
            android.util.SparseIntArray r1 = E
            r2 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r9, (android.view.View) r10, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 0
            r1 = r0[r1]
            r6 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
            r1 = 1
            r0 = r0[r1]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r5 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = -1
            r8.C = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r9 = r8.z
            r0 = 0
            r9.setTag(r0)
            r8.a((android.view.View) r10)
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r9 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r9.<init>(r8, r1)
            r8.B = r9
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentQuarterlyBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        boolean z = false;
        QuarterlyViewModel quarterlyViewModel = this.A;
        int i2 = ((7 & j2) > 0 ? 1 : ((7 & j2) == 0 ? 0 : -1));
        if (!(i2 == 0 || quarterlyViewModel == null)) {
            z = quarterlyViewModel.d();
        }
        if ((j2 & 4) != 0) {
            this.z.setOnRefreshListener(this.B);
        }
        if (i2 != 0) {
            this.z.setRefreshing(z);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(QuarterlyViewModel quarterlyViewModel) {
        a(0, (i) quarterlyViewModel);
        this.A = quarterlyViewModel;
        synchronized (this) {
            this.C |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.C = 4;
        }
        b2();
    }

    public final void b(int i2) {
        QuarterlyViewModel quarterlyViewModel = this.A;
        if (quarterlyViewModel != null) {
            quarterlyViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((QuarterlyViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.C |= 1;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.C |= 2;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        QuarterlyViewModel quarterlyViewModel = (QuarterlyViewModel) obj;
        return e(i3);
    }
}
