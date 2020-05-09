package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.profile.list.ProfileListViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityProfileBindingImpl */
public class ActivityProfileBindingImpl extends ActivityProfileBinding implements Listener {

    /* renamed from: K */
    public static final C2867f f12208K = null;

    /* renamed from: L */
    public static final SparseIntArray f12209L = new SparseIntArray();

    /* renamed from: G */
    public final CoordinatorLayout f12210G;

    /* renamed from: H */
    public final OnClickListener f12211H;

    /* renamed from: I */
    public final OnClickListener f12212I;

    /* renamed from: J */
    public long f12213J = -1;

    static {
        f12209L.put(C4014R.C4016id.app_bar_layout, 7);
        f12209L.put(C4014R.C4016id.profile_toolbar, 8);
        f12209L.put(C4014R.C4016id.nested_scroll_view, 9);
        f12209L.put(C4014R.C4016id.profile_card_view, 10);
        f12209L.put(C4014R.C4016id.tvActiveProfiles, 11);
        f12209L.put(C4014R.C4016id.tvEgyebProfilok, 12);
        f12209L.put(C4014R.C4016id.profiles_recyclerview, 13);
    }

    public ActivityProfileBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 14, f12208K, f12209L);
        super(fVar, view, 1, (AppBarLayout) a[7], (ImageButton) a[5], (ImageButton) a[4], (TextView) a[2], (NestedScrollView) a[9], (MaterialCardView) a[10], (Toolbar) a[8], (RecyclerView) a[13], (FrameLayout) a[6], (TextView) a[1], (TextView) a[11], (TextView) a[12], (TextView) a[3]);
        this.f12207z.setTag(null);
        this.f12201A.setTag(null);
        this.f12202B.setTag(null);
        this.f12210G = (CoordinatorLayout) a[0];
        this.f12210G.setTag(null);
        this.f12203C.setTag(null);
        this.f12204D.setTag(null);
        this.f12205E.setTag(null);
        mo6098a(view);
        this.f12211H = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        this.f12212I = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        String str;
        synchronized (this) {
            j = this.f12213J;
            this.f12213J = 0;
        }
        boolean z2 = false;
        ProfileListViewModel profileListViewModel = this.f12206F;
        String str2 = null;
        if ((63 & j) != 0) {
            if (!((j & 49) == 0 || profileListViewModel == null)) {
                z2 = profileListViewModel.mo14262d();
            }
            charSequence2 = ((j & 41) == 0 || profileListViewModel == null) ? null : profileListViewModel.mo14264o1();
            charSequence = ((j & 35) == 0 || profileListViewModel == null) ? null : profileListViewModel.mo14265q();
            if (!((j & 37) == 0 || profileListViewModel == null)) {
                str2 = profileListViewModel.mo14256B0();
            }
            z = z2;
            str = str2;
        } else {
            str = null;
            charSequence2 = null;
            charSequence = null;
            z = false;
        }
        if ((j & 32) != 0) {
            this.f12207z.setOnClickListener(this.f12212I);
            this.f12201A.setOnClickListener(this.f12211H);
        }
        if ((j & 37) != 0) {
            C3158a.m7850a(this.f12202B, (CharSequence) str);
            this.f12202B.setVisibility(BindingConverters.m14793a(str));
        }
        if ((j & 49) != 0) {
            this.f12203C.setVisibility(BindingConverters.m14795a(z));
        }
        if ((35 & j) != 0) {
            C3158a.m7850a(this.f12204D, charSequence);
        }
        if ((j & 41) != 0) {
            C3158a.m7850a(this.f12205E, charSequence2);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12213J != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12213J = 32;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12372a(ProfileListViewModel profileListViewModel) {
        mo6103a(0, (C3705i) profileListViewModel);
        this.f12206F = profileListViewModel;
        synchronized (this) {
            this.f12213J |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12372a((ProfileListViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12373e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12213J |= 1;
            }
            return true;
        } else if (i == 24) {
            synchronized (this) {
                this.f12213J |= 2;
            }
            return true;
        } else if (i == 105) {
            synchronized (this) {
                this.f12213J |= 4;
            }
            return true;
        } else if (i == 41) {
            synchronized (this) {
                this.f12213J |= 8;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12213J |= 16;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        ProfileListViewModel profileListViewModel = (ProfileListViewModel) obj;
        return mo12373e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            ProfileListViewModel profileListViewModel = this.f12206F;
            if (profileListViewModel != null) {
                z = true;
            }
            if (z) {
                profileListViewModel.mo14266u1();
            }
        } else if (i == 2) {
            ProfileListViewModel profileListViewModel2 = this.f12206F;
            if (profileListViewModel2 != null) {
                z = true;
            }
            if (z) {
                profileListViewModel2.mo14258W0();
            }
        }
    }
}
