package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
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
import p289hu.ekreta.ellenorzo.subject.certificate.quarterly.QuarterlyViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentQuarterlyBindingImpl */
public class FragmentQuarterlyBindingImpl extends FragmentQuarterlyBinding implements Listener {

    /* renamed from: D */
    public static final C2867f f12355D = null;

    /* renamed from: E */
    public static final SparseIntArray f12356E = new SparseIntArray();

    /* renamed from: B */
    public final C2948h f12357B;

    /* renamed from: C */
    public long f12358C = -1;

    static {
        f12356E.put(C4014R.C4016id.recycler_view, 1);
    }

    public FragmentQuarterlyBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 2, f12355D, f12356E);
        super(fVar, view, 1, (SwipeRefreshLayout) a[0], (RecyclerView) a[1]);
        this.f12354z.setTag(null);
        mo6098a(view);
        this.f12357B = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12358C;
            this.f12358C = 0;
        }
        boolean z = false;
        QuarterlyViewModel quarterlyViewModel = this.f12353A;
        int i = ((7 & j) > 0 ? 1 : ((7 & j) == 0 ? 0 : -1));
        if (!(i == 0 || quarterlyViewModel == null)) {
            z = quarterlyViewModel.mo11494d();
        }
        if ((j & 4) != 0) {
            this.f12354z.setOnRefreshListener(this.f12357B);
        }
        if (i != 0) {
            this.f12354z.setRefreshing(z);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12358C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12358C = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12406a(QuarterlyViewModel quarterlyViewModel) {
        mo6103a(0, (C3705i) quarterlyViewModel);
        this.f12353A = quarterlyViewModel;
        synchronized (this) {
            this.f12358C |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12406a((QuarterlyViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12407e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12358C |= 1;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12358C |= 2;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        QuarterlyViewModel quarterlyViewModel = this.f12353A;
        if (quarterlyViewModel != null) {
            quarterlyViewModel.mo11495e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        QuarterlyViewModel quarterlyViewModel = (QuarterlyViewModel) obj;
        return mo12407e(i2);
    }
}
