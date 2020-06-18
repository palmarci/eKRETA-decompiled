package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.h;
import h.l.i;
import h.l.k;
import h.l.o.f;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModel;
import hu.ekreta.ellenorzo.generated.callback.SpinnerItemSelectedListener;
import hu.ekreta.ellenorzo.util.binding.SpinnerBindings;

public class ActivityAddresseeSelectorBindingImpl extends ActivityAddresseeSelectorBinding implements SpinnerItemSelectedListener.Listener {
    public static final ViewDataBinding.f K = null;
    public static final SparseIntArray L = new SparseIntArray();
    public final CoordinatorLayout E;
    public final SpinnerBindings.SpinnerItemSelectedListener F;
    public final SpinnerBindings.SpinnerItemSelectedListener G;
    public OnTextChangedImpl H;
    public h I = new h() {
        public void a() {
            String d2 = a.d((TextView) ActivityAddresseeSelectorBindingImpl.this.B);
            AddresseeSelectorViewModel addresseeSelectorViewModel = ActivityAddresseeSelectorBindingImpl.this.D;
            if (addresseeSelectorViewModel != null) {
                addresseeSelectorViewModel.k(d2);
            }
        }
    };
    public long J = -1;

    public static class OnTextChangedImpl implements f {

        /* renamed from: a  reason: collision with root package name */
        public AddresseeSelectorViewModel f5305a;

        public OnTextChangedImpl a(AddresseeSelectorViewModel addresseeSelectorViewModel) {
            this.f5305a = addresseeSelectorViewModel;
            if (addresseeSelectorViewModel == null) {
                return null;
            }
            return this;
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            this.f5305a.a(charSequence, i2, i3, i4);
        }
    }

    static {
        L.put(R.id.app_bar_layout, 5);
        L.put(R.id.addresseeSelector_toolbar, 6);
        L.put(R.id.addresseeSelector_barrier, 7);
        L.put(R.id.addresseeSelector_searchTextInputLayout, 8);
        L.put(R.id.addresseeSelector_divider, 9);
        L.put(R.id.addresseeSelector_recycleView, 10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityAddresseeSelectorBindingImpl(h.l.f r21, android.view.View r22) {
        /*
            r20 = this;
            r14 = r20
            r15 = r22
            androidx.databinding.ViewDataBinding$f r0 = K
            android.util.SparseIntArray r1 = L
            r2 = 11
            r3 = r21
            java.lang.Object[] r16 = androidx.databinding.ViewDataBinding.a((h.l.f) r3, (android.view.View) r15, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r0 = 7
            r0 = r16[r0]
            r4 = r0
            androidx.constraintlayout.widget.Barrier r4 = (androidx.constraintlayout.widget.Barrier) r4
            r13 = 2
            r0 = r16[r13]
            r5 = r0
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r0 = 9
            r0 = r16[r0]
            r6 = r0
            android.view.View r6 = (android.view.View) r6
            r0 = 4
            r0 = r16[r0]
            r7 = r0
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r0 = 10
            r0 = r16[r0]
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r0 = 3
            r0 = r16[r0]
            r9 = r0
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            r0 = 8
            r0 = r16[r0]
            r10 = r0
            com.google.android.material.textfield.TextInputLayout r10 = (com.google.android.material.textfield.TextInputLayout) r10
            r0 = 6
            r0 = r16[r0]
            r11 = r0
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            r12 = 1
            r0 = r16[r12]
            r17 = r0
            android.widget.Spinner r17 = (android.widget.Spinner) r17
            r0 = 5
            r0 = r16[r0]
            r18 = r0
            com.google.android.material.appbar.AppBarLayout r18 = (com.google.android.material.appbar.AppBarLayout) r18
            r19 = 3
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r19
            r12 = r17
            r13 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl$1 r0 = new hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl$1
            r0.<init>()
            r14.I = r0
            r0 = -1
            r14.J = r0
            android.widget.Spinner r0 = r14.z
            r1 = 0
            r0.setTag(r1)
            android.widget.FrameLayout r0 = r14.A
            r0.setTag(r1)
            com.google.android.material.textfield.TextInputEditText r0 = r14.B
            r0.setTag(r1)
            android.widget.Spinner r0 = r14.C
            r0.setTag(r1)
            r0 = 0
            r0 = r16[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r14.E = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r14.E
            r0.setTag(r1)
            r14.a((android.view.View) r15)
            hu.ekreta.ellenorzo.generated.callback.SpinnerItemSelectedListener r0 = new hu.ekreta.ellenorzo.generated.callback.SpinnerItemSelectedListener
            r1 = 2
            r0.<init>(r14, r1)
            r14.F = r0
            hu.ekreta.ellenorzo.generated.callback.SpinnerItemSelectedListener r0 = new hu.ekreta.ellenorzo.generated.callback.SpinnerItemSelectedListener
            r1 = 1
            r0.<init>(r14, r1)
            r14.G = r0
            r20.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V1() {
        /*
            r27 = this;
            r1 = r27
            monitor-enter(r27)
            long r2 = r1.J     // Catch:{ all -> 0x010a }
            r4 = 0
            r1.J = r4     // Catch:{ all -> 0x010a }
            monitor-exit(r27)     // Catch:{ all -> 0x010a }
            hu.ekreta.ellenorzo.addresseeselector.viewmodel.AddresseeSelectorViewModel r0 = r1.D
            r6 = 127(0x7f, double:6.27E-322)
            long r6 = r6 & r2
            r10 = 98
            r12 = 67
            r14 = 74
            r16 = 70
            r18 = 66
            r8 = 0
            r9 = 0
            int r22 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r22 == 0) goto L_0x009b
            long r6 = r2 & r12
            int r22 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r22 == 0) goto L_0x0037
            if (r0 == 0) goto L_0x002c
            h.l.k r6 = r0.J1()
            goto L_0x002d
        L_0x002c:
            r6 = r9
        L_0x002d:
            r1.a((int) r8, (h.l.i) r6)
            if (r6 == 0) goto L_0x0037
            T r6 = r6.e
            java.util.List r6 = (java.util.List) r6
            goto L_0x0038
        L_0x0037:
            r6 = r9
        L_0x0038:
            long r22 = r2 & r14
            int r7 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            boolean r7 = r0.X0()
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            long r22 = r2 & r10
            int r24 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r24 == 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            boolean r8 = r0.d()
        L_0x0052:
            r20 = 82
            long r22 = r2 & r20
            int r24 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r24 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x0061
            java.lang.String r22 = r0.h1()
            goto L_0x0063
        L_0x0061:
            r22 = r9
        L_0x0063:
            long r23 = r2 & r18
            int r25 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r25 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x007b
            hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl$OnTextChangedImpl r12 = r1.H
            if (r12 != 0) goto L_0x0076
            hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl$OnTextChangedImpl r12 = new hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl$OnTextChangedImpl
            r12.<init>()
            r1.H = r12
        L_0x0076:
            hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl$OnTextChangedImpl r12 = r12.a(r0)
            goto L_0x007c
        L_0x007b:
            r12 = r9
        L_0x007c:
            long r25 = r2 & r16
            int r13 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0096
            if (r0 == 0) goto L_0x0089
            h.l.k r0 = r0.x1()
            goto L_0x008a
        L_0x0089:
            r0 = r9
        L_0x008a:
            r13 = 2
            r1.a((int) r13, (h.l.i) r0)
            if (r0 == 0) goto L_0x0096
            T r0 = r0.e
            java.util.List r0 = (java.util.List) r0
            r13 = r6
            goto L_0x0098
        L_0x0096:
            r13 = r6
            r0 = r9
        L_0x0098:
            r6 = r22
            goto L_0x00a0
        L_0x009b:
            r0 = r9
            r6 = r0
            r12 = r6
            r13 = r12
            r7 = 0
        L_0x00a0:
            long r14 = r14 & r2
            int r22 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r22 == 0) goto L_0x00ae
            android.widget.Spinner r14 = r1.z
            int r7 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r7)
            r14.setVisibility(r7)
        L_0x00ae:
            long r14 = r2 & r16
            int r7 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00bb
            android.widget.Spinner r7 = r1.z
            hu.ekreta.ellenorzo.util.binding.SpinnerBindings$Companion r14 = hu.ekreta.ellenorzo.util.binding.SpinnerBindings.Companion
            r14.a((android.widget.Spinner) r7, (java.util.List<? extends java.lang.Object>) r0)
        L_0x00bb:
            r14 = 64
            long r14 = r14 & r2
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
            android.widget.Spinner r0 = r1.z
            hu.ekreta.ellenorzo.util.binding.SpinnerBindings$SpinnerItemSelectedListener r7 = r1.F
            hu.ekreta.ellenorzo.util.binding.SpinnerBindings$Companion r14 = hu.ekreta.ellenorzo.util.binding.SpinnerBindings.Companion
            r14.a((android.widget.Spinner) r0, (hu.ekreta.ellenorzo.util.binding.SpinnerBindings.SpinnerItemSelectedListener) r7)
            android.widget.Spinner r0 = r1.C
            hu.ekreta.ellenorzo.util.binding.SpinnerBindings$SpinnerItemSelectedListener r7 = r1.G
            hu.ekreta.ellenorzo.util.binding.SpinnerBindings$Companion r14 = hu.ekreta.ellenorzo.util.binding.SpinnerBindings.Companion
            r14.a((android.widget.Spinner) r0, (hu.ekreta.ellenorzo.util.binding.SpinnerBindings.SpinnerItemSelectedListener) r7)
        L_0x00d4:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00e2
            android.widget.FrameLayout r0 = r1.A
            int r7 = hu.ekreta.ellenorzo.util.binding.BindingConverters.a((boolean) r8)
            r0.setVisibility(r7)
        L_0x00e2:
            r7 = 82
            long r7 = r7 & r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00ee
            com.google.android.material.textfield.TextInputEditText r0 = r1.B
            g.a.a.b.a.a((android.widget.TextView) r0, (java.lang.CharSequence) r6)
        L_0x00ee:
            long r6 = r2 & r18
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00fb
            com.google.android.material.textfield.TextInputEditText r0 = r1.B
            h.l.h r6 = r1.I
            g.a.a.b.a.a((android.widget.TextView) r0, (h.l.o.e) r9, (h.l.o.f) r12, (h.l.o.d) r9, (h.l.h) r6)
        L_0x00fb:
            r6 = 67
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0109
            android.widget.Spinner r0 = r1.C
            hu.ekreta.ellenorzo.util.binding.SpinnerBindings$Companion r2 = hu.ekreta.ellenorzo.util.binding.SpinnerBindings.Companion
            r2.a((android.widget.Spinner) r0, (java.util.List<? extends java.lang.Object>) r13)
        L_0x0109:
            return
        L_0x010a:
            r0 = move-exception
            monitor-exit(r27)     // Catch:{ all -> 0x010a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityAddresseeSelectorBindingImpl.V1():void");
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.J != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(AddresseeSelectorViewModel addresseeSelectorViewModel) {
        a(1, (i) addresseeSelectorViewModel);
        this.D = addresseeSelectorViewModel;
        synchronized (this) {
            this.J |= 2;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.J = 64;
        }
        b2();
    }

    public final void b(int i2, Object obj) {
        boolean z = false;
        if (i2 == 1) {
            AddresseeSelectorViewModel addresseeSelectorViewModel = this.D;
            if (addresseeSelectorViewModel != null) {
                z = true;
            }
            if (z) {
                addresseeSelectorViewModel.b(obj);
            }
        } else if (i2 == 2) {
            AddresseeSelectorViewModel addresseeSelectorViewModel2 = this.D;
            if (addresseeSelectorViewModel2 != null) {
                z = true;
            }
            if (z) {
                addresseeSelectorViewModel2.a(obj);
            }
        }
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((AddresseeSelectorViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        } else if (i2 == 16) {
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        } else if (i2 == 19) {
            synchronized (this) {
                this.J |= 8;
            }
            return true;
        } else if (i2 == 92) {
            synchronized (this) {
                this.J |= 4;
            }
            return true;
        } else if (i2 == 44) {
            synchronized (this) {
                this.J |= 16;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.J |= 32;
            }
            return true;
        }
    }

    public final boolean f(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    public final boolean g(int i2) {
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 4;
        }
        return true;
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 == 0) {
            k kVar = (k) obj;
            return f(i3);
        } else if (i2 == 1) {
            AddresseeSelectorViewModel addresseeSelectorViewModel = (AddresseeSelectorViewModel) obj;
            return e(i3);
        } else if (i2 != 2) {
            return false;
        } else {
            k kVar2 = (k) obj;
            return g(i3);
        }
    }
}
