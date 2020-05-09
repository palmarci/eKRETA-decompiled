package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C2948h;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener;
import p289hu.ekreta.ellenorzo.generated.callback.OnRefreshListener.Listener;
import p289hu.ekreta.ellenorzo.timetable.TimeTableViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentTimetableBindingImpl */
public class FragmentTimetableBindingImpl extends FragmentTimetableBinding implements Listener {

    /* renamed from: G */
    public static final C2867f f12378G = null;

    /* renamed from: H */
    public static final SparseIntArray f12379H = new SparseIntArray();

    /* renamed from: D */
    public final LinearLayout f12380D;

    /* renamed from: E */
    public final C2948h f12381E;

    /* renamed from: F */
    public long f12382F = -1;

    static {
        f12379H.put(C4014R.C4016id.timetable_calendar_view, 4);
        f12379H.put(C4014R.C4016id.divider, 5);
    }

    public FragmentTimetableBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 6, f12378G, f12379H);
        super(fVar, view, 1, (View) a[5], (TextView) a[3], (SwipeRefreshLayout) a[1], (RecyclerView) a[2], (MaterialCalendarView) a[4]);
        this.f12377z.setTag(null);
        this.f12380D = (LinearLayout) a[0];
        this.f12380D.setTag(null);
        this.f12374A.setTag(null);
        this.f12375B.setTag(null);
        mo6098a(view);
        this.f12381E = new OnRefreshListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.f12382F;
            this.f12382F = 0;
        }
        TimeTableViewModel timeTableViewModel = this.f12376C;
        boolean z3 = false;
        if ((31 & j) != 0) {
            z2 = ((j & 19) == 0 || timeTableViewModel == null) ? false : timeTableViewModel.mo11494d();
            z = ((j & 21) == 0 || timeTableViewModel == null) ? false : timeTableViewModel.mo11497g();
            if (!((j & 25) == 0 || timeTableViewModel == null)) {
                z3 = timeTableViewModel.mo11496f();
            }
        } else {
            z2 = false;
            z = false;
        }
        if ((25 & j) != 0) {
            this.f12377z.setVisibility(BindingConverters.m14795a(z3));
        }
        if ((16 & j) != 0) {
            this.f12374A.setOnRefreshListener(this.f12381E);
        }
        if ((19 & j) != 0) {
            this.f12374A.setRefreshing(z2);
        }
        if ((j & 21) != 0) {
            this.f12375B.setVisibility(BindingConverters.m14795a(z));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12382F != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12382F = 16;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12412a(TimeTableViewModel timeTableViewModel) {
        mo6103a(0, (C3705i) timeTableViewModel);
        this.f12376C = timeTableViewModel;
        synchronized (this) {
            this.f12382F |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12412a((TimeTableViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12413e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12382F |= 1;
            }
            return true;
        } else if (i == 37) {
            synchronized (this) {
                this.f12382F |= 2;
            }
            return true;
        } else if (i == 3) {
            synchronized (this) {
                this.f12382F |= 4;
            }
            return true;
        } else if (i != 65) {
            return false;
        } else {
            synchronized (this) {
                this.f12382F |= 8;
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo12351b(int i) {
        TimeTableViewModel timeTableViewModel = this.f12376C;
        if (timeTableViewModel != null) {
            timeTableViewModel.mo11495e();
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        TimeTableViewModel timeTableViewModel = (TimeTableViewModel) obj;
        return mo12413e(i2);
    }
}
