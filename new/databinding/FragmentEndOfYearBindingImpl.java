package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

public class FragmentEndOfYearBindingImpl extends FragmentEndOfYearBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.f E = null;
    public static final SparseIntArray F = new SparseIntArray();
    public final SwipeRefreshLayout.h C;
    public long D = -1;

    static {
        F.put(R.id.recycler_view, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentEndOfYearBindingImpl(h.l.f r11, android.view.View r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = E
            android.util.SparseIntArray r1 = F
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 0
            r2 = r0[r2]
            r8 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r8 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r8
            r2 = 2
            r0 = r0[r2]
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r6 = 1
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.D = r2
            android.widget.TextView r11 = r10.z
            r0 = 0
            r11.setTag(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r11 = r10.A
            r11.setTag(r0)
            r10.a((android.view.View) r12)
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r11.<init>(r10, r1)
            r10.C = r11
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentEndOfYearBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        boolean z;
        synchronized (this) {
            j2 = this.D;
            this.D = 0;
        }
        DataBindingListViewModel dataBindingListViewModel = this.B;
        boolean z2 = false;
        if ((15 & j2) != 0) {
            z = ((j2 & 11) == 0 || dataBindingListViewModel == null) ? false : dataBindingListViewModel.d();
            if (!((j2 & 13) == 0 || dataBindingListViewModel == null)) {
                z2 = dataBindingListViewModel.f();
            }
        } else {
            z = false;
        }
        if ((13 & j2) != 0) {
            this.z.setVisibility(BindingConverters.a(z2));
        }
        if ((8 & j2) != 0) {
            this.A.setOnRefreshListener(this.C);
        }
        if ((j2 & 11) != 0) {
            this.A.setRefreshing(z);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(DataBindingListViewModel dataBindingListViewModel) {
        a(0, (i) dataBindingListViewModel);
        this.B = dataBindingListViewModel;
        synchronized (this) {
            this.D |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.D = 8;
        }
        b2();
    }

    public final void b(int i2) {
        DataBindingListViewModel dataBindingListViewModel = this.B;
        if (dataBindingListViewModel != null) {
            dataBindingListViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((DataBindingListViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.D |= 1;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.D |= 2;
            }
            return true;
        } else if (i2 != 65) {
            return false;
        } else {
            synchronized (this) {
                this.D |= 4;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        DataBindingListViewModel dataBindingListViewModel = (DataBindingListViewModel) obj;
        return e(i3);
    }
}
