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
import p289hu.ekreta.ellenorzo.configSettings.NotSupportedAppViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityNotSupportedAppBindingImpl */
public class ActivityNotSupportedAppBindingImpl extends ActivityNotSupportedAppBinding implements Listener {

    /* renamed from: E */
    public static final C2867f f12160E = null;

    /* renamed from: F */
    public static final SparseIntArray f12161F = new SparseIntArray();

    /* renamed from: B */
    public final ConstraintLayout f12162B;

    /* renamed from: C */
    public final OnClickListener f12163C;

    /* renamed from: D */
    public long f12164D = -1;

    static {
        f12161F.put(C4014R.C4016id.newerVersionInfoTitle, 2);
    }

    public ActivityNotSupportedAppBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 3, f12160E, f12161F);
        super(fVar, view, 0, (TextView) a[2], (Button) a[1]);
        this.f12162B = (ConstraintLayout) a[0];
        this.f12162B.setTag(null);
        this.f12159z.setTag(null);
        mo6098a(view);
        this.f12163C = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12164D;
            this.f12164D = 0;
        }
        if ((j & 2) != 0) {
            this.f12159z.setOnClickListener(this.f12163C);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12164D != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12164D = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12365a(NotSupportedAppViewModel notSupportedAppViewModel) {
        this.f12158A = notSupportedAppViewModel;
        synchronized (this) {
            this.f12164D |= 1;
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
        mo12365a((NotSupportedAppViewModel) obj);
        return true;
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        NotSupportedAppViewModel notSupportedAppViewModel = this.f12158A;
        if (notSupportedAppViewModel != null) {
            notSupportedAppViewModel.mo12323b();
        }
    }
}
