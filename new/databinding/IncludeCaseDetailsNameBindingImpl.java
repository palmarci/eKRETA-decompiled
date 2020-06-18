package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;

public class IncludeCaseDetailsNameBindingImpl extends IncludeCaseDetailsNameBinding {
    public static final ViewDataBinding.f E = null;
    public static final SparseIntArray F = null;
    public long D = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IncludeCaseDetailsNameBindingImpl(h.l.f r9, android.view.View[] r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding$f r0 = E
            android.util.SparseIntArray r1 = F
            r2 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r9, (android.view.View[]) r10, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 0
            r4 = r10[r1]
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = r0[r1]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = -1
            r8.D = r0
            android.widget.TextView r9 = r8.z
            r0 = 0
            r9.setTag(r0)
            android.widget.TextView r9 = r8.A
            r9.setTag(r0)
            r8.a((android.view.View[]) r10)
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBindingImpl.<init>(h.l.f, android.view.View[]):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.D;
            this.D = 0;
        }
        String str = this.C;
        String str2 = this.B;
        int i2 = ((j2 & 6) > 0 ? 1 : ((j2 & 6) == 0 ? 0 : -1));
        if ((5 & j2) != 0) {
            a.a(this.z, (CharSequence) str);
        }
        if (i2 != 0) {
            a.a(this.A, (CharSequence) str2);
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

    public boolean a(int i2, Object obj, int i3) {
        return false;
    }

    public void a2() {
        synchronized (this) {
            this.D = 4;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (71 == i2) {
            p((String) obj);
        } else if (63 != i2) {
            return false;
        } else {
            q((String) obj);
        }
        return true;
    }

    public void p(String str) {
        this.C = str;
        synchronized (this) {
            this.D |= 1;
        }
        c(71);
        super.b2();
    }

    public void q(String str) {
        this.B = str;
        synchronized (this) {
            this.D |= 2;
        }
        c(63);
        super.b2();
    }
}
