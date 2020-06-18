package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

public class ActivityDailyOmissionsBindingImpl extends ActivityDailyOmissionsBinding {
    public static final ViewDataBinding.f B = null;
    public static final SparseIntArray C = new SparseIntArray();
    public long A = -1;
    public final CoordinatorLayout z;

    static {
        C.put(R.id.app_bar_layout, 1);
        C.put(R.id.toolbar, 2);
        C.put(R.id.recycler_view, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityDailyOmissionsBindingImpl(h.l.f r10, android.view.View r11) {
        /*
            r9 = this;
            androidx.databinding.ViewDataBinding$f r0 = B
            android.util.SparseIntArray r1 = C
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r10, (android.view.View) r11, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r5 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.A = r1
            r10 = 0
            r10 = r0[r10]
            androidx.coordinatorlayout.widget.CoordinatorLayout r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r10
            r9.z = r10
            androidx.coordinatorlayout.widget.CoordinatorLayout r10 = r9.z
            r0 = 0
            r10.setTag(r0)
            r9.a((android.view.View) r11)
            r9.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityDailyOmissionsBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        synchronized (this) {
            this.A = 0;
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(DataBindingListViewModel dataBindingListViewModel) {
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        DataBindingListViewModel dataBindingListViewModel = (DataBindingListViewModel) obj;
        return e(i3);
    }

    public void a2() {
        synchronized (this) {
            this.A = 2;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((DataBindingListViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.A |= 1;
        }
        return true;
    }
}
