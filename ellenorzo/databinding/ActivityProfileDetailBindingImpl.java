package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.profile.detail.ProfileDetailViewModel;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityProfileDetailBindingImpl */
public class ActivityProfileDetailBindingImpl extends ActivityProfileDetailBinding implements Listener {

    /* renamed from: K */
    public static final C2867f f12222K = null;

    /* renamed from: L */
    public static final SparseIntArray f12223L = new SparseIntArray();

    /* renamed from: H */
    public final CoordinatorLayout f12224H;

    /* renamed from: I */
    public final OnClickListener f12225I;

    /* renamed from: J */
    public long f12226J = -1;

    static {
        f12223L.put(C4014R.C4016id.app_bar_layout, 8);
        f12223L.put(C4014R.C4016id.toolbar, 9);
        f12223L.put(C4014R.C4016id.nested_scroll_view, 10);
        f12223L.put(C4014R.C4016id.student_name_caption, 11);
        f12223L.put(C4014R.C4016id.student_name_divider, 12);
        f12223L.put(C4014R.C4016id.maiden_name_caption, 13);
        f12223L.put(C4014R.C4016id.maiden_name_divider, 14);
        f12223L.put(C4014R.C4016id.birth_date_caption, 15);
        f12223L.put(C4014R.C4016id.birth_date_divider, 16);
        f12223L.put(C4014R.C4016id.place_of_birth_caption, 17);
        f12223L.put(C4014R.C4016id.place_of_birth_divider, 18);
        f12223L.put(C4014R.C4016id.mothers_name_caption, 19);
        f12223L.put(C4014R.C4016id.mothers_name_divider, 20);
        f12223L.put(C4014R.C4016id.address_caption, 21);
        f12223L.put(C4014R.C4016id.address_divider, 22);
        f12223L.put(C4014R.C4016id.recyclerview_tutor_details, 23);
    }

    public ActivityProfileDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 24, f12222K, f12223L);
        super(fVar, view, 1, (TextView) a[21], (View) a[22], (TextView) a[7], (AppBarLayout) a[8], (TextView) a[15], (View) a[16], (TextView) a[4], (TextView) a[1], (TextView) a[13], (View) a[14], (TextView) a[3], (TextView) a[19], (View) a[20], (TextView) a[6], (NestedScrollView) a[10], (TextView) a[17], (View) a[18], (TextView) a[5], (RecyclerView) a[23], (TextView) a[11], (View) a[12], (TextView) a[2], (Toolbar) a[9]);
        this.f12221z.setTag(null);
        this.f12214A.setTag(null);
        this.f12215B.setTag(null);
        this.f12216C.setTag(null);
        this.f12224H = (CoordinatorLayout) a[0];
        this.f12224H.setTag(null);
        this.f12217D.setTag(null);
        this.f12218E.setTag(null);
        this.f12219F.setTag(null);
        mo6098a(view);
        this.f12225I = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        String str;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        synchronized (this) {
            j = this.f12226J;
            this.f12226J = 0;
        }
        ProfileDetailViewModel profileDetailViewModel = this.f12220G;
        String str2 = null;
        if ((255 & j) != 0) {
            charSequence4 = ((j & 137) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.mo14228m1();
            CharSequence q = ((j & 131) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.mo14229q();
            CharSequence H0 = ((j & 133) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.mo14225H0();
            CharSequence C1 = ((j & 161) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.mo14224C1();
            CharSequence z1 = ((j & 193) == 0 || profileDetailViewModel == null) ? null : profileDetailViewModel.mo14232z1();
            if (!((j & 145) == 0 || profileDetailViewModel == null)) {
                str2 = profileDetailViewModel.mo14230q1();
            }
            charSequence = q;
            str = str2;
            charSequence3 = H0;
            charSequence2 = C1;
            charSequence5 = z1;
        } else {
            charSequence5 = null;
            charSequence4 = null;
            charSequence3 = null;
            charSequence2 = null;
            str = null;
            charSequence = null;
        }
        if ((j & 193) != 0) {
            C3158a.m7850a(this.f12221z, charSequence5);
        }
        if ((j & 137) != 0) {
            C3158a.m7850a(this.f12214A, charSequence4);
        }
        if ((128 & j) != 0) {
            this.f12215B.setOnClickListener(this.f12225I);
        }
        if ((j & 133) != 0) {
            C3158a.m7850a(this.f12216C, charSequence3);
        }
        if ((j & 161) != 0) {
            C3158a.m7850a(this.f12217D, charSequence2);
        }
        if ((145 & j) != 0) {
            C3158a.m7850a(this.f12218E, (CharSequence) str);
        }
        if ((j & 131) != 0) {
            C3158a.m7850a(this.f12219F, charSequence);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12226J != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12226J = 128;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12374a(ProfileDetailViewModel profileDetailViewModel) {
        mo6103a(0, (C3705i) profileDetailViewModel);
        this.f12220G = profileDetailViewModel;
        synchronized (this) {
            this.f12226J |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12374a((ProfileDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12375e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12226J |= 1;
            }
            return true;
        } else if (i == 24) {
            synchronized (this) {
                this.f12226J |= 2;
            }
            return true;
        } else if (i == 10) {
            synchronized (this) {
                this.f12226J |= 4;
            }
            return true;
        } else if (i == 107) {
            synchronized (this) {
                this.f12226J |= 8;
            }
            return true;
        } else if (i == 43) {
            synchronized (this) {
                this.f12226J |= 16;
            }
            return true;
        } else if (i == 26) {
            synchronized (this) {
                this.f12226J |= 32;
            }
            return true;
        } else if (i != 55) {
            return false;
        } else {
            synchronized (this) {
                this.f12226J |= 64;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        ProfileDetailViewModel profileDetailViewModel = (ProfileDetailViewModel) obj;
        return mo12375e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        ProfileDetailViewModel profileDetailViewModel = this.f12220G;
        if (profileDetailViewModel != null) {
            profileDetailViewModel.mo14231w1();
        }
    }
}
