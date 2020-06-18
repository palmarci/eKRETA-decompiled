package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class ActivityLessonDetailBindingImpl extends ActivityLessonDetailBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f O = null;
    public static final SparseIntArray P = new SparseIntArray();
    public final CoordinatorLayout I;
    public final FrameLayout J;
    public final View.OnClickListener K;
    public final View.OnClickListener L;
    public final View.OnClickListener M;
    public long N = -1;

    static {
        P.put(R.id.app_bar_layout, 10);
        P.put(R.id.nested_scroll_view, 11);
        P.put(R.id.constraint_layout, 12);
        P.put(R.id.room_caption, 13);
        P.put(R.id.room_divider, 14);
        P.put(R.id.teacher_caption, 15);
        P.put(R.id.teacher_divider, 16);
        P.put(R.id.date_caption, 17);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityLessonDetailBindingImpl(h.l.f r23, android.view.View r24) {
        /*
            r22 = this;
            r2 = r22
            r1 = r24
            androidx.databinding.ViewDataBinding$f r0 = O
            android.util.SparseIntArray r3 = P
            r4 = 18
            r15 = r23
            java.lang.Object[] r20 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 5
            r0 = r20[r0]
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r0 = 7
            r0 = r20[r0]
            r5 = r0
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r0 = 10
            r0 = r20[r0]
            r6 = r0
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            r0 = 12
            r0 = r20[r0]
            r7 = r0
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r0 = 17
            r0 = r20[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 4
            r0 = r20[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 6
            r0 = r20[r0]
            r10 = r0
            com.google.android.material.button.MaterialButton r10 = (com.google.android.material.button.MaterialButton) r10
            r0 = 11
            r0 = r20[r0]
            r11 = r0
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            r0 = 9
            r0 = r20[r0]
            r12 = r0
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            r0 = 13
            r0 = r20[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 14
            r0 = r20[r0]
            r14 = r0
            android.view.View r14 = (android.view.View) r14
            r0 = 2
            r3 = r20[r0]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r15 = r3
            r3 = 15
            r3 = r20[r3]
            r16 = r3
            android.widget.TextView r16 = (android.widget.TextView) r16
            r3 = 16
            r3 = r20[r3]
            r17 = r3
            android.view.View r17 = (android.view.View) r17
            r3 = 3
            r18 = r20[r3]
            android.widget.TextView r18 = (android.widget.TextView) r18
            r3 = 1
            r19 = r20[r3]
            androidx.appcompat.widget.Toolbar r19 = (androidx.appcompat.widget.Toolbar) r19
            r21 = 1
            r3 = r21
            r0 = r22
            r1 = r23
            r2 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = -1
            r2 = r22
            r2.N = r0
            com.google.android.material.button.MaterialButton r0 = r2.z
            r1 = 0
            r0.setTag(r1)
            com.google.android.material.button.MaterialButton r0 = r2.A
            r0.setTag(r1)
            android.widget.TextView r0 = r2.B
            r0.setTag(r1)
            com.google.android.material.button.MaterialButton r0 = r2.C
            r0.setTag(r1)
            r0 = 0
            r0 = r20[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.I = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.I
            r0.setTag(r1)
            r0 = 8
            r0 = r20[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.J = r0
            android.widget.FrameLayout r0 = r2.J
            r0.setTag(r1)
            android.widget.ProgressBar r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.E
            r0.setTag(r1)
            android.widget.TextView r0 = r2.F
            r0.setTag(r1)
            androidx.appcompat.widget.Toolbar r0 = r2.G
            r0.setTag(r1)
            r0 = r24
            r2.a((android.view.View) r0)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 3
            r0.<init>(r2, r1)
            r2.K = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 1
            r0.<init>(r2, r1)
            r2.L = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 2
            r0.<init>(r2, r1)
            r2.M = r0
            r22.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityLessonDetailBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        String str4;
        synchronized (this) {
            j2 = this.N;
            this.N = 0;
        }
        TimeTableItemDetailViewModel timeTableItemDetailViewModel = this.H;
        String str5 = null;
        boolean z4 = false;
        if ((1023 & j2) != 0) {
            z3 = ((j2 & 577) == 0 || timeTableItemDetailViewModel == null) ? false : timeTableItemDetailViewModel.L0();
            z2 = ((j2 & 641) == 0 || timeTableItemDetailViewModel == null) ? false : timeTableItemDetailViewModel.b1();
            z = ((j2 & 769) == 0 || timeTableItemDetailViewModel == null) ? false : timeTableItemDetailViewModel.d();
            String h2 = ((j2 & 529) == 0 || timeTableItemDetailViewModel == null) ? null : timeTableItemDetailViewModel.h();
            String z1 = ((j2 & 517) == 0 || timeTableItemDetailViewModel == null) ? null : timeTableItemDetailViewModel.z1();
            String m2 = ((j2 & 521) == 0 || timeTableItemDetailViewModel == null) ? null : timeTableItemDetailViewModel.m();
            if (!((j2 & 545) == 0 || timeTableItemDetailViewModel == null)) {
                z4 = timeTableItemDetailViewModel.U0();
            }
            if (!((j2 & 515) == 0 || timeTableItemDetailViewModel == null)) {
                str5 = timeTableItemDetailViewModel.getName();
            }
            str = str5;
            str4 = h2;
            str3 = z1;
            str2 = m2;
        } else {
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((j2 & 512) != 0) {
            this.z.setOnClickListener(this.L);
            this.A.setOnClickListener(this.K);
            this.C.setOnClickListener(this.M);
        }
        if ((j2 & 545) != 0) {
            this.z.setVisibility(BindingConverters.a(z4));
        }
        if ((j2 & 641) != 0) {
            this.A.setVisibility(BindingConverters.a(z2));
        }
        if ((j2 & 529) != 0) {
            a.a(this.B, (CharSequence) str4);
        }
        if ((j2 & 577) != 0) {
            this.C.setVisibility(BindingConverters.a(z3));
        }
        if ((j2 & 769) != 0) {
            this.J.setVisibility(BindingConverters.a(z));
            this.D.setVisibility(BindingConverters.a(z));
        }
        if ((j2 & 517) != 0) {
            a.a(this.E, (CharSequence) str3);
        }
        if ((521 & j2) != 0) {
            a.a(this.F, (CharSequence) str2);
        }
        if ((j2 & 515) != 0) {
            this.G.setTitle((CharSequence) str);
        }
    }

    public boolean Z1() {
        synchronized (this) {
            if (this.N != 0) {
                return true;
            }
            return false;
        }
    }

    public void a(TimeTableItemDetailViewModel timeTableItemDetailViewModel) {
        a(0, (i) timeTableItemDetailViewModel);
        this.H = timeTableItemDetailViewModel;
        synchronized (this) {
            this.N |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.N = 512;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((TimeTableItemDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.N |= 1;
            }
            return true;
        } else if (i2 == 87) {
            synchronized (this) {
                this.N |= 2;
            }
            return true;
        } else if (i2 == 21) {
            synchronized (this) {
                this.N |= 4;
            }
            return true;
        } else if (i2 == 101) {
            synchronized (this) {
                this.N |= 8;
            }
            return true;
        } else if (i2 == 64) {
            synchronized (this) {
                this.N |= 16;
            }
            return true;
        } else if (i2 == 90) {
            synchronized (this) {
                this.N |= 32;
            }
            return true;
        } else if (i2 == 10) {
            synchronized (this) {
                this.N |= 64;
            }
            return true;
        } else if (i2 == 6) {
            synchronized (this) {
                this.N |= 128;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.N |= 256;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        TimeTableItemDetailViewModel timeTableItemDetailViewModel = (TimeTableItemDetailViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        boolean z = false;
        if (i2 == 1) {
            TimeTableItemDetailViewModel timeTableItemDetailViewModel = this.H;
            if (timeTableItemDetailViewModel != null) {
                z = true;
            }
            if (z) {
                timeTableItemDetailViewModel.Q1();
            }
        } else if (i2 == 2) {
            TimeTableItemDetailViewModel timeTableItemDetailViewModel2 = this.H;
            if (timeTableItemDetailViewModel2 != null) {
                z = true;
            }
            if (z) {
                timeTableItemDetailViewModel2.G1();
            }
        } else if (i2 == 3) {
            TimeTableItemDetailViewModel timeTableItemDetailViewModel3 = this.H;
            if (timeTableItemDetailViewModel3 != null) {
                z = true;
            }
            if (z) {
                timeTableItemDetailViewModel3.Z0();
            }
        }
    }
}
