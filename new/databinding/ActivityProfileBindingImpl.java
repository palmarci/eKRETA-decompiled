package hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import g.a.a.b.a;
import h.l.i;
import hu.ekreta.ellenorzo.R;
import hu.ekreta.ellenorzo.generated.callback.OnClickListener;
import hu.ekreta.ellenorzo.profile.list.ProfileListViewModel;
import hu.ekreta.ellenorzo.util.binding.BindingConverters;

public class ActivityProfileBindingImpl extends ActivityProfileBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.f K = null;
    public static final SparseIntArray L = new SparseIntArray();
    public final CoordinatorLayout G;
    public final View.OnClickListener H;
    public final View.OnClickListener I;
    public long J = -1;

    static {
        L.put(R.id.app_bar_layout, 7);
        L.put(R.id.profile_toolbar, 8);
        L.put(R.id.nested_scroll_view, 9);
        L.put(R.id.profile_card_view, 10);
        L.put(R.id.tvActiveProfiles, 11);
        L.put(R.id.tvEgyebProfilok, 12);
        L.put(R.id.profiles_recyclerview, 13);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityProfileBindingImpl(h.l.f r20, android.view.View r21) {
        /*
            r19 = this;
            r2 = r19
            r1 = r21
            androidx.databinding.ViewDataBinding$f r0 = K
            android.util.SparseIntArray r3 = L
            r4 = 14
            r15 = r20
            java.lang.Object[] r17 = androidx.databinding.ViewDataBinding.a((h.l.f) r15, (android.view.View) r1, (int) r4, (androidx.databinding.ViewDataBinding.f) r0, (android.util.SparseIntArray) r3)
            r0 = 7
            r0 = r17[r0]
            r4 = r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0 = 5
            r0 = r17[r0]
            r5 = r0
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r0 = 4
            r0 = r17[r0]
            r6 = r0
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r0 = 2
            r3 = r17[r0]
            r7 = r3
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = 9
            r3 = r17[r3]
            r8 = r3
            androidx.core.widget.NestedScrollView r8 = (androidx.core.widget.NestedScrollView) r8
            r3 = 10
            r3 = r17[r3]
            r9 = r3
            com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
            r3 = 8
            r3 = r17[r3]
            r10 = r3
            androidx.appcompat.widget.Toolbar r10 = (androidx.appcompat.widget.Toolbar) r10
            r3 = 13
            r3 = r17[r3]
            r11 = r3
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r3 = 6
            r3 = r17[r3]
            r12 = r3
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r3 = 1
            r13 = r17[r3]
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 11
            r14 = r17[r14]
            android.widget.TextView r14 = (android.widget.TextView) r14
            r16 = 12
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r15 = r16
            r16 = 3
            r16 = r17[r16]
            android.widget.TextView r16 = (android.widget.TextView) r16
            r18 = 1
            r3 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -1
            r2 = r19
            r2.J = r0
            android.widget.ImageButton r0 = r2.z
            r1 = 0
            r0.setTag(r1)
            android.widget.ImageButton r0 = r2.A
            r0.setTag(r1)
            android.widget.TextView r0 = r2.B
            r0.setTag(r1)
            r0 = 0
            r0 = r17[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r2.G = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.G
            r0.setTag(r1)
            android.widget.FrameLayout r0 = r2.C
            r0.setTag(r1)
            android.widget.TextView r0 = r2.D
            r0.setTag(r1)
            android.widget.TextView r0 = r2.E
            r0.setTag(r1)
            r0 = r21
            r2.a((android.view.View) r0)
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 2
            r0.<init>(r2, r1)
            r2.H = r0
            hu.ekreta.ellenorzo.generated.callback.OnClickListener r0 = new hu.ekreta.ellenorzo.generated.callback.OnClickListener
            r1 = 1
            r0.<init>(r2, r1)
            r2.I = r0
            r19.a2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hu.ekreta.ellenorzo.databinding.ActivityProfileBindingImpl.<init>(h.l.f, android.view.View):void");
    }

    public void V1() {
        long j2;
        String str;
        String str2;
        boolean z;
        String str3;
        synchronized (this) {
            j2 = this.J;
            this.J = 0;
        }
        boolean z2 = false;
        ProfileListViewModel profileListViewModel = this.F;
        String str4 = null;
        if ((63 & j2) != 0) {
            if (!((j2 & 49) == 0 || profileListViewModel == null)) {
                z2 = profileListViewModel.d();
            }
            str2 = ((j2 & 41) == 0 || profileListViewModel == null) ? null : profileListViewModel.v1();
            str = ((j2 & 35) == 0 || profileListViewModel == null) ? null : profileListViewModel.q();
            if (!((j2 & 37) == 0 || profileListViewModel == null)) {
                str4 = profileListViewModel.B0();
            }
            z = z2;
            str3 = str4;
        } else {
            str3 = null;
            str2 = null;
            str = null;
            z = false;
        }
        if ((j2 & 32) != 0) {
            this.z.setOnClickListener(this.H);
            this.A.setOnClickListener(this.I);
        }
        if ((j2 & 37) != 0) {
            a.a(this.B, (CharSequence) str3);
            this.B.setVisibility(BindingConverters.a(str3));
        }
        if ((j2 & 49) != 0) {
            this.C.setVisibility(BindingConverters.a(z));
        }
        if ((35 & j2) != 0) {
            a.a(this.D, (CharSequence) str);
        }
        if ((j2 & 41) != 0) {
            a.a(this.E, (CharSequence) str2);
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

    public void a(ProfileListViewModel profileListViewModel) {
        a(0, (i) profileListViewModel);
        this.F = profileListViewModel;
        synchronized (this) {
            this.J |= 1;
        }
        c(88);
        super.b2();
    }

    public void a2() {
        synchronized (this) {
            this.J = 32;
        }
        b2();
    }

    public boolean c(int i2, Object obj) {
        if (88 != i2) {
            return false;
        }
        a((ProfileListViewModel) obj);
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
        } else if (i2 == 108) {
            synchronized (this) {
                this.J |= 4;
            }
            return true;
        } else if (i2 == 41) {
            synchronized (this) {
                this.J |= 8;
            }
            return true;
        } else if (i2 != 37) {
            return false;
        } else {
            synchronized (this) {
                this.J |= 16;
            }
            return true;
        }
    }

    public boolean a(int i2, Object obj, int i3) {
        if (i2 != 0) {
            return false;
        }
        ProfileListViewModel profileListViewModel = (ProfileListViewModel) obj;
        return e(i3);
    }

    public final void a(int i2, View view) {
        boolean z = false;
        if (i2 == 1) {
            ProfileListViewModel profileListViewModel = this.F;
            if (profileListViewModel != null) {
                z = true;
            }
            if (z) {
                profileListViewModel.C1();
            }
        } else if (i2 == 2) {
            ProfileListViewModel profileListViewModel2 = this.F;
            if (profileListViewModel2 != null) {
                z = true;
            }
            if (z) {
                profileListViewModel2.a1();
            }
        }
    }
}
