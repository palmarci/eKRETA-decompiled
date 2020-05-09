package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.main.MainViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.FragmentAboutBindingImpl */
public class FragmentAboutBindingImpl extends FragmentAboutBinding {

    /* renamed from: D */
    public static final C2867f f12262D = null;

    /* renamed from: E */
    public static final SparseIntArray f12263E = new SparseIntArray();

    /* renamed from: C */
    public long f12264C = -1;

    static {
        f12263E.put(C4014R.C4016id.about_items_recyclerview, 2);
    }

    public FragmentAboutBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 3, f12262D, f12263E);
        super(fVar, view, 1, (RecyclerView) a[2], (ConstraintLayout) a[0], (TextView) a[1]);
        this.f12261z.setTag(null);
        this.f12259A.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12264C;
            this.f12264C = 0;
        }
        MainViewModel mainViewModel = this.f12260B;
        String str = null;
        int i = ((j & 7) > 0 ? 1 : ((j & 7) == 0 ? 0 : -1));
        if (i != 0) {
            if (mainViewModel != null) {
                str = mainViewModel.mo13182n();
            }
            str = this.f12259A.getResources().getString(C4014R.string.appVersionFormat, new Object[]{str});
        }
        if (i != 0) {
            C3158a.m7850a(this.f12259A, (CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12264C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12264C = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12381a(MainViewModel mainViewModel) {
        mo6103a(0, (C3705i) mainViewModel);
        this.f12260B = mainViewModel;
        synchronized (this) {
            this.f12264C |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12381a((MainViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12382e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12264C |= 1;
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            synchronized (this) {
                this.f12264C |= 2;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        MainViewModel mainViewModel = (MainViewModel) obj;
        return mo12382e(i2);
    }
}
