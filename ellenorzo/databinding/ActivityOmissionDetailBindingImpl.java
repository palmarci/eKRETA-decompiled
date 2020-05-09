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
import p289hu.ekreta.ellenorzo.omission.OmissionDetailViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityOmissionDetailBindingImpl */
public class ActivityOmissionDetailBindingImpl extends ActivityOmissionDetailBinding {

    /* renamed from: M */
    public static final C2867f f12197M = null;

    /* renamed from: N */
    public static final SparseIntArray f12198N = new SparseIntArray();

    /* renamed from: K */
    public final CoordinatorLayout f12199K;

    /* renamed from: L */
    public long f12200L = -1;

    static {
        f12198N.put(C4014R.C4016id.app_bar_layout, 11);
        f12198N.put(C4014R.C4016id.toolbar, 12);
        f12198N.put(C4014R.C4016id.nested_scroll_view, 13);
        f12198N.put(C4014R.C4016id.constraint_layout, 14);
        f12198N.put(C4014R.C4016id.subject_caption, 15);
        f12198N.put(C4014R.C4016id.subject_divider, 16);
        f12198N.put(C4014R.C4016id.type_caption, 17);
        f12198N.put(C4014R.C4016id.type_divider, 18);
        f12198N.put(C4014R.C4016id.mode_caption, 19);
        f12198N.put(C4014R.C4016id.mode_divider, 20);
        f12198N.put(C4014R.C4016id.justification_state_caption, 21);
        f12198N.put(C4014R.C4016id.justification_state_divider, 22);
        f12198N.put(C4014R.C4016id.lesson_start_time_caption, 23);
        f12198N.put(C4014R.C4016id.lesson_start_time_divider, 24);
        f12198N.put(C4014R.C4016id.teacher_caption, 25);
        f12198N.put(C4014R.C4016id.teacher_divider, 26);
        f12198N.put(C4014R.C4016id.creating_time_caption, 27);
    }

    public ActivityOmissionDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 28, f12197M, f12198N);
        super(fVar, view, 1, (AppBarLayout) a[11], (ConstraintLayout) a[14], (TextView) a[27], (TextView) a[10], (TextView) a[1], (View) a[3], (TextView) a[2], (TextView) a[21], (View) a[22], (TextView) a[7], (TextView) a[23], (View) a[24], (TextView) a[8], (TextView) a[19], (View) a[20], (TextView) a[6], (NestedScrollView) a[13], (TextView) a[15], (View) a[16], (TextView) a[4], (TextView) a[25], (View) a[26], (TextView) a[9], (Toolbar) a[12], (TextView) a[17], (View) a[18], (TextView) a[5]);
        this.f12196z.setTag(null);
        this.f12186A.setTag(null);
        this.f12187B.setTag(null);
        this.f12188C.setTag(null);
        this.f12189D.setTag(null);
        this.f12190E.setTag(null);
        this.f12199K = (CoordinatorLayout) a[0];
        this.f12199K.setTag(null);
        this.f12191F.setTag(null);
        this.f12192G.setTag(null);
        this.f12193H.setTag(null);
        this.f12194I.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        String str2;
        synchronized (this) {
            j = this.f12200L;
            this.f12200L = 0;
        }
        OmissionDetailViewModel omissionDetailViewModel = this.f12195J;
        String str3 = null;
        if ((1023 & j) != 0) {
            charSequence6 = ((j & 769) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.mo13888y();
            CharSequence typeName = ((j & 521) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.getTypeName();
            String p = ((j & 515) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.mo13886p();
            CharSequence p1 = ((j & 545) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.mo13887p1();
            CharSequence j2 = ((j & 517) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.mo13884j();
            CharSequence c1 = ((j & 577) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.mo13882c1();
            CharSequence m = ((j & 641) == 0 || omissionDetailViewModel == null) ? null : omissionDetailViewModel.mo13885m();
            if (!((j & 529) == 0 || omissionDetailViewModel == null)) {
                str3 = omissionDetailViewModel.mo13880M0();
            }
            charSequence = typeName;
            str = str3;
            str2 = p;
            charSequence5 = p1;
            charSequence3 = j2;
            charSequence4 = c1;
            charSequence2 = m;
        } else {
            str2 = null;
            charSequence6 = null;
            charSequence5 = null;
            charSequence4 = null;
            str = null;
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
        }
        if ((j & 769) != 0) {
            C3158a.m7850a(this.f12196z, charSequence6);
        }
        if ((j & 515) != 0) {
            this.f12186A.setVisibility(BindingConverters.m14793a(str2));
            this.f12187B.setVisibility(BindingConverters.m14793a(str2));
            C3158a.m7850a(this.f12188C, (CharSequence) str2);
            this.f12188C.setVisibility(BindingConverters.m14793a(str2));
        }
        if ((j & 545) != 0) {
            C3158a.m7850a(this.f12189D, charSequence5);
        }
        if ((j & 577) != 0) {
            C3158a.m7850a(this.f12190E, charSequence4);
        }
        if ((j & 529) != 0) {
            C3158a.m7850a(this.f12191F, (CharSequence) str);
        }
        if ((517 & j) != 0) {
            C3158a.m7850a(this.f12192G, charSequence3);
        }
        if ((641 & j) != 0) {
            C3158a.m7850a(this.f12193H, charSequence2);
        }
        if ((j & 521) != 0) {
            C3158a.m7850a(this.f12194I, charSequence);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12200L != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12200L = 512;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12370a(OmissionDetailViewModel omissionDetailViewModel) {
        mo6103a(0, (C3705i) omissionDetailViewModel);
        this.f12195J = omissionDetailViewModel;
        synchronized (this) {
            this.f12200L |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12370a((OmissionDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12371e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12200L |= 1;
            }
            return true;
        } else if (i == 79) {
            synchronized (this) {
                this.f12200L |= 2;
            }
            return true;
        } else if (i == 70) {
            synchronized (this) {
                this.f12200L |= 4;
            }
            return true;
        } else if (i == 36) {
            synchronized (this) {
                this.f12200L |= 8;
            }
            return true;
        } else if (i == 91) {
            synchronized (this) {
                this.f12200L |= 16;
            }
            return true;
        } else if (i == 77) {
            synchronized (this) {
                this.f12200L |= 32;
            }
            return true;
        } else if (i == 33) {
            synchronized (this) {
                this.f12200L |= 64;
            }
            return true;
        } else if (i == 99) {
            synchronized (this) {
                this.f12200L |= 128;
            }
            return true;
        } else if (i != 47) {
            return false;
        } else {
            synchronized (this) {
                this.f12200L |= 256;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        OmissionDetailViewModel omissionDetailViewModel = (OmissionDetailViewModel) obj;
        return mo12371e(i2);
    }
}
