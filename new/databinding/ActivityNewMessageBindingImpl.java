package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.h;
import h.l.i;
import h.l.o.d;
import h.l.o.e;
import h.l.o.f;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.newmessage.viewmodel.NewMessageViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class ActivityNewMessageBindingImpl extends ActivityNewMessageBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f L = null;
    public static final SparseIntArray M = new SparseIntArray();
    public final CoordinatorLayout G;
    public final View.OnClickListener H;
    public h I = new h() {
        public void a() {
            String d2 = a.d((TextView) ActivityNewMessageBindingImpl.this.C);
            NewMessageViewModel newMessageViewModel = ActivityNewMessageBindingImpl.this.F;
            if (newMessageViewModel != null) {
                newMessageViewModel.a((CharSequence) d2);
            }
        }
    };
    public h J = new h() {
        public void a() {
            String d2 = a.d((TextView) ActivityNewMessageBindingImpl.this.E);
            NewMessageViewModel newMessageViewModel = ActivityNewMessageBindingImpl.this.F;
            if (newMessageViewModel != null) {
                newMessageViewModel.o(d2);
            }
        }
    };
    public long K = -1;

    static {
        M.put(R.id.app_bar_layout, 7);
        M.put(R.id.newMessage_toolbar, 8);
        M.put(R.id.nested_scroll_view, 9);
        M.put(R.id.newMessage_addresseeBarrier, 10);
        M.put(R.id.newMessage_textInputLayout_subject, 11);
        M.put(R.id.attachments_view, 12);
        M.put(R.id.newMessage_textInputLayout_message, 13);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityNewMessageBindingImpl(h.l.f r19, android.view.View r20) {
        /*
            r18 = this;
            r2 = r18
            r1 = r20
            androidx.databinding.ViewDataBinding$f r0 = L
            android.util.SparseIntArray r3 = M
            r4 = 14
            r15 = r19
            java.lang.Object[] r17 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 7
            r0 = r17[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 12
            r0 = r17[r0]
            r5 = r0
            hu.ekreta.ellenorzo.attachment.AttachmentView r5 = (hu.ekreta.ellenorzo.attachment.AttachmentView) r5
            r0 = 9
            r0 = r17[r0]
            r6 = r0
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r0 = 3
            r0 = r17[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2
            r0 = r17[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 10
            r0 = r17[r0]
            r9 = r0
            androidx.constraintlayout.widget.Barrier r9 = (androidx.constraintlayout.widget.Barrier) r9
            r0 = 1
            r3 = r17[r0]
            r10 = r3
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r3 = 5
            r3 = r17[r3]
            r11 = r3
            com.google.android.material.textfield.TextInputEditText r11 = (com.google.android.material.textfield.TextInputEditText) r11
            r3 = 6
            r3 = r17[r3]
            r12 = r3
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r3 = 4
            r3 = r17[r3]
            r13 = r3
            com.google.android.material.textfield.TextInputEditText r13 = (com.google.android.material.textfield.TextInputEditText) r13
            r3 = 13
            r3 = r17[r3]
            r14 = r3
            com.google.android.material.textfield.TextInputLayout r14 = (com.google.android.material.textfield.TextInputLayout) r14
            r3 = 11
            r3 = r17[r3]
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            r15 = r3
            r3 = 8
            r3 = r17[r3]
            r16 = r3
            androidx.appcompat.widget.Toolbar r16 = (androidx.appcompat.widget.Toolbar) r16
            r3 = 1
            r0 = r18
            r1 = r19
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl$1 r0 = new hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl$1
            r1 = r18
            r0.<init>()
            r1.I = r0
            hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl$2 r0 = new hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl$2
            r0.<init>()
            r1.J = r0
            r2 = -1
            r1.K = r2
            r0 = 0
            r0 = r17[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r1.G = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.G
            r2 = 0
            r0.setTag(r2)
            android.widget.TextView r0 = r1.z
            r0.setTag(r2)
            android.widget.TextView r0 = r1.A
            r0.setTag(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.B
            r0.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r1.C
            r0.setTag(r2)
            android.widget.FrameLayout r0 = r1.D
            r0.setTag(r2)
            com.google.android.material.textfield.TextInputEditText r0 = r1.E
            r0.setTag(r2)
            r0 = r20
            r1.a((android.view.View) r0)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r2 = 1
            r0.<init>(r1, r2)
            r1.H = r0
            r18.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityNewMessageBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence charSequence;
        synchronized (this) {
            j2 = this.K;
            this.K = 0;
        }
        NewMessageViewModel newMessageViewModel = this.F;
        boolean z4 = false;
        if ((127 & j2) != 0) {
            if ((j2 & 67) != 0) {
                z3 = newMessageViewModel != null ? newMessageViewModel.H0() : false;
                z2 = !z3;
            } else {
                z3 = false;
                z2 = false;
            }
            z = ((j2 & 97) == 0 || newMessageViewModel == null) ? false : newMessageViewModel.d();
            String j3 = ((j2 & 73) == 0 || newMessageViewModel == null) ? null : newMessageViewModel.j();
            if (!((j2 & 69) == 0 || newMessageViewModel == null)) {
                z4 = newMessageViewModel.t1();
            }
            charSequence = ((j2 & 81) == 0 || newMessageViewModel == null) ? null : newMessageViewModel.A1();
            str = j3;
        } else {
            charSequence = null;
            str = null;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((j2 & 64) != 0) {
            this.z.setOnClickListener(this.H);
            a.a((TextView) this.C, (e) null, (f) null, (d) null, this.I);
            a.a((TextView) this.E, (e) null, (f) null, (d) null, this.J);
        }
        if ((j2 & 69) != 0) {
            this.z.setVisibility(BindingConverters.a(z4));
        }
        if ((j2 & 67) != 0) {
            this.A.setVisibility(BindingConverters.a(z3));
            this.B.setVisibility(BindingConverters.a(z2));
        }
        if ((81 & j2) != 0) {
            a.a((TextView) this.C, charSequence);
        }
        if ((j2 & 97) != 0) {
            this.D.setVisibility(BindingConverters.a(z));
        }
        if ((j2 & 73) != 0) {
            a.a((TextView) this.E, (CharSequence) str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(NewMessageViewModel newMessageViewModel) {
        a(0, (i) newMessageViewModel);
        this.F = newMessageViewModel;
        synchronized (this) {
            this.K |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.K = 64;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((NewMessageViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.K |= 1;
            }
            return true;
        } else if (i2 == 115) {
            synchronized (this) {
                this.K |= 2;
            }
            return true;
        } else if (i2 == 95) {
            synchronized (this) {
                this.K |= 4;
            }
            return true;
        } else if (i2 == 70) {
            synchronized (this) {
                this.K |= 8;
            }
            return true;
        } else if (i2 == 102) {
            synchronized (this) {
                this.K |= 16;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.K |= 32;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        NewMessageViewModel newMessageViewModel = (NewMessageViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        NewMessageViewModel newMessageViewModel = this.F;
        if (newMessageViewModel != null) {
            newMessageViewModel.l1();
        }
    }
}
