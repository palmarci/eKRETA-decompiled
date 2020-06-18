package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.switchmaterial.SwitchMaterial;
import g.a.a.b.a;
import h.l.h;
import h.l.i;
import h.l.o.d;
import h.l.o.e;
import h.l.o.f;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.login.LoginViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class ActivityLoginBindingImpl extends ActivityLoginBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f Y = null;
    public static final SparseIntArray Z = new SparseIntArray();
    public final FrameLayout M;
    public final View.OnClickListener N;
    public final View.OnClickListener O;
    public final View.OnClickListener P;
    public final View.OnClickListener Q;
    public final View.OnClickListener R;
    public final View.OnClickListener S;
    public h T = new h() {
        public void a() {
            String d2 = a.d((TextView) ActivityLoginBindingImpl.this.E);
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.L;
            if (loginViewModel != null) {
                loginViewModel.c(d2);
            }
        }
    };
    public h U = new h() {
        public void a() {
            boolean isChecked = ActivityLoginBindingImpl.this.I.isChecked();
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.L;
            if (loginViewModel != null) {
                loginViewModel.a(isChecked);
            }
        }
    };
    public h V = new h() {
        public void a() {
            String d2 = a.d(ActivityLoginBindingImpl.this.J);
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.L;
            if (loginViewModel != null) {
                loginViewModel.a(d2);
            }
        }
    };
    public h W = new h() {
        public void a() {
            String d2 = a.d((TextView) ActivityLoginBindingImpl.this.K);
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.L;
            if (loginViewModel != null) {
                loginViewModel.b(d2);
            }
        }
    };
    public long X = -1;

    static {
        Z.put(R.id.welcome_title_textview, 13);
        Z.put(R.id.username_textinputlayout, 14);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityLoginBindingImpl(h.l.f r21, android.view.View r22) {
        /*
            r20 = this;
            r2 = r20
            r1 = r22
            androidx.databinding.ViewDataBinding$f r0 = Y
            android.util.SparseIntArray r3 = Z
            r4 = 15
            r15 = r21
            java.lang.Object[] r18 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 9
            r0 = r18[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 8
            r0 = r18[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r3 = r18[r0]
            r6 = r3
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r3 = 11
            r3 = r18[r3]
            r7 = r3
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = 7
            r3 = r18[r3]
            r8 = r3
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r3 = 4
            r9 = r18[r3]
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            r14 = 3
            r10 = r18[r14]
            com.google.android.material.textfield.TextInputLayout r10 = (com.google.android.material.textfield.TextInputLayout) r10
            r11 = 10
            r11 = r18[r11]
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 12
            r12 = r18[r12]
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r13 = 6
            r16 = r18[r13]
            com.google.android.material.switchmaterial.SwitchMaterial r16 = (com.google.android.material.switchmaterial.SwitchMaterial) r16
            r13 = r16
            r3 = 5
            r16 = r18[r3]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r14 = r16
            r3 = 2
            r16 = r18[r3]
            com.google.android.material.textfield.TextInputEditText r16 = (com.google.android.material.textfield.TextInputEditText) r16
            r15 = r16
            r16 = 14
            r16 = r18[r16]
            com.google.android.material.textfield.TextInputLayout r16 = (com.google.android.material.textfield.TextInputLayout) r16
            r17 = 13
            r17 = r18[r17]
            android.widget.TextView r17 = (android.widget.TextView) r17
            r19 = 1
            r3 = r19
            r0 = r20
            r1 = r21
            r2 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$1 r0 = new hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$1
            r1 = r20
            r0.<init>()
            r1.T = r0
            hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$2 r0 = new hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$2
            r0.<init>()
            r1.U = r0
            hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$3 r0 = new hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$3
            r0.<init>()
            r1.V = r0
            hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$4 r0 = new hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl$4
            r0.<init>()
            r1.W = r0
            r2 = -1
            r1.X = r2
            android.widget.TextView r0 = r1.z
            r2 = 0
            r0.setTag(r2)
            android.widget.TextView r0 = r1.A
            r0.setTag(r2)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.B
            r0.setTag(r2)
            android.widget.TextView r0 = r1.C
            r0.setTag(r2)
            com.google.android.material.button.MaterialButton r0 = r1.D
            r0.setTag(r2)
            r0 = 0
            r0 = r18[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.M = r0
            android.widget.FrameLayout r0 = r1.M
            r0.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r1.E
            r0.setTag(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r1.F
            r0.setTag(r2)
            android.widget.TextView r0 = r1.G
            r0.setTag(r2)
            android.widget.FrameLayout r0 = r1.H
            r0.setTag(r2)
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r1.I
            r0.setTag(r2)
            android.widget.TextView r0 = r1.J
            r0.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r1.K
            r0.setTag(r2)
            r0 = r22
            r1.a((android.view.View) r0)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2 = 2
            r0.<init>(r1, r2)
            r1.N = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2 = 5
            r0.<init>(r1, r2)
            r1.O = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2 = 3
            r0.<init>(r1, r2)
            r1.P = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2 = 1
            r0.<init>(r1, r2)
            r1.Q = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2 = 6
            r0.<init>(r1, r2)
            r1.R = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2 = 4
            r0.<init>(r1, r2)
            r1.S = r0
            r20.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        View.OnFocusChangeListener onFocusChangeListener;
        String str3;
        String str4;
        synchronized (this) {
            j2 = this.X;
            this.X = 0;
        }
        LoginViewModel loginViewModel = this.L;
        boolean z4 = false;
        if ((2047 & j2) != 0) {
            String A = ((j2 & 1057) == 0 || loginViewModel == null) ? null : loginViewModel.A();
            boolean D = ((j2 & 1089) == 0 || loginViewModel == null) ? false : loginViewModel.D();
            View.OnFocusChangeListener I = ((j2 & 1041) == 0 || loginViewModel == null) ? null : loginViewModel.I();
            boolean d2 = ((j2 & 1537) == 0 || loginViewModel == null) ? false : loginViewModel.d();
            boolean L = ((j2 & 1029) == 0 || loginViewModel == null) ? false : loginViewModel.L();
            String R2 = ((j2 & 1027) == 0 || loginViewModel == null) ? null : loginViewModel.R();
            String n2 = ((j2 & 1281) == 0 || loginViewModel == null) ? null : loginViewModel.n();
            String G = ((j2 & 1033) == 0 || loginViewModel == null) ? null : loginViewModel.G();
            if (!((j2 & 1153) == 0 || loginViewModel == null)) {
                z4 = loginViewModel.M();
            }
            str2 = A;
            z = D;
            onFocusChangeListener = I;
            z2 = d2;
            z3 = L;
            str = R2;
            str4 = n2;
            str3 = G;
        } else {
            str4 = null;
            str3 = null;
            onFocusChangeListener = null;
            str2 = null;
            str = null;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((j2 & 1024) != 0) {
            this.z.setOnClickListener(this.O);
            this.A.setOnClickListener(this.S);
            this.B.setOnClickListener(this.Q);
            this.D.setOnClickListener(this.P);
            a.a((TextView) this.E, (e) null, (f) null, (d) null, this.T);
            this.G.setOnClickListener(this.R);
            SwitchMaterial switchMaterial = this.I;
            h hVar = this.U;
            if (hVar == null) {
                switchMaterial.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            } else {
                switchMaterial.setOnCheckedChangeListener(new h.l.o.a((CompoundButton.OnCheckedChangeListener) null, hVar));
            }
            this.J.setOnClickListener(this.N);
            a.a(this.J, (e) null, (f) null, (d) null, this.V);
            a.a((TextView) this.K, (e) null, (f) null, (d) null, this.W);
        }
        if ((j2 & 1281) != 0) {
            a.a(this.C, (CharSequence) str4);
        }
        if ((1153 & j2) != 0) {
            this.D.setEnabled(z4);
        }
        if ((j2 & 1033) != 0) {
            a.a((TextView) this.E, (CharSequence) str3);
        }
        if ((1041 & j2) != 0) {
            this.E.setOnFocusChangeListener(onFocusChangeListener);
        }
        if ((1029 & j2) != 0) {
            this.F.setPasswordVisibilityToggleEnabled(z3);
        }
        if ((j2 & 1537) != 0) {
            this.H.setVisibility(BindingConverters.a(z2));
        }
        if ((1089 & j2) != 0) {
            SwitchMaterial switchMaterial2 = this.I;
            boolean z5 = z;
            if (switchMaterial2.isChecked() != z5) {
                switchMaterial2.setChecked(z5);
            }
        }
        if ((j2 & 1057) != 0) {
            a.a(this.J, (CharSequence) str2);
        }
        if ((j2 & 1027) != 0) {
            a.a((TextView) this.K, (CharSequence) str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.X != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(LoginViewModel loginViewModel) {
        a(0, (i) loginViewModel);
        this.L = loginViewModel;
        synchronized (this) {
            this.X |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.X = 1024;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((LoginViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.X |= 1;
            }
            return true;
        } else if (i2 == 58) {
            synchronized (this) {
                this.X |= 2;
            }
            return true;
        } else if (i2 == 105) {
            synchronized (this) {
                this.X |= 4;
            }
            return true;
        } else if (i2 == 12) {
            synchronized (this) {
                this.X |= 8;
            }
            return true;
        } else if (i2 == 4) {
            synchronized (this) {
                this.X |= 16;
            }
            return true;
        } else if (i2 == 35) {
            synchronized (this) {
                this.X |= 32;
            }
            return true;
        } else if (i2 == 74) {
            synchronized (this) {
                this.X |= 64;
            }
            return true;
        } else if (i2 == 52) {
            synchronized (this) {
                this.X |= 128;
            }
            return true;
        } else if (i2 == 2) {
            synchronized (this) {
                this.X |= 256;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.X |= 512;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        LoginViewModel loginViewModel = (LoginViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        boolean z = true;
        switch (i2) {
            case 1:
                LoginViewModel loginViewModel = this.L;
                if (loginViewModel == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel.s();
                    return;
                }
                return;
            case 2:
                LoginViewModel loginViewModel2 = this.L;
                if (loginViewModel2 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel2.V();
                    return;
                }
                return;
            case 3:
                LoginViewModel loginViewModel3 = this.L;
                if (loginViewModel3 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel3.C();
                    return;
                }
                return;
            case 4:
                LoginViewModel loginViewModel4 = this.L;
                if (loginViewModel4 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel4.K();
                    return;
                }
                return;
            case 5:
                LoginViewModel loginViewModel5 = this.L;
                if (loginViewModel5 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel5.v();
                    return;
                }
                return;
            case 6:
                LoginViewModel loginViewModel6 = this.L;
                if (loginViewModel6 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel6.H();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
