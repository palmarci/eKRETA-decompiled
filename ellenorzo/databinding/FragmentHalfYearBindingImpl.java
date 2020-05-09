package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener.Listener;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;
import p289hu.ekreta.ellenorzo.util.viewmodel.DataBindingListViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentHalfYearBindingImpl */
public class FragmentHalfYearBindingImpl extends FragmentHalfYearBinding implements Listener {

    /* renamed from: E */
    public static final C2867f f12301E = null;

    /* renamed from: F */
    public static final SparseIntArray f12302F = new SparseIntArray();

    /* renamed from: C */
    public final C2948h f12303C;

    /* renamed from: D */
    public long f12304D = -1;

    static {
        f12302F.put(C4014R.C4016id.recycler_view, 2);
    }

    public FragmentHalfYearBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 3, f12301E, f12302F);
        super(fVar, view, 1, (TextView) a[1], (SwipeRefreshLayout) a[0], (RecyclerView) a[2]);
        this.f12300z.setTag(null);
        this.f12298A.setTag(null);
        mo6098a(view);
        this.f12303C = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.f12304D;
            this.f12304D = 0;
        }
        DataBindingListViewModel dataBindingListViewModel = this.f12299B;
        boolean z2 = false;
        if ((15 & j) != 0) {
            z = ((j & 11) == 0 || dataBindingListViewModel == null) ? false : dataBindingListViewModel.mo11494d();
            if (!((j & 13) == 0 || dataBindingListViewModel == null)) {
                z2 = dataBindingListViewModel.mo11496f();
            }
        } else {
            z = false;
        }
        if ((13 & j) != 0) {
            this.f12300z.setVisibility(BindingConverters.m14795a(z2));
        }
        if ((8 & j) != 0) {
            this.f12298A.setOnRefreshListener(this.f12303C);
        }
        if ((j & 11) != 0) {
            this.f12298A.setRefreshing(z);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12304D != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12304D = 8;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12391a(DataBindingListViewModel dataBindingListViewModel) {
        mo6103a(0, (C3705i) dataBindingListViewModel);
        this.f12299B = dataBindingListViewModel;
        synchronized (this) {
            this.f12304D |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12391a((DataBindingListViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12392e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12304D |= 1;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12304D |= 2;
            }
            return true;
        } else if (i != 65) {
            return false;
        } else {
            synchronized (this) {
                this.f12304D |= 4;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        DataBindingListViewModel dataBindingListViewModel = this.f12299B;
        if (dataBindingListViewModel != null) {
            dataBindingListViewModel.mo11495e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        DataBindingListViewModel dataBindingListViewModel = (DataBindingListViewModel) obj;
        return mo12392e(i2);
    }
}
