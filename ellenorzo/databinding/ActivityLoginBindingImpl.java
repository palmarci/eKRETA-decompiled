package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3704h;
import p211h.p258l.C3705i;
import p211h.p258l.p259o.C3715a;
import p211h.p258l.p259o.C3718d;
import p211h.p258l.p259o.C3719e;
import p211h.p258l.p259o.C3720f;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.login.LoginViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityLoginBindingImpl */
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements Listener {

    /* renamed from: Y */
    public static final C2867f f12103Y = null;

    /* renamed from: Z */
    public static final SparseIntArray f12104Z = new SparseIntArray();

    /* renamed from: M */
    public final FrameLayout f12105M;

    /* renamed from: N */
    public final OnClickListener f12106N;

    /* renamed from: O */
    public final OnClickListener f12107O;

    /* renamed from: P */
    public final OnClickListener f12108P;

    /* renamed from: Q */
    public final OnClickListener f12109Q;

    /* renamed from: R */
    public final OnClickListener f12110R;

    /* renamed from: S */
    public final OnClickListener f12111S;

    /* renamed from: T */
    public C3704h f12112T = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) ActivityLoginBindingImpl.this.f12094E);
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.f12101L;
            if (loginViewModel != null) {
                loginViewModel.mo13126c(d);
            }
        }
    };

    /* renamed from: U */
    public C3704h f12113U = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            boolean isChecked = ActivityLoginBindingImpl.this.f12098I.isChecked();
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.f12101L;
            if (loginViewModel != null) {
                loginViewModel.mo13124a(isChecked);
            }
        }
    };

    /* renamed from: V */
    public C3704h f12114V = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d(ActivityLoginBindingImpl.this.f12099J);
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.f12101L;
            if (loginViewModel != null) {
                loginViewModel.mo13123a(d);
            }
        }
    };

    /* renamed from: W */
    public C3704h f12115W = new C3704h() {
        /* renamed from: a */
        public void mo10528a() {
            String d = C3158a.m7893d((TextView) ActivityLoginBindingImpl.this.f12100K);
            LoginViewModel loginViewModel = ActivityLoginBindingImpl.this.f12101L;
            if (loginViewModel != null) {
                loginViewModel.mo13125b(d);
            }
        }
    };

    /* renamed from: X */
    public long f12116X = -1;

    static {
        f12104Z.put(C4014R.C4016id.welcome_title_textview, 13);
        f12104Z.put(C4014R.C4016id.username_textinputlayout, 14);
    }

    public ActivityLoginBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 15, f12103Y, f12104Z);
        super(fVar, view, 1, (TextView) a[9], (TextView) a[8], (ConstraintLayout) a[1], (TextView) a[11], (MaterialButton) a[7], (TextInputEditText) a[4], (TextInputLayout) a[3], (TextView) a[10], (FrameLayout) a[12], (SwitchMaterial) a[6], (TextView) a[5], (TextInputEditText) a[2], (TextInputLayout) a[14], (TextView) a[13]);
        this.f12102z.setTag(null);
        this.f12090A.setTag(null);
        this.f12091B.setTag(null);
        this.f12092C.setTag(null);
        this.f12093D.setTag(null);
        this.f12105M = (FrameLayout) a[0];
        this.f12105M.setTag(null);
        this.f12094E.setTag(null);
        this.f12095F.setTag(null);
        this.f12096G.setTag(null);
        this.f12097H.setTag(null);
        this.f12098I.setTag(null);
        this.f12099J.setTag(null);
        this.f12100K.setTag(null);
        mo6098a(view);
        this.f12106N = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 5);
        this.f12107O = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 3);
        this.f12108P = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        this.f12109Q = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 6);
        this.f12110R = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 4);
        this.f12111S = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        CharSequence charSequence2;
        OnFocusChangeListener onFocusChangeListener;
        boolean z;
        boolean z2;
        CharSequence charSequence3;
        boolean z3;
        CharSequence charSequence4;
        synchronized (this) {
            j = this.f12116X;
            this.f12116X = 0;
        }
        LoginViewModel loginViewModel = this.f12101L;
        boolean z4 = false;
        if ((2047 & j) != 0) {
            CharSequence A = ((j & 1057) == 0 || loginViewModel == null) ? null : loginViewModel.mo13112A();
            boolean D = ((j & 1089) == 0 || loginViewModel == null) ? false : loginViewModel.mo13114D();
            onFocusChangeListener = ((j & 1041) == 0 || loginViewModel == null) ? null : loginViewModel.mo13117I();
            boolean d = ((j & 1537) == 0 || loginViewModel == null) ? false : loginViewModel.mo13127d();
            boolean L = ((j & 1029) == 0 || loginViewModel == null) ? false : loginViewModel.mo13119L();
            CharSequence R = ((j & 1027) == 0 || loginViewModel == null) ? null : loginViewModel.mo13121R();
            CharSequence n = ((j & 1281) == 0 || loginViewModel == null) ? null : loginViewModel.mo13128n();
            CharSequence G = ((j & 1033) == 0 || loginViewModel == null) ? null : loginViewModel.mo13115G();
            if ((j & 1153) == 0 || loginViewModel == null) {
                charSequence2 = A;
                z = D;
                z4 = d;
                z2 = L;
                charSequence = R;
                charSequence4 = n;
                charSequence3 = G;
                z3 = false;
            } else {
                charSequence2 = A;
                z = D;
                z3 = loginViewModel.mo13120M();
                z4 = d;
                z2 = L;
                charSequence = R;
                charSequence4 = n;
                charSequence3 = G;
            }
        } else {
            charSequence4 = null;
            charSequence3 = null;
            onFocusChangeListener = null;
            charSequence2 = null;
            charSequence = null;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((j & 1024) != 0) {
            this.f12102z.setOnClickListener(this.f12106N);
            this.f12090A.setOnClickListener(this.f12110R);
            this.f12091B.setOnClickListener(this.f12108P);
            this.f12093D.setOnClickListener(this.f12107O);
            C3158a.m7849a((TextView) this.f12094E, (C3719e) null, (C3720f) null, (C3718d) null, this.f12112T);
            this.f12096G.setOnClickListener(this.f12109Q);
            SwitchMaterial switchMaterial = this.f12098I;
            C3704h hVar = this.f12113U;
            if (hVar == null) {
                switchMaterial.setOnCheckedChangeListener(null);
            } else {
                switchMaterial.setOnCheckedChangeListener(new C3715a(null, hVar));
            }
            this.f12099J.setOnClickListener(this.f12111S);
            C3158a.m7849a(this.f12099J, (C3719e) null, (C3720f) null, (C3718d) null, this.f12114V);
            C3158a.m7849a((TextView) this.f12100K, (C3719e) null, (C3720f) null, (C3718d) null, this.f12115W);
        }
        if ((j & 1281) != 0) {
            C3158a.m7850a(this.f12092C, charSequence4);
        }
        if ((j & 1153) != 0) {
            this.f12093D.setEnabled(z3);
        }
        if ((1033 & j) != 0) {
            C3158a.m7850a((TextView) this.f12094E, charSequence3);
        }
        if ((j & 1041) != 0) {
            this.f12094E.setOnFocusChangeListener(onFocusChangeListener);
        }
        if ((1029 & j) != 0) {
            this.f12095F.setPasswordVisibilityToggleEnabled(z2);
        }
        if ((1537 & j) != 0) {
            this.f12097H.setVisibility(BindingConverters.m14795a(z4));
        }
        if ((j & 1089) != 0) {
            SwitchMaterial switchMaterial2 = this.f12098I;
            if (switchMaterial2.isChecked() != z) {
                switchMaterial2.setChecked(z);
            }
        }
        if ((j & 1057) != 0) {
            C3158a.m7850a(this.f12099J, charSequence2);
        }
        if ((j & 1027) != 0) {
            C3158a.m7850a((TextView) this.f12100K, charSequence);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12116X != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12116X = 1024;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12357a(LoginViewModel loginViewModel) {
        mo6103a(0, (C3705i) loginViewModel);
        this.f12101L = loginViewModel;
        synchronized (this) {
            this.f12116X |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12357a((LoginViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12358e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12116X |= 1;
            }
            return true;
        } else if (i == 58) {
            synchronized (this) {
                this.f12116X |= 2;
            }
            return true;
        } else if (i == 103) {
            synchronized (this) {
                this.f12116X |= 4;
            }
            return true;
        } else if (i == 13) {
            synchronized (this) {
                this.f12116X |= 8;
            }
            return true;
        } else if (i == 4) {
            synchronized (this) {
                this.f12116X |= 16;
            }
            return true;
        } else if (i == 35) {
            synchronized (this) {
                this.f12116X |= 32;
            }
            return true;
        } else if (i == 74) {
            synchronized (this) {
                this.f12116X |= 64;
            }
            return true;
        } else if (i == 51) {
            synchronized (this) {
                this.f12116X |= 128;
            }
            return true;
        } else if (i == 2) {
            synchronized (this) {
                this.f12116X |= 256;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12116X |= 512;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        LoginViewModel loginViewModel = (LoginViewModel) obj;
        return mo12358e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        boolean z = true;
        switch (i) {
            case 1:
                LoginViewModel loginViewModel = this.f12101L;
                if (loginViewModel == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel.mo13129s();
                    return;
                }
                return;
            case 2:
                LoginViewModel loginViewModel2 = this.f12101L;
                if (loginViewModel2 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel2.mo13122V();
                    return;
                }
                return;
            case 3:
                LoginViewModel loginViewModel3 = this.f12101L;
                if (loginViewModel3 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel3.mo13113C();
                    return;
                }
                return;
            case 4:
                LoginViewModel loginViewModel4 = this.f12101L;
                if (loginViewModel4 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel4.mo13118K();
                    return;
                }
                return;
            case 5:
                LoginViewModel loginViewModel5 = this.f12101L;
                if (loginViewModel5 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel5.mo13131v();
                    return;
                }
                return;
            case 6:
                LoginViewModel loginViewModel6 = this.f12101L;
                if (loginViewModel6 == null) {
                    z = false;
                }
                if (z) {
                    loginViewModel6.mo13116H();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
