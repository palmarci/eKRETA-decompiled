package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.subject.SubjectsViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentSubjectsBindingImpl */
public class FragmentSubjectsBindingImpl extends FragmentSubjectsBinding {

    /* renamed from: D */
    public static final C2867f f12370D = null;

    /* renamed from: E */
    public static final SparseIntArray f12371E = new SparseIntArray();

    /* renamed from: B */
    public final ConstraintLayout f12372B;

    /* renamed from: C */
    public long f12373C = -1;

    static {
        f12371E.put(C4014R.C4016id.pager, 2);
    }

    public FragmentSubjectsBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 3, f12370D, f12371E);
        super(fVar, view, 1, (ViewPager) a[2], (TabLayout) a[1]);
        this.f12372B = (ConstraintLayout) a[0];
        this.f12372B.setTag(null);
        this.f12369z.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12373C;
            this.f12373C = 0;
        }
        boolean z = false;
        SubjectsViewModel subjectsViewModel = this.f12368A;
        int i = ((j & 7) > 0 ? 1 : ((j & 7) == 0 ? 0 : -1));
        if (!(i == 0 || subjectsViewModel == null)) {
            z = subjectsViewModel.mo11497g();
        }
        if (i != 0) {
            this.f12369z.setVisibility(BindingConverters.m14795a(z));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12373C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12373C = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12410a(SubjectsViewModel subjectsViewModel) {
        mo6103a(0, (C3705i) subjectsViewModel);
        this.f12368A = subjectsViewModel;
        synchronized (this) {
            this.f12373C |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12410a((SubjectsViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12411e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12373C |= 1;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            synchronized (this) {
                this.f12373C |= 2;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        SubjectsViewModel subjectsViewModel = (SubjectsViewModel) obj;
        return mo12411e(i2);
    }
}
