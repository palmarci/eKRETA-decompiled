package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedViewModel;

public class ActivityRootedDeviceDetectedBindingImpl extends ActivityRootedDeviceDetectedBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f E = null;
    public static final SparseIntArray F = new SparseIntArray();
    public final ConstraintLayout B;
    public final View.OnClickListener C;
    public long D = -1;

    static {
        F.put(R.id.rootedDevicePageTitle, 2);
        F.put(R.id.rootedDeviceText, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityRootedDeviceDetectedBindingImpl(h.l.f r11, android.view.View r12) {
        /*
            r10 = this;
            androidx.databinding.ViewDataBinding$f r0 = E
            android.util.SparseIntArray r1 = F
            r2 = 4
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r11, (android.view.View) r12, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 1
            r2 = r0[r1]
            r7 = r2
            android.widget.Button r7 = (android.widget.Button) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 3
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r6 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.D = r2
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.B = r11
            androidx.constraintlayout.widget.ConstraintLayout r11 = r10.B
            r0 = 0
            r11.setTag(r0)
            android.widget.Button r11 = r10.z
            r11.setTag(r0)
            r10.a((android.view.View) r12)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r11 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r11.<init>(r10, r1)
            r10.C = r11
            r10.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityRootedDeviceDetectedBindingImpl.<init>(h.l.f, android.view.View):void");
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

    public void a(RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel) {
        this.A = rootedDeviceDetectedViewModel;
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
        a((RootedDeviceDetectedViewModel) obj);
        return true;
    }

    public final void a(int i2, View view) {
        RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel = this.A;
        if (rootedDeviceDetectedViewModel != null) {
            rootedDeviceDetectedViewModel.a();
        }
    }
}
