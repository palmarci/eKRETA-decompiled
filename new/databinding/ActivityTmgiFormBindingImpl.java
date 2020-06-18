package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import h.l.f;

public class ActivityTmgiFormBindingImpl extends ActivityTmgiFormBinding {
    public static final ViewDataBinding.f B = null;
    public static final SparseIntArray C = null;
    public long A = -1;
    public final CoordinatorLayout z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityTmgiFormBindingImpl(f fVar, View view) {
        super(fVar, view, 0);
        Object[] a2 = ViewDataBinding.a(fVar, view, 1, B, C);
        this.z = (CoordinatorLayout) a2[0];
        this.z.setTag((Object) null);
        a(view);
        a2();
    }

    public void V1() {
        synchronized (this) {
            this.A = 0;
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.A != 0) {
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
            this.A = 1;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        return true;
    }
}
