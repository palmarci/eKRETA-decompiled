package p289hu.ekreta.ellenorzo.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBinding.C2867f;
import p204g.p205a.p206a.p208b.C3158a;
import p211h.p258l.C3702f;
import p289hu.ekreta.ellenorzo.util.binding.BindingConverters;

/* renamed from: hu.ekreta.ellenorzo.databinding.IncludeProvenAbsenceBindingImpl */
public class IncludeProvenAbsenceBindingImpl extends IncludeProvenAbsenceBinding {

    /* renamed from: D */
    public static final C2867f f12527D = null;

    /* renamed from: E */
    public static final SparseIntArray f12528E = null;

    /* renamed from: C */
    public long f12529C = -1;

    public IncludeProvenAbsenceBindingImpl(C3702f fVar, View[] viewArr) {
        Object[] a = ViewDataBinding.m6047a(fVar, viewArr, 2, f12527D, f12528E);
        super(fVar, viewArr[0], 0, (TextView) a[1], (TextView) a[0]);
        this.f12526z.setTag(null);
        this.f12524A.setTag(null);
        mo6101a(viewArr);
        mo6095R1();
    }

    /* renamed from: M1 */
    public void mo6090M1() {
        long j;
        synchronized (this) {
            j = this.f12529C;
            this.f12529C = 0;
        }
        String str = this.f12525B;
        if ((j & 3) != 0) {
            C3158a.m7850a(this.f12526z, (CharSequence) str);
            this.f12526z.setVisibility(BindingConverters.m14793a(str));
            this.f12524A.setVisibility(BindingConverters.m14793a(str));
        }
    }

    /* renamed from: Q1 */
    public boolean mo6094Q1() {
        synchronized (this) {
            if (this.f12529C != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: R1 */
    public void mo6095R1() {
        synchronized (this) {
            this.f12529C = 2;
        }
        mo6096S1();
    }

    /* renamed from: a */
    public boolean mo6104a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo6105b(int i, Object obj) {
        if (80 != i) {
            return false;
        }
        mo12445q((String) obj);
        return true;
    }

    /* renamed from: q */
    public void mo12445q(String str) {
        this.f12525B = str;
        synchronized (this) {
            this.f12529C |= 1;
        }
        mo10512c(80);
        super.mo6096S1();
    }
}
