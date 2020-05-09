package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.announcedTest.AnnouncedTestDetailViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityAnnouncedTestDetailBindingImpl */
public class ActivityAnnouncedTestDetailBindingImpl extends ActivityAnnouncedTestDetailBinding {

    /* renamed from: L */
    public static final C2867f f11930L = null;

    /* renamed from: M */
    public static final SparseIntArray f11931M = new SparseIntArray();

    /* renamed from: J */
    public final CoordinatorLayout f11932J;

    /* renamed from: K */
    public long f11933K = -1;

    static {
        f11931M.put(C4014R.C4016id.app_bar_layout, 10);
        f11931M.put(C4014R.C4016id.toolbar, 11);
        f11931M.put(C4014R.C4016id.nested_scroll_view, 12);
        f11931M.put(C4014R.C4016id.constraint_layout, 13);
        f11931M.put(C4014R.C4016id.subject_caption, 14);
        f11931M.put(C4014R.C4016id.subject_divider, 15);
        f11931M.put(C4014R.C4016id.type_caption, 16);
        f11931M.put(C4014R.C4016id.type_divider, 17);
        f11931M.put(C4014R.C4016id.name_caption, 18);
        f11931M.put(C4014R.C4016id.name_divider, 19);
        f11931M.put(C4014R.C4016id.date_caption, 20);
        f11931M.put(C4014R.C4016id.room_divider, 21);
        f11931M.put(C4014R.C4016id.teacher_caption, 22);
        f11931M.put(C4014R.C4016id.teacher_divider, 23);
        f11931M.put(C4014R.C4016id.record_date_caption, 24);
    }

    public ActivityAnnouncedTestDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 25, f11930L, f11931M);
        super(fVar, view, 1, (AppBarLayout) a[10], (ConstraintLayout) a[13], (TextView) a[20], (TextView) a[7], (TextView) a[1], (View) a[3], (TextView) a[2], (TextView) a[18], (View) a[19], (TextView) a[6], (NestedScrollView) a[12], (TextView) a[24], (TextView) a[9], (View) a[21], (TextView) a[14], (View) a[15], (TextView) a[4], (TextView) a[22], (View) a[23], (TextView) a[8], (Toolbar) a[11], (TextView) a[16], (View) a[17], (TextView) a[5]);
        this.f11929z.setTag(null);
        this.f11920A.setTag(null);
        this.f11921B.setTag(null);
        this.f11922C.setTag(null);
        this.f11932J = (CoordinatorLayout) a[0];
        this.f11932J.setTag(null);
        this.f11923D.setTag(null);
        this.f11924E.setTag(null);
        this.f11925F.setTag(null);
        this.f11926G.setTag(null);
        this.f11927H.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str;
        String str2;
        CharSequence charSequence5;
        synchronized (this) {
            j = this.f11933K;
            this.f11933K = 0;
        }
        AnnouncedTestDetailViewModel announcedTestDetailViewModel = this.f11928I;
        String str3 = null;
        if ((511 & j) != 0) {
            CharSequence u0 = ((j & 265) == 0 || announcedTestDetailViewModel == null) ? null : announcedTestDetailViewModel.mo11352u0();
            str = ((j & 259) == 0 || announcedTestDetailViewModel == null) ? null : announcedTestDetailViewModel.mo11351p();
            CharSequence Z0 = ((j & 385) == 0 || announcedTestDetailViewModel == null) ? null : announcedTestDetailViewModel.mo11345Z0();
            CharSequence j2 = ((j & 261) == 0 || announcedTestDetailViewModel == null) ? null : announcedTestDetailViewModel.mo11349j();
            CharSequence h = ((j & 289) == 0 || announcedTestDetailViewModel == null) ? null : announcedTestDetailViewModel.mo11348h();
            CharSequence m = ((j & 321) == 0 || announcedTestDetailViewModel == null) ? null : announcedTestDetailViewModel.mo11350m();
            if (!((j & 273) == 0 || announcedTestDetailViewModel == null)) {
                str3 = announcedTestDetailViewModel.getDescription();
            }
            charSequence = u0;
            str2 = str3;
            charSequence4 = Z0;
            charSequence3 = j2;
            charSequence5 = h;
            charSequence2 = m;
        } else {
            charSequence5 = null;
            str2 = null;
            str = null;
            charSequence4 = null;
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
        }
        if ((j & 289) != 0) {
            C3158a.m7850a(this.f11929z, charSequence5);
        }
        if ((j & 259) != 0) {
            this.f11920A.setVisibility(BindingConverters.m14793a(str));
            this.f11921B.setVisibility(BindingConverters.m14793a(str));
            C3158a.m7850a(this.f11922C, (CharSequence) str);
            this.f11922C.setVisibility(BindingConverters.m14793a(str));
        }
        if ((j & 273) != 0) {
            C3158a.m7850a(this.f11923D, (CharSequence) str2);
        }
        if ((j & 385) != 0) {
            C3158a.m7850a(this.f11924E, charSequence4);
        }
        if ((261 & j) != 0) {
            C3158a.m7850a(this.f11925F, charSequence3);
        }
        if ((321 & j) != 0) {
            C3158a.m7850a(this.f11926G, charSequence2);
        }
        if ((j & 265) != 0) {
            C3158a.m7850a(this.f11927H, charSequence);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f11933K != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f11933K = 256;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12327a(AnnouncedTestDetailViewModel announcedTestDetailViewModel) {
        mo6103a(0, (C3705i) announcedTestDetailViewModel);
        this.f11928I = announcedTestDetailViewModel;
        synchronized (this) {
            this.f11933K |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12327a((AnnouncedTestDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12328e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f11933K |= 1;
            }
            return true;
        } else if (i == 79) {
            synchronized (this) {
                this.f11933K |= 2;
            }
            return true;
        } else if (i == 70) {
            synchronized (this) {
                this.f11933K |= 4;
            }
            return true;
        } else if (i == 75) {
            synchronized (this) {
                this.f11933K |= 8;
            }
            return true;
        } else if (i == 92) {
            synchronized (this) {
                this.f11933K |= 16;
            }
            return true;
        } else if (i == 64) {
            synchronized (this) {
                this.f11933K |= 32;
            }
            return true;
        } else if (i == 99) {
            synchronized (this) {
                this.f11933K |= 64;
            }
            return true;
        } else if (i != 62) {
            return false;
        } else {
            synchronized (this) {
                this.f11933K |= 128;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        AnnouncedTestDetailViewModel announcedTestDetailViewModel = (AnnouncedTestDetailViewModel) obj;
        return mo12328e(i2);
    }
}
