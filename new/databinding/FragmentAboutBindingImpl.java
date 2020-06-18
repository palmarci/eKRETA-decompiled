package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.main.MainViewModel;

public class FragmentAboutBindingImpl extends FragmentAboutBinding {
    public static final ViewDataBinding.f D = null;
    public static final SparseIntArray E = new SparseIntArray();
    public long C = -1;

    static {
        E.put(R.id.about_items_recyclerview, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentAboutBindingImpl(h.l.f r10, android.view.View r11) {
        /*
            r9 = this;
            androidx.databinding.ViewDataBinding$f r0 = D
            android.util.SparseIntArray r1 = E
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r10, (android.view.View) r11, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r1 = 0
            r1 = r0[r1]
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r1 = 1
            r0 = r0[r1]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r5 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = -1
            r9.C = r0
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.z
            r0 = 0
            r10.setTag(r0)
            android.widget.TextView r10 = r9.A
            r10.setTag(r0)
            r9.a((android.view.View) r11)
            r9.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentAboutBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        MainViewModel mainViewModel = this.B;
        String str = null;
        int i2 = ((j2 & 7) > 0 ? 1 : ((j2 & 7) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (mainViewModel != null) {
                str = mainViewModel.n();
            }
            str = this.A.getResources().getString(R.string.appVersionFormat, new Object[]{str});
        }
        if (i2 != 0) {
            a.a(this.A, (CharSequence) str);
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
        this.B = mainViewModel;
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
        } else if (i2 != 2) {
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
