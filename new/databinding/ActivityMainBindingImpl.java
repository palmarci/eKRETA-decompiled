package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.main.MainViewModel;

public class ActivityMainBindingImpl extends ActivityMainBinding {
    public static final ViewDataBinding.f D = null;
    public static final SparseIntArray E = new SparseIntArray();
    public final CoordinatorLayout B;
    public long C = -1;

    static {
        E.put(R.id.toolbar, 2);
        E.put(R.id.toolbar_navigation_icon, 3);
        E.put(R.id.navigation, 4);
        E.put(R.id.fragmentContainer, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityMainBindingImpl(h.l.f r12, android.view.View r13) {
        /*
            r11 = this;
            androidx.databinding.ViewDataBinding$f r0 = D
            android.util.SparseIntArray r1 = E
            r2 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r12, (android.view.View) r13, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            androidx.fragment.app.FragmentContainerView r6 = (androidx.fragment.app.FragmentContainerView) r6
            r1 = 4
            r1 = r0[r1]
            r7 = r1
            hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView r7 = (hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.Toolbar r8 = (androidx.appcompat.widget.Toolbar) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r1 = 1
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r5 = 1
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -1
            r11.C = r1
            r12 = 0
            r12 = r0[r12]
            androidx.coordinatorlayout.widget.CoordinatorLayout r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r12
            r11.B = r12
            androidx.coordinatorlayout.widget.CoordinatorLayout r12 = r11.B
            r0 = 0
            r12.setTag(r0)
            android.widget.TextView r12 = r11.z
            r12.setTag(r0)
            r11.a((android.view.View) r13)
            r11.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityMainBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        String str = null;
        MainViewModel mainViewModel = this.A;
        int i2 = ((j2 & 7) > 0 ? 1 : ((j2 & 7) == 0 ? 0 : -1));
        if (!(i2 == 0 || mainViewModel == null)) {
            str = mainViewModel.D1();
        }
        if (i2 != 0) {
            a.a(this.z, (CharSequence) str);
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

    public void a(MainViewModel mainViewModel) {
        a(0, (i) mainViewModel);
        this.A = mainViewModel;
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

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((MainViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.C |= 1;
            }
            return true;
        } else if (i2 != 38) {
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
        MainViewModel mainViewModel = (MainViewModel) obj;
        return e(i3);
    }
}
