package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.classmaster.ClassMasterViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityClassMasterBindingImpl */
public class ActivityClassMasterBindingImpl extends ActivityClassMasterBinding implements Listener {

    /* renamed from: J */
    public static final C2867f f11981J = null;

    /* renamed from: K */
    public static final SparseIntArray f11982K = new SparseIntArray();

    /* renamed from: E */
    public final CoordinatorLayout f11983E;

    /* renamed from: F */
    public final OnClickListener f11984F;

    /* renamed from: G */
    public final OnClickListener f11985G;

    /* renamed from: H */
    public final OnClickListener f11986H;

    /* renamed from: I */
    public long f11987I = -1;

    static {
        f11982K.put(C4014R.C4016id.app_bar_layout, 5);
        f11982K.put(C4014R.C4016id.toolbar, 6);
        f11982K.put(C4014R.C4016id.nested_scroll_view, 7);
        f11982K.put(C4014R.C4016id.constraint_layout, 8);
        f11982K.put(C4014R.C4016id.notifying_class_master, 9);
    }

    public ActivityClassMasterBindingImpl(C3702f fVar, View view) {
        View view2 = view;
        Object[] a = ViewDataBinding.m6046a(fVar, view2, 10, f11981J, f11982K);
        super(fVar, view, 1, (AppBarLayout) a[5], (MaterialButton) a[4], (MaterialButton) a[2], (MaterialButton) a[3], (ConstraintLayout) a[8], (TextView) a[1], (NestedScrollView) a[7], (TextView) a[9], (Toolbar) a[6]);
        this.f11980z.setTag(null);
        this.f11976A.setTag(null);
        this.f11977B.setTag(null);
        this.f11983E = (CoordinatorLayout) a[0];
        this.f11983E.setTag(null);
        this.f11978C.setTag(null);
        mo6098a(view2);
        this.f11984F = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        this.f11985G = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 3);
        this.f11986H = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        synchronized (this) {
            j = this.f11987I;
            this.f11987I = 0;
        }
        String str2 = null;
        ClassMasterViewModel classMasterViewModel = this.f11979D;
        boolean z4 = false;
        if ((63 & j) != 0) {
            z2 = ((j & 49) == 0 || classMasterViewModel == null) ? false : classMasterViewModel.mo12265G0();
            z = ((j & 41) == 0 || classMasterViewModel == null) ? false : classMasterViewModel.mo12271n1();
            if (!((j & 37) == 0 || classMasterViewModel == null)) {
                z4 = classMasterViewModel.mo12266P0();
            }
            if (!((j & 35) == 0 || classMasterViewModel == null)) {
                str2 = classMasterViewModel.getName();
            }
            str = str2;
            z3 = z4;
        } else {
            str = null;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((49 & j) != 0) {
            this.f11980z.setEnabled(z2);
        }
        if ((32 & j) != 0) {
            this.f11980z.setOnClickListener(this.f11985G);
            this.f11976A.setOnClickListener(this.f11986H);
            this.f11977B.setOnClickListener(this.f11984F);
        }
        if ((37 & j) != 0) {
            this.f11976A.setEnabled(z3);
        }
        if ((j & 41) != 0) {
            this.f11977B.setEnabled(z);
        }
        if ((j & 35) != 0) {
            C3158a.m7850a(this.f11978C, (CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f11987I != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f11987I = 32;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12339a(ClassMasterViewModel classMasterViewModel) {
        mo6103a(0, (C3705i) classMasterViewModel);
        this.f11979D = classMasterViewModel;
        synchronized (this) {
            this.f11987I |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12339a((ClassMasterViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12340e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f11987I |= 1;
            }
            return true;
        } else if (i == 87) {
            synchronized (this) {
                this.f11987I |= 2;
            }
            return true;
        } else if (i == 82) {
            synchronized (this) {
                this.f11987I |= 4;
            }
            return true;
        } else if (i == 28) {
            synchronized (this) {
                this.f11987I |= 8;
            }
            return true;
        } else if (i != 57) {
            return false;
        } else {
            synchronized (this) {
                this.f11987I |= 16;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        ClassMasterViewModel classMasterViewModel = (ClassMasterViewModel) obj;
        return mo12340e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            ClassMasterViewModel classMasterViewModel = this.f11979D;
            if (classMasterViewModel != null) {
                z = true;
            }
            if (z) {
                classMasterViewModel.mo12269b1();
            }
        } else if (i == 2) {
            ClassMasterViewModel classMasterViewModel2 = this.f11979D;
            if (classMasterViewModel2 != null) {
                z = true;
            }
            if (z) {
                classMasterViewModel2.mo12268a1();
            }
        } else if (i == 3) {
            ClassMasterViewModel classMasterViewModel3 = this.f11979D;
            if (classMasterViewModel3 != null) {
                z = true;
            }
            if (z) {
                classMasterViewModel3.mo12267S0();
            }
        }
    }
}
