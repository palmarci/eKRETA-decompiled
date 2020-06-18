package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class IncludeCaseDetailsRectificationbuttonBindingImpl extends IncludeCaseDetailsRectificationbuttonBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f F = null;
    public static final SparseIntArray G = null;
    public final View.OnClickListener C;
    public final View.OnClickListener D;
    public long E = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IncludeCaseDetailsRectificationbuttonBindingImpl(h.l.f r11, android.view.View[] r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = F
            android.util.SparseIntArray r1 = G
            r2 = 2
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View[]) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 0
            r5 = r12[r1]
            r9 = 1
            r3 = r0[r9]
            r7 = r3
            android.widget.Button r7 = (android.widget.Button) r7
            r0 = r0[r1]
            r8 = r0
            android.widget.Button r8 = (android.widget.Button) r8
            r6 = 1
            r3 = r10
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = -1
            r10.E = r0
            android.widget.Button r11 = r10.z
            r0 = 0
            r11.setTag(r0)
            android.widget.Button r11 = r10.A
            r11.setTag(r0)
            r10.a((android.view.View[]) r12)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r11.<init>(r10, r9)
            r10.C = r11
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r11.<init>(r10, r2)
            r10.D = r11
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBindingImpl.<init>(h.l.f, android.view.View[]):void");
    }

    public void V1() {
        long j2;
        boolean z;
        String str;
        String str2;
        synchronized (this) {
            j2 = this.E;
            this.E = 0;
        }
        CaseDetailsViewModel caseDetailsViewModel = this.B;
        boolean z2 = false;
        String str3 = null;
        if ((63 & j2) != 0) {
            str = ((j2 & 35) == 0 || caseDetailsViewModel == null) ? null : caseDetailsViewModel.O();
            z = ((j2 & 49) == 0 || caseDetailsViewModel == null) ? false : caseDetailsViewModel.S();
            if (!((j2 & 37) == 0 || caseDetailsViewModel == null)) {
                z2 = caseDetailsViewModel.w();
            }
            if (!((j2 & 41) == 0 || caseDetailsViewModel == null)) {
                str3 = caseDetailsViewModel.Q();
            }
            str2 = str3;
        } else {
            str2 = null;
            str = null;
            z = false;
        }
        if ((j2 & 32) != 0) {
            this.z.setOnClickListener(this.D);
            this.A.setOnClickListener(this.C);
        }
        if ((j2 & 41) != 0) {
            a.a((TextView) this.z, (CharSequence) str2);
        }
        if ((j2 & 49) != 0) {
            this.z.setVisibility(BindingConverters.a(z));
        }
        if ((j2 & 35) != 0) {
            a.a((TextView) this.A, (CharSequence) str);
        }
        if ((j2 & 37) != 0) {
            this.A.setVisibility(BindingConverters.a(z2));
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

    public void a(CaseDetailsViewModel caseDetailsViewModel) {
        a(0, (i) caseDetailsViewModel);
        this.B = caseDetailsViewModel;
        synchronized (this) {
            this.E |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.E = 32;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((CaseDetailsViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.E |= 1;
            }
            return true;
        } else if (i2 == 42) {
            synchronized (this) {
                this.E |= 2;
            }
            return true;
        } else if (i2 == 100) {
            synchronized (this) {
                this.E |= 4;
            }
            return true;
        } else if (i2 == 27) {
            synchronized (this) {
                this.E |= 8;
            }
            return true;
        } else if (i2 != 50) {
            return false;
        } else {
            synchronized (this) {
                this.E |= 16;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        CaseDetailsViewModel caseDetailsViewModel = (CaseDetailsViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        boolean z = false;
        if (i2 == 1) {
            CaseDetailsViewModel caseDetailsViewModel = this.B;
            if (caseDetailsViewModel != null) {
                z = true;
            }
            if (z) {
                caseDetailsViewModel.F();
            }
        } else if (i2 == 2) {
            CaseDetailsViewModel caseDetailsViewModel2 = this.B;
            if (caseDetailsViewModel2 != null) {
                z = true;
            }
            if (z) {
                caseDetailsViewModel2.N();
            }
        }
    }
}
