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
import p289hu.ekreta.ellenorzo.evaluation.EvaluationDetailsViewModel;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;
import p289hu.ekreta.ellenorzo.util.binding.TextViewBindings;

/* renamed from: hu.ekreta.ellenorzo.databinding.ActivityEvaluationDetailsBindingImpl */
public class ActivityEvaluationDetailsBindingImpl extends ActivityEvaluationDetailsBinding {

    /* renamed from: W */
    public static final C2867f f12034W = null;

    /* renamed from: X */
    public static final SparseIntArray f12035X = new SparseIntArray();

    /* renamed from: U */
    public final CoordinatorLayout f12036U;

    /* renamed from: V */
    public long f12037V = -1;

    static {
        f12035X.put(C4014R.C4016id.app_bar_layout, 21);
        f12035X.put(C4014R.C4016id.toolbar, 22);
        f12035X.put(C4014R.C4016id.nested_scroll_view, 23);
        f12035X.put(C4014R.C4016id.constraint_layout, 24);
        f12035X.put(C4014R.C4016id.subject_caption, 25);
        f12035X.put(C4014R.C4016id.subject_divider, 26);
        f12035X.put(C4014R.C4016id.date_caption, 27);
        f12035X.put(C4014R.C4016id.room_divider, 28);
        f12035X.put(C4014R.C4016id.teacher_caption, 29);
        f12035X.put(C4014R.C4016id.teacher_divider, 30);
    }

    public ActivityEvaluationDetailsBindingImpl(C3702f fVar, View view) {
        Object[] a = ViewDataBinding.m6046a(fVar, view, 31, f12034W, f12035X);
        super(fVar, view, 1, (AppBarLayout) a[21], (ConstraintLayout) a[24], (TextView) a[19], (TextView) a[20], (TextView) a[27], (TextView) a[17], (TextView) a[1], (View) a[3], (TextView) a[2], (TextView) a[5], (View) a[7], (TextView) a[6], (NestedScrollView) a[23], (View) a[28], (TextView) a[25], (View) a[26], (TextView) a[4], (TextView) a[29], (View) a[30], (TextView) a[18], (TextView) a[8], (View) a[10], (TextView) a[9], (Toolbar) a[22], (TextView) a[11], (View) a[13], (TextView) a[12], (TextView) a[14], (View) a[16], (TextView) a[15]);
        this.f12033z.setTag(null);
        this.f12013A.setTag(null);
        this.f12014B.setTag(null);
        this.f12015C.setTag(null);
        this.f12016D.setTag(null);
        this.f12017E.setTag(null);
        this.f12036U = (CoordinatorLayout) a[0];
        this.f12036U.setTag(null);
        this.f12018F.setTag(null);
        this.f12019G.setTag(null);
        this.f12020H.setTag(null);
        this.f12021I.setTag(null);
        this.f12022J.setTag(null);
        this.f12023K.setTag(null);
        this.f12024L.setTag(null);
        this.f12025M.setTag(null);
        this.f12026N.setTag(null);
        this.f12027O.setTag(null);
        this.f12028P.setTag(null);
        this.f12029Q.setTag(null);
        this.f12030R.setTag(null);
        this.f12031S.setTag(null);
        mo6098a(view);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        String str;
        String str2;
        String str3;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str4;
        CharSequence charSequence3;
        String str5;
        CharSequence charSequence4;
        synchronized (this) {
            j = this.f12037V;
            this.f12037V = 0;
        }
        boolean z = false;
        EvaluationDetailsViewModel evaluationDetailsViewModel = this.f12032T;
        String str6 = null;
        if ((8191 & j) != 0) {
            if (!((j & 5121) == 0 || evaluationDetailsViewModel == null)) {
                z = evaluationDetailsViewModel.mo12639i1();
            }
            String u0 = ((j & 4105) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12644u0();
            charSequence3 = ((j & 6145) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12645y();
            String p = ((j & 4099) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12642p();
            String t1 = ((j & 4225) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12643t1();
            String value = ((j & 4161) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.getValue();
            CharSequence j2 = ((j & 4101) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12640j();
            String D1 = ((j & 4129) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12635D1();
            CharSequence h = ((j & 4353) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12638h();
            CharSequence D0 = ((j & 4113) == 0 || evaluationDetailsViewModel == null) ? null : evaluationDetailsViewModel.mo12634D0();
            if (!((j & 4609) == 0 || evaluationDetailsViewModel == null)) {
                str6 = evaluationDetailsViewModel.mo12641m();
            }
            str4 = str6;
            charSequence = j2;
            str3 = D1;
            charSequence4 = h;
            charSequence2 = D0;
            str6 = u0;
            str5 = p;
            str = t1;
            str2 = value;
        } else {
            charSequence4 = null;
            str5 = null;
            charSequence3 = null;
            str4 = null;
            charSequence2 = null;
            charSequence = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j & 5121) != 0) {
            this.f12033z.setVisibility(BindingConverters.m14795a(z));
            this.f12013A.setVisibility(BindingConverters.m14795a(z));
        }
        if ((j & 6145) != 0) {
            C3158a.m7850a(this.f12013A, charSequence3);
        }
        if ((j & 4353) != 0) {
            C3158a.m7850a(this.f12014B, charSequence4);
        }
        if ((j & 4099) != 0) {
            this.f12015C.setVisibility(BindingConverters.m14793a(str5));
            this.f12016D.setVisibility(BindingConverters.m14793a(str5));
            C3158a.m7850a(this.f12017E, (CharSequence) str5);
            this.f12017E.setVisibility(BindingConverters.m14793a(str5));
        }
        if ((j & 4105) != 0) {
            this.f12018F.setVisibility(BindingConverters.m14793a(str6));
            this.f12019G.setVisibility(BindingConverters.m14793a(str6));
            String str7 = str6;
            C3158a.m7850a(this.f12020H, (CharSequence) str7);
            this.f12020H.setVisibility(BindingConverters.m14793a(str7));
        }
        if ((j & 4101) != 0) {
            C3158a.m7850a(this.f12021I, charSequence);
        }
        if ((j & 4609) != 0) {
            C3158a.m7850a(this.f12022J, (CharSequence) str4);
        }
        if ((4113 & j) != 0) {
            C3158a.m7850a(this.f12023K, charSequence2);
        }
        if ((4129 & j) != 0) {
            this.f12023K.setVisibility(BindingConverters.m14793a(str3));
            this.f12024L.setVisibility(BindingConverters.m14793a(str3));
            String str8 = str3;
            C3158a.m7850a(this.f12025M, (CharSequence) str8);
            this.f12025M.setVisibility(BindingConverters.m14793a(str8));
        }
        if ((4161 & j) != 0) {
            this.f12026N.setVisibility(BindingConverters.m14793a(str2));
            this.f12027O.setVisibility(BindingConverters.m14793a(str2));
            this.f12028P.setVisibility(BindingConverters.m14793a(str2));
            TextViewBindings.m14798a(this.f12028P, str2);
        }
        if ((j & 4225) != 0) {
            this.f12029Q.setVisibility(BindingConverters.m14793a(str));
            this.f12030R.setVisibility(BindingConverters.m14793a(str));
            String str9 = str;
            C3158a.m7850a(this.f12031S, (CharSequence) str9);
            this.f12031S.setVisibility(BindingConverters.m14793a(str9));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12037V != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12037V = 4096;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12346a(EvaluationDetailsViewModel evaluationDetailsViewModel) {
        mo6103a(0, (C3705i) evaluationDetailsViewModel);
        this.f12032T = evaluationDetailsViewModel;
        synchronized (this) {
            this.f12037V |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12346a((EvaluationDetailsViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12347e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12037V |= 1;
            }
            return true;
        } else if (i == 79) {
            synchronized (this) {
                this.f12037V |= 2;
            }
            return true;
        } else if (i == 70) {
            synchronized (this) {
                this.f12037V |= 4;
            }
            return true;
        } else if (i == 75) {
            synchronized (this) {
                this.f12037V |= 8;
            }
            return true;
        } else if (i == 112) {
            synchronized (this) {
                this.f12037V |= 16;
            }
            return true;
        } else if (i == 50) {
            synchronized (this) {
                this.f12037V |= 32;
            }
            return true;
        } else if (i == 102) {
            synchronized (this) {
                this.f12037V |= 64;
            }
            return true;
        } else if (i == 83) {
            synchronized (this) {
                this.f12037V |= 128;
            }
            return true;
        } else if (i == 64) {
            synchronized (this) {
                this.f12037V |= 256;
            }
            return true;
        } else if (i == 99) {
            synchronized (this) {
                this.f12037V |= 512;
            }
            return true;
        } else if (i == 60) {
            synchronized (this) {
                this.f12037V |= 1024;
            }
            return true;
        } else if (i != 47) {
            return false;
        } else {
            synchronized (this) {
                this.f12037V |= 2048;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        EvaluationDetailsViewModel evaluationDetailsViewModel = (EvaluationDetailsViewModel) obj;
        return mo12347e(i2);
    }
}
