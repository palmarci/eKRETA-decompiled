package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p211h.p258l.C3702f;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityTmgiFormBindingImpl */
public class ActivityTmgiFormBindingImpl extends ActivityTmgiFormBinding {

    /* renamed from: B */
    public static final C2867f f12250B = null;

    /* renamed from: C */
    public static final SparseIntArray f12251C = null;

    /* renamed from: A */
    public long f12252A = -1;

    /* renamed from: z */
    public final CoordinatorLayout f12253z;

    public ActivityTmgiFormBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 1, f12250B, f12251C);
        super(fVar, view, 0);
        this.f12253z = (CoordinatorLayout) a[0];
        this.f12253z.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        synchronized (this) {
            this.f12252A = 0;
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12252A != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12252A = 1;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        return true;
    }
}
