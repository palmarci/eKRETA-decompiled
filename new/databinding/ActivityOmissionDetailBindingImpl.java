package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.omission.detail.OmissionDetailViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class ActivityOmissionDetailBindingImpl extends ActivityOmissionDetailBinding {
    public static final ViewDataBinding.f M = null;
    public static final SparseIntArray N = new SparseIntArray();
    public final CoordinatorLayout K;
    public long L = -1;

    static {
        N.put(R.id.app_bar_layout, 11);
        N.put(R.id.toolbar, 12);
        N.put(R.id.nested_scroll_view, 13);
        N.put(R.id.constraint_layout, 14);
        N.put(R.id.subject_caption, 15);
        N.put(R.id.subject_divider, 16);
        N.put(R.id.type_caption, 17);
        N.put(R.id.type_divider, 18);
        N.put(R.id.mode_caption, 19);
        N.put(R.id.mode_divider, 20);
        N.put(R.id.justification_state_caption, 21);
        N.put(R.id.justification_state_divider, 22);
        N.put(R.id.lesson_start_time_caption, 23);
        N.put(R.id.lesson_start_time_divider, 24);
        N.put(R.id.teacher_caption, 25);
        N.put(R.id.teacher_divider, 26);
        N.put(R.id.creating_time_caption, 27);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityOmissionDetailBindingImpl(h.l.f r33, android.view.View r34) {
        /*
            r32 = this;
            r2 = r32
            r1 = r34
            androidx.databinding.ViewDataBinding$f r0 = M
            android.util.SparseIntArray r3 = N
            r4 = 28
            r15 = r33
            java.lang.Object[] r31 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 11
            r0 = r31[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 14
            r0 = r31[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 27
            r0 = r31[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 10
            r0 = r31[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 1
            r0 = r31[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 3
            r0 = r31[r0]
            r9 = r0
            android.view.View r9 = (android.view.View) r9
            r0 = 2
            r0 = r31[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 21
            r0 = r31[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 22
            r0 = r31[r0]
            r12 = r0
            android.view.View r12 = (android.view.View) r12
            r0 = 7
            r0 = r31[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 23
            r0 = r31[r0]
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = 24
            r0 = r31[r0]
            android.view.View r0 = (android.view.View) r0
            r15 = r0
            r0 = 8
            r0 = r31[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 19
            r0 = r31[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 20
            r0 = r31[r0]
            r18 = r0
            android.view.View r18 = (android.view.View) r18
            r0 = 6
            r0 = r31[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 13
            r0 = r31[r0]
            r20 = r0
            androidx.core.widget.NestedScrollView r20 = (androidx.core.widget.NestedScrollView) r20
            r0 = 15
            r0 = r31[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 16
            r0 = r31[r0]
            r22 = r0
            android.view.View r22 = (android.view.View) r22
            r0 = 4
            r0 = r31[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 25
            r0 = r31[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 26
            r0 = r31[r0]
            r25 = r0
            android.view.View r25 = (android.view.View) r25
            r0 = 9
            r0 = r31[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 12
            r0 = r31[r0]
            r27 = r0
            androidx.appcompat.widget.Toolbar r27 = (androidx.appcompat.widget.Toolbar) r27
            r0 = 17
            r0 = r31[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 18
            r0 = r31[r0]
            r29 = r0
            android.view.View r29 = (android.view.View) r29
            r0 = 5
            r0 = r31[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r3 = 1
            r0 = r32
            r1 = r33
            r2 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = -1
            r2 = r32
            r2.L = r0
            android.widget.TextView r0 = r2.z
            r1 = 0
            r0.setTag(r1)
            android.widget.TextView r0 = r2.A
            r0.setTag(r1)
            android.view.View r0 = r2.B
            r0.setTag(r1)
            android.widget.TextView r0 = r2.C
            r0.setTag(r1)
            android.widget.TextView r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.E
            r0.setTag(r1)
            r0 = 0
            r0 = r31[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.K = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.K
            r0.setTag(r1)
            android.widget.TextView r0 = r2.F
            r0.setTag(r1)
            android.widget.TextView r0 = r2.G
            r0.setTag(r1)
            android.widget.TextView r0 = r2.H
            r0.setTag(r1)
            android.widget.TextView r0 = r2.I
            r0.setTag(r1)
            r0 = r34
            r2.a((android.view.View) r0)
            r32.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityOmissionDetailBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        synchronized (this) {
            j2 = this.L;
            this.L = 0;
        }
        OmissionDetailViewModel omissionDetailViewModel = this.J;
        String str9 = null;
        if ((1023 & j2) != 0) {
            str7 = ((j2 & 769) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.y();
            String typeName = ((j2 & 521) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.getTypeName();
            String p2 = ((j2 & 515) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.p();
            String w1 = ((j2 & 545) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.w1();
            String j3 = ((j2 & 517) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.j();
            String g1 = ((j2 & 577) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.g1();
            String m2 = ((j2 & 641) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.m();
            if (!((j2 & 529) == 0 || omissionDetailViewModel == null)) {
                str9 = omissionDetailViewModel.O0();
            }
            str = typeName;
            str4 = str9;
            str8 = p2;
            str6 = w1;
            str3 = j3;
            str5 = g1;
            str2 = m2;
        } else {
            str8 = null;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j2 & 769) != 0) {
            a.a(this.z, (CharSequence) str7);
        }
        if ((j2 & 515) != 0) {
            this.A.setVisibility(BindingConverters.a(str8));
            this.B.setVisibility(BindingConverters.a(str8));
            a.a(this.C, (CharSequence) str8);
            this.C.setVisibility(BindingConverters.a(str8));
        }
        if ((j2 & 545) != 0) {
            a.a(this.D, (CharSequence) str6);
        }
        if ((j2 & 577) != 0) {
            a.a(this.E, (CharSequence) str5);
        }
        if ((j2 & 529) != 0) {
            a.a(this.F, (CharSequence) str4);
        }
        if ((517 & j2) != 0) {
            a.a(this.G, (CharSequence) str3);
        }
        if ((641 & j2) != 0) {
            a.a(this.H, (CharSequence) str2);
        }
        if ((j2 & 521) != 0) {
            a.a(this.I, (CharSequence) str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.L != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(OmissionDetailViewModel omissionDetailViewModel) {
        a(0, (i) omissionDetailViewModel);
        this.J = omissionDetailViewModel;
        synchronized (this) {
            this.L |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.L = 512;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((OmissionDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.L |= 1;
            }
            return true;
        } else if (i2 == 79) {
            synchronized (this) {
                this.L |= 2;
            }
            return true;
        } else if (i2 == 70) {
            synchronized (this) {
                this.L |= 4;
            }
            return true;
        } else if (i2 == 36) {
            synchronized (this) {
                this.L |= 8;
            }
            return true;
        } else if (i2 == 91) {
            synchronized (this) {
                this.L |= 16;
            }
            return true;
        } else if (i2 == 77) {
            synchronized (this) {
                this.L |= 32;
            }
            return true;
        } else if (i2 == 33) {
            synchronized (this) {
                this.L |= 64;
            }
            return true;
        } else if (i2 == 101) {
            synchronized (this) {
                this.L |= 128;
            }
            return true;
        } else if (i2 != 48) {
            return false;
        } else {
            synchronized (this) {
                this.L |= 256;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        OmissionDetailViewModel omissionDetailViewModel = (OmissionDetailViewModel) obj;
        return e(i3);
    }
}
