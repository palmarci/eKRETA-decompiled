package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.subject.SubjectsViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class FragmentSubjectsBindingImpl extends FragmentSubjectsBinding {
    public static final ViewDataBinding.f D = null;
    public static final SparseIntArray E = new SparseIntArray();
    public final ConstraintLayout B;
    public long C = -1;

    static {
        E.put(R.id.pager, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FragmentSubjectsBindingImpl(h.l.f r9, android.view.View r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding$f r0 = D
            android.util.SparseIntArray r1 = E
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r9, (android.view.View) r10, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            androidx.viewpager.widget.ViewPager r6 = (androidx.viewpager.widget.ViewPager) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.tabs.TabLayout r7 = (com.google.android.material.tabs.TabLayout) r7
            r5 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -1
            r8.C = r1
            r9 = 0
            r9 = r0[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r8.B = r9
            androidx.constraintlayout.widget.ConstraintLayout r9 = r8.B
            r0 = 0
            r9.setTag(r0)
            com.google.android.material.tabs.TabLayout r9 = r8.z
            r9.setTag(r0)
            r8.a((android.view.View) r10)
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.FragmentSubjectsBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        boolean z = false;
        SubjectsViewModel subjectsViewModel = this.A;
        int i2 = ((j2 & 7) > 0 ? 1 : ((j2 & 7) == 0 ? 0 : -1));
        if (!(i2 == 0 || subjectsViewModel == null)) {
            z = subjectsViewModel.g();
        }
        if (i2 != 0) {
            this.z.setVisibility(BindingConverters.a(z));
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

    public void a(SubjectsViewModel subjectsViewModel) {
        a(0, (i) subjectsViewModel);
        this.A = subjectsViewModel;
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
        a((SubjectsViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.C |= 1;
            }
            return true;
        } else if (i2 != 3) {
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
        SubjectsViewModel subjectsViewModel = (SubjectsViewModel) obj;
        return e(i3);
    }
}
