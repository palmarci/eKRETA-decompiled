package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.fragment.app.FragmentContainerView;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.main.MainViewModel;
import p289hu.ekreta.ellenorzo.util.view.AdvancedBottomNavigationView;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityMainBindingImpl */
public class ActivityMainBindingImpl extends ActivityMainBinding {

    /* renamed from: D */
    public static final C2867f f12123D = null;

    /* renamed from: E */
    public static final SparseIntArray f12124E = new SparseIntArray();

    /* renamed from: B */
    public final CoordinatorLayout f12125B;

    /* renamed from: C */
    public long f12126C = -1;

    static {
        f12124E.put(C4014R.C4016id.toolbar, 2);
        f12124E.put(C4014R.C4016id.toolbar_navigation_icon, 3);
        f12124E.put(C4014R.C4016id.navigation, 4);
        f12124E.put(C4014R.C4016id.fragmentContainer, 5);
    }

    public ActivityMainBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 6, f12123D, f12124E);
        super(fVar, view, 1, (FragmentContainerView) a[5], (AdvancedBottomNavigationView) a[4], (Toolbar) a[2], (ImageView) a[3], (TextView) a[1]);
        this.f12125B = (CoordinatorLayout) a[0];
        this.f12125B.setTag(null);
        this.f12122z.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12126C;
            this.f12126C = 0;
        }
        String str = null;
        MainViewModel mainViewModel = this.f12121A;
        int i = ((j & 7) > 0 ? 1 : ((j & 7) == 0 ? 0 : -1));
        if (!(i == 0 || mainViewModel == null)) {
            str = mainViewModel.mo13184v1();
        }
        if (i != 0) {
            C3158a.m7850a(this.f12122z, (CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12126C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12126C = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12359a(MainViewModel mainViewModel) {
        mo6103a(0, (C3705i) mainViewModel);
        this.f12121A = mainViewModel;
        synchronized (this) {
            this.f12126C |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12359a((MainViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12360e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12126C |= 1;
            }
            return true;
        } else if (i != 38) {
            return false;
        } else {
            synchronized (this) {
                this.f12126C |= 2;
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
        return mo12360e(i2);
    }
}
