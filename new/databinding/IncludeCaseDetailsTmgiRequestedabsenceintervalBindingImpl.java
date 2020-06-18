package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl extends IncludeCaseDetailsTmgiRequestedabsenceintervalBinding {
    public static final ViewDataBinding.f D = null;
    public static final SparseIntArray E = null;
    public long C = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl(h.l.f r9, android.view.View[] r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding$f r0 = D
            android.util.SparseIntArray r1 = E
            r2 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r9, (android.view.View[]) r10, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 0
            r4 = r10[r1]
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 1
            r0 = r0[r1]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = -1
            r8.C = r0
            android.widget.TextView r9 = r8.z
            r0 = 0
            r9.setTag(r0)
            android.widget.TextView r9 = r8.A
            r9.setTag(r0)
            r8.a((android.view.View[]) r10)
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl.<init>(h.l.f, android.view.View[]):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.C;
            this.C = 0;
        }
        String str = this.B;
        if ((j2 & 3) != 0) {
            this.z.setVisibility(BindingConverters.a(str));
            a.a(this.A, (CharSequence) str);
            this.A.setVisibility(BindingConverters.a(str));
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

    public boolean a(int i2, Object obj, int i3) {
        return false;
    }

    public void a2() {
        synchronized (this) {
            this.C = 2;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (11 != i2) {
            return false;
        }
        p((String) obj);
        return true;
    }

    public void p(String str) {
        this.B = str;
        synchronized (this) {
            this.C |= 1;
        }
        c(11);
        super.b2();
    }
}
