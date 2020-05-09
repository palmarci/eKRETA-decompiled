package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.C4014R;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.timetable.detail.TimeTableItemDetailViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityLessonDetailBindingImpl */
public class ActivityLessonDetailBindingImpl extends ActivityLessonDetailBinding implements Listener {

    /* renamed from: O */
    public static final C2867f f12082O = null;

    /* renamed from: P */
    public static final SparseIntArray f12083P = new SparseIntArray();

    /* renamed from: I */
    public final CoordinatorLayout f12084I;

    /* renamed from: J */
    public final FrameLayout f12085J;

    /* renamed from: K */
    public final OnClickListener f12086K;

    /* renamed from: L */
    public final OnClickListener f12087L;

    /* renamed from: M */
    public final OnClickListener f12088M;

    /* renamed from: N */
    public long f12089N = -1;

    static {
        f12083P.put(C4014R.C4016id.app_bar_layout, 10);
        f12083P.put(C4014R.C4016id.nested_scroll_view, 11);
        f12083P.put(C4014R.C4016id.constraint_layout, 12);
        f12083P.put(C4014R.C4016id.room_caption, 13);
        f12083P.put(C4014R.C4016id.room_divider, 14);
        f12083P.put(C4014R.C4016id.teacher_caption, 15);
        f12083P.put(C4014R.C4016id.teacher_divider, 16);
        f12083P.put(C4014R.C4016id.date_caption, 17);
    }

    public ActivityLessonDetailBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 18, f12082O, f12083P);
        super(fVar, view, 1, (MaterialButton) a[5], (MaterialButton) a[7], (AppBarLayout) a[10], (ConstraintLayout) a[12], (TextView) a[17], (TextView) a[4], (MaterialButton) a[6], (NestedScrollView) a[11], (ProgressBar) a[9], (TextView) a[13], (View) a[14], (TextView) a[2], (TextView) a[15], (View) a[16], (TextView) a[3], (Toolbar) a[1]);
        this.f12081z.setTag(null);
        this.f12073A.setTag(null);
        this.f12074B.setTag(null);
        this.f12075C.setTag(null);
        this.f12084I = (CoordinatorLayout) a[0];
        this.f12084I.setTag(null);
        this.f12085J = (FrameLayout) a[8];
        this.f12085J.setTag(null);
        this.f12076D.setTag(null);
        this.f12077E.setTag(null);
        this.f12078F.setTag(null);
        this.f12079G.setTag(null);
        mo6098a(view);
        this.f12086K = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 3);
        this.f12087L = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        this.f12088M = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        String str;
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z2;
        boolean z3;
        CharSequence charSequence3;
        synchronized (this) {
            j = this.f12089N;
            this.f12089N = 0;
        }
        TimeTableItemDetailViewModel timeTableItemDetailViewModel = this.f12080H;
        String str2 = null;
        boolean z4 = false;
        if ((1023 & j) != 0) {
            z3 = ((j & 577) == 0 || timeTableItemDetailViewModel == null) ? false : timeTableItemDetailViewModel.mo16145J0();
            z2 = ((j & 641) == 0 || timeTableItemDetailViewModel == null) ? false : timeTableItemDetailViewModel.mo16148X0();
            z = ((j & 769) == 0 || timeTableItemDetailViewModel == null) ? false : timeTableItemDetailViewModel.mo16150d();
            CharSequence h = ((j & 529) == 0 || timeTableItemDetailViewModel == null) ? null : timeTableItemDetailViewModel.mo16152h();
            CharSequence r1 = ((j & 517) == 0 || timeTableItemDetailViewModel == null) ? null : timeTableItemDetailViewModel.mo16154r1();
            CharSequence m = ((j & 521) == 0 || timeTableItemDetailViewModel == null) ? null : timeTableItemDetailViewModel.mo16153m();
            if (!((j & 545) == 0 || timeTableItemDetailViewModel == null)) {
                z4 = timeTableItemDetailViewModel.mo16146R0();
            }
            if (!((j & 515) == 0 || timeTableItemDetailViewModel == null)) {
                str2 = timeTableItemDetailViewModel.getName();
            }
            str = str2;
            charSequence3 = h;
            charSequence2 = r1;
            charSequence = m;
        } else {
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
            str = null;
            z3 = false;
            z2 = false;
            z = false;
        }
        if ((j & 512) != 0) {
            this.f12081z.setOnClickListener(this.f12087L);
            this.f12073A.setOnClickListener(this.f12086K);
            this.f12075C.setOnClickListener(this.f12088M);
        }
        if ((j & 545) != 0) {
            this.f12081z.setVisibility(BindingConverters.m14795a(z4));
        }
        if ((j & 641) != 0) {
            this.f12073A.setVisibility(BindingConverters.m14795a(z2));
        }
        if ((j & 529) != 0) {
            C3158a.m7850a(this.f12074B, charSequence3);
        }
        if ((j & 577) != 0) {
            this.f12075C.setVisibility(BindingConverters.m14795a(z3));
        }
        if ((j & 769) != 0) {
            this.f12085J.setVisibility(BindingConverters.m14795a(z));
            this.f12076D.setVisibility(BindingConverters.m14795a(z));
        }
        if ((j & 517) != 0) {
            C3158a.m7850a(this.f12077E, charSequence2);
        }
        if ((521 & j) != 0) {
            C3158a.m7850a(this.f12078F, charSequence);
        }
        if ((j & 515) != 0) {
            this.f12079G.setTitle((CharSequence) str);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12089N != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12089N = 512;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12355a(TimeTableItemDetailViewModel timeTableItemDetailViewModel) {
        mo6103a(0, (C3705i) timeTableItemDetailViewModel);
        this.f12080H = timeTableItemDetailViewModel;
        synchronized (this) {
            this.f12089N |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12355a((TimeTableItemDetailViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12356e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12089N |= 1;
            }
            return true;
        } else if (i == 87) {
            synchronized (this) {
                this.f12089N |= 2;
            }
            return true;
        } else if (i == 20) {
            synchronized (this) {
                this.f12089N |= 4;
            }
            return true;
        } else if (i == 99) {
            synchronized (this) {
                this.f12089N |= 8;
            }
            return true;
        } else if (i == 64) {
            synchronized (this) {
                this.f12089N |= 16;
            }
            return true;
        } else if (i == 90) {
            synchronized (this) {
                this.f12089N |= 32;
            }
            return true;
        } else if (i == 11) {
            synchronized (this) {
                this.f12089N |= 64;
            }
            return true;
        } else if (i == 7) {
            synchronized (this) {
                this.f12089N |= 128;
            }
            return true;
        } else if (i != 37) {
            return false;
        } else {
            synchronized (this) {
                this.f12089N |= 256;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        TimeTableItemDetailViewModel timeTableItemDetailViewModel = (TimeTableItemDetailViewModel) obj;
        return mo12356e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            TimeTableItemDetailViewModel timeTableItemDetailViewModel = this.f12080H;
            if (timeTableItemDetailViewModel != null) {
                z = true;
            }
            if (z) {
                timeTableItemDetailViewModel.mo16144H1();
            }
        } else if (i == 2) {
            TimeTableItemDetailViewModel timeTableItemDetailViewModel2 = this.f12080H;
            if (timeTableItemDetailViewModel2 != null) {
                z = true;
            }
            if (z) {
                timeTableItemDetailViewModel2.mo16155y1();
            }
        } else if (i == 3) {
            TimeTableItemDetailViewModel timeTableItemDetailViewModel3 = this.f12080H;
            if (timeTableItemDetailViewModel3 != null) {
                z = true;
            }
            if (z) {
                timeTableItemDetailViewModel3.mo16147V0();
            }
        }
    }
}
