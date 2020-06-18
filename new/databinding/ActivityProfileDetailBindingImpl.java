package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModel;

public class ActivityProfileDetailBindingImpl extends ActivityProfileDetailBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f K = null;
    public static final SparseIntArray L = new SparseIntArray();
    public final CoordinatorLayout H;
    public final View.OnClickListener I;
    public long J = -1;

    static {
        L.put(R.id.app_bar_layout, 8);
        L.put(R.id.toolbar, 9);
        L.put(R.id.nested_scroll_view, 10);
        L.put(R.id.student_name_caption, 11);
        L.put(R.id.student_name_divider, 12);
        L.put(R.id.maiden_name_caption, 13);
        L.put(R.id.maiden_name_divider, 14);
        L.put(R.id.birth_date_caption, 15);
        L.put(R.id.birth_date_divider, 16);
        L.put(R.id.place_of_birth_caption, 17);
        L.put(R.id.place_of_birth_divider, 18);
        L.put(R.id.mothers_name_caption, 19);
        L.put(R.id.mothers_name_divider, 20);
        L.put(R.id.address_caption, 21);
        L.put(R.id.address_divider, 22);
        L.put(R.id.recyclerview_tutor_details, 23);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityProfileDetailBindingImpl(h.l.f r29, android.view.View r30) {
        /*
            r28 = this;
            r2 = r28
            r1 = r30
            androidx.databinding.ViewDataBinding$f r0 = K
            android.util.SparseIntArray r3 = L
            r4 = 24
            r15 = r29
            java.lang.Object[] r27 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 21
            r0 = r27[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 22
            r0 = r27[r0]
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            r0 = 7
            r0 = r27[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 8
            r0 = r27[r0]
            r7 = r0
            com.google.android.material.appbar.AppBarLayout r7 = (com.google.android.material.appbar.AppBarLayout) r7
            r0 = 15
            r0 = r27[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 16
            r0 = r27[r0]
            r9 = r0
            android.view.View r9 = (android.view.View) r9
            r0 = 4
            r0 = r27[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 1
            r3 = r27[r0]
            r11 = r3
            android.widget.TextView r11 = (android.widget.TextView) r11
            r3 = 13
            r3 = r27[r3]
            r12 = r3
            android.widget.TextView r12 = (android.widget.TextView) r12
            r3 = 14
            r3 = r27[r3]
            r13 = r3
            android.view.View r13 = (android.view.View) r13
            r3 = 3
            r3 = r27[r3]
            r14 = r3
            android.widget.TextView r14 = (android.widget.TextView) r14
            r3 = 19
            r3 = r27[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r15 = r3
            r3 = 20
            r3 = r27[r3]
            r16 = r3
            android.view.View r16 = (android.view.View) r16
            r3 = 6
            r3 = r27[r3]
            r17 = r3
            android.widget.TextView r17 = (android.widget.TextView) r17
            r3 = 10
            r3 = r27[r3]
            r18 = r3
            androidx.core.widget.NestedScrollView r18 = (androidx.core.widget.NestedScrollView) r18
            r3 = 17
            r3 = r27[r3]
            r19 = r3
            android.widget.TextView r19 = (android.widget.TextView) r19
            r3 = 18
            r3 = r27[r3]
            r20 = r3
            android.view.View r20 = (android.view.View) r20
            r3 = 5
            r3 = r27[r3]
            r21 = r3
            android.widget.TextView r21 = (android.widget.TextView) r21
            r3 = 23
            r3 = r27[r3]
            r22 = r3
            androidx.recyclerview.widget.RecyclerView r22 = (androidx.recyclerview.widget.RecyclerView) r22
            r3 = 11
            r3 = r27[r3]
            r23 = r3
            android.widget.TextView r23 = (android.widget.TextView) r23
            r3 = 12
            r3 = r27[r3]
            r24 = r3
            android.view.View r24 = (android.view.View) r24
            r3 = 2
            r3 = r27[r3]
            r25 = r3
            android.widget.TextView r25 = (android.widget.TextView) r25
            r3 = 9
            r3 = r27[r3]
            r26 = r3
            androidx.appcompat.widget.Toolbar r26 = (androidx.appcompat.widget.Toolbar) r26
            r3 = 1
            r0 = r28
            r1 = r29
            r2 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = -1
            r2 = r28
            r2.J = r0
            android.widget.TextView r0 = r2.z
            r1 = 0
            r0.setTag(r1)
            android.widget.TextView r0 = r2.A
            r0.setTag(r1)
            android.widget.TextView r0 = r2.B
            r0.setTag(r1)
            android.widget.TextView r0 = r2.C
            r0.setTag(r1)
            r0 = 0
            r0 = r27[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.H = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.H
            r0.setTag(r1)
            android.widget.TextView r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.E
            r0.setTag(r1)
            android.widget.TextView r0 = r2.F
            r0.setTag(r1)
            r0 = r30
            r2.a((android.view.View) r0)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 1
            r0.<init>(r2, r1)
            r2.I = r0
            r28.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityProfileDetailBindingImpl.<init>(h.l.f, android.view.View):void");
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
            j2 = this.J;
            this.J = 0;
        }
        ProfileDetailViewModel profileDetailViewModel = this.G;
        String str7 = null;
        if ((255 & j2) != 0) {
            str5 = ((j2 & 137) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.s1();
            String q2 = ((j2 & 131) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.q();
            String I0 = ((j2 & 133) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.I0();
            String K1 = ((j2 & 161) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.K1();
            String H1 = ((j2 & 193) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.H1();
            if (!((j2 & 145) == 0 || profileDetailViewModel == null)) {
                str7 = profileDetailViewModel.y1();
            }
            str = q2;
            str2 = str7;
            str4 = I0;
            str3 = K1;
            str6 = H1;
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j2 & 193) != 0) {
            a.a(this.z, (CharSequence) str6);
        }
        if ((j2 & 137) != 0) {
            a.a(this.A, (CharSequence) str5);
        }
        if ((128 & j2) != 0) {
            this.B.setOnClickListener(this.I);
        }
        if ((j2 & 133) != 0) {
            a.a(this.C, (CharSequence) str4);
        }
        if ((j2 & 161) != 0) {
            a.a(this.D, (CharSequence) str3);
        }
        if ((145 & j2) != 0) {
            a.a(this.E, (CharSequence) str2);
        }
        if ((j2 & 131) != 0) {
            a.a(this.F, (CharSequence) str);
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

    public void a(ProfileDetailViewModel profileDetailViewModel) {
        a(0, (i) profileDetailViewModel);
        this.G = profileDetailViewModel;
        synchronized (this) {
            this.J |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.J = 128;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((ProfileDetailViewModel) obj);
        return true;
    }

    public final boolean e(int i2) {
        if (i2 == 0) {
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        } else if (i2 == 24) {
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        } else if (i2 == 9) {
            synchronized (this) {
                this.J |= 4;
            }
            return true;
        } else if (i2 == 110) {
            synchronized (this) {
                this.J |= 8;
            }
            return true;
        } else if (i2 == 43) {
            synchronized (this) {
                this.J |= 16;
            }
            return true;
        } else if (i2 == 26) {
            synchronized (this) {
                this.J |= 32;
            }
            return true;
        } else if (i2 != 56) {
            return false;
        } else {
            synchronized (this) {
                this.J |= 64;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        ProfileDetailViewModel profileDetailViewModel = (ProfileDetailViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        ProfileDetailViewModel profileDetailViewModel = this.G;
        if (profileDetailViewModel != null) {
            profileDetailViewModel.E1();
        }
    }
}
