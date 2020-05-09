package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl */
public class IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl extends IncludeCaseDetailsTmgiRequestedabsenceintervalBinding {

    /* renamed from: D */
    public static final C2867f f12521D = null;

    /* renamed from: E */
    public static final SparseIntArray f12522E = null;

    /* renamed from: C */
    public long f12523C = -1;

    public IncludeCaseDetailsTmgiRequestedabsenceintervalBindingImpl(C3702f fVar, View[] viewArr) {
        Object[] a = ViewDataBinding.m6047a(fVar, viewArr, 2, f12521D, f12522E);
        super(fVar, viewArr[0], 0, (TextView) a[0], (TextView) a[1]);
        this.f12520z.setTag(null);
        this.f12518A.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12523C;
            this.f12523C = 0;
        }
        String str = this.f12519B;
        if ((j & 3) != 0) {
            this.f12520z.setVisibility(BindingConverters.m14793a(str));
            C3158a.m7850a(this.f12518A, (CharSequence) str);
            this.f12518A.setVisibility(BindingConverters.m14793a(str));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12523C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12523C = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (12 != i) {
            return false;
        }
        mo12444q((String) obj);
        return true;
    }

    /* renamed from: q */
    public void mo12444q(String str) {
        this.f12519B = str;
        synchronized (this) {
            this.f12523C |= 1;
        }
        mo10512c(12);
        super.mo6096S1();
    }
}
