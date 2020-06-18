package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModel;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;

public class ActivityNotSupportedAppBindingImpl extends ActivityNotSupportedAppBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f E = null;
    public static final SparseIntArray F = new SparseIntArray();
    public final ConstraintLayout B;
    public final View.OnClickListener C;
    public long D = -1;

    static {
        F.put(R.id.newerVersionInfoTitle, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityNotSupportedAppBindingImpl(h.l.f r9, android.view.View r10) {
        /*
            r8 = this;
            androidx.databinding.ViewDataBinding$f r0 = E
            android.util.SparseIntArray r1 = F
            r2 = 3
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r9, (android.view.View) r10, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            android.widget.Button r7 = (android.widget.Button) r7
            r5 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = -1
            r8.D = r2
            r9 = 0
            r9 = r0[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r8.B = r9
            androidx.constraintlayout.widget.ConstraintLayout r9 = r8.B
            r0 = 0
            r9.setTag(r0)
            android.widget.Button r9 = r8.z
            r9.setTag(r0)
            r8.a((android.view.View) r10)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r9 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r9.<init>(r8, r1)
            r8.C = r9
            r8.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityNotSupportedAppBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        synchronized (this) {
            j2 = this.D;
            this.D = 0;
        }
        if ((j2 & 2) != 0) {
            this.z.setOnClickListener(this.C);
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

    public void a(NotSupportedAppViewModel notSupportedAppViewModel) {
        this.A = notSupportedAppViewModel;
        synchronized (this) {
            this.D |= 1;
        }
        c(88);
        super.b2();
    }

    public boolean a(int i2, Object obj, int i3) {
        return false;
    }

    public void a2() {
        synchronized (this) {
            this.D = 2;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((NotSupportedAppViewModel) obj);
        return true;
    }

    public final void a(int i2, View view) {
        NotSupportedAppViewModel notSupportedAppViewModel = this.A;
        if (notSupportedAppViewModel != null) {
            notSupportedAppViewModel.b();
        }
    }
}
