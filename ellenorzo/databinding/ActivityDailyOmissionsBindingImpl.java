package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityDailyOmissionsBindingImpl */
public class ActivityDailyOmissionsBindingImpl extends ActivityDailyOmissionsBinding {

    /* renamed from: B */
    public static final C2867f f11988B = null;

    /* renamed from: C */
    public static final SparseIntArray f11989C = new SparseIntArray();

    /* renamed from: A */
    public long f11990A = -1;

    /* renamed from: z */
    public final CoordinatorLayout f11991z;

    static {
        f11989C.put(C4014R.C4016id.app_bar_layout, 1);
        f11989C.put(C4014R.C4016id.toolbar, 2);
        f11989C.put(C4014R.C4016id.recycler_view, 3);
    }

    public ActivityDailyOmissionsBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 4, f11988B, f11989C);
        super(fVar, view, 1, (AppBarLayout) a[1], (RecyclerView) a[3], (Toolbar) a[2]);
        this.f11991z = (CoordinatorLayout) a[0];
        this.f11991z.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        synchronized (this) {
            this.f11990A = 0;
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f11990A != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f11990A = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12341a(DataBindingListViewModel dataBindingListViewModel) {
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        DataBindingListViewModel dataBindingListViewModel = (DataBindingListViewModel) obj;
        return mo12342e(i2);
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12341a((DataBindingListViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12342e(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f11990A |= 1;
        }
        return true;
    }
}
