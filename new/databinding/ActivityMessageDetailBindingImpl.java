package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.message.MessageDetailViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;
import hu.ekreta.ellenorzo.util.binding.WebViewBindings;

public class ActivityMessageDetailBindingImpl extends ActivityMessageDetailBinding {
    public static final ViewDataBinding.f K = null;
    public static final SparseIntArray L = new SparseIntArray();
    public final CoordinatorLayout H;
    public final ConstraintLayout I;
    public long J = -1;

    static {
        L.put(R.id.app_bar_layout, 9);
        L.put(R.id.toolbar, 10);
        L.put(R.id.nested_scroll_view, 11);
        L.put(R.id.message_addressee_caption, 12);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityMessageDetailBindingImpl(h.l.f r20, android.view.View r21) {
        /*
            r19 = this;
            r15 = r19
            r14 = r21
            androidx.databinding.ViewDataBinding$f r0 = K
            android.util.SparseIntArray r1 = L
            r2 = 13
            r3 = r20
            java.lang.Object[] r16 = androidx.databinding.ViewDataBinding.a((h.l.f) r3, (android.view.View) r14, (int) r2, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r1)
            r0 = 9
            r0 = r16[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 12
            r0 = r16[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r16[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 7
            r0 = r16[r0]
            r7 = r0
            hu.ekreta.ellenorzo.attachment.AttachmentView r7 = (hu.ekreta.ellenorzo.attachment.AttachmentView) r7
            r0 = 4
            r0 = r16[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 5
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 6
            r0 = r16[r0]
            r11 = r0
            android.webkit.WebView r11 = (android.webkit.WebView) r11
            r0 = 11
            r0 = r16[r0]
            r12 = r0
            androidx.core.widget.NestedScrollView r12 = (androidx.core.widget.NestedScrollView) r12
            r0 = 8
            r0 = r16[r0]
            r13 = r0
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r0 = 10
            r0 = r16[r0]
            r17 = r0
            androidx.appcompat.widget.Toolbar r17 = (androidx.appcompat.widget.Toolbar) r17
            r18 = 1
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r18
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1
            r15.J = r0
            r0 = 0
            r0 = r16[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r15.H = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r15.H
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r15.I = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r15.I
            r0.setTag(r1)
            android.widget.TextView r0 = r15.z
            r0.setTag(r1)
            hu.ekreta.ellenorzo.attachment.AttachmentView r0 = r15.A
            r0.setTag(r1)
            android.widget.TextView r0 = r15.B
            r0.setTag(r1)
            android.widget.TextView r0 = r15.C
            r0.setTag(r1)
            android.widget.TextView r0 = r15.D
            r0.setTag(r1)
            android.webkit.WebView r0 = r15.E
            r0.setTag(r1)
            android.widget.FrameLayout r0 = r15.F
            r0.setTag(r1)
            r0 = r21
            r15.a((android.view.View) r0)
            r19.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityMessageDetailBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        synchronized (this) {
            j2 = this.J;
            this.J = 0;
        }
        MessageDetailViewModel messageDetailViewModel = this.G;
        boolean z2 = false;
        String str6 = null;
        if ((511 & j2) != 0) {
            boolean d2 = ((j2 & 385) == 0 || messageDetailViewModel == null) ? false : messageDetailViewModel.d();
            str3 = ((j2 & 265) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.h();
            String p0 = ((j2 & 259) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.p0();
            String q0 = ((j2 & 289) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.q0();
            String X = ((j2 & 261) == 0 || messageDetailViewModel == null) ? null : messageDetailViewModel.X();
            if (!((j2 & 321) == 0 || messageDetailViewModel == null)) {
                z2 = messageDetailViewModel.g();
            }
            if (!((j2 & 273) == 0 || messageDetailViewModel == null)) {
                str6 = messageDetailViewModel.t0();
            }
            str2 = str6;
            str = q0;
            str5 = X;
            z = d2;
            str4 = p0;
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            z = false;
        }
        if ((j2 & 261) != 0) {
            a.a(this.z, (CharSequence) str5);
        }
        if ((j2 & 321) != 0) {
            this.A.setVisibility(BindingConverters.a(z2));
        }
        if ((j2 & 265) != 0) {
            a.a(this.B, (CharSequence) str3);
        }
        if ((j2 & 259) != 0) {
            a.a(this.C, (CharSequence) str4);
        }
        if ((273 & j2) != 0) {
            a.a(this.D, (CharSequence) str2);
        }
        if ((289 & j2) != 0) {
            WebViewBindings.Companion.a(this.E, str);
        }
        if ((j2 & 385) != 0) {
            this.F.setVisibility(BindingConverters.a(z));
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.J != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(MessageDetailViewModel messageDetailViewModel) {
        a(0, (i) messageDetailViewModel);
        this.G = messageDetailViewModel;
        synchronized (this) {
            this.J |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.J = 256;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((MessageDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        } else if (i2 == 113) {
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        } else if (i2 == 111) {
            synchronized (this) {
                this.J |= 4;
            }
            return true;
        } else if (i2 == 64) {
            synchronized (this) {
                this.J |= 8;
            }
            return true;
        } else if (i2 == 106) {
            synchronized (this) {
                this.J |= 16;
            }
            return true;
        } else if (i2 == 18) {
            synchronized (this) {
                this.J |= 32;
            }
            return true;
        } else if (i2 == 3) {
            synchronized (this) {
                this.J |= 64;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.J |= 128;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        MessageDetailViewModel messageDetailViewModel = (MessageDetailViewModel) obj;
        return e(i3);
    }
}
