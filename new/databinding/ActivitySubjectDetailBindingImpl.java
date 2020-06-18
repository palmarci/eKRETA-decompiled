package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import hu.ekreta.ellenorzo.subject.detail.SubjectDetailViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class ActivitySubjectDetailBindingImpl extends ActivitySubjectDetailBinding implements OnRefreshListener.Listener {
    public static final ViewDataBinding.f G = null;
    public static final SparseIntArray H = new SparseIntArray();
    public final CoordinatorLayout D;
    public final SwipeRefreshLayout.h E;
    public long F = -1;

    static {
        H.put(R.id.app_bar_layout, 4);
        H.put(R.id.evaluationRecyclerView, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivitySubjectDetailBindingImpl(h.l.f r12, android.view.View r13) {
        /*
            r11 = this;
            androidx.databinding.ViewDataBinding$f r0 = G
            android.util.SparseIntArray r1 = H
            r2 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.a((h.l.f) r12, (android.view.View) r13, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r9 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r9
            r1 = 1
            r2 = r0[r1]
            r10 = r2
            androidx.appcompat.widget.Toolbar r10 = (androidx.appcompat.widget.Toolbar) r10
            r5 = 1
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = -1
            r11.F = r2
            android.widget.TextView r12 = r11.z
            r2 = 0
            r12.setTag(r2)
            r12 = 0
            r12 = r0[r12]
            androidx.coordinatorlayout.widget.CoordinatorLayout r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r12
            r11.D = r12
            androidx.coordinatorlayout.widget.CoordinatorLayout r12 = r11.D
            r12.setTag(r2)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r12 = r11.A
            r12.setTag(r2)
            androidx.appcompat.widget.Toolbar r12 = r11.B
            r12.setTag(r2)
            r11.a((android.view.View) r13)
            hu.ekreta.ellenorzo.generated.callback.OnRefreshListener r12 = new hu.ekreta.ellenorzo.generated.callback.OnRefreshListener
            r12.<init>(r11, r1)
            r11.E = r12
            r11.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivitySubjectDetailBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        boolean z;
        synchronized (this) {
            j2 = this.F;
            this.F = 0;
        }
        SubjectDetailViewModel subjectDetailViewModel = this.C;
        String str = null;
        boolean z2 = false;
        if ((31 & j2) != 0) {
            z = ((j2 & 21) == 0 || subjectDetailViewModel == null) ? false : subjectDetailViewModel.d();
            if (!((j2 & 25) == 0 || subjectDetailViewModel == null)) {
                z2 = subjectDetailViewModel.f();
            }
            if (!((j2 & 19) == 0 || subjectDetailViewModel == null)) {
                str = subjectDetailViewModel.getTitle();
            }
        } else {
            z = false;
        }
        if ((25 & j2) != 0) {
            this.z.setVisibility(BindingConverters.a(z2));
        }
        if ((16 & j2) != 0) {
            this.A.setOnRefreshListener(this.E);
        }
        if ((21 & j2) != 0) {
            this.A.setRefreshing(z);
        }
        if ((j2 & 19) != 0) {
            this.B.setTitle((CharSequence) str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.F != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(SubjectDetailViewModel subjectDetailViewModel) {
        a(0, (i) subjectDetailViewModel);
        this.C = subjectDetailViewModel;
        synchronized (this) {
            this.F |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.F = 16;
        }
        b2();
    }

    public final void b(int i2) {
        SubjectDetailViewModel subjectDetailViewModel = this.C;
        if (subjectDetailViewModel != null) {
            subjectDetailViewModel.e();
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((SubjectDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.F |= 1;
            }
            return true;
        } else if (i2 == 97) {
            synchronized (this) {
                this.F |= 2;
            }
            return true;
        } else if (i2 == 37) {
            synchronized (this) {
                this.F |= 4;
            }
            return true;
        } else if (i2 != 65) {
            return false;
        } else {
            synchronized (this) {
                this.F |= 8;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        SubjectDetailViewModel subjectDetailViewModel = (SubjectDetailViewModel) obj;
        return e(i3);
    }
}
