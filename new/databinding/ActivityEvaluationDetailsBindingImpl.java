package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;
import hu.ekreta.ellenorzo.util.binding.TextViewBindings;

public class ActivityEvaluationDetailsBindingImpl extends ActivityEvaluationDetailsBinding {
    public static final ViewDataBinding.f W = null;
    public static final SparseIntArray X = new SparseIntArray();
    public final CoordinatorLayout U;
    public long V = -1;

    static {
        X.put(R.id.app_bar_layout, 21);
        X.put(R.id.toolbar, 22);
        X.put(R.id.nested_scroll_view, 23);
        X.put(R.id.constraint_layout, 24);
        X.put(R.id.subject_caption, 25);
        X.put(R.id.subject_divider, 26);
        X.put(R.id.date_caption, 27);
        X.put(R.id.room_divider, 28);
        X.put(R.id.teacher_caption, 29);
        X.put(R.id.teacher_divider, 30);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityEvaluationDetailsBindingImpl(h.l.f r36, android.view.View r37) {
        /*
            r35 = this;
            r2 = r35
            r1 = r37
            androidx.databinding.ViewDataBinding$f r0 = W
            android.util.SparseIntArray r3 = X
            r4 = 31
            r15 = r36
            java.lang.Object[] r34 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 21
            r0 = r34[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 24
            r0 = r34[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 19
            r0 = r34[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 20
            r0 = r34[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 27
            r0 = r34[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 17
            r0 = r34[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 1
            r0 = r34[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 3
            r0 = r34[r0]
            r11 = r0
            android.view.View r11 = (android.view.View) r11
            r0 = 2
            r0 = r34[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 5
            r0 = r34[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 7
            r0 = r34[r0]
            r14 = r0
            android.view.View r14 = (android.view.View) r14
            r0 = 6
            r0 = r34[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r15 = r0
            r0 = 23
            r0 = r34[r0]
            r16 = r0
            androidx.core.widget.NestedScrollView r16 = (androidx.core.widget.NestedScrollView) r16
            r0 = 28
            r0 = r34[r0]
            r17 = r0
            android.view.View r17 = (android.view.View) r17
            r0 = 25
            r0 = r34[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 26
            r0 = r34[r0]
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            r0 = 4
            r0 = r34[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 29
            r0 = r34[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 30
            r0 = r34[r0]
            r22 = r0
            android.view.View r22 = (android.view.View) r22
            r0 = 18
            r0 = r34[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 8
            r0 = r34[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 10
            r0 = r34[r0]
            r25 = r0
            android.view.View r25 = (android.view.View) r25
            r0 = 9
            r0 = r34[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 22
            r0 = r34[r0]
            r27 = r0
            androidx.appcompat.widget.Toolbar r27 = (androidx.appcompat.widget.Toolbar) r27
            r0 = 11
            r0 = r34[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 13
            r0 = r34[r0]
            r29 = r0
            android.view.View r29 = (android.view.View) r29
            r0 = 12
            r0 = r34[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 14
            r0 = r34[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 16
            r0 = r34[r0]
            r32 = r0
            android.view.View r32 = (android.view.View) r32
            r0 = 15
            r0 = r34[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r3 = 1
            r0 = r35
            r1 = r36
            r2 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = -1
            r2 = r35
            r2.V = r0
            android.widget.TextView r0 = r2.z
            r1 = 0
            r0.setTag(r1)
            android.widget.TextView r0 = r2.A
            r0.setTag(r1)
            android.widget.TextView r0 = r2.B
            r0.setTag(r1)
            android.widget.TextView r0 = r2.C
            r0.setTag(r1)
            android.view.View r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.E
            r0.setTag(r1)
            r0 = 0
            r0 = r34[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.U = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.U
            r0.setTag(r1)
            android.widget.TextView r0 = r2.F
            r0.setTag(r1)
            android.view.View r0 = r2.G
            r0.setTag(r1)
            android.widget.TextView r0 = r2.H
            r0.setTag(r1)
            android.widget.TextView r0 = r2.I
            r0.setTag(r1)
            android.widget.TextView r0 = r2.J
            r0.setTag(r1)
            android.widget.TextView r0 = r2.K
            r0.setTag(r1)
            android.view.View r0 = r2.L
            r0.setTag(r1)
            android.widget.TextView r0 = r2.M
            r0.setTag(r1)
            android.widget.TextView r0 = r2.N
            r0.setTag(r1)
            android.view.View r0 = r2.O
            r0.setTag(r1)
            android.widget.TextView r0 = r2.P
            r0.setTag(r1)
            android.widget.TextView r0 = r2.Q
            r0.setTag(r1)
            android.view.View r0 = r2.R
            r0.setTag(r1)
            android.widget.TextView r0 = r2.S
            r0.setTag(r1)
            r0 = r37
            r2.a((android.view.View) r0)
            r35.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityEvaluationDetailsBindingImpl.<init>(h.l.f, android.view.View):void");
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
        String str9;
        synchronized (this) {
            j2 = this.V;
            this.V = 0;
        }
        boolean z = false;
        EvaluationDetailsViewModel evaluationDetailsViewModel = this.T;
        String str10 = null;
        if ((8191 & j2) != 0) {
            if (!((j2 & 5121) == 0 || evaluationDetailsViewModel == null)) {
                z = evaluationDetailsViewModel.o1();
            }
            String v0 = ((j2 & 4105) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.v0();
            str7 = ((j2 & 6145) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.y();
            String p2 = ((j2 & 4099) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.p();
            String B1 = ((j2 & 4225) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.B1();
            String value = ((j2 & 4161) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.getValue();
            String j3 = ((j2 & 4101) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.j();
            String M1 = ((j2 & 4129) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.M1();
            String h2 = ((j2 & 4353) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.h();
            String D0 = ((j2 & 4113) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.D0();
            if (!((j2 & 4609) == 0 || evaluationDetailsViewModel == null)) {
                str10 = evaluationDetailsViewModel.m();
            }
            str6 = str10;
            str4 = j3;
            str3 = M1;
            str9 = h2;
            str5 = D0;
            str10 = v0;
            str8 = p2;
            str = B1;
            str2 = value;
        } else {
            str9 = null;
            str8 = null;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j2 & 5121) != 0) {
            this.z.setVisibility(BindingConverters.a(z));
            this.A.setVisibility(BindingConverters.a(z));
        }
        if ((j2 & 6145) != 0) {
            a.a(this.A, (CharSequence) str7);
        }
        if ((j2 & 4353) != 0) {
            a.a(this.B, (CharSequence) str9);
        }
        if ((j2 & 4099) != 0) {
            this.C.setVisibility(BindingConverters.a(str8));
            this.D.setVisibility(BindingConverters.a(str8));
            a.a(this.E, (CharSequence) str8);
            this.E.setVisibility(BindingConverters.a(str8));
        }
        if ((j2 & 4105) != 0) {
            this.F.setVisibility(BindingConverters.a(str10));
            this.G.setVisibility(BindingConverters.a(str10));
            String str11 = str10;
            a.a(this.H, (CharSequence) str11);
            this.H.setVisibility(BindingConverters.a(str11));
        }
        if ((j2 & 4101) != 0) {
            a.a(this.I, (CharSequence) str4);
        }
        if ((j2 & 4609) != 0) {
            a.a(this.J, (CharSequence) str6);
        }
        if ((4113 & j2) != 0) {
            a.a(this.K, (CharSequence) str5);
        }
        if ((4129 & j2) != 0) {
            this.K.setVisibility(BindingConverters.a(str3));
            this.L.setVisibility(BindingConverters.a(str3));
            String str12 = str3;
            a.a(this.M, (CharSequence) str12);
            this.M.setVisibility(BindingConverters.a(str12));
        }
        if ((4161 & j2) != 0) {
            this.N.setVisibility(BindingConverters.a(str2));
            this.O.setVisibility(BindingConverters.a(str2));
            this.P.setVisibility(BindingConverters.a(str2));
            TextViewBindings.a(this.P, str2);
        }
        if ((j2 & 4225) != 0) {
            this.Q.setVisibility(BindingConverters.a(str));
            this.R.setVisibility(BindingConverters.a(str));
            String str13 = str;
            a.a(this.S, (CharSequence) str13);
            this.S.setVisibility(BindingConverters.a(str13));
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.V != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(EvaluationDetailsViewModel evaluationDetailsViewModel) {
        a(0, (i) evaluationDetailsViewModel);
        this.T = evaluationDetailsViewModel;
        synchronized (this) {
            this.V |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.V = 4096;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((EvaluationDetailsViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.V |= 1;
            }
            return true;
        } else if (i2 == 79) {
            synchronized (this) {
                this.V |= 2;
            }
            return true;
        } else if (i2 == 70) {
            synchronized (this) {
                this.V |= 4;
            }
            return true;
        } else if (i2 == 75) {
            synchronized (this) {
                this.V |= 8;
            }
            return true;
        } else if (i2 == 116) {
            synchronized (this) {
                this.V |= 16;
            }
            return true;
        } else if (i2 == 51) {
            synchronized (this) {
                this.V |= 32;
            }
            return true;
        } else if (i2 == 104) {
            synchronized (this) {
                this.V |= 64;
            }
            return true;
        } else if (i2 == 83) {
            synchronized (this) {
                this.V |= 128;
            }
            return true;
        } else if (i2 == 64) {
            synchronized (this) {
                this.V |= 256;
            }
            return true;
        } else if (i2 == 101) {
            synchronized (this) {
                this.V |= 512;
            }
            return true;
        } else if (i2 == 60) {
            synchronized (this) {
                this.V |= 1024;
            }
            return true;
        } else if (i2 != 48) {
            return false;
        } else {
            synchronized (this) {
                this.V |= 2048;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        EvaluationDetailsViewModel evaluationDetailsViewModel = (EvaluationDetailsViewModel) obj;
        return e(i3);
    }
}
