package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p211h.p258l.C3705i;
import p289hu.ekreta.ellenorzo.cases.detail.CaseDetailsViewModel;
import p289hu.ekreta.ellenorzo.generated.callback.OnClickListener.Listener;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsRectificationbuttonBindingImpl */
public class IncludeCaseDetailsRectificationbuttonBindingImpl extends IncludeCaseDetailsRectificationbuttonBinding implements Listener {

    /* renamed from: F */
    public static final C2867f f12483F = null;

    /* renamed from: G */
    public static final SparseIntArray f12484G = null;

    /* renamed from: C */
    public final OnClickListener f12485C;

    /* renamed from: D */
    public final OnClickListener f12486D;

    /* renamed from: E */
    public long f12487E = -1;

    public IncludeCaseDetailsRectificationbuttonBindingImpl(C3702f fVar, View[] viewArr) {
        Object[] a = ViewDataBinding.m6047a(fVar, viewArr, 2, f12483F, f12484G);
        super(fVar, viewArr[0], 1, (Button) a[1], (Button) a[0]);
        this.f12482z.setTag(null);
        this.f12480A.setTag(null);
        mo6101a(viewArr);
        this.f12485C = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 1);
        this.f12486D = new p289hu.ekreta.ellenorzo.generated.callback.OnClickListener(this, 2);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        boolean z;
        CharSequence charSequence;
        String str;
        synchronized (this) {
            j = this.f12487E;
            this.f12487E = 0;
        }
        CaseDetailsViewModel caseDetailsViewModel = this.f12481B;
        boolean z2 = false;
        String str2 = null;
        if ((63 & j) != 0) {
            charSequence = ((j & 35) == 0 || caseDetailsViewModel == null) ? null : caseDetailsViewModel.mo11790O();
            z = ((j & 49) == 0 || caseDetailsViewModel == null) ? false : caseDetailsViewModel.mo11793S();
            if (!((j & 37) == 0 || caseDetailsViewModel == null)) {
                z2 = caseDetailsViewModel.mo11807w();
            }
            if (!((j & 41) == 0 || caseDetailsViewModel == null)) {
                str2 = caseDetailsViewModel.mo11792Q();
            }
            str = str2;
        } else {
            str = null;
            charSequence = null;
            z = false;
        }
        if ((j & 32) != 0) {
            this.f12482z.setOnClickListener(this.f12486D);
            this.f12480A.setOnClickListener(this.f12485C);
        }
        if ((j & 41) != 0) {
            C3158a.m7850a((TextView) this.f12482z, (CharSequence) str);
        }
        if ((j & 49) != 0) {
            this.f12482z.setVisibility(BindingConverters.m14795a(z));
        }
        if ((j & 35) != 0) {
            C3158a.m7850a((TextView) this.f12480A, charSequence);
        }
        if ((j & 37) != 0) {
            this.f12480A.setVisibility(BindingConverters.m14795a(z2));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12487E != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12487E = 32;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public void mo12437a(CaseDetailsViewModel caseDetailsViewModel) {
        mo6103a(0, (C3705i) caseDetailsViewModel);
        this.f12481B = caseDetailsViewModel;
        synchronized (this) {
            this.f12487E |= 1;
        }
        mo10512c(88);
        super.mo6096S1();
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (88 != i) {
            return false;
        }
        mo12437a((CaseDetailsViewModel) obj);
        return true;
    }

    /* renamed from: e */
    public final boolean mo12438e(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f12487E |= 1;
            }
            return true;
        } else if (i == 42) {
            synchronized (this) {
                this.f12487E |= 2;
            }
            return true;
        } else if (i == 98) {
            synchronized (this) {
                this.f12487E |= 4;
            }
            return true;
        } else if (i == 27) {
            synchronized (this) {
                this.f12487E |= 8;
            }
            return true;
        } else if (i != 49) {
            return false;
        } else {
            synchronized (this) {
                this.f12487E |= 16;
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        CaseDetailsViewModel caseDetailsViewModel = (CaseDetailsViewModel) obj;
        return mo12438e(i2);
    }

    /* renamed from: a */
    public final void mo12329a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            CaseDetailsViewModel caseDetailsViewModel = this.f12481B;
            if (caseDetailsViewModel != null) {
                z = true;
            }
            if (z) {
                caseDetailsViewModel.mo11787F();
            }
        } else if (i == 2) {
            CaseDetailsViewModel caseDetailsViewModel2 = this.f12481B;
            if (caseDetailsViewModel2 != null) {
                z = true;
            }
            if (z) {
                caseDetailsViewModel2.mo11789N();
            }
        }
    }
}
