package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import g.a.a.b.a;
import h.l.h;
import h.l.i;
import h.l.o.d;
import h.l.o.e;
import h.l.o.f;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.institute.InstitutePickerViewModel;

public class ActivityInsitutePickerBindingImpl extends ActivityInsitutePickerBinding {
    public static final ViewDataBinding.f E = null;
    public static final SparseIntArray F = new SparseIntArray();
    public final ConstraintLayout A;
    public final TextInputEditText B;
    public h C = new h() {
        public void a() {
            String d2 = a.d((TextView) ActivityInsitutePickerBindingImpl.this.B);
            InstitutePickerViewModel institutePickerViewModel = ActivityInsitutePickerBindingImpl.this.z;
            if (institutePickerViewModel != null) {
                institutePickerViewModel.n(d2);
            }
        }
    };
    public long D = -1;

    static {
        F.put(R.id.search_textinputlayout, 2);
        F.put(R.id.institutes_recyclerview, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityInsitutePickerBindingImpl(h.l.f r9, android.view.View r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding$f r0 = E
            android.util.SparseIntArray r1 = F
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r9, (android.view.View) r10, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7
            r5 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBindingImpl$1 r9 = new hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBindingImpl$1
            r9.<init>()
            r8.C = r9
            r1 = -1
            r8.D = r1
            r9 = 0
            r9 = r0[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r8.A = r9
            androidx.constraintlayout.widget.ConstraintLayout r9 = r8.A
            r1 = 0
            r9.setTag(r1)
            r9 = 1
            r9 = r0[r9]
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            r8.B = r9
            com.google.android.material.textfield.TextInputEditText r9 = r8.B
            r9.setTag(r1)
            r8.a((android.view.View) r10)
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityInsitutePickerBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.D;
            this.D = 0;
        }
        InstitutePickerViewModel institutePickerViewModel = this.z;
        int i2 = ((7 & j2) > 0 ? 1 : ((7 & j2) == 0 ? 0 : -1));
        String F0 = (i2 == 0 || institutePickerViewModel == null) ? null : institutePickerViewModel.F0();
        if (i2 != 0) {
            a.a((TextView) this.B, (CharSequence) F0);
        }
        if ((j2 & 4) != 0) {
            a.a((TextView) this.B, (e) null, (f) null, (d) null, this.C);
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

    public void a(InstitutePickerViewModel institutePickerViewModel) {
        a(0, (i) institutePickerViewModel);
        this.z = institutePickerViewModel;
        synchronized (this) {
            this.D |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.D = 4;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((InstitutePickerViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.D |= 1;
            }
            return true;
        } else if (i2 != 76) {
            return false;
        } else {
            synchronized (this) {
                this.D |= 2;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        InstitutePickerViewModel institutePickerViewModel = (InstitutePickerViewModel) obj;
        return e(i3);
    }
}
