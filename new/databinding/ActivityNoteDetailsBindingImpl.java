package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.notes.NoteDetailsViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class ActivityNoteDetailsBindingImpl extends ActivityNoteDetailsBinding {
    public static final ViewDataBinding.f L = null;
    public static final SparseIntArray M = new SparseIntArray();
    public final CoordinatorLayout J;
    public long K = -1;

    static {
        M.put(R.id.app_bar_layout, 10);
        M.put(R.id.toolbar, 11);
        M.put(R.id.nested_scroll_view, 12);
        M.put(R.id.constraint_layout, 13);
        M.put(R.id.type_caption, 14);
        M.put(R.id.type_divider, 15);
        M.put(R.id.title_caption, 16);
        M.put(R.id.title_divider, 17);
        M.put(R.id.content_caption, 18);
        M.put(R.id.content_divider, 19);
        M.put(R.id.date_caption, 20);
        M.put(R.id.room_divider, 21);
        M.put(R.id.teacher_caption, 22);
        M.put(R.id.teacher_divider, 23);
        M.put(R.id.creating_time_caption, 24);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityNoteDetailsBindingImpl(h.l.f r30, android.view.View r31) {
        /*
            r29 = this;
            r2 = r29
            r1 = r31
            androidx.databinding.ViewDataBinding$f r0 = L
            android.util.SparseIntArray r3 = M
            r4 = 25
            r15 = r30
            java.lang.Object[] r28 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 10
            r0 = r28[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 13
            r0 = r28[r0]
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 18
            r0 = r28[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 19
            r0 = r28[r0]
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            r0 = 6
            r0 = r28[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 24
            r0 = r28[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 9
            r0 = r28[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 20
            r0 = r28[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 7
            r0 = r28[r0]
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r0 = 1
            r0 = r28[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 3
            r0 = r28[r0]
            r14 = r0
            android.view.View r14 = (android.view.View) r14
            r0 = 2
            r0 = r28[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r15 = r0
            r0 = 12
            r0 = r28[r0]
            r16 = r0
            androidx.core.widget.NestedScrollView r16 = (androidx.core.widget.NestedScrollView) r16
            r0 = 21
            r0 = r28[r0]
            r17 = r0
            android.view.View r17 = (android.view.View) r17
            r0 = 22
            r0 = r28[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 23
            r0 = r28[r0]
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            r0 = 8
            r0 = r28[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 16
            r0 = r28[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 17
            r0 = r28[r0]
            r22 = r0
            android.view.View r22 = (android.view.View) r22
            r0 = 5
            r0 = r28[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 11
            r0 = r28[r0]
            r24 = r0
            androidx.appcompat.widget.Toolbar r24 = (androidx.appcompat.widget.Toolbar) r24
            r0 = 14
            r0 = r28[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 15
            r0 = r28[r0]
            r26 = r0
            android.view.View r26 = (android.view.View) r26
            r0 = 4
            r0 = r28[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r3 = 1
            r0 = r29
            r1 = r30
            r2 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = -1
            r2 = r29
            r2.K = r0
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
            r0 = r28[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.J = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.J
            r0.setTag(r1)
            android.widget.TextView r0 = r2.F
            r0.setTag(r1)
            android.widget.TextView r0 = r2.G
            r0.setTag(r1)
            android.widget.TextView r0 = r2.H
            r0.setTag(r1)
            r0 = r31
            r2.a((android.view.View) r0)
            r29.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityNoteDetailsBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        synchronized (this) {
            j2 = this.K;
            this.K = 0;
        }
        NoteDetailsViewModel noteDetailsViewModel = this.I;
        String str7 = null;
        if ((511 & j2) != 0) {
            str5 = ((j2 & 385) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.y();
            String p2 = ((j2 & 259) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.p();
            String x0 = ((j2 & 273) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.x0();
            String h2 = ((j2 & 289) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.h();
            String m2 = ((j2 & 321) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.m();
            String title = ((j2 & 265) == 0 || noteDetailsViewModel == null) ? null : noteDetailsViewModel.getTitle();
            if (!((j2 & 261) == 0 || noteDetailsViewModel == null)) {
                str7 = noteDetailsViewModel.getType();
            }
            str = str7;
            str6 = x0;
            str3 = m2;
            str2 = title;
            str7 = p2;
            str4 = h2;
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j2 & 273) != 0) {
            a.a(this.z, (CharSequence) str6);
        }
        if ((j2 & 385) != 0) {
            a.a(this.A, (CharSequence) str5);
        }
        if ((j2 & 289) != 0) {
            a.a(this.B, (CharSequence) str4);
        }
        if ((j2 & 259) != 0) {
            this.C.setVisibility(BindingConverters.a(str7));
            this.D.setVisibility(BindingConverters.a(str7));
            String str8 = str7;
            a.a(this.E, (CharSequence) str8);
            this.E.setVisibility(BindingConverters.a(str8));
        }
        if ((j2 & 321) != 0) {
            a.a(this.F, (CharSequence) str3);
        }
        if ((265 & j2) != 0) {
            a.a(this.G, (CharSequence) str2);
        }
        if ((j2 & 261) != 0) {
            a.a(this.H, (CharSequence) str);
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

    public void a(NoteDetailsViewModel noteDetailsViewModel) {
        a(0, (i) noteDetailsViewModel);
        this.I = noteDetailsViewModel;
        synchronized (this) {
            this.K |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.K = 256;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((NoteDetailsViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.K |= 1;
            }
            return true;
        } else if (i2 == 79) {
            synchronized (this) {
                this.K |= 2;
            }
            return true;
        } else if (i2 == 8) {
            synchronized (this) {
                this.K |= 4;
            }
            return true;
        } else if (i2 == 97) {
            synchronized (this) {
                this.K |= 8;
            }
            return true;
        } else if (i2 == 98) {
            synchronized (this) {
                this.K |= 16;
            }
            return true;
        } else if (i2 == 64) {
            synchronized (this) {
                this.K |= 32;
            }
            return true;
        } else if (i2 == 101) {
            synchronized (this) {
                this.K |= 64;
            }
            return true;
        } else if (i2 != 48) {
            return false;
        } else {
            synchronized (this) {
                this.K |= 128;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        NoteDetailsViewModel noteDetailsViewModel = (NoteDetailsViewModel) obj;
        return e(i3);
    }
}
