package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.classmaster.ClassMasterViewModel;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;

public class ActivityClassMasterBindingImpl extends ActivityClassMasterBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f J = null;
    public static final SparseIntArray K = new SparseIntArray();
    public final CoordinatorLayout E;
    public final View.OnClickListener F;
    public final View.OnClickListener G;
    public final View.OnClickListener H;
    public long I = -1;

    static {
        K.put(R.id.app_bar_layout, 5);
        K.put(R.id.toolbar, 6);
        K.put(R.id.nested_scroll_view, 7);
        K.put(R.id.constraint_layout, 8);
        K.put(R.id.notifying_class_master, 9);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityClassMasterBindingImpl(h.l.f r21, android.view.View r22) {
        /*
            r20 = this;
            r13 = r20
            r14 = r22
            androidx.databinding.ViewDataBinding$f r0 = J
            android.util.SparseIntArray r1 = K
            r2 = 10
            r3 = r21
            java.lang.Object[] r15 = androidx.databinding.ViewDataBinding.a((h.l.f) r3, (android.view.View) r14, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r0 = 5
            r0 = r15[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 4
            r0 = r15[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r12 = 2
            r0 = r15[r12]
            r6 = r0
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r11 = 3
            r0 = r15[r11]
            r7 = r0
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r0 = 8
            r0 = r15[r0]
            r8 = r0
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r10 = 1
            r0 = r15[r10]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 7
            r0 = r15[r0]
            r16 = r0
            androidx.core.widget.NestedScrollView r16 = (androidx.core.widget.NestedScrollView) r16
            r0 = 9
            r0 = r15[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 6
            r0 = r15[r0]
            r18 = r0
            androidx.appcompat.widget.Toolbar r18 = (androidx.appcompat.widget.Toolbar) r18
            r19 = 1
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r19
            r10 = r16
            r11 = r17
            r12 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.I = r0
            com.google.android.material.button.MaterialButton r0 = r13.z
            r1 = 0
            r0.setTag(r1)
            com.google.android.material.button.MaterialButton r0 = r13.A
            r0.setTag(r1)
            com.google.android.material.button.MaterialButton r0 = r13.B
            r0.setTag(r1)
            r0 = 0
            r0 = r15[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r13.E = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r13.E
            r0.setTag(r1)
            android.widget.TextView r0 = r13.C
            r0.setTag(r1)
            r13.a((android.view.View) r14)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 2
            r0.<init>(r13, r1)
            r13.F = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 3
            r0.<init>(r13, r1)
            r13.G = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 1
            r0.<init>(r13, r1)
            r13.H = r0
            r20.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityClassMasterBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        synchronized (this) {
            j2 = this.I;
            this.I = 0;
        }
        String str2 = null;
        ClassMasterViewModel classMasterViewModel = this.D;
        boolean z4 = false;
        if ((63 & j2) != 0) {
            z2 = ((j2 & 49) == 0 || classMasterViewModel == null) ? false : classMasterViewModel.G0();
            z = ((j2 & 41) == 0 || classMasterViewModel == null) ? false : classMasterViewModel.u1();
            if (!((j2 & 37) == 0 || classMasterViewModel == null)) {
                z4 = classMasterViewModel.S0();
            }
            if (!((j2 & 35) == 0 || classMasterViewModel == null)) {
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
        if ((49 & j2) != 0) {
            this.z.setEnabled(z2);
        }
        if ((32 & j2) != 0) {
            this.z.setOnClickListener(this.G);
            this.A.setOnClickListener(this.H);
            this.B.setOnClickListener(this.F);
        }
        if ((37 & j2) != 0) {
            this.A.setEnabled(z3);
        }
        if ((j2 & 41) != 0) {
            this.B.setEnabled(z);
        }
        if ((j2 & 35) != 0) {
            a.a(this.C, (CharSequence) str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(ClassMasterViewModel classMasterViewModel) {
        a(0, (i) classMasterViewModel);
        this.D = classMasterViewModel;
        synchronized (this) {
            this.I |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.I = 32;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((ClassMasterViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        } else if (i2 == 87) {
            synchronized (this) {
                this.I |= 2;
            }
            return true;
        } else if (i2 == 82) {
            synchronized (this) {
                this.I |= 4;
            }
            return true;
        } else if (i2 == 28) {
            synchronized (this) {
                this.I |= 8;
            }
            return true;
        } else if (i2 != 57) {
            return false;
        } else {
            synchronized (this) {
                this.I |= 16;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        ClassMasterViewModel classMasterViewModel = (ClassMasterViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        boolean z = false;
        if (i2 == 1) {
            ClassMasterViewModel classMasterViewModel = this.D;
            if (classMasterViewModel != null) {
                z = true;
            }
            if (z) {
                classMasterViewModel.f1();
            }
        } else if (i2 == 2) {
            ClassMasterViewModel classMasterViewModel2 = this.D;
            if (classMasterViewModel2 != null) {
                z = true;
            }
            if (z) {
                classMasterViewModel2.e1();
            }
        } else if (i2 == 3) {
            ClassMasterViewModel classMasterViewModel3 = this.D;
            if (classMasterViewModel3 != null) {
                z = true;
            }
            if (z) {
                classMasterViewModel3.V0();
            }
        }
    }
}
