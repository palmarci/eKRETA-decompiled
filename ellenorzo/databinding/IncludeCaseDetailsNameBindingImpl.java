package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeCaseDetailsNameBindingImpl */
public class IncludeCaseDetailsNameBindingImpl extends IncludeCaseDetailsNameBinding {

    /* renamed from: E */
    public static final C2867f f12462E = null;

    /* renamed from: F */
    public static final SparseIntArray f12463F = null;

    /* renamed from: D */
    public long f12464D = -1;

    public IncludeCaseDetailsNameBindingImpl(C3702f fVar, View[] viewArr) {
        Object[] a = ViewDataBinding.m6047a(fVar, viewArr, 2, f12462E, f12463F);
        super(fVar, viewArr[0], 0, (TextView) a[1], (TextView) a[0]);
        this.f12461z.setTag(null);
        this.f12458A.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12464D;
            this.f12464D = 0;
        }
        String str = this.f12460C;
        String str2 = this.f12459B;
        int i = ((j & 6) > 0 ? 1 : ((j & 6) == 0 ? 0 : -1));
        if ((5 & j) != 0) {
            C3158a.m7850a(this.f12461z, (CharSequence) str);
        }
        if (i != 0) {
            C3158a.m7850a(this.f12458A, (CharSequence) str2);
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12464D != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12464D = 4;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (71 == i) {
            mo12430q((String) obj);
        } else if (63 != i) {
            return false;
        } else {
            mo12431r((String) obj);
        }
        return true;
    }

    /* renamed from: q */
    public void mo12430q(String str) {
        this.f12460C = str;
        synchronized (this) {
            this.f12464D |= 1;
        }
        mo10512c(71);
        super.mo6096S1();
    }

    /* renamed from: r */
    public void mo12431r(String str) {
        this.f12459B = str;
        synchronized (this) {
            this.f12464D |= 2;
        }
        mo10512c(63);
        super.mo6096S1();
    }
}
