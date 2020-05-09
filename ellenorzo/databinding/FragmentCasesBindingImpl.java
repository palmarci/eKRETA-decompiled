package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import com.leinardi.android.speeddial.SpeedDialView;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.cases.CasesViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener.Listener;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentCasesBindingImpl */
public class FragmentCasesBindingImpl extends FragmentCasesBinding implements Listener {

    /* renamed from: F */
    public static final C2867f f12277F = null;

    /* renamed from: G */
    public static final SparseIntArray f12278G = new SparseIntArray();

    /* renamed from: C */
    public final ConstraintLayout f12279C;

    /* renamed from: D */
    public final C2948h f12280D;

    /* renamed from: E */
    public long f12281E = -1;

    static {
        f12278G.put(C4014R.C4016id.add_certificate_speedDialView, 3);
    }

    public FragmentCasesBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 4, f12277F, f12278G);
        super(fVar, view, 1, (SpeedDialView) a[3], (SwipeRefreshLayout) a[1], (RecyclerView) a[2]);
        this.f12279C = (ConstraintLayout) a[0];
        this.f12279C.setTag(null);
        this.f12276z.setTag(null);
        this.f12274A.setTag(null);
        mo6098a(view);
        this.f12280D = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.f12281E;
            this.f12281E = 0;
        }
        CasesViewModel casesViewModel = this.f12275B;
        int i = 0;
        if ((15 & j) != 0) {
            z = ((j & 11) == 0 || casesViewModel == null) ? false : casesViewModel.mo11494d();
            int i2 = ((j & 13) > 0 ? 1 : ((j & 13) == 0 ? 0 : -1));
            if (i2 != 0) {
                boolean g = casesViewModel != null ? casesViewModel.mo11497g() : false;
                if (i2 != 0) {
                    j |= g ? 32 : 16;
                }
                if (!g) {
                    i = 8;
                }
            }
        } else {
            z = false;
        }
        if ((8 & j) != 0) {
            this.f12276z.setOnRefreshListener(this.f12280D);
        }
        if ((11 & j) != 0) {
            this.f12276z.setRefreshing(z);
        }
        if ((j & 13) != 0) {
            this.f12274A.setVisibility(i);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12281E != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12281E = 8;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12385a(CasesViewModel casesViewModel) {
        mo6103a(0, (C3705i) casesViewModel);
        this.f12275B = casesViewModel;
        synchronized (this) {
            this.f12281E |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12385a((CasesViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12386e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12281E |= 1;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12281E |= 2;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            synchronized (this) {
                this.f12281E |= 4;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        CasesViewModel casesViewModel = this.f12275B;
        if (casesViewModel != null) {
            casesViewModel.mo11495e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        CasesViewModel casesViewModel = (CasesViewModel) obj;
        return mo12386e(i2);
    }
}
