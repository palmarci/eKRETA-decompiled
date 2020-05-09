package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.rootedDeviceDetected.RootedDeviceDetectedViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityRootedDeviceDetectedBindingImpl */
public class ActivityRootedDeviceDetectedBindingImpl extends ActivityRootedDeviceDetectedBinding implements Listener {

    /* renamed from: E */
    public static final C2867f f12229E = null;

    /* renamed from: F */
    public static final SparseIntArray f12230F = new SparseIntArray();

    /* renamed from: B */
    public final ConstraintLayout f12231B;

    /* renamed from: C */
    public final OnClickListener f12232C;

    /* renamed from: D */
    public long f12233D = -1;

    static {
        f12230F.put(C4014R.C4016id.rootedDevicePageTitle, 2);
        f12230F.put(C4014R.C4016id.rootedDeviceText, 3);
    }

    public ActivityRootedDeviceDetectedBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 4, f12229E, f12230F);
        super(fVar, view, 0, (Button) a[1], (TextView) a[2], (TextView) a[3]);
        this.f12231B = (ConstraintLayout) a[0];
        this.f12231B.setTag(null);
        this.f12228z.setTag(null);
        mo6098a(view);
        this.f12232C = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12233D;
            this.f12233D = 0;
        }
        if ((j & 2) != 0) {
            this.f12228z.setOnClickListener(this.f12232C);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12233D != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12233D = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12376a(RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel) {
        this.f12227A = rootedDeviceDetectedViewModel;
        synchronized (this) {
            this.f12233D |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12376a((RootedDeviceDetectedViewModel) obj);
        return true;
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        RootedDeviceDetectedViewModel rootedDeviceDetectedViewModel = this.f12227A;
        if (rootedDeviceDetectedViewModel != null) {
            rootedDeviceDetectedViewModel.mo15584a();
        }
    }
}
